package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wa0 {
    public static final wa0 MdtA4re8;
    public static final wa0 NCTxEWno;
    public static final wa0 P7K7Inc8;
    public static final wa0 VgvYg0wo;
    public static final /* synthetic */ wa0[] b2ZJblxo;
    public static final wa0 wxUZMvaN;

    static {
        wa0 wa0Var = new wa0("END", 0);
        NCTxEWno = wa0Var;
        wa0 wa0Var2 = new wa0("ROLLBACK", 1);
        MdtA4re8 = wa0Var2;
        wa0 wa0Var3 = new wa0("BEGIN_EXCLUSIVE", 2);
        wxUZMvaN = wa0Var3;
        wa0 wa0Var4 = new wa0("BEGIN_IMMEDIATE", 3);
        VgvYg0wo = wa0Var4;
        wa0 wa0Var5 = new wa0("BEGIN_DEFERRED", 4);
        P7K7Inc8 = wa0Var5;
        b2ZJblxo = new wa0[]{wa0Var, wa0Var2, wa0Var3, wa0Var4, wa0Var5};
    }

    public static wa0 valueOf(String str) {
        return (wa0) Enum.valueOf(wa0.class, str);
    }

    public static wa0[] values() {
        return (wa0[]) b2ZJblxo.clone();
    }
}
