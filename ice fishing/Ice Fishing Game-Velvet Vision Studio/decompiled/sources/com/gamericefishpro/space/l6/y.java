package com.gamericefishpro.space.l6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final y d;
    public static final y e;
    public static final y i;
    public static final y v;
    public static final y w;
    public static final y y;
    public static final /* synthetic */ y[] z;

    static {
        y yVar = new y("ENQUEUED", 0);
        d = yVar;
        y yVar2 = new y("RUNNING", 1);
        e = yVar2;
        y yVar3 = new y("SUCCEEDED", 2);
        i = yVar3;
        y yVar4 = new y("FAILED", 3);
        v = yVar4;
        y yVar5 = new y("BLOCKED", 4);
        w = yVar5;
        y yVar6 = new y("CANCELLED", 5);
        y = yVar6;
        z = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) z.clone();
    }

    public final boolean a() {
        return this == i || this == v || this == y;
    }
}
