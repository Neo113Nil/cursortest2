package io.flutter.plugins.camerax;

import defpackage.k4o;
import defpackage.mby;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/flutter/plugins/camerax/LensFacing;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "mby", "FRONT", "BACK", "EXTERNAL", "UNKNOWN", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LensFacing {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LensFacing[] $VALUES;
    public static final LensFacing BACK;
    public static final mby Companion;
    public static final LensFacing EXTERNAL;
    public static final LensFacing FRONT;
    public static final LensFacing UNKNOWN;
    private final int raw;

    static {
        LensFacing lensFacing = new LensFacing("FRONT", 0, 0);
        FRONT = lensFacing;
        LensFacing lensFacing2 = new LensFacing("BACK", 1, 1);
        BACK = lensFacing2;
        LensFacing lensFacing3 = new LensFacing("EXTERNAL", 2, 2);
        EXTERNAL = lensFacing3;
        LensFacing lensFacing4 = new LensFacing("UNKNOWN", 3, 3);
        UNKNOWN = lensFacing4;
        LensFacing[] lensFacingArr = {lensFacing, lensFacing2, lensFacing3, lensFacing4};
        $VALUES = lensFacingArr;
        $ENTRIES = kotlin.enums.a.a(lensFacingArr);
        Companion = new mby();
    }

    public LensFacing(String str, int i, int i2) {
        this.raw = i2;
    }

    public static LensFacing valueOf(String str) {
        return (LensFacing) Enum.valueOf(LensFacing.class, str);
    }

    public static LensFacing[] values() {
        return (LensFacing[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
