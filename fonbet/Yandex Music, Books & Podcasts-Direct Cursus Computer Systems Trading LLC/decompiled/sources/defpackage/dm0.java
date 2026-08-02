package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dm0 {
    public static final dm0 a;
    public static final dm0 b;
    public static final /* synthetic */ dm0[] c;

    static {
        dm0 dm0Var = new dm0("BoundReached", 0);
        a = dm0Var;
        dm0 dm0Var2 = new dm0("Finished", 1);
        b = dm0Var2;
        c = new dm0[]{dm0Var, dm0Var2};
    }

    public static dm0 valueOf(String str) {
        return (dm0) Enum.valueOf(dm0.class, str);
    }

    public static dm0[] values() {
        return (dm0[]) c.clone();
    }
}
