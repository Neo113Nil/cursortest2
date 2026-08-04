package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i d;
    public static final i e;
    public static final i i;
    public static final /* synthetic */ i[] v;

    static {
        i iVar = new i("Initial", 0);
        d = iVar;
        i iVar2 = new i("Main", 1);
        e = iVar2;
        i iVar3 = new i("Final", 2);
        i = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        v = iVarArr;
        a4.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) v.clone();
    }
}
