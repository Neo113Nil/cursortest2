package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.ExtendedStalledReason;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u000e\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0016\u0010(\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0016\u0010)\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0016\u0010*\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0016\u0010+\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000eHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0016\u0010-\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010\u0017J¢\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0019R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R \u0010\u0010\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR \u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R \u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001b¨\u00066"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/StalledData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "isMuted", "", "remainingBufferedTime", "", "videoTrack", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;", "stalledDuration", "", "Lru/yandex/video/m3/data/FractionalSeconds;", "externalStalledDuration", "time", "watchedSec", "Lru/yandex/video/m3/data/Seconds;", "stalledId", "stalledDurationFromPlayWhenReadyTrue", "extendedStalledReason", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "(ZLjava/lang/Integer;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lru/yandex/video/m3/data/ExtendedStalledReason;)V", "getExtendedStalledReason", "()Lru/yandex/video/m3/data/ExtendedStalledReason;", "getExternalStalledDuration", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Z", "getRemainingBufferedTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStalledDuration", "getStalledDurationFromPlayWhenReadyTrue", "getStalledId", "getTime", "getVideoTrack", "()Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;", "getWatchedSec", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Integer;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrack;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lru/yandex/video/m3/data/ExtendedStalledReason;)Lru/yandex/video/m3/player/impl/tracking/event/StalledData;", "equals", "other", "", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class StalledData extends DefaultEventData {
    public static final int $stable = 0;

    @SerializedName("extendedStalledReason")
    private final ExtendedStalledReason extendedStalledReason;

    @SerializedName("externalStalledDuration")
    private final Float externalStalledDuration;

    @SerializedName("isMuted")
    private final boolean isMuted;

    @SerializedName("remainingBufferedTime")
    private final Integer remainingBufferedTime;

    @SerializedName("stalledDuration")
    private final Float stalledDuration;

    @SerializedName("stalledDurationFromPlayWhenReadyTrue")
    private final Float stalledDurationFromPlayWhenReadyTrue;

    @SerializedName("stalledId")
    private final Integer stalledId;

    @SerializedName("time")
    private final Float time;

    @SerializedName("videoTrack")
    private final VideoTrack videoTrack;

    @SerializedName("watchedSec")
    private final Integer watchedSec;

    public StalledData(boolean z, Integer num, VideoTrack videoTrack, Float f, Float f2, Float f3, Integer num2, Integer num3, Float f4, ExtendedStalledReason extendedStalledReason) {
        super(null, 1, null);
        this.isMuted = z;
        this.remainingBufferedTime = num;
        this.videoTrack = videoTrack;
        this.stalledDuration = f;
        this.externalStalledDuration = f2;
        this.time = f3;
        this.watchedSec = num2;
        this.stalledId = num3;
        this.stalledDurationFromPlayWhenReadyTrue = f4;
        this.extendedStalledReason = extendedStalledReason;
        setDetails("{\"externalStalledDuration\":\"" + f2 + "\"}");
    }

    public static /* synthetic */ StalledData copy$default(StalledData stalledData, boolean z, Integer num, VideoTrack videoTrack, Float f, Float f2, Float f3, Integer num2, Integer num3, Float f4, ExtendedStalledReason extendedStalledReason, int i, Object obj) {
        if ((i & 1) != 0) {
            z = stalledData.isMuted;
        }
        if ((i & 2) != 0) {
            num = stalledData.remainingBufferedTime;
        }
        if ((i & 4) != 0) {
            videoTrack = stalledData.videoTrack;
        }
        if ((i & 8) != 0) {
            f = stalledData.stalledDuration;
        }
        if ((i & 16) != 0) {
            f2 = stalledData.externalStalledDuration;
        }
        if ((i & 32) != 0) {
            f3 = stalledData.time;
        }
        if ((i & 64) != 0) {
            num2 = stalledData.watchedSec;
        }
        if ((i & 128) != 0) {
            num3 = stalledData.stalledId;
        }
        if ((i & 256) != 0) {
            f4 = stalledData.stalledDurationFromPlayWhenReadyTrue;
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            extendedStalledReason = stalledData.extendedStalledReason;
        }
        Float f5 = f4;
        ExtendedStalledReason extendedStalledReason2 = extendedStalledReason;
        Integer num4 = num2;
        Integer num5 = num3;
        Float f6 = f2;
        Float f7 = f3;
        return stalledData.copy(z, num, videoTrack, f, f6, f7, num4, num5, f5, extendedStalledReason2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: component10, reason: from getter */
    public final ExtendedStalledReason getExtendedStalledReason() {
        return this.extendedStalledReason;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    /* renamed from: component3, reason: from getter */
    public final VideoTrack getVideoTrack() {
        return this.videoTrack;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getStalledDuration() {
        return this.stalledDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getExternalStalledDuration() {
        return this.externalStalledDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getTime() {
        return this.time;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getWatchedSec() {
        return this.watchedSec;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getStalledId() {
        return this.stalledId;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getStalledDurationFromPlayWhenReadyTrue() {
        return this.stalledDurationFromPlayWhenReadyTrue;
    }

    @NotNull
    public final StalledData copy(boolean isMuted, Integer remainingBufferedTime, VideoTrack videoTrack, Float stalledDuration, Float externalStalledDuration, Float time, Integer watchedSec, Integer stalledId, Float stalledDurationFromPlayWhenReadyTrue, ExtendedStalledReason extendedStalledReason) {
        return new StalledData(isMuted, remainingBufferedTime, videoTrack, stalledDuration, externalStalledDuration, time, watchedSec, stalledId, stalledDurationFromPlayWhenReadyTrue, extendedStalledReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StalledData)) {
            return false;
        }
        StalledData stalledData = (StalledData) other;
        return this.isMuted == stalledData.isMuted && Intrinsics.d(this.remainingBufferedTime, stalledData.remainingBufferedTime) && Intrinsics.d(this.videoTrack, stalledData.videoTrack) && Intrinsics.d(this.stalledDuration, stalledData.stalledDuration) && Intrinsics.d(this.externalStalledDuration, stalledData.externalStalledDuration) && Intrinsics.d(this.time, stalledData.time) && Intrinsics.d(this.watchedSec, stalledData.watchedSec) && Intrinsics.d(this.stalledId, stalledData.stalledId) && Intrinsics.d(this.stalledDurationFromPlayWhenReadyTrue, stalledData.stalledDurationFromPlayWhenReadyTrue) && Intrinsics.d(this.extendedStalledReason, stalledData.extendedStalledReason);
    }

    public final ExtendedStalledReason getExtendedStalledReason() {
        return this.extendedStalledReason;
    }

    public final Float getExternalStalledDuration() {
        return this.externalStalledDuration;
    }

    public final Integer getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    public final Float getStalledDuration() {
        return this.stalledDuration;
    }

    public final Float getStalledDurationFromPlayWhenReadyTrue() {
        return this.stalledDurationFromPlayWhenReadyTrue;
    }

    public final Integer getStalledId() {
        return this.stalledId;
    }

    public final Float getTime() {
        return this.time;
    }

    public final VideoTrack getVideoTrack() {
        return this.videoTrack;
    }

    public final Integer getWatchedSec() {
        return this.watchedSec;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isMuted) * 31;
        Integer num = this.remainingBufferedTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VideoTrack videoTrack = this.videoTrack;
        int hashCode3 = (hashCode2 + (videoTrack == null ? 0 : videoTrack.hashCode())) * 31;
        Float f = this.stalledDuration;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.externalStalledDuration;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.time;
        int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num2 = this.watchedSec;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.stalledId;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f4 = this.stalledDurationFromPlayWhenReadyTrue;
        int hashCode9 = (hashCode8 + (f4 == null ? 0 : f4.hashCode())) * 31;
        ExtendedStalledReason extendedStalledReason = this.extendedStalledReason;
        return hashCode9 + (extendedStalledReason != null ? extendedStalledReason.hashCode() : 0);
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    @NotNull
    public String toString() {
        return "StalledData(isMuted=" + this.isMuted + ", remainingBufferedTime=" + this.remainingBufferedTime + ", videoTrack=" + this.videoTrack + ", stalledDuration=" + this.stalledDuration + ", externalStalledDuration=" + this.externalStalledDuration + ", time=" + this.time + ", watchedSec=" + this.watchedSec + ", stalledId=" + this.stalledId + ", stalledDurationFromPlayWhenReadyTrue=" + this.stalledDurationFromPlayWhenReadyTrue + ", extendedStalledReason=" + this.extendedStalledReason + ')';
    }
}
