package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lf3 {
    public static final lf3 a;
    public static final lf3 b;
    public static final lf3 c;
    public static final /* synthetic */ lf3[] d;

    static {
        lf3 lf3Var = new lf3("Collapsed", 0);
        a = lf3Var;
        lf3 lf3Var2 = new lf3("Expanded", 1);
        b = lf3Var2;
        lf3 lf3Var3 = new lf3("Hidden", 2);
        c = lf3Var3;
        d = new lf3[]{lf3Var, lf3Var2, lf3Var3};
    }

    public static lf3 valueOf(String str) {
        return (lf3) Enum.valueOf(lf3.class, str);
    }

    public static lf3[] values() {
        return (lf3[]) d.clone();
    }
}
