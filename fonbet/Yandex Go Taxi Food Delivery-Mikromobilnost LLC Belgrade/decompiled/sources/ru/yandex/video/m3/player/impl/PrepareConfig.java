package ru.yandex.video.m3.player.impl;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.dto.VideoData;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/PrepareConfig;", "", "contentId", "", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "playbackParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/data/PlaybackParameters;)V", "getContentId", "()Ljava/lang/String;", "getPlaybackParameters", "()Lru/yandex/video/m3/data/PlaybackParameters;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PrepareConfig {
    public static final int $stable = 8;
    private final String contentId;
    private final PlaybackParameters playbackParameters;
    private final VideoData videoData;

    public /* synthetic */ PrepareConfig(String str, VideoData videoData, PlaybackParameters playbackParameters, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : videoData, (i & 4) != 0 ? null : playbackParameters);
    }

    public static /* synthetic */ PrepareConfig copy$default(PrepareConfig prepareConfig, String str, VideoData videoData, PlaybackParameters playbackParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepareConfig.contentId;
        }
        if ((i & 2) != 0) {
            videoData = prepareConfig.videoData;
        }
        if ((i & 4) != 0) {
            playbackParameters = prepareConfig.playbackParameters;
        }
        return prepareConfig.copy(str, videoData, playbackParameters);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoData getVideoData() {
        return this.videoData;
    }

    /* renamed from: component3, reason: from getter */
    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    public final PrepareConfig copy(String contentId, VideoData videoData, PlaybackParameters playbackParameters) {
        return new PrepareConfig(contentId, videoData, playbackParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PrepareConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PrepareConfig prepareConfig = (PrepareConfig) other;
        if (!jl40.l(this.contentId, prepareConfig.contentId) || !jl40.l(this.videoData, prepareConfig.videoData)) {
            return false;
        }
        PlaybackParameters playbackParameters = this.playbackParameters;
        Boolean valueOf = playbackParameters != null ? Boolean.valueOf(playbackParameters.getAutoPlay()) : null;
        PlaybackParameters playbackParameters2 = prepareConfig.playbackParameters;
        if (!jl40.l(valueOf, playbackParameters2 != null ? Boolean.valueOf(playbackParameters2.getAutoPlay()) : null)) {
            return false;
        }
        PlaybackParameters playbackParameters3 = this.playbackParameters;
        Long startPosition = playbackParameters3 != null ? playbackParameters3.getStartPosition() : null;
        PlaybackParameters playbackParameters4 = prepareConfig.playbackParameters;
        return jl40.l(startPosition, playbackParameters4 != null ? playbackParameters4.getStartPosition() : null);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    public final VideoData getVideoData() {
        return this.videoData;
    }

    public int hashCode() {
        Long startPosition;
        String str = this.contentId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VideoData videoData = this.videoData;
        int hashCode2 = (hashCode + (videoData != null ? videoData.hashCode() : 0)) * 31;
        PlaybackParameters playbackParameters = this.playbackParameters;
        int hashCode3 = (hashCode2 + (playbackParameters != null ? Boolean.valueOf(playbackParameters.getAutoPlay()).hashCode() : 0)) * 31;
        PlaybackParameters playbackParameters2 = this.playbackParameters;
        if (playbackParameters2 != null && (startPosition = playbackParameters2.getStartPosition()) != null) {
            i = startPosition.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "PrepareConfig(contentId=" + this.contentId + ", videoData=" + this.videoData + ", playbackParameters=" + this.playbackParameters + ')';
    }

    public PrepareConfig(String str, VideoData videoData, PlaybackParameters playbackParameters) {
        this.contentId = str;
        this.videoData = videoData;
        this.playbackParameters = playbackParameters;
    }

    public PrepareConfig() {
        this(null, null, null, 7, null);
    }
}
