package com.plaid.internal;

import com.plaid.link.OnLoadCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$maybePreloadLink$2$1", f = "PreloadLinkController.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.f6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0168f6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ OnLoadCallback a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168f6(OnLoadCallback onLoadCallback, Continuation<? super C0168f6> continuation) {
        super(2, continuation);
        this.a = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0168f6(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0168f6(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.a.onLoad();
        return Unit.INSTANCE;
    }
}
