package com.gamericefishpro.space.q2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a d;
    public static final a e;
    public static final /* synthetic */ a[] i;

    static {
        a aVar = new a("On", 0);
        d = aVar;
        a aVar2 = new a("Off", 1);
        e = aVar2;
        a[] aVarArr = {aVar, aVar2, new a("Indeterminate", 2)};
        i = aVarArr;
        a4.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) i.clone();
    }
}
