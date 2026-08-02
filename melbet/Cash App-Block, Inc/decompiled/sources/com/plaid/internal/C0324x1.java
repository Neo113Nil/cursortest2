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

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$storeLinkState$2", f = "HybridLinkStateStore.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0324x1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ N2 a;
    public final /* synthetic */ C0333y1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0324x1(N2 n2, C0333y1 c0333y1, Continuation<? super C0324x1> continuation) {
        super(2, continuation);
        this.a = n2;
        this.b = c0333y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0324x1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0324x1(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        C0095a6.a.a(C0095a6.a, "Store LinkState: " + this.a);
        this.b.d = this.a;
        C0333y1.b(this.b, this.a);
        return Unit.INSTANCE;
    }
}
