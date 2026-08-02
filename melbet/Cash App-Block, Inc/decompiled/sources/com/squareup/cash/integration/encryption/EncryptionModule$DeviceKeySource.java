package com.squareup.cash.integration.encryption;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EncryptionModule$DeviceKeySource {
    public static final /* synthetic */ EncryptionModule$DeviceKeySource[] $VALUES;
    public static final EncryptionModule$DeviceKeySource DEVICE_ID;
    public static final EncryptionModule$DeviceKeySource MEDIA_DRM;

    static {
        EncryptionModule$DeviceKeySource encryptionModule$DeviceKeySource = new EncryptionModule$DeviceKeySource("MEDIA_DRM", 0);
        MEDIA_DRM = encryptionModule$DeviceKeySource;
        EncryptionModule$DeviceKeySource encryptionModule$DeviceKeySource2 = new EncryptionModule$DeviceKeySource("DEVICE_ID", 1);
        DEVICE_ID = encryptionModule$DeviceKeySource2;
        $VALUES = new EncryptionModule$DeviceKeySource[]{encryptionModule$DeviceKeySource, encryptionModule$DeviceKeySource2};
    }

    public static EncryptionModule$DeviceKeySource valueOf(String str) {
        return (EncryptionModule$DeviceKeySource) Enum.valueOf(EncryptionModule$DeviceKeySource.class, str);
    }

    public static EncryptionModule$DeviceKeySource[] values() {
        return (EncryptionModule$DeviceKeySource[]) $VALUES.clone();
    }
}
