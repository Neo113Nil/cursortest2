package O6;

import a7.j;
import f6.C4522a;
import m6.l;
import m6.q;
import m6.s;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class d implements b {
    public static final k6.e i = k6.e.a(f6.b.f37478n, "type");

    /* renamed from: j, reason: collision with root package name */
    public static final k6.e f2299j = k6.e.a(f6.b.f37479u, "success");

    /* renamed from: a, reason: collision with root package name */
    public final H5.a f2300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2301b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2302c;

    /* renamed from: d, reason: collision with root package name */
    public final C4522a f2303d;

    /* renamed from: e, reason: collision with root package name */
    public final C4522a f2304e;

    /* renamed from: f, reason: collision with root package name */
    public final C4522a f2305f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l f2306g;

    /* renamed from: h, reason: collision with root package name */
    public volatile l f2307h;

    public d(H5.a aVar, j jVar) {
        String str;
        String str2;
        String str3;
        this.f2300a = aVar;
        switch (jVar) {
            case EF0:
            case EF1:
            case EF2:
            case EF3:
            case f4340v:
            case EF61:
            case EF72:
            case EF83:
            case EF95:
                str = "otlp";
                break;
            case EF107:
            case EF117:
                str = "zipkin";
                break;
            case EF128:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + jVar);
        }
        this.f2301b = str;
        switch (jVar) {
            case EF0:
            case EF3:
            case EF72:
                str2 = "grpc";
                break;
            case EF1:
            case f4340v:
            case EF83:
            case EF107:
                str2 = "http";
                break;
            case EF2:
            case EF61:
            case EF95:
            case EF117:
                str2 = "http-json";
                break;
            case EF128:
                throw new IllegalArgumentException("Profiles are not supported");
            default:
                throw new IllegalArgumentException("Not a supported exporter type: " + jVar);
        }
        this.f2302c = str2;
        K1.c cVar = new K1.c(1);
        int i4 = jVar.f4343u;
        int d9 = AbstractC5050e.d(i4);
        if (d9 == 0) {
            str3 = "span";
        } else if (d9 == 1) {
            str3 = "metric";
        } else {
            if (d9 != 2) {
                if (d9 == 3) {
                    throw new IllegalArgumentException("Profiles are not supported");
                }
                throw new IllegalArgumentException("Unhandled signal type: ".concat(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
            }
            str3 = "log";
        }
        cVar.c(i, str3);
        C4522a a9 = cVar.a();
        this.f2303d = a9;
        K1.c d10 = a9.d();
        Boolean bool = Boolean.TRUE;
        k6.e eVar = f2299j;
        d10.c(eVar, bool);
        this.f2304e = d10.a();
        K1.c d11 = a9.d();
        d11.c(eVar, Boolean.FALSE);
        this.f2305f = d11.a();
    }

    @Override // O6.b
    public final a a(int i4) {
        return new c(this, i4);
    }

    public final l b() {
        l lVar = this.f2307h;
        if (lVar != null && !h.e(lVar)) {
            return lVar;
        }
        l mo53build = c().d(this.f2301b + ".exporter.exported").mo53build();
        this.f2307h = mo53build;
        return mo53build;
    }

    public final q c() {
        s sVar = (s) this.f2300a.get();
        if (sVar == null) {
            sVar = m6.h.f39473n;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f2301b + "-" + this.f2302c).mo56build();
    }
}
