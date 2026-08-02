package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ fv(k4k k4kVar, lvf lvfVar, tmb tmbVar, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, int i) {
        this.a = 1;
        this.c = k4kVar;
        this.d = lvfVar;
        this.e = tmbVar;
        this.f = dibVar;
        this.b = function0;
        this.g = function02;
        this.h = function03;
        this.i = function1;
        this.j = function12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r9.K(), java.lang.Integer.valueOf(r13)) == false) goto L38;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        hab habVar;
        switch (this.a) {
            case 0:
                j00 j00Var = (j00) this.c;
                jab jabVar = (jab) this.d;
                thj thjVar = (thj) this.e;
                tvd tvdVar = (tvd) this.f;
                iab iabVar = (iab) this.g;
                gvd gvdVar = (gvd) this.h;
                hab habVar2 = (hab) this.i;
                Function0 function0 = (Function0) this.b;
                sdr sdrVar = (sdr) this.j;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean h = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(thjVar);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        K = new bv(j00Var, jabVar, thjVar, 3);
                        oq5Var.k0(K);
                    }
                    vci vciVar = vci.a;
                    yci b = a.b(vciVar, null, 0L, 0.0f, null, (Function2) K, 15);
                    iz2 iz2Var = b2c.b;
                    kfh d = ug3.d(iz2Var, false);
                    int i = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, d, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (!oq5Var.O) {
                        habVar = habVar2;
                        break;
                    } else {
                        habVar = habVar2;
                    }
                    ouj.x(i, oq5Var, i, kb5Var3);
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    long f = ((ma5) oq5Var.j(pa5.a)).f();
                    boolean e = oq5Var.e(f) | oq5Var.f(tvdVar);
                    Object K2 = oq5Var.K();
                    if (e || K2 == kjnVar) {
                        K2 = new lv(f, tvdVar, 0);
                        oq5Var.k0(K2);
                    }
                    yci c = androidx.compose.ui.draw.a.c(vciVar, (Function1) K2);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, c);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d2, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    j0q j0qVar = j00Var.q;
                    yci d3 = d.d(vciVar, 1.0f);
                    pbu pbuVar = (pbu) sdrVar.getValue();
                    qo6 qo6Var = qo6.b;
                    boolean h2 = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(thjVar);
                    Object K3 = oq5Var.K();
                    if (h2 || K3 == kjnVar) {
                        K3 = new rr(j00Var, jabVar, thjVar, 4);
                        oq5Var.k0(K3);
                    }
                    Function0 function02 = (Function0) K3;
                    boolean h3 = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(thjVar);
                    Object K4 = oq5Var.K();
                    if (h3 || K4 == kjnVar) {
                        K4 = new rr(j00Var, jabVar, thjVar, 5);
                        oq5Var.k0(K4);
                    }
                    Function0 function03 = (Function0) K4;
                    boolean h4 = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(thjVar);
                    Object K5 = oq5Var.K();
                    if (h4 || K5 == kjnVar) {
                        K5 = new rr(j00Var, jabVar, thjVar, 6);
                        oq5Var.k0(K5);
                    }
                    Function0 function04 = (Function0) K5;
                    boolean h5 = oq5Var.h(j00Var) | oq5Var.h(jabVar) | oq5Var.h(thjVar);
                    Object K6 = oq5Var.K();
                    if (h5 || K6 == kjnVar) {
                        K6 = new rr(j00Var, jabVar, thjVar, 7);
                        oq5Var.k0(K6);
                    }
                    pd.m(iabVar, gvdVar, habVar, tvdVar, j0qVar, function02, function03, function04, (Function0) K6, pbuVar, qo6Var, d3, function0, null, oq5Var, 0, 122880);
                    iz2 iz2Var2 = b2c.i;
                    b bVar = b.a;
                    zsd.r(function0, tvdVar, androidx.compose.foundation.layout.a.j(bVar.a(vciVar, iz2Var2), 0, 160), oq5Var, 0);
                    hld.a(j00Var, iabVar, jabVar, thjVar, tvdVar, androidx.compose.foundation.layout.a.q(bVar.a(vciVar, iz2Var2), 0.0f, 0.0f, 0.0f, 20, 7), oq5Var, 0);
                    oq5Var.p(true);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                uwf.c((k4k) this.c, (lvf) this.d, (tmb) this.e, (dib) this.f, (Function0) this.b, (Function0) this.g, (Function0) this.h, (Function1) this.i, (Function1) this.j, (hq5) obj, rvf.R(577));
                return Unit.a;
            case 2:
                njt njtVar = (njt) this.c;
                tmb tmbVar = (tmb) this.d;
                sjt sjtVar = (sjt) this.e;
                mxo mxoVar = (mxo) this.f;
                cjt cjtVar = (cjt) this.g;
                fvf fvfVar = (fvf) this.h;
                ynn ynnVar = (ynn) this.i;
                String str = (String) this.b;
                tsf tsfVar = (tsf) this.j;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ixf.l(njtVar, tmbVar, sjtVar, mxoVar, ((Boolean) gld.M(njtVar.f, oq5Var2).getValue()).booleanValue(), ild.C(-652954836, new ojt(cjtVar, njtVar, fvfVar, ynnVar, str, tsfVar, 0), oq5Var2), oq5Var2, 196672);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            default:
                Function0 function05 = (Function0) this.b;
                Function1 function1 = (Function1) this.c;
                Function1 function12 = (Function1) this.d;
                Function1 function13 = (Function1) this.e;
                Function1 function14 = (Function1) this.f;
                Function1 function15 = (Function1) this.g;
                Function1 function16 = (Function1) this.h;
                Function1 function17 = (Function1) this.i;
                Function1 function18 = (Function1) this.j;
                w4f w4fVar = (w4f) obj2;
                ((String) obj).getClass();
                w4fVar.getClass();
                return com.yandex.plus.bdui.plus.analytics.b.s(w4fVar, function05, function1, function12, function13, function14, function15, function16, function17, function18);
        }
    }

    public /* synthetic */ fv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.b = obj8;
        this.j = obj9;
    }

    public /* synthetic */ fv(Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18) {
        this.a = 3;
        this.b = function0;
        this.c = function1;
        this.d = function12;
        this.e = function13;
        this.f = function14;
        this.g = function15;
        this.h = function16;
        this.i = function17;
        this.j = function18;
    }
}
