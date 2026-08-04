package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final d0 d;
    public static final d0 e;
    public static final d0 i;
    public static final /* synthetic */ d0[] v;

    static {
        d0 d0Var = new d0("InMeasureBlock", 0);
        d = d0Var;
        d0 d0Var2 = new d0("InLayoutBlock", 1);
        e = d0Var2;
        d0 d0Var3 = new d0("NotUsed", 2);
        i = d0Var3;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3};
        v = d0VarArr;
        a4.t(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) v.clone();
    }
}
