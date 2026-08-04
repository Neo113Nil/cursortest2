package com.gamericefishpro.space.m1;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b d;
    public static final b e;
    public static final b i;
    public static final /* synthetic */ b[] v;

    static {
        b bVar = new b("None", 0);
        d = bVar;
        b bVar2 = new b("Cancelled", 1);
        e = bVar2;
        b bVar3 = new b("Redirected", 2);
        i = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
        v = bVarArr;
        a4.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) v.clone();
    }
}
