package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g90 {
    public static final g90 AvO7iQsrTN;
    public static final g90 EljAMC1QTz;
    public static final /* synthetic */ g90[] JFJ3QoxA;
    public static final g90 OOA6hdeuvCS;
    public static final g90 encWxUiV2;
    public static final g90 mOu10nynGul;

    static {
        g90 g90Var = new g90("DEBUG", 0);
        OOA6hdeuvCS = g90Var;
        g90 g90Var2 = new g90("INFO", 1);
        EljAMC1QTz = g90Var2;
        g90 g90Var3 = new g90("WARNING", 2);
        AvO7iQsrTN = g90Var3;
        g90 g90Var4 = new g90("ERROR", 3);
        encWxUiV2 = g90Var4;
        g90 g90Var5 = new g90("NONE", 4);
        mOu10nynGul = g90Var5;
        JFJ3QoxA = new g90[]{g90Var, g90Var2, g90Var3, g90Var4, g90Var5};
    }

    public static g90 valueOf(String str) {
        return (g90) Enum.valueOf(g90.class, str);
    }

    public static g90[] values() {
        return (g90[]) JFJ3QoxA.clone();
    }
}
