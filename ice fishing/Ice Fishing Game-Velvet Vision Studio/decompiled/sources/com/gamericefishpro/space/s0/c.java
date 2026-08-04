package com.gamericefishpro.space.s0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ c[] d;

    /* JADX INFO: Fake field, exist only in values array */
    c EF5;

    static {
        c[] cVarArr = {new c("DefaultSpatial", 0), new c("FastSpatial", 1), new c("SlowSpatial", 2), new c("DefaultEffects", 3), new c("FastEffects", 4), new c("SlowEffects", 5)};
        d = cVarArr;
        a4.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
