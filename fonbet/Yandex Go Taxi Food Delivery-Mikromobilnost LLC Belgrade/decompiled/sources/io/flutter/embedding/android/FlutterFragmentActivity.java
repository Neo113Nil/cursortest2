package io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import defpackage.atr;
import defpackage.csr;
import defpackage.dsr;
import defpackage.esr;
import defpackage.fsr;
import defpackage.g8e;
import defpackage.gsr;
import defpackage.mrr;
import defpackage.qir;
import defpackage.sxs;
import defpackage.vrr;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class FlutterFragmentActivity extends FragmentActivity implements csr, vrr {
    public static final int FRAGMENT_CONTAINER_ID = View.generateViewId();
    private static final String TAG = "FlutterFragmentActivity";
    private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
    private FlutterFragment flutterFragment;

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
        gsr withNewEngine = withNewEngine();
        withNewEngine.getClass();
        return new Intent(context, (Class<?>) withNewEngine.a).putExtra("route", "/").putExtra("background_mode", withNewEngine.b).putExtra("destroy_engine_with_activity", true);
    }

    private View createFragmentContainer() {
        FrameLayout provideRootLayout = provideRootLayout(this);
        provideRootLayout.setId(FRAGMENT_CONTAINER_ID);
        provideRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return provideRootLayout;
    }

    private void ensureFlutterFragmentCreated() {
        if (this.flutterFragment == null) {
            this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (this.flutterFragment == null) {
            this.flutterFragment = createFlutterFragment();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
            h.f(FRAGMENT_CONTAINER_ID, this.flutterFragment, TAG_FLUTTER_FRAGMENT, 1);
            h.d();
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
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
            Log.e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    public static esr withCachedEngine(String str) {
        esr esrVar = new esr();
        String str2 = mrr.a;
        return esrVar;
    }

    public static gsr withNewEngine() {
        return new gsr();
    }

    public static fsr withNewEngineInGroup(String str) {
        fsr fsrVar = new fsr();
        String str2 = mrr.a;
        return fsrVar;
    }

    @Override // defpackage.vrr
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    @Override // defpackage.vrr
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        FlutterFragment flutterFragment = this.flutterFragment;
        if (flutterFragment == null || !flutterFragment.isFlutterEngineInjected()) {
            sxs.a(flutterEngine);
        }
    }

    public FlutterFragment createFlutterFragment() {
        FlutterActivityLaunchConfigs$BackgroundMode backgroundMode = getBackgroundMode();
        RenderMode renderMode = getRenderMode();
        TransparencyMode transparencyMode = backgroundMode == FlutterActivityLaunchConfigs$BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
        boolean z = renderMode == RenderMode.surface;
        if (getCachedEngineId() != null) {
            getCachedEngineId();
            shouldDestroyEngineWithHost();
            Objects.toString(backgroundMode);
            shouldAttachEngineToActivity();
            b withCachedEngine = FlutterFragment.withCachedEngine(getCachedEngineId());
            withCachedEngine.d = renderMode;
            withCachedEngine.e = transparencyMode;
            withCachedEngine.c = shouldHandleDeeplinking();
            withCachedEngine.f = shouldAttachEngineToActivity();
            withCachedEngine.b = shouldDestroyEngineWithHost();
            withCachedEngine.h = z;
            withCachedEngine.g = true;
            try {
                FlutterFragment flutterFragment = (FlutterFragment) FlutterFragment.class.getDeclaredConstructor(null).newInstance(null);
                if (flutterFragment != null) {
                    flutterFragment.setArguments(withCachedEngine.a());
                    return flutterFragment;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + FlutterFragment.class.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e) {
                qir.s("Could not instantiate FlutterFragment subclass (", FlutterFragment.class.getName(), Extension.C_BRAKE, e);
                return null;
            }
        }
        getCachedEngineGroupId();
        Objects.toString(backgroundMode);
        getDartEntrypointFunctionName();
        if (getDartEntrypointLibraryUri() != null) {
            getDartEntrypointLibraryUri();
        }
        getInitialRoute();
        getAppBundlePath();
        shouldAttachEngineToActivity();
        if (getCachedEngineGroupId() == null) {
            FlutterFragment.a withNewEngine = FlutterFragment.withNewEngine();
            withNewEngine.b = getDartEntrypointFunctionName();
            withNewEngine.c = getDartEntrypointLibraryUri();
            withNewEngine.d = getDartEntrypointArgs();
            withNewEngine.e = getInitialRoute();
            withNewEngine.g = getAppBundlePath();
            withNewEngine.h = atr.a(getIntent());
            withNewEngine.f = shouldHandleDeeplinking();
            withNewEngine.i = renderMode;
            withNewEngine.j = transparencyMode;
            withNewEngine.k = shouldAttachEngineToActivity();
            withNewEngine.m = z;
            withNewEngine.l = true;
            return withNewEngine.a();
        }
        dsr withNewEngineInGroup = FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId());
        withNewEngineInGroup.b = getDartEntrypointFunctionName();
        withNewEngineInGroup.c = getInitialRoute();
        withNewEngineInGroup.d = shouldHandleDeeplinking();
        withNewEngineInGroup.e = renderMode;
        withNewEngineInGroup.f = transparencyMode;
        withNewEngineInGroup.g = shouldAttachEngineToActivity();
        withNewEngineInGroup.i = z;
        withNewEngineInGroup.h = true;
        try {
            FlutterFragment flutterFragment2 = (FlutterFragment) FlutterFragment.class.getDeclaredConstructor(null).newInstance(null);
            if (flutterFragment2 != null) {
                flutterFragment2.setArguments(withNewEngineInGroup.a());
                return flutterFragment2;
            }
            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + FlutterFragment.class.getCanonicalName() + ") does not match the expected return type.");
        } catch (Exception e2) {
            qir.s("Could not instantiate FlutterFragment subclass (", FlutterFragment.class.getName(), Extension.C_BRAKE, e2);
            return null;
        }
    }

    public String getAppBundlePath() {
        String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public FlutterActivityLaunchConfigs$BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? FlutterActivityLaunchConfigs$BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : FlutterActivityLaunchConfigs$BackgroundMode.opaque;
    }

    public String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public List<String> getDartEntrypointArgs() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public String getDartEntrypointFunctionName() {
        String string;
        try {
            Bundle metaData = getMetaData();
            string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

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

    public FlutterEngine getFlutterEngine() {
        return this.flutterFragment.getFlutterEngine();
    }

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

    public Bundle getMetaData() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs$BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.flutterFragment.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.flutterFragment.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        super.onCreate(bundle);
        configureWindowForTransparency();
        setContentView(createFragmentContainer());
        configureStatusBarForFullscreenFlutterExperience();
        ensureFlutterFragmentCreated();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.flutterFragment.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        this.flutterFragment.onTrimMemory(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @Override // defpackage.csr
    public FlutterEngine provideFlutterEngine(Context context) {
        return null;
    }

    public FrameLayout provideRootLayout(Context context) {
        return new FrameLayout(context);
    }

    public FlutterFragment retrieveExistingFlutterFragmentIfPossible() {
        return (FlutterFragment) getSupportFragmentManager().F(TAG_FLUTTER_FRAGMENT);
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

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
}
