package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public static final b2 d;
    public static final b2 e;
    public static final b2 i;
    public static final /* synthetic */ b2[] v;

    static {
        b2 b2Var = new b2("ContinueTraversal", 0);
        d = b2Var;
        b2 b2Var2 = new b2("SkipSubtreeAndContinueTraversal", 1);
        e = b2Var2;
        b2 b2Var3 = new b2("CancelTraversal", 2);
        i = b2Var3;
        b2[] b2VarArr = {b2Var, b2Var2, b2Var3};
        v = b2VarArr;
        a4.t(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) v.clone();
    }
}
