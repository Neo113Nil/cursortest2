package com.gamericefishpro.space.f2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q d;
    public static final q e;
    public static final /* synthetic */ q[] i;

    static {
        q qVar = new q("Min", 0);
        d = qVar;
        q qVar2 = new q("Max", 1);
        e = qVar2;
        q[] qVarArr = {qVar, qVar2};
        i = qVarArr;
        a4.t(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) i.clone();
    }
}
