package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header;

import defpackage.acu;
import defpackage.b801;
import defpackage.bi60;
import defpackage.ey4;
import defpackage.gci0;
import defpackage.j8n;
import defpackage.kcz0;
import defpackage.n1f;
import defpackage.syc;
import defpackage.tpr;
import defpackage.vau;
import defpackage.vhf0;
import defpackage.vr;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1;

/* loaded from: classes5.dex */
public final class f implements b801 {
    public final vhf0 a;
    public final kcz0 b;
    public final vr c;
    public final bi60 d;
    public final m0 e;
    public final String f;

    public f(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, j8n j8nVar, vau vauVar, vhf0 vhf0Var, kcz0 kcz0Var, vr vrVar, bi60 bi60Var) {
        this.a = vhf0Var;
        this.b = kcz0Var;
        this.c = vrVar;
        this.d = bi60Var;
        gci0 gci0Var = eVar.e;
        this.e = new m0(new m0(new ey4(new syc(gci0Var, 29), 13), kotlinx.coroutines.flow.e.X(j8nVar.b, new DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1(null, j8nVar)), new HeaderStateHolder$headerFlow$2(3, vauVar, vau.class, PolicyMappingsExtension.MAP, "map(Lru/yandex/taxi/logistics/sdk/delivery/state/DeliveryState;Lru/yandex/taxi/logistics/sdk/tracking/impl/domain/DynamicHeaderInfoInteractor$HeaderText;)Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/header/HeaderModel;", 4)), new n1f(26, new acu(gci0Var, 0), this), new HeaderStateHolder$widgetModelFlow$1(3, null));
        this.f = "header-key";
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.e;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.f;
    }
}
