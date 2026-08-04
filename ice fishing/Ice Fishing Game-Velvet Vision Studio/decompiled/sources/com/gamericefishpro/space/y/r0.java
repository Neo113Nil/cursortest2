package com.gamericefishpro.space.y;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static final r0 d;
    public static final r0 e;
    public static final /* synthetic */ r0[] i;

    static {
        r0 r0Var = new r0("Default", 0);
        d = r0Var;
        r0 r0Var2 = new r0("UserInput", 1);
        e = r0Var2;
        r0[] r0VarArr = {r0Var, r0Var2, new r0("PreventUserInput", 2)};
        i = r0VarArr;
        a4.t(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) i.clone();
    }
}
