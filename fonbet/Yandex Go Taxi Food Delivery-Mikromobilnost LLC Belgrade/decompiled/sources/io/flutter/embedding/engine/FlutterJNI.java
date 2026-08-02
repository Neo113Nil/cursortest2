package io.flutter.embedding.engine;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.AttachedSurfaceControl;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bgg;
import defpackage.bxc0;
import defpackage.ctr;
import defpackage.ddf;
import defpackage.dxc0;
import defpackage.dy31;
import defpackage.f7r0;
import defpackage.g7r0;
import defpackage.h7r0;
import defpackage.ixc0;
import defpackage.kbs;
import defpackage.lsr;
import defpackage.msr;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.poh;
import defpackage.q66;
import defpackage.qir;
import defpackage.qwc0;
import defpackage.rt5;
import defpackage.rvc0;
import defpackage.urr;
import defpackage.vfg;
import defpackage.vzt0;
import defpackage.wnb0;
import defpackage.xfg;
import defpackage.y5z;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.PlatformOverlayView;
import io.flutter.plugin.platform.d;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static msr asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private lsr accessibilityDelegate;
    private poh deferredComponentManager;
    private y5z localizationPlugin;
    private Long nativeShellHolderId;
    private rvc0 platformMessageHandler;
    private d platformViewsController;
    private dxc0 platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<urr> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<ctr> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    public static class a {
        public static FlutterJNI a() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j) {
        msr msrVar = asyncWaitForVsyncDelegate;
        if (msrVar != null) {
            ((io.flutter.view.d) msrVar).a(j);
        } else {
            ny61.r("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: ksr
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    FlutterJNI.lambda$decodeImage$1(j, imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e) {
            Log.e(TAG, "Failed to decode image", e);
            return null;
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        kbs.g("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        kbs.g("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        dy31.l(Thread.currentThread().getName(), "Methods marked with @UiThread must be executed on the main thread. Current thread: ");
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        rt5 rt5Var;
        rvc0 rvc0Var = this.platformMessageHandler;
        if (rvc0Var == null || (rt5Var = (rt5) ((bgg) rvc0Var).y.remove(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            rt5Var.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e);
        } catch (Exception e2) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i, String str, boolean z);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i, int i2);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j2, long j3);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j2, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j, long j2, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j2);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j2);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        Iterator<urr> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        lsr lsrVar = this.accessibilityDelegate;
        if (lsrVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ((AccessibilityBridge) ((ddf) lsrVar).b).updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        lsr lsrVar = this.accessibilityDelegate;
        if (lsrVar != null) {
            ddf ddfVar = (ddf) lsrVar;
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            ((AccessibilityBridge) ddfVar.b).updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(urr urrVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(urrVar);
    }

    public void addIsDisplayingFlutterUiListener(ctr ctrVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(ctrVar);
    }

    public void applyTransactions() {
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("");
            return;
        }
        ArrayList arrayList = dxc0Var.E;
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        for (int i = 0; i < arrayList.size(); i++) {
            transaction = transaction.merge((SurfaceControl.Transaction) arrayList.get(i));
        }
        transaction.apply();
        arrayList.clear();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale lookup;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i += 3) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            String str3 = strArr[i + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        y5z y5zVar = this.localizationPlugin;
        y5zVar.getClass();
        if (arrayList.isEmpty()) {
            lookup = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = y5zVar.b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale = locales.get(i2);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    StringBuilder v = oyr.v(language, "-");
                    v.append(locale.getScript());
                    language = v.toString();
                }
                if (!locale.getCountry().isEmpty()) {
                    StringBuilder v2 = oyr.v(language, "-");
                    v2.append(locale.getCountry());
                    language = v2.toString();
                }
                arrayList2.add(new Locale.LanguageRange(language));
                arrayList2.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList2.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            lookup = Locale.lookup(arrayList2, arrayList);
            if (lookup == null) {
                lookup = (Locale) arrayList.get(0);
            }
        }
        return lookup == null ? new String[0] : new String[]{lookup.getLanguage(), lookup.getCountry(), lookup.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        d dVar = this.platformViewsController;
        if (dVar == null) {
            kbs.g("platformViewsController must be set before attempting to position an overlay surface");
            return null;
        }
        dVar.getClass();
        PlatformOverlayView platformOverlayView = new PlatformOverlayView(dVar.w.getContext(), dVar.w.getWidth(), dVar.w.getHeight(), dVar.B);
        int i = dVar.I;
        dVar.I = i + 1;
        dVar.G.put(i, platformOverlayView);
        return new FlutterOverlaySurface(i, platformOverlayView.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("platformViewsController must be set before attempting to position an overlay surface");
            return null;
        }
        if (dxc0Var.G == null) {
            SurfaceControl.Builder builder = new SurfaceControl.Builder();
            builder.setBufferSize(dxc0Var.w.getWidth(), dxc0Var.w.getHeight());
            builder.setFormat(1);
            builder.setName("Flutter Overlay Surface");
            builder.setOpaque(false);
            builder.setHidden(false);
            SurfaceControl build = builder.build();
            rootSurfaceControl = dxc0Var.w.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            dxc0Var.G = new Surface(build);
            dxc0Var.H = build;
        }
        return new FlutterOverlaySurface(0, dxc0Var.G);
    }

    public SurfaceControl.Transaction createTransaction() {
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("");
            return null;
        }
        dxc0Var.getClass();
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        dxc0Var.E.add(transaction);
        return transaction;
    }

    public void deferredComponentInstallFailure(int i, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("platformViewsController must be set before attempting to destroy an overlay surface");
            return;
        }
        Surface surface = dxc0Var.G;
        if (surface != null) {
            surface.release();
            dxc0Var.G = null;
            dxc0Var.H = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        d dVar = this.platformViewsController;
        if (dVar != null) {
            dVar.e();
        } else {
            kbs.g("platformViewsController must be set before attempting to destroy an overlay surface");
        }
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
        }
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
        }
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = vzt0.a.b(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, action.value, byteBuffer, i2);
    }

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("");
            return;
        }
        ArrayList arrayList = dxc0Var.F;
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        for (int i = 0; i < arrayList.size(); i++) {
            transaction = transaction.merge((SurfaceControl.Transaction) arrayList.get(i));
        }
        arrayList.clear();
        dxc0Var.w.invalidate();
        rootSurfaceControl = dxc0Var.w.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(transaction);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f, int i) {
        f7r0 f7r0Var;
        DisplayMetrics displayMetrics;
        g7r0 g7r0Var = h7r0.b;
        ConcurrentLinkedQueue concurrentLinkedQueue = g7r0Var.a;
        if (g7r0Var.b == null) {
            g7r0Var.b = (f7r0) concurrentLinkedQueue.poll();
        }
        while (true) {
            f7r0Var = g7r0Var.b;
            if (f7r0Var == null || f7r0Var.a >= i) {
                break;
            }
            g7r0Var.b = (f7r0) concurrentLinkedQueue.poll();
        }
        if (f7r0Var != null) {
            if (f7r0Var.a != i) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i) + ", the oldest config is now: " + String.valueOf(g7r0Var.b.a));
            }
            displayMetrics = f7r0Var != null ? f7r0Var.b : null;
            if (displayMetrics == null) {
                return TypedValue.applyDimension(2, f, displayMetrics) / displayMetrics.density;
            }
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i) + ", which can't be found.");
            return -1.0f;
        }
        Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i) + ", after exhausting the queue.");
        f7r0Var = null;
        if (f7r0Var != null) {
        }
        if (displayMetrics == null) {
        }
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i, long j) {
        xfg xfgVar;
        boolean z;
        rvc0 rvc0Var = this.platformMessageHandler;
        if (rvc0Var == null) {
            nativeCleanupMessageData(j);
            return;
        }
        bgg bggVar = (bgg) rvc0Var;
        synchronized (bggVar.w) {
            try {
                xfgVar = (xfg) bggVar.b.get(str);
                z = bggVar.x.get() && xfgVar == null;
                if (z) {
                    if (!bggVar.c.containsKey(str)) {
                        bggVar.c.put(str, new LinkedList());
                    }
                    ((List) bggVar.c.get(str)).add(new vfg(j, byteBuffer, i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        bggVar.a(str, xfgVar, byteBuffer, i, j);
    }

    public void hideOverlaySurface2() {
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("platformViewsController must be set before attempting to destroy an overlay surface");
        } else {
            if (dxc0Var.H == null) {
                return;
            }
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            transaction.setVisibility(dxc0Var.H, false);
            transaction.apply();
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i) {
        nativeInit(context, strArr, str, str2, str3, j, i);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        FlutterJNI flutterJNI;
        if (!byteBuffer.isDirect()) {
            ny61.g("Expected a direct ByteBuffer.");
            return;
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                flutterJNI = this;
                try {
                    flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    flutterJNI.shellHolderLock.readLock().unlock();
                    throw th2;
                }
            } else {
                flutterJNI = this;
            }
            flutterJNI.shellHolderLock.readLock().unlock();
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary(Context context) {
        qir qirVar = new qir(7);
        q66 q66Var = new q66();
        q66Var.x = qirVar;
        q66Var.h(context, PluginErrorDetails.Platform.FLUTTER);
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        d dVar = this.platformViewsController;
        if (dVar == null) {
            kbs.g("platformViewsController must be set before attempting to begin the frame");
        } else {
            dVar.L.clear();
            dVar.M.clear();
        }
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        d dVar = this.platformViewsController;
        if (dVar == null) {
            kbs.g("platformViewsController must be set before attempting to position an overlay surface");
            return;
        }
        SparseArray sparseArray = dVar.G;
        if (sparseArray.get(i) == null) {
            ny61.r(oyr.j(i, "The overlay surface (id:", ") doesn't exist"));
            return;
        }
        if (dVar.K && !dVar.J) {
            dVar.w.convertToImageView();
            dVar.J = true;
        }
        View view = (PlatformOverlayView) sparseArray.get(i);
        if (view.getParent() == null) {
            dVar.w.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        dVar.L.add(Integer.valueOf(i));
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        d dVar = this.platformViewsController;
        if (dVar == null) {
            kbs.g("platformViewsController must be set before attempting to position a platform view");
            return;
        }
        if (dVar.K && !dVar.J) {
            dVar.w.convertToImageView();
            dVar.J = true;
        }
        SparseArray sparseArray = dVar.F;
        SparseArray sparseArray2 = dVar.E;
        qwc0 qwc0Var = (qwc0) sparseArray2.get(i);
        if (qwc0Var == null) {
            return;
        }
        int i8 = 0;
        if (sparseArray.get(i) == null) {
            View view = qwc0Var.getView();
            if (view == null) {
                ny61.r("PlatformView#getView() returned null, but an Android view reference was expected.");
                return;
            }
            if (view.getParent() != null) {
                ny61.r("The Android view returned from PlatformView#getView() was already added to a parent view.");
                return;
            }
            Activity activity = dVar.c;
            FlutterMutatorView flutterMutatorView = new FlutterMutatorView(activity, activity.getResources().getDisplayMetrics().density, dVar.b);
            flutterMutatorView.setOnDescendantFocusChangeListener(new bxc0(dVar, i, i8));
            sparseArray.put(i, flutterMutatorView);
            view.setImportantForAccessibility(4);
            flutterMutatorView.addView(view);
            dVar.w.addView(flutterMutatorView);
        }
        FlutterMutatorView flutterMutatorView2 = (FlutterMutatorView) sparseArray.get(i);
        flutterMutatorView2.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
        flutterMutatorView2.setVisibility(0);
        flutterMutatorView2.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View view2 = ((qwc0) sparseArray2.get(i)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
            view2.bringToFront();
        }
        dVar.M.add(Integer.valueOf(i));
    }

    public void onDisplayPlatformView2(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("platformViewsController must be set before attempting to position a platform view");
            return;
        }
        SparseArray sparseArray = dxc0Var.C;
        SparseArray sparseArray2 = dxc0Var.B;
        qwc0 qwc0Var = (qwc0) sparseArray2.get(i);
        if (qwc0Var == null) {
            return;
        }
        if (sparseArray.get(i) == null) {
            View view = qwc0Var.getView();
            if (view == null) {
                ny61.r("PlatformView#getView() returned null, but an Android view reference was expected.");
                return;
            }
            if (view.getParent() != null) {
                ny61.r("The Android view returned from PlatformView#getView() was already added to a parent view.");
                return;
            }
            Activity activity = dxc0Var.c;
            FlutterMutatorView flutterMutatorView = new FlutterMutatorView(activity, activity.getResources().getDisplayMetrics().density, dxc0Var.b);
            flutterMutatorView.setOnDescendantFocusChangeListener(new bxc0(dxc0Var, i, 1));
            sparseArray.put(i, flutterMutatorView);
            view.setImportantForAccessibility(4);
            flutterMutatorView.addView(view);
            dxc0Var.w.addView(flutterMutatorView);
        }
        FlutterMutatorView flutterMutatorView2 = (FlutterMutatorView) sparseArray.get(i);
        flutterMutatorView2.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
        flutterMutatorView2.setVisibility(0);
        flutterMutatorView2.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View view2 = ((qwc0) sparseArray2.get(i)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
            view2.bringToFront();
        }
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        d dVar = this.platformViewsController;
        if (dVar == null) {
            kbs.g("platformViewsController must be set before attempting to end the frame");
            return;
        }
        boolean z = false;
        if (dVar.J && dVar.M.isEmpty()) {
            dVar.J = false;
            dVar.w.revertImageView(new wnb0(6, dVar));
        } else {
            if (dVar.J && dVar.w.acquireLatestImageViewFrame()) {
                z = true;
            }
            dVar.i(z);
        }
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<ctr> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<ctr> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j2, long j3) {
        nativeOnVsync(j, j2, j3);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer), z);
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(urr urrVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(urrVar);
    }

    public void removeIsDisplayingFlutterUiListener(ctr ctrVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(ctrVar);
    }

    public void requestDartDeferredLibrary(int i) {
        poh pohVar = this.deferredComponentManager;
        if (pohVar != null) {
            ((ixc0) pohVar).b(i, null);
        } else {
            Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(lsr lsrVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = lsrVar;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(msr msrVar) {
        asyncWaitForVsyncDelegate = msrVar;
    }

    public void setDeferredComponentManager(poh pohVar) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = pohVar;
        if (pohVar != null) {
            ((ixc0) pohVar).b = this;
        }
    }

    public void setLocalizationPlugin(y5z y5zVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = y5zVar;
    }

    public void setPlatformMessageHandler(rvc0 rvc0Var) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = rvc0Var;
    }

    public void setPlatformViewsController(d dVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = dVar;
    }

    public void setPlatformViewsController2(dxc0 dxc0Var) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = dxc0Var;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z);
        }
    }

    public void setSemanticsEnabledInNative(boolean z) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("platformViewsController must be set before attempting to destroy an overlay surface");
        } else {
            if (dxc0Var.H == null) {
                return;
            }
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            transaction.setVisibility(dxc0Var.H, true);
            transaction.apply();
        }
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l = nativeSpawn.nativeShellHolderId;
        if ((l == null || l.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        ny61.r("Failed to spawn new JNI connected shell from existing shell.");
        return null;
    }

    public void swapTransactions() {
        dxc0 dxc0Var = this.platformViewsController2;
        if (dxc0Var == null) {
            kbs.g("");
            return;
        }
        synchronized (dxc0Var) {
            try {
                dxc0Var.F.clear();
                for (int i = 0; i < dxc0Var.E.size(); i++) {
                    dxc0Var.F.add((SurfaceControl.Transaction) dxc0Var.E.get(i));
                }
                dxc0Var.E.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i, float f, float f2, float f3) {
        displayWidth = f;
        displayHeight = f2;
        displayDensity = f3;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i, action, null);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }
}
