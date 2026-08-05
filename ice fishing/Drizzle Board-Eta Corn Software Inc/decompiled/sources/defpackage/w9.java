package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w9 {
    public static final w9 MdtA4re8;
    public static final w9 NCTxEWno;
    public static final /* synthetic */ w9[] P7K7Inc8;
    public static final w9 VgvYg0wo;
    public static final w9 wxUZMvaN;

    static {
        w9 w9Var = new w9("DEFAULT", 0);
        NCTxEWno = w9Var;
        w9 w9Var2 = new w9("LAZY", 1);
        MdtA4re8 = w9Var2;
        w9 w9Var3 = new w9("ATOMIC", 2);
        wxUZMvaN = w9Var3;
        w9 w9Var4 = new w9("UNDISPATCHED", 3);
        VgvYg0wo = w9Var4;
        P7K7Inc8 = new w9[]{w9Var, w9Var2, w9Var3, w9Var4};
    }

    public static w9 valueOf(String str) {
        return (w9) Enum.valueOf(w9.class, str);
    }

    public static w9[] values() {
        return (w9[]) P7K7Inc8.clone();
    }
}
