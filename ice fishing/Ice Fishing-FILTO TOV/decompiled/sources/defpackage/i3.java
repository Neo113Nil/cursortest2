package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i3 {
    public static final /* synthetic */ i3[] AvO7iQsrTN;
    public static final i3 EljAMC1QTz;
    public static final i3 OOA6hdeuvCS;

    static {
        i3 i3Var = new i3("BoundReached", 0);
        OOA6hdeuvCS = i3Var;
        i3 i3Var2 = new i3("Finished", 1);
        EljAMC1QTz = i3Var2;
        AvO7iQsrTN = new i3[]{i3Var, i3Var2};
    }

    public static i3 valueOf(String str) {
        return (i3) Enum.valueOf(i3.class, str);
    }

    public static i3[] values() {
        return (i3[]) AvO7iQsrTN.clone();
    }
}
