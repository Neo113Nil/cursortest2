package ru.yandex.taxi.logistics.sdk.voiceforwarding.impl;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscription$State;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1 voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1) {
            voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1 = (VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((AppVisibilitySubscription$State) obj) == AppVisibilitySubscription$State.BACKGROUND) {
                        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.I$0 = 0;
                        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1 = new VoiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceForwardingImpl$receivePhoneForDelivery$2$newDeferred$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
