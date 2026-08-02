package ru.yandex.video.m3.offline;

import android.net.Uri;
import android.os.HandlerThread;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import defpackage.d6z;
import defpackage.egg;
import defpackage.enm;
import defpackage.f7s;
import defpackage.h73;
import defpackage.i3y;
import defpackage.ipg;
import defpackage.jd00;
import defpackage.jmm;
import defpackage.kpg;
import defpackage.ooc;
import defpackage.pxa0;
import defpackage.s4j0;
import defpackage.sls;
import defpackage.su6;
import defpackage.tls;
import defpackage.vyc0;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.yw01;
import defpackage.zy11;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.yandex.video.m3.data.Offline;
import ru.yandex.video.m3.offline.ExoDrmLicenseManager;
import ru.yandex.video.m3.player.drm.DrmSessionManagerMode;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate;
import ru.yandex.video.m3.player.impl.ExoPlayerExceptionKt;
import ru.yandex.video.m3.player.impl.utils.FutureAsync;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u0001:\u0004'()*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00170\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lru/yandex/video/m3/offline/ExoDrmLicenseManager;", "Lru/yandex/video/m3/offline/DrmLicenseManager;", "Lipg;", "dataSourceFactory", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;", "exoDrmSessionManagerFactory", "<init>", "(Lipg;Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;)V", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "mediaDrmCallbackDelegate", "Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DrmLicenseHelper;", "createDrmLicenseHelper", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DrmLicenseHelper;", "", "manifestUrl", "Ljava/util/concurrent/Future;", "", "Lru/yandex/video/m3/data/Offline$DrmLicense;", "downloadLicenses", "(Ljava/lang/String;Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)Ljava/util/concurrent/Future;", "drmLicense", "releaseLicense", "(Lru/yandex/video/m3/data/Offline$DrmLicense;)Ljava/util/concurrent/Future;", "", "getLicenseProperties", "Lzy11;", "release", "()V", "Lipg;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;", "Landroid/os/HandlerThread;", "handlerThread$delegate", "Li3y;", "getHandlerThread", "()Landroid/os/HandlerThread;", "handlerThread", "", "isThreadInitialized", "Z", "Companion", "DrmLicense", "DrmLicenseHelper", "DummyDrmSessionManagerListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDrmLicenseManager implements DrmLicenseManager {
    private static final androidx.media3.common.a FORMAT_WITH_EMPTY_DRM_INIT_DATA;
    private final ipg dataSourceFactory;
    private final ExoDrmSessionManagerFactory exoDrmSessionManagerFactory;

    /* renamed from: handlerThread$delegate, reason: from kotlin metadata */
    private final i3y handlerThread = kotlin.a.a(new sls() { // from class: ru.yandex.video.m3.offline.ExoDrmLicenseManager$handlerThread$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("YP:ExoDrmLicenseManager");
            ExoDrmLicenseManager exoDrmLicenseManager = ExoDrmLicenseManager.this;
            handlerThread.start();
            exoDrmLicenseManager.isThreadInitialized = true;
            return handlerThread;
        }
    });
    private volatile boolean isThreadInitialized;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DrmLicense;", "", "keySetId", "", "properties", "", "", "([BLjava/util/Map;)V", "getKeySetId", "()[B", "getProperties", "()Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DrmLicense {
        public static final int $stable = 8;
        private final byte[] keySetId;
        private final Map<String, String> properties;

        public DrmLicense(byte[] bArr, Map<String, String> map) {
            this.keySetId = bArr;
            this.properties = map;
        }

        public final byte[] getKeySetId() {
            return this.keySetId;
        }

        public final Map<String, String> getProperties() {
            return this.properties;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DrmLicenseHelper;", "Ljava/io/Closeable;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "drmSessionManager", "<init>", "(Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;)V", "Landroidx/media3/common/a;", "format", "Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DrmLicense;", "downloadLicense", "(Landroidx/media3/common/a;)Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DrmLicense;", "", "offlineLicenseKeySetId", "Lzy11;", "releaseLicense", "([B)V", "", "", "propertiesLicense", "([B)Ljava/util/Map;", "close", "()V", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DrmLicenseHelper implements Closeable {
        private final ExoDrmSessionManager drmSessionManager;

        public DrmLicenseHelper(ExoDrmSessionManager exoDrmSessionManager) {
            this.drmSessionManager = exoDrmSessionManager;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.drmSessionManager.release();
        }

        public final synchronized DrmLicense downloadLicense(androidx.media3.common.a format) throws DrmSession$DrmSessionException {
            DrmLicense drmLicense;
            try {
                drmLicense = null;
                this.drmSessionManager.setMode(DrmSessionManagerMode.DOWNLOAD, null);
                jmm acquireSession = this.drmSessionManager.acquireSession(format);
                if (acquireSession != null) {
                    DrmSession$DrmSessionException error = acquireSession.getError();
                    if (error != null) {
                        throw error;
                    }
                    byte[] g = acquireSession.g();
                    if (g == null) {
                        g = new byte[0];
                    }
                    Map d = acquireSession.d();
                    if (d == null) {
                        d = b.f();
                    }
                    DrmLicense drmLicense2 = new DrmLicense(g, d);
                    acquireSession.h(null);
                    drmLicense = drmLicense2;
                }
            } catch (Throwable th) {
                throw th;
            }
            return drmLicense;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[DONT_GENERATE] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized Map<String, String> propertiesLicense(byte[] offlineLicenseKeySetId) throws DrmSession$DrmSessionException {
            Map<String, String> f;
            Throwable cause;
            try {
                this.drmSessionManager.setMode(DrmSessionManagerMode.QUERY, offlineLicenseKeySetId);
                jmm acquireSession = this.drmSessionManager.acquireSession(ExoDrmLicenseManager.FORMAT_WITH_EMPTY_DRM_INIT_DATA);
                if (acquireSession != null) {
                    DrmSession$DrmSessionException error = acquireSession.getError();
                    if (error != null && (cause = error.getCause()) != null) {
                        if (!(cause instanceof KeysExpiredException)) {
                            cause = null;
                        }
                        if (cause != null) {
                            f = b.f();
                            acquireSession.h(null);
                            if (f != null) {
                            }
                        }
                    }
                    DrmSession$DrmSessionException error2 = acquireSession.getError();
                    if (error2 != null) {
                        throw error2;
                    }
                    f = acquireSession.d();
                    acquireSession.h(null);
                    if (f != null) {
                    }
                }
                f = b.f();
            } finally {
            }
            return f;
        }

        public final synchronized void releaseLicense(byte[] offlineLicenseKeySetId) throws DrmSession$DrmSessionException {
            this.drmSessionManager.setMode(DrmSessionManagerMode.RELEASE, offlineLicenseKeySetId);
            jmm acquireSession = this.drmSessionManager.acquireSession(ExoDrmLicenseManager.FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            if (acquireSession != null) {
                acquireSession.h(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/offline/ExoDrmLicenseManager$DummyDrmSessionManagerListener;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "<init>", "()V", "Ljmm;", "session", "Landroidx/media3/common/a;", "format", "Lzy11;", "onDrmSessionAcquired", "(Ljmm;Landroidx/media3/common/a;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DummyDrmSessionManagerListener implements ExoDrmSessionManagerListener {
        @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener
        public void onDrmSessionAcquired(jmm session, androidx.media3.common.a format) {
        }
    }

    static {
        f7s f7sVar = new f7s();
        f7sVar.q = new DrmInitData(new DrmInitData.SchemeData[0]);
        FORMAT_WITH_EMPTY_DRM_INIT_DATA = new androidx.media3.common.a(f7sVar);
    }

    public ExoDrmLicenseManager(ipg ipgVar, ExoDrmSessionManagerFactory exoDrmSessionManagerFactory) {
        this.dataSourceFactory = ipgVar;
        this.exoDrmSessionManagerFactory = exoDrmSessionManagerFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrmLicenseHelper createDrmLicenseHelper(MediaDrmCallbackDelegate mediaDrmCallbackDelegate) {
        ExoDrmSessionManager create$default = ExoDrmSessionManagerFactory.create$default(this.exoDrmSessionManagerFactory, null, new DummyDrmSessionManagerListener(), 1, null);
        create$default.prepare();
        if (mediaDrmCallbackDelegate != null) {
            create$default.setMediaDrmCallbackDelegate(mediaDrmCallbackDelegate);
        }
        create$default.setPlayer(getHandlerThread().getLooper(), vyc0.d);
        return new DrmLicenseHelper(create$default);
    }

    public static /* synthetic */ DrmLicenseHelper createDrmLicenseHelper$default(ExoDrmLicenseManager exoDrmLicenseManager, MediaDrmCallbackDelegate mediaDrmCallbackDelegate, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaDrmCallbackDelegate = null;
        }
        return exoDrmLicenseManager.createDrmLicenseHelper(mediaDrmCallbackDelegate);
    }

    private final HandlerThread getHandlerThread() {
        return (HandlerThread) this.handlerThread.getValue();
    }

    @Override // ru.yandex.video.m3.offline.DrmLicenseManager
    public Future<List<Offline.DrmLicense>> downloadLicenses(final String manifestUrl, final MediaDrmCallbackDelegate mediaDrmCallbackDelegate) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDrmLicenseManager$downloadLicenses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<List<Offline.DrmLicense>> callback) {
                final ExoDrmLicenseManager.DrmLicenseHelper createDrmLicenseHelper;
                ipg ipgVar;
                try {
                    createDrmLicenseHelper = ExoDrmLicenseManager.this.createDrmLicenseHelper(mediaDrmCallbackDelegate);
                    ExoDrmLicenseManager exoDrmLicenseManager = ExoDrmLicenseManager.this;
                    String str = manifestUrl;
                    try {
                        ipgVar = exoDrmLicenseManager.dataSourceFactory;
                        final kpg createDataSource = ipgVar.createDataSource();
                        final egg i = jd00.i(createDataSource, Uri.parse(str));
                        callback.onComplete(kotlin.sequences.b.s(kotlin.sequences.b.i(new enm(new yw01(new h73(1, y6i0.n(0, i.getPeriodCount())), new tls() { // from class: ru.yandex.video.m3.offline.ExoDrmLicenseManager$downloadLicenses$1$1$1
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final pxa0 invoke(int i2) {
                                return egg.this.getPeriod(i2);
                            }
                        }), new wls() { // from class: ru.yandex.video.m3.offline.ExoDrmLicenseManager$downloadLicenses$1$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final Offline.DrmLicense invoke(int i2, pxa0 pxa0Var) {
                                int i3;
                                androidx.media3.common.a aVar;
                                androidx.media3.common.a aVar2;
                                ExoDrmLicenseManager.DrmLicense downloadLicense;
                                kpg kpgVar = kpg.this;
                                s4j0 f = jd00.f(2, pxa0Var);
                                if (f == null) {
                                    s4j0 f2 = jd00.f(1, pxa0Var);
                                    if (f2 == null) {
                                        aVar = null;
                                        if (aVar != null || (downloadLicense = createDrmLicenseHelper.downloadLicense(aVar)) == null) {
                                            return null;
                                        }
                                        return new Offline.DrmLicense(Base64.encodeToString(downloadLicense.getKeySetId(), 2), i2, downloadLicense.getProperties());
                                    }
                                    f = f2;
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                aVar = f.a;
                                if (f.x == null) {
                                    aVar2 = null;
                                } else {
                                    su6 k = jd00.k(i3, aVar);
                                    try {
                                        jd00.g(k, kpgVar, f, false);
                                        k.d();
                                        androidx.media3.common.a[] aVarArr = k.B;
                                        d6z.z(aVarArr);
                                        aVar2 = aVarArr[0];
                                    } catch (Throwable th) {
                                        k.d();
                                        throw th;
                                    }
                                }
                                if (aVar2 != null) {
                                    aVar = aVar2.d(aVar);
                                }
                                if (aVar != null) {
                                }
                                return null;
                            }

                            @Override // defpackage.wls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return invoke(((Number) obj).intValue(), (pxa0) obj2);
                            }
                        }, 2))));
                        ooc.g(createDrmLicenseHelper, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<List<Offline.DrmLicense>>) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.offline.DrmLicenseManager
    public Future<Map<String, String>> getLicenseProperties(final Offline.DrmLicense drmLicense) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDrmLicenseManager$getLicenseProperties$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<Map<String, String>> callback) {
                try {
                    ExoDrmLicenseManager.DrmLicenseHelper createDrmLicenseHelper$default = ExoDrmLicenseManager.createDrmLicenseHelper$default(ExoDrmLicenseManager.this, null, 1, null);
                    try {
                        callback.onComplete(createDrmLicenseHelper$default.propertiesLicense(Base64.decode(drmLicense.getKeyId(), 2)));
                        ooc.g(createDrmLicenseHelper$default, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<Map<String, String>>) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.offline.DrmLicenseManager
    public void release() {
        if (this.isThreadInitialized) {
            getHandlerThread().quitSafely();
        }
    }

    @Override // ru.yandex.video.m3.offline.DrmLicenseManager
    public Future<Offline.DrmLicense> releaseLicense(final Offline.DrmLicense drmLicense) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDrmLicenseManager$releaseLicense$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<Offline.DrmLicense> callback) {
                try {
                    ExoDrmLicenseManager.DrmLicenseHelper createDrmLicenseHelper$default = ExoDrmLicenseManager.createDrmLicenseHelper$default(ExoDrmLicenseManager.this, null, 1, null);
                    Offline.DrmLicense drmLicense2 = drmLicense;
                    try {
                        createDrmLicenseHelper$default.releaseLicense(Base64.decode(drmLicense2.getKeyId(), 2));
                        callback.onComplete(drmLicense2);
                        ooc.g(createDrmLicenseHelper$default, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<Offline.DrmLicense>) obj);
                return zy11.a;
            }
        });
    }
}
