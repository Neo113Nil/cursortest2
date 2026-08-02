package defpackage;

import androidx.compose.foundation.layout.d;
import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vf3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomsheetCollapsingTopBar b;

    public /* synthetic */ vf3(BottomsheetCollapsingTopBar bottomsheetCollapsingTopBar, int i) {
        this.a = 1;
        this.b = bottomsheetCollapsingTopBar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        byte b = 0;
        BottomsheetCollapsingTopBar bottomsheetCollapsingTopBar = this.b;
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i3 = BottomsheetCollapsingTopBar.q;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    etn.l(dlg.d.o(dlg.e, oq5Var), ild.C(-1553194784, new vf3(bottomsheetCollapsingTopBar, i2, b), oq5Var), oq5Var, 56);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                num.getClass();
                int i4 = BottomsheetCollapsingTopBar.q;
                bottomsheetCollapsingTopBar.j(rvf.R(1), hq5Var);
                return Unit.a;
            case 2:
                int intValue2 = num.intValue();
                int i5 = BottomsheetCollapsingTopBar.q;
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    q7g.r(3126, 0, ild.C(1614219846, new vf3(bottomsheetCollapsingTopBar, 3, b), oq5Var2), kg5.c, oq5Var2, d.c(vci.a, 1.0f), !((Boolean) oq5Var2.j((agr) dlg.d.c)).booleanValue());
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            default:
                return BottomsheetCollapsingTopBar.r(bottomsheetCollapsingTopBar, hq5Var, num.intValue());
        }
    }

    public /* synthetic */ vf3(BottomsheetCollapsingTopBar bottomsheetCollapsingTopBar, int i, byte b) {
        this.a = i;
        this.b = bottomsheetCollapsingTopBar;
    }
}
