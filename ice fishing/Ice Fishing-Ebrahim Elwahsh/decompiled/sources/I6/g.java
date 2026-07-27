package I6;

import D.y;
import L2.i;
import W6.j;
import g1.C4523c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f1275l = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final j f1276a;

    /* renamed from: b, reason: collision with root package name */
    public String f1277b;

    /* renamed from: c, reason: collision with root package name */
    public long f1278c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1279d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1280e;

    /* renamed from: f, reason: collision with root package name */
    public final D5.a f1281f;

    /* renamed from: g, reason: collision with root package name */
    public final i f1282g;

    /* renamed from: h, reason: collision with root package name */
    public final V6.a f1283h;
    public final D5.a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1284j;

    /* renamed from: k, reason: collision with root package name */
    public final C4523c f1285k;

    public g() {
        j jVar = j.f3483v;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f1278c = timeUnit.toNanos(10L);
        this.f1279d = timeUnit.toNanos(10L);
        this.f1280e = new HashMap();
        this.f1281f = new D5.a(1);
        this.f1282g = new i(4);
        this.f1283h = V6.a.f3322c;
        this.i = new D5.a(2);
        this.f1284j = 1;
        this.f1285k = new C4523c(24, g.class.getClassLoader());
        this.f1276a = jVar;
        this.f1277b = "http://localhost:4318/v1/logs";
    }

    public final String a(boolean z8) {
        StringJoiner stringJoiner = z8 ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.f1277b);
        stringJoiner.add("timeoutNanos=" + this.f1278c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new G6.b(1)).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.f1279d);
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        final int i = 0;
        this.f1280e.forEach(new BiConsumer() { // from class: I6.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                switch (i) {
                    case 0:
                        stringJoiner2.add(str + "=OBFUSCATED");
                        break;
                    default:
                        stringJoiner2.add(str + "=OBFUSCATED");
                        break;
                }
            }
        });
        this.f1281f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i4 = 1;
            map.forEach(new BiConsumer() { // from class: I6.c
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    switch (i4) {
                        case 0:
                            stringJoiner2.add(str + "=OBFUSCATED");
                            break;
                        default:
                            stringJoiner2.add(str + "=OBFUSCATED");
                            break;
                    }
                }
            });
        }
        stringJoiner.add("headers=" + stringJoiner2);
        V6.a aVar = this.f1283h;
        if (aVar != null) {
            stringJoiner.add("retryPolicy=" + aVar);
        }
        stringJoiner.add("componentLoader=" + this.f1285k);
        stringJoiner.add("exporterType=" + this.f1276a);
        stringJoiner.add("internalTelemetrySchemaVersion=".concat(y.u(this.f1284j)));
        return stringJoiner.toString();
    }

    public final String toString() {
        return a(true);
    }
}
