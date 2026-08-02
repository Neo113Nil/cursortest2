package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum PlatformChannel$SystemUiMode {
    LEAN_BACK("SystemUiMode.leanBack"),
    IMMERSIVE("SystemUiMode.immersive"),
    IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
    EDGE_TO_EDGE("SystemUiMode.edgeToEdge");

    private String encodedName;

    PlatformChannel$SystemUiMode(String str) {
        this.encodedName = str;
    }

    public static PlatformChannel$SystemUiMode a(String str) {
        for (PlatformChannel$SystemUiMode platformChannel$SystemUiMode : values()) {
            if (platformChannel$SystemUiMode.encodedName.equals(str)) {
                return platformChannel$SystemUiMode;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such SystemUiMode: ", str));
    }
}
