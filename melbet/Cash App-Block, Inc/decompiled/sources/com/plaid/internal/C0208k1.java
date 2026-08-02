package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/k1;", "Lcom/plaid/internal/p8;", "Lcom/plaid/internal/l1;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.plaid.internal.k1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0208k1 extends p8<C0217l1> {
    public static final /* synthetic */ int e = 0;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1", f = "HeadlessOAuthFragment.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.k1$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1$1", f = "HeadlessOAuthFragment.kt", l = {26}, m = "invokeSuspend")
        /* renamed from: com.plaid.internal.k1$a$a, reason: collision with other inner class name */
        public static final class C0053a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ C0208k1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0053a(C0208k1 c0208k1, Continuation<? super C0053a> continuation) {
                super(2, continuation);
                this.b = c0208k1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0053a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return new C0053a(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.a;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    VM vm = this.b.b;
                    if (vm == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        throw null;
                    }
                    this.a = 1;
                    if (((C0217l1) vm).a(this) == coroutineSingletons) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C0208k1.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C0208k1.this.new a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                C0208k1 c0208k1 = C0208k1.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C0053a c0053a = new C0053a(c0208k1, null);
                this.a = 1;
                Object repeatOnLifecycle = RepeatOnLifecycleKt.repeatOnLifecycle(c0208k1.getLifecycle(), state, c0053a, this);
                if (repeatOnLifecycle != obj2) {
                    repeatOnLifecycle = Unit.INSTANCE;
                }
                if (repeatOnLifecycle == obj2) {
                    return obj2;
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

    @Override // com.plaid.internal.p8
    public final C0217l1 a(r8 r8Var, J4 j4) {
        r8Var.getClass();
        j4.getClass();
        return new C0217l1(r8Var, j4);
    }

    @Override // com.plaid.internal.p8, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new a(null), 3);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return null;
    }
}
