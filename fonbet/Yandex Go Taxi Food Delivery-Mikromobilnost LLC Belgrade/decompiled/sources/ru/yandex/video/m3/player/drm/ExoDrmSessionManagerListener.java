package ru.yandex.video.m3.player.drm;

import androidx.media3.common.a;
import defpackage.jmm;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "", "Ljmm;", "session", "Landroidx/media3/common/a;", "format", "Lzy11;", "onDrmSessionAcquired", "(Ljmm;Landroidx/media3/common/a;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExoDrmSessionManagerListener {
    void onDrmSessionAcquired(jmm session, a format);
}
