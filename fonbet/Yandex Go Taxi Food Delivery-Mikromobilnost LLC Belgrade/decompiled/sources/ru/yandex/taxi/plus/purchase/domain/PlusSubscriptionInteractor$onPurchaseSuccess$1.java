package ru.yandex.taxi.plus.purchase.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.plus.purchase.domain.PlusSubscriptionInteractor", f = "PlusSubscriptionInteractor.kt", l = {201, 203}, m = "onPurchaseSuccess-0E7RQCE", v = 2)
/* loaded from: classes6.dex */
final class PlusSubscriptionInteractor$onPurchaseSuccess$1 extends ContinuationImpl {
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSubscriptionInteractor$onPurchaseSuccess$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(false, false, this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
