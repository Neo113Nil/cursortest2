package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k70 {
    public static final k70 MdtA4re8;
    public static final k70 NCTxEWno;
    public static final /* synthetic */ k70[] VgvYg0wo;
    public static final k70 wxUZMvaN;

    static {
        k70 k70Var = new k70("START", 0);
        NCTxEWno = k70Var;
        k70 k70Var2 = new k70("STOP", 1);
        MdtA4re8 = k70Var2;
        k70 k70Var3 = new k70("STOP_AND_RESET_REPLAY_CACHE", 2);
        wxUZMvaN = k70Var3;
        VgvYg0wo = new k70[]{k70Var, k70Var2, k70Var3};
    }

    public static k70 valueOf(String str) {
        return (k70) Enum.valueOf(k70.class, str);
    }

    public static k70[] values() {
        return (k70[]) VgvYg0wo.clone();
    }
}
