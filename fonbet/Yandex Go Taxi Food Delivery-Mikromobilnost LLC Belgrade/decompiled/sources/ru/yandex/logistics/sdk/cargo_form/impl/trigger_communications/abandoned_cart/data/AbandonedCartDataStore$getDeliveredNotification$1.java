package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.AbandonedCartDataStore", f = "AbandonedCartDataStore.kt", l = {25}, m = "getDeliveredNotification", v = 2)
/* loaded from: classes5.dex */
final class AbandonedCartDataStore$getDeliveredNotification$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonedCartDataStore$getDeliveredNotification$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
