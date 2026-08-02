package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController$asyncAuthentication$result$1", f = "TwilioAuthController.kt", l = {26}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.s7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0285s7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC0267q6>, Object> {
    public int a;
    public final /* synthetic */ C0294t7 b;
    public final /* synthetic */ C0303u7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285s7(C0294t7 c0294t7, C0303u7 c0303u7, Continuation<? super C0285s7> continuation) {
        super(2, continuation);
        this.b = c0294t7;
        this.c = c0303u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0285s7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0285s7(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        InterfaceC0312v7 interfaceC0312v7 = this.b.a;
        String str = this.c.b;
        this.a = 1;
        Object a = interfaceC0312v7.a(str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
