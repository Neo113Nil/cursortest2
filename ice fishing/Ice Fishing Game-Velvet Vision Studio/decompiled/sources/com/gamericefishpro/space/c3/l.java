package com.gamericefishpro.space.c3;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final l d;
    public static final l e;
    public static final /* synthetic */ l[] i;

    static {
        l lVar = new l("Ltr", 0);
        d = lVar;
        l lVar2 = new l("Rtl", 1);
        e = lVar2;
        l[] lVarArr = {lVar, lVar2};
        i = lVarArr;
        a4.t(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) i.clone();
    }
}
