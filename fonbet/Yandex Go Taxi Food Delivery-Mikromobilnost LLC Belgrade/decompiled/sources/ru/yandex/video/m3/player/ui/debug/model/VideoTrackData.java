package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "Lru/yandex/video/m3/player/ui/debug/model/TrackData;", "title", "", "bitrate", "", "resolution", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/video/m3/player/ui/debug/model/Size;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResolution", "()Lru/yandex/video/m3/player/ui/debug/model/Size;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/video/m3/player/ui/debug/model/Size;)Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "equals", "", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoTrackData implements TrackData {
    public static final int $stable = 0;
    private final Integer bitrate;
    private final Size resolution;
    private final String title;

    public VideoTrackData(String str, Integer num, Size size) {
        this.title = str;
        this.bitrate = num;
        this.resolution = size;
    }

    public static /* synthetic */ VideoTrackData copy$default(VideoTrackData videoTrackData, String str, Integer num, Size size, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoTrackData.title;
        }
        if ((i & 2) != 0) {
            num = videoTrackData.bitrate;
        }
        if ((i & 4) != 0) {
            size = videoTrackData.resolution;
        }
        return videoTrackData.copy(str, num, size);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    /* renamed from: component3, reason: from getter */
    public final Size getResolution() {
        return this.resolution;
    }

    public final VideoTrackData copy(String title, Integer bitrate, Size resolution) {
        return new VideoTrackData(title, bitrate, resolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTrackData)) {
            return false;
        }
        VideoTrackData videoTrackData = (VideoTrackData) other;
        return jl40.l(this.title, videoTrackData.title) && jl40.l(this.bitrate, videoTrackData.bitrate) && jl40.l(this.resolution, videoTrackData.resolution);
    }

    @Override // ru.yandex.video.m3.player.ui.debug.model.TrackData
    public Integer getBitrate() {
        return this.bitrate;
    }

    public final Size getResolution() {
        return this.resolution;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.model.TrackData
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bitrate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Size size = this.resolution;
        return hashCode2 + (size != null ? size.hashCode() : 0);
    }

    public String toString() {
        return "VideoTrackData(title=" + this.title + ", bitrate=" + this.bitrate + ", resolution=" + this.resolution + ')';
    }
}
