package ru.yandex.video.m3.player.drm;

import android.os.Looper;
import androidx.media3.common.a;
import defpackage.jmm;
import defpackage.mmm;
import defpackage.pmm;
import defpackage.qmm;
import defpackage.vyc0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "Lqmm;", "Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;", "mode", "", "offlineLicenseKeySetId", "Lzy11;", "setMode", "(Lru/yandex/video/m3/player/drm/DrmSessionManagerMode;[B)V", "Landroidx/media3/common/a;", "format", "Ljmm;", "acquireSession", "(Landroidx/media3/common/a;)Ljmm;", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "delegate", "setMediaDrmCallbackDelegate", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExoDrmSessionManager extends qmm {
    jmm acquireSession(a format);

    @Override // defpackage.qmm
    /* synthetic */ jmm acquireSession(mmm mmmVar, a aVar);

    @Override // defpackage.qmm
    /* synthetic */ int getCryptoType(a aVar);

    @Override // defpackage.qmm
    /* bridge */ /* synthetic */ default pmm preacquireSession(mmm mmmVar, a aVar) {
        return pmm.Y1;
    }

    @Override // defpackage.qmm
    /* bridge */ /* synthetic */ default void prepare() {
    }

    @Override // defpackage.qmm
    /* bridge */ /* synthetic */ default void release() {
    }

    void setMediaDrmCallbackDelegate(MediaDrmCallbackDelegate delegate);

    void setMode(DrmSessionManagerMode mode, byte[] offlineLicenseKeySetId);

    @Override // defpackage.qmm
    /* synthetic */ void setPlayer(Looper looper, vyc0 vyc0Var);
}
