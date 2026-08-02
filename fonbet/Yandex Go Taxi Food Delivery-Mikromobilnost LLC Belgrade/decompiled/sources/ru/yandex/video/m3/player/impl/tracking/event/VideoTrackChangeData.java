package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackChangeData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "previous", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "next", "(Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;)V", "getNext", "()Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "getPrevious", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoTrackChangeData extends DefaultEventData {
    public static final int $stable = 0;
    private final VideoTrackData next;
    private final VideoTrackData previous;

    public VideoTrackChangeData(VideoTrackData videoTrackData, VideoTrackData videoTrackData2) {
        super(null, 1, null);
        this.previous = videoTrackData;
        this.next = videoTrackData2;
    }

    public static /* synthetic */ VideoTrackChangeData copy$default(VideoTrackChangeData videoTrackChangeData, VideoTrackData videoTrackData, VideoTrackData videoTrackData2, int i, Object obj) {
        if ((i & 1) != 0) {
            videoTrackData = videoTrackChangeData.previous;
        }
        if ((i & 2) != 0) {
            videoTrackData2 = videoTrackChangeData.next;
        }
        return videoTrackChangeData.copy(videoTrackData, videoTrackData2);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoTrackData getPrevious() {
        return this.previous;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoTrackData getNext() {
        return this.next;
    }

    public final VideoTrackChangeData copy(VideoTrackData previous, VideoTrackData next) {
        return new VideoTrackChangeData(previous, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTrackChangeData)) {
            return false;
        }
        VideoTrackChangeData videoTrackChangeData = (VideoTrackChangeData) other;
        return jl40.l(this.previous, videoTrackChangeData.previous) && jl40.l(this.next, videoTrackChangeData.next);
    }

    public final VideoTrackData getNext() {
        return this.next;
    }

    public final VideoTrackData getPrevious() {
        return this.previous;
    }

    public int hashCode() {
        return this.next.hashCode() + (this.previous.hashCode() * 31);
    }

    public String toString() {
        return "VideoTrackChangeData(previous=" + this.previous + ", next=" + this.next + ')';
    }
}
