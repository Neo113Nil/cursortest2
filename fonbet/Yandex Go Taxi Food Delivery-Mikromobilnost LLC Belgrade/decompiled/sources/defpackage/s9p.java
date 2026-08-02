package defpackage;

import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.impl.experiments.SuperAppShortcutsExperiment;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.shortcuts.view.adapter.model.HeaderService$Type;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class s9p {
    public final rqo a;
    public final zuj0 b;
    public final xih c;

    public s9p(rqo rqoVar, zuj0 zuj0Var, xih xihVar) {
        this.a = rqoVar;
        this.b = zuj0Var;
        this.c = xihVar;
    }

    public final ebu a(Layout layout) {
        String Y;
        int i = layout != null ? layout.b : 6;
        xih xihVar = this.c;
        int a = xihVar.b.a();
        za90 za90Var = xihVar.b;
        int i2 = za90Var.c;
        kgx kgxVar = za90.z[2];
        ba5 ba5Var = new ba5(za90Var.b(i2), null, null, null, null, null);
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.HEADER;
        OfferType offerType = OfferType.TAXI_ROUTE_INPUT;
        SuperAppShortcutsExperiment superAppShortcutsExperiment = SuperAppShortcutsExperiment.d;
        SuperAppShortcutsExperiment superAppShortcutsExperiment2 = (SuperAppShortcutsExperiment) ((jbh) this.a).e(superAppShortcutsExperiment).c();
        if (jl40.l(superAppShortcutsExperiment2, superAppShortcutsExperiment)) {
            Y = null;
        } else {
            superAppShortcutsExperiment2.getClass();
            Y = d6z.Y(superAppShortcutsExperiment2, "where_to_long");
        }
        if (Y == null || Y.length() <= 0) {
            Y = ((avj0) this.b).h(kyh0.main_screen_where_to_button);
        }
        return new ebu("ROUTE_INPUT_ID", new ea5(i, 1, ba5Var, "FALLBACK_GRID_ID", baseShortcutModel$Source, offerType, new da5(Y), new da5(""), new fa5(a, TextStyleDto.HorizontalAlignment.LEADING, null), "ROUTE_INPUT_ID", new Action$RouteInput((String) null, (String) null, (Action$RouteInput.AdditionalAction) null, 15), EmptyList.a, (f0) null, new Counters(0), (List) null, 49152), null, true, HeaderService$Type.TAXI, null, null, false, 7136);
    }
}
