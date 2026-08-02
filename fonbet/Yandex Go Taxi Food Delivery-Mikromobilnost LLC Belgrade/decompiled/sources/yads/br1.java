package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class br1 {
    public static final br1 b;
    public static final br1 c;
    public static final /* synthetic */ br1[] d;

    static {
        br1 br1Var = new br1("INFO", 0);
        b = br1Var;
        br1 br1Var2 = new br1("ERROR", 1);
        c = br1Var2;
        d = new br1[]{br1Var, br1Var2};
    }

    public static br1 valueOf(String str) {
        return (br1) Enum.valueOf(br1.class, str);
    }

    public static br1[] values() {
        return (br1[]) d.clone();
    }
}
