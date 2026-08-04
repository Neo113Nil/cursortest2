package com.gamericefishpro.space.s0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e d;
    public static final /* synthetic */ e[] e;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("CornerExtraExtraLarge", 0);
        e eVar2 = new e("CornerExtraLarge", 1);
        e eVar3 = new e("CornerExtraLargeIncreased", 2);
        e eVar4 = new e("CornerExtraLargeTop", 3);
        e eVar5 = new e("CornerExtraSmall", 4);
        e eVar6 = new e("CornerExtraSmallTop", 5);
        e eVar7 = new e("CornerFull", 6);
        d = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, new e("CornerLarge", 7), new e("CornerLargeEnd", 8), new e("CornerLargeIncreased", 9), new e("CornerLargeStart", 10), new e("CornerLargeTop", 11), new e("CornerMedium", 12), new e("CornerNone", 13), new e("CornerSmall", 14)};
        e = eVarArr;
        a4.t(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) e.clone();
    }
}
