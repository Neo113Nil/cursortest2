package com.squareup.cash.graphics.swampgl.gl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TextureType {
    public static final /* synthetic */ TextureType[] $VALUES;
    public static final TextureType COLOR;

    static {
        TextureType textureType = new TextureType("COLOR", 0);
        COLOR = textureType;
        $VALUES = new TextureType[]{textureType, new TextureType("NORMAL", 1), new TextureType("DATA", 2)};
    }

    public static TextureType valueOf(String str) {
        return (TextureType) Enum.valueOf(TextureType.class, str);
    }

    public static TextureType[] values() {
        return (TextureType[]) $VALUES.clone();
    }
}
