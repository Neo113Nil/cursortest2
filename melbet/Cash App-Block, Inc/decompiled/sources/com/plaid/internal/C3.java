package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.link.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/internal/C3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C3 extends Fragment {
    public D3 a;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.loading.LoadingFragment$onCreateView$1", f = "LoadingFragment.kt", l = {35}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ C0257p5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0257p5 c0257p5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = c0257p5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C3.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C3.this.new a(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                D3 d3 = C3.this.a;
                if (d3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    throw null;
                }
                this.a = 1;
                W4 w4 = d3.a;
                if (w4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("clientSideOnlyConfigurationStore");
                    throw null;
                }
                obj = w4.a(this);
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
            S4 s4 = (S4) obj;
            if (s4 != null) {
                this.c.a.setVisibility(s4.a ? 4 : 0);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        activity.getClass();
        E3 b = ((w8) activity).b();
        b.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, b, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(D3.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.a = (D3) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.plaid_loading_fragment, viewGroup, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        C0257p5 c0257p5 = new C0257p5(frameLayout);
        D3 d3 = this.a;
        if (d3 != null) {
            JobKt.launch$default(ViewModelKt.getViewModelScope(d3), null, null, new a(c0257p5, null), 3);
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }
}
