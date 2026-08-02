package io.flutter.plugins.videoplayer;

import defpackage.k4o;
import defpackage.nwc0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/flutter/plugins/videoplayer/PlatformVideoFormat;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "nwc0", "DASH", "HLS", "SS", "video_player_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformVideoFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlatformVideoFormat[] $VALUES;
    public static final nwc0 Companion;
    public static final PlatformVideoFormat DASH;
    public static final PlatformVideoFormat HLS;
    public static final PlatformVideoFormat SS;
    private final int raw;

    static {
        PlatformVideoFormat platformVideoFormat = new PlatformVideoFormat("DASH", 0, 0);
        DASH = platformVideoFormat;
        PlatformVideoFormat platformVideoFormat2 = new PlatformVideoFormat("HLS", 1, 1);
        HLS = platformVideoFormat2;
        PlatformVideoFormat platformVideoFormat3 = new PlatformVideoFormat("SS", 2, 2);
        SS = platformVideoFormat3;
        PlatformVideoFormat[] platformVideoFormatArr = {platformVideoFormat, platformVideoFormat2, platformVideoFormat3};
        $VALUES = platformVideoFormatArr;
        $ENTRIES = kotlin.enums.a.a(platformVideoFormatArr);
        Companion = new nwc0();
    }

    public PlatformVideoFormat(String str, int i, int i2) {
        this.raw = i2;
    }

    public static PlatformVideoFormat valueOf(String str) {
        return (PlatformVideoFormat) Enum.valueOf(PlatformVideoFormat.class, str);
    }

    public static PlatformVideoFormat[] values() {
        return (PlatformVideoFormat[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
