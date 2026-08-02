package defpackage;

import android.view.ContextThemeWrapper;
import com.yandex.go.dto.response.Action$ScootersQrScan;
import com.yandex.go.dto.response.Action$Support;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.b;

/* loaded from: classes13.dex */
public final class yvo0 implements e4s0 {
    public final zuj0 a;

    public yvo0(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    @Override // defpackage.e4s0
    public final d4s0 a() {
        Layout layout = Layout.e;
        int i = kyh0.scooters_support;
        avj0 avj0Var = (avj0) this.a;
        String h = avj0Var.h(i);
        String h2 = avj0Var.h(kyh0.scooters_discovery_fallback_shortcut_support_subtitle);
        int i2 = xng0.controlMinor;
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        ba5 ba5Var = new ba5(qje.t(i2, contextThemeWrapper));
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        OfferType offerType = OfferType.PERSONAL;
        b bVar = FormattedText.Companion;
        ea5 ea5Var = new ea5(4, 2, ba5Var, "FALLBACK_GRID_ID", baseShortcutModel$Source, offerType, new da5(h, bVar.a(h, q5z.s(qje.t(xng0.textMain, contextThemeWrapper)))), new da5(h2, bVar.a(h2, q5z.s(qje.t(xng0.textMinor, contextThemeWrapper)))), new fa5(0), "discovery_scooters_support:error_fallback", new Action$Support("scooters"), Collections.singletonList(new dl4("", Integer.valueOf(q0h0.ic_scooters_shortcut_support))), (f0) null, (Counters) null, (List) null, 61440);
        s400 s400Var = aw91.a;
        w5b0 w5b0Var = new w5b0("discovery_scooters_support:error_fallback", ea5Var, s400Var, 56);
        String h3 = avj0Var.h(kyh0.scooters_discovery_fallback_shortcut_qr_title);
        return new d4s0(layout, d1z.a, null, scc.g(w5b0Var, new nxk0("discovery_scooters_qr:error_fallback", new ea5(2, 2, new ba5(qje.t(xng0.controlMain, avj0Var.a)), "FALLBACK_GRID_ID", baseShortcutModel$Source, OfferType.ROUND_BUTTON, new da5(h3, b.b(bVar, h3, 20, null, FormattedText.FontStyle.NORMAL, FormattedText.FontWeight.HEAVY, 12)), da5.c, new fa5(0), "discovery_scooters_qr:error_fallback", new Action$ScootersQrScan(0), EmptyList.a, (f0) null, (Counters) null, (List) null, 61440), s400Var, "", q0h0.ic_scooters_shortcut_qr, 224)), null, null, null, null, null, true, 2548);
    }
}
