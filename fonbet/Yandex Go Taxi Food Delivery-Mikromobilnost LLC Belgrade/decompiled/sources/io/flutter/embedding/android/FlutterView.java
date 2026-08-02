package io.flutter.embedding.android;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import defpackage.a441;
import defpackage.ayi0;
import defpackage.bg1;
import defpackage.ce5;
import defpackage.cpy0;
import defpackage.ctr;
import defpackage.db30;
import defpackage.dpy0;
import defpackage.dtr;
import defpackage.dxc0;
import defpackage.e9e;
import defpackage.eb30;
import defpackage.eg;
import defpackage.f7r0;
import defpackage.ftr;
import defpackage.g7r0;
import defpackage.g7u;
import defpackage.h7r0;
import defpackage.hi6;
import defpackage.hwo0;
import defpackage.ikx;
import defpackage.jkx;
import defpackage.jln;
import defpackage.jrr;
import defpackage.k9b;
import defpackage.kbs;
import defpackage.l8x;
import defpackage.lw31;
import defpackage.m2v;
import defpackage.m651;
import defpackage.mf1;
import defpackage.n651;
import defpackage.ny61;
import defpackage.o651;
import defpackage.oy80;
import defpackage.pg;
import defpackage.qgp0;
import defpackage.qwc0;
import defpackage.rxr;
import defpackage.tt5;
import defpackage.unr0;
import defpackage.usr;
import defpackage.v751;
import defpackage.vc2;
import defpackage.y5z;
import defpackage.ysr;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState;
import io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType;
import io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.platform.PlatformViewWrapper;
import io.flutter.view.AccessibilityBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class FlutterView extends FrameLayout implements db30, ikx {
    private static final String GBOARD_PACKAGE_NAME = "com.google.android.inputmethod.latin";
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private vc2 androidTouchProcessor;
    private ftr delegate;
    private FlutterEngine flutterEngine;
    private final Set<dtr> flutterEngineAttachmentListeners;
    private FlutterImageView flutterImageView;
    private FlutterSurfaceView flutterSurfaceView;
    private FlutterTextureView flutterTextureView;
    private final ctr flutterUiDisplayListener;
    private final Set<ctr> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;
    private jkx keyboardManager;
    private y5z localizationPlugin;
    private eb30 mouseCursorPlugin;
    private final eg onAccessibilityChangeListener;
    private ayi0 previousRenderSurface;
    ayi0 renderSurface;
    private qgp0 scribePlugin;
    private SpellCheckPlugin spellCheckPlugin;
    private final ContentObserver systemSettingsObserver;
    private io.flutter.plugin.editing.c textInputPlugin;
    private TextServicesManager textServicesManager;
    private final ysr viewportMetrics;
    private e9e windowInfoListener;
    private m651 windowInfoRepo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ZeroSides {
        private static final /* synthetic */ ZeroSides[] $VALUES;
        public static final ZeroSides BOTH;
        public static final ZeroSides LEFT;
        public static final ZeroSides NONE;
        public static final ZeroSides RIGHT;

        static {
            ZeroSides zeroSides = new ZeroSides(JCP.RAW_PREFIX, 0);
            NONE = zeroSides;
            ZeroSides zeroSides2 = new ZeroSides("LEFT", 1);
            LEFT = zeroSides2;
            ZeroSides zeroSides3 = new ZeroSides("RIGHT", 2);
            RIGHT = zeroSides3;
            ZeroSides zeroSides4 = new ZeroSides("BOTH", 3);
            BOTH = zeroSides4;
            $VALUES = new ZeroSides[]{zeroSides, zeroSides2, zeroSides3, zeroSides4};
        }

        public static ZeroSides valueOf(String str) {
            return (ZeroSides) Enum.valueOf(ZeroSides.class, str);
        }

        public static ZeroSides[] values() {
            return (ZeroSides[]) $VALUES.clone();
        }
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new ysr();
        this.onAccessibilityChangeListener = new jln(21, this);
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new jrr(2, this);
        this.delegate = new ftr();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else {
            if (renderMode != RenderMode.texture) {
                kbs.f(renderMode, "RenderMode not supported with this constructor: ");
                throw null;
            }
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        }
        init();
    }

    private View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        Method declaredMethod;
        try {
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, null).equals(Integer.valueOf(i))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i2));
                if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                    return findViewByAccessibilityIdRootedAtCurrentView;
                }
                i2++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        FlutterSurfaceView flutterSurfaceView = this.flutterSurfaceView;
        if (flutterSurfaceView != null) {
            addView(flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = this.flutterTextureView;
            if (flutterTextureView != null) {
                addView(flutterTextureView);
            } else {
                addView(this.flutterImageView);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseImageView() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z, boolean z2) {
        boolean z3 = false;
        if (this.flutterEngine.b.a.getIsSoftwareRenderingEnabled()) {
            setWillNotDraw(false);
            return;
        }
        if (!z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    private void sendViewportMetricsToFlutter() {
        if (isAttachedToFlutterEngine()) {
            this.viewportMetrics.a = getResources().getDisplayMetrics().density;
            this.viewportMetrics.p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            io.flutter.embedding.engine.renderer.f fVar = this.flutterEngine.b;
            ysr ysrVar = this.viewportMetrics;
            fVar.getClass();
            int i = ysrVar.b;
            ArrayList arrayList = ysrVar.r;
            ArrayList arrayList2 = ysrVar.q;
            if (i <= 0 || ysrVar.c <= 0 || ysrVar.a <= 0.0f) {
                return;
            }
            arrayList2.size();
            arrayList.size();
            int size = arrayList.size() + arrayList2.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                usr usrVar = (usr) arrayList2.get(i2);
                int i3 = i2 * 4;
                Rect rect = usrVar.a;
                iArr[i3] = rect.left;
                iArr[i3 + 1] = rect.top;
                iArr[i3 + 2] = rect.right;
                iArr[i3 + 3] = rect.bottom;
                iArr2[i2] = usrVar.b.encodedValue;
                iArr3[i2] = usrVar.c.encodedValue;
            }
            int size2 = arrayList2.size() * 4;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                usr usrVar2 = (usr) arrayList.get(i4);
                int i5 = (i4 * 4) + size2;
                Rect rect2 = usrVar2.a;
                iArr[i5] = rect2.left;
                iArr[i5 + 1] = rect2.top;
                iArr[i5 + 2] = rect2.right;
                iArr[i5 + 3] = rect2.bottom;
                iArr2[arrayList2.size() + i4] = usrVar2.b.encodedValue;
                iArr3[arrayList2.size() + i4] = usrVar2.c.encodedValue;
            }
            fVar.a.setViewportMetrics(ysrVar.a, ysrVar.b, ysrVar.c, ysrVar.d, ysrVar.e, ysrVar.f, ysrVar.g, ysrVar.h, ysrVar.i, ysrVar.j, ysrVar.k, ysrVar.l, ysrVar.m, ysrVar.n, ysrVar.o, ysrVar.p, iArr, iArr2, iArr3);
        }
    }

    public boolean acquireLatestImageViewFrame() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            return flutterImageView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(dtr dtrVar) {
        this.flutterEngineAttachmentListeners.add(dtrVar);
    }

    public void addOnFirstFrameRenderedListener(ctr ctrVar) {
        this.flutterUiDisplayListeners.add(ctrVar);
    }

    public void attachOverlaySurfaceToRender(FlutterImageView flutterImageView) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView.attachToRenderer(flutterEngine.b);
        }
    }

    public void attachToFlutterEngine(FlutterEngine flutterEngine) {
        Objects.toString(flutterEngine);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                return;
            } else {
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine;
        io.flutter.embedding.engine.renderer.f fVar = flutterEngine.b;
        this.isFlutterUiDisplayed = fVar.d;
        this.renderSurface.attachToRenderer(fVar);
        ctr ctrVar = this.flutterUiDisplayListener;
        fVar.a.addIsDisplayingFlutterUiListener(ctrVar);
        if (fVar.d) {
            ctrVar.onFlutterUiDisplayed();
        }
        this.mouseCursorPlugin = new eb30(this, this.flutterEngine.i);
        FlutterEngine flutterEngine2 = this.flutterEngine;
        this.textInputPlugin = new io.flutter.plugin.editing.c(this, flutterEngine2.s, flutterEngine2.n, flutterEngine2.t, flutterEngine2.u);
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.textServicesManager = textServicesManager;
            this.spellCheckPlugin = new SpellCheckPlugin(textServicesManager, this.flutterEngine.q);
        } catch (Exception unused) {
            Log.e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.scribePlugin = new qgp0(this, this.textInputPlugin.b, this.flutterEngine.n);
        this.localizationPlugin = this.flutterEngine.e;
        this.keyboardManager = new jkx(this);
        this.androidTouchProcessor = new vc2(this.flutterEngine.b, false);
        pg pgVar = flutterEngine.f;
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        ContentResolver contentResolver = getContext().getContentResolver();
        FlutterEngine flutterEngine3 = this.flutterEngine;
        io.flutter.plugin.platform.d dVar = flutterEngine3.t;
        dxc0 dxc0Var = flutterEngine3.u;
        oy80 oy80Var = new oy80();
        oy80Var.b = dVar;
        oy80Var.c = dxc0Var;
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, pgVar, accessibilityManager, contentResolver, oy80Var);
        this.accessibilityBridge = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        FlutterEngine flutterEngine4 = this.flutterEngine;
        io.flutter.plugin.platform.d dVar2 = flutterEngine4.t;
        dVar2.B.a = this.accessibilityBridge;
        dVar2.b = new vc2(flutterEngine4.b, true);
        FlutterEngine flutterEngine5 = this.flutterEngine;
        dxc0 dxc0Var2 = flutterEngine5.u;
        dxc0Var2.A.a = this.accessibilityBridge;
        dxc0Var2.b = new vc2(flutterEngine5.b, true);
        this.textInputPlugin.b.restartInput(this);
        sendUserSettingsToFlutter();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
        sendViewportMetricsToFlutter();
        io.flutter.plugin.platform.d dVar3 = flutterEngine.t;
        SparseArray sparseArray = dVar3.E;
        SparseArray sparseArray2 = dVar3.F;
        SparseArray sparseArray3 = dVar3.H;
        dVar3.w = this;
        for (int i = 0; i < sparseArray3.size(); i++) {
            dVar3.w.addView((PlatformViewWrapper) sparseArray3.valueAt(i));
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            dVar3.w.addView((FlutterMutatorView) sparseArray2.valueAt(i2));
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            ((qwc0) sparseArray.valueAt(i3)).onFlutterViewAttached(dVar3.w);
        }
        dxc0 dxc0Var3 = flutterEngine.u;
        SparseArray sparseArray4 = dxc0Var3.B;
        SparseArray sparseArray5 = dxc0Var3.C;
        dxc0Var3.w = this;
        for (int i4 = 0; i4 < sparseArray5.size(); i4++) {
            dxc0Var3.w.addView((FlutterMutatorView) sparseArray5.valueAt(i4));
        }
        for (int i5 = 0; i5 < sparseArray4.size(); i5++) {
            ((qwc0) sparseArray4.valueAt(i5)).onFlutterViewAttached(dxc0Var3.w);
        }
        Iterator<dtr> it = this.flutterEngineAttachmentListeners.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.textInputPlugin.a(sparseArray);
    }

    public ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return ZeroSides.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = flutterEngine.t.D;
        if (view == null || !hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null) {
            FlutterImageView createImageView = createImageView();
            this.flutterImageView = createImageView;
            addView(createImageView);
        } else {
            flutterImageView.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        FlutterImageView flutterImageView2 = this.flutterImageView;
        this.renderSurface = flutterImageView2;
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView2.attachToRenderer(flutterEngine.b);
        }
    }

    public FlutterImageView createImageView() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    public m651 createWindowInfoRepo() {
        try {
            n651 n651Var = o651.E4;
            Context context = getContext();
            n651Var.getClass();
            return new m651(new a441(n651.a(context)));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        Objects.toString(this.flutterEngine);
        if (isAttachedToFlutterEngine()) {
            Iterator<dtr> it = this.flutterEngineAttachmentListeners.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
            getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
            io.flutter.plugin.platform.d dVar = this.flutterEngine.t;
            SparseArray sparseArray = dVar.E;
            SparseArray sparseArray2 = dVar.F;
            SparseArray sparseArray3 = dVar.H;
            for (int i = 0; i < sparseArray3.size(); i++) {
                dVar.w.removeView((PlatformViewWrapper) sparseArray3.valueAt(i));
            }
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                dVar.w.removeView((FlutterMutatorView) sparseArray2.valueAt(i2));
            }
            dVar.e();
            SparseArray sparseArray4 = dVar.G;
            if (dVar.w == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i3 = 0; i3 < sparseArray4.size(); i3++) {
                    dVar.w.removeView((View) sparseArray4.valueAt(i3));
                }
                sparseArray4.clear();
            }
            dVar.w = null;
            dVar.J = false;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                ((qwc0) sparseArray.valueAt(i4)).onFlutterViewDetached();
            }
            dxc0 dxc0Var = this.flutterEngine.u;
            SparseArray sparseArray5 = dxc0Var.B;
            SparseArray sparseArray6 = dxc0Var.C;
            for (int i5 = 0; i5 < sparseArray6.size(); i5++) {
                dxc0Var.w.removeView((FlutterMutatorView) sparseArray6.valueAt(i5));
            }
            Surface surface = dxc0Var.G;
            if (surface != null) {
                surface.release();
                dxc0Var.G = null;
                dxc0Var.H = null;
            }
            dxc0Var.w = null;
            for (int i6 = 0; i6 < sparseArray5.size(); i6++) {
                ((qwc0) sparseArray5.valueAt(i6)).onFlutterViewDetached();
            }
            this.flutterEngine.t.h();
            this.flutterEngine.u.h();
            this.accessibilityBridge.release();
            this.accessibilityBridge = null;
            this.textInputPlugin.b.restartInput(this);
            this.textInputPlugin.d();
            this.keyboardManager.b.size();
            SpellCheckPlugin spellCheckPlugin = this.spellCheckPlugin;
            if (spellCheckPlugin != null) {
                spellCheckPlugin.destroy();
            }
            eb30 eb30Var = this.mouseCursorPlugin;
            if (eb30Var != null) {
                eb30Var.b.a = null;
            }
            io.flutter.embedding.engine.renderer.f fVar = this.flutterEngine.b;
            this.isFlutterUiDisplayed = false;
            fVar.a.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
            fVar.f();
            fVar.a.setSemanticsEnabled(false);
            ayi0 ayi0Var = this.previousRenderSurface;
            if (ayi0Var != null && this.renderSurface == this.flutterImageView) {
                this.renderSurface = ayi0Var;
            }
            this.renderSurface.detachFromRenderer();
            releaseImageView();
            this.previousRenderSurface = null;
            this.flutterEngine = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    @Override // defpackage.ikx
    public tt5 getBinaryMessenger() {
        return this.flutterEngine.c;
    }

    public FlutterImageView getCurrentImageSurface() {
        return this.flutterImageView;
    }

    @Override // defpackage.db30
    public PointerIcon getSystemPointerIcon(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public ysr getViewportMetrics() {
        return this.viewportMetrics;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.b == this.renderSurface.getAttachedRenderer();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int captionBar;
        List boundingRects;
        Window window;
        int systemBars;
        Insets insets;
        int ime;
        Insets insets2;
        int systemGestures;
        Insets insets3;
        Insets waterfallInsets;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            ysr ysrVar = this.viewportMetrics;
            ysrVar.l = systemGestureInsets.top;
            ysrVar.m = systemGestureInsets.right;
            ysrVar.n = systemGestureInsets.bottom;
            ysrVar.o = systemGestureInsets.left;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            ysr ysrVar2 = this.viewportMetrics;
            ysrVar2.d = insets.top;
            ysrVar2.e = insets.right;
            ysrVar2.f = insets.bottom;
            ysrVar2.g = insets.left;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            ysr ysrVar3 = this.viewportMetrics;
            ysrVar3.h = insets2.top;
            ysrVar3.i = insets2.right;
            ysrVar3.j = insets2.bottom;
            ysrVar3.k = insets2.left;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            ysr ysrVar4 = this.viewportMetrics;
            ysrVar4.l = insets3.top;
            ysrVar4.m = insets3.right;
            ysrVar4.n = insets3.bottom;
            ysrVar4.o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                ysr ysrVar5 = this.viewportMetrics;
                ysrVar5.d = Math.max(Math.max(ysrVar5.d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                ysr ysrVar6 = this.viewportMetrics;
                ysrVar6.e = Math.max(Math.max(ysrVar6.e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                ysr ysrVar7 = this.viewportMetrics;
                ysrVar7.f = Math.max(Math.max(ysrVar7.f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                ysr ysrVar8 = this.viewportMetrics;
                ysrVar8.g = Math.max(Math.max(ysrVar8.g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z2) {
                zeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.d = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.e = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.viewportMetrics.f = (z2 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.viewportMetrics.g = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            ysr ysrVar9 = this.viewportMetrics;
            ysrVar9.h = 0;
            ysrVar9.i = 0;
            ysrVar9.j = guessBottomKeyboardInset(windowInsets);
            this.viewportMetrics.k = 0;
        }
        ArrayList arrayList = new ArrayList();
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        if (displayCutout2 != null) {
            for (Rect rect : displayCutout2.getBoundingRects()) {
                rect.toString();
                arrayList.add(new usr(rect, FlutterRenderer$DisplayFeatureType.CUTOUT, FlutterRenderer$DisplayFeatureState.UNKNOWN));
            }
        }
        ArrayList arrayList2 = this.viewportMetrics.r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            ftr ftrVar = this.delegate;
            Context context = getContext();
            ysr ysrVar10 = this.viewportMetrics;
            ftrVar.getClass();
            Activity b = lw31.b(context);
            WindowInsets windowInsets2 = null;
            if (b != null && (window = b.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i2 = ysrVar10.d;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i2 = Math.max(i2, ((Rect) it.next()).bottom);
            }
            ysrVar10.d = i2;
        }
        int i3 = this.viewportMetrics.d;
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        Activity b = lw31.b(getContext());
        m651 m651Var = this.windowInfoRepo;
        if (m651Var == null || b == null) {
            return;
        }
        this.windowInfoListener = new k9b(5, this);
        Executor mainExecutor = getContext().getMainExecutor();
        e9e e9eVar = this.windowInfoListener;
        a441 a441Var = m651Var.a;
        ((androidx.window.java.core.a) a441Var.c).a(mainExecutor, e9eVar, ((androidx.window.layout.a) a441Var.b).a(b));
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            this.localizationPlugin.b(configuration);
            sendUserSettingsToFlutter();
            lw31.a(getContext(), this.flutterEngine);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.c(this, this.keyboardManager, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        e9e e9eVar;
        m651 m651Var = this.windowInfoRepo;
        if (m651Var != null && (e9eVar = this.windowInfoListener) != null) {
            androidx.window.java.core.a aVar = (androidx.window.java.core.a) m651Var.a.c;
            LinkedHashMap linkedHashMap = aVar.b;
            ReentrantLock reentrantLock = aVar.a;
            reentrantLock.lock();
            try {
                l8x l8xVar = (l8x) linkedHashMap.get(e9eVar);
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.windowInfoListener = null;
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine()) {
            vc2 vc2Var = this.androidTouchProcessor;
            Context context = getContext();
            vc2Var.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z) {
                int b = vc2.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                vc2Var.a(motionEvent, motionEvent.getActionIndex(), b, 0, vc2.e, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    ny61.f("Packet position is not on field boundary.");
                    return false;
                }
                vc2Var.a.a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        io.flutter.plugin.editing.c cVar = this.textInputPlugin;
        if (cVar.h != null) {
            String str = (String) cVar.g.j.b;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < cVar.h.size(); i2++) {
                int keyAt = cVar.h.keyAt(i2);
                hwo0 hwo0Var = ((cpy0) cVar.h.valueAt(i2)).j;
                if (hwo0Var != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) hwo0Var.c;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) hwo0Var.x;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = cVar.n) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((dpy0) hwo0Var.w).a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), cVar.n.height());
                        newChild.setAutofillValue(AutofillValue.forText(cVar.i));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ysr ysrVar = this.viewportMetrics;
        ysrVar.b = i;
        ysrVar.c = i2;
        sendViewportMetricsToFlutter();
    }

    @Override // defpackage.ikx
    public boolean onTextInputKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        io.flutter.plugin.editing.c cVar = this.textInputPlugin;
        if (!cVar.b.isAcceptingText() || (inputConnection = cVar.k) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.androidTouchProcessor.c(motionEvent, vc2.e);
        return true;
    }

    @Override // defpackage.ikx
    public void redispatch(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void removeFlutterEngineAttachmentListener(dtr dtrVar) {
        this.flutterEngineAttachmentListeners.remove(dtrVar);
    }

    public void removeOnFirstFrameRenderedListener(ctr ctrVar) {
        this.flutterUiDisplayListeners.remove(ctrVar);
    }

    public void revertImageView(Runnable runnable) {
        ayi0 ayi0Var;
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null || (ayi0Var = this.previousRenderSurface) == null) {
            return;
        }
        this.renderSurface = ayi0Var;
        this.previousRenderSurface = null;
        io.flutter.embedding.engine.renderer.f fVar = this.flutterEngine.b;
        if (fVar == null) {
            flutterImageView.detachFromRenderer();
            releaseImageView();
            runnable.run();
        } else {
            ayi0Var.resume();
            d dVar = new d(this, fVar, runnable);
            fVar.a.addIsDisplayingFlutterUiListener(dVar);
            if (fVar.d) {
                dVar.onFlutterUiDisplayed();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendUserSettingsToFlutter() {
        boolean z;
        m2v m2vVar;
        HashMap hashMap;
        List enabledSpellCheckerInfos;
        boolean z2;
        boolean isSpellCheckerEnabled;
        SettingsChannel$PlatformBrightness settingsChannel$PlatformBrightness = (getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel$PlatformBrightness.dark : SettingsChannel$PlatformBrightness.light;
        TextServicesManager textServicesManager = this.textServicesManager;
        int i = 1;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals(GBOARD_PACKAGE_NAME)) {
                        z2 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.textServicesManager.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z = true;
            m2vVar = this.flutterEngine.p.a;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            hashMap.put("platformBrightness", settingsChannel$PlatformBrightness.name);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            if (Build.VERSION.SDK_INT >= 34 || displayMetrics == null) {
                m2vVar.z(hashMap, null);
            }
            f7r0 f7r0Var = new f7r0(displayMetrics);
            g7r0 g7r0Var = h7r0.b;
            g7r0Var.a.add(f7r0Var);
            f7r0 f7r0Var2 = g7r0Var.c;
            g7r0Var.c = f7r0Var;
            ce5 ce5Var = f7r0Var2 != null ? new ce5(i, g7r0Var, f7r0Var2) : null;
            hashMap.put("configurationId", Integer.valueOf(f7r0Var.a));
            m2vVar.z(hashMap, ce5Var);
            return;
        }
        z = false;
        m2vVar = this.flutterEngine.p.a;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        hashMap.put("platformBrightness", settingsChannel$PlatformBrightness.name);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        m2vVar.z(hashMap, null);
    }

    public void setDelegate(ftr ftrVar) {
        this.delegate = ftrVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ayi0 ayi0Var = this.renderSurface;
        if (ayi0Var instanceof FlutterSurfaceView) {
            ((FlutterSurfaceView) ayi0Var).setVisibility(i);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(v751 v751Var) {
        mf1 mf1Var = mf1.D;
        List<rxr> list = v751Var.a;
        ArrayList arrayList = new ArrayList();
        for (rxr rxrVar : list) {
            ((g7u) rxrVar).a.c().toString();
            g7u g7uVar = (g7u) rxrVar;
            hi6 hi6Var = g7uVar.a;
            FlutterRenderer$DisplayFeatureType flutterRenderer$DisplayFeatureType = ((hi6Var.b() == 0 || hi6Var.a() == 0) ? mf1.C : mf1Var) == mf1Var ? FlutterRenderer$DisplayFeatureType.HINGE : FlutterRenderer$DisplayFeatureType.FOLD;
            bg1 bg1Var = g7uVar.c;
            arrayList.add(new usr(hi6Var.c(), flutterRenderer$DisplayFeatureType, bg1Var == bg1.B ? FlutterRenderer$DisplayFeatureState.POSTURE_FLAT : bg1Var == bg1.C ? FlutterRenderer$DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer$DisplayFeatureState.UNKNOWN));
        }
        ArrayList arrayList2 = this.viewportMetrics.q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        sendViewportMetricsToFlutter();
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new ysr();
        this.onAccessibilityChangeListener = new jln(21, this);
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new jrr(2, this);
        this.delegate = new ftr();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else if (renderMode == RenderMode.texture) {
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        } else {
            kbs.f(renderMode, "RenderMode not supported with this constructor: ");
            throw null;
        }
        init();
    }

    @Deprecated
    public FlutterView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
    }

    public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView) {
        this(context, (AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(Context context, FlutterTextureView flutterTextureView) {
        this(context, (AttributeSet) null, flutterTextureView);
    }

    public FlutterView(Context context, FlutterImageView flutterImageView) {
        this(context, (AttributeSet) null, flutterImageView);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new ysr();
        this.onAccessibilityChangeListener = new jln(21, this);
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new jrr(2, this);
        this.delegate = new ftr();
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new ysr();
        this.onAccessibilityChangeListener = new jln(21, this);
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new jrr(2, this);
        this.delegate = new ftr();
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = flutterTextureView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterImageView flutterImageView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new ysr();
        this.onAccessibilityChangeListener = new jln(21, this);
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new jrr(2, this);
        this.delegate = new ftr();
        this.flutterImageView = flutterImageView;
        this.renderSurface = flutterImageView;
        init();
    }
}
