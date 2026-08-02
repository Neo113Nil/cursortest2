package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.jl40;
import defpackage.vfc;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/LoadCancelData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", ClidProvider.STATE, "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/tracks/TrackType;", "quality", "", "(Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "getQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getState", "()Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "getTrackType", "()Lru/yandex/video/m3/player/tracks/TrackType;", "component1", "component2", "component3", "copy", "(Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)Lru/yandex/video/m3/player/impl/tracking/event/LoadCancelData;", "equals", "", "other", "", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LoadCancelData extends DefaultEventData {
    public static final int $stable = 0;
    private final Integer quality;
    private final PlayerAliveState state;
    private final TrackType trackType;

    public LoadCancelData(PlayerAliveState playerAliveState, TrackType trackType, Integer num) {
        super(null, 1, null);
        this.state = playerAliveState;
        this.trackType = trackType;
        this.quality = num;
    }

    public static /* synthetic */ LoadCancelData copy$default(LoadCancelData loadCancelData, PlayerAliveState playerAliveState, TrackType trackType, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            playerAliveState = loadCancelData.state;
        }
        if ((i & 2) != 0) {
            trackType = loadCancelData.trackType;
        }
        if ((i & 4) != 0) {
            num = loadCancelData.quality;
        }
        return loadCancelData.copy(playerAliveState, trackType, num);
    }

    /* renamed from: component1, reason: from getter */
    public final PlayerAliveState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final TrackType getTrackType() {
        return this.trackType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getQuality() {
        return this.quality;
    }

    public final LoadCancelData copy(PlayerAliveState state, TrackType trackType, Integer quality) {
        return new LoadCancelData(state, trackType, quality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadCancelData)) {
            return false;
        }
        LoadCancelData loadCancelData = (LoadCancelData) other;
        return jl40.l(this.state, loadCancelData.state) && this.trackType == loadCancelData.trackType && jl40.l(this.quality, loadCancelData.quality);
    }

    public final Integer getQuality() {
        return this.quality;
    }

    public final PlayerAliveState getState() {
        return this.state;
    }

    public final TrackType getTrackType() {
        return this.trackType;
    }

    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        TrackType trackType = this.trackType;
        int hashCode2 = (hashCode + (trackType == null ? 0 : trackType.hashCode())) * 31;
        Integer num = this.quality;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadCancelData(state=");
        sb.append(this.state);
        sb.append(", trackType=");
        sb.append(this.trackType);
        sb.append(", quality=");
        return vfc.o(sb, this.quality, ')');
    }
}
