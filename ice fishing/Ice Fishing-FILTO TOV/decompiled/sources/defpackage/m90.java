package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m90 {
    public static final m90 AvO7iQsrTN;
    public static final m90 EljAMC1QTz;
    public static final /* synthetic */ m90[] JFJ3QoxA;
    public static final m90 OOA6hdeuvCS;
    public static final m90 encWxUiV2;
    public static final m90 mOu10nynGul;

    static {
        m90 m90Var = new m90("DESTROYED", 0);
        OOA6hdeuvCS = m90Var;
        m90 m90Var2 = new m90("INITIALIZED", 1);
        EljAMC1QTz = m90Var2;
        m90 m90Var3 = new m90("CREATED", 2);
        AvO7iQsrTN = m90Var3;
        m90 m90Var4 = new m90("STARTED", 3);
        encWxUiV2 = m90Var4;
        m90 m90Var5 = new m90("RESUMED", 4);
        mOu10nynGul = m90Var5;
        JFJ3QoxA = new m90[]{m90Var, m90Var2, m90Var3, m90Var4, m90Var5};
    }

    public static m90 valueOf(String str) {
        return (m90) Enum.valueOf(m90.class, str);
    }

    public static m90[] values() {
        return (m90[]) JFJ3QoxA.clone();
    }
}
