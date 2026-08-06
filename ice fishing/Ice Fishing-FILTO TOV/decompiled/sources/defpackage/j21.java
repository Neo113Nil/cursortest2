package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j21 {
    public static final j21 AvO7iQsrTN;
    public static final j21 EljAMC1QTz;
    public static final j21 OOA6hdeuvCS;
    public static final /* synthetic */ j21[] encWxUiV2;

    static {
        j21 j21Var = new j21("START", 0);
        OOA6hdeuvCS = j21Var;
        j21 j21Var2 = new j21("STOP", 1);
        EljAMC1QTz = j21Var2;
        j21 j21Var3 = new j21("STOP_AND_RESET_REPLAY_CACHE", 2);
        AvO7iQsrTN = j21Var3;
        encWxUiV2 = new j21[]{j21Var, j21Var2, j21Var3};
    }

    public static j21 valueOf(String str) {
        return (j21) Enum.valueOf(j21.class, str);
    }

    public static j21[] values() {
        return (j21[]) encWxUiV2.clone();
    }
}
