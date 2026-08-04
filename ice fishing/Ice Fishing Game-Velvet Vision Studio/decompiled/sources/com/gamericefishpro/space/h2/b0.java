package com.gamericefishpro.space.h2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static final b0 d;
    public static final b0 e;
    public static final b0 i;
    public static final b0 v;
    public static final b0 w;
    public static final /* synthetic */ b0[] y;

    static {
        b0 b0Var = new b0("Measuring", 0);
        d = b0Var;
        b0 b0Var2 = new b0("LookaheadMeasuring", 1);
        e = b0Var2;
        b0 b0Var3 = new b0("LayingOut", 2);
        i = b0Var3;
        b0 b0Var4 = new b0("LookaheadLayingOut", 3);
        v = b0Var4;
        b0 b0Var5 = new b0("Idle", 4);
        w = b0Var5;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
        y = b0VarArr;
        a4.t(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) y.clone();
    }
}
