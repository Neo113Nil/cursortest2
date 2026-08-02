package app.cash.molecule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RecompositionMode {
    public static final /* synthetic */ RecompositionMode[] $VALUES;
    public static final RecompositionMode ContextClock;
    public static final RecompositionMode Immediate;

    static {
        RecompositionMode recompositionMode = new RecompositionMode("ContextClock", 0);
        ContextClock = recompositionMode;
        RecompositionMode recompositionMode2 = new RecompositionMode("Immediate", 1);
        Immediate = recompositionMode2;
        $VALUES = new RecompositionMode[]{recompositionMode, recompositionMode2};
    }

    public static RecompositionMode valueOf(String str) {
        return (RecompositionMode) Enum.valueOf(RecompositionMode.class, str);
    }

    public static RecompositionMode[] values() {
        return (RecompositionMode[]) $VALUES.clone();
    }
}
