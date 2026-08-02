package io.flutter.plugins.camerax;

import defpackage.cn31;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/camerax/VideoQuality;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "cn31", "SD", "HD", "FHD", "UHD", "LOWEST", "HIGHEST", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoQuality {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;
    public static final cn31 Companion;
    public static final VideoQuality FHD;
    public static final VideoQuality HD;
    public static final VideoQuality HIGHEST;
    public static final VideoQuality LOWEST;
    public static final VideoQuality SD;
    public static final VideoQuality UHD;
    private final int raw;

    static {
        VideoQuality videoQuality = new VideoQuality("SD", 0, 0);
        SD = videoQuality;
        VideoQuality videoQuality2 = new VideoQuality("HD", 1, 1);
        HD = videoQuality2;
        VideoQuality videoQuality3 = new VideoQuality("FHD", 2, 2);
        FHD = videoQuality3;
        VideoQuality videoQuality4 = new VideoQuality("UHD", 3, 3);
        UHD = videoQuality4;
        VideoQuality videoQuality5 = new VideoQuality("LOWEST", 4, 4);
        LOWEST = videoQuality5;
        VideoQuality videoQuality6 = new VideoQuality("HIGHEST", 5, 5);
        HIGHEST = videoQuality6;
        VideoQuality[] videoQualityArr = {videoQuality, videoQuality2, videoQuality3, videoQuality4, videoQuality5, videoQuality6};
        $VALUES = videoQualityArr;
        $ENTRIES = kotlin.enums.a.a(videoQualityArr);
        Companion = new cn31();
    }

    public VideoQuality(String str, int i, int i2) {
        this.raw = i2;
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
