package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pt1 {
    public static final pt1 a;
    public static final pt1 b;
    public static final /* synthetic */ pt1[] c;

    static {
        pt1 pt1Var = new pt1("AUTOMATIC", 0);
        a = pt1Var;
        pt1 pt1Var2 = new pt1("ENABLED", 1);
        b = pt1Var2;
        c = new pt1[]{pt1Var, pt1Var2, new pt1("DISABLED", 2)};
    }

    public static pt1 valueOf(String str) {
        return (pt1) Enum.valueOf(pt1.class, str);
    }

    public static pt1[] values() {
        return (pt1[]) c.clone();
    }
}
