package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qx1 {
    public static final qx1 a;
    public static final qx1 b;
    public static final qx1 c;
    public static final /* synthetic */ qx1[] d;

    static {
        qx1 qx1Var = new qx1("BLUETOOTH", 0);
        a = qx1Var;
        qx1 qx1Var2 = new qx1("WIRED", 1);
        b = qx1Var2;
        qx1 qx1Var3 = new qx1("SPEAKER", 2);
        c = qx1Var3;
        d = new qx1[]{qx1Var, qx1Var2, qx1Var3};
    }

    public static qx1 valueOf(String str) {
        return (qx1) Enum.valueOf(qx1.class, str);
    }

    public static qx1[] values() {
        return (qx1[]) d.clone();
    }
}
