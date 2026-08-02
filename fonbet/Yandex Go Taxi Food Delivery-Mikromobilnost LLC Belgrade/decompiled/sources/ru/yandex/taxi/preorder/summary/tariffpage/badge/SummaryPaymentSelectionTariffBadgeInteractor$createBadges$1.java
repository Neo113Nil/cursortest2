package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.badge.SummaryPaymentSelectionTariffBadgeInteractor", f = "SummaryPaymentSelectionTariffBadgeInteractor.kt", l = {41}, m = "createBadges", v = 2)
/* loaded from: classes6.dex */
final class SummaryPaymentSelectionTariffBadgeInteractor$createBadges$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPaymentSelectionTariffBadgeInteractor$createBadges$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.b(this.this$0, null, this);
    }
}
