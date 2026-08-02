package defpackage;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.common.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class u2g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ u2g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                return new r400(0, (msp0) ((h9g) tw51Var).z0.get());
            case 1:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new h2r(13, (wt51) x8gVar.W.get(), (b) x8gVar.A.get());
            case 2:
                return new t400((b) ((h9g) tw51Var).v.A.get());
            case 3:
                return ((h9g) tw51Var).v.b();
            case 4:
                n860 n860Var = (n860) ((h9g) tw51Var).B0.get();
                q5z.h(n860Var);
                return n860Var;
            case 5:
                qa60 qa60Var = (qa60) ((h9g) tw51Var).c0.get();
                q5z.h(qa60Var);
                return qa60Var;
            case 6:
                awa0 awa0Var = (awa0) ((h9g) tw51Var).v.w0.get();
                q5z.h(awa0Var);
                return awa0Var;
            case 7:
                g3d0 n = ((h9g) tw51Var).n();
                q5z.h(n);
                return n;
            case 8:
                ut51 ut51Var = (ut51) ((h9g) tw51Var).v.W0.get();
                q5z.h(ut51Var);
                return ut51Var;
            case 9:
                return jde0.d((h9g) tw51Var);
            case 10:
                return new s400(((h9g) tw51Var).p());
            case 11:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 12:
                return new g5j0((b) ((h9g) tw51Var).v.A.get());
            case 13:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 14:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 15:
                return ((h9g) tw51Var).u();
            case 16:
                guq0 guq0Var = (guq0) ((h9g) tw51Var).C0.get();
                q5z.h(guq0Var);
                return guq0Var;
            case 17:
                y1r0 w = ((h9g) tw51Var).w();
                q5z.h(w);
                return w;
            case 18:
                return ((h9g) tw51Var).x();
            case 19:
                return ((h9g) tw51Var).y();
            case 20:
                return new i4u((r621) ((h9g) tw51Var).A0.get());
            case 21:
                tu4 tu4Var = (tu4) ((h9g) tw51Var).l0.get();
                q5z.h(tu4Var);
                return tu4Var;
            case 22:
                a e = ((h9g) tw51Var).e();
                q5z.h(e);
                return e;
            case 23:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 24:
                x8g x8gVar2 = ((h9g) tw51Var).v;
                return new com.ybsdk.common.b((DeviceIdProvider) x8gVar2.D.get(), new yvi0(x8gVar2.a));
            case 25:
                tvv tvvVar = (tvv) ((h9g) tw51Var).v.U.get();
                q5z.h(tvvVar);
                return tvvVar;
            case 26:
                return ((h9g) tw51Var).u();
            case 27:
                return new xo10((b) ((h9g) tw51Var).v.A.get());
            case 28:
                return new tv3((b) ((h9g) tw51Var).v.A.get());
            default:
                return new ejg(((h9g) tw51Var).c, 1);
        }
    }
}
