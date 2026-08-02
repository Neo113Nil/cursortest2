package com.squareup.cash.shopping.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ImageType {
    public static final /* synthetic */ ImageType[] $VALUES;
    public static final ImageType AVATAR;
    public static final ImageType CARD;

    static {
        ImageType imageType = new ImageType("CARD", 0);
        CARD = imageType;
        ImageType imageType2 = new ImageType("AVATAR", 1);
        AVATAR = imageType2;
        $VALUES = new ImageType[]{imageType, imageType2};
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }
}
