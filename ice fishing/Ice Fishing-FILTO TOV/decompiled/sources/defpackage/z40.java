package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z40 {
    public static final /* synthetic */ z40[] AvO7iQsrTN;
    public static final z40 EljAMC1QTz;
    public static final z40 OOA6hdeuvCS;

    static {
        z40 z40Var = new z40("Singleton", 0);
        OOA6hdeuvCS = z40Var;
        z40 z40Var2 = new z40("Factory", 1);
        EljAMC1QTz = z40Var2;
        AvO7iQsrTN = new z40[]{z40Var, z40Var2, new z40("Scoped", 2)};
    }

    public static z40 valueOf(String str) {
        return (z40) Enum.valueOf(z40.class, str);
    }

    public static z40[] values() {
        return (z40[]) AvO7iQsrTN.clone();
    }
}
