package ru.yandex.video.m3.playback.features;

import defpackage.jl40;
import defpackage.smw0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B;\b\u0002\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/playback/features/CodecsInfo;", "", "videoCodecs", "", "", "", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "audioCodecs", "Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "(Ljava/util/Map;Ljava/util/Map;)V", "getAudioCodecs", "()Ljava/util/Map;", "getVideoCodecs", "equals", "", "other", "hashCode", "", "toString", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecsInfo {
    public static final int $stable = 8;
    private final Map<String, List<AudioCodecInfo>> audioCodecs;
    private final Map<String, List<VideoCodecInfo>> videoCodecs;

    /* JADX WARN: Multi-variable type inference failed */
    private CodecsInfo(Map<String, ? extends List<VideoCodecInfo>> map, Map<String, ? extends List<AudioCodecInfo>> map2) {
        this.videoCodecs = map;
        this.audioCodecs = map2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!CodecsInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        CodecsInfo codecsInfo = (CodecsInfo) other;
        return jl40.l(this.videoCodecs, codecsInfo.videoCodecs) && jl40.l(this.audioCodecs, codecsInfo.audioCodecs);
    }

    public final Map<String, List<AudioCodecInfo>> getAudioCodecs() {
        return this.audioCodecs;
    }

    public final Map<String, List<VideoCodecInfo>> getVideoCodecs() {
        return this.videoCodecs;
    }

    public int hashCode() {
        return this.audioCodecs.hashCode() + (this.videoCodecs.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CodecsInfo(videoCodecs=");
        sb.append(this.videoCodecs);
        sb.append(", audioCodecs=");
        return smw0.n(sb, this.audioCodecs, ')');
    }

    public /* synthetic */ CodecsInfo(Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, map2);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B;\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0006¢\u0006\u0002\u0010\fJ\r\u0010\u0013\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0014R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/playback/features/CodecsInfo$Builder;", "", "codecsInfo", "Lru/yandex/video/m3/playback/features/CodecsInfo;", "(Lru/yandex/video/m3/playback/features/CodecsInfo;)V", "videoCodecs", "", "", "", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "audioCodecs", "Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "(Ljava/util/Map;Ljava/util/Map;)V", "getAudioCodecs", "()Ljava/util/Map;", "setAudioCodecs", "(Ljava/util/Map;)V", "getVideoCodecs", "setVideoCodecs", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Map<String, ? extends List<AudioCodecInfo>> audioCodecs;
        private Map<String, ? extends List<VideoCodecInfo>> videoCodecs;

        public Builder(CodecsInfo codecsInfo) {
            this(codecsInfo.getVideoCodecs(), codecsInfo.getAudioCodecs());
        }

        public final CodecsInfo build$video_player_internalRelease() {
            return new CodecsInfo(this.videoCodecs, this.audioCodecs, null);
        }

        public final Map<String, List<AudioCodecInfo>> getAudioCodecs() {
            return this.audioCodecs;
        }

        public final Map<String, List<VideoCodecInfo>> getVideoCodecs() {
            return this.videoCodecs;
        }

        public final void setAudioCodecs(Map<String, ? extends List<AudioCodecInfo>> map) {
            this.audioCodecs = map;
        }

        public final void setVideoCodecs(Map<String, ? extends List<VideoCodecInfo>> map) {
            this.videoCodecs = map;
        }

        public Builder(Map<String, ? extends List<VideoCodecInfo>> map, Map<String, ? extends List<AudioCodecInfo>> map2) {
            this.videoCodecs = map;
            this.audioCodecs = map2;
        }
    }
}
