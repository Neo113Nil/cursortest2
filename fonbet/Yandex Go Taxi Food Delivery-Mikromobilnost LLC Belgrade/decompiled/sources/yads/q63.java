package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class q63 {
    public static final q63 b;
    public static final q63 c;
    public static final q63 d;
    public static final q63 e;
    public static final q63 f;
    public static final q63 g;
    public static final q63 h;
    public static final q63 i;
    public static final q63 j;
    public static final q63 k;
    public static final /* synthetic */ q63[] l;

    static {
        q63 q63Var = new q63("ADTUNE_CLICK", 0);
        b = q63Var;
        q63 q63Var2 = new q63("CLICK", 1);
        c = q63Var2;
        q63 q63Var3 = new q63("FALSE_CLICK", 2);
        d = q63Var3;
        q63 q63Var4 = new q63("IMPRESSION", 3);
        e = q63Var4;
        q63 q63Var5 = new q63("DSP_IMPRESSION", 4);
        f = q63Var5;
        q63 q63Var6 = new q63("MEDIATION_IMPRESSION", 5);
        g = q63Var6;
        q63 q63Var7 = new q63("MEDIATION_RESPONSE", 6);
        h = q63Var7;
        q63 q63Var8 = new q63("RENDER", 7);
        i = q63Var8;
        q63 q63Var9 = new q63("SERVER_SIDE_REWARD", 8);
        j = q63Var9;
        q63 q63Var10 = new q63("UNKNOWN", 9);
        k = q63Var10;
        l = new q63[]{q63Var, q63Var2, q63Var3, q63Var4, q63Var5, q63Var6, q63Var7, q63Var8, q63Var9, q63Var10};
    }

    public static q63 valueOf(String str) {
        return (q63) Enum.valueOf(q63.class, str);
    }

    public static q63[] values() {
        return (q63[]) l.clone();
    }
}
