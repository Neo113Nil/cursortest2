package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ys8 {
    public static final ys8 a;
    public static final ys8 b;
    public static final /* synthetic */ ys8[] c;

    static {
        ys8 ys8Var = new ys8("FULL_SCREEN", 0);
        a = ys8Var;
        ys8 ys8Var2 = new ys8("BOTTOM_SHEET", 1);
        b = ys8Var2;
        c = new ys8[]{ys8Var, ys8Var2};
    }

    public static ys8 valueOf(String str) {
        return (ys8) Enum.valueOf(ys8.class, str);
    }

    public static ys8[] values() {
        return (ys8[]) c.clone();
    }
}
