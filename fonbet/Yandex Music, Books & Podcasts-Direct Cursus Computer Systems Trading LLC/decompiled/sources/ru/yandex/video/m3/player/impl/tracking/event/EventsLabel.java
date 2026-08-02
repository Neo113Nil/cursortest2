package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/EventsLabel;", "", "from", "", "appVersionName", "appVersionCode", "videoType", "Lru/yandex/video/m3/player/impl/tracking/event/VideoType;", "reason", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/event/VideoType;Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;)V", "getAppVersionCode", "()Ljava/lang/String;", "getAppVersionName", "getFrom", "getReason", "()Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "version", "getVersion", "getVideoType", "()Lru/yandex/video/m3/player/impl/tracking/event/VideoType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class EventsLabel {
    public static final int $stable = 0;
    private final String appVersionCode;
    private final String appVersionName;
    private final String from;
    private final LoggingStalledReason reason;

    @NotNull
    private final String version;
    private final VideoType videoType;

    public /* synthetic */ EventsLabel(String str, String str2, String str3, VideoType videoType, LoggingStalledReason loggingStalledReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : videoType, (i & 16) != 0 ? null : loggingStalledReason);
    }

    public final String getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final String getFrom() {
        return this.from;
    }

    public final LoggingStalledReason getReason() {
        return this.reason;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final VideoType getVideoType() {
        return this.videoType;
    }

    public EventsLabel(String str, String str2, String str3, VideoType videoType, LoggingStalledReason loggingStalledReason) {
        this.from = str;
        this.appVersionName = str2;
        this.appVersionCode = str3;
        this.videoType = videoType;
        this.reason = loggingStalledReason;
        this.version = "3081";
    }

    public EventsLabel() {
        this(null, null, null, null, null, 31, null);
    }
}
