package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.Constants;
import defpackage.asr;
import defpackage.ba20;
import defpackage.bsr;
import defpackage.bxj0;
import defpackage.ctr;
import defpackage.eko;
import defpackage.fix;
import defpackage.jrr;
import defpackage.jsr;
import defpackage.ke4;
import defpackage.lrr;
import defpackage.ny61;
import defpackage.nzc0;
import defpackage.oyr;
import defpackage.ozc0;
import defpackage.ozz0;
import defpackage.quz;
import defpackage.r30;
import defpackage.tfg;
import defpackage.u30;
import defpackage.vqq0;
import defpackage.wrr;
import defpackage.xrr;
import defpackage.yvc0;
import defpackage.zrr;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes4.dex */
public class a implements eko {
    private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
    private static final String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
    static final String ON_BACK_CALLBACK_ENABLED_KEY = "enableOnBackInvokedCallbackState";
    private static final String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
    private static final String TAG = "FlutterActivityAndFragmentDelegate";
    ViewTreeObserver.OnPreDrawListener activePreDrawListener;
    private FlutterEngine flutterEngine;
    FlutterView flutterView;
    private lrr host;
    private boolean isAttached;
    private boolean isFlutterEngineFromHost;
    private boolean isFlutterUiDisplayed;
    private yvc0 platformPlugin;
    private Integer previousVisibility;
    private vqq0 sensitiveContentPlugin;
    private final ctr flutterUiDisplayListener = new jrr(0, this);
    private boolean isFirstFrameRendered = false;
    private asr engineGroup = null;

    public a(lrr lrrVar) {
        this.host = lrrVar;
    }

