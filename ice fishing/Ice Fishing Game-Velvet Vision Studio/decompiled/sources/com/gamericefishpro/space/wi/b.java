package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b d;
    public static final b e;
    public static final b i;
    public static final b v;
    public static final b w;
    public static final /* synthetic */ b[] y;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        e = bVar2;
        b bVar3 = new b("PARKING", 2);
        i = bVar3;
        b bVar4 = new b("DORMANT", 3);
        v = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        w = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        y = bVarArr;
        a4.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) y.clone();
    }
}
