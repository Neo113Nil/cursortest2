package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\t\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "durationInSec", "", "timeInSec", "watchedSec", "", "isMuted", "", "isFullscreenExternal", "isFullscreenInternal", "loopIndex", "remainingBufferedTime", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Float;)V", "getDurationInSec", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getLoopIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRemainingBufferedTime", "getTimeInSec", "getWatchedSec", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public class StateBasedEventData extends DefaultEventData {
    public static final int $stable = 0;

    @SerializedName("duration")
    private final Float durationInSec;

    @SerializedName("isFullscreen")
    private final Boolean isFullscreenExternal;
    private final Boolean isFullscreenInternal;
    private final boolean isMuted;
    private final Integer loopIndex;
    private final Float remainingBufferedTime;

    @SerializedName("time")
    private final Float timeInSec;
    private final Integer watchedSec;

    public /* synthetic */ StateBasedEventData(Float f, Float f2, Integer num, boolean z, Boolean bool, Boolean bool2, Integer num2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : num, z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : f3);
    }

    public final Float getDurationInSec() {
        return this.durationInSec;
    }

    public final Integer getLoopIndex() {
        return this.loopIndex;
    }

    public final Float getRemainingBufferedTime() {
        return this.remainingBufferedTime;
    }

    public final Float getTimeInSec() {
        return this.timeInSec;
    }

    public final Integer getWatchedSec() {
        return this.watchedSec;
    }

    /* renamed from: isFullscreenExternal, reason: from getter */
    public final Boolean getIsFullscreenExternal() {
        return this.isFullscreenExternal;
    }

    /* renamed from: isFullscreenInternal, reason: from getter */
    public final Boolean getIsFullscreenInternal() {
        return this.isFullscreenInternal;
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    public StateBasedEventData(Float f, Float f2, Integer num, boolean z, Boolean bool, Boolean bool2, Integer num2, Float f3) {
        super(null, 1, null);
        this.durationInSec = f;
        this.timeInSec = f2;
        this.watchedSec = num;
        this.isMuted = z;
        this.isFullscreenExternal = bool;
        this.isFullscreenInternal = bool2;
        this.loopIndex = num2;
        this.remainingBufferedTime = f3;
    }
}
