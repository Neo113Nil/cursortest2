package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class za3 {
    public static final za3 b;
    public static final za3 c;
    public static final za3 d;
    public static final /* synthetic */ za3[] e;

    static {
        za3 za3Var = new za3("MILLISECONDS", 0);
        b = za3Var;
        za3 za3Var2 = new za3("PERCENTS", 1);
        c = za3Var2;
        za3 za3Var3 = new za3("POSITION", 2);
        d = za3Var3;
        e = new za3[]{za3Var, za3Var2, za3Var3};
    }

    public static za3 valueOf(String str) {
        return (za3) Enum.valueOf(za3.class, str);
    }

    public static za3[] values() {
        return (za3[]) e.clone();
    }
}
