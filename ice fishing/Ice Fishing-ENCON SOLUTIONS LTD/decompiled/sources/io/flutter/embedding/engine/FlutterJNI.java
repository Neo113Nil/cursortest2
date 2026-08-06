package io.flutter.embedding.engine;

import A1.C0015p;
import F.C0038n;
import J.g;
import P0.AbstractActivityC0072e;
import P0.AbstractC0068a;
import P0.AbstractC0076i;
import P0.C0077j;
import P0.s;
import P0.t;
import Q0.b;
import Q0.k;
import Q0.l;
import R0.j;
import S0.a;
import T0.c;
import T0.d;
import Z0.m;
import a1.C0098n;
import a1.InterfaceC0089e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import b1.C0130a;
import f1.C0163N;
import g0.C0193a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.e;
import io.flutter.view.f;
import io.flutter.view.h;
import io.flutter.view.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import u0.AbstractC1050a;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private a deferredComponentManager;
    private C0130a localizationPlugin;
    private Long nativeShellHolderId;
    private j platformMessageHandler;
    private io.flutter.plugin.platform.k platformViewsController;
    private io.flutter.plugin.platform.j platformViewsController2;
    private m settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.b bVar = (io.flutter.view.b) lVar;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        N1.l lVar2 = (N1.l) bVar.f7887a;
        r rVar = (r) lVar2.f1219c;
        if (rVar != null) {
            rVar.f8011a = j2;
            lVar2.f1219c = null;
        } else {
            rVar = new r(lVar2, j2);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        T0.b bVar;
        C.j jVar = 0;
        jVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Q0.j jVar2 = new Q0.j(j2);
        d dVar = new d();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i2 = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            dVar.f1798d = options.outMimeType;
            dVar.f1800f = options.outHeight;
            dVar.f1801g = options.outWidth;
        } catch (Exception e2) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(dVar.f1798d)) {
            try {
                c cVar = new c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                AbstractC1050a.x(dVar, mediaExtractor);
            } catch (Exception e3) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(jVar2.f1553a, dVar.f1795a, dVar.f1796b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    J.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f795f);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f1799e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e4) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(dVar.f1798d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                bVar = new T0.b(jVar, 0);
            } else if (i3 < 36) {
                bVar = new T0.b(jVar, 1);
            }
            jVar = bVar;
        }
        if (jVar == 0) {
            jVar = new C.j(21, jVar2);
        }
        return jVar.k(byteBuffer, dVar);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer) {
        InterfaceC0089e interfaceC0089e;
        j jVar = this.platformMessageHandler;
        if (jVar == null || (interfaceC0089e = (InterfaceC0089e) ((R0.i) jVar).f1735f.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            interfaceC0089e.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e2) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e2;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e2);
        } catch (Exception e3) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j2);

    private native void nativeDeferredComponentInstallFailure(int i2, String str, boolean z2);

    private native void nativeDestroy(long j2);

    private native void nativeDispatchEmptyPlatformMessage(long j2, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j2, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j2, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i2);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i2);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i2);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i2);

    private native Bitmap nativeGetBitmap(long j2);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j2, int i2, int i3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j2, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j2, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeIsSurfaceControlEnabled(long j2);

    private native void nativeLoadDartDeferredLibrary(long j2, int i2, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j2);

    private native void nativeMarkTextureFrameAvailable(long j2, long j3);

    private native void nativeNotifyLowMemoryWarning(long j2);

    private native void nativeOnVsync(long j2, long j3, long j4);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j2, long j3, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j2, long j3, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j2, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3);

    private native void nativeScheduleFrame(long j2);

    private native void nativeSetAccessibilityFeatures(long j2, int i2);

    private native void nativeSetSemanticsEnabled(long j2, boolean z2);

    private native void nativeSetViewportMetrics(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24);

    private native FlutterJNI nativeSpawn(long j2, String str, String str2, String str3, List<String> list, long j3);

    private native void nativeSurfaceChanged(long j2, int i2, int i3);

    private native void nativeSurfaceCreated(long j2, Surface surface);

    private native void nativeSurfaceDestroyed(long j2);

    private native void nativeSurfaceWindowChanged(long j2, Surface surface);

    private native void nativeUnregisterTexture(long j2, long j3);

    private native void nativeUpdateDisplayMetrics(long j2);

    private native void nativeUpdateJavaAssetManager(long j2, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((h) ((io.flutter.view.b) kVar).f7887a).f7986l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            h hVar = (h) ((io.flutter.view.b) kVar).f7887a;
            hVar.getClass();
            while (byteBuffer.hasRemaining()) {
                f a2 = hVar.a(byteBuffer.getInt());
                a2.f7918c = byteBuffer.getInt();
                a2.f7919d = h.c(byteBuffer, strArr);
                a2.f7920e = h.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.b) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        jVar.getClass();
        SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = jVar.f7851i;
            if (i2 >= arrayList.size()) {
                d2.apply();
                arrayList.clear();
                return;
            } else {
                d2 = d2.merge(AbstractC0076i.g(arrayList.get(i2)));
                i2++;
            }
        }
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

    public void cleanupMessageData(long j2) {
        nativeCleanupMessageData(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r10 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        if (r4.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
    
        if (r4.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0155, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 3) {
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            String str3 = strArr[i2 + 2];
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
        C0130a c0130a = this.localizationPlugin;
        c0130a.getClass();
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC0072e abstractActivityC0072e = c0130a.f2617b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0072e.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Locale locale3 = locales.get(i4);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + "-" + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + "-" + locale3.getCountry();
                    }
                    arrayList2.add(AbstractC0068a.l(language));
                    AbstractC0068a.n();
                    arrayList2.add(AbstractC0068a.l(locale3.getLanguage()));
                    AbstractC0068a.n();
                    arrayList2.add(AbstractC0068a.l(locale3.getLanguage() + "-*"));
                }
                locale2 = Locale.lookup(arrayList2, arrayList);
            } else {
                LocaleList locales2 = abstractActivityC0072e.getResources().getConfiguration().getLocales();
                int i5 = 0;
                loop2: while (i5 < locales2.size()) {
                    Locale locale4 = locales2.get(i5);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        locale = (Locale) it.next();
                        if (locale4.equals(locale)) {
                            break loop2;
                        }
                    }
                    locale2 = locale;
                }
                locale2 = (Locale) arrayList.get(0);
            }
        }
        return locale2 == null ? new String[0] : new String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(kVar.f7859c.getContext(), kVar.f7859c.getWidth(), kVar.f7859c.getHeight(), 2);
        bVar.f7832h = kVar.f7864h;
        int i2 = kVar.f7871o;
        kVar.f7871o = i2 + 1;
        kVar.f7869m.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (jVar.f7853k == null) {
            SurfaceControl.Builder c2 = io.flutter.plugin.platform.i.c();
            c2.setBufferSize(jVar.f7845c.getWidth(), jVar.f7845c.getHeight());
            c2.setFormat(1);
            c2.setName("Flutter Overlay Surface");
            c2.setOpaque(false);
            c2.setHidden(false);
            build = c2.build();
            rootSurfaceControl = jVar.f7845c.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            buildReparentTransaction.apply();
            jVar.f7853k = io.flutter.plugin.platform.i.b(build);
            jVar.f7854l = build;
        }
        return new FlutterOverlaySurface(0, jVar.f7853k);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        jVar.f7851i.add(d2);
        return d2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = jVar.f7853k;
        if (surface != null) {
            surface.release();
            jVar.f7853k = null;
            jVar.f7854l = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        kVar.e();
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

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i2, e eVar) {
        dispatchSemanticsAction(i2, eVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = jVar.f7852j;
            if (i2 >= arrayList.size()) {
                arrayList.clear();
                jVar.f7845c.invalidate();
                rootSurfaceControl = jVar.f7845c.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(d2);
                return;
            }
            d2 = d2.merge(AbstractC0076i.g(arrayList.get(i2)));
            i2++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f2, int i2) {
        Z0.l lVar;
        m mVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (mVar != null) {
            I0.b bVar = mVar.f2005a;
            Z0.l lVar2 = (Z0.l) bVar.f722c;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f721b;
            if (lVar2 == null) {
                bVar.f722c = (Z0.l) concurrentLinkedQueue.poll();
            }
            while (true) {
                lVar = (Z0.l) bVar.f722c;
                if (lVar == null || lVar.f2003a >= i2) {
                    break;
                }
                bVar.f722c = (Z0.l) concurrentLinkedQueue.poll();
            }
            if (lVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (lVar.f2003a != i2) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((Z0.l) bVar.f722c).f2003a);
                }
                if (lVar != null) {
                    displayMetrics = lVar.f2004b;
                }
            }
            lVar = null;
            if (lVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        R0.f fVar;
        boolean z2;
        j jVar = this.platformMessageHandler;
        if (jVar == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        R0.i iVar = (R0.i) jVar;
        synchronized (iVar.f1733d) {
            try {
                fVar = (R0.f) iVar.f1731b.get(str);
                z2 = iVar.f1734e.get() && fVar == null;
                if (z2) {
                    if (!iVar.f1732c.containsKey(str)) {
                        iVar.f1732c.put(str, new LinkedList());
                    }
                    ((List) iVar.f1732c.get(str)).add(new R0.d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        iVar.a(str, fVar, byteBuffer, i2, j2);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f7854l == null) {
            return;
        }
        SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        jVar.f7851i.add(d2);
        d2.setVisibility(jVar.f7854l, false);
    }

    @SuppressLint({"NewApi"})
    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        C1.a.n(jVar.f7849g.get(i2));
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j2, int i2) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j2, i2);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i2);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i2, byteBuffer, i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i2) {
        return nativeFlutterTextUtilsIsEmoji(i2);
    }

    public boolean isCodePointEmojiModifier(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifier(i2);
    }

    public boolean isCodePointEmojiModifierBase(int i2) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i2);
    }

    public boolean isCodePointRegionalIndicator(int i2) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i2);
    }

    public boolean isCodePointVariantSelector(int i2) {
        return nativeFlutterTextUtilsIsVariationSelector(i2);
    }

    public void loadDartDeferredLibrary(int i2, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i2, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if (r12 != null) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadLibrary(Context context) {
        x0.e eVar;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        H0.b bVar = new H0.b(22);
        C0038n c0038n = new C0038n(5);
        c0038n.f535d = bVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c0038n.e("Beginning load of %s...", PluginErrorDetails.Platform.FLUTTER);
        C0163N c0163n = (C0163N) c0038n.f533b;
        HashSet hashSet = (HashSet) c0038n.f532a;
        if (hashSet.contains(PluginErrorDetails.Platform.FLUTTER)) {
            c0038n.e("%s already loaded previously!", PluginErrorDetails.Platform.FLUTTER);
        } else {
            try {
                c0163n.getClass();
                System.loadLibrary(PluginErrorDetails.Platform.FLUTTER);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                c0038n.e("%s (%s) was loaded normally!", PluginErrorDetails.Platform.FLUTTER, null);
            } catch (UnsatisfiedLinkError e2) {
                c0038n.e("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                c0038n.e("%s (%s) was not loaded normally, re-linking...", PluginErrorDetails.Platform.FLUTTER, null);
                File d2 = c0038n.d(context);
                if (!d2.exists()) {
                    File dir = context.getDir("lib", 0);
                    File d3 = c0038n.d(context);
                    c0163n.getClass();
                    File[] listFiles = dir.listFiles(new C0193a(System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER)));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(d3.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER);
                    ((C0163N) c0038n.f534c).getClass();
                    try {
                        x0.e d4 = C0163N.d(context, strArr2, mapLibraryName, c0038n);
                        try {
                            if (d4 == null) {
                                try {
                                    strArr = C0163N.f(context, mapLibraryName);
                                } catch (Exception e3) {
                                    strArr = new String[]{e3.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new C0015p(C1.a.k(sb, Arrays.toString(strArr), "."));
                            }
                            int i2 = 0;
                            while (true) {
                                int i3 = i2 + 1;
                                zipFile = (ZipFile) d4.f8530b;
                                if (i2 < 5) {
                                    c0038n.e("Found %s! Extracting...", mapLibraryName);
                                    try {
                                        if (d2.exists() || d2.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) d4.f8531c);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(d2);
                                                try {
                                                    byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
                                                    long j2 = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j2 += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j2 == d2.length()) {
                                                        C0163N.b(inputStream2);
                                                        C0163N.b(fileOutputStream2);
                                                        d2.setReadable(true, false);
                                                        d2.setExecutable(true, false);
                                                        d2.setWritable(true);
                                                        break;
                                                    }
                                                    C0163N.b(inputStream2);
                                                    C0163N.b(fileOutputStream2);
                                                } catch (FileNotFoundException unused3) {
                                                    C0163N.b(inputStream2);
                                                    C0163N.b(fileOutputStream2);
                                                    i2 = i3;
                                                } catch (IOException unused4) {
                                                    C0163N.b(inputStream2);
                                                    C0163N.b(fileOutputStream2);
                                                    i2 = i3;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    C0163N.b(inputStream);
                                                    C0163N.b(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                C0163N.b(inputStream2);
                                                C0163N.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                C0163N.b(inputStream2);
                                                C0163N.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C0163N.b(inputStream);
                                                C0163N.b(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i2 = i3;
                                } else if (((H0.b) c0038n.f535d) != null) {
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eVar = d4;
                            if (eVar != null) {
                                try {
                                    ZipFile zipFile2 = (ZipFile) eVar.f8530b;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                    }
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        eVar = null;
                    }
                }
                String absolutePath = d2.getAbsolutePath();
                c0163n.getClass();
                System.load(absolutePath);
                hashSet.add(PluginErrorDetails.Platform.FLUTTER);
                c0038n.e("%s (%s) was re-linked!", PluginErrorDetails.Platform.FLUTTER, null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j2);
    }

    public void maybeResizeSurfaceView(int i2, int i3) {
        boolean z2;
        Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            View view = ((P0.r) it.next()).f1450a.f1460e;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z3 = true;
                if (view.getHeight() != i3) {
                    layoutParams.height = i3;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (view.getWidth() != i2) {
                    layoutParams.width = i2;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    view.setLayoutParams(layoutParams);
                }
            } else {
                Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        kVar.f7874r.clear();
        kVar.f7875s.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = kVar.f7869m;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException(C1.a.g(i2, "The overlay surface (id:", ") doesn't exist"));
        }
        kVar.h();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            kVar.f7859c.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        kVar.f7874r.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        kVar.h();
        C1.a.n(kVar.f7867k.get(i2));
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        C1.a.n(jVar.f7849g.get(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!kVar.f7872p || !kVar.f7875s.isEmpty()) {
            if (kVar.f7872p) {
                C0077j c0077j = kVar.f7859c.f1459d;
                if (c0077j != null ? c0077j.e() : false) {
                    z2 = true;
                }
            }
            kVar.f(z2);
            return;
        }
        kVar.f7872p = false;
        t tVar = kVar.f7859c;
        F0.a aVar = new F0.a(10, kVar);
        C0077j c0077j2 = tVar.f1459d;
        if (c0077j2 == null || (r3 = tVar.f1461f) == 0) {
            return;
        }
        tVar.f1460e = r3;
        tVar.f1461f = null;
        io.flutter.embedding.engine.renderer.h hVar = tVar.f1464i.f7707b;
        if (hVar != null) {
            r3.d();
            hVar.a(new s(tVar, hVar, aVar));
            return;
        }
        c0077j2.c();
        C0077j c0077j3 = tVar.f1459d;
        if (c0077j3 != null) {
            c0077j3.f1429a.close();
            tVar.removeView(tVar.f1459d);
            tVar.f1459d = null;
        }
        aVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i2, i3);
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

    public void onVsync(long j2, long j3, long j4) {
        nativeOnVsync(j2, j3, j4);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j2, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j2, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void removeResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(jVar);
    }

    public void requestDartDeferredLibrary(int i2) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j2);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i2);
        }
    }

    public void setAccessibilityFeaturesInNative(int i2) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i2);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(C0130a c0130a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0130a;
    }

    public void setPlatformMessageHandler(j jVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = jVar;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = kVar;
    }

    public void setPlatformViewsController2(io.flutter.plugin.platform.j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = jVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setSemanticsTreeEnabled(boolean z2) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar == null || z2) {
            return;
        }
        h hVar = (h) ((io.flutter.view.b) kVar).f7887a;
        hVar.f7981g.clear();
        io.flutter.view.g gVar = hVar.f7983i;
        if (gVar != null) {
            hVar.g(gVar.f7947b, 65536);
        }
        hVar.f7983i = null;
        hVar.f7989o = null;
        AccessibilityEvent d2 = hVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        hVar.h(d2);
    }

    public void setSettingsChannel(m mVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = mVar;
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, i19, i20, i21, i22, i23, i24);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f7854l == null) {
            return;
        }
        SurfaceControl.Transaction d2 = io.flutter.plugin.platform.i.d();
        jVar.f7851i.add(d2);
        d2.setVisibility(jVar.f7854l, true);
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j2);
        Long l2 = nativeSpawn.nativeShellHolderId;
        if ((l2 == null || l2.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        io.flutter.plugin.platform.j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        synchronized (jVar) {
            jVar.f7852j.clear();
            jVar.f7852j.addAll(jVar.f7851i);
            jVar.f7851i.clear();
        }
    }

    public void unregisterTexture(long j2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j2);
    }

    public void updateDisplayMetrics(int i2, float f2, float f3, float f4) {
        displayWidth = f2;
        displayHeight = f3;
        displayDensity = f4;
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

    public void dispatchSemanticsAction(int i2, e eVar, Object obj) {
        ByteBuffer byteBuffer;
        int i3;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = C0098n.INSTANCE.encodeMessage(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, eVar.f7915a, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
