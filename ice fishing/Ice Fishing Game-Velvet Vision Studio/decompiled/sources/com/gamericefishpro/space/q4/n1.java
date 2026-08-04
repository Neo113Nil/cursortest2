package com.gamericefishpro.space.q4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public static final n1 A;
    public static final n1 B;
    public static final /* synthetic */ n1[] C;
    public static final n1 d;
    public static final n1 e;
    public static final n1 i;
    public static final n1 v;
    public static final n1 w;
    public static final n1 y;
    public static final n1 z;

    static {
        n1 n1Var = new n1("INT", 0);
        d = n1Var;
        n1 n1Var2 = new n1("LONG", 1);
        e = n1Var2;
        n1 n1Var3 = new n1("FLOAT", 2);
        i = n1Var3;
        n1 n1Var4 = new n1("DOUBLE", 3);
        v = n1Var4;
        n1 n1Var5 = new n1("BOOLEAN", 4);
        w = n1Var5;
        n1 n1Var6 = new n1("STRING", 5);
        y = n1Var6;
        f fVar = f.i;
        n1 n1Var7 = new n1("BYTE_STRING", 6);
        z = n1Var7;
        n1 n1Var8 = new n1("ENUM", 7);
        A = n1Var8;
        n1 n1Var9 = new n1("MESSAGE", 8);
        B = n1Var9;
        C = new n1[]{n1Var, n1Var2, n1Var3, n1Var4, n1Var5, n1Var6, n1Var7, n1Var8, n1Var9};
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) C.clone();
    }
}
