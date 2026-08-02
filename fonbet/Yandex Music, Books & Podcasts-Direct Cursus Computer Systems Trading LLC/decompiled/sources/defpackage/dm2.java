package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class dm2 {
    public static final dm2 a;
    public static final dm2 b;
    public static final dm2 c;
    public static final dm2 d;
    public static final dm2 e;
    public static final dm2 f;
    public static final dm2 g;
    public static final dm2 h;
    public static final dm2 i;
    public static final dm2 j;
    public static final dm2 k;
    public static final dm2 l;
    public static final dm2 m;
    public static final dm2 n;
    public static final /* synthetic */ dm2[] o;

    static {
        dm2 dm2Var = new dm2("AlfaBank", 0);
        a = dm2Var;
        dm2 dm2Var2 = new dm2("SberBank", 1);
        b = dm2Var2;
        dm2 dm2Var3 = new dm2("Tinkoff", 2);
        c = dm2Var3;
        dm2 dm2Var4 = new dm2("Vtb", 3);
        d = dm2Var4;
        dm2 dm2Var5 = new dm2("GazpromBank", 4);
        e = dm2Var5;
        dm2 dm2Var6 = new dm2("BankOfMoscow", 5);
        f = dm2Var6;
        dm2 dm2Var7 = new dm2("OpenBank", 6);
        g = dm2Var7;
        dm2 dm2Var8 = new dm2("PromsvyazBank", 7);
        h = dm2Var8;
        dm2 dm2Var9 = new dm2("RosBank", 8);
        i = dm2Var9;
        dm2 dm2Var10 = new dm2("Qiwi", 9);
        j = dm2Var10;
        dm2 dm2Var11 = new dm2("CitiBank", 10);
        k = dm2Var11;
        dm2 dm2Var12 = new dm2("UnicreditBank", 11);
        l = dm2Var12;
        dm2 dm2Var13 = new dm2("RaiffeisenBank", 12);
        m = dm2Var13;
        dm2 dm2Var14 = new dm2("UnknownBank", 13);
        n = dm2Var14;
        o = new dm2[]{dm2Var, dm2Var2, dm2Var3, dm2Var4, dm2Var5, dm2Var6, dm2Var7, dm2Var8, dm2Var9, dm2Var10, dm2Var11, dm2Var12, dm2Var13, dm2Var14};
    }

    public static dm2 valueOf(String str) {
        return (dm2) Enum.valueOf(dm2.class, str);
    }

    public static dm2[] values() {
        return (dm2[]) o.clone();
    }
}
