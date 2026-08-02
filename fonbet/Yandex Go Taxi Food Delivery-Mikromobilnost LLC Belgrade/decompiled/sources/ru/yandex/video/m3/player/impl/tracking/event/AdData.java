package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.ysq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/AdData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "adPodsCount", "", "trackingAdType", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "(ILru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;)V", "getAdPodsCount", "()I", "getTrackingAdType", "()Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdData extends DefaultEventData {
    public static final int $stable = 0;

    @ysq0("adPodsCount")
    private final int adPodsCount;

    @ysq0("adType")
    private final TrackingAdType trackingAdType;

    public AdData(int i, TrackingAdType trackingAdType) {
        super(null, 1, null);
        this.adPodsCount = i;
        this.trackingAdType = trackingAdType;
    }

    public static /* synthetic */ AdData copy$default(AdData adData, int i, TrackingAdType trackingAdType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adData.adPodsCount;
        }
        if ((i2 & 2) != 0) {
            trackingAdType = adData.trackingAdType;
        }
        return adData.copy(i, trackingAdType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAdPodsCount() {
        return this.adPodsCount;
    }

    /* renamed from: component2, reason: from getter */
    public final TrackingAdType getTrackingAdType() {
        return this.trackingAdType;
    }

    public final AdData copy(int adPodsCount, TrackingAdType trackingAdType) {
        return new AdData(adPodsCount, trackingAdType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) other;
        return this.adPodsCount == adData.adPodsCount && this.trackingAdType == adData.trackingAdType;
    }

    public final int getAdPodsCount() {
        return this.adPodsCount;
    }

    public final TrackingAdType getTrackingAdType() {
        return this.trackingAdType;
    }

    public int hashCode() {
        return this.trackingAdType.hashCode() + (Integer.hashCode(this.adPodsCount) * 31);
    }

    public String toString() {
        return "AdData(adPodsCount=" + this.adPodsCount + ", trackingAdType=" + this.trackingAdType + ')';
    }
}
