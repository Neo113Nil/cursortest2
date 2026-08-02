package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pf0 {
    public static final pf0 a;
    public static final pf0 b;
    public static final /* synthetic */ pf0[] c;

    static {
        pf0 pf0Var = new pf0("SHOW_ORIGINAL", 0);
        a = pf0Var;
        pf0 pf0Var2 = new pf0("SHOW_TRANSLATED", 1);
        b = pf0Var2;
        c = new pf0[]{pf0Var, pf0Var2};
    }

    public static pf0 valueOf(String str) {
        return (pf0) Enum.valueOf(pf0.class, str);
    }

    public static pf0[] values() {
        return (pf0[]) c.clone();
    }
}
