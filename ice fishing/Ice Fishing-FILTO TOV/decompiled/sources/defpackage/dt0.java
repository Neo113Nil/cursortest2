package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dt0 {
    public static final dt0 AvO7iQsrTN;
    public static final dt0 EljAMC1QTz;
    public static final dt0 JFJ3QoxA;
    public static final dt0 OOA6hdeuvCS;
    public static final dt0 encWxUiV2;
    public static final dt0 mOu10nynGul;
    public static final /* synthetic */ dt0[] rQPn8YBR;

    static {
        dt0 dt0Var = new dt0("ShutDown", 0);
        OOA6hdeuvCS = dt0Var;
        dt0 dt0Var2 = new dt0("ShuttingDown", 1);
        EljAMC1QTz = dt0Var2;
        dt0 dt0Var3 = new dt0("Inactive", 2);
        AvO7iQsrTN = dt0Var3;
        dt0 dt0Var4 = new dt0("InactivePendingWork", 3);
        encWxUiV2 = dt0Var4;
        dt0 dt0Var5 = new dt0("Idle", 4);
        mOu10nynGul = dt0Var5;
        dt0 dt0Var6 = new dt0("PendingWork", 5);
        JFJ3QoxA = dt0Var6;
        rQPn8YBR = new dt0[]{dt0Var, dt0Var2, dt0Var3, dt0Var4, dt0Var5, dt0Var6};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) rQPn8YBR.clone();
    }
}
