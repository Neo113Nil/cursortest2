package com.gamericefishpro.space.ri;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a d;
    public static final a e;
    public static final a i;
    public static final /* synthetic */ a[] v;

    static {
        a aVar = new a("SUSPEND", 0);
        d = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        e = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        v = aVarArr;
        a4.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) v.clone();
    }
}
