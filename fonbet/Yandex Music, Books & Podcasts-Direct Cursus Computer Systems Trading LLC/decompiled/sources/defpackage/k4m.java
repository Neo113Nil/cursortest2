package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class k4m implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ k4m(int i, int i2, boolean z) {
        this.a = i2;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = R.drawable.ic_play_64;
        vci vciVar = vci.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    e9g e9gVar = e9g.a;
                    ivf.k(0, 0, oq5Var, xp3.u(d.m(vciVar, lsq.s(e9gVar)), lsq.r(e9gVar, qo6.e, oq5Var, 54)), z);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ivf.l(this.b, d.r(vciVar, 150), null, oq5Var2, 48, 4);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ivf.l(this.b, d.r(vciVar, 100), null, oq5Var3, 48, 4);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (!oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    oq5Var4.S();
                } else if (z) {
                    oq5Var4.Z(654777025);
                    gae.b(a0g.E(R.drawable.ic_check_24, 0, oq5Var4), null, d.m(vciVar, 24), ((dq0) oq5Var4.j(eq0.a)).a.a, oq5Var4, 432, 0);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.Z(655050879);
                    vz1.B(vciVar, 24, oq5Var4, false);
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gae.b(a0g.E(z ? R.drawable.ic_search_24 : R.drawable.ic_arrow_android_back_24, 0, oq5Var5), rvf.M(z ? R.string.search : R.string.go_back, oq5Var5), b.c(a.a(vciVar, "search_field_button_icon"), "icon_type", z ? "search_icon" : "back_icon"), ((dq0) oq5Var5.j(eq0.a)).a.a, oq5Var5, 0, 0);
                } else {
                    oq5Var5.S();
                }
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ivf.l(this.b, d.r(vciVar, 150), null, oq5Var6, 48, 4);
                } else {
                    oq5Var6.S();
                }
                break;
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ivf.l(this.b, d.r(vciVar, 100), null, oq5Var7, 48, 4);
                } else {
                    oq5Var7.S();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                asq.c(z, (hq5) obj, rvf.R(55));
                break;
            case 8:
                ((Integer) obj2).getClass();
                asq.c(z, (hq5) obj, rvf.R(55));
                break;
            case 9:
                hq5 hq5Var8 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    if (z) {
                        i2 = R.drawable.ic_pause_64;
                    }
                    gae.b(a0g.E(i2, 0, oq5Var8), null, null, ((dq0) oq5Var8.j(eq0.a)).a.a, oq5Var8, 48, 4);
                } else {
                    oq5Var8.S();
                }
                break;
            case 10:
                hq5 hq5Var9 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (oq5Var9.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    gae.b(a0g.E(z ? R.drawable.ic_sound_off_24 : R.drawable.ic_sound_on_24, 0, oq5Var9), rvf.M(z ? R.string.unmute_description : R.string.mute_description, oq5Var9), null, ((dq0) oq5Var9.j(eq0.a)).a.a, oq5Var9, 0, 4);
                } else {
                    oq5Var9.S();
                }
                break;
            case 11:
                hq5 hq5Var10 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var10;
                if (oq5Var10.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    if (z) {
                        i2 = R.drawable.ic_pause_64;
                    }
                    gae.b(a0g.E(i2, 0, oq5Var10), null, null, ((dq0) oq5Var10.j(eq0.a)).a.a, oq5Var10, 48, 4);
                } else {
                    oq5Var10.S();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                u7g.a(z, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wdg.s(z, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k4m(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
