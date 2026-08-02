package ru.yandex.taxi.plus.purchase.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.plus.purchase.domain.PlusSubscriptionInteractor", f = "PlusSubscriptionInteractor.kt", l = {151}, m = "updateSdkDataOnSuccessfulPurchase-IoAF18A", v = 2)
/* loaded from: classes6.dex */
final class PlusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSubscriptionInteractor$updateSdkDataOnSuccessfulPurchase$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object l = this.this$0.l(this);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : new Result(l);
    }
}
