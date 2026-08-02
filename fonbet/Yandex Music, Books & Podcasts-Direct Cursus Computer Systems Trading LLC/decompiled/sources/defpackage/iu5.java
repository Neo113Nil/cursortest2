package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class iu5 {
    public static final iu5 a;
    public static final iu5 b;
    public static final /* synthetic */ iu5[] c;

    static {
        iu5 iu5Var = new iu5("BIG", 0);
        a = iu5Var;
        iu5 iu5Var2 = new iu5("MEDIUM", 1);
        b = iu5Var2;
        c = new iu5[]{iu5Var, iu5Var2};
    }

    public static iu5 valueOf(String str) {
        return (iu5) Enum.valueOf(iu5.class, str);
    }

    public static iu5[] values() {
        return (iu5[]) c.clone();
    }
}
