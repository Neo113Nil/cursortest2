package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u9 {
    public static final /* synthetic */ u9[] MdtA4re8;
    public static final u9 NCTxEWno;

    static {
        u9 u9Var = new u9("COROUTINE_SUSPENDED", 0);
        NCTxEWno = u9Var;
        MdtA4re8 = new u9[]{u9Var, new u9("UNDECIDED", 1), new u9("RESUMED", 2)};
    }

    public static u9 valueOf(String str) {
        return (u9) Enum.valueOf(u9.class, str);
    }

    public static u9[] values() {
        return (u9[]) MdtA4re8.clone();
    }
}
