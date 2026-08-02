package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1", f = "MtCheckoutInteractor.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes6.dex */
public final class MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$1(f fVar, Continuation continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
