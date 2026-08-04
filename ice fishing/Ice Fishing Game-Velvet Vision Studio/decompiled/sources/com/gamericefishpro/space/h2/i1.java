package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final i1 d;
    public static final i1 e;
    public static final /* synthetic */ i1[] i;

    static {
        i1 i1Var = new i1("Width", 0);
        d = i1Var;
        i1 i1Var2 = new i1("Height", 1);
        e = i1Var2;
        i1[] i1VarArr = {i1Var, i1Var2};
        i = i1VarArr;
        a4.t(i1VarArr);
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) i.clone();
    }
}
