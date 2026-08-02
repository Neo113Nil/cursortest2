package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$sendTestCrash$1", f = "PlaidCrashReporter.kt", l = {74}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0104b5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0114c5 b;
    public final /* synthetic */ RuntimeException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0104b5(C0114c5 c0114c5, RuntimeException runtimeException, Continuation<? super C0104b5> continuation) {
        super(2, continuation);
        this.b = c0114c5;
        this.c = runtimeException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0104b5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0104b5(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C0114c5 c0114c5 = this.b;
            C0207k0 c0207k0 = c0114c5.c;
            Crash a = c0114c5.b.a(this.c);
            this.a = 1;
            if (c0207k0.a(a, this) == coroutineSingletons) {
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
