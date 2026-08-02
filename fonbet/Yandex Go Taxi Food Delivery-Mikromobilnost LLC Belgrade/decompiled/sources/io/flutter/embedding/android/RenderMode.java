package io.flutter.embedding.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RenderMode {
    private static final /* synthetic */ RenderMode[] $VALUES;
    public static final RenderMode image;
    public static final RenderMode surface;
    public static final RenderMode texture;

    static {
        RenderMode renderMode = new RenderMode("surface", 0);
        surface = renderMode;
        RenderMode renderMode2 = new RenderMode("texture", 1);
        texture = renderMode2;
        RenderMode renderMode3 = new RenderMode("image", 2);
        image = renderMode3;
        $VALUES = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) $VALUES.clone();
    }
}
