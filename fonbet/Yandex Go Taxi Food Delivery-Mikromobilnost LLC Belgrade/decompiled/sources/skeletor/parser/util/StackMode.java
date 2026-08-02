package skeletor.parser.util;

import defpackage.wyt0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lskeletor/parser/util/StackMode;", "", "Companion", "wyt0", "Start", "Center", "End", "SpaceBetween", "SpaceAround", "parser"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class StackMode {
    private static final /* synthetic */ StackMode[] $VALUES;
    public static final StackMode Center;
    public static final wyt0 Companion;
    public static final StackMode End;
    public static final StackMode SpaceAround;
    public static final StackMode SpaceBetween;
    public static final StackMode Start;

    static {
        StackMode stackMode = new StackMode("Start", 0);
        Start = stackMode;
        StackMode stackMode2 = new StackMode("Center", 1);
        Center = stackMode2;
        StackMode stackMode3 = new StackMode("End", 2);
        End = stackMode3;
        StackMode stackMode4 = new StackMode("SpaceBetween", 3);
        SpaceBetween = stackMode4;
        StackMode stackMode5 = new StackMode("SpaceAround", 4);
        SpaceAround = stackMode5;
        $VALUES = new StackMode[]{stackMode, stackMode2, stackMode3, stackMode4, stackMode5};
        Companion = new wyt0();
    }

    public static StackMode valueOf(String str) {
        return (StackMode) Enum.valueOf(StackMode.class, str);
    }

    public static StackMode[] values() {
        return (StackMode[]) $VALUES.clone();
    }
}
