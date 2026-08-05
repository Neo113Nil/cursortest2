package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q3 {
    public static final q3 MdtA4re8;
    public static final q3 NCTxEWno;
    public static final /* synthetic */ q3[] VgvYg0wo;
    public static final q3 wxUZMvaN;

    static {
        q3 q3Var = new q3("COMPACT", 0);
        NCTxEWno = q3Var;
        q3 q3Var2 = new q3("STANDARD", 1);
        MdtA4re8 = q3Var2;
        q3 q3Var3 = new q3("LARGE", 2);
        wxUZMvaN = q3Var3;
        VgvYg0wo = new q3[]{q3Var, q3Var2, q3Var3};
    }

    public static q3 valueOf(String str) {
        return (q3) Enum.valueOf(q3.class, str);
    }

    public static q3[] values() {
        return (q3[]) VgvYg0wo.clone();
    }
}
