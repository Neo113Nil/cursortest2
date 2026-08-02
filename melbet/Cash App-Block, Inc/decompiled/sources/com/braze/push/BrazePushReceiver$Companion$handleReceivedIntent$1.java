package com.braze.push;

import android.content.Context;
import android.content.Intent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.push.BrazePushReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", f = "BrazePushReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, Continuation<? super BrazePushReceiver$Companion$handleReceivedIntent$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        BrazePushReceiver.Companion companion = BrazePushReceiver.INSTANCE;
        Context applicationContext = this.$context.getApplicationContext();
        applicationContext.getClass();
        companion.handlePush(applicationContext, this.$intent);
        return Unit.INSTANCE;
    }
}
