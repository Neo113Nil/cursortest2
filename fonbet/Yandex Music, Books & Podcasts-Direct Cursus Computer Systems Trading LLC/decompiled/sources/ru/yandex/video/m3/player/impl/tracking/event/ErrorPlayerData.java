package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/ErrorPlayerData;", "Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;", Constants.KEY_MESSAGE, "", "code", "isFatal", "", "stack", "availableCodecs", "diagnosticInfo", "category", "stateBasedEventData", "details", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/event/StateBasedEventData;Ljava/lang/String;)V", "getAvailableCodecs", "()Ljava/lang/String;", "getCategory", "getCode", "getDiagnosticInfo", "()Z", "getMessage", "getStack", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ErrorPlayerData extends StateBasedEventData {
    public static final int $stable = 0;
    private final String availableCodecs;

    @NotNull
    private final String category;

    @NotNull
    private final String code;
    private final String diagnosticInfo;
    private final boolean isFatal;

    @NotNull
    private final String message;

    @NotNull
    private final String stack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorPlayerData(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, String str4, String str5, @NotNull String str6, @NotNull StateBasedEventData stateBasedEventData, String str7) {
        super(stateBasedEventData.getDurationInSec(), stateBasedEventData.getTimeInSec(), stateBasedEventData.getWatchedSec(), stateBasedEventData.getIsMuted(), stateBasedEventData.getIsFullscreenExternal(), stateBasedEventData.getIsFullscreenInternal(), stateBasedEventData.getLoopIndex(), stateBasedEventData.getRemainingBufferedTime());
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        stateBasedEventData.getClass();
        this.message = str;
        this.code = str2;
        this.isFatal = z;
        this.stack = str3;
        this.availableCodecs = str4;
        this.diagnosticInfo = str5;
        this.category = str6;
        setDetails(str7);
    }

    public final String getAvailableCodecs() {
        return this.availableCodecs;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final String getDiagnosticInfo() {
        return this.diagnosticInfo;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStack() {
        return this.stack;
    }

    /* renamed from: isFatal, reason: from getter */
    public final boolean getIsFatal() {
        return this.isFatal;
    }
}
