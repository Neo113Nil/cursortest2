package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uo4 {
    public static final uo4 a;
    public static final uo4 b;
    public static final uo4 c;
    public static final uo4 d;
    public static final /* synthetic */ uo4[] e;

    static {
        uo4 uo4Var = new uo4("NotPlayable", 0);
        a = uo4Var;
        uo4 uo4Var2 = new uo4("NotAllowedByExplicitFilter", 1);
        b = uo4Var2;
        uo4 uo4Var3 = new uo4("NotAvailable", 2);
        c = uo4Var3;
        uo4 uo4Var4 = new uo4("Available", 3);
        d = uo4Var4;
        e = new uo4[]{uo4Var, uo4Var2, uo4Var3, uo4Var4};
    }

    public static uo4 valueOf(String str) {
        return (uo4) Enum.valueOf(uo4.class, str);
    }

    public static uo4[] values() {
        return (uo4[]) e.clone();
    }
}
