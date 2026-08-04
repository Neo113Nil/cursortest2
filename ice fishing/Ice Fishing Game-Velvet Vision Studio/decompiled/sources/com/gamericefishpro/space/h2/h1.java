package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static final h1 d;
    public static final h1 e;
    public static final /* synthetic */ h1[] i;

    static {
        h1 h1Var = new h1("Min", 0);
        d = h1Var;
        h1 h1Var2 = new h1("Max", 1);
        e = h1Var2;
        h1[] h1VarArr = {h1Var, h1Var2};
        i = h1VarArr;
        a4.t(h1VarArr);
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) i.clone();
    }
}
