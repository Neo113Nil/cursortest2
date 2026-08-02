package com.plaid.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$storeNoLoadingUi$3", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class V4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ W4 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(W4 w4, boolean z, Continuation<? super V4> continuation) {
        super(2, continuation);
        this.a = w4;
        this.b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new V4(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new V4(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.a.a.a("plaid_no_loading_ui", String.valueOf(this.b));
        return Unit.INSTANCE;
    }
}
