package K6;

import W6.j;
import b6.C0530a;
import i6.l;
import i6.q;
import i6.s;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class d implements b {
    public static final g6.e i = g6.e.a(b6.b.f5560n, "type");

    /* renamed from: j, reason: collision with root package name */
    public static final g6.e f1646j = g6.e.a(b6.b.f5561u, "success");

    /* renamed from: a, reason: collision with root package name */
    public final D5.a f1647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1649c;

    /* renamed from: d, reason: collision with root package name */
    public final C0530a f1650d;

    /* renamed from: e, reason: collision with root package name */
    public final C0530a f1651e;

    /* renamed from: f, reason: collision with root package name */
    public final C0530a f1652f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l f1653g;

    /* renamed from: h, reason: collision with root package name */
    public volatile l f1654h;

    public d(D5.a aVar, j jVar) {
        String str;
        String str2;
        String str3;
        this.f1647a = aVar;
        switch (jVar) {
            case EF0:
            case EF1:
            case EF2:
            case EF3:
            case f3483v:
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
        this.f1648b = str;
        switch (jVar) {
            case EF0:
            case EF3:
            case EF72:
                str2 = "grpc";
                break;
            case EF1:
            case f3483v:
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
        this.f1649c = str2;
        I1.f fVar = new I1.f(2);
        int i4 = jVar.f3486u;
        int d2 = AbstractC5088e.d(i4);
        if (d2 == 0) {
            str3 = "span";
        } else if (d2 == 1) {
            str3 = "metric";
        } else {
            if (d2 != 2) {
                if (d2 == 3) {
                    throw new IllegalArgumentException("Profiles are not supported");
                }
                throw new IllegalArgumentException("Unhandled signal type: ".concat(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
            }
            str3 = "log";
        }
        fVar.d(i, str3);
        C0530a b9 = fVar.b();
        this.f1650d = b9;
        I1.f d3 = b9.d();
        Boolean bool = Boolean.TRUE;
        g6.e eVar = f1646j;
        d3.d(eVar, bool);
        this.f1651e = d3.b();
        I1.f d9 = b9.d();
        d9.d(eVar, Boolean.FALSE);
        this.f1652f = d9.b();
    }

    @Override // K6.b
    public final a a(int i4) {
        return new c(this, i4);
    }

    public final l b() {
        l lVar = this.f1654h;
        if (lVar != null && !h.e(lVar)) {
            return lVar;
        }
        l build = c().d(this.f1648b + ".exporter.exported").build();
        this.f1654h = build;
        return build;
    }

    public final q c() {
        s sVar = (s) this.f1647a.get();
        if (sVar == null) {
            sVar = i6.h.f38327n;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f1648b + "-" + this.f1649c).mo50build();
    }
}
