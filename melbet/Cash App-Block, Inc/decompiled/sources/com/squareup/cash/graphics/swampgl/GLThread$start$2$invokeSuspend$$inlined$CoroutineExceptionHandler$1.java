package com.squareup.cash.graphics.swampgl;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes6.dex */
public final class GLThread$start$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ GLThread this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLThread$start$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1(GLThread gLThread) {
        super(CoroutineExceptionHandler.Key.$$INSTANCE);
        this.this$0 = gLThread;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        this.this$0.onError.invoke(th);
    }
}
