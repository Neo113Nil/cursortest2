package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class fi1 {
    public static final fi1 b;
    public static final fi1 c;
    public static final fi1 d;
    public static final /* synthetic */ fi1[] e;

    static {
        fi1 fi1Var = new fi1("EXACTLY", 0);
        b = fi1Var;
        fi1 fi1Var2 = new fi1("AT_MOST", 1);
        c = fi1Var2;
        fi1 fi1Var3 = new fi1("UNSPECIFIED", 2);
        d = fi1Var3;
        e = new fi1[]{fi1Var, fi1Var2, fi1Var3};
    }

    public static fi1 valueOf(String str) {
        return (fi1) Enum.valueOf(fi1.class, str);
    }

    public static fi1[] values() {
        return (fi1[]) e.clone();
    }
}
