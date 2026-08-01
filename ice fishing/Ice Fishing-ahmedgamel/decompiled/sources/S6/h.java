package S6;

import B1.x;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import i8.l;
import i8.o;
import i8.v;
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

/* loaded from: classes2.dex */
public final class h implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2905f = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Z6.a f2906a;

    /* renamed from: b, reason: collision with root package name */
    public final K6.b f2907b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f2908c;

    /* renamed from: d, reason: collision with root package name */
    public final x f2909d;

    /* renamed from: e, reason: collision with root package name */
    public final H5.a f2910e;

    public h(Z6.a aVar, K6.b bVar) {
        aVar.getClass();
        g gVar = new g(0);
        Objects.requireNonNull(TimeUnit.NANOSECONDS);
        x xVar = new x(18);
        H5.a aVar2 = new H5.a(10);
        this.f2906a = aVar;
        this.f2907b = bVar;
        this.f2908c = gVar;
        this.f2909d = xVar;
        this.f2910e = aVar2;
    }

    public static String b(v vVar) {
        StringJoiner stringJoiner = new StringJoiner(",", "Response{", "}");
        stringJoiner.add("code=" + vVar.f38255w);
        StringBuilder sb = new StringBuilder("headers=");
        l lVar = vVar.f38257y;
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.h.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            String c9 = lVar.c(i);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c9.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(lVar.e(i));
        }
        sb.append((String) treeMap.entrySet().stream().map(new K6.b(15)).collect(Collectors.joining(",", "[", "]")));
        stringJoiner.add(sb.toString());
        return stringJoiner.toString();
    }

    @Override // i8.o
    public final v a(n8.h hVar) {
        long nanos;
        long nanos2;
        Logger logger = f2905f;
        Z6.a aVar = this.f2906a;
        nanos = aVar.f4179a.toNanos();
        long j6 = nanos;
        IOException iOException = null;
        int i = 0;
        v vVar = null;
        do {
            if (i > 0) {
                nanos2 = aVar.f4180b.toNanos();
                double min = Math.min(j6, nanos2);
                long doubleValue = (long) (((Double) this.f2910e.get()).doubleValue() * min);
                j6 = (long) (min * 1.5d);
                try {
                    this.f2909d.getClass();
                    TimeUnit.NANOSECONDS.sleep(doubleValue);
                    if (vVar != null) {
                        vVar.close();
                    }
                    iOException = null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                vVar = hVar.b(hVar.f39521e);
                boolean equals = Boolean.TRUE.equals(this.f2907b.apply(vVar));
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt ");
                    sb.append(i);
                    sb.append(" returned ");
                    sb.append(equals ? "retryable" : "non-retryable");
                    sb.append(" response: ");
                    sb.append(b(vVar));
                    logger.log(level, sb.toString());
                }
                if (!equals) {
                    return vVar;
                }
            } catch (IOException e9) {
                boolean test = this.f2908c.test(e9);
                Level level2 = Level.FINER;
                if (logger.isLoggable(level2)) {
                    logger.log(level2, u1.h.g(AbstractC4404f.i(i, "Attempt ", " failed with "), test ? "retryable" : "non-retryable", " exception"), (Throwable) e9);
                }
                if (!test) {
                    throw e9;
                }
                iOException = e9;
                vVar = null;
            }
            i++;
        } while (i < 5);
        if (vVar != null) {
            return vVar;
        }
        throw iOException;
    }
}
