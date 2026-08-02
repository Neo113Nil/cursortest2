package ru.yandex.taxi.logistics.sdk.voiceforwarding.impl;

import com.yandex.delivery.mapper.model.ForwardingId;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cdz0;
import defpackage.ey4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsy31;", "<anonymous>", "(Ltse;)Lsy31;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1", f = "VoiceForwardingImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryRef;
    final /* synthetic */ ForwardingId $forwardingId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1(c cVar, String str, ForwardingId forwardingId, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$deliveryRef = str;
        this.$forwardingId = forwardingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1(this.this$0, this.$deliveryRef, this.$forwardingId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        String str = this.$deliveryRef;
        ForwardingId forwardingId = this.$forwardingId;
        cVar.getClass();
        h K = e.K(e.F(new rol0(new VoiceForwardingImpl$getPhoneReceivingFlow$1(cVar, str, forwardingId, null)), cVar.b.b), new ey4(new cdz0(this.this$0.c.observe(), 11), 25));
        this.label = 1;
        Object y = e.y(K, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
