package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import defpackage.lvj0;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory", f = "ScootersDetailedOrderActionListFactory.kt", l = {lvj0.NOT_MODIFIED}, m = "onboardingEntrypoint", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$onboardingEntrypoint$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$onboardingEntrypoint$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
