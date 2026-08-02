package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class gh3 {
    public static final gh3 b;
    public static final gh3 c;
    public static final /* synthetic */ gh3[] d;

    static {
        gh3 gh3Var = new gh3("LEFT_TOP", 0);
        b = gh3Var;
        gh3 gh3Var2 = new gh3("CENTER", 1);
        c = gh3Var2;
        d = new gh3[]{gh3Var, gh3Var2};
    }

    public static gh3 valueOf(String str) {
        return (gh3) Enum.valueOf(gh3.class, str);
    }

    public static gh3[] values() {
        return (gh3[]) d.clone();
    }
}
