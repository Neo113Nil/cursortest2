package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class xpa implements f4s0 {
    public final zuj0 a;

    public xpa(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    @Override // defpackage.f4s0
    public final d4s0 a() {
        Layout layout = Layout.e;
        ea5 b = b(4, 2);
        r501 r501Var = b791.a;
        w5b0 w5b0Var = new w5b0("LOADING_ITEM_ID", b, r501Var, 48);
        ba5 ba5Var = new ba5(qje.t(xng0.controlMinor, ((avj0) this.a).a));
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        OfferType offerType = OfferType.SQUARE_BUTTON;
        da5 da5Var = da5.c;
        return new d4s0(layout, e1z.a, null, scc.g(w5b0Var, new lxt0("LOADING_ITEM_ID", new ea5(2, 2, ba5Var, "LOADING_GRID_ID", baseShortcutModel$Source, offerType, da5Var, da5Var, new fa5(0), "LOADING_ITEM_ID", (q1) null, EmptyList.a, (f0) null, (Counters) null, (List) null, 61440), r501Var, "", 224), new kf10("LOADING_ITEM_ID", b(6, 1), new g8v(0), 48)), null, null, null, null, null, false, 2548);
    }

    public final ea5 b(int i, int i2) {
        ba5 ba5Var = new ba5(qje.t(xng0.controlMinor, ((avj0) this.a).a));
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        OfferType offerType = OfferType.UNSUPPORTED;
        da5 da5Var = da5.c;
        return new ea5(i, i2, ba5Var, "LOADING_GRID_ID", baseShortcutModel$Source, offerType, da5Var, da5Var, new fa5(0), "LOADING_ITEM_ID", (q1) null, EmptyList.a, (f0) null, (Counters) null, (List) null, 61440);
    }
}
