package com.ionspin.kotlin.bignum.integer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Platform {
    public static final /* synthetic */ Platform[] $VALUES = {new Platform("JVM", 0), new Platform("NATIVE", 1), new Platform("JS", 2), new Platform("WASMJS", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Platform EF5;

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }
}
