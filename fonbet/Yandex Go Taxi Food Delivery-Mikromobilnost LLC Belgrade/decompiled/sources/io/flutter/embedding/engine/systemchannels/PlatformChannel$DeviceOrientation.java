package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum PlatformChannel$DeviceOrientation {
    PORTRAIT_UP("DeviceOrientation.portraitUp"),
    PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
    LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
    LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

    private String encodedName;

    PlatformChannel$DeviceOrientation(String str) {
        this.encodedName = str;
    }

    public static PlatformChannel$DeviceOrientation a(String str) {
        for (PlatformChannel$DeviceOrientation platformChannel$DeviceOrientation : values()) {
            if (platformChannel$DeviceOrientation.encodedName.equals(str)) {
                return platformChannel$DeviceOrientation;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such DeviceOrientation: ", str));
    }
}
