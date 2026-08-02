package M6;

import D.x;
import a7.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import l.C4659e;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f1887l = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final j f1888a;

    /* renamed from: b, reason: collision with root package name */
    public String f1889b;

    /* renamed from: c, reason: collision with root package name */
    public long f1890c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1891d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1892e;

    /* renamed from: f, reason: collision with root package name */
    public final H5.a f1893f;

    /* renamed from: g, reason: collision with root package name */
    public final c4.e f1894g;

    /* renamed from: h, reason: collision with root package name */
    public final Z6.a f1895h;
    public final H5.a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1896j;

    /* renamed from: k, reason: collision with root package name */
    public final C4659e f1897k;

    public g() {
        j jVar = j.f4340v;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f1890c = timeUnit.toNanos(10L);
        this.f1891d = timeUnit.toNanos(10L);
        this.f1892e = new HashMap();
        this.f1893f = new H5.a(1);
        this.f1894g = new c4.e();
        this.f1895h = Z6.a.f4156c;
        this.i = new H5.a(2);
        this.f1896j = 1;
        this.f1897k = new C4659e(4, g.class.getClassLoader());
        this.f1888a = jVar;
        this.f1889b = "http://localhost:4318/v1/logs";
    }

    public final String a(boolean z6) {
        StringJoiner stringJoiner = z6 ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.f1889b);
        stringJoiner.add("timeoutNanos=" + this.f1890c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new K6.b(1)).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.f1891d);
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        final int i = 0;
        this.f1892e.forEach(new BiConsumer() { // from class: M6.c
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
        this.f1893f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i4 = 1;
            map.forEach(new BiConsumer() { // from class: M6.c
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
        Z6.a aVar = this.f1895h;
        if (aVar != null) {
            stringJoiner.add("retryPolicy=" + aVar);
        }
        stringJoiner.add("componentLoader=" + this.f1897k);
        stringJoiner.add("exporterType=" + this.f1888a);
        stringJoiner.add("internalTelemetrySchemaVersion=".concat(x.A(this.f1896j)));
        return stringJoiner.toString();
    }

    public final String toString() {
        return a(true);
    }
}
