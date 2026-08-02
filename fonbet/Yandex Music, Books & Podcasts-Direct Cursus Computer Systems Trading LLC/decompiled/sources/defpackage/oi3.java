package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class oi3 {
    public static final oi3 a;
    public static final oi3 b;
    public static final oi3 c;
    public static final /* synthetic */ oi3[] d;

    static {
        oi3 oi3Var = new oi3("SUSPEND", 0);
        a = oi3Var;
        oi3 oi3Var2 = new oi3("DROP_OLDEST", 1);
        b = oi3Var2;
        oi3 oi3Var3 = new oi3("DROP_LATEST", 2);
        c = oi3Var3;
        d = new oi3[]{oi3Var, oi3Var2, oi3Var3};
    }

    public static oi3 valueOf(String str) {
        return (oi3) Enum.valueOf(oi3.class, str);
    }

    public static oi3[] values() {
        return (oi3[]) d.clone();
    }
}
