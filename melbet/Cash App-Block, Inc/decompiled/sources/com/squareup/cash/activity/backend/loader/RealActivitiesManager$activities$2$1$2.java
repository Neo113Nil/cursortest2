package com.squareup.cash.activity.backend.loader;

import app.cash.api.ApiResult;
import coil3.intercept.EngineInterceptorKt;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionResponse;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionResponse$Type$Heartbeat;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionResponse$Type$Update;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealActivitiesManager$activities$2$1$2 implements FlowCollector {
    public final /* synthetic */ ProducerScope $$this$callbackFlow;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealActivitiesManager$activities$2$1$2(ProducerScope producerScope, int i) {
        this.$r8$classId = i;
        this.$$this$callbackFlow = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ProducerScope producerScope = this.$$this$callbackFlow;
        switch (i) {
            case 0:
                Object send = ((ProducerCoroutine) producerScope)._channel.send((Activities) obj, continuation);
                if (send != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object send2 = ((ProducerCoroutine) producerScope)._channel.send((Map) obj, continuation);
                if (send2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object send3 = ((ProducerCoroutine) producerScope)._channel.send((PolledData) obj, continuation);
                if (send3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object send4 = ((ProducerCoroutine) producerScope)._channel.send((PolledData) obj, continuation);
                if (send4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object send5 = ((ProducerCoroutine) producerScope)._channel.send(new ApiResult.Success((GetMessagesStreamResponse) obj), continuation);
                if (send5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object send6 = ((ProducerCoroutine) producerScope)._channel.send((ChatSession) obj, continuation);
                if (send6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                EngineInterceptorKt engineInterceptorKt = ((GetPaymentUpdatesBySessionResponse) obj).f1262type;
                if (engineInterceptorKt != null) {
                    if (!(engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Heartbeat)) {
                        if (!(engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Update)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            Object send7 = ((ProducerCoroutine) producerScope)._channel.send(((GetPaymentUpdatesBySessionResponse$Type$Update) engineInterceptorKt).value, continuation);
                            if (send7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                        }
                    } else {
                        Timber.Forest.d("NEARBY: heartbeat", new Object[0]);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
