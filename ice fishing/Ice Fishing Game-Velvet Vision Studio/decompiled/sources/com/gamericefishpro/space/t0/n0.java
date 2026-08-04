package com.gamericefishpro.space.t0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final n0 d;
    public static final n0 e;
    public static final n0 i;
    public static final n0 v;
    public static final /* synthetic */ n0[] w;

    static {
        n0 n0Var = new n0("IGNORED", 0);
        d = n0Var;
        n0 n0Var2 = new n0("SCHEDULED", 1);
        e = n0Var2;
        n0 n0Var3 = new n0("DEFERRED", 2);
        i = n0Var3;
        n0 n0Var4 = new n0("IMMINENT", 3);
        v = n0Var4;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4};
        w = n0VarArr;
        a4.t(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) w.clone();
    }
}
