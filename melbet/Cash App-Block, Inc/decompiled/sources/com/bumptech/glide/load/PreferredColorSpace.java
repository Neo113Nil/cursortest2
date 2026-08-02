package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PreferredColorSpace {
    public static final /* synthetic */ PreferredColorSpace[] $VALUES;
    public static final PreferredColorSpace DISPLAY_P3;

    /* JADX INFO: Fake field, exist only in values array */
    PreferredColorSpace EF0;

    static {
        PreferredColorSpace preferredColorSpace = new PreferredColorSpace("SRGB", 0);
        PreferredColorSpace preferredColorSpace2 = new PreferredColorSpace("DISPLAY_P3", 1);
        DISPLAY_P3 = preferredColorSpace2;
        $VALUES = new PreferredColorSpace[]{preferredColorSpace, preferredColorSpace2};
    }

    public static PreferredColorSpace valueOf(String str) {
        return (PreferredColorSpace) Enum.valueOf(PreferredColorSpace.class, str);
    }

    public static PreferredColorSpace[] values() {
        return (PreferredColorSpace[]) $VALUES.clone();
    }
}
