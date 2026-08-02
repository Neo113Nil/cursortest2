package defpackage;

import com.ybsdk.api.e;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.common.repositiories.agreements.a;
import com.ybsdk.di.modules.features.t;
import com.ybsdk.di.modules.features.u;
import com.ybsdk.di.modules.features.v;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class qbg implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ qbg(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                h9g h9gVar = (h9g) tw51Var;
                uu01 uu01Var = h9gVar.j;
                return new ag1((gff) h9gVar.v.X.get());
            case 1:
                h9g h9gVar2 = (h9g) tw51Var;
                h9gVar2.getClass();
                return (wv3) tl3.a(h9gVar2).c.get();
            case 2:
                qg6 qg6Var = ((h9g) tw51Var).f;
                q5z.h(qg6Var);
                return qg6Var;
            case 3:
                h9g h9gVar3 = (h9g) tw51Var;
                return new u((Api) h9gVar3.v.t.get(), h9gVar3.j);
            case 4:
                return ((h9g) tw51Var).v.a;
            case 5:
                ccf ccfVar = (ccf) ((h9g) tw51Var).w1.get();
                q5z.h(ccfVar);
                return ccfVar;
            case 6:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 7:
                h9g h9gVar4 = (h9g) tw51Var;
                return oti.a(h9gVar4.a, h9gVar4);
            case 8:
                return ((h9g) tw51Var).v.b();
            case 9:
                h9g h9gVar5 = (h9g) tw51Var;
                return g680.b(h9gVar5.l, h9gVar5);
            case 10:
                return ((h9g) tw51Var).o();
            case 11:
                h9g h9gVar6 = (h9g) tw51Var;
                uu01 uu01Var2 = h9gVar6.j;
                return new me1((a1b0) h9gVar6.v.n.get(), 3);
            case 12:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 13:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 14:
                return ((h9g) tw51Var).v();
            case 15:
                h9g h9gVar7 = (h9g) tw51Var;
                uu01 uu01Var3 = h9gVar7.j;
                return new ku01((e) h9gVar7.v.p1.get());
            case 16:
                return ((h9g) tw51Var).x();
            case 17:
                h9g h9gVar8 = (h9g) tw51Var;
                uu01 uu01Var4 = h9gVar8.j;
                return new c1x0(h9gVar8.v.e);
            case 18:
                return ((h9g) tw51Var).y();
            case 19:
                h9g h9gVar9 = (h9g) tw51Var;
                uu01 uu01Var5 = h9gVar9.j;
                return new t((a) h9gVar9.v.H.get());
            case 20:
                h9g h9gVar10 = (h9g) tw51Var;
                uu01 uu01Var6 = h9gVar10.j;
                return new ji01(h9gVar10.b());
            case 21:
                h9g h9gVar11 = (h9g) tw51Var;
                uu01 uu01Var7 = h9gVar11.j;
                return new lu01((a3h) h9gVar11.v.T0.get());
            case 22:
                h9g h9gVar12 = (h9g) tw51Var;
                uu01 uu01Var8 = h9gVar12.j;
                return new wpy0(13, (DeviceIdProvider) h9gVar12.v.D.get());
            case 23:
                h9g h9gVar13 = (h9g) tw51Var;
                uu01 uu01Var9 = h9gVar13.j;
                return new nu01(h9gVar13.u(), (xgk) h9gVar13.k0.get());
            case 24:
                h9g h9gVar14 = (h9g) tw51Var;
                uu01 uu01Var10 = h9gVar14.j;
                return new ou01((j3h) h9gVar14.E.get(), (np41) h9gVar14.M.get());
            case 25:
                h9g h9gVar15 = (h9g) tw51Var;
                uu01 uu01Var11 = h9gVar15.j;
                return new pu01(h9gVar15.v1, (b7g0) h9gVar15.M0.get());
            case 26:
                h9g h9gVar16 = (h9g) tw51Var;
                uu01 uu01Var12 = h9gVar16.j;
                return new qu01((b) h9gVar16.v.A.get());
            case 27:
                h9g h9gVar17 = (h9g) tw51Var;
                uu01 uu01Var13 = h9gVar17.j;
                return new c1x0((nvd) h9gVar17.v.Q1.get(), h9gVar17.p());
            case 28:
                h9g h9gVar18 = (h9g) tw51Var;
                uu01 uu01Var14 = h9gVar18.j;
                return new v((com.ybsdk.common.repositiories.user.a) h9gVar18.v.F.get());
            default:
                h9g h9gVar19 = (h9g) tw51Var;
                uu01 uu01Var15 = h9gVar19.j;
                return new b8g0((ab1) h9gVar19.v.b1.get());
        }
    }
}
