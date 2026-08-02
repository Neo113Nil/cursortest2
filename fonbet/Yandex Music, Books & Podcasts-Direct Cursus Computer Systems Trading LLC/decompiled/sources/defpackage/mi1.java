package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class mi1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi1 b;

    public /* synthetic */ mi1(yi1 yi1Var, int i) {
        this.a = i;
        this.b = yi1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oq5 oq5Var;
        Object obj3;
        int i = this.a;
        vci vciVar = vci.a;
        Object obj4 = gq5.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                yi1 yi1Var = this.b;
                j66.d(yi1Var, null, hq5Var, 0);
                rzf.j(yi1Var.p, null, hq5Var, 0, 2);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                yi1 yi1Var2 = this.b;
                ivf.q(yi1Var2.c.D.b, rvf.M(R.string.artist_not_available, hq5Var2), R.drawable.ic_artist_24, a.a(bfg.Q(d.x(d.c(androidx.compose.foundation.layout.a.l(vciVar, zs4.g(hq5Var2)), 1.0f), b2c.f, 2), bfg.C(hq5Var2), false, 14), "artist_unavailable_screen"), null, hq5Var2, 0, 16);
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean h = oq5Var4.h(yi1Var2);
                Object K = oq5Var4.K();
                if (h || K == obj4) {
                    Object m71Var = new m71(0, yi1Var2, yi1.class, "onBackClick", "onBackClick()V", 0, 27);
                    oq5Var4.k0(m71Var);
                    K = m71Var;
                }
                h9f h9fVar = (h9f) K;
                boolean h2 = oq5Var4.h(yi1Var2);
                Object K2 = oq5Var4.K();
                if (h2 || K2 == obj4) {
                    Object m71Var2 = new m71(0, yi1Var2, yi1.class, "onSearchClick", "onSearchClick()V", 0, 28);
                    oq5Var4.k0(m71Var2);
                    K2 = m71Var2;
                }
                h9f h9fVar2 = (h9f) K2;
                boolean h3 = oq5Var4.h(yi1Var2);
                Object K3 = oq5Var4.K();
                if (h3 || K3 == obj4) {
                    Object m71Var3 = new m71(0, yi1Var2, yi1.class, "onOverflowClick", "onOverflowClick()V", 0, 29);
                    oq5Var4.k0(m71Var3);
                    K3 = m71Var3;
                }
                t7g.h(gut.p1(vciVar), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K3), oq5Var4, 0, 0);
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var3;
                oq5Var6.Z(-1241761822);
                yi1 yi1Var3 = this.b;
                nmj nmjVar = (nmj) yi1Var3.i.getValue();
                Activity activity = yi1Var3.a.b;
                tmb tmbVar = yi1Var3.d;
                boolean h4 = oq5Var6.h(yi1Var3);
                Object K4 = oq5Var6.K();
                if (h4 || K4 == obj4) {
                    K4 = new ti1(0, yi1Var3);
                    oq5Var6.k0(K4);
                }
                jmj b = nmjVar.b((dmj) K4, activity, tmbVar, 1, oq5Var6, 36352);
                oq5Var6.p(false);
                ivf.g(b, d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, zs4.g(hq5Var3)), 1.0f), bfg.C(hq5Var3), false, 14), b2c.f, 2), true, null, hq5Var3, 384, 8);
                boolean h5 = oq5Var6.h(yi1Var3);
                Object K5 = oq5Var6.K();
                if (h5 || K5 == obj4) {
                    oq5Var = oq5Var6;
                    obj3 = yi1Var3;
                    Object oi1Var = new oi1(0, obj3, yi1.class, "onBackClick", "onBackClick()V", 0, 0);
                    oq5Var.k0(oi1Var);
                    K5 = oi1Var;
                } else {
                    oq5Var = oq5Var6;
                    obj3 = yi1Var3;
                }
                h9f h9fVar3 = (h9f) K5;
                boolean h6 = oq5Var.h(obj3);
                Object K6 = oq5Var.K();
                if (h6 || K6 == obj4) {
                    Object oi1Var2 = new oi1(0, obj3, yi1.class, "onSearchClick", "onSearchClick()V", 0, 1);
                    oq5Var.k0(oi1Var2);
                    K6 = oi1Var2;
                }
                h9f h9fVar4 = (h9f) K6;
                boolean h7 = oq5Var.h(obj3);
                Object K7 = oq5Var.K();
                if (h7 || K7 == obj4) {
                    Object oi1Var3 = new oi1(0, obj3, yi1.class, "onOverflowClick", "onOverflowClick()V", 0, 2);
                    oq5Var.k0(oi1Var3);
                    K7 = oi1Var3;
                }
                t7g.h(gut.p1(vciVar), (Function0) h9fVar3, (Function0) h9fVar4, (Function0) ((h9f) K7), oq5Var, 0, 0);
        }
        return Unit.a;
    }
}
