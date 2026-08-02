package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class yh0 {
    public static final yh0 b;
    public static final yh0 c;
    public static final /* synthetic */ yh0[] d;

    static {
        yh0 yh0Var = new yh0("BLOCK", 0);
        b = yh0Var;
        yh0 yh0Var2 = new yh0("BLOCK_INNER_AD", 1);
        c = yh0Var2;
        d = new yh0[]{yh0Var, yh0Var2};
    }

    public static yh0 valueOf(String str) {
        return (yh0) Enum.valueOf(yh0.class, str);
    }

    public static yh0[] values() {
        return (yh0[]) d.clone();
    }
}
