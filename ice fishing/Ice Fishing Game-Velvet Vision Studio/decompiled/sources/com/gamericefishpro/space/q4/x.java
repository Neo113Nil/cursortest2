package com.gamericefishpro.space.q4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x A;
    public static final x B;
    public static final x C;
    public static final /* synthetic */ x[] D;
    public static final x d;
    public static final x e;
    public static final x i;
    public static final x v;
    public static final x w;
    public static final x y;
    public static final x z;

    static {
        x xVar = new x("VOID", 0);
        d = xVar;
        x xVar2 = new x("INT", 1);
        e = xVar2;
        x xVar3 = new x("LONG", 2);
        i = xVar3;
        x xVar4 = new x("FLOAT", 3);
        v = xVar4;
        x xVar5 = new x("DOUBLE", 4);
        w = xVar5;
        x xVar6 = new x("BOOLEAN", 5);
        y = xVar6;
        x xVar7 = new x("STRING", 6);
        z = xVar7;
        f fVar = f.i;
        x xVar8 = new x("BYTE_STRING", 7);
        A = xVar8;
        x xVar9 = new x("ENUM", 8);
        B = xVar9;
        x xVar10 = new x("MESSAGE", 9);
        C = xVar10;
        D = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) D.clone();
    }
}
