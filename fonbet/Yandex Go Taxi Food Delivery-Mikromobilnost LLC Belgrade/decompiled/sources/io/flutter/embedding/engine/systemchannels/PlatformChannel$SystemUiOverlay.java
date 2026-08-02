package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum PlatformChannel$SystemUiOverlay {
    TOP_OVERLAYS("SystemUiOverlay.top"),
    BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

    private String encodedName;

    PlatformChannel$SystemUiOverlay(String str) {
        this.encodedName = str;
    }

    public static PlatformChannel$SystemUiOverlay a(String str) {
        for (PlatformChannel$SystemUiOverlay platformChannel$SystemUiOverlay : values()) {
            if (platformChannel$SystemUiOverlay.encodedName.equals(str)) {
                return platformChannel$SystemUiOverlay;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such SystemUiOverlay: ", str));
    }
}
