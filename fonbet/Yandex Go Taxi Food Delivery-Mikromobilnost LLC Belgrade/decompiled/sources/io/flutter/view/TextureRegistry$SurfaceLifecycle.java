package io.flutter.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TextureRegistry$SurfaceLifecycle {
    private static final /* synthetic */ TextureRegistry$SurfaceLifecycle[] $VALUES;
    public static final TextureRegistry$SurfaceLifecycle manual;
    public static final TextureRegistry$SurfaceLifecycle resetInBackground;

    static {
        TextureRegistry$SurfaceLifecycle textureRegistry$SurfaceLifecycle = new TextureRegistry$SurfaceLifecycle("manual", 0);
        manual = textureRegistry$SurfaceLifecycle;
        TextureRegistry$SurfaceLifecycle textureRegistry$SurfaceLifecycle2 = new TextureRegistry$SurfaceLifecycle("resetInBackground", 1);
        resetInBackground = textureRegistry$SurfaceLifecycle2;
        $VALUES = new TextureRegistry$SurfaceLifecycle[]{textureRegistry$SurfaceLifecycle, textureRegistry$SurfaceLifecycle2};
    }

    public static TextureRegistry$SurfaceLifecycle valueOf(String str) {
        return (TextureRegistry$SurfaceLifecycle) Enum.valueOf(TextureRegistry$SurfaceLifecycle.class, str);
    }

    public static TextureRegistry$SurfaceLifecycle[] values() {
        return (TextureRegistry$SurfaceLifecycle[]) $VALUES.clone();
    }
}
