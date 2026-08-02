package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class cz5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz5 b;

    public /* synthetic */ cz5(tz5 tz5Var, int i) {
        this.a = i;
        this.b = tz5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                nt0.j(this.b, d.c(vciVar, 1.0f), hq5Var, 48);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                ivf.q(rvf.M(R.string.concert_not_found_title, hq5Var2), rvf.M(R.string.concert_not_found_message, hq5Var2), R.drawable.ic_unavailable_24, a.a(bfg.Q(d.x(d.c(androidx.compose.foundation.layout.a.l(vciVar, zs4.g(hq5Var2)), 1.0f), b2c.f, 2), bfg.C(hq5Var2), false, 14), "concert_unavailable_screen"), null, hq5Var2, 0, 16);
                oq5 oq5Var3 = (oq5) hq5Var2;
                tz5 tz5Var = this.b;
                boolean h = oq5Var3.h(tz5Var);
                Object K = oq5Var3.K();
                if (h || K == gq5.a) {
                    e65 e65Var = new e65(0, tz5Var, tz5.class, "onBackClick", "onBackClick()V", 0, 19);
                    oq5Var3.k0(e65Var);
                    K = e65Var;
                }
                t7g.h(gut.p1(vciVar), (Function0) ((h9f) K), null, null, oq5Var3, 0, 12);
                break;
        }
        return Unit.a;
    }
}
