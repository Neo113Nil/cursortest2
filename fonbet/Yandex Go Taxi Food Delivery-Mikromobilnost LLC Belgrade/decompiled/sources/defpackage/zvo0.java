package defpackage;

import com.yandex.go.dto.response.Action$ScootersQrScan;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.b;

/* loaded from: classes13.dex */
public final class zvo0 implements f4s0 {
    public final zuj0 a;

    public zvo0(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    @Override // defpackage.f4s0
    public final d4s0 a() {
        Layout layout = Layout.e;
        ea5 b = b(4, 2);
        s400 s400Var = aw91.a;
        w5b0 w5b0Var = new w5b0("LOADING_ITEM_ID", b, s400Var, 48);
        int i = kyh0.scooters_discovery_fallback_shortcut_qr_title;
        avj0 avj0Var = (avj0) this.a;
        String h = avj0Var.h(i);
        return new d4s0(layout, e1z.a, null, scc.g(w5b0Var, new nxk0("discovery_scooters_qr:loading", new ea5(2, 2, new ba5(qje.t(xng0.controlMain, avj0Var.a)), "LOADING_GRID_ID", BaseShortcutModel$Source.LOCAL, OfferType.ROUND_BUTTON, new da5(h, b.b(FormattedText.Companion, h, 20, null, FormattedText.FontStyle.NORMAL, FormattedText.FontWeight.HEAVY, 12)), da5.c, new fa5(0), "discovery_scooters_qr:loading", new Action$ScootersQrScan(0), EmptyList.a, (f0) null, (Counters) null, (List) null, 61440), s400Var, "", q0h0.ic_scooters_shortcut_qr, 224), c(), c()), null, null, null, null, null, false, 2548);
    }

    public final ea5 b(int i, int i2) {
        ba5 ba5Var = new ba5(qje.t(xng0.controlMinor, ((avj0) this.a).a));
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        OfferType offerType = OfferType.UNSUPPORTED;
        da5 da5Var = da5.c;
        return new ea5(i, i2, ba5Var, "LOADING_GRID_ID", baseShortcutModel$Source, offerType, da5Var, da5Var, new fa5(0), "LOADING_ITEM_ID", (q1) null, EmptyList.a, (f0) null, (Counters) null, (List) null, 61440);
    }

    public final kf10 c() {
        return new kf10("LOADING_ITEM_ID", b(6, 1), new g8v(0), 48);
    }
}
