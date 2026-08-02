package com.plaid.internal;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class T7 extends G {
    public final /* synthetic */ U7 a;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$linkResultCallback$1$onRequestSilentNetworkAuth$1", f = "WebviewViewModel.kt", l = {108}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AbstractC0187h7 b;
        public final /* synthetic */ U7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0187h7 abstractC0187h7, U7 u7, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = abstractC0187h7;
            this.c = u7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                AbstractC0187h7 abstractC0187h7 = this.b;
                if (abstractC0187h7 instanceof C0293t6) {
                    C0275r6 c0275r6 = this.c.o;
                    if (c0275r6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("proveAuthController");
                        throw null;
                    }
                    c0275r6.a((C0293t6) abstractC0187h7);
                } else if (abstractC0187h7 instanceof C0303u7) {
                    C0294t7 c0294t7 = this.c.k;
                    if (c0294t7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("twilioAuthController");
                        throw null;
                    }
                    this.a = 1;
                    if (c0294t7.a((C0303u7) abstractC0187h7, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    public T7(U7 u7) {
        this.a = u7;
    }

    @Override // com.plaid.internal.G
    public final void a(AbstractC0187h7 abstractC0187h7) {
        abstractC0187h7.getClass();
        CloseableCoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.a);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(viewModelScope, DefaultIoScheduler.INSTANCE, null, new a(abstractC0187h7, this.a, null), 2);
    }
}
