package ru.yandex.video.m3.trackselection.videoformatselector.tracking;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.ruj;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEvent;", "", "", "toEventName", "()Ljava/lang/String;", "FINISHED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class OptimalVideoFormatSelectorEvent {
    private static final /* synthetic */ OptimalVideoFormatSelectorEvent[] $VALUES;
    public static final OptimalVideoFormatSelectorEvent FINISHED;

    static {
        OptimalVideoFormatSelectorEvent optimalVideoFormatSelectorEvent = new OptimalVideoFormatSelectorEvent("FINISHED", 0);
        FINISHED = optimalVideoFormatSelectorEvent;
        $VALUES = new OptimalVideoFormatSelectorEvent[]{optimalVideoFormatSelectorEvent};
    }

    public static OptimalVideoFormatSelectorEvent valueOf(String str) {
        return (OptimalVideoFormatSelectorEvent) Enum.valueOf(OptimalVideoFormatSelectorEvent.class, str);
    }

    public static OptimalVideoFormatSelectorEvent[] values() {
        return (OptimalVideoFormatSelectorEvent[]) $VALUES.clone();
    }

    @NotNull
    public final String toEventName() {
        if (ruj.a[ordinal()] == 1) {
            return "OptimalVideoFormatSelectionFinished";
        }
        b6e.s();
        return null;
    }
}
