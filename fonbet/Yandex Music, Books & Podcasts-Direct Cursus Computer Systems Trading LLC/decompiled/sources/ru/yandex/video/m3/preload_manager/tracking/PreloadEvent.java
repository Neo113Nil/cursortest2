package ru.yandex.video.m3.preload_manager.tracking;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.enm;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/preload_manager/tracking/PreloadEvent;", "", "", "toEventName", "()Ljava/lang/String;", "QUEUED", "STARTED", "CANCELED", "FINISHED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class PreloadEvent {
    private static final /* synthetic */ PreloadEvent[] $VALUES;
    public static final PreloadEvent CANCELED;
    public static final PreloadEvent FINISHED;
    public static final PreloadEvent QUEUED;
    public static final PreloadEvent STARTED;

    static {
        PreloadEvent preloadEvent = new PreloadEvent("QUEUED", 0);
        QUEUED = preloadEvent;
        PreloadEvent preloadEvent2 = new PreloadEvent("STARTED", 1);
        STARTED = preloadEvent2;
        PreloadEvent preloadEvent3 = new PreloadEvent("CANCELED", 2);
        CANCELED = preloadEvent3;
        PreloadEvent preloadEvent4 = new PreloadEvent("FINISHED", 3);
        FINISHED = preloadEvent4;
        $VALUES = new PreloadEvent[]{preloadEvent, preloadEvent2, preloadEvent3, preloadEvent4};
    }

    public static PreloadEvent valueOf(String str) {
        return (PreloadEvent) Enum.valueOf(PreloadEvent.class, str);
    }

    public static PreloadEvent[] values() {
        return (PreloadEvent[]) $VALUES.clone();
    }

    @NotNull
    public final String toEventName() {
        int i = enm.a[ordinal()];
        if (i == 1) {
            return "PreloadQueued";
        }
        if (i == 2) {
            return "PreloadStarted";
        }
        if (i == 3) {
            return "PreloadCanceled";
        }
        if (i == 4) {
            return "PreloadFinished";
        }
        b6e.s();
        return null;
    }
}
