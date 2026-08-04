package com.gamericefishpro.space.f2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final r d;
    public static final r e;
    public static final /* synthetic */ r[] i;

    static {
        r rVar = new r("Width", 0);
        d = rVar;
        r rVar2 = new r("Height", 1);
        e = rVar2;
        r[] rVarArr = {rVar, rVar2};
        i = rVarArr;
        a4.t(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) i.clone();
    }
}
