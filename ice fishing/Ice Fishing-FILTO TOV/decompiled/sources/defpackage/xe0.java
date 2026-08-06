package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xe0 {
    public static final /* synthetic */ xe0[] AvO7iQsrTN;
    public static final xe0 EljAMC1QTz;
    public static final xe0 OOA6hdeuvCS;

    /* JADX INFO: Fake field, exist only in values array */
    xe0 EF0;

    static {
        xe0 xe0Var = new xe0("DefaultSpatial", 0);
        xe0 xe0Var2 = new xe0("FastSpatial", 1);
        OOA6hdeuvCS = xe0Var2;
        xe0 xe0Var3 = new xe0("SlowSpatial", 2);
        xe0 xe0Var4 = new xe0("DefaultEffects", 3);
        xe0 xe0Var5 = new xe0("FastEffects", 4);
        EljAMC1QTz = xe0Var5;
        AvO7iQsrTN = new xe0[]{xe0Var, xe0Var2, xe0Var3, xe0Var4, xe0Var5, new xe0("SlowEffects", 5)};
    }

    public static xe0 valueOf(String str) {
        return (xe0) Enum.valueOf(xe0.class, str);
    }

    public static xe0[] values() {
        return (xe0[]) AvO7iQsrTN.clone();
    }
}
