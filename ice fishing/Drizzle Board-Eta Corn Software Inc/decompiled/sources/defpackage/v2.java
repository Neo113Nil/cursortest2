package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class v2 {
    public static final v2 MdtA4re8;
    public static final v2 NCTxEWno;
    public static final /* synthetic */ v2[] VgvYg0wo;
    public static final v2 wxUZMvaN;

    static {
        v2 v2Var = new v2("SUSPEND", 0);
        NCTxEWno = v2Var;
        v2 v2Var2 = new v2("DROP_OLDEST", 1);
        MdtA4re8 = v2Var2;
        v2 v2Var3 = new v2("DROP_LATEST", 2);
        wxUZMvaN = v2Var3;
        VgvYg0wo = new v2[]{v2Var, v2Var2, v2Var3};
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) VgvYg0wo.clone();
    }
}
