package com.squareup.cash.moneybot.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesRequest;
import com.squareup.protos.cash.kgoose.api.v3.cash.RequestEnvelope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SendChannel $requests;
    public final /* synthetic */ String $sessionId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$1(SendChannel sendChannel, String str, Continuation continuation) {
        super(2, continuation);
        this.$requests = sendChannel;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$1(this.$requests, this.$sessionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RequestEnvelope requestEnvelope = new RequestEnvelope(new RequestEnvelope.Type.Request(new GetMessagesRequest(this.$sessionId)), ByteString.EMPTY);
            this.label = 1;
            if (this.$requests.send(requestEnvelope, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
