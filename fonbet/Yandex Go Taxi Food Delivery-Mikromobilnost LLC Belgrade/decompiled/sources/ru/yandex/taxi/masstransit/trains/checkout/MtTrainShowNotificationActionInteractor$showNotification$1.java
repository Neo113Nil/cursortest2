package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainShowNotificationActionInteractor", f = "MtTrainShowNotificationActionInteractor.kt", l = {29}, m = "showNotification", v = 2)
/* loaded from: classes6.dex */
final class MtTrainShowNotificationActionInteractor$showNotification$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainShowNotificationActionInteractor$showNotification$1(s sVar, Continuation continuation) {
        super(continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
