package ru.yandex.video.m3.player;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.TrackSelectionType;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/FirstPlaybackInfo;", "", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "Lru/yandex/video/m3/data/TrackSelectionType;", "videoTrackSelectionType", "<init>", "(Lru/yandex/video/m3/data/StartFromCacheInfo;Lru/yandex/video/m3/data/TrackSelectionType;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/FirstPlaybackInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/FirstPlaybackInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "getStartFromCacheInfo", "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "Lru/yandex/video/m3/data/TrackSelectionType;", "getVideoTrackSelectionType", "()Lru/yandex/video/m3/data/TrackSelectionType;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirstPlaybackInfo {
    public static final int $stable = 0;
    private final StartFromCacheInfo startFromCacheInfo;
    private final TrackSelectionType videoTrackSelectionType;

    private FirstPlaybackInfo(StartFromCacheInfo startFromCacheInfo, TrackSelectionType trackSelectionType) {
        this.startFromCacheInfo = startFromCacheInfo;
        this.videoTrackSelectionType = trackSelectionType;
    }

    public final FirstPlaybackInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FirstPlaybackInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        FirstPlaybackInfo firstPlaybackInfo = (FirstPlaybackInfo) other;
        return jl40.l(this.startFromCacheInfo, firstPlaybackInfo.startFromCacheInfo) && this.videoTrackSelectionType == firstPlaybackInfo.videoTrackSelectionType;
    }

    public final StartFromCacheInfo getStartFromCacheInfo() {
        return this.startFromCacheInfo;
    }

    public final TrackSelectionType getVideoTrackSelectionType() {
        return this.videoTrackSelectionType;
    }

    public int hashCode() {
        StartFromCacheInfo startFromCacheInfo = this.startFromCacheInfo;
        int hashCode = (startFromCacheInfo != null ? startFromCacheInfo.hashCode() : 0) * 31;
        TrackSelectionType trackSelectionType = this.videoTrackSelectionType;
        return hashCode + (trackSelectionType != null ? trackSelectionType.hashCode() : 0);
    }

    public String toString() {
        return "FirstPlaybackInfo(startFromCacheInfo=" + this.startFromCacheInfo + ", videoTrackSelectionType=" + this.videoTrackSelectionType + ')';
    }

    public /* synthetic */ FirstPlaybackInfo(StartFromCacheInfo startFromCacheInfo, TrackSelectionType trackSelectionType, DefaultConstructorMarker defaultConstructorMarker) {
        this(startFromCacheInfo, trackSelectionType);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/FirstPlaybackInfo$Builder;", "", "firstPlaybackInfo", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "(Lru/yandex/video/m3/player/FirstPlaybackInfo;)V", "startFromCacheInfo", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "videoTrackSelectionType", "Lru/yandex/video/m3/data/TrackSelectionType;", "(Lru/yandex/video/m3/data/StartFromCacheInfo;Lru/yandex/video/m3/data/TrackSelectionType;)V", "getStartFromCacheInfo", "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "setStartFromCacheInfo", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "getVideoTrackSelectionType", "()Lru/yandex/video/m3/data/TrackSelectionType;", "setVideoTrackSelectionType", "(Lru/yandex/video/m3/data/TrackSelectionType;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private StartFromCacheInfo startFromCacheInfo;
        private TrackSelectionType videoTrackSelectionType;

        public Builder(FirstPlaybackInfo firstPlaybackInfo) {
            this(firstPlaybackInfo.getStartFromCacheInfo(), firstPlaybackInfo.getVideoTrackSelectionType());
        }

        public final FirstPlaybackInfo build$video_player_internalRelease() {
            return new FirstPlaybackInfo(this.startFromCacheInfo, this.videoTrackSelectionType, null);
        }

        public final StartFromCacheInfo getStartFromCacheInfo() {
            return this.startFromCacheInfo;
        }

        public final TrackSelectionType getVideoTrackSelectionType() {
            return this.videoTrackSelectionType;
        }

        public final void setStartFromCacheInfo(StartFromCacheInfo startFromCacheInfo) {
            this.startFromCacheInfo = startFromCacheInfo;
        }

        public final void setVideoTrackSelectionType(TrackSelectionType trackSelectionType) {
            this.videoTrackSelectionType = trackSelectionType;
        }

        public Builder(StartFromCacheInfo startFromCacheInfo, TrackSelectionType trackSelectionType) {
            this.startFromCacheInfo = startFromCacheInfo;
            this.videoTrackSelectionType = trackSelectionType;
        }
    }
}
