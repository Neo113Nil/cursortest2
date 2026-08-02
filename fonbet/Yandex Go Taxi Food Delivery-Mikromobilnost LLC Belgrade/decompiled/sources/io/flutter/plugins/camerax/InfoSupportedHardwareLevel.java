package io.flutter.plugins.camerax;

import defpackage.k4o;
import defpackage.rtv;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/flutter/plugins/camerax/InfoSupportedHardwareLevel;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "rtv", "LEVEL3", "EXTERNAL", "FULL", "LEGACY", "LIMITED", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoSupportedHardwareLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InfoSupportedHardwareLevel[] $VALUES;
    public static final rtv Companion;
    public static final InfoSupportedHardwareLevel EXTERNAL;
    public static final InfoSupportedHardwareLevel FULL;
    public static final InfoSupportedHardwareLevel LEGACY;
    public static final InfoSupportedHardwareLevel LEVEL3;
    public static final InfoSupportedHardwareLevel LIMITED;
    private final int raw;

    static {
        InfoSupportedHardwareLevel infoSupportedHardwareLevel = new InfoSupportedHardwareLevel("LEVEL3", 0, 0);
        LEVEL3 = infoSupportedHardwareLevel;
        InfoSupportedHardwareLevel infoSupportedHardwareLevel2 = new InfoSupportedHardwareLevel("EXTERNAL", 1, 1);
        EXTERNAL = infoSupportedHardwareLevel2;
        InfoSupportedHardwareLevel infoSupportedHardwareLevel3 = new InfoSupportedHardwareLevel("FULL", 2, 2);
        FULL = infoSupportedHardwareLevel3;
        InfoSupportedHardwareLevel infoSupportedHardwareLevel4 = new InfoSupportedHardwareLevel("LEGACY", 3, 3);
        LEGACY = infoSupportedHardwareLevel4;
        InfoSupportedHardwareLevel infoSupportedHardwareLevel5 = new InfoSupportedHardwareLevel("LIMITED", 4, 4);
        LIMITED = infoSupportedHardwareLevel5;
        InfoSupportedHardwareLevel[] infoSupportedHardwareLevelArr = {infoSupportedHardwareLevel, infoSupportedHardwareLevel2, infoSupportedHardwareLevel3, infoSupportedHardwareLevel4, infoSupportedHardwareLevel5};
        $VALUES = infoSupportedHardwareLevelArr;
        $ENTRIES = kotlin.enums.a.a(infoSupportedHardwareLevelArr);
        Companion = new rtv();
    }

    public InfoSupportedHardwareLevel(String str, int i, int i2) {
        this.raw = i2;
    }

    public static InfoSupportedHardwareLevel valueOf(String str) {
        return (InfoSupportedHardwareLevel) Enum.valueOf(InfoSupportedHardwareLevel.class, str);
    }

    public static InfoSupportedHardwareLevel[] values() {
        return (InfoSupportedHardwareLevel[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
