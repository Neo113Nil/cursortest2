package ru.yandex.video.m3.player.impl.drm;

import android.os.Looper;
import androidx.media3.common.a;
import defpackage.jmm;
import defpackage.mmm;
import defpackage.pmm;
import defpackage.vyc0;
import kotlin.Metadata;
import ru.yandex.video.m3.player.drm.DrmSessionManagerMode;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/impl/drm/ExoDummyDrmSessionManager;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "<init>", "()V", "Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;", "mode", "", "offlineLicenseKeySetId", "Lzy11;", "setMode", "(Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;[B)V", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "delegate", "setMediaDrmCallbackDelegate", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)V", "Landroid/os/Looper;", "playbackLooper", "Lvyc0;", "playerId", "setPlayer", "(Landroid/os/Looper;Lvyc0;)V", "Landroidx/media3/common/a;", "format", "", "getCryptoType", "(Landroidx/media3/common/a;)I", "Ljmm;", "acquireSession", "(Landroidx/media3/common/a;)Ljmm;", "Lmmm;", "eventDispatcher", "(Lmmm;Landroidx/media3/common/a;)Ljmm;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDummyDrmSessionManager implements ExoDrmSessionManager {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public jmm acquireSession(mmm eventDispatcher, a format) {
        return acquireSession(format);
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public int getCryptoType(a format) {
        return format.r != null ? 1 : 0;
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public /* bridge */ /* synthetic */ pmm preacquireSession(mmm mmmVar, a aVar) {
        return pmm.Y1;
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public /* bridge */ /* synthetic */ void prepare() {
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public /* bridge */ /* synthetic */ void release() {
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager
    public void setMediaDrmCallbackDelegate(MediaDrmCallbackDelegate delegate) {
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager
    public void setMode(DrmSessionManagerMode mode, byte[] offlineLicenseKeySetId) {
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager, defpackage.qmm
    public void setPlayer(Looper playbackLooper, vyc0 playerId) {
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManager
    public jmm acquireSession(a format) {
        return null;
    }
}
