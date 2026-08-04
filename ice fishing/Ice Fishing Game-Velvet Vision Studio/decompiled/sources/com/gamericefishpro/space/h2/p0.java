package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final p0 d;
    public static final p0 e;
    public static final p0 i;
    public static final /* synthetic */ p0[] v;

    static {
        p0 p0Var = new p0("IsPlacedInLookahead", 0);
        d = p0Var;
        p0 p0Var2 = new p0("IsPlacedInApproach", 1);
        e = p0Var2;
        p0 p0Var3 = new p0("IsNotPlaced", 2);
        i = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        v = p0VarArr;
        a4.t(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) v.clone();
    }
}
