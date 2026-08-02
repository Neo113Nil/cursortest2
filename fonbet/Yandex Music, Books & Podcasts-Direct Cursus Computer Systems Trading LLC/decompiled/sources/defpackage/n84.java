package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n84 {
    public static final n84 a;
    public static final n84 b;
    public static final n84 c;
    public static final /* synthetic */ n84[] d;

    static {
        n84 n84Var = new n84("REGULAR", 0);
        a = n84Var;
        n84 n84Var2 = new n84("CONNECTING", 1);
        b = n84Var2;
        n84 n84Var3 = new n84("CONNECTED", 2);
        c = n84Var3;
        d = new n84[]{n84Var, n84Var2, n84Var3};
    }

    public static n84 valueOf(String str) {
        return (n84) Enum.valueOf(n84.class, str);
    }

    public static n84[] values() {
        return (n84[]) d.clone();
    }
}
