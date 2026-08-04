package com.gamericefishpro.space.z;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public static final v0 d;
    public static final v0 e;
    public static final /* synthetic */ v0[] i;

    static {
        v0 v0Var = new v0("Vertical", 0);
        d = v0Var;
        v0 v0Var2 = new v0("Horizontal", 1);
        e = v0Var2;
        v0[] v0VarArr = {v0Var, v0Var2};
        i = v0VarArr;
        a4.t(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) i.clone();
    }
}
