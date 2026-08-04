package com.gamericefishpro.space.o1;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final /* synthetic */ e0[] d;

    /* JADX INFO: Fake field, exist only in values array */
    e0 EF5;

    static {
        e0[] e0VarArr = {new e0("CounterClockwise", 0), new e0("Clockwise", 1)};
        d = e0VarArr;
        a4.t(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) d.clone();
    }
}
