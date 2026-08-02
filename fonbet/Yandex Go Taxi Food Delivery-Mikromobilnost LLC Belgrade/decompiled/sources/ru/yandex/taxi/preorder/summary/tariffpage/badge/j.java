package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.ebx0;
import defpackage.i3y;
import defpackage.mnv0;
import defpackage.ogu0;
import defpackage.pdc;
import defpackage.tpr;
import defpackage.wk21;
import defpackage.ykz0;
import defpackage.zuj0;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final class j implements ebx0 {
    public final ru.yandex.taxi.summary.promotions.repository.e a;
    public final mnv0 b;
    public final zuj0 c;
    public final pdc d;
    public final wk21 e;
    public final ykz0 f;
    public final List g = Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.TARIFF_CARD);
    public final List h = Collections.singletonList(ConfigurationType.LIST);
    public final i3y i = kotlin.a.b(LazyThreadSafetyMode.NONE, new ogu0(12, this));

    public j(ru.yandex.taxi.summary.promotions.repository.e eVar, mnv0 mnv0Var, zuj0 zuj0Var, pdc pdcVar, wk21 wk21Var, ykz0 ykz0Var) {
        this.a = eVar;
        this.b = mnv0Var;
        this.c = zuj0Var;
        this.d = pdcVar;
        this.e = wk21Var;
        this.f = ykz0Var;
    }

    @Override // defpackage.ebx0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, com.yandex.go.coroutines.b.d(this.a.d(), new SummaryPromotionTariffBadgeInteractor$badgesFlow$1(2, null)), new SummaryPromotionTariffBadgeInteractor$badgesFlow$2(this, null));
    }

    public final int b() {
        return ((Number) this.i.getValue()).intValue();
    }
}
