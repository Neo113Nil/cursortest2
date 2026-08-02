package ru.yandex.video.m3.player.impl.drm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.c;
import defpackage.cyd;
import defpackage.d6z;
import defpackage.jmm;
import defpackage.lmm;
import defpackage.mmm;
import defpackage.nmm;
import defpackage.pmm;
import defpackage.qmm;
import defpackage.sf10;
import defpackage.vyc0;
import defpackage.w511;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import ru.yandex.video.m3.player.drm.DrmSessionManagerMode;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J#\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.¨\u00060"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/ExoDrmSessionManagerImpl;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "Lqmm;", "Lru/yandex/video/m3/player/impl/drm/MediaDrmCallbackImpl;", "drmCallback", "Landroidx/media3/exoplayer/drm/c;", "drmSessionManager", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "exoDrmSessionManagerListener", "<init>", "(Lru/yandex/video/m3/player/impl/drm/MediaDrmCallbackImpl;Landroidx/media3/exoplayer/drm/c;Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;)V", "Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;", "", "toExoDrmSessionManagerMode", "(Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;)I", "Landroid/os/Looper;", "p0", "Lvyc0;", "p1", "Lzy11;", "setPlayer", "(Landroid/os/Looper;Lvyc0;)V", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "delegate", "setMediaDrmCallbackDelegate", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)V", "mode", "", "offlineLicenseKeySetId", "setMode", "(Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;[B)V", "Landroidx/media3/common/a;", "format", "Ljmm;", "acquireSession", "(Landroidx/media3/common/a;)Ljmm;", "Lmmm;", "eventDispatcher", "(Lmmm;Landroidx/media3/common/a;)Ljmm;", "getCryptoType", "(Landroidx/media3/common/a;)I", "prepare", "()V", "release", "Lru/yandex/video/m3/player/impl/drm/MediaDrmCallbackImpl;", "Landroidx/media3/exoplayer/drm/c;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "DrmSessionEventListenerImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDrmSessionManagerImpl implements ExoDrmSessionManager, qmm {
    public static final int $stable = 8;
    private final MediaDrmCallbackImpl drmCallback;
    private final c drmSessionManager;
    private final ExoDrmSessionManagerListener exoDrmSessionManagerListener;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/ExoDrmSessionManagerImpl$DrmSessionEventListenerImpl;", "Lnmm;", "Lcyd;", "conditionVariable", "<init>", "(Lcyd;)V", "", "windowIndex", "Lsf10;", "mediaPeriodId", "Lzy11;", "onDrmKeysLoaded", "(ILsf10;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onDrmSessionManagerError", "(ILsf10;Ljava/lang/Exception;)V", "onDrmKeysRestored", "onDrmKeysRemoved", "onDrmSessionReleased", "Lcyd;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DrmSessionEventListenerImpl implements nmm {
        private final cyd conditionVariable;

        public DrmSessionEventListenerImpl(cyd cydVar) {
            this.conditionVariable = cydVar;
        }

        @Override // defpackage.nmm
        public void onDrmKeysLoaded(int windowIndex, sf10 mediaPeriodId) {
            this.conditionVariable.d();
        }

        @Override // defpackage.nmm
        public void onDrmKeysRemoved(int windowIndex, sf10 mediaPeriodId) {
            this.conditionVariable.d();
        }

        @Override // defpackage.nmm
        public void onDrmKeysRestored(int windowIndex, sf10 mediaPeriodId) {
            this.conditionVariable.d();
        }

        @Override // defpackage.nmm
        public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i, sf10 sf10Var, int i2) {
        }

        @Override // defpackage.nmm
        public void onDrmSessionManagerError(int windowIndex, sf10 mediaPeriodId, Exception e) {
            this.conditionVariable.d();
        }

        @Override // defpackage.nmm
        public void onDrmSessionReleased(int windowIndex, sf10 mediaPeriodId) {
            this.conditionVariable.d();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrmSessionManagerMode.values().length];
            try {
                iArr[DrmSessionManagerMode.PLAYBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrmSessionManagerMode.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrmSessionManagerMode.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DrmSessionManagerMode.RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExoDrmSessionManagerImpl(MediaDrmCallbackImpl mediaDrmCallbackImpl, c cVar, ExoDrmSessionManagerListener exoDrmSessionManagerListener) {
        this.drmCallback = mediaDrmCallbackImpl;
        this.drmSessionManager = cVar;
        this.exoDrmSessionManagerListener = exoDrmSessionManagerListener;
    }

    private final int toExoDrmSessionManagerMode(DrmSessionManagerMode drmSessionManagerMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[drmSessionManagerMode.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        w511.b();
        return 0;
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager
    public jmm acquireSession(a format) {
        cyd cydVar = new cyd();
        DrmSessionEventListenerImpl drmSessionEventListenerImpl = new DrmSessionEventListenerImpl(cydVar);
        mmm mmmVar = new mmm();
        HandlerThread handlerThread = new HandlerThread("YP:ExoDrmSessionManager");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        lmm lmmVar = new lmm();
        lmmVar.a = handler;
        lmmVar.b = drmSessionEventListenerImpl;
        CopyOnWriteArrayList copyOnWriteArrayList = mmmVar.c;
        copyOnWriteArrayList.add(lmmVar);
        jmm acquireSession = this.drmSessionManager.acquireSession(mmmVar, format);
        cydVar.a();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            lmm lmmVar2 = (lmm) it.next();
            if (lmmVar2.b == drmSessionEventListenerImpl) {
                copyOnWriteArrayList.remove(lmmVar2);
            }
        }
        handlerThread.quit();
        return acquireSession;
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public int getCryptoType(a format) {
        return this.drmSessionManager.getCryptoType(format);
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public /* bridge */ /* synthetic */ pmm preacquireSession(mmm mmmVar, a aVar) {
        return pmm.Y1;
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public void prepare() {
        this.drmSessionManager.prepare();
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public void release() {
        this.drmSessionManager.release();
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager
    public void setMediaDrmCallbackDelegate(MediaDrmCallbackDelegate delegate) {
        this.drmCallback.setDelegate(delegate);
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager
    public void setMode(DrmSessionManagerMode mode, byte[] offlineLicenseKeySetId) {
        c cVar = this.drmSessionManager;
        int exoDrmSessionManagerMode = toExoDrmSessionManagerMode(mode);
        d6z.x(cVar.m.isEmpty());
        if (exoDrmSessionManagerMode == 1 || exoDrmSessionManagerMode == 3) {
            offlineLicenseKeySetId.getClass();
        }
        cVar.v = exoDrmSessionManagerMode;
        cVar.w = offlineLicenseKeySetId;
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public void setPlayer(Looper p0, vyc0 p1) {
        this.drmSessionManager.setPlayer(p0, p1);
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public jmm acquireSession(mmm eventDispatcher, a format) {
        jmm acquireSession = this.drmSessionManager.acquireSession(eventDispatcher, format);
        this.exoDrmSessionManagerListener.onDrmSessionAcquired(acquireSession, format);
        return acquireSession;
    }
}
