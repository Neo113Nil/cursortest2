package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.k5r;
import defpackage.kzj;
import defpackage.m7l;
import defpackage.tlm;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB£\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u00002\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b/\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b\b\u00101R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b\t\u00103R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b4\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b8\u00103R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b9\u0010,R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b:\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010,¨\u0006M"}, d2 = {"Lru/yandex/video/m3/data/PlaybackStats;", "", "", "bufferedPosition", "liveOffset", "targetLiveOffset", "liveEdgePosition", "", "isInLive", "isPlaying", "playbackPosition", "Lru/yandex/video/m3/data/VideoType;", "videoType", "willPlayWhenReady", "windowDuration", "maxTargetBufferMs", "Lru/yandex/video/m3/data/DrmType;", "drmType", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "Lru/yandex/video/m3/data/Decoder;", "videoDecoder", "audioDecoder", "actualLiveOffset", "", "exoPlayerPlaybackState", "<init>", "(JJJJLjava/lang/Boolean;ZJLru/yandex/video/m3/data/VideoType;ZJJLru/yandex/video/m3/data/DrmType;Lru/yandex/video/m3/data/Size;Lru/yandex/video/m3/data/Decoder;Lru/yandex/video/m3/data/Decoder;Ljava/lang/Long;Ljava/lang/Integer;)V", "Lkotlin/Function1;", "Lm7l;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/data/PlaybackStats;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getBufferedPosition", "()J", "getLiveOffset", "getTargetLiveOffset", "getLiveEdgePosition", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "()Z", "getPlaybackPosition", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "getWillPlayWhenReady", "getWindowDuration", "getMaxTargetBufferMs", "Lru/yandex/video/m3/data/DrmType;", "getDrmType", "()Lru/yandex/video/m3/data/DrmType;", "Lru/yandex/video/m3/data/Size;", "getSurfaceSize", "()Lru/yandex/video/m3/data/Size;", "Lru/yandex/video/m3/data/Decoder;", "getVideoDecoder", "()Lru/yandex/video/m3/data/Decoder;", "getAudioDecoder", "Ljava/lang/Long;", "getActualLiveOffset", "()Ljava/lang/Long;", "Ljava/lang/Integer;", "getExoPlayerPlaybackState$video_player_internalRelease", "()Ljava/lang/Integer;", "getRemainingBufferedTime", "remainingBufferedTime", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaybackStats copy$default(PlaybackStats playbackStats, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = kzj.z0;
        }
        return playbackStats.copy(function1);
    }

    @NotNull
    public final PlaybackStats copy(@NotNull Function1<? super m7l, Unit> builderAction) {
        builderAction.getClass();
        m7l m7lVar = new m7l(getBufferedPosition(), getLiveOffset(), getTargetLiveOffset(), getLiveEdgePosition(), getIsInLive(), getIsPlaying(), getPlaybackPosition(), getVideoType(), getWillPlayWhenReady(), getWindowDuration(), getMaxTargetBufferMs(), getDrmType());
        m7lVar.m = getSurfaceSize();
        m7lVar.n = getVideoDecoder();
        m7lVar.o = getAudioDecoder();
        m7lVar.p = getActualLiveOffset();
        m7lVar.q = getExoPlayerPlaybackState();
        builderAction.invoke(m7lVar);
        return new PlaybackStats(m7lVar.a, m7lVar.b, m7lVar.c, m7lVar.d, m7lVar.e, m7lVar.f, m7lVar.g, m7lVar.h, m7lVar.i, m7lVar.j, m7lVar.k, m7lVar.l, m7lVar.m, m7lVar.n, m7lVar.o, m7lVar.p, m7lVar.q, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlaybackStats.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        PlaybackStats playbackStats = (PlaybackStats) other;
        return this.bufferedPosition == playbackStats.bufferedPosition && this.liveOffset == playbackStats.liveOffset && this.targetLiveOffset == playbackStats.targetLiveOffset && this.liveEdgePosition == playbackStats.liveEdgePosition && Intrinsics.d(this.isInLive, playbackStats.isInLive) && this.isPlaying == playbackStats.isPlaying && this.playbackPosition == playbackStats.playbackPosition && this.videoType == playbackStats.videoType && this.willPlayWhenReady == playbackStats.willPlayWhenReady && this.windowDuration == playbackStats.windowDuration && this.maxTargetBufferMs == playbackStats.maxTargetBufferMs && this.drmType == playbackStats.drmType && Intrinsics.d(this.surfaceSize, playbackStats.surfaceSize) && Intrinsics.d(this.videoDecoder, playbackStats.videoDecoder) && Intrinsics.d(this.audioDecoder, playbackStats.audioDecoder) && Intrinsics.d(this.actualLiveOffset, playbackStats.actualLiveOffset) && Intrinsics.d(this.exoPlayerPlaybackState, playbackStats.exoPlayerPlaybackState);
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
        int c = tlm.c(this.liveEdgePosition, tlm.c(this.targetLiveOffset, tlm.c(this.liveOffset, Long.hashCode(this.bufferedPosition) * 31, 31), 31), 31);
        Boolean bool = this.isInLive;
        int c2 = tlm.c(this.playbackPosition, k5r.e((c + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.isPlaying), 31);
        VideoType videoType = this.videoType;
        int c3 = tlm.c(this.maxTargetBufferMs, tlm.c(this.windowDuration, k5r.e((c2 + (videoType != null ? videoType.hashCode() : 0)) * 31, 31, this.willPlayWhenReady), 31), 31);
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

    @NotNull
    public String toString() {
        return "PlaybackStats(bufferedPosition=" + this.bufferedPosition + ", liveOffset=" + this.liveOffset + ", targetLiveOffset=" + this.targetLiveOffset + ", liveEdgePosition=" + this.liveEdgePosition + ", isInLive=" + this.isInLive + ", isPlaying=" + this.isPlaying + ", playbackPosition=" + this.playbackPosition + ", videoType=" + this.videoType + ", willPlayWhenReady=" + this.willPlayWhenReady + ", windowDuration=" + this.windowDuration + ", maxTargetBufferMs=" + this.maxTargetBufferMs + ", drmType=" + this.drmType + ", surfaceSize=" + this.surfaceSize + ", videoDecoder=" + this.videoDecoder + ", audioDecoder=" + this.audioDecoder + ", actualLiveOffset=" + this.actualLiveOffset + ", exoPlayerPlaybackState=" + this.exoPlayerPlaybackState + ')';
    }

    public /* synthetic */ PlaybackStats(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType, Size size, Decoder decoder, Decoder decoder2, Long l, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, bool, z, j5, videoType, z2, j6, j7, drmType, size, decoder, decoder2, l, num);
    }

    public /* synthetic */ PlaybackStats(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType, Size size, Decoder decoder, Decoder decoder2, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, bool, z, j5, videoType, z2, j6, j7, drmType, size, decoder, decoder2, l, (i & SQLiteDatabase.OPEN_FULLMUTEX) != 0 ? null : num);
    }
}
