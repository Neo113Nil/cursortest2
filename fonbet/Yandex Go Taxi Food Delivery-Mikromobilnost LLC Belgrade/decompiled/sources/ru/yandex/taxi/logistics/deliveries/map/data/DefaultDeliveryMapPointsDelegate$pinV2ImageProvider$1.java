package ru.yandex.taxi.logistics.deliveries.map.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.deliveries.map.data.DefaultDeliveryMapPointsDelegate", f = "DefaultDeliveryMapPointsDelegate.kt", l = {HProv.PP_SIGNATUREOID}, m = "pinV2ImageProvider", v = 2)
/* loaded from: classes5.dex */
final class DefaultDeliveryMapPointsDelegate$pinV2ImageProvider$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDeliveryMapPointsDelegate$pinV2ImageProvider$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, 0, 0, this);
    }
}
