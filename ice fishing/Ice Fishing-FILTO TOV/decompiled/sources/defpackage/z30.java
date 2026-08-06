package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z30 {
    public static final z30 AvO7iQsrTN;
    public static final z30 EljAMC1QTz;
    public static final z30 OOA6hdeuvCS;
    public static final z30 encWxUiV2;
    public static final /* synthetic */ z30[] mOu10nynGul;

    static {
        z30 z30Var = new z30("IGNORED", 0);
        OOA6hdeuvCS = z30Var;
        z30 z30Var2 = new z30("SCHEDULED", 1);
        EljAMC1QTz = z30Var2;
        z30 z30Var3 = new z30("DEFERRED", 2);
        AvO7iQsrTN = z30Var3;
        z30 z30Var4 = new z30("IMMINENT", 3);
        encWxUiV2 = z30Var4;
        mOu10nynGul = new z30[]{z30Var, z30Var2, z30Var3, z30Var4};
    }

    public static z30 valueOf(String str) {
        return (z30) Enum.valueOf(z30.class, str);
    }

    public static z30[] values() {
        return (z30[]) mOu10nynGul.clone();
    }
}
