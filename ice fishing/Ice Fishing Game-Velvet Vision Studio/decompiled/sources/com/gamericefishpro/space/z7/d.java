package com.gamericefishpro.space.z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d d;
    public static final d e;
    public static final d i;
    public static final /* synthetic */ d[] v;

    static {
        d dVar = new d("DEFAULT", 0);
        d = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        e = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        i = dVar3;
        v = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) v.clone();
    }
}
