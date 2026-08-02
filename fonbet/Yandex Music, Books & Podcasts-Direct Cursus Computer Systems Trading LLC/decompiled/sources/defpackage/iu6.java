package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iu6 {
    public static final iu6 a;
    public static final iu6 b;
    public static final iu6 c;
    public static final /* synthetic */ iu6[] d;

    static {
        iu6 iu6Var = new iu6("CROSSED", 0);
        a = iu6Var;
        iu6 iu6Var2 = new iu6("NOT_CROSSED", 1);
        b = iu6Var2;
        iu6 iu6Var3 = new iu6("COLLAPSED", 2);
        c = iu6Var3;
        d = new iu6[]{iu6Var, iu6Var2, iu6Var3};
    }

    public static iu6 valueOf(String str) {
        return (iu6) Enum.valueOf(iu6.class, str);
    }

    public static iu6[] values() {
        return (iu6[]) d.clone();
    }
}
