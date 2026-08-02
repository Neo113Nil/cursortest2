package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.PlaybackStats;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001:\u0001MB£\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u00002\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b/\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b\b\u00101R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b\t\u00103R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b4\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b8\u00103R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b9\u0010,R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b:\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010,¨\u0006N"}, d2 = {"Lru/yandex/video/m3/data/PlaybackStats;", "", "", "bufferedPosition", "liveOffset", "targetLiveOffset", "liveEdgePosition", "", "isInLive", "isPlaying", "playbackPosition", "Lru/yandex/video/m3/data/VideoType;", "videoType", "willPlayWhenReady", "windowDuration", "maxTargetBufferMs", "Lru/yandex/video/m3/data/DrmType;", "drmType", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "Lru/yandex/video/m3/data/Decoder;", "videoDecoder", "audioDecoder", "actualLiveOffset", "", "exoPlayerPlaybackState", "<init>", "(JJJJLjava/lang/Boolean;ZJLru/yandex/video/m3/data/VideoType;ZJJLru/yandex/video/m3/data/DrmType;Lru/yandex/video/m3/data/Size;Lru/yandex/video/m3/data/Decoder;Lru/yandex/video/m3/data/Decoder;Ljava/lang/Long;Ljava/lang/Integer;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/PlaybackStats$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/PlaybackStats;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getBufferedPosition", "()J", "getLiveOffset", "getTargetLiveOffset", "getLiveEdgePosition", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "()Z", "getPlaybackPosition", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "getWillPlayWhenReady", "getWindowDuration", "getMaxTargetBufferMs", "Lru/yandex/video/m3/data/DrmType;", "getDrmType", "()Lru/yandex/video/m3/data/DrmType;", "Lru/yandex/video/m3/data/Size;", "getSurfaceSize", "()Lru/yandex/video/m3/data/Size;", "Lru/yandex/video/m3/data/Decoder;", "getVideoDecoder", "()Lru/yandex/video/m3/data/Decoder;", "getAudioDecoder", "Ljava/lang/Long;", "getActualLiveOffset", "()Ljava/lang/Long;", "Ljava/lang/Integer;", "getExoPlayerPlaybackState$video_player_internalRelease", "()Ljava/lang/Integer;", "getRemainingBufferedTime", "remainingBufferedTime", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackStats {
    public static final int $stable = 0;
    private final Long actualLiveOffset;
    private final Decoder audioDecoder;
    private final long bufferedPosition;
    private final DrmType drmType;
    private final Integer exoPlayerPlaybackState;
    private final Boolean isInLive;
    private final boolean isPlaying;
    private final long liveEdgePosition;
    private final long liveOffset;
    private final long maxTargetBufferMs;
    private final long playbackPosition;
    private final Size surfaceSize;
    private final long targetLiveOffset;
    private final Decoder videoDecoder;
    private final VideoType videoType;
    private final boolean willPlayWhenReady;
    private final long windowDuration;

    private PlaybackStats(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType, Size size, Decoder decoder, Decoder decoder2, Long l, Integer num) {
        this.bufferedPosition = j;
        this.liveOffset = j2;
        this.targetLiveOffset = j3;
        this.liveEdgePosition = j4;
        this.isInLive = bool;
        this.isPlaying = z;
        this.playbackPosition = j5;
        this.videoType = videoType;
        this.willPlayWhenReady = z2;
        this.windowDuration = j6;
        this.maxTargetBufferMs = j7;
        this.drmType = drmType;
        this.surfaceSize = size;
        this.videoDecoder = decoder;
        this.audioDecoder = decoder2;
        this.actualLiveOffset = l;
        this.exoPlayerPlaybackState = num;
    }

    public static /* synthetic */ PlaybackStats copy$default(PlaybackStats playbackStats, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.PlaybackStats$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlaybackStats.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlaybackStats.Builder builder) {
                }
            };
        }
        return playbackStats.copy(tlsVar);
    }

    public final PlaybackStats copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlaybackStats.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PlaybackStats playbackStats = (PlaybackStats) other;
        return this.bufferedPosition == playbackStats.bufferedPosition && this.liveOffset == playbackStats.liveOffset && this.targetLiveOffset == playbackStats.targetLiveOffset && this.liveEdgePosition == playbackStats.liveEdgePosition && jl40.l(this.isInLive, playbackStats.isInLive) && this.isPlaying == playbackStats.isPlaying && this.playbackPosition == playbackStats.playbackPosition && this.videoType == playbackStats.videoType && this.willPlayWhenReady == playbackStats.willPlayWhenReady && this.windowDuration == playbackStats.windowDuration && this.maxTargetBufferMs == playbackStats.maxTargetBufferMs && this.drmType == playbackStats.drmType && jl40.l(this.surfaceSize, playbackStats.surfaceSize) && jl40.l(this.videoDecoder, playbackStats.videoDecoder) && jl40.l(this.audioDecoder, playbackStats.audioDecoder) && jl40.l(this.actualLiveOffset, playbackStats.actualLiveOffset) && jl40.l(this.exoPlayerPlaybackState, playbackStats.exoPlayerPlaybackState);
    }

    public final Long getActualLiveOffset() {
        return this.actualLiveOffset;
    }

    public final Decoder getAudioDecoder() {
        return this.audioDecoder;
    }

    public final long getBufferedPosition() {
        return this.bufferedPosition;
    }

    public final DrmType getDrmType() {
        return this.drmType;
    }

    /* renamed from: getExoPlayerPlaybackState$video_player_internalRelease, reason: from getter */
    public final Integer getExoPlayerPlaybackState() {
        return this.exoPlayerPlaybackState;
    }

    public final long getLiveEdgePosition() {
        return this.liveEdgePosition;
    }

    public final long getLiveOffset() {
        return this.liveOffset;
    }

    public final long getMaxTargetBufferMs() {
        return this.maxTargetBufferMs;
    }

    public final long getPlaybackPosition() {
        return this.playbackPosition;
    }

    public final long getRemainingBufferedTime() {
        long j = this.bufferedPosition;
        if (j >= 0) {
            long j2 = this.playbackPosition;
            if (j2 >= 0) {
                return j - j2;
            }
        }
        return 0L;
    }

    public final Size getSurfaceSize() {
        return this.surfaceSize;
    }

    public final long getTargetLiveOffset() {
        return this.targetLiveOffset;
    }

    public final Decoder getVideoDecoder() {
        return this.videoDecoder;
    }

    public final VideoType getVideoType() {
        return this.videoType;
    }

    public final boolean getWillPlayWhenReady() {
        return this.willPlayWhenReady;
    }

    public final long getWindowDuration() {
        return this.windowDuration;
    }

    public int hashCode() {
        int c = qv10.c(qv10.c(qv10.c(Long.hashCode(this.bufferedPosition) * 31, 31, this.liveOffset), 31, this.targetLiveOffset), 31, this.liveEdgePosition);
        Boolean bool = this.isInLive;
        int c2 = qv10.c(unr0.e((c + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.isPlaying), 31, this.playbackPosition);
        VideoType videoType = this.videoType;
        int c3 = qv10.c(qv10.c(unr0.e((c2 + (videoType != null ? videoType.hashCode() : 0)) * 31, 31, this.willPlayWhenReady), 31, this.windowDuration), 31, this.maxTargetBufferMs);
        DrmType drmType = this.drmType;
        int hashCode = (c3 + (drmType != null ? drmType.hashCode() : 0)) * 31;
        Size size = this.surfaceSize;
        int hashCode2 = (hashCode + (size != null ? size.hashCode() : 0)) * 31;
        Decoder decoder = this.videoDecoder;
        int hashCode3 = (hashCode2 + (decoder != null ? decoder.hashCode() : 0)) * 31;
        Decoder decoder2 = this.audioDecoder;
        int hashCode4 = (hashCode3 + (decoder2 != null ? decoder2.hashCode() : 0)) * 31;
        Long l = this.actualLiveOffset;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.exoPlayerPlaybackState;
        return hashCode5 + (num != null ? num.intValue() : 0);
    }

    /* renamed from: isInLive, reason: from getter */
    public final Boolean getIsInLive() {
        return this.isInLive;
    }

    /* renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackStats(bufferedPosition=");
        sb.append(this.bufferedPosition);
        sb.append(", liveOffset=");
        sb.append(this.liveOffset);
        sb.append(", targetLiveOffset=");
        sb.append(this.targetLiveOffset);
        sb.append(", liveEdgePosition=");
        sb.append(this.liveEdgePosition);
        sb.append(", isInLive=");
        sb.append(this.isInLive);
        sb.append(", isPlaying=");
        sb.append(this.isPlaying);
        sb.append(", playbackPosition=");
        sb.append(this.playbackPosition);
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", willPlayWhenReady=");
        sb.append(this.willPlayWhenReady);
        sb.append(", windowDuration=");
        sb.append(this.windowDuration);
        sb.append(", maxTargetBufferMs=");
        sb.append(this.maxTargetBufferMs);
        sb.append(", drmType=");
        sb.append(this.drmType);
        sb.append(", surfaceSize=");
        sb.append(this.surfaceSize);
        sb.append(", videoDecoder=");
        sb.append(this.videoDecoder);
        sb.append(", audioDecoder=");
        sb.append(this.audioDecoder);
        sb.append(", actualLiveOffset=");
        sb.append(this.actualLiveOffset);
        sb.append(", exoPlayerPlaybackState=");
        return vfc.o(sb, this.exoPlayerPlaybackState, ')');
    }

    public /* synthetic */ PlaybackStats(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType, Size size, Decoder decoder, Decoder decoder2, Long l, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, bool, z, j5, videoType, z2, j6, j7, drmType, size, decoder, decoder2, l, num);
    }

    public /* synthetic */ PlaybackStats(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType, Size size, Decoder decoder, Decoder decoder2, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, bool, z, j5, videoType, z2, j6, j7, drmType, size, decoder, decoder2, l, (i & 65536) != 0 ? null : num);
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bm\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\r\u0010S\u001a\u00020\u0003H\u0000¢\u0006\u0002\bTR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b\n\u00101\"\u0004\b2\u00103R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u00105\"\u0004\b6\u00107R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010#\"\u0004\b?\u0010%R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010#\"\u0004\bG\u0010%R\u001c\u0010H\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00105\"\u0004\bP\u00107R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010#\"\u0004\bR\u0010%¨\u0006U"}, d2 = {"Lru/yandex/video/m3/data/PlaybackStats$Builder;", "", "playbackStats", "Lru/yandex/video/m3/data/PlaybackStats;", "(Lru/yandex/video/m3/data/PlaybackStats;)V", "bufferedPosition", "", "liveOffset", "targetLiveOffset", "liveEdgePosition", "isInLive", "", "isPlaying", "playbackPosition", "videoType", "Lru/yandex/video/m3/data/VideoType;", "willPlayWhenReady", "windowDuration", "maxTargetBufferMs", "drmType", "Lru/yandex/video/m3/data/DrmType;", "(JJJJLjava/lang/Boolean;ZJLru/yandex/video/m3/data/VideoType;ZJJLru/yandex/video/m3/data/DrmType;)V", "actualLiveOffset", "getActualLiveOffset", "()Ljava/lang/Long;", "setActualLiveOffset", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "audioDecoder", "Lru/yandex/video/m3/data/Decoder;", "getAudioDecoder", "()Lru/yandex/video/m3/data/Decoder;", "setAudioDecoder", "(Lru/yandex/video/m3/data/Decoder;)V", "getBufferedPosition", "()J", "setBufferedPosition", "(J)V", "getDrmType", "()Lru/yandex/video/m3/data/DrmType;", "setDrmType", "(Lru/yandex/video/m3/data/DrmType;)V", "exoPlayerPlaybackState", "", "getExoPlayerPlaybackState", "()Ljava/lang/Integer;", "setExoPlayerPlaybackState", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setInLive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setPlaying", "(Z)V", "getLiveEdgePosition", "setLiveEdgePosition", "getLiveOffset", "setLiveOffset", "getMaxTargetBufferMs", "setMaxTargetBufferMs", "getPlaybackPosition", "setPlaybackPosition", "surfaceSize", "Lru/yandex/video/m3/data/Size;", "getSurfaceSize", "()Lru/yandex/video/m3/data/Size;", "setSurfaceSize", "(Lru/yandex/video/m3/data/Size;)V", "getTargetLiveOffset", "setTargetLiveOffset", "videoDecoder", "getVideoDecoder", "setVideoDecoder", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "setVideoType", "(Lru/yandex/video/m3/data/VideoType;)V", "getWillPlayWhenReady", "setWillPlayWhenReady", "getWindowDuration", "setWindowDuration", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long actualLiveOffset;
        private Decoder audioDecoder;
        private long bufferedPosition;
        private DrmType drmType;
        private Integer exoPlayerPlaybackState;
        private Boolean isInLive;
        private boolean isPlaying;
        private long liveEdgePosition;
        private long liveOffset;
        private long maxTargetBufferMs;
        private long playbackPosition;
        private Size surfaceSize;
        private long targetLiveOffset;
        private Decoder videoDecoder;
        private VideoType videoType;
        private boolean willPlayWhenReady;
        private long windowDuration;

        public Builder(PlaybackStats playbackStats) {
            this(playbackStats.getBufferedPosition(), playbackStats.getLiveOffset(), playbackStats.getTargetLiveOffset(), playbackStats.getLiveEdgePosition(), playbackStats.getIsInLive(), playbackStats.getIsPlaying(), playbackStats.getPlaybackPosition(), playbackStats.getVideoType(), playbackStats.getWillPlayWhenReady(), playbackStats.getWindowDuration(), playbackStats.getMaxTargetBufferMs(), playbackStats.getDrmType());
            this.surfaceSize = playbackStats.getSurfaceSize();
            this.videoDecoder = playbackStats.getVideoDecoder();
            this.audioDecoder = playbackStats.getAudioDecoder();
            this.actualLiveOffset = playbackStats.getActualLiveOffset();
            this.exoPlayerPlaybackState = playbackStats.getExoPlayerPlaybackState();
        }

        public final PlaybackStats build$video_player_internalRelease() {
            return new PlaybackStats(this.bufferedPosition, this.liveOffset, this.targetLiveOffset, this.liveEdgePosition, this.isInLive, this.isPlaying, this.playbackPosition, this.videoType, this.willPlayWhenReady, this.windowDuration, this.maxTargetBufferMs, this.drmType, this.surfaceSize, this.videoDecoder, this.audioDecoder, this.actualLiveOffset, this.exoPlayerPlaybackState, null);
        }

        public final Long getActualLiveOffset() {
            return this.actualLiveOffset;
        }

        public final Decoder getAudioDecoder() {
            return this.audioDecoder;
        }

        public final long getBufferedPosition() {
            return this.bufferedPosition;
        }

        public final DrmType getDrmType() {
            return this.drmType;
        }

        public final Integer getExoPlayerPlaybackState() {
            return this.exoPlayerPlaybackState;
        }

        public final long getLiveEdgePosition() {
            return this.liveEdgePosition;
        }

        public final long getLiveOffset() {
            return this.liveOffset;
        }

        public final long getMaxTargetBufferMs() {
            return this.maxTargetBufferMs;
        }

        public final long getPlaybackPosition() {
            return this.playbackPosition;
        }

        public final Size getSurfaceSize() {
            return this.surfaceSize;
        }

        public final long getTargetLiveOffset() {
            return this.targetLiveOffset;
        }

        public final Decoder getVideoDecoder() {
            return this.videoDecoder;
        }

        public final VideoType getVideoType() {
            return this.videoType;
        }

        public final boolean getWillPlayWhenReady() {
            return this.willPlayWhenReady;
        }

        public final long getWindowDuration() {
            return this.windowDuration;
        }

        /* renamed from: isInLive, reason: from getter */
        public final Boolean getIsInLive() {
            return this.isInLive;
        }

        /* renamed from: isPlaying, reason: from getter */
        public final boolean getIsPlaying() {
            return this.isPlaying;
        }

        public final void setActualLiveOffset(Long l) {
            this.actualLiveOffset = l;
        }

        public final void setAudioDecoder(Decoder decoder) {
            this.audioDecoder = decoder;
        }

        public final void setBufferedPosition(long j) {
            this.bufferedPosition = j;
        }

        public final void setDrmType(DrmType drmType) {
            this.drmType = drmType;
        }

        public final void setExoPlayerPlaybackState(Integer num) {
            this.exoPlayerPlaybackState = num;
        }

        public final void setInLive(Boolean bool) {
            this.isInLive = bool;
        }

        public final void setLiveEdgePosition(long j) {
            this.liveEdgePosition = j;
        }

        public final void setLiveOffset(long j) {
            this.liveOffset = j;
        }

        public final void setMaxTargetBufferMs(long j) {
            this.maxTargetBufferMs = j;
        }

        public final void setPlaybackPosition(long j) {
            this.playbackPosition = j;
        }

        public final void setPlaying(boolean z) {
            this.isPlaying = z;
        }

        public final void setSurfaceSize(Size size) {
            this.surfaceSize = size;
        }

        public final void setTargetLiveOffset(long j) {
            this.targetLiveOffset = j;
        }

        public final void setVideoDecoder(Decoder decoder) {
            this.videoDecoder = decoder;
        }

        public final void setVideoType(VideoType videoType) {
            this.videoType = videoType;
        }

        public final void setWillPlayWhenReady(boolean z) {
            this.willPlayWhenReady = z;
        }

        public final void setWindowDuration(long j) {
            this.windowDuration = j;
        }

        public Builder(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType) {
            this.bufferedPosition = j;
            this.liveOffset = j2;
            this.targetLiveOffset = j3;
            this.liveEdgePosition = j4;
            this.isInLive = bool;
            this.isPlaying = z;
            this.playbackPosition = j5;
            this.videoType = videoType;
            this.willPlayWhenReady = z2;
            this.windowDuration = j6;
            this.maxTargetBufferMs = j7;
            this.drmType = drmType;
        }
    }
}
