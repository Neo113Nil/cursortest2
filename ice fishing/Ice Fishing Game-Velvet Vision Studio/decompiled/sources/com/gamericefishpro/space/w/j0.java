package com.gamericefishpro.space.w;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 d;
    public static final j0 e;
    public static final /* synthetic */ j0[] i;

    static {
        j0 j0Var = new j0("Restart", 0);
        d = j0Var;
        j0 j0Var2 = new j0("Reverse", 1);
        e = j0Var2;
        j0[] j0VarArr = {j0Var, j0Var2};
        i = j0VarArr;
        a4.t(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) i.clone();
    }
}
