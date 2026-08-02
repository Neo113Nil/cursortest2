package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ix3 {
    public static final ix3 a;
    public static final ix3 b;
    public static final ix3 c;
    public static final ix3 d;
    public static final ix3 e;
    public static final ix3 f;
    public static final ix3 g;
    public static final ix3 h;
    public static final ix3 i;
    public static final ix3 j;
    public static final ix3 k;
    public static final ix3 l;
    public static final ix3 m;
    public static final /* synthetic */ ix3[] n;

    static {
        ix3 ix3Var = new ix3("AmericanExpress", 0);
        a = ix3Var;
        ix3 ix3Var2 = new ix3("DinersClub", 1);
        b = ix3Var2;
        ix3 ix3Var3 = new ix3("DiscoverCard", 2);
        c = ix3Var3;
        ix3 ix3Var4 = new ix3("JCB", 3);
        d = ix3Var4;
        ix3 ix3Var5 = new ix3("HUMO", 4);
        e = ix3Var5;
        ix3 ix3Var6 = new ix3("Maestro", 5);
        f = ix3Var6;
        ix3 ix3Var7 = new ix3("MasterCard", 6);
        g = ix3Var7;
        ix3 ix3Var8 = new ix3("MIR", 7);
        h = ix3Var8;
        ix3 ix3Var9 = new ix3("UnionPay", 8);
        i = ix3Var9;
        ix3 ix3Var10 = new ix3("Uzcard", 9);
        j = ix3Var10;
        ix3 ix3Var11 = new ix3("Visa", 10);
        k = ix3Var11;
        ix3 ix3Var12 = new ix3("VisaElectron", 11);
        l = ix3Var12;
        ix3 ix3Var13 = new ix3("Unknown", 12);
        m = ix3Var13;
        n = new ix3[]{ix3Var, ix3Var2, ix3Var3, ix3Var4, ix3Var5, ix3Var6, ix3Var7, ix3Var8, ix3Var9, ix3Var10, ix3Var11, ix3Var12, ix3Var13};
    }

    public static ix3 valueOf(String str) {
        return (ix3) Enum.valueOf(ix3.class, str);
    }

    public static ix3[] values() {
        return (ix3[]) n.clone();
    }
}
