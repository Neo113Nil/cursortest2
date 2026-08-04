package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final f0 d;
    public static final f0 e;
    public static final f0 i;
    public static final f0 v;
    public static final f0 w;
    public static final /* synthetic */ f0[] y;

    static {
        f0 f0Var = new f0("TopBar", 0);
        d = f0Var;
        f0 f0Var2 = new f0("MainContent", 1);
        e = f0Var2;
        f0 f0Var3 = new f0("Snackbar", 2);
        i = f0Var3;
        f0 f0Var4 = new f0("Fab", 3);
        v = f0Var4;
        f0 f0Var5 = new f0("BottomBar", 4);
        w = f0Var5;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5};
        y = f0VarArr;
        a4.t(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) y.clone();
    }
}
