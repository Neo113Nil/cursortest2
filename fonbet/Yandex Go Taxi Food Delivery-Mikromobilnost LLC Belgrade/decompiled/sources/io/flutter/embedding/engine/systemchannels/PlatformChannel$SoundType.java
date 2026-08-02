package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes2.dex */
public enum PlatformChannel$SoundType {
    CLICK("SystemSoundType.click"),
    TICK("SystemSoundType.tick"),
    ALERT("SystemSoundType.alert");

    private final String encodedName;

    PlatformChannel$SoundType(String str) {
        this.encodedName = str;
    }

    public static PlatformChannel$SoundType a(String str) {
        for (PlatformChannel$SoundType platformChannel$SoundType : values()) {
            if (platformChannel$SoundType.encodedName.equals(str)) {
                return platformChannel$SoundType;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such SoundType: ", str));
    }
}
