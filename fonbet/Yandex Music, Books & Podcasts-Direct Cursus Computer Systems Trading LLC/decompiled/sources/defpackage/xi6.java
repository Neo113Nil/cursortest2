package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xi6 {
    public static final xi6 a;
    public static final xi6 b;
    public static final xi6 c;
    public static final /* synthetic */ xi6[] d;

    static {
        xi6 xi6Var = new xi6("NotAvailable", 0);
        a = xi6Var;
        xi6 xi6Var2 = new xi6("Disabled", 1);
        b = xi6Var2;
        xi6 xi6Var3 = new xi6("Enabled", 2);
        c = xi6Var3;
        d = new xi6[]{xi6Var, xi6Var2, xi6Var3};
    }

    public static xi6 valueOf(String str) {
        return (xi6) Enum.valueOf(xi6.class, str);
    }

    public static xi6[] values() {
        return (xi6[]) d.clone();
    }
}
