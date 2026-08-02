package defpackage;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.common.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class u1g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ u1g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 1:
                return ((h9g) tw51Var).v.a;
            case 2:
                return new g5((j3h) ((h9g) tw51Var).E.get());
            case 3:
                return new uu4((a1b0) ((h9g) tw51Var).v.n.get());
            case 4:
                return new if8((b) ((h9g) tw51Var).v.A.get());
            case 5:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new w9z((b) x8gVar.A.get(), x8gVar.a, (AppAnalyticsReporter) x8gVar.q.get());
            case 6:
                return ((h9g) tw51Var).o();
            case 7:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 8:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 9:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 10:
                nbp0 nbp0Var = (nbp0) ((h9g) tw51Var).v.u.get();
                q5z.h(nbp0Var);
                return nbp0Var;
            case 11:
                return new djg(((h9g) tw51Var).v.e);
            case 12:
                return new tv3((b) ((h9g) tw51Var).v.A.get());
            case 13:
                h9g h9gVar = (h9g) tw51Var;
                return new c9v(11, (j3h) h9gVar.E.get(), (np41) h9gVar.M.get());
            case 14:
                x8g x8gVar2 = ((h9g) tw51Var).v;
                return new hly((gff) x8gVar2.X.get(), (b) x8gVar2.A.get(), (AppAnalyticsReporter) x8gVar2.q.get());
            case 15:
                AppAnalyticsReporter r2 = ((h9g) tw51Var).r();
                q5z.h(r2);
                return r2;
            case 16:
                t0k0 s3 = ((h9g) tw51Var).s();
                q5z.h(s3);
                return s3;
            case 17:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 18:
                r90 r90Var = (r90) ((h9g) tw51Var).x0.get();
                q5z.h(r90Var);
                return r90Var;
            case 19:
                tu4 tu4Var = (tu4) ((h9g) tw51Var).l0.get();
                q5z.h(tu4Var);
                return tu4Var;
            case 20:
                a e = ((h9g) tw51Var).e();
                q5z.h(e);
                return e;
            case 21:
                return ((h9g) tw51Var).v.a;
            case 22:
                x8g x8gVar3 = ((h9g) tw51Var).v;
                return new com.ybsdk.common.b((DeviceIdProvider) x8gVar3.D.get(), new yvi0(x8gVar3.a));
            case 23:
                zon zonVar = (zon) ((h9g) tw51Var).m0.get();
                q5z.h(zonVar);
                return zonVar;
            case 24:
                fdr fdrVar = (fdr) ((h9g) tw51Var).D0.get();
                q5z.h(fdrVar);
                return fdrVar;
            case 25:
                tvv tvvVar = (tvv) ((h9g) tw51Var).v.U.get();
                q5z.h(tvvVar);
                return tvvVar;
            case 26:
                return new yig(((h9g) tw51Var).v.a());
            case 27:
                h9g h9gVar2 = (h9g) tw51Var;
                return new q400((j3h) h9gVar2.E.get(), (np41) h9gVar2.M.get());
            case 28:
                h9g h9gVar3 = (h9g) tw51Var;
                return new c9v(20, h9gVar3.E, (np41) h9gVar3.M.get());
            default:
                return new hdu((a1b0) ((h9g) tw51Var).v.n.get());
        }
    }
}
