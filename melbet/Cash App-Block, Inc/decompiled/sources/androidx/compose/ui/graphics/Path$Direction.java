package androidx.compose.ui.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Path$Direction {
    public static final /* synthetic */ Path$Direction[] $VALUES = {new Path$Direction("CounterClockwise", 0), new Path$Direction("Clockwise", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Path$Direction EF5;

    public static Path$Direction valueOf(String str) {
        return (Path$Direction) Enum.valueOf(Path$Direction.class, str);
    }

    public static Path$Direction[] values() {
        return (Path$Direction[]) $VALUES.clone();
    }
}
