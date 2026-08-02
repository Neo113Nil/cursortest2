package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hj5 {
    public static final hj5 a;
    public static final hj5 b;
    public static final /* synthetic */ hj5[] c;

    static {
        hj5 hj5Var = new hj5("DIV_SCREEN", 0);
        a = hj5Var;
        hj5 hj5Var2 = new hj5("DYNAMIC_OVERLAY", 1);
        b = hj5Var2;
        c = new hj5[]{hj5Var, hj5Var2};
    }

    public static hj5 valueOf(String str) {
        return (hj5) Enum.valueOf(hj5.class, str);
    }

    public static hj5[] values() {
        return (hj5[]) c.clone();
    }
}
