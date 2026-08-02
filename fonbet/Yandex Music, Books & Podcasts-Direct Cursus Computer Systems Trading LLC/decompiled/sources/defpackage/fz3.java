package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fz3 {
    public static final fz3 a;
    public static final fz3 b;
    public static final fz3 c;
    public static final /* synthetic */ fz3[] d;

    static {
        fz3 fz3Var = new fz3("SIMPLE", 0);
        a = fz3Var;
        fz3 fz3Var2 = new fz3("TOP_ARTISTS", 1);
        b = fz3Var2;
        fz3 fz3Var3 = new fz3("EXPANDED", 2);
        c = fz3Var3;
        d = new fz3[]{fz3Var, fz3Var2, fz3Var3};
    }

    public static fz3 valueOf(String str) {
        return (fz3) Enum.valueOf(fz3.class, str);
    }

    public static fz3[] values() {
        return (fz3[]) d.clone();
    }
}
