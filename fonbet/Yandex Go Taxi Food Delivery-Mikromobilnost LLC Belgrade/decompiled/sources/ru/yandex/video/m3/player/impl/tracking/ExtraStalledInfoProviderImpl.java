package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u00060\u0004j\u0002`\u00058VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProvider;", "()V", "externalStalledDuration", "", "Lru/yandex/video/m3/data/Milliseconds;", "getExternalStalledDuration", "()Ljava/lang/Long;", "setExternalStalledDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "extraInternalStalledDuration", "getExtraInternalStalledDuration", "()J", "setExtraInternalStalledDuration", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtraStalledInfoProviderImpl implements ExtraStalledInfoProvider {
    public static final int $stable = 8;
    private Long externalStalledDuration;
    private long extraInternalStalledDuration;

    @Override // ru.yandex.video.m3.player.impl.tracking.ExtraStalledInfoProvider
    public Long getExternalStalledDuration() {
        Long l = this.externalStalledDuration;
        this.externalStalledDuration = null;
        return l;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.ExtraStalledInfoProvider
    public long getExtraInternalStalledDuration() {
        long j = this.extraInternalStalledDuration;
        this.extraInternalStalledDuration = 0L;
        return j;
    }

    public void setExternalStalledDuration(Long l) {
        this.externalStalledDuration = l;
    }

    public void setExtraInternalStalledDuration(long j) {
        this.extraInternalStalledDuration = j;
    }
}
