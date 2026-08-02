package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o84 {
    public static final o84 a;
    public static final o84 b;
    public static final o84 c;
    public static final /* synthetic */ o84[] d;

    static {
        o84 o84Var = new o84("REGULAR", 0);
        a = o84Var;
        o84 o84Var2 = new o84("CONNECTED", 1);
        b = o84Var2;
        o84 o84Var3 = new o84("CONNECTING", 2);
        c = o84Var3;
        d = new o84[]{o84Var, o84Var2, o84Var3};
    }

    public static o84 valueOf(String str) {
        return (o84) Enum.valueOf(o84.class, str);
    }

    public static o84[] values() {
        return (o84[]) d.clone();
    }
}
