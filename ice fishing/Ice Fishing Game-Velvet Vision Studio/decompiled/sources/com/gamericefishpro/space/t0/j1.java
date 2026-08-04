package com.gamericefishpro.space.t0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final /* synthetic */ j1[] A;
    public static final j1 d;
    public static final j1 e;
    public static final j1 i;
    public static final j1 v;
    public static final j1 w;
    public static final j1 y;
    public static final j1 z;

    static {
        j1 j1Var = new j1("Invalid", 0);
        d = j1Var;
        j1 j1Var2 = new j1("Cancelled", 1);
        e = j1Var2;
        j1 j1Var3 = new j1("InitialPending", 2);
        i = j1Var3;
        j1 j1Var4 = new j1("RecomposePending", 3);
        v = j1Var4;
        j1 j1Var5 = new j1("Recomposing", 4);
        w = j1Var5;
        j1 j1Var6 = new j1("ApplyPending", 5);
        y = j1Var6;
        j1 j1Var7 = new j1("Applied", 6);
        z = j1Var7;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3, j1Var4, j1Var5, j1Var6, j1Var7};
        A = j1VarArr;
        a4.t(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) A.clone();
    }
}
