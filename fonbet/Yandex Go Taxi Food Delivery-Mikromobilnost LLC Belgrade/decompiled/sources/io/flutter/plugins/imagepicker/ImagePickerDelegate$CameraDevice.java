package io.flutter.plugins.imagepicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ImagePickerDelegate$CameraDevice {
    private static final /* synthetic */ ImagePickerDelegate$CameraDevice[] $VALUES;
    public static final ImagePickerDelegate$CameraDevice FRONT;
    public static final ImagePickerDelegate$CameraDevice REAR;

    static {
        ImagePickerDelegate$CameraDevice imagePickerDelegate$CameraDevice = new ImagePickerDelegate$CameraDevice("REAR", 0);
        REAR = imagePickerDelegate$CameraDevice;
        ImagePickerDelegate$CameraDevice imagePickerDelegate$CameraDevice2 = new ImagePickerDelegate$CameraDevice("FRONT", 1);
        FRONT = imagePickerDelegate$CameraDevice2;
        $VALUES = new ImagePickerDelegate$CameraDevice[]{imagePickerDelegate$CameraDevice, imagePickerDelegate$CameraDevice2};
    }

    public static ImagePickerDelegate$CameraDevice valueOf(String str) {
        return (ImagePickerDelegate$CameraDevice) Enum.valueOf(ImagePickerDelegate$CameraDevice.class, str);
    }

    public static ImagePickerDelegate$CameraDevice[] values() {
        return (ImagePickerDelegate$CameraDevice[]) $VALUES.clone();
    }
}
