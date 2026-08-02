package ru.yandex.video.m3.player.ui.debug.internal.model;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/model/TracksAndDecoders;", "", "videoTrackData", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "audioTrackData", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "subtitlesTrackData", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "videoDecoderData", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "audioDecoderData", "(Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;)V", "getAudioDecoderData", "()Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "getAudioTrackData", "()Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "getSubtitlesTrackData", "()Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "getVideoDecoderData", "getVideoTrackData", "()Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TracksAndDecoders {
    public static final int $stable = 0;
    private final DecoderData audioDecoderData;
    private final AudioTrackData audioTrackData;
    private final SubtitlesTrackData subtitlesTrackData;
    private final DecoderData videoDecoderData;
    private final VideoTrackData videoTrackData;

    public /* synthetic */ TracksAndDecoders(VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, DecoderData decoderData, DecoderData decoderData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoTrackData, (i & 2) != 0 ? null : audioTrackData, (i & 4) != 0 ? null : subtitlesTrackData, (i & 8) != 0 ? null : decoderData, (i & 16) != 0 ? null : decoderData2);
    }

    public static /* synthetic */ TracksAndDecoders copy$default(TracksAndDecoders tracksAndDecoders, VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, DecoderData decoderData, DecoderData decoderData2, int i, Object obj) {
        if ((i & 1) != 0) {
            videoTrackData = tracksAndDecoders.videoTrackData;
        }
        if ((i & 2) != 0) {
            audioTrackData = tracksAndDecoders.audioTrackData;
        }
        if ((i & 4) != 0) {
            subtitlesTrackData = tracksAndDecoders.subtitlesTrackData;
        }
        if ((i & 8) != 0) {
            decoderData = tracksAndDecoders.videoDecoderData;
        }
        if ((i & 16) != 0) {
            decoderData2 = tracksAndDecoders.audioDecoderData;
        }
        DecoderData decoderData3 = decoderData2;
        SubtitlesTrackData subtitlesTrackData2 = subtitlesTrackData;
        return tracksAndDecoders.copy(videoTrackData, audioTrackData, subtitlesTrackData2, decoderData, decoderData3);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoTrackData getVideoTrackData() {
        return this.videoTrackData;
    }

    /* renamed from: component2, reason: from getter */
    public final AudioTrackData getAudioTrackData() {
        return this.audioTrackData;
    }

    /* renamed from: component3, reason: from getter */
    public final SubtitlesTrackData getSubtitlesTrackData() {
        return this.subtitlesTrackData;
    }

    /* renamed from: component4, reason: from getter */
    public final DecoderData getVideoDecoderData() {
        return this.videoDecoderData;
    }

    /* renamed from: component5, reason: from getter */
    public final DecoderData getAudioDecoderData() {
        return this.audioDecoderData;
    }

    public final TracksAndDecoders copy(VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, DecoderData videoDecoderData, DecoderData audioDecoderData) {
        return new TracksAndDecoders(videoTrackData, audioTrackData, subtitlesTrackData, videoDecoderData, audioDecoderData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TracksAndDecoders)) {
            return false;
        }
        TracksAndDecoders tracksAndDecoders = (TracksAndDecoders) other;
        return jl40.l(this.videoTrackData, tracksAndDecoders.videoTrackData) && jl40.l(this.audioTrackData, tracksAndDecoders.audioTrackData) && jl40.l(this.subtitlesTrackData, tracksAndDecoders.subtitlesTrackData) && jl40.l(this.videoDecoderData, tracksAndDecoders.videoDecoderData) && jl40.l(this.audioDecoderData, tracksAndDecoders.audioDecoderData);
    }

    public final DecoderData getAudioDecoderData() {
        return this.audioDecoderData;
    }

    public final AudioTrackData getAudioTrackData() {
        return this.audioTrackData;
    }

    public final SubtitlesTrackData getSubtitlesTrackData() {
        return this.subtitlesTrackData;
    }

    public final DecoderData getVideoDecoderData() {
        return this.videoDecoderData;
    }

    public final VideoTrackData getVideoTrackData() {
        return this.videoTrackData;
    }

    public int hashCode() {
        VideoTrackData videoTrackData = this.videoTrackData;
        int hashCode = (videoTrackData == null ? 0 : videoTrackData.hashCode()) * 31;
        AudioTrackData audioTrackData = this.audioTrackData;
        int hashCode2 = (hashCode + (audioTrackData == null ? 0 : audioTrackData.hashCode())) * 31;
        SubtitlesTrackData subtitlesTrackData = this.subtitlesTrackData;
        int hashCode3 = (hashCode2 + (subtitlesTrackData == null ? 0 : subtitlesTrackData.hashCode())) * 31;
        DecoderData decoderData = this.videoDecoderData;
        int hashCode4 = (hashCode3 + (decoderData == null ? 0 : decoderData.hashCode())) * 31;
        DecoderData decoderData2 = this.audioDecoderData;
        return hashCode4 + (decoderData2 != null ? decoderData2.hashCode() : 0);
    }

    public String toString() {
        return "TracksAndDecoders(videoTrackData=" + this.videoTrackData + ", audioTrackData=" + this.audioTrackData + ", subtitlesTrackData=" + this.subtitlesTrackData + ", videoDecoderData=" + this.videoDecoderData + ", audioDecoderData=" + this.audioDecoderData + ')';
    }

    public TracksAndDecoders(VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, DecoderData decoderData, DecoderData decoderData2) {
        this.videoTrackData = videoTrackData;
        this.audioTrackData = audioTrackData;
        this.subtitlesTrackData = subtitlesTrackData;
        this.videoDecoderData = decoderData;
        this.audioDecoderData = decoderData2;
    }

    public TracksAndDecoders() {
        this(null, null, null, null, null, 31, null);
    }
}
