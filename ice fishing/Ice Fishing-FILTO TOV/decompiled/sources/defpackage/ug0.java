package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ug0 {
    public static final /* synthetic */ ug0[] EljAMC1QTz;
    public static final ug0 OOA6hdeuvCS;

    static {
        ug0 ug0Var = new ug0("Default", 0);
        OOA6hdeuvCS = ug0Var;
        EljAMC1QTz = new ug0[]{ug0Var, new ug0("UserInput", 1), new ug0("PreventUserInput", 2)};
    }

    public static ug0 valueOf(String str) {
        return (ug0) Enum.valueOf(ug0.class, str);
    }

    public static ug0[] values() {
        return (ug0[]) EljAMC1QTz.clone();
    }
}
