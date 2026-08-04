package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final s d;
    public static final s e;
    public static final s i;
    public static final /* synthetic */ s[] v;

    static {
        s sVar = new s("Unknown", 0);
        d = sVar;
        s sVar2 = new s("Dispatching", 1);
        e = sVar2;
        s sVar3 = new s("NotDispatching", 2);
        i = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        v = sVarArr;
        a4.t(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) v.clone();
    }
}
