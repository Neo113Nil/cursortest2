package io.flutter.embedding.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FlutterActivityLaunchConfigs$BackgroundMode {
    private static final /* synthetic */ FlutterActivityLaunchConfigs$BackgroundMode[] $VALUES;
    public static final FlutterActivityLaunchConfigs$BackgroundMode opaque;
    public static final FlutterActivityLaunchConfigs$BackgroundMode transparent;

    static {
        FlutterActivityLaunchConfigs$BackgroundMode flutterActivityLaunchConfigs$BackgroundMode = new FlutterActivityLaunchConfigs$BackgroundMode("opaque", 0);
        opaque = flutterActivityLaunchConfigs$BackgroundMode;
        FlutterActivityLaunchConfigs$BackgroundMode flutterActivityLaunchConfigs$BackgroundMode2 = new FlutterActivityLaunchConfigs$BackgroundMode("transparent", 1);
        transparent = flutterActivityLaunchConfigs$BackgroundMode2;
        $VALUES = new FlutterActivityLaunchConfigs$BackgroundMode[]{flutterActivityLaunchConfigs$BackgroundMode, flutterActivityLaunchConfigs$BackgroundMode2};
    }

    public static FlutterActivityLaunchConfigs$BackgroundMode valueOf(String str) {
        return (FlutterActivityLaunchConfigs$BackgroundMode) Enum.valueOf(FlutterActivityLaunchConfigs$BackgroundMode.class, str);
    }

    public static FlutterActivityLaunchConfigs$BackgroundMode[] values() {
        return (FlutterActivityLaunchConfigs$BackgroundMode[]) $VALUES.clone();
    }
}
