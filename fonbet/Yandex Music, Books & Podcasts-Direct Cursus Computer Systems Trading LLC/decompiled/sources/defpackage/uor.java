package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class uor implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oor b;

    public /* synthetic */ uor(oor oorVar, int i) {
        this.a = i;
        this.b = oorVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        oor oorVar = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 1;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], true, ild.C(-2137849296, new uor(oorVar, i2), oq5Var), oq5Var, 432, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f = oq5Var2.f(oorVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        K = new kzp(24, oorVar);
                        oq5Var2.k0(K);
                    }
                    vci vciVar = vci.a;
                    yci b = nfp.b(vciVar, false, (Function1) K);
                    ta5 a = sa5.a(qx0.e, b2c.o, oq5Var2, 54);
                    int i3 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, b);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var2, i3, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    float f2 = ((Configuration) oq5Var2.j(AndroidCompositionLocals_androidKt.a)).fontScale;
                    boolean c = oq5Var2.c(f2);
                    Object K2 = oq5Var2.K();
                    if (c || K2 == kjnVar) {
                        K2 = new cma(f2 * vor.b);
                        oq5Var2.k0(K2);
                    }
                    float f3 = ((cma) K2).a;
                    tor torVar = oorVar.a;
                    String str = torVar.a;
                    ges j = nu0.j();
                    agr agrVar = eq0.a;
                    long j2 = ((dq0) oq5Var2.j(agrVar)).b.a;
                    yci o = androidx.compose.foundation.layout.a.o(vciVar, f3, 0.0f, 2);
                    float f4 = vor.a;
                    o.getClass();
                    xcs.b(str, vnj.r(o, "com.yandex.music.plus.features.subscription.block.ui.button.endFade", new Object[0], new ep5(9)), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 1, 0, null, j, oq5Var2, 0, 3456, 52728);
                    oq5 oq5Var3 = oq5Var2;
                    if (torVar.b != null) {
                        oq5Var3.Z(-1618317283);
                        yci q = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(vciVar, f3, 0.0f, 2), 0.0f, 2, 0.0f, 0.0f, 13);
                        q.getClass();
                        xcs.b(torVar.b, vnj.r(q, "com.yandex.music.plus.features.subscription.block.ui.button.endFade", new Object[0], new ep5(9)), ((dq0) oq5Var3.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 1, 0, null, nu0.i(), oq5Var3, 0, 3456, 52728);
                        oq5Var3 = oq5Var3;
                        z = false;
                    } else {
                        z = false;
                        oq5Var3.Z(-1620985732);
                    }
                    oq5Var3.p(z);
                    oq5Var3.p(true);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
