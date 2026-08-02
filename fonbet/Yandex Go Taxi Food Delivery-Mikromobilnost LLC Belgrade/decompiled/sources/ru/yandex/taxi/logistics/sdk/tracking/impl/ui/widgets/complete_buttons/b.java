package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons;

import defpackage.hwy0;
import defpackage.io9;
import defpackage.syc;
import defpackage.tpr;
import defpackage.y47;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class b {
    public final io9 a;
    public final tpr b;

    public b(e eVar, y47 y47Var, hwy0 hwy0Var, io9 io9Var) {
        this.a = io9Var;
        this.b = kotlinx.coroutines.flow.e.t(new m0(new m0(hwy0Var.b, new syc(eVar.e, 0), new CompleteButtonsStateHolder$buttonsFlow$1(3, null)), y47Var.b, new CompleteButtonsStateHolder$completeButtonsFlow$1(3, this, b.class, "createCompleteButtons", "createCompleteButtons(Lcom/yandex/delivery/mapper/model/state/CompletedStateButtons;Ljava/util/Map;)Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/complete_buttons/CompleteButtonsModel;", 4)));
    }
}
