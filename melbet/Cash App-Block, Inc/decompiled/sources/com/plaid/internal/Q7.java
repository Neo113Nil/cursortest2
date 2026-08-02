package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$1", f = "WebviewViewModel.kt", l = {121, 127}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Q7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ U7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(U7 u7, Continuation<? super Q7> continuation) {
        super(2, continuation);
        this.b = u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Q7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002a, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            C6 c6 = this.b.c;
            if (c6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackUri");
                throw null;
            }
            this.a = 1;
            obj = c6.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        MutableSharedFlow mutableSharedFlow = this.b.m;
        this.a = 2;
    }
}
