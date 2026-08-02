package com.plaid.internal;

import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes5.dex */
public final class M7 implements B6, B8 {
    public final T3 a;

    public M7(T3 t3) {
        t3.getClass();
        this.a = t3;
    }

    @Override // com.plaid.internal.B8
    public final Object a(String str, C0280s2 c0280s2) {
        Object a = this.a.a("webview_fallback_id_state", "webview_fallback_id", str, c0280s2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.B6
    public final Object a(ContinuationImpl continuationImpl) {
        return this.a.a("webview_fallback_id_state", "webview_fallback_id", continuationImpl);
    }

    @Override // com.plaid.internal.B6
    public final Object a(SuspendLambda suspendLambda) {
        Object a = this.a.a("webview_fallback_id_state", suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
