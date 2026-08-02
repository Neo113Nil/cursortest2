package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ep4 {
    public static final ep4 a;
    public static final ep4 b;
    public static final /* synthetic */ ep4[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ep4 EF0;

    static {
        ep4 ep4Var = new ep4("None", 0);
        ep4 ep4Var2 = new ep4("Disabled", 1);
        a = ep4Var2;
        ep4 ep4Var3 = new ep4("Enabled", 2);
        b = ep4Var3;
        c = new ep4[]{ep4Var, ep4Var2, ep4Var3};
    }

    public static ep4 valueOf(String str) {
        return (ep4) Enum.valueOf(ep4.class, str);
    }

    public static ep4[] values() {
        return (ep4[]) c.clone();
    }
}
