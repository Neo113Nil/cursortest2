package M6;

import D.y;
import a7.j;
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
    public static final Logger f1885l = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final j f1886a;

    /* renamed from: b, reason: collision with root package name */
    public String f1887b;

    /* renamed from: c, reason: collision with root package name */
    public long f1888c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1889d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1890e;

    /* renamed from: f, reason: collision with root package name */
    public final H5.a f1891f;

    /* renamed from: g, reason: collision with root package name */
    public final a4.e f1892g;

    /* renamed from: h, reason: collision with root package name */
    public final Z6.a f1893h;
    public final H5.a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1894j;

    /* renamed from: k, reason: collision with root package name */
    public final F1.a f1895k;

    public g() {
        j jVar = j.f4372v;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f1888c = timeUnit.toNanos(10L);
        this.f1889d = timeUnit.toNanos(10L);
        this.f1890e = new HashMap();
        this.f1891f = new H5.a(1);
        this.f1892g = new a4.e();
        this.f1893h = Z6.a.f4178c;
        this.i = new H5.a(2);
        this.f1894j = 1;
        this.f1895k = new F1.a(26, g.class.getClassLoader());
        this.f1886a = jVar;
        this.f1887b = "http://localhost:4318/v1/logs";
    }

    public final String a(boolean z3) {
        StringJoiner stringJoiner = z3 ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.f1887b);
        stringJoiner.add("timeoutNanos=" + this.f1888c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new K6.b(1)).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.f1889d);
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        final int i = 0;
        this.f1890e.forEach(new BiConsumer() { // from class: M6.c
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
        this.f1891f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i6 = 1;
            map.forEach(new BiConsumer() { // from class: M6.c
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    switch (i6) {
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
        Z6.a aVar = this.f1893h;
        if (aVar != null) {
            stringJoiner.add("retryPolicy=" + aVar);
        }
        stringJoiner.add("componentLoader=" + this.f1895k);
        stringJoiner.add("exporterType=" + this.f1886a);
        stringJoiner.add("internalTelemetrySchemaVersion=".concat(y.A(this.f1894j)));
        return stringJoiner.toString();
    }

    public final String toString() {
        return a(true);
    }
}
