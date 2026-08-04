package com.gamericefishpro.space.s5;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final z d;
    public static final z e;
    public static final /* synthetic */ z[] i;

    static {
        z zVar = new z("DEFERRED", 0);
        d = zVar;
        z zVar2 = new z("IMMEDIATE", 1);
        e = zVar2;
        z[] zVarArr = {zVar, zVar2, new z("EXCLUSIVE", 2)};
        i = zVarArr;
        a4.t(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) i.clone();
    }
}
