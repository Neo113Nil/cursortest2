package io.flutter.embedding.android;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.atr;
import defpackage.csr;
import defpackage.ctr;
import defpackage.dsr;
import defpackage.eko;
import defpackage.krr;
import defpackage.lrr;
import defpackage.mx60;
import defpackage.qc;
import defpackage.qir;
import defpackage.vqq0;
import defpackage.vrr;
import defpackage.xx60;
import defpackage.yvc0;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.tankerapp.go.presentation.CartechFragment;

/* loaded from: classes4.dex */
public class FlutterFragment extends Fragment implements lrr, ComponentCallbacks2, krr {
    protected static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
    protected static final String ARG_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
    protected static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
    protected static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
    protected static final String ARG_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
    protected static final String ARG_DART_ENTRYPOINT_URI = "dart_entrypoint_uri";
    protected static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
    protected static final String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    protected static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
    protected static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
    protected static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
    protected static final String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
    protected static final String ARG_INITIAL_ROUTE = "initial_route";
    protected static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
    protected static final String ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED = "should_automatically_handle_on_back_pressed";
    protected static final String ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW = "should_delay_first_android_view_draw";
    public static final int FLUTTER_VIEW_ID = View.generateViewId();
    private static final String TAG = "FlutterFragment";
    io.flutter.embedding.android.a delegate;
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.flutter.embedding.android.FlutterFragment.1
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
            if (FlutterFragment.this.stillAttachedForEvent("onWindowFocusChanged")) {
                FlutterFragment.this.delegate.onWindowFocusChanged(z);
            }
        }
    };
    private krr delegateFactory = this;
    final mx60 onBackPressedCallback = new qc(11, this);

    public FlutterFragment() {
        setArguments(new Bundle());
    }

    public static FlutterFragment createDefault() {
        return new a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean stillAttachedForEvent(String str) {
        io.flutter.embedding.android.a aVar = this.delegate;
        if (aVar == null) {
            hashCode();
            return false;
        }
        if (aVar.isAttached()) {
            return true;
        }
        hashCode();
        return false;
    }

    public static b withCachedEngine(String str) {
        return new b(str);
    }

    public static a withNewEngine() {
        return new a();
    }

    public static dsr withNewEngineInGroup(String str) {
        return new dsr(str);
    }

    @Override // defpackage.lrr
    public boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // defpackage.lrr, defpackage.vrr
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        xx60 activity = getActivity();
        if (activity instanceof vrr) {
            ((vrr) activity).cleanUpFlutterEngine(flutterEngine);
        }
    }

    @Override // defpackage.lrr, defpackage.vrr
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        xx60 activity = getActivity();
        if (activity instanceof vrr) {
            ((vrr) activity).configureFlutterEngine(flutterEngine);
        }
    }

    @Override // defpackage.krr
    public io.flutter.embedding.android.a createDelegate(lrr lrrVar) {
        return new io.flutter.embedding.android.a(lrrVar);
    }

    @Override // defpackage.lrr
    public void detachFromFlutterEngine() {
        toString();
        Objects.toString(getFlutterEngine());
        io.flutter.embedding.android.a aVar = this.delegate;
        if (aVar != null) {
            aVar.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // defpackage.lrr
    public /* bridge */ /* synthetic */ Activity getActivity() {
        return getActivity();
    }

    @Override // defpackage.lrr
    public String getAppBundlePath() {
        return getArguments().getString(ARG_APP_BUNDLE_PATH);
    }

    @Override // defpackage.lrr
    public boolean getBackCallbackState() {
        return this.onBackPressedCallback.b;
    }

    @Override // defpackage.lrr
    public String getCachedEngineGroupId() {
        return getArguments().getString(ARG_CACHED_ENGINE_GROUP_ID, null);
    }

    @Override // defpackage.lrr
    public String getCachedEngineId() {
        return getArguments().getString(ARG_CACHED_ENGINE_ID, null);
    }

    @Override // defpackage.lrr
    public List<String> getDartEntrypointArgs() {
        return getArguments().getStringArrayList(ARG_DART_ENTRYPOINT_ARGS);
    }

    @Override // defpackage.lrr
    public String getDartEntrypointFunctionName() {
        return getArguments().getString(ARG_DART_ENTRYPOINT, "main");
    }

    @Override // defpackage.lrr
    public String getDartEntrypointLibraryUri() {
        return getArguments().getString(ARG_DART_ENTRYPOINT_URI);
    }

    public eko getExclusiveAppComponent() {
        return this.delegate;
    }

    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override // defpackage.lrr
    public atr getFlutterShellArgs() {
        String[] stringArray = getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        atr atrVar = new atr();
        atrVar.a = new HashSet(Arrays.asList(stringArray));
        return atrVar;
    }

    @Override // defpackage.lrr
    public String getInitialRoute() {
        return getArguments().getString(ARG_INITIAL_ROUTE);
    }

    @Override // defpackage.lrr
    public RenderMode getRenderMode() {
        return RenderMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, RenderMode.surface.name()));
    }

    @Override // defpackage.lrr
    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, TransparencyMode.transparent.name()));
    }

    public boolean isFlutterEngineInjected() {
        return this.delegate.isFlutterEngineFromHost();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        io.flutter.embedding.android.a createDelegate = this.delegateFactory.createDelegate(this);
        this.delegate = createDelegate;
        createDelegate.onAttach(context);
        if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
            requireActivity().getOnBackPressedDispatcher().a(this, this.onBackPressedCallback);
            this.onBackPressedCallback.h(false);
        }
        context.registerComponentCallbacks(this);
    }

    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.onBackPressedCallback.h(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        this.delegate.onRestoreInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        if (stillAttachedForEvent("onDestroyView")) {
            this.delegate.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        io.flutter.embedding.android.a aVar = this.delegate;
        if (aVar == null) {
            toString();
            return;
        }
        aVar.onDetach();
        this.delegate.release();
        this.delegate = null;
    }

    @Override // defpackage.lrr
    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // defpackage.lrr
    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    @Override // defpackage.lrr
    public void onFlutterUiDisplayed() {
        xx60 activity = getActivity();
        if (activity instanceof ctr) {
            ((ctr) activity).onFlutterUiDisplayed();
        }
    }

    @Override // defpackage.lrr
    public void onFlutterUiNoLongerDisplayed() {
        xx60 activity = getActivity();
        if (activity instanceof ctr) {
            ((ctr) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    public void onNewIntent(Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
    }

    public void onPostResume() {
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i);
        }
    }

    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
    }

    @Override // defpackage.xvc0
    public boolean popSystemNavigator() {
        FragmentActivity activity;
        if (!getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false) || (activity = getActivity()) == null) {
            return false;
        }
        mx60 mx60Var = this.onBackPressedCallback;
        boolean z = mx60Var.b;
        if (z) {
            mx60Var.h(false);
        }
        activity.getOnBackPressedDispatcher().c();
        if (z) {
            this.onBackPressedCallback.h(true);
        }
        return true;
    }

    @Override // defpackage.lrr, defpackage.csr
    public FlutterEngine provideFlutterEngine(Context context) {
        xx60 activity = getActivity();
        if (activity instanceof csr) {
            return ((csr) activity).provideFlutterEngine(getContext());
        }
        return null;
    }

    @Override // defpackage.lrr
    public yvc0 providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new yvc0(getActivity(), flutterEngine.m, this);
        }
        return null;
    }

    @Override // defpackage.lrr
    public vqq0 provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new vqq0(FLUTTER_VIEW_ID, activity, flutterEngine.o);
        }
        return null;
    }

    public void setDelegateFactory(krr krrVar) {
        this.delegateFactory = krrVar;
        this.delegate = krrVar.createDelegate(this);
    }

    @Override // defpackage.xvc0
    public void setFrameworkHandlesBack(boolean z) {
        if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
            this.onBackPressedCallback.h(z);
        }
    }

    @Override // defpackage.lrr
    public boolean shouldAttachEngineToActivity() {
        return getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
    }

    public boolean shouldDelayFirstAndroidViewDraw() {
        return getArguments().getBoolean(ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW);
    }

    @Override // defpackage.lrr
    public boolean shouldDestroyEngineWithHost() {
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false) : getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
    }

    @Override // defpackage.lrr
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // defpackage.lrr
    public boolean shouldHandleDeeplinking() {
        return getArguments().getBoolean(ARG_HANDLE_DEEPLINKING);
    }

    @Override // defpackage.lrr
    public boolean shouldRestoreAndSaveState() {
        return getArguments().containsKey(ARG_ENABLE_STATE_RESTORATION) ? getArguments().getBoolean(ARG_ENABLE_STATE_RESTORATION) : getCachedEngineId() == null;
    }

    public void updateSystemUiOverlays() {
        io.flutter.embedding.android.a aVar = this.delegate;
        if (aVar != null) {
            aVar.updateSystemUiOverlays();
        }
    }

    public static class a {
        public final Class a;
        public String b;
        public String c;
        public List d;
        public String e;
        public boolean f;
        public String g;
        public atr h;
        public RenderMode i;
        public TransparencyMode j;
        public boolean k;
        public boolean l;
        public boolean m;

        public a() {
            this.b = "main";
            this.c = null;
            this.e = "/";
            this.f = false;
            this.g = null;
            this.h = null;
            this.i = RenderMode.surface;
            this.j = TransparencyMode.transparent;
            this.k = true;
            this.l = false;
            this.m = false;
            this.a = FlutterFragment.class;
        }

        public final FlutterFragment a() {
            Class cls = this.a;
            try {
                FlutterFragment flutterFragment = (FlutterFragment) cls.getDeclaredConstructor(null).newInstance(null);
                if (flutterFragment != null) {
                    flutterFragment.setArguments(b());
                    return flutterFragment;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + cls.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e) {
                qir.s("Could not instantiate FlutterFragment subclass (", cls.getName(), Extension.C_BRAKE, e);
                return null;
            }
        }

        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.e);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.f);
            bundle.putString(FlutterFragment.ARG_APP_BUNDLE_PATH, this.g);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.b);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT_URI, this.c);
            bundle.putStringArrayList(FlutterFragment.ARG_DART_ENTRYPOINT_ARGS, this.d != null ? new ArrayList<>(this.d) : null);
            atr atrVar = this.h;
            if (atrVar != null) {
                HashSet hashSet = atrVar.a;
                bundle.putStringArray(FlutterFragment.ARG_FLUTTER_INITIALIZATION_ARGS, (String[]) hashSet.toArray(new String[hashSet.size()]));
            }
            RenderMode renderMode = this.i;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            TransparencyMode transparencyMode = this.j;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.k);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.l);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.m);
            return bundle;
        }

        public a(int i) {
            this.b = "main";
            this.c = null;
            this.e = "/";
            this.f = false;
            this.g = null;
            this.h = null;
            this.i = RenderMode.surface;
            this.j = TransparencyMode.transparent;
            this.k = true;
            this.l = false;
            this.m = false;
            this.a = CartechFragment.class;
        }
    }
}
