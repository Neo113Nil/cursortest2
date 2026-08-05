package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a4 {
    public static final a4 MdtA4re8;
    public static final a4 NCTxEWno;
    public static final /* synthetic */ a4[] VgvYg0wo;
    public static final a4 wxUZMvaN;

    static {
        a4 a4Var = new a4("NAME", 0);
        NCTxEWno = a4Var;
        a4 a4Var2 = new a4("NOVELTY", 1);
        MdtA4re8 = a4Var2;
        a4 a4Var3 = new a4("POPULARITY", 2);
        wxUZMvaN = a4Var3;
        VgvYg0wo = new a4[]{a4Var, a4Var2, a4Var3};
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) VgvYg0wo.clone();
    }
}
