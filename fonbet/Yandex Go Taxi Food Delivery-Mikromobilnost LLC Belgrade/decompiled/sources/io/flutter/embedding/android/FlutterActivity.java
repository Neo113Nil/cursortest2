package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import defpackage.atr;
import defpackage.eko;
import defpackage.frr;
import defpackage.grr;
import defpackage.hrr;
import defpackage.irr;
import defpackage.lrr;
import defpackage.mrr;
import defpackage.pey;
import defpackage.sxs;
import defpackage.vqq0;
import defpackage.yvc0;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public class FlutterActivity extends Activity implements lrr, pey {
    public static final int FLUTTER_VIEW_ID = View.generateViewId();
    private static final String TAG = "FlutterActivity";
    protected a delegate;
    boolean hasRegisteredBackCallback = false;
    private t lifecycle;
    private final OnBackInvokedCallback onBackInvokedCallback;

    public FlutterActivity() {
        this.onBackInvokedCallback = Build.VERSION.SDK_INT < 33 ? null : createOnBackInvokedCallback();
        this.lifecycle = new t(this, true);
    }

    @Deprecated
    private void configureStatusBarForFullscreenFlutterExperience() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs$BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public static Intent createDefaultIntent(Context context) {
        irr withNewEngine = withNewEngine();
        withNewEngine.getClass();
        return new Intent(context, (Class<?>) withNewEngine.a).putExtra("route", "/").putExtra("background_mode", withNewEngine.b).putExtra("destroy_engine_with_activity", true);
    }

    private View createFlutterView() {
        return this.delegate.onCreateView(null, null, null, FLUTTER_VIEW_ID, getRenderMode() == RenderMode.surface);
    }

    private OnBackInvokedCallback createOnBackInvokedCallback() {
        return Build.VERSION.SDK_INT >= 34 ? new OnBackAnimationCallback() { // from class: io.flutter.embedding.android.FlutterActivity.1
            public void onBackCancelled() {
                FlutterActivity.this.cancelBackGesture();
            }

            public void onBackInvoked() {
                FlutterActivity.this.commitBackGesture();
            }

            public void onBackProgressed(BackEvent backEvent) {
                FlutterActivity.this.updateBackGestureProgress(backEvent);
            }

            public void onBackStarted(BackEvent backEvent) {
                FlutterActivity.this.startBackGesture(backEvent);
            }
        } : new frr(0, this);
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean stillAttachedForEvent(String str) {
        a aVar = this.delegate;
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

    private void switchLaunchThemeForNormalTheme() {
        int i;
        try {
            Bundle metaData = getMetaData();
            if (metaData == null || (i = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1)) == -1) {
                return;
            }
            setTheme(i);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public static grr withCachedEngine(String str) {
        grr grrVar = new grr();
        String str2 = mrr.a;
        return grrVar;
    }

    public static irr withNewEngine() {
        return new irr();
    }

    public static hrr withNewEngineInGroup(String str) {
        hrr hrrVar = new hrr();
        String str2 = mrr.a;
        return hrrVar;
    }

    @Override // defpackage.lrr
    public boolean attachToEngineAutomatically() {
        return true;
    }

    public void cancelBackGesture() {
        if (stillAttachedForEvent("cancelBackGesture")) {
            this.delegate.cancelBackGesture();
        }
    }

    @Override // defpackage.lrr, defpackage.vrr
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    public void commitBackGesture() {
        if (stillAttachedForEvent("commitBackGesture")) {
            this.delegate.commitBackGesture();
        }
    }

    @Override // defpackage.lrr, defpackage.vrr
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        if (this.delegate.isFlutterEngineFromHost()) {
            return;
        }
        sxs.a(flutterEngine);
    }

    @Override // defpackage.lrr
    public void detachFromFlutterEngine() {
        toString();
        Objects.toString(getFlutterEngine());
        a aVar = this.delegate;
        if (aVar != null) {
            aVar.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // defpackage.lrr
    public Activity getActivity() {
        return this;
    }

    @Override // defpackage.lrr
    public String getAppBundlePath() {
        String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // defpackage.lrr
    public boolean getBackCallbackState() {
        return this.hasRegisteredBackCallback;
    }

    public FlutterActivityLaunchConfigs$BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs$BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs$BackgroundMode.opaque;
    }

    @Override // defpackage.lrr
    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // defpackage.lrr
    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // defpackage.lrr
    public Context getContext() {
        return this;
    }

    @Override // defpackage.lrr
    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // defpackage.lrr
    public String getDartEntrypointFunctionName() {
        String string;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle metaData = getMetaData();
            string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

    @Override // defpackage.lrr
    public String getDartEntrypointLibraryUri() {
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.EntrypointUri");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public eko getExclusiveAppComponent() {
        return this.delegate;
    }

    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override // defpackage.lrr
    public atr getFlutterShellArgs() {
        return atr.a(getIntent());
    }

    @Override // defpackage.lrr
    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.InitialRoute");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Override // defpackage.lrr, defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public Bundle getMetaData() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    @Override // defpackage.lrr
    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs$BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    @Override // defpackage.lrr
    public TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs$BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        if (bundle != null) {
            setFrameworkHandlesBack(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        a aVar = new a(this);
        this.delegate = aVar;
        aVar.onAttach(this);
        this.delegate.onRestoreInstanceState(bundle);
        this.lifecycle.g(Lifecycle.Event.ON_CREATE);
        configureWindowForTransparency();
        setContentView(createFlutterView());
        configureStatusBarForFullscreenFlutterExperience();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (stillAttachedForEvent("onDestroy")) {
            this.delegate.onDestroyView();
            this.delegate.onDetach();
        }
        release();
        this.lifecycle.g(Lifecycle.Event.ON_DESTROY);
    }

    @Override // defpackage.lrr
    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // defpackage.lrr
    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    @Override // defpackage.lrr
    public void onFlutterUiDisplayed() {
        reportFullyDrawn();
    }

    @Override // defpackage.lrr
    public void onFlutterUiNoLongerDisplayed() {
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
        this.lifecycle.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.lifecycle.g(Lifecycle.Event.ON_RESUME);
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.lifecycle.g(Lifecycle.Event.ON_START);
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
        this.lifecycle.g(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (stillAttachedForEvent("onWindowFocusChanged")) {
            this.delegate.onWindowFocusChanged(z);
        }
    }

    @Override // defpackage.xvc0
    public boolean popSystemNavigator() {
        return false;
    }

    @Override // defpackage.lrr, defpackage.csr
    public FlutterEngine provideFlutterEngine(Context context) {
        return null;
    }

    @Override // defpackage.lrr
    public yvc0 providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        return new yvc0(getActivity(), flutterEngine.m, this);
    }

    @Override // defpackage.lrr
    public vqq0 provideSensitiveContentPlugin(Activity activity, FlutterEngine flutterEngine) {
        return new vqq0(FLUTTER_VIEW_ID, activity, flutterEngine.o);
    }

    public void registerOnBackInvokedCallback() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = true;
        }
    }

    public void release() {
        unregisterOnBackInvokedCallback();
        a aVar = this.delegate;
        if (aVar != null) {
            aVar.release();
            this.delegate = null;
        }
    }

    public void setDelegate(a aVar) {
        this.delegate = aVar;
    }

    @Override // defpackage.xvc0
    public void setFrameworkHandlesBack(boolean z) {
        if (z && !this.hasRegisteredBackCallback) {
            registerOnBackInvokedCallback();
        } else {
            if (z || !this.hasRegisteredBackCallback) {
                return;
            }
            unregisterOnBackInvokedCallback();
        }
    }

    @Override // defpackage.lrr
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // defpackage.lrr
    public boolean shouldDestroyEngineWithHost() {
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? getIntent().getBooleanExtra("destroy_engine_with_activity", false) : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // defpackage.lrr
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // defpackage.lrr
    public boolean shouldHandleDeeplinking() {
        try {
            Bundle metaData = getMetaData();
            String str = mrr.a;
            if (metaData == null || !metaData.containsKey("flutter_deeplinking_enabled")) {
                return true;
            }
            return metaData.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.lrr
    public boolean shouldRestoreAndSaveState() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : getCachedEngineId() == null;
    }

    public void startBackGesture(BackEvent backEvent) {
        if (stillAttachedForEvent("startBackGesture")) {
            this.delegate.startBackGesture(backEvent);
        }
    }

    public void unregisterOnBackInvokedCallback() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = false;
        }
    }

    public void updateBackGestureProgress(BackEvent backEvent) {
        if (stillAttachedForEvent("updateBackGestureProgress")) {
            this.delegate.updateBackGestureProgress(backEvent);
        }
    }

    public void updateSystemUiOverlays() {
        a aVar = this.delegate;
        if (aVar != null) {
            aVar.updateSystemUiOverlays();
        }
    }
}
