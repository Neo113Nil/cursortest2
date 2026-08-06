package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c60 {
    public static final c60 AvO7iQsrTN;
    public static final c60 EljAMC1QTz;
    public static final /* synthetic */ c60[] JFJ3QoxA;
    public static final c60 OOA6hdeuvCS;
    public static final c60 encWxUiV2;
    public static final c60 mOu10nynGul;

    static {
        c60 c60Var = new c60("Measuring", 0);
        OOA6hdeuvCS = c60Var;
        c60 c60Var2 = new c60("LookaheadMeasuring", 1);
        EljAMC1QTz = c60Var2;
        c60 c60Var3 = new c60("LayingOut", 2);
        AvO7iQsrTN = c60Var3;
        c60 c60Var4 = new c60("LookaheadLayingOut", 3);
        encWxUiV2 = c60Var4;
        c60 c60Var5 = new c60("Idle", 4);
        mOu10nynGul = c60Var5;
        JFJ3QoxA = new c60[]{c60Var, c60Var2, c60Var3, c60Var4, c60Var5};
    }

    public static c60 valueOf(String str) {
        return (c60) Enum.valueOf(c60.class, str);
    }

    public static c60[] values() {
        return (c60[]) JFJ3QoxA.clone();
    }
}
