package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t30 {
    public static final t30 MdtA4re8;
    public static final t30 NCTxEWno;
    public static final /* synthetic */ t30[] wxUZMvaN;

    /* JADX INFO: Fake field, exist only in values array */
    t30 EF0;

    static {
        t30 t30Var = new t30("AUTOMATIC", 0);
        t30 t30Var2 = new t30("TRUNCATE", 1);
        NCTxEWno = t30Var2;
        t30 t30Var3 = new t30("WRITE_AHEAD_LOGGING", 2);
        MdtA4re8 = t30Var3;
        wxUZMvaN = new t30[]{t30Var, t30Var2, t30Var3};
    }

    public static t30 valueOf(String str) {
        return (t30) Enum.valueOf(t30.class, str);
    }

    public static t30[] values() {
        return (t30[]) wxUZMvaN.clone();
    }
}
