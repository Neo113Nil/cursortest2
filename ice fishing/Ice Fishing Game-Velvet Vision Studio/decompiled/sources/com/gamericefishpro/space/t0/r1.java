package com.gamericefishpro.space.t0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {
    public static final r1 d;
    public static final r1 e;
    public static final r1 i;
    public static final r1 v;
    public static final r1 w;
    public static final r1 y;
    public static final /* synthetic */ r1[] z;

    static {
        r1 r1Var = new r1("ShutDown", 0);
        d = r1Var;
        r1 r1Var2 = new r1("ShuttingDown", 1);
        e = r1Var2;
        r1 r1Var3 = new r1("Inactive", 2);
        i = r1Var3;
        r1 r1Var4 = new r1("InactivePendingWork", 3);
        v = r1Var4;
        r1 r1Var5 = new r1("Idle", 4);
        w = r1Var5;
        r1 r1Var6 = new r1("PendingWork", 5);
        y = r1Var6;
        r1[] r1VarArr = {r1Var, r1Var2, r1Var3, r1Var4, r1Var5, r1Var6};
        z = r1VarArr;
        a4.t(r1VarArr);
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) z.clone();
    }
}
