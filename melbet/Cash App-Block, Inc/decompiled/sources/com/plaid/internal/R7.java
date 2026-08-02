package com.plaid.internal;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$2", f = "WebviewViewModel.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class R7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ U7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R7(U7 u7, Continuation<? super R7> continuation) {
        super(2, continuation);
        this.b = u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new R7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new R7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            InterfaceC0320w6 interfaceC0320w6 = this.b.i;
            if (interfaceC0320w6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                throw null;
            }
            this.a = 1;
            obj = interfaceC0320w6.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        A a = (A) obj;
        if (a == null) {
            C0095a6.a.e(C0095a6.a, "No Out Of Process Polling Info Available");
            return Unit.INSTANCE;
        }
        U7 u7 = this.b;
        F f = u7.j;
        if (f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
            throw null;
        }
        CloseableCoroutineScope viewModelScope = ViewModelKt.getViewModelScope(u7);
        T7 t7 = this.b.r;
        t7.getClass();
        JobKt.launch$default(viewModelScope, null, null, new D(f, a, t7, null), 3);
        return Unit.INSTANCE;
    }
}
