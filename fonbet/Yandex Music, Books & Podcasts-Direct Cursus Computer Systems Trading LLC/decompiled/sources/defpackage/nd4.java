package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nd4 {
    public static final nd4 a;
    public static final nd4 b;
    public static final /* synthetic */ nd4[] c;

    static {
        nd4 nd4Var = new nd4("DATE", 0);
        a = nd4Var;
        nd4 nd4Var2 = new nd4("ALPHABET", 1);
        b = nd4Var2;
        c = new nd4[]{nd4Var, nd4Var2};
    }

    public static nd4 valueOf(String str) {
        return (nd4) Enum.valueOf(nd4.class, str);
    }

    public static nd4[] values() {
        return (nd4[]) c.clone();
    }
}
