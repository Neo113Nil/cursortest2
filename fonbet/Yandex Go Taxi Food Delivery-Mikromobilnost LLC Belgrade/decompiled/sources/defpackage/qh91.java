package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.ybsdk.core.utils.ext.ViewState;
import java.util.Collections;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class qh91 {
    public static final q501 a = new q501(23);

    public static final void a(ylj yljVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-796973460);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yljVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, wwg.S(901859642, true, new wg0(15, tlsVar), btsVar), null, null, null, wwg.S(416951756, true, new l0(14, yljVar, tlsVar), btsVar), btsVar, 12582912, 48, 1919);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(yljVar, tlsVar, i, 12);
        }
    }

    public static mya0 b(eya0 eya0Var, cya0 cya0Var) {
        return (mya0) a.P(eya0Var.c(Collections.singletonList(cya0Var)));
    }

    public static final void c(SwitchCompat switchCompat) {
        int a2 = rje.a(switchCompat.getContext(), ung0.ybColor_control_activeDark);
        ViewState viewState = ViewState.CHECKED;
        ViewState viewState2 = ViewState.ENABLED;
        int i = 1;
        we6 we6Var = new we6(a2, new ViewState[]{viewState, viewState2}, i);
        int a3 = rje.a(switchCompat.getContext(), ung0.ybColor_control_activeDarkDisabled);
        ViewState viewState3 = ViewState.DISABLED;
        we6 we6Var2 = new we6(a3, new ViewState[]{viewState, viewState3}, i);
        int a4 = rje.a(switchCompat.getContext(), ung0.ybColor_control_default);
        ViewState viewState4 = ViewState.UNCHECKED;
        switchCompat.setTrackTintList(cob1.b(we6Var, we6Var2, new we6(a4, new ViewState[]{viewState4, viewState2}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_defaultDisabled), new ViewState[]{viewState4, viewState3}, i)));
        switchCompat.setThumbTintList(cob1.b(new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDefault), new ViewState[]{viewState, viewState2}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDisabled), new ViewState[]{viewState, viewState3}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDefault), new ViewState[]{viewState4, viewState2}, i), new we6(rje.a(switchCompat.getContext(), ung0.ybColor_control_handleDisabled), new ViewState[]{viewState4, viewState3}, i)));
    }

    public static jdj d(int i, w7p w7pVar) {
        boolean z = false;
        return new jdj(new n6e0(i), w7pVar, a, z, 24);
    }
}
