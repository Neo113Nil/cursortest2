package com.gamericefishpro.space.w;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f d;
    public static final f e;
    public static final /* synthetic */ f[] i;

    static {
        f fVar = new f("BoundReached", 0);
        d = fVar;
        f fVar2 = new f("Finished", 1);
        e = fVar2;
        f[] fVarArr = {fVar, fVar2};
        i = fVarArr;
        a4.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) i.clone();
    }
}
