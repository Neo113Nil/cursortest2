package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xw6 {
    public static final xw6 a;
    public static final xw6 b;
    public static final xw6 c;
    public static final /* synthetic */ xw6[] d;

    static {
        xw6 xw6Var = new xw6("None", 0);
        a = xw6Var;
        xw6 xw6Var2 = new xw6("Cancelled", 1);
        b = xw6Var2;
        xw6 xw6Var3 = new xw6("Redirected", 2);
        c = xw6Var3;
        d = new xw6[]{xw6Var, xw6Var2, xw6Var3, new xw6("RedirectCancelled", 3)};
    }

    public static xw6 valueOf(String str) {
        return (xw6) Enum.valueOf(xw6.class, str);
    }

    public static xw6[] values() {
        return (xw6[]) d.clone();
    }
}
