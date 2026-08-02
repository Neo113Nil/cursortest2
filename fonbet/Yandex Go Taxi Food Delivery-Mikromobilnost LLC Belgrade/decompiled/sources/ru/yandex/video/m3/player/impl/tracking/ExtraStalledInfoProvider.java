package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProvider;", "", "externalStalledDuration", "", "Lru/yandex/video/m3/data/Milliseconds;", "getExternalStalledDuration", "()Ljava/lang/Long;", "extraInternalStalledDuration", "getExtraInternalStalledDuration", "()J", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExtraStalledInfoProvider {
    Long getExternalStalledDuration();

    long getExtraInternalStalledDuration();
}
