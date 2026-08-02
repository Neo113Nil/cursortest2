package ru.yandex.taxi.logistics.sdk.voiceforwarding.impl;

import com.yandex.delivery.mapper.model.ForwardingId;
import defpackage.an2;
import defpackage.go2;
import defpackage.hfb0;
import defpackage.ho2;
import defpackage.io2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qy31;
import defpackage.ry31;
import defpackage.ty31;
import defpackage.viv;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.InAppCallInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.VoiceforwardingDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ForwardingIdDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1voiceforwarding.VoiceforwardingRequestDto;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lsy31;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.VoiceForwardingImpl$getPhoneReceivingFlow$1", f = "VoiceForwardingImpl.kt", l = {81, 100}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VoiceForwardingImpl$getPhoneReceivingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryRef;
    final /* synthetic */ ForwardingId $forwardingId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceForwardingImpl$getPhoneReceivingFlow$1(c cVar, String str, ForwardingId forwardingId, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$deliveryRef = str;
        this.$forwardingId = forwardingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VoiceForwardingImpl$getPhoneReceivingFlow$1 voiceForwardingImpl$getPhoneReceivingFlow$1 = new VoiceForwardingImpl$getPhoneReceivingFlow$1(this.this$0, this.$deliveryRef, this.$forwardingId, continuation);
        voiceForwardingImpl$getPhoneReceivingFlow$1.L$0 = obj;
        return voiceForwardingImpl$getPhoneReceivingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceForwardingImpl$getPhoneReceivingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        if (r0.emit(r4, r9) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r10 == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ForwardingIdDto forwardingIdDto;
        Object qy31Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            VoiceForwardingApi voiceForwardingApi = (VoiceForwardingApi) this.this$0.a.get();
            String str = this.$deliveryRef;
            int i2 = ty31.a[this.$forwardingId.ordinal()];
            if (i2 == 1) {
                forwardingIdDto = ForwardingIdDto.PERFORMER;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                forwardingIdDto = ForwardingIdDto.INAPP;
            }
            an2<VoiceforwardingDto> a = voiceForwardingApi.a(new VoiceforwardingRequestDto(str, forwardingIdDto));
            this.L$0 = vprVar;
            this.label = 1;
            ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
            obj = bVar.e(bVar.a, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        io2 io2Var = (io2) obj;
        if (io2Var instanceof ho2) {
            VoiceforwardingDto voiceforwardingDto = (VoiceforwardingDto) ((ho2) io2Var).a;
            hfb0 hfb0Var = new hfb0(voiceforwardingDto.getPhone());
            InAppCallInfoDto inAppCallInfo = voiceforwardingDto.getInAppCallInfo();
            qy31Var = new ry31(hfb0Var, inAppCallInfo != null ? new viv(inAppCallInfo.getTitle(), inAppCallInfo.getForwardingId()) : null, voiceforwardingDto.getExt());
        } else {
            if (!(io2Var instanceof go2)) {
                w511.b();
                return null;
            }
            qy31Var = new qy31(((go2) io2Var).a);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
