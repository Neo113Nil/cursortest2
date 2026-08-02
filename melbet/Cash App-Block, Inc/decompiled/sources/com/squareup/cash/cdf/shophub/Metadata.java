package com.squareup.cash.cdf.shophub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Metadata {
    public static final /* synthetic */ Metadata[] $VALUES;
    public static final Metadata LOGO;
    public static final Metadata MAIN_IMAGE;

    static {
        Metadata metadata = new Metadata("MAIN_IMAGE", 0);
        MAIN_IMAGE = metadata;
        Metadata metadata2 = new Metadata("LOGO", 1);
        LOGO = metadata2;
        $VALUES = new Metadata[]{metadata, metadata2, new Metadata("NAME", 2)};
    }

    public static Metadata valueOf(String str) {
        return (Metadata) Enum.valueOf(Metadata.class, str);
    }

    public static Metadata[] values() {
        return (Metadata[]) $VALUES.clone();
    }
}
