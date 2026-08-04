package com.gamericefishpro.space.si;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final g0 d;
    public static final g0 e;
    public static final g0 i;
    public static final /* synthetic */ g0[] v;

    static {
        g0 g0Var = new g0("START", 0);
        d = g0Var;
        g0 g0Var2 = new g0("STOP", 1);
        e = g0Var2;
        g0 g0Var3 = new g0("STOP_AND_RESET_REPLAY_CACHE", 2);
        i = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        v = g0VarArr;
        a4.t(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) v.clone();
    }
}
