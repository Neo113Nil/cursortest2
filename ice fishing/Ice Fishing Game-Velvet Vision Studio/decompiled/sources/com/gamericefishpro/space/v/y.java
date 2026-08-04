package com.gamericefishpro.space.v;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final y d;
    public static final y e;
    public static final y i;
    public static final /* synthetic */ y[] v;

    static {
        y yVar = new y("PreEnter", 0);
        d = yVar;
        y yVar2 = new y("Visible", 1);
        e = yVar2;
        y yVar3 = new y("PostExit", 2);
        i = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        v = yVarArr;
        a4.t(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) v.clone();
    }
}
