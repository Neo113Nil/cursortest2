package com.plaid.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.Insets;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.F6;
import com.plaid.internal.P5;
import com.plaid.link.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/P7;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P7 extends Fragment {
    public static final /* synthetic */ int l = 0;
    public Z5 a;
    public P5 b;
    public U7 c;
    public C0304v d;
    public final Lazy e = LazyKt.lazy(new a());
    public Lambda f = f.a;
    public Function0<Unit> g = e.a;
    public final ActivityResultLauncher<String> h;
    public final ActivityResultLauncher<String> i;
    public ActivityResultLauncher<Unit> j;
    public final g k;

    public static final class a extends Lambda implements Function0<C0194i5> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            U7 u7 = P7.this.c;
            if (u7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                throw null;
            }
            C0194i5 c0194i5 = u7.d;
            if (c0194i5 != null) {
                return c0194i5;
            }
            Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
            throw null;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$2", f = "WebviewFragment.kt", l = {131}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return P7.this.new b((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                P5 p5 = P7.this.b;
                if (p5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    throw null;
                }
                this.a = 1;
                Object collect = p5.b.d.collect(new Q5(new T5(p5)), this);
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                if (collect == coroutineSingletons) {
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

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$4", f = "WebviewFragment.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P7.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return P7.this.new c((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                U7 u7 = P7.this.c;
                if (u7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    throw null;
                }
                this.a = 1;
                A6 a6 = u7.f;
                if (a6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readWebviewBackgroundTransparencyState");
                    throw null;
                }
                obj = a6.a(this);
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
            boolean booleanValue = ((Boolean) obj).booleanValue();
            P7 p7 = P7.this;
            if (booleanValue) {
                Z5 z5 = p7.a;
                if (z5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    throw null;
                }
                z5.a.setBackground(p7.requireContext().getDrawable(R.drawable.plaid_transparent_webview_animation));
                Z5 z52 = P7.this.a;
                if (z52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    throw null;
                }
                Drawable background = z52.a.getBackground();
                background.getClass();
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            } else {
                Z5 z53 = p7.a;
                if (z53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    throw null;
                }
                z53.a.setBackgroundColor(-1);
                FragmentActivity activity = P7.this.getActivity();
                if (activity != null) {
                    C0241n7.a(activity);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$5", f = "WebviewFragment.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ P7 a;

            public a(P7 p7) {
                this.a = p7;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                P5 p5 = this.a.b;
                if (p5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    throw null;
                }
                if (!p5.f.get()) {
                    U7 u7 = this.a.c;
                    if (u7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        throw null;
                    }
                    JobKt.launch$default(ViewModelKt.getViewModelScope(u7), null, null, new W7(u7, null), 3);
                    P5 p52 = this.a.b;
                    if (p52 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(p52.getUrl(), str)) {
                        P5 p53 = this.a.b;
                        if (p53 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webView");
                            throw null;
                        }
                        p53.loadUrl(str);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P7.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return P7.this.new d((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                U7 u7 = P7.this.c;
                if (u7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    throw null;
                }
                ReadonlySharedFlow asSharedFlow = FlowKt.asSharedFlow(u7.m);
                a aVar = new a(P7.this);
                this.a = 1;
                if (asSharedFlow.$$delegate_0.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return null;
        }
    }

    public static final class e extends Lambda implements Function0<Unit> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0<Unit> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    public P7() {
        ActivityResultLauncher<String> registerForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new P7$$ExternalSyntheticLambda0(this, 0));
        registerForActivityResult.getClass();
        this.h = registerForActivityResult;
        ActivityResultLauncher<String> registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts$GetMultipleContents(), new P7$$ExternalSyntheticLambda0(this, 1));
        registerForActivityResult2.getClass();
        this.i = registerForActivityResult2;
        this.k = new g();
    }

    public static final WindowInsetsCompat a(P7 p7, View view, WindowInsetsCompat windowInsetsCompat) {
        p7.getClass();
        view.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        insets.getClass();
        if (p7.requireContext().getApplicationInfo().targetSdkVersion >= 35) {
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            view.setPadding(insets.left, insets.top, insets.right, 0);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        activity.getClass();
        X7 a2 = ((w8) activity).a();
        a2.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, a2, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(U7.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.c = (U7) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        EnumC0151d7 enumC0151d7 = (EnumC0151d7) (arguments != null ? arguments.get("smsAutofillType") : null);
        g gVar = this.k;
        gVar.getClass();
        C0304v c0169f7 = (enumC0151d7 == null ? -1 : C0295u.a[enumC0151d7.ordinal()]) == 1 ? new C0169f7(gVar) : new C0304v();
        this.d = c0169f7;
        Context requireContext = requireContext();
        requireContext.getClass();
        c0169f7.a(requireContext);
        View inflate = layoutInflater.inflate(R.layout.plaid_webview_fragment, viewGroup, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.a = new Z5(frameLayout, frameLayout);
        ActivityResultLauncher<Unit> registerForActivityResult = registerForActivityResult(new C0232m7((C0194i5) this.e.getValue()), new P7$$ExternalSyntheticLambda0(this, 2));
        registerForActivityResult.getClass();
        this.j = registerForActivityResult;
        U7 u7 = this.c;
        if (u7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        N5 n5 = u7.h;
        if (n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRegistry");
            throw null;
        }
        P5 c2 = n5.c();
        this.b = c2;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        U7 u72 = this.c;
        if (u72 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        ActivityResultLauncher<String> activityResultLauncher = this.i;
        ActivityResultLauncher<Unit> activityResultLauncher2 = this.j;
        if (activityResultLauncher2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("takePictureContract");
            throw null;
        }
        activityResultLauncher.getClass();
        Context context = c2.getContext();
        if (context instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context).setBaseContext(P5.a.a(requireContext2));
        }
        c2.c = u72;
        C0148d4 c0148d4 = c2.a;
        c0148d4.getClass();
        c0148d4.a = u72;
        c2.setWebChromeClient(new R4(activityResultLauncher, activityResultLauncher2, u72, this));
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new b(null), 3);
        Z5 z5 = this.a;
        if (z5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        FrameLayout frameLayout2 = z5.b;
        P5 p5 = this.b;
        if (p5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            throw null;
        }
        frameLayout2.addView(p5);
        Z5 z52 = this.a;
        if (z52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        FrameLayout frameLayout3 = z52.b;
        MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = new MaterialButton$$ExternalSyntheticLambda3(this, 13);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout3, materialButton$$ExternalSyntheticLambda3);
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new c(null), 3);
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new d(null), 3);
        Z5 z53 = this.a;
        if (z53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        FrameLayout frameLayout4 = z53.a;
        frameLayout4.getClass();
        return frameLayout4;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        P5 p5 = this.b;
        if (p5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            throw null;
        }
        if (!p5.f.getAndSet(true)) {
            Z5 z5 = this.a;
            if (z5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
            z5.a.setBackground(requireContext().getDrawable(R.drawable.plaid_transparent_webview_animation_fade_out));
            Z5 z52 = this.a;
            if (z52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
            if (z52.a.getBackground() instanceof AnimationDrawable) {
                Z5 z53 = this.a;
                if (z53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    throw null;
                }
                Drawable background = z53.a.getBackground();
                background.getClass();
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            }
            Z5 z54 = this.a;
            if (z54 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
            FrameLayout frameLayout = z54.b;
            P5 p52 = this.b;
            if (p52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                throw null;
            }
            frameLayout.removeView(p52);
            P5 p53 = this.b;
            if (p53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                throw null;
            }
            p53.destroy();
        }
        C0304v c0304v = this.d;
        if (c0304v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autofillManager");
            throw null;
        }
        c0304v.b(getContext());
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final void a(P7 p7, Boolean bool) {
        p7.getClass();
        bool.getClass();
        if (bool.booleanValue()) {
            p7.f.invoke();
        } else {
            Toast.makeText(p7.getContext(), p7.getResources().getString(R.string.grant_camera_permission_to_continue), 0).show();
            p7.g.invoke();
        }
    }

    public static final void a(P7 p7, List list) {
        p7.getClass();
        U7 u7 = p7.c;
        if (u7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        list.getClass();
        u7.a(list);
    }

    public static final void a(P7 p7, Uri uri) {
        p7.getClass();
        U7 u7 = p7.c;
        if (u7 != null) {
            u7.a(CollectionsKt__CollectionsJVMKt.listOf(uri));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public final boolean a() {
        return PermissionChecker.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Function0<Unit> function0, Function0<Unit> function02) {
        function0.getClass();
        function02.getClass();
        this.f = (Lambda) function0;
        this.g = function02;
        this.h.launch("android.permission.CAMERA");
    }

    public static final class g implements InterfaceC0160e7 {
        public g() {
        }

        @Override // com.plaid.internal.InterfaceC0160e7
        public final void a(String str) {
            String value;
            str.getClass();
            MatcherMatchResult find = new Regex("[:]\\s?[\\d]{4,8}\\s?[.]?").find(str);
            if (find != null && find.getValue().length() < 7) {
                C0095a6.a.b(C0095a6.a, "No OTP code found in SMS message.");
                J5 j5 = Y6.a;
                if (j5 != null) {
                    j5.a("No OTP code found in SMS message.");
                    return;
                }
                return;
            }
            String substring = (find == null || (value = find.getValue()) == null) ? null : value.substring(2, find.getValue().length() - 1);
            P7 p7 = P7.this;
            P5 p5 = p7.b;
            if (p5 != null) {
                p5.post(new r6$$ExternalSyntheticLambda0(10, p7, substring));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                throw null;
            }
        }

        public static final void a(P7 p7, String str) {
            p7.getClass();
            P5 p5 = p7.b;
            if (p5 != null) {
                p5.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"rm-otp-code-input\", \"data\": {\"otpCode\": \"" + str + "\"}}')");
                F6.a.a("JSBridge - sent rm-otp-code-input");
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            throw null;
        }

        @Override // com.plaid.internal.InterfaceC0160e7
        public final void a() {
            C0095a6.a.getClass();
            C0095a6.a.a("OTP TimeOut", true);
        }
    }
}
