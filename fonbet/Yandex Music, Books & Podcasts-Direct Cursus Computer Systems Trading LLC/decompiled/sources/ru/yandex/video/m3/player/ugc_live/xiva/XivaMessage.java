package ru.yandex.video.m3.player.ugc_live.xiva;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/xiva/XivaMessage;", "", "operation", "Lru/yandex/video/m3/player/ugc_live/xiva/XivaOperation;", "pingInterval", "", Constants.KEY_MESSAGE, "", "(Lru/yandex/video/m3/player/ugc_live/xiva/XivaOperation;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getOperation", "()Lru/yandex/video/m3/player/ugc_live/xiva/XivaOperation;", "getPingInterval", "()I", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class XivaMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;
    private final XivaOperation operation;

    @SerializedName("server-interval-sec")
    private final int pingInterval;

    public XivaMessage(XivaOperation xivaOperation, int i, @NotNull String str) {
        str.getClass();
        this.operation = xivaOperation;
        this.pingInterval = i;
        this.message = str;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final XivaOperation getOperation() {
        return this.operation;
    }

    public final int getPingInterval() {
        return this.pingInterval;
    }
}
