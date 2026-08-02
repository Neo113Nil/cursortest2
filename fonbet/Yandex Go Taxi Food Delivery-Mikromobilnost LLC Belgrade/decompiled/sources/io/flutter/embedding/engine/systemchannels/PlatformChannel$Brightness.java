package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum PlatformChannel$Brightness {
    LIGHT("Brightness.light"),
    DARK("Brightness.dark");

    private String encodedName;

    PlatformChannel$Brightness(String str) {
        this.encodedName = str;
    }

    public static PlatformChannel$Brightness a(String str) {
        for (PlatformChannel$Brightness platformChannel$Brightness : values()) {
            if (platformChannel$Brightness.encodedName.equals(str)) {
                return platformChannel$Brightness;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such Brightness: ", str));
    }
}
