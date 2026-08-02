package ru.yandex.taxi.summary.promotions.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.promotions.repository.SummaryPromotionsRepository", f = "SummaryPromotionsRepository.kt", l = {SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND}, m = "requestPromotionsFromNet", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionsRepository$requestPromotionsFromNet$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsRepository$requestPromotionsFromNet$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, this);
    }
}
