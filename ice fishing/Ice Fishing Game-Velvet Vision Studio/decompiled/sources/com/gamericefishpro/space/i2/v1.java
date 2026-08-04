package com.gamericefishpro.space.i2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {
    public static final /* synthetic */ v1[] d;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF5;

    static {
        v1[] v1VarArr = {new v1("Shown", 0), new v1("Hidden", 1)};
        d = v1VarArr;
        a4.t(v1VarArr);
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) d.clone();
    }
}
