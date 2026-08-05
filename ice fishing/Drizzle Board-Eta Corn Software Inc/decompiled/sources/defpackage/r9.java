package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r9 {
    public static final r9 MdtA4re8;
    public static final r9 NCTxEWno;
    public static final r9 P7K7Inc8;
    public static final r9 VgvYg0wo;
    public static final /* synthetic */ r9[] b2ZJblxo;
    public static final r9 wxUZMvaN;

    static {
        r9 r9Var = new r9("CPU_ACQUIRED", 0);
        NCTxEWno = r9Var;
        r9 r9Var2 = new r9("BLOCKING", 1);
        MdtA4re8 = r9Var2;
        r9 r9Var3 = new r9("PARKING", 2);
        wxUZMvaN = r9Var3;
        r9 r9Var4 = new r9("DORMANT", 3);
        VgvYg0wo = r9Var4;
        r9 r9Var5 = new r9("TERMINATED", 4);
        P7K7Inc8 = r9Var5;
        b2ZJblxo = new r9[]{r9Var, r9Var2, r9Var3, r9Var4, r9Var5};
    }

    public static r9 valueOf(String str) {
        return (r9) Enum.valueOf(r9.class, str);
    }

    public static r9[] values() {
        return (r9[]) b2ZJblxo.clone();
    }
}
