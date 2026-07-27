package io.flutter.embedding.engine;

import D.C0013n;
import E.a;
import H.g;
import K0.C0040p;
import L.C0051b;
import L.Q;
import a.AbstractC0069a;
import a0.C0070a;
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
import androidx.lifecycle.p;
import c0.AbstractActivityC0104f;
import c0.AbstractC0099a;
import c0.C0108j;
import c0.q;
import d0.C0121k;
import d0.InterfaceC0112b;
import d0.InterfaceC0122l;
import d0.InterfaceC0123m;
import e0.C0128d;
import e0.C0130f;
import e0.C0133i;
import e0.InterfaceC0134j;
import f0.InterfaceC0140a;
import g0.c;
import g0.d;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.plugin.platform.j;
import io.flutter.plugin.platform.k;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.b;
import io.flutter.view.e;
import io.flutter.view.f;
import io.flutter.view.h;
import io.flutter.view.r;
import io.flutter.view.s;
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
import l0.m;
import l0.n;
import m0.C0216n;
import m0.InterfaceC0207e;
import n0.C0220a;

/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC0123m asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private InterfaceC0122l accessibilityDelegate;
    private InterfaceC0140a deferredComponentManager;
    private C0220a localizationPlugin;
    private Long nativeShellHolderId;
    private InterfaceC0134j platformMessageHandler;
    private k platformViewsController;
    private j platformViewsController2;
    private n settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC0112b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j2) {
        InterfaceC0123m interfaceC0123m = asyncWaitForVsyncDelegate;
        if (interfaceC0123m == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        b bVar = (b) interfaceC0123m;
        bVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        s sVar = (s) bVar.f2495a;
        r rVar = sVar.f2627c;
        if (rVar != null) {
            rVar.f2621a = j2;
            sVar.f2627c = null;
        } else {
            rVar = new r(sVar, j2);
        }
        choreographer.postFrameCallback(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j2) {
        g0.b bVar;
        A.j jVar = 0;
        jVar = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        C0121k c0121k = new C0121k(j2);
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
            dVar.f2049d = options.outMimeType;
            dVar.f2051f = options.outHeight;
            dVar.f2052g = options.outWidth;
        } catch (Exception e2) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e2);
        }
        if ("image/heif".equals(dVar.f2049d)) {
            try {
                c cVar = new c(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(cVar);
                AbstractC0069a.A(dVar, mediaExtractor);
            } catch (Exception e3) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
            }
            nativeImageHeaderCallback(c0121k.f1834a, dVar.f2046a, dVar.f2047b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    g gVar = new g(byteArrayInputStream);
                    H.c c2 = gVar.c("Orientation");
                    if (c2 != null) {
                        try {
                            i2 = c2.e(gVar.f389f);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    dVar.f2050e = i2;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e4) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e4);
            }
        }
        if ("image/heif".equals(dVar.f2049d)) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 36) {
                bVar = new g0.b(jVar, 0);
            } else if (i3 < 36) {
                bVar = new g0.b(jVar, 1);
            }
            jVar = bVar;
        }
        if (jVar == 0) {
            jVar = new A.j(20, c0121k);
        }
        return jVar.u(byteBuffer, dVar);
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
        InterfaceC0207e interfaceC0207e;
        InterfaceC0134j interfaceC0134j = this.platformMessageHandler;
        if (interfaceC0134j == null || (interfaceC0207e = (InterfaceC0207e) ((C0133i) interfaceC0134j).f1867k.remove(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            interfaceC0207e.a(byteBuffer);
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
        Iterator<InterfaceC0112b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        InterfaceC0122l interfaceC0122l = this.accessibilityDelegate;
        if (interfaceC0122l != null) {
            ((h) ((b) interfaceC0122l).f2495a).f2596l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC0122l interfaceC0122l = this.accessibilityDelegate;
        if (interfaceC0122l != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            h hVar = (h) ((b) interfaceC0122l).f2495a;
            hVar.getClass();
            while (byteBuffer.hasRemaining()) {
                f a2 = hVar.a(byteBuffer.getInt());
                a2.f2526c = byteBuffer.getInt();
                a2.f2527d = h.c(byteBuffer, strArr);
                a2.f2528e = h.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        InterfaceC0122l interfaceC0122l = this.accessibilityDelegate;
        if (interfaceC0122l != null) {
            ((b) interfaceC0122l).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC0112b interfaceC0112b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC0112b);
    }

    public void addIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    public void applyTransactions() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        jVar.getClass();
        SurfaceControl.Transaction i2 = p.i();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = jVar.f2460n;
            if (i3 >= arrayList.size()) {
                i2.apply();
                arrayList.clear();
                return;
            } else {
                i2 = i2.merge(p.k(arrayList.get(i3)));
                i3++;
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
        C0220a c0220a = this.localizationPlugin;
        c0220a.getClass();
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            AbstractActivityC0104f abstractActivityC0104f = c0220a.f2778b;
            if (i3 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0104f.getResources().getConfiguration().getLocales();
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
                    arrayList2.add(AbstractC0099a.l(language));
                    AbstractC0099a.n();
                    arrayList2.add(AbstractC0099a.l(locale3.getLanguage()));
                    AbstractC0099a.n();
                    arrayList2.add(AbstractC0099a.l(locale3.getLanguage() + "-*"));
                }
                locale2 = Locale.lookup(arrayList2, arrayList);
            } else {
                LocaleList locales2 = abstractActivityC0104f.getResources().getConfiguration().getLocales();
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
        k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(kVar.f2467h.getContext(), kVar.f2467h.getWidth(), kVar.f2467h.getHeight(), 2);
        bVar.f2441m = kVar.f2472m;
        int i2 = kVar.f2478t;
        kVar.f2478t = i2 + 1;
        kVar.r.put(i2, bVar);
        return new FlutterOverlaySurface(i2, bVar.getSurface());
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (jVar.f2462p == null) {
            SurfaceControl.Builder h2 = p.h();
            h2.setBufferSize(jVar.f2454h.getWidth(), jVar.f2454h.getHeight());
            h2.setFormat(1);
            h2.setName("Flutter Overlay Surface");
            h2.setOpaque(false);
            h2.setHidden(false);
            build = h2.build();
            rootSurfaceControl = jVar.f2454h.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            jVar.f2462p = p.g(build);
            jVar.f2463q = build;
        }
        return new FlutterOverlaySurface(0, jVar.f2462p);
    }

    public SurfaceControl.Transaction createTransaction() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction i2 = p.i();
        jVar.f2460n.add(i2);
        return i2;
    }

    public void deferredComponentInstallFailure(int i2, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i2, str, z2);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = jVar.f2462p;
        if (surface != null) {
            surface.release();
            jVar.f2462p = null;
            jVar.f2463q = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        kVar.c();
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

    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction i2 = p.i();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = jVar.f2461o;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                jVar.f2454h.invalidate();
                rootSurfaceControl = jVar.f2454h.getRootSurfaceControl();
                rootSurfaceControl.applyTransactionOnDraw(i2);
                return;
            }
            i2 = i2.merge(p.k(arrayList.get(i3)));
            i3++;
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
        m mVar;
        n nVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (nVar != null) {
            C0051b c0051b = nVar.f2739a;
            m mVar2 = (m) c0051b.f602g;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0051b.f603h;
            if (mVar2 == null) {
                c0051b.f602g = (m) concurrentLinkedQueue.poll();
            }
            while (true) {
                mVar = (m) c0051b.f602g;
                if (mVar == null || mVar.f2737a >= i2) {
                    break;
                }
                c0051b.f602g = (m) concurrentLinkedQueue.poll();
            }
            if (mVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", after exhausting the queue.");
            } else {
                if (mVar.f2737a != i2) {
                    Log.e("SettingsChannel", "Cannot find config with generation: " + i2 + ", the oldest config is now: " + ((m) c0051b.f602g).f2737a);
                }
                if (mVar != null) {
                    displayMetrics = mVar.f2738b;
                }
            }
            mVar = null;
            if (mVar != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f2, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + i2 + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i2, long j2) {
        C0130f c0130f;
        boolean z2;
        InterfaceC0134j interfaceC0134j = this.platformMessageHandler;
        if (interfaceC0134j == null) {
            nativeCleanupMessageData(j2);
            return;
        }
        C0133i c0133i = (C0133i) interfaceC0134j;
        synchronized (c0133i.f1865i) {
            try {
                c0130f = (C0130f) c0133i.f1863g.get(str);
                z2 = c0133i.f1866j.get() && c0130f == null;
                if (z2) {
                    if (!c0133i.f1864h.containsKey(str)) {
                        c0133i.f1864h.put(str, new LinkedList());
                    }
                    ((List) c0133i.f1864h.get(str)).add(new C0128d(j2, byteBuffer, i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        c0133i.a(str, c0130f, byteBuffer, i2, j2);
    }

    public void hideOverlaySurface2() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f2463q == null) {
            return;
        }
        SurfaceControl.Transaction i2 = p.i();
        jVar.f2460n.add(i2);
        i2.setVisibility(jVar.f2463q, false);
    }

    public void hidePlatformView2(int i2) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        E0.h.i(jVar.f2458l.get(i2));
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

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a3, code lost:
    
        if (r12 != null) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadLibrary(Context context) {
        Q q2;
        Q f2;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        l0.i iVar = new l0.i();
        a aVar = new a(14);
        a aVar2 = new a(13);
        C0013n c0013n = new C0013n();
        c0013n.f242a = new HashSet();
        c0013n.f243b = aVar;
        c0013n.f244c = aVar2;
        c0013n.f245d = iVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c0013n.g("Beginning load of %s...", "flutter");
        a aVar3 = (a) c0013n.f243b;
        HashSet hashSet = (HashSet) c0013n.f242a;
        if (hashSet.contains("flutter")) {
            c0013n.g("%s already loaded previously!", "flutter");
        } else {
            try {
                aVar3.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                c0013n.g("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e2) {
                c0013n.g("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                c0013n.g("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File f3 = c0013n.f(context);
                if (!f3.exists()) {
                    File dir = context.getDir("lib", 0);
                    File f4 = c0013n.f(context);
                    aVar3.getClass();
                    File[] listFiles = dir.listFiles(new C0070a(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(f4.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    ((a) c0013n.f244c).getClass();
                    try {
                        f2 = a.f(context, strArr2, mapLibraryName, c0013n);
                    } catch (Throwable th) {
                        th = th;
                        q2 = null;
                    }
                    try {
                        if (f2 == null) {
                            try {
                                strArr = a.g(context, mapLibraryName);
                            } catch (Exception e3) {
                                strArr = new String[]{e3.toString()};
                            }
                            throw new C0040p(mapLibraryName, strArr2, strArr);
                        }
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            zipFile = (ZipFile) f2.f597g;
                            if (i2 < 5) {
                                c0013n.g("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (f3.exists() || f3.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) f2.f598h);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(f3);
                                            } catch (FileNotFoundException unused) {
                                                fileOutputStream2 = null;
                                                a.b(inputStream2);
                                                a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused2) {
                                                fileOutputStream2 = null;
                                                a.b(inputStream2);
                                                a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                a.b(inputStream);
                                                a.b(fileOutputStream);
                                                throw th;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
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
                                                if (j2 == f3.length()) {
                                                    a.b(inputStream2);
                                                    a.b(fileOutputStream2);
                                                    f3.setReadable(true, false);
                                                    f3.setExecutable(true, false);
                                                    f3.setWritable(true);
                                                    break;
                                                }
                                                a.b(inputStream2);
                                                a.b(fileOutputStream2);
                                            } catch (FileNotFoundException unused3) {
                                                a.b(inputStream2);
                                                a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (IOException unused4) {
                                                a.b(inputStream2);
                                                a.b(fileOutputStream2);
                                                i2 = i3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                a.b(inputStream);
                                                a.b(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                i2 = i3;
                            } else if (((l0.i) c0013n.f245d) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        q2 = f2;
                        if (q2 != null) {
                            try {
                                ZipFile zipFile2 = (ZipFile) q2.f597g;
                                if (zipFile2 != null) {
                                    zipFile2.close();
                                }
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = f3.getAbsolutePath();
                aVar3.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                c0013n.g("%s (%s) was re-linked!", "flutter", null);
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
            View view = ((c0.p) it.next()).f1721a.f1736j;
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
        k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        kVar.f2481w.clear();
        kVar.f2482x.clear();
    }

    public void onDisplayOverlaySurface(int i2, int i3, int i4, int i5, int i6) {
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = kVar.r;
        if (sparseArray.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        kVar.h();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i2);
        if (view.getParent() == null) {
            kVar.f2467h.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        kVar.f2481w.add(Integer.valueOf(i2));
    }

    public void onDisplayPlatformView(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        kVar.h();
        E0.h.i(kVar.f2475p.get(i2));
    }

    public void onDisplayPlatformView2(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        E0.h.i(jVar.f2458l.get(i2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        k kVar = this.platformViewsController;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!kVar.f2479u || !kVar.f2482x.isEmpty()) {
            if (kVar.f2479u) {
                C0108j c0108j = kVar.f2467h.f1735i;
                if (c0108j != null ? c0108j.e() : false) {
                    z2 = true;
                }
            }
            kVar.e(z2);
            return;
        }
        kVar.f2479u = false;
        c0.r rVar = kVar.f2467h;
        androidx.lifecycle.k kVar2 = new androidx.lifecycle.k(3, kVar);
        C0108j c0108j2 = rVar.f1735i;
        if (c0108j2 == null || (r3 = rVar.f1737k) == 0) {
            return;
        }
        rVar.f1736j = r3;
        rVar.f1737k = null;
        io.flutter.embedding.engine.renderer.h hVar = rVar.f1740n.f1777b;
        if (hVar != null) {
            r3.b();
            hVar.a(new q(rVar, hVar, kVar2));
            return;
        }
        c0108j2.d();
        C0108j c0108j3 = rVar.f1735i;
        if (c0108j3 != null) {
            c0108j3.f1702f.close();
            rVar.removeView(rVar.f1735i);
            rVar.f1735i = null;
        }
        kVar2.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
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

    public void removeEngineLifecycleListener(InterfaceC0112b interfaceC0112b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC0112b);
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

    public void setAccessibilityDelegate(InterfaceC0122l interfaceC0122l) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC0122l;
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

    public void setAsyncWaitForVsyncDelegate(InterfaceC0123m interfaceC0123m) {
        asyncWaitForVsyncDelegate = interfaceC0123m;
    }

    public void setDeferredComponentManager(InterfaceC0140a interfaceC0140a) {
        ensureRunningOnMainThread();
        if (interfaceC0140a != null) {
            interfaceC0140a.a();
        }
    }

    public void setLocalizationPlugin(C0220a c0220a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0220a;
    }

    public void setPlatformMessageHandler(InterfaceC0134j interfaceC0134j) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC0134j;
    }

    public void setPlatformViewsController(k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = kVar;
    }

    public void setPlatformViewsController2(j jVar) {
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
        InterfaceC0122l interfaceC0122l = this.accessibilityDelegate;
        if (interfaceC0122l == null || z2) {
            return;
        }
        h hVar = (h) ((b) interfaceC0122l).f2495a;
        hVar.f2591g.clear();
        io.flutter.view.g gVar = hVar.f2593i;
        if (gVar != null) {
            hVar.g(gVar.f2555b, 65536);
        }
        hVar.f2593i = null;
        hVar.f2599o = null;
        AccessibilityEvent d2 = hVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        hVar.h(d2);
    }

    public void setSettingsChannel(n nVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = nVar;
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, iArr, iArr2, iArr3, i17, i18, i19, i20, i21, i22, i23, i24);
    }

    public void showOverlaySurface2() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (jVar.f2463q == null) {
            return;
        }
        SurfaceControl.Transaction i2 = p.i();
        jVar.f2460n.add(i2);
        i2.setVisibility(jVar.f2463q, true);
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

    public void swapTransactions() {
        j jVar = this.platformViewsController2;
        if (jVar == null) {
            throw new RuntimeException("");
        }
        synchronized (jVar) {
            jVar.f2461o.clear();
            jVar.f2461o.addAll(jVar.f2460n);
            jVar.f2460n.clear();
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
            byteBuffer = C0216n.f2771a.b(obj);
            i3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i3 = 0;
        }
        dispatchSemanticsAction(i2, eVar.f2523f, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i2, i3, byteBuffer, i4);
    }
}
