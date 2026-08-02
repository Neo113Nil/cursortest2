package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class za2 {
    public static final za2 b;
    public static final za2 c;
    public static final za2 d;
    public static final /* synthetic */ za2[] e;

    static {
        za2 za2Var = new za2("SCREEN_ON", 0);
        b = za2Var;
        za2 za2Var2 = new za2("SCREEN_OFF", 1);
        c = za2Var2;
        za2 za2Var3 = new za2("USER_PRESENT", 2);
        d = za2Var3;
        e = new za2[]{za2Var, za2Var2, za2Var3};
    }

    public static za2 valueOf(String str) {
        return (za2) Enum.valueOf(za2.class, str);
    }

    public static za2[] values() {
        return (za2[]) e.clone();
    }
}
