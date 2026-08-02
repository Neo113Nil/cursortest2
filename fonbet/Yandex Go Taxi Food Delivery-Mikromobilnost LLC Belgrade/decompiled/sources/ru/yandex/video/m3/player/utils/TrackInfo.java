package ru.yandex.video.m3.player.utils;

import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/utils/TrackInfo;", "", "variant", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "(Lru/yandex/video/m3/player/tracks/TrackVariant;Lru/yandex/video/m3/player/tracks/TrackFormat;)V", "getFormat", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "getVariant", "()Lru/yandex/video/m3/player/tracks/TrackVariant;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrackInfo {
    public static final int $stable = 8;
    private final TrackFormat format;
    private final TrackVariant variant;

    public TrackInfo(TrackVariant trackVariant, TrackFormat trackFormat) {
        this.variant = trackVariant;
        this.format = trackFormat;
    }

    public static /* synthetic */ TrackInfo copy$default(TrackInfo trackInfo, TrackVariant trackVariant, TrackFormat trackFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            trackVariant = trackInfo.variant;
        }
        if ((i & 2) != 0) {
            trackFormat = trackInfo.format;
        }
        return trackInfo.copy(trackVariant, trackFormat);
    }

    /* renamed from: component1, reason: from getter */
    public final TrackVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component2, reason: from getter */
    public final TrackFormat getFormat() {
        return this.format;
    }

    public final TrackInfo copy(TrackVariant variant, TrackFormat format) {
        return new TrackInfo(variant, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackInfo)) {
            return false;
        }
        TrackInfo trackInfo = (TrackInfo) other;
        return jl40.l(this.variant, trackInfo.variant) && jl40.l(this.format, trackInfo.format);
    }

    public final TrackFormat getFormat() {
        return this.format;
    }

    public final TrackVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return this.format.hashCode() + (this.variant.hashCode() * 31);
    }

    public String toString() {
        return "TrackInfo(variant=" + this.variant + ", format=" + this.format + ')';
    }
}
