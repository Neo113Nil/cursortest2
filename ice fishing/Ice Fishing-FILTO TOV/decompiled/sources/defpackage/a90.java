package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a90 {
    public static final /* synthetic */ a90[] EljAMC1QTz;
    public static final a90 OOA6hdeuvCS;

    /* JADX INFO: Fake field, exist only in values array */
    a90 EF0;

    static {
        a90 a90Var = new a90("SYNCHRONIZED", 0);
        a90 a90Var2 = new a90("PUBLICATION", 1);
        a90 a90Var3 = new a90("NONE", 2);
        OOA6hdeuvCS = a90Var3;
        EljAMC1QTz = new a90[]{a90Var, a90Var2, a90Var3};
    }

    public static a90 valueOf(String str) {
        return (a90) Enum.valueOf(a90.class, str);
    }

    public static a90[] values() {
        return (a90[]) EljAMC1QTz.clone();
    }
}
