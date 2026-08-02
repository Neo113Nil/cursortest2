package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class hr6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ syc h;

    public /* synthetic */ hr6(vm7 vm7Var, boolean z, Function0 function0, Function0 function02, boolean z2, yci yciVar, Function0 function03, int i) {
        this.a = 2;
        this.e = vm7Var;
        this.b = z;
        this.c = function0;
        this.f = function02;
        this.d = z2;
        this.g = yciVar;
        this.h = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) this.e;
                String str2 = (String) this.f;
                c3r c3rVar = (c3r) this.g;
                Function1 function1 = (Function1) this.h;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                a l = oq5Var2.l();
                vci vciVar = vci.a;
                yci H = vnj.H(hq5Var, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new yoc();
                    oq5Var2.k0(K);
                }
                xcs.b(str, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, 16, 7), "playlist_dialog_title"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var, 48, 0, 65532);
                ges j = nu0.j();
                String K2 = mlr.K(1000, str2);
                yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.ui.focus.a.a(d.d(vciVar, 1.0f), (yoc) K), "playlist_name_input");
                rbf rbfVar = new rbf(118);
                boolean z = this.b;
                boolean g = oq5Var2.g(z) | oq5Var2.f(c3rVar);
                Function0 function0 = this.c;
                boolean f = g | oq5Var2.f(function0);
                Object K3 = oq5Var2.K();
                if (f || K3 == kjnVar) {
                    K3 = new y20(z, c3rVar, function0, 2);
                    oq5Var2.k0(K3);
                }
                pbf pbfVar = new pbf(62, (Function1) K3);
                boolean f2 = oq5Var2.f(function1);
                Object K4 = oq5Var2.K();
                if (f2 || K4 == kjnVar) {
                    K4 = new k32(1, function1);
                    oq5Var2.k0(K4);
                }
                lyj.a(K2, (Function1) K4, a2, this.d, j, x97.d, null, rbfVar, pbfVar, true, 0, 0, null, null, hq5Var, 12582912);
                oq5Var2.p(true);
                break;
            case 1:
                ((Integer) obj2).getClass();
                swf.k((zy2) this.e, this.b, this.c, this.d, (Function0) this.f, (yci) this.g, (Function0) this.h, (hq5) obj, rvf.R(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                uwf.b((vm7) this.e, this.b, this.c, (Function0) this.f, this.d, (yci) this.g, (Function0) this.h, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ixf.f((bz2) this.e, this.b, this.c, this.d, (Function0) this.f, (yci) this.g, (Function0) this.h, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hr6(Object obj, boolean z, Function0 function0, boolean z2, Function0 function02, yci yciVar, Function0 function03, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.c = function0;
        this.d = z2;
        this.f = function02;
        this.g = yciVar;
        this.h = function03;
    }

    public /* synthetic */ hr6(String str, String str2, boolean z, c3r c3rVar, Function0 function0, Function1 function1, boolean z2) {
        this.a = 0;
        this.e = str;
        this.f = str2;
        this.b = z;
        this.g = c3rVar;
        this.c = function0;
        this.h = function1;
        this.d = z2;
    }
}
