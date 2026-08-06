package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lz0 {
    public static final /* synthetic */ lz0[] EljAMC1QTz;
    public static final lz0 OOA6hdeuvCS;

    static {
        lz0 lz0Var = new lz0("Inherit", 0);
        OOA6hdeuvCS = lz0Var;
        EljAMC1QTz = new lz0[]{lz0Var, new lz0("SecureOn", 1), new lz0("SecureOff", 2)};
    }

    public static lz0 valueOf(String str) {
        return (lz0) Enum.valueOf(lz0.class, str);
    }

    public static lz0[] values() {
        return (lz0[]) EljAMC1QTz.clone();
    }
}
