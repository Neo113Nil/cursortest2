package com.gamericefishpro.space.oh;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j d;
    public static final j e;
    public static final /* synthetic */ j[] i;

    static {
        j jVar = new j("SYNCHRONIZED", 0);
        d = jVar;
        j jVar2 = new j("PUBLICATION", 1);
        j jVar3 = new j("NONE", 2);
        e = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        i = jVarArr;
        a4.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) i.clone();
    }
}
