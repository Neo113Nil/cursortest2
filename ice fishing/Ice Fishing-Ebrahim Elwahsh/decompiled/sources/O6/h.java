package O6;

import B1.w;
import com.google.android.gms.internal.ads.CL;
import e8.m;
import e8.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class h implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2541f = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final V6.a f2542a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.b f2543b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f2544c;

    /* renamed from: d, reason: collision with root package name */
    public final w f2545d;

    /* renamed from: e, reason: collision with root package name */
    public final D5.a f2546e;

    public h(V6.a aVar, G6.b bVar) {
        aVar.getClass();
        g gVar = new g(0);
        Objects.requireNonNull(TimeUnit.NANOSECONDS);
        w wVar = new w(18);
        D5.a aVar2 = new D5.a(10);
        this.f2542a = aVar;
        this.f2543b = bVar;
        this.f2544c = gVar;
        this.f2545d = wVar;
        this.f2546e = aVar2;
    }

    public static String b(e8.w wVar) {
        StringJoiner stringJoiner = new StringJoiner(",", "Response{", "}");
        stringJoiner.add("code=" + wVar.f37533w);
        StringBuilder sb = new StringBuilder("headers=");
        m mVar = wVar.f37535y;
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.h.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            String c4 = mVar.c(i);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c4.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(mVar.e(i));
        }
        sb.append((String) treeMap.entrySet().stream().map(new G6.b(15)).collect(Collectors.joining(",", "[", "]")));
        stringJoiner.add(sb.toString());
        return stringJoiner.toString();
    }

    @Override // e8.p
    public final e8.w a(j8.h hVar) {
        long nanos;
        long nanos2;
        Logger logger = f2541f;
        V6.a aVar = this.f2542a;
        nanos = aVar.f3323a.toNanos();
        long j9 = nanos;
        IOException iOException = null;
        int i = 0;
        e8.w wVar = null;
        do {
            if (i > 0) {
                nanos2 = aVar.f3324b.toNanos();
                double min = Math.min(j9, nanos2);
                long doubleValue = (long) (((Double) this.f2546e.get()).doubleValue() * min);
                j9 = (long) (min * 1.5d);
                try {
                    this.f2545d.getClass();
                    TimeUnit.NANOSECONDS.sleep(doubleValue);
                    if (wVar != null) {
                        wVar.close();
                    }
                    iOException = null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                wVar = hVar.b(hVar.f38598e);
                boolean equals = Boolean.TRUE.equals(this.f2543b.apply(wVar));
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt ");
                    sb.append(i);
                    sb.append(" returned ");
                    sb.append(equals ? "retryable" : "non-retryable");
                    sb.append(" response: ");
                    sb.append(b(wVar));
                    logger.log(level, sb.toString());
                }
                if (!equals) {
                    return wVar;
                }
            } catch (IOException e6) {
                boolean test = this.f2544c.test(e6);
                Level level2 = Level.FINER;
                if (logger.isLoggable(level2)) {
                    logger.log(level2, AbstractC5051n.g(CL.l(i, "Attempt ", " failed with "), test ? "retryable" : "non-retryable", " exception"), (Throwable) e6);
                }
                if (!test) {
                    throw e6;
                }
                iOException = e6;
                wVar = null;
            }
            i++;
        } while (i < 5);
        if (wVar != null) {
            return wVar;
        }
        throw iOException;
    }
}
