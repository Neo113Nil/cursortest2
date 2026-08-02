package ru.yandex.taxi.logistics.sdk.voiceforwarding.impl;

import com.yandex.delivery.mapper.model.ForwardingId;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g8e;
import defpackage.jgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.py31;
import defpackage.qoh;
import defpackage.sy31;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsy31;", "<anonymous>", "(Ltse;)Lsy31;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.VoiceForwardingImpl$receivePhoneForDelivery$2", f = "VoiceForwardingImpl.kt", l = {43, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VoiceForwardingImpl$receivePhoneForDelivery$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryRef;
    final /* synthetic */ ForwardingId $forwardingId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceForwardingImpl$receivePhoneForDelivery$2(c cVar, String str, ForwardingId forwardingId, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$deliveryRef = str;
        this.$forwardingId = forwardingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VoiceForwardingImpl$receivePhoneForDelivery$2 voiceForwardingImpl$receivePhoneForDelivery$2 = new VoiceForwardingImpl$receivePhoneForDelivery$2(this.this$0, this.$deliveryRef, this.$forwardingId, continuation);
        voiceForwardingImpl$receivePhoneForDelivery$2.L$0 = obj;
        return voiceForwardingImpl$receivePhoneForDelivery$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceForwardingImpl$receivePhoneForDelivery$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (kotlinx.coroutines.a.f(r8, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                qoh qohVar = this.this$0.d;
                if (qohVar != null) {
                    this.L$0 = tseVar;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return (sy31) obj;
                }
                kotlin.b.b(obj);
            }
            qoh h = tje.h(tseVar, null, null, new VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1(this.this$0, this.$deliveryRef, this.$forwardingId, null), 3);
            this.this$0.d = h;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = h.s(this);
        } catch (CancellationException unused) {
            jgz jgzVar = jgz.a;
            jgz.b(g8e.o("VoiceForwarding: Voice forwarding canceled for ", this.$deliveryRef), new Object[0]);
            return py31.a;
        }
    }
}
