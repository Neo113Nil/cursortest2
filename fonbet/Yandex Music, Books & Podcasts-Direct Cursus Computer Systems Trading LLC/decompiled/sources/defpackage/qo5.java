package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class qo5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rgt b;

    public /* synthetic */ qo5(rgt rgtVar, int i) {
        this.a = i;
        this.b = rgtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    String str = this.b.d;
                    if (str == null) {
                        oq5Var.Z(-1368702405);
                    } else {
                        oq5Var.Z(-1368702404);
                        ltg.e(qo6.e, str, d.m(xp3.u(vci.a, o5g.F(oq5Var)), 88), null, null, null, null, null, oq5Var, 6, 248);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str2 = this.b.d;
                    if (str2 == null) {
                        oq5Var2.Z(104505828);
                    } else {
                        oq5Var2.Z(104505829);
                        ltg.e(qo6.e, str2, d.m(xp3.u(a.a(vci.a, "open_playlist_block_cover_image"), ugo.a(6)), 88), null, null, bg3.c, null, null, oq5Var2, 196614, 216);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
