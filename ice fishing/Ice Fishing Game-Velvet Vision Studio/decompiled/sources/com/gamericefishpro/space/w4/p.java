package com.gamericefishpro.space.w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p d;
    public static final p e;
    public static final p i;
    public static final /* synthetic */ p[] v;

    static {
        p pVar = new p("NONE", 0);
        d = pVar;
        p pVar2 = new p("ADDING", 1);
        e = pVar2;
        p pVar3 = new p("REMOVING", 2);
        i = pVar3;
        v = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) v.clone();
    }
}
