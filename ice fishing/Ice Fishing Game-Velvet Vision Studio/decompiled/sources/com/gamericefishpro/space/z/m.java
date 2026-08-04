package com.gamericefishpro.space.z;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m d;
    public static final m e;
    public static final m i;
    public static final /* synthetic */ m[] v;

    static {
        m mVar = new m("Yes", 0);
        d = mVar;
        m mVar2 = new m("No", 1);
        e = mVar2;
        m mVar3 = new m("NotInitialized", 2);
        i = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        v = mVarArr;
        a4.t(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) v.clone();
    }
}
