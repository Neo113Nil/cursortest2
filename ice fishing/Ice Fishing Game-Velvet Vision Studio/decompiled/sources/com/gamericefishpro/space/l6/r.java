package com.gamericefishpro.space.l6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final r d;
    public static final r e;
    public static final r i;
    public static final r v;
    public static final r w;
    public static final r y;
    public static final /* synthetic */ r[] z;

    static {
        r rVar = new r("NOT_REQUIRED", 0);
        d = rVar;
        r rVar2 = new r("CONNECTED", 1);
        e = rVar2;
        r rVar3 = new r("UNMETERED", 2);
        i = rVar3;
        r rVar4 = new r("NOT_ROAMING", 3);
        v = rVar4;
        r rVar5 = new r("METERED", 4);
        w = rVar5;
        r rVar6 = new r("TEMPORARILY_UNMETERED", 5);
        y = rVar6;
        z = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) z.clone();
    }
}
