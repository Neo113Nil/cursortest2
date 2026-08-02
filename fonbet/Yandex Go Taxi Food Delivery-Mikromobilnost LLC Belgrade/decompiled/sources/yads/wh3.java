package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class wh3 {
    public static final wh3 b;
    public static final wh3 c;
    public static final wh3 d;
    public static final /* synthetic */ wh3[] e;

    static {
        wh3 wh3Var = new wh3("FIRST_QUARTILE", 0);
        b = wh3Var;
        wh3 wh3Var2 = new wh3("MIDPOINT", 1);
        c = wh3Var2;
        wh3 wh3Var3 = new wh3("THIRD_QUARTILE", 2);
        d = wh3Var3;
        e = new wh3[]{wh3Var, wh3Var2, wh3Var3};
    }

    public static wh3 valueOf(String str) {
        return (wh3) Enum.valueOf(wh3.class, str);
    }

    public static wh3[] values() {
        return (wh3[]) e.clone();
    }
}