    public final void a(zrr zrrVar) {
        String appBundlePath = this.host.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = (String) jsr.d().a.d.c;
        }
        tfg tfgVar = new tfg(appBundlePath, this.host.getDartEntrypointFunctionName());
        String initialRoute = this.host.getInitialRoute();
        if (initialRoute == null && (initialRoute = c(this.host.getActivity().getIntent())) == null) {
            initialRoute = "/";
        }
        zrrVar.y = tfgVar;
        zrrVar.b = initialRoute;
        zrrVar.a = this.host.getDartEntrypointArgs();
    }

    public final void b() {
        if (this.host != null) {
            return;
        }
        ny61.r("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    public final String c(Intent intent) {
        Uri data;
        if (!this.host.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void cancelBackGesture() {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.k.a.a("cancelBackGesture", null, null);
        }
    }

    public void commitBackGesture() {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.k.a.a("commitBackGesture", null, null);
        }
    }

    @Override // defpackage.eko
    public void detachFromFlutterEngine() {
        boolean shouldDestroyEngineWithHost = this.host.shouldDestroyEngineWithHost();
        lrr lrrVar = this.host;
        if (shouldDestroyEngineWithHost) {
            quz.t("The internal FlutterEngine created by ", lrrVar, " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        } else {
            lrrVar.detachFromFlutterEngine();
        }
    }

    @Override // defpackage.eko
    public Activity getAppComponent() {
        Activity activity = this.host.getActivity();
        if (activity != null) {
            return activity;
        }
        ny61.f("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
        return null;
    }

    public FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    public boolean isAttached() {
        return this.isAttached;
    }

    public boolean isFlutterEngineFromHost() {
        return this.isFlutterEngineFromHost;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        b();
        if (this.flutterEngine != null) {
            Objects.toString(intent);
            xrr xrrVar = this.flutterEngine.d;
            if (!xrrVar.n()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            ozz0.c("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                wrr wrrVar = (wrr) xrrVar.A;
                wrrVar.getClass();
                Iterator it = new HashSet((HashSet) wrrVar.x).iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((nzc0) it.next()).onActivityResult(i, i2, intent) || z) {
                            z = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public void onAttach(Context context) {
        b();
        if (this.flutterEngine == null) {
            setUpFlutterEngine();
        }
        if (this.host.shouldAttachEngineToActivity()) {
            xrr xrrVar = this.flutterEngine.d;
            Lifecycle lifecycle = this.host.getLifecycle();
            xrrVar.getClass();
            ozz0.c("FlutterEngineConnectionRegistry#attachToActivity");
            try {
                a aVar = (a) xrrVar.z;
                if (aVar != null) {
                    aVar.detachFromFlutterEngine();
                }
                xrrVar.k();
                xrrVar.z = this;
                xrrVar.g((Activity) getAppComponent(), lifecycle);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Activity activity = this.host.getActivity();
        this.platformPlugin = this.host.providePlatformPlugin(activity, this.flutterEngine);
        this.sensitiveContentPlugin = this.host.provideSensitiveContentPlugin(activity, this.flutterEngine);
        this.host.configureFlutterEngine(this.flutterEngine);
        this.isAttached = true;
    }

    public void onBackPressed() {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.j.a.a("popRoute", null, null);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i, boolean z) {
        b();
        RenderMode renderMode = this.host.getRenderMode();
        RenderMode renderMode2 = RenderMode.surface;
        if (renderMode == renderMode2) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(this.host.getContext(), this.host.getTransparencyMode() == TransparencyMode.transparent);
            this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView(this.host.getContext());
            flutterTextureView.setOpaque(this.host.getTransparencyMode() == TransparencyMode.opaque);
            this.host.onFlutterTextureViewCreated(flutterTextureView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterTextureView);
        }
        this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        if (this.host.attachToEngineAutomatically()) {
            this.flutterView.attachToFlutterEngine(this.flutterEngine);
        }
        this.flutterView.setId(i);
        if (z) {
            final FlutterView flutterView = this.flutterView;
            if (this.host.getRenderMode() != renderMode2) {
                ny61.g("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                return null;
            }
            if (this.activePreDrawListener != null) {
                flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            }
            this.activePreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate$2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    boolean z2;
                    boolean z3;
                    z2 = a.this.isFlutterUiDisplayed;
                    if (z2 && a.this.activePreDrawListener != null) {
                        flutterView.getViewTreeObserver().removeOnPreDrawListener(this);
                        a.this.activePreDrawListener = null;
                    }
                    z3 = a.this.isFlutterUiDisplayed;
                    return z3;
                }
            };
            flutterView.getViewTreeObserver().addOnPreDrawListener(this.activePreDrawListener);
        }
        return this.flutterView;
    }

    public void onDestroyView() {
        b();
        if (this.activePreDrawListener != null) {
            this.flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            this.activePreDrawListener = null;
        }
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.detachFromFlutterEngine();
            this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        }
    }

    public void onDetach() {
        FlutterEngine flutterEngine;
        if (this.isAttached) {
            b();
            this.host.cleanUpFlutterEngine(this.flutterEngine);
            if (this.host.shouldAttachEngineToActivity()) {
                boolean isChangingConfigurations = this.host.getActivity().isChangingConfigurations();
                FlutterEngine flutterEngine2 = this.flutterEngine;
                if (isChangingConfigurations) {
                    xrr xrrVar = flutterEngine2.d;
                    if (xrrVar.n()) {
                        ozz0.c("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                        try {
                            xrrVar.b = true;
                            Iterator it = ((HashMap) xrrVar.w).values().iterator();
                            while (it.hasNext()) {
                                ((r30) it.next()).onDetachedFromActivityForConfigChanges();
                            }
                            xrrVar.j();
                            Trace.endSection();
                        } catch (Throwable th) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                    }
                } else {
                    flutterEngine2.d.i();
                }
            }
            yvc0 yvc0Var = this.platformPlugin;
            if (yvc0Var != null) {
                yvc0Var.b.c = null;
                this.platformPlugin = null;
            }
            vqq0 vqq0Var = this.sensitiveContentPlugin;
            if (vqq0Var != null) {
                vqq0Var.c.b = null;
                vqq0Var.a = null;
                this.sensitiveContentPlugin = null;
            }
            if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
                flutterEngine.h.a();
            }
            if (this.host.shouldDestroyEngineWithHost()) {
                this.flutterEngine.a();
                if (this.host.getCachedEngineId() != null) {
                    u30.a().b(this.host.getCachedEngineId(), null);
                }
                this.flutterEngine = null;
            }
            this.isAttached = false;
        }
    }

    public void onNewIntent(Intent intent) {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            xrr xrrVar = flutterEngine.d;
            if (xrrVar.n()) {
                ozz0.c("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((wrr) xrrVar.A).y).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String c = c(intent);
            if (c == null || c.isEmpty()) {
                return;
            }
            ke4 ke4Var = this.flutterEngine.j;
            ke4Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", c);
            ke4Var.a.a("pushRouteInformation", hashMap, null);
        }
    }

    public void onPause() {
        FlutterEngine flutterEngine;
        b();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.h.b();
    }

    public void onPostResume() {
        b();
        if (this.flutterEngine != null) {
            updateSystemUiOverlays();
            this.flutterEngine.t.m();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        b();
        if (this.flutterEngine != null) {
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            xrr xrrVar = this.flutterEngine.d;
            if (!xrrVar.n()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            ozz0.c("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((wrr) xrrVar.A).w).iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((ozc0) it.next()).onRequestPermissionsResult(i, strArr, iArr) || z) {
                            z = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        byte[] bArr;
        b();
        if (bundle != null) {
            bundle.getBundle(PLUGINS_RESTORATION_BUNDLE_KEY);
            bArr = bundle.getByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY);
        } else {
            bArr = null;
        }
        if (this.host.shouldRestoreAndSaveState()) {
            bxj0 bxj0Var = this.flutterEngine.l;
            bxj0Var.e = true;
            ba20 ba20Var = bxj0Var.d;
            if (ba20Var != null) {
                ba20Var.success(bxj0.a(bArr));
                bxj0Var.d = null;
                bxj0Var.b = bArr;
            } else if (bxj0Var.f) {
                bxj0Var.c.a(Constants.PUSH, bxj0.a(bArr), new ba20(1, bxj0Var, bArr));
            } else {
                bxj0Var.b = bArr;
            }
        }
        if (this.host.shouldAttachEngineToActivity()) {
            xrr xrrVar = this.flutterEngine.d;
            if (!xrrVar.n()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
                return;
            }
            ozz0.c("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                Iterator it = ((HashSet) ((wrr) xrrVar.A).A).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public void onResume() {
        FlutterEngine flutterEngine;
        b();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.h.d();
    }

    public void onSaveInstanceState(Bundle bundle) {
        b();
        if (this.host.shouldRestoreAndSaveState()) {
            bundle.putByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY, this.flutterEngine.l.b);
        }
        if (this.host.shouldAttachEngineToActivity()) {
            Bundle bundle2 = new Bundle();
            xrr xrrVar = this.flutterEngine.d;
            if (xrrVar.n()) {
                ozz0.c("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((wrr) xrrVar.A).A).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle(PLUGINS_RESTORATION_BUNDLE_KEY, bundle2);
        }
        if (this.host.getCachedEngineId() == null || this.host.shouldDestroyEngineWithHost()) {
            return;
        }
        bundle.putBoolean(ON_BACK_CALLBACK_ENABLED_KEY, this.host.getBackCallbackState());
    }

    public void onStart() {
        b();
        if (this.host.getCachedEngineId() == null && !this.flutterEngine.c.b) {
            String initialRoute = this.host.getInitialRoute();
            if (initialRoute == null && (initialRoute = c(this.host.getActivity().getIntent())) == null) {
                initialRoute = "/";
            }
            String dartEntrypointLibraryUri = this.host.getDartEntrypointLibraryUri();
            this.host.getDartEntrypointFunctionName();
            this.flutterEngine.j.a.a("setInitialRoute", initialRoute, null);
            String appBundlePath = this.host.getAppBundlePath();
            if (appBundlePath == null || appBundlePath.isEmpty()) {
                appBundlePath = (String) jsr.d().a.d.c;
            }
            lrr lrrVar = this.host;
            this.flutterEngine.c.a(dartEntrypointLibraryUri == null ? new tfg(appBundlePath, lrrVar.getDartEntrypointFunctionName()) : new tfg(appBundlePath, dartEntrypointLibraryUri, lrrVar.getDartEntrypointFunctionName()), this.host.getDartEntrypointArgs());
        }
        Integer num = this.previousVisibility;
        if (num != null) {
            this.flutterView.setVisibility(num.intValue());
        }
    }

    public void onStop() {
        FlutterEngine flutterEngine;
        b();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
            flutterEngine.h.c();
        }
        this.previousVisibility = Integer.valueOf(this.flutterView.getVisibility());
        this.flutterView.setVisibility(8);
        FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 != null) {
            flutterEngine2.b.d(40);
        }
    }

    public void onTrimMemory(int i) {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            if (this.isFirstFrameRendered && i >= 10) {
                FlutterJNI flutterJNI = (FlutterJNI) flutterEngine.c.c;
                if (flutterJNI.isAttached()) {
                    flutterJNI.notifyLowMemoryWarning();
                }
                fix fixVar = this.flutterEngine.r;
                fixVar.getClass();
                HashMap hashMap = new HashMap(1);
                hashMap.put("type", "memoryPressure");
                fixVar.a.z(hashMap, null);
            }
            this.flutterEngine.b.d(i);
            io.flutter.plugin.platform.d dVar = this.flutterEngine.t;
            if (i < 40) {
                dVar.getClass();
                return;
            }
            Iterator it = dVar.C.values().iterator();
            while (it.hasNext()) {
                ((io.flutter.plugin.platform.g) it.next()).h.setSurface(null);
            }
        }
    }

    public void onUserLeaveHint() {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            xrr xrrVar = flutterEngine.d;
            if (!xrrVar.n()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            ozz0.c("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((wrr) xrrVar.A).z).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        FlutterEngine flutterEngine;
        b();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        if (z) {
            io.flutter.embedding.engine.systemchannels.b bVar = flutterEngine.h;
            bVar.e(bVar.a, true);
        } else {
            io.flutter.embedding.engine.systemchannels.b bVar2 = flutterEngine.h;
            bVar2.e(bVar2.a, false);
        }
    }

    public void release() {
        this.host = null;
        this.flutterEngine = null;
        this.flutterView = null;
        this.platformPlugin = null;
        this.sensitiveContentPlugin = null;
    }

    public void setUpFlutterEngine() {
        String cachedEngineId = this.host.getCachedEngineId();
        if (cachedEngineId != null) {
            FlutterEngine flutterEngine = (FlutterEngine) u30.a().a.get(cachedEngineId);
            this.flutterEngine = flutterEngine;
            this.isFlutterEngineFromHost = true;
            if (flutterEngine != null) {
                return;
            }
            ny61.r(oyr.p("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", cachedEngineId, "'"));
            return;
        }
        lrr lrrVar = this.host;
        FlutterEngine provideFlutterEngine = lrrVar.provideFlutterEngine(lrrVar.getContext());
        this.flutterEngine = provideFlutterEngine;
        if (provideFlutterEngine != null) {
            this.isFlutterEngineFromHost = true;
            return;
        }
        String cachedEngineGroupId = this.host.getCachedEngineGroupId();
        if (cachedEngineGroupId == null) {
            asr asrVar = this.engineGroup;
            if (asrVar == null) {
                Context context = this.host.getContext();
                HashSet hashSet = this.host.getFlutterShellArgs().a;
                asrVar = new asr(context, (String[]) hashSet.toArray(new String[hashSet.size()]));
            }
            zrr zrrVar = new zrr(this.host.getContext());
            zrrVar.c = false;
            zrrVar.w = this.host.shouldRestoreAndSaveState();
            a(zrrVar);
            this.flutterEngine = asrVar.a(zrrVar);
            this.isFlutterEngineFromHost = false;
            return;
        }
        if (bsr.b == null) {
            synchronized (bsr.class) {
                try {
                    if (bsr.b == null) {
                        bsr.b = new bsr(0);
                    }
                } finally {
                }
            }
        }
        asr asrVar2 = (asr) bsr.b.a.get(cachedEngineGroupId);
        if (asrVar2 == null) {
            ny61.r(oyr.p("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", cachedEngineGroupId, "'"));
            return;
        }
        zrr zrrVar2 = new zrr(this.host.getContext());
        a(zrrVar2);
        this.flutterEngine = asrVar2.a(zrrVar2);
        this.isFlutterEngineFromHost = false;
    }

    public void startBackGesture(BackEvent backEvent) {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.k.a.a("startBackGesture", ke4.a(backEvent), null);
        }
    }

    public void updateBackGestureProgress(BackEvent backEvent) {
        b();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.k.a.a("updateBackGestureProgress", ke4.a(backEvent), null);
        }
    }

    public void updateSystemUiOverlays() {
        yvc0 yvc0Var = this.platformPlugin;
        if (yvc0Var != null) {
            yvc0Var.b();
        }
    }
}
