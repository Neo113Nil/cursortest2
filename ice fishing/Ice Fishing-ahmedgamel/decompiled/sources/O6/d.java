package O6;

import a7.j;
import d1.C4445c;
import f6.C4512a;
import m6.l;
import m6.q;
import m6.s;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class d implements b {
    public static final k6.e i = k6.e.a(f6.b.f37516n, "type");

    /* renamed from: j, reason: collision with root package name */
    public static final k6.e f2368j = k6.e.a(f6.b.f37517u, "success");

    /* renamed from: a, reason: collision with root package name */
    public final H5.a f2369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2371c;

    /* renamed from: d, reason: collision with root package name */
    public final C4512a f2372d;

    /* renamed from: e, reason: collision with root package name */
    public final C4512a f2373e;

    /* renamed from: f, reason: collision with root package name */
    public final C4512a f2374f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l f2375g;

    /* renamed from: h, reason: collision with root package name */
    public volatile l f2376h;

    public d(H5.a aVar, j jVar) {
        String str;
        String str2;
        String str3;
        this.f2369a = aVar;
        switch (jVar) {
            case EF0:
            case EF1:
            case EF2:
            case EF3:
            case f4372v:
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
        this.f2370b = str;
        switch (jVar) {
            case EF0:
            case EF3:
            case EF72:
                str2 = "grpc";
                break;
            case EF1:
            case f4372v:
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
        this.f2371c = str2;
        C4445c c4445c = new C4445c();
        int i6 = jVar.f4375u;
        int d2 = AbstractC5049e.d(i6);
        if (d2 == 0) {
            str3 = "span";
        } else if (d2 == 1) {
            str3 = "metric";
        } else {
            if (d2 != 2) {
                if (d2 == 3) {
                    throw new IllegalArgumentException("Profiles are not supported");
                }
                throw new IllegalArgumentException("Unhandled signal type: ".concat(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
            }
            str3 = "log";
        }
        c4445c.f(i, str3);
        C4512a d9 = c4445c.d();
        this.f2372d = d9;
        C4445c d10 = d9.d();
        Boolean bool = Boolean.TRUE;
        k6.e eVar = f2368j;
        d10.f(eVar, bool);
        this.f2373e = d10.d();
        C4445c d11 = d9.d();
        d11.f(eVar, Boolean.FALSE);
        this.f2374f = d11.d();
    }

    @Override // O6.b
    public final a a(int i6) {
        return new c(this, i6);
    }

    public final l b() {
        l lVar = this.f2376h;
        if (lVar != null && !h.e(lVar)) {
            return lVar;
        }
        l build = c().d(this.f2370b + ".exporter.exported").build();
        this.f2376h = build;
        return build;
    }

    public final q c() {
        s sVar = (s) this.f2369a.get();
        if (sVar == null) {
            sVar = m6.h.f39314n;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f2370b + "-" + this.f2371c).mo5build();
    }
}
