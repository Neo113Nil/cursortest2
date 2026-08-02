package io.flutter.embedding.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TransparencyMode {
    private static final /* synthetic */ TransparencyMode[] $VALUES;
    public static final TransparencyMode opaque;
    public static final TransparencyMode transparent;

    static {
        TransparencyMode transparencyMode = new TransparencyMode("opaque", 0);
        opaque = transparencyMode;
        TransparencyMode transparencyMode2 = new TransparencyMode("transparent", 1);
        transparent = transparencyMode2;
        $VALUES = new TransparencyMode[]{transparencyMode, transparencyMode2};
    }

    public static TransparencyMode valueOf(String str) {
        return (TransparencyMode) Enum.valueOf(TransparencyMode.class, str);
    }

    public static TransparencyMode[] values() {
        return (TransparencyMode[]) $VALUES.clone();
    }
}
