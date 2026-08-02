package com.plaid.internal;

import com.plaid.internal.C0095a6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$getCurrentLinkState$2", f = "HybridLinkStateStore.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.w1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0315w1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super N2>, Object> {
    public final /* synthetic */ C0333y1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0315w1(C0333y1 c0333y1, Continuation<? super C0315w1> continuation) {
        super(2, continuation);
        this.a = c0333y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0315w1(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0315w1(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        N2 n2;
        N2 n22;
        N2 n23;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        n2 = this.a.d;
        if (n2 == null) {
            C0095a6.a.a(C0095a6.a, "Initializing statestore");
            C0333y1 c0333y1 = this.a;
            c0333y1.d = C0333y1.b(c0333y1);
        }
        C0095a6.a aVar = C0095a6.a;
        n22 = this.a.d;
        C0095a6.a.a(aVar, "Get current LinkState: " + n22);
        n23 = this.a.d;
        n23.getClass();
        return n23;
    }
}
