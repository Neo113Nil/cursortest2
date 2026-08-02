package com.mikepenz.markdown.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ImageWidth {
    public static final /* synthetic */ ImageWidth[] $VALUES;
    public static final ImageWidth IMAGE_WIDTH;

    static {
        ImageWidth imageWidth = new ImageWidth("IMAGE_WIDTH", 0);
        IMAGE_WIDTH = imageWidth;
        $VALUES = new ImageWidth[]{imageWidth, new ImageWidth("MAX_WIDTH", 1)};
    }

    public static ImageWidth valueOf(String str) {
        return (ImageWidth) Enum.valueOf(ImageWidth.class, str);
    }

    public static ImageWidth[] values() {
        return (ImageWidth[]) $VALUES.clone();
    }
}
