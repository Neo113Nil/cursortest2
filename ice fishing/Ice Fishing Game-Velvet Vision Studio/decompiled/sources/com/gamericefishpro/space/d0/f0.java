package com.gamericefishpro.space.d0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final f0 d;
    public static final f0 e;
    public static final f0 i;
    public static final /* synthetic */ f0[] v;

    static {
        f0 f0Var = new f0("Vertical", 0);
        d = f0Var;
        f0 f0Var2 = new f0("Horizontal", 1);
        e = f0Var2;
        f0 f0Var3 = new f0("Both", 2);
        i = f0Var3;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3};
        v = f0VarArr;
        a4.t(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) v.clone();
    }
}
