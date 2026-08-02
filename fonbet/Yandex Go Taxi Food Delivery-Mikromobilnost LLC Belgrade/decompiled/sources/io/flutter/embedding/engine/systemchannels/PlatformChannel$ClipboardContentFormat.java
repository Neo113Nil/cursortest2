package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlatformChannel$ClipboardContentFormat {
    private static final /* synthetic */ PlatformChannel$ClipboardContentFormat[] $VALUES;
    public static final PlatformChannel$ClipboardContentFormat PLAIN_TEXT;
    private String encodedName;

    /* JADX INFO: Fake field, exist only in values array */
    PlatformChannel$ClipboardContentFormat EF0;

    static {
        PlatformChannel$ClipboardContentFormat platformChannel$ClipboardContentFormat = new PlatformChannel$ClipboardContentFormat("PLAIN_TEXT", 0);
        platformChannel$ClipboardContentFormat.encodedName = "text/plain";
        PLAIN_TEXT = platformChannel$ClipboardContentFormat;
        $VALUES = new PlatformChannel$ClipboardContentFormat[]{platformChannel$ClipboardContentFormat};
    }

    public static PlatformChannel$ClipboardContentFormat a(String str) {
        for (PlatformChannel$ClipboardContentFormat platformChannel$ClipboardContentFormat : values()) {
            if (platformChannel$ClipboardContentFormat.encodedName.equals(str)) {
                return platformChannel$ClipboardContentFormat;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such ClipboardContentFormat: ", str));
    }

    public static PlatformChannel$ClipboardContentFormat valueOf(String str) {
        return (PlatformChannel$ClipboardContentFormat) Enum.valueOf(PlatformChannel$ClipboardContentFormat.class, str);
    }

    public static PlatformChannel$ClipboardContentFormat[] values() {
        return (PlatformChannel$ClipboardContentFormat[]) $VALUES.clone();
    }
}
