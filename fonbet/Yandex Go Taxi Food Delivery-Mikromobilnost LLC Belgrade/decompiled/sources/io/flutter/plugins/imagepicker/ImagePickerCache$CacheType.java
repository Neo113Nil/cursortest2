package io.flutter.plugins.imagepicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ImagePickerCache$CacheType {
    private static final /* synthetic */ ImagePickerCache$CacheType[] $VALUES;
    public static final ImagePickerCache$CacheType IMAGE;
    public static final ImagePickerCache$CacheType VIDEO;

    static {
        ImagePickerCache$CacheType imagePickerCache$CacheType = new ImagePickerCache$CacheType("IMAGE", 0);
        IMAGE = imagePickerCache$CacheType;
        ImagePickerCache$CacheType imagePickerCache$CacheType2 = new ImagePickerCache$CacheType("VIDEO", 1);
        VIDEO = imagePickerCache$CacheType2;
        $VALUES = new ImagePickerCache$CacheType[]{imagePickerCache$CacheType, imagePickerCache$CacheType2};
    }

    public static ImagePickerCache$CacheType valueOf(String str) {
        return (ImagePickerCache$CacheType) Enum.valueOf(ImagePickerCache$CacheType.class, str);
    }

    public static ImagePickerCache$CacheType[] values() {
        return (ImagePickerCache$CacheType[]) $VALUES.clone();
    }
}
