package io.flutter.embedding.engine.systemchannels;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LifecycleChannel$AppLifecycleState {
    private static final /* synthetic */ LifecycleChannel$AppLifecycleState[] $VALUES;
    public static final LifecycleChannel$AppLifecycleState DETACHED;
    public static final LifecycleChannel$AppLifecycleState HIDDEN;
    public static final LifecycleChannel$AppLifecycleState INACTIVE;
    public static final LifecycleChannel$AppLifecycleState PAUSED;
    public static final LifecycleChannel$AppLifecycleState RESUMED;

    static {
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState = new LifecycleChannel$AppLifecycleState("DETACHED", 0);
        DETACHED = lifecycleChannel$AppLifecycleState;
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState2 = new LifecycleChannel$AppLifecycleState("RESUMED", 1);
        RESUMED = lifecycleChannel$AppLifecycleState2;
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState3 = new LifecycleChannel$AppLifecycleState("INACTIVE", 2);
        INACTIVE = lifecycleChannel$AppLifecycleState3;
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState4 = new LifecycleChannel$AppLifecycleState("HIDDEN", 3);
        HIDDEN = lifecycleChannel$AppLifecycleState4;
        LifecycleChannel$AppLifecycleState lifecycleChannel$AppLifecycleState5 = new LifecycleChannel$AppLifecycleState("PAUSED", 4);
        PAUSED = lifecycleChannel$AppLifecycleState5;
        $VALUES = new LifecycleChannel$AppLifecycleState[]{lifecycleChannel$AppLifecycleState, lifecycleChannel$AppLifecycleState2, lifecycleChannel$AppLifecycleState3, lifecycleChannel$AppLifecycleState4, lifecycleChannel$AppLifecycleState5};
    }

    public static LifecycleChannel$AppLifecycleState valueOf(String str) {
        return (LifecycleChannel$AppLifecycleState) Enum.valueOf(LifecycleChannel$AppLifecycleState.class, str);
    }

    public static LifecycleChannel$AppLifecycleState[] values() {
        return (LifecycleChannel$AppLifecycleState[]) $VALUES.clone();
    }
}
