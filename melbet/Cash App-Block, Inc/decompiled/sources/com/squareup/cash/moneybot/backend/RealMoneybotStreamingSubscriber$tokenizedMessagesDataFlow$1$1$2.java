package com.squareup.cash.moneybot.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse;
import com.squareup.protos.cash.kgoose.api.v3.cash.ResponseEnvelopeV2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProducerScope $$this$channelFlow;
    public final /* synthetic */ ReceiveChannel $responses;
    public BufferedChannel.BufferedChannelIterator L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$2(ReceiveChannel receiveChannel, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.$responses = receiveChannel;
        this.$$this$channelFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$2(this.$responses, this.$$this$channelFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r7.$$this$channelFlow)._channel.send(r8, r7) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:6:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:6:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:6:0x006c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BufferedChannel.BufferedChannelIterator it;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Object hasNext;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            it = this.$responses.iterator();
            this.L$0 = it;
            this.label = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bufferedChannelIterator = this.L$0;
            SafeTrace.throwOnFailure(obj);
            it = bufferedChannelIterator;
            this.L$0 = it;
            this.label = 1;
            hasNext = it.hasNext(this);
            if (hasNext != coroutineSingletons) {
                bufferedChannelIterator = it;
                obj = hasNext;
                if (((Boolean) obj).booleanValue()) {
                    it = this.$responses.iterator();
                    this.L$0 = it;
                    this.label = 1;
                    hasNext = it.hasNext(this);
                    if (hasNext != coroutineSingletons) {
                    }
                } else {
                    ResponseEnvelopeV2.Type type2 = ((ResponseEnvelopeV2) bufferedChannelIterator.next()).type;
                    if (!(type2 instanceof ResponseEnvelopeV2.Type.Heartbeat)) {
                        if (type2 instanceof ResponseEnvelopeV2.Type.Response) {
                            GetMessagesStreamResponse value = ((ResponseEnvelopeV2.Type.Response) type2).getValue();
                            this.L$0 = bufferedChannelIterator;
                            this.label = 2;
                        } else if (type2 != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                    it = bufferedChannelIterator;
                    this.L$0 = it;
                    this.label = 1;
                    hasNext = it.hasNext(this);
                    if (hasNext != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        bufferedChannelIterator = this.L$0;
        SafeTrace.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
