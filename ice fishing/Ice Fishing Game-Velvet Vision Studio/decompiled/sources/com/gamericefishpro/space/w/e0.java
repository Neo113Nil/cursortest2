package com.gamericefishpro.space.w;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final e0 d;
    public static final /* synthetic */ e0[] e;

    static {
        e0 e0Var = new e0("Default", 0);
        d = e0Var;
        e0[] e0VarArr = {e0Var, new e0("UserInput", 1), new e0("PreventUserInput", 2)};
        e = e0VarArr;
        a4.t(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) e.clone();
    }
}
