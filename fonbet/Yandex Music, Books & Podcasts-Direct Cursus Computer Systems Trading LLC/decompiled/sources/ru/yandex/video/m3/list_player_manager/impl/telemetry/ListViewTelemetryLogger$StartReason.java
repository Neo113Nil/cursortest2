package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$StartReason", "", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$StartReason;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", Constants.KEY_VALUE, "FIRST_PIXEL_VISIBLE", "PLAYING_RESUMED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public enum ListViewTelemetryLogger$StartReason {
    FIRST_PIXEL_VISIBLE("first_pixel_visible"),
    PLAYING_RESUMED("playing_resumed");


    /* renamed from: a, reason: from kotlin metadata */
    public final String value;

    ListViewTelemetryLogger$StartReason(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
