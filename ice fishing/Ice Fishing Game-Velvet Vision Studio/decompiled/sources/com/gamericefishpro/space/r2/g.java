package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ g[] A;
    public static final g d;
    public static final g e;
    public static final g i;
    public static final g v;
    public static final g w;
    public static final g y;
    public static final g z;

    static {
        g gVar = new g("Paragraph", 0);
        d = gVar;
        g gVar2 = new g("Span", 1);
        e = gVar2;
        g gVar3 = new g("VerbatimTts", 2);
        i = gVar3;
        g gVar4 = new g("Url", 3);
        v = gVar4;
        g gVar5 = new g("Link", 4);
        w = gVar5;
        g gVar6 = new g("Clickable", 5);
        y = gVar6;
        g gVar7 = new g("String", 6);
        z = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        A = gVarArr;
        a4.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) A.clone();
    }
}
