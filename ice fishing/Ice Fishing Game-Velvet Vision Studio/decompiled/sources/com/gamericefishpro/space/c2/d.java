package com.gamericefishpro.space.c2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d d;
    public static final d e;
    public static final /* synthetic */ d[] i;

    static {
        d dVar = new d("Lsq2", 0);
        d = dVar;
        d dVar2 = new d("Impulse", 1);
        e = dVar2;
        d[] dVarArr = {dVar, dVar2};
        i = dVarArr;
        a4.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }
}
