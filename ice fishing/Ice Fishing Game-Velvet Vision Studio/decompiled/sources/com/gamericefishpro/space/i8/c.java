package com.gamericefishpro.space.i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c d;
    public static final c e;
    public static final c i;
    public static final /* synthetic */ c[] v;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        d = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        e = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        i = cVar3;
        v = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) v.clone();
    }
}
