package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;
    public final /* synthetic */ fz c;

    public /* synthetic */ xy(q00 q00Var, fz fzVar, int i) {
        this.a = i;
        this.b = q00Var;
        this.c = fzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fz fzVar;
        int i = this.a;
        kjn kjnVar = gq5.a;
        q00 q00Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    float e = zs4.e(oq5Var);
                    vci vciVar = vci.a;
                    yci c = d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, e, 7), 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i3 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, c);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var, i3, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    String str = q00Var.a;
                    String M = rvf.M(R.string.album_not_available, oq5Var);
                    yci a = b.a.a(androidx.compose.ui.platform.a.a(vciVar, "album_unavailable_screen"), b2c.f);
                    fz fzVar2 = this.c;
                    ivf.q(str, M, R.drawable.ic_album_24, a, ild.C(46310904, new xy(q00Var, fzVar2, i2), oq5Var), oq5Var, 24576, 0);
                    boolean h = oq5Var.h(fzVar2);
                    Object K = oq5Var.K();
                    if (h || K == kjnVar) {
                        c3 c3Var = new c3(0, fzVar2, fz.class, "onBackClick", "onBackClick()V", 0, 28);
                        fzVar = fzVar2;
                        oq5Var.k0(c3Var);
                        K = c3Var;
                    } else {
                        fzVar = fzVar2;
                    }
                    h9f h9fVar = (h9f) K;
                    boolean h2 = oq5Var.h(fzVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        c3 c3Var2 = new c3(0, fzVar, fz.class, "onSearchClick", "onSearchClick()V", 0, 29);
                        oq5Var.k0(c3Var2);
                        K2 = c3Var2;
                    }
                    h9f h9fVar2 = (h9f) K2;
                    boolean h3 = oq5Var.h(fzVar);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        zy zyVar = new zy(0, fzVar, fz.class, "onOverflowClick", "onOverflowClick()V", 0, 0);
                        oq5Var.k0(zyVar);
                        K3 = zyVar;
                    }
                    t7g.h(gut.p1(vciVar), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K3), oq5Var, 0, 0);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ztd ztdVar = q00Var.b;
                    v4b v4bVar = new v4b();
                    fz fzVar3 = this.c;
                    boolean h4 = oq5Var2.h(fzVar3) | oq5Var2.h(q00Var);
                    Object K4 = oq5Var2.K();
                    if (h4 || K4 == kjnVar) {
                        K4 = new hb(7, fzVar3, q00Var);
                        oq5Var2.k0(K4);
                    }
                    ghh.f(ztdVar, (Function0) K4, v4bVar, null, null, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
