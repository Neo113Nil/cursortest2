package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tg0 {
    public static final /* synthetic */ tg0[] AvO7iQsrTN;
    public static final tg0 EljAMC1QTz;
    public static final tg0 OOA6hdeuvCS;

    static {
        tg0 tg0Var = new tg0("Default", 0);
        OOA6hdeuvCS = tg0Var;
        tg0 tg0Var2 = new tg0("UserInput", 1);
        EljAMC1QTz = tg0Var2;
        AvO7iQsrTN = new tg0[]{tg0Var, tg0Var2, new tg0("PreventUserInput", 2)};
    }

    public static tg0 valueOf(String str) {
        return (tg0) Enum.valueOf(tg0.class, str);
    }

    public static tg0[] values() {
        return (tg0[]) AvO7iQsrTN.clone();
    }
}
