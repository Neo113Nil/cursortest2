package io.flutter.plugins.camerax;

import defpackage.k4o;
import defpackage.l83;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/flutter/plugins/camerax/AspectRatio;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "l83", "RATIO16TO9", "RATIO4TO3", "RATIO_DEFAULT", "UNKNOWN", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AspectRatio {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AspectRatio[] $VALUES;
    public static final l83 Companion;
    public static final AspectRatio RATIO16TO9;
    public static final AspectRatio RATIO4TO3;
    public static final AspectRatio RATIO_DEFAULT;
    public static final AspectRatio UNKNOWN;
    private final int raw;

    static {
        AspectRatio aspectRatio = new AspectRatio("RATIO16TO9", 0, 0);
        RATIO16TO9 = aspectRatio;
        AspectRatio aspectRatio2 = new AspectRatio("RATIO4TO3", 1, 1);
        RATIO4TO3 = aspectRatio2;
        AspectRatio aspectRatio3 = new AspectRatio("RATIO_DEFAULT", 2, 2);
        RATIO_DEFAULT = aspectRatio3;
        AspectRatio aspectRatio4 = new AspectRatio("UNKNOWN", 3, 3);
        UNKNOWN = aspectRatio4;
        AspectRatio[] aspectRatioArr = {aspectRatio, aspectRatio2, aspectRatio3, aspectRatio4};
        $VALUES = aspectRatioArr;
        $ENTRIES = kotlin.enums.a.a(aspectRatioArr);
        Companion = new l83();
    }

    public AspectRatio(String str, int i, int i2) {
        this.raw = i2;
    }

    public static AspectRatio valueOf(String str) {
        return (AspectRatio) Enum.valueOf(AspectRatio.class, str);
    }

    public static AspectRatio[] values() {
        return (AspectRatio[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
