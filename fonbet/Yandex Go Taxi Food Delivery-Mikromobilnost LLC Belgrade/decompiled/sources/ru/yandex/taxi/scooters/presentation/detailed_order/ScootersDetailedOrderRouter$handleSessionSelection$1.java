package ru.yandex.taxi.scooters.presentation.detailed_order;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.ScootersDetailedOrderRouter", f = "ScootersDetailedOrderRouter.kt", l = {130}, m = "handleSessionSelection", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderRouter$handleSessionSelection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderRouter$handleSessionSelection$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.P(this.this$0, null, this);
    }
}
