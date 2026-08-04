package com.gamericefishpro.space.s0;

import com.gamericefishpro.space.i9.a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ b[] A;
    public static final b d;
    public static final b e;
    public static final b i;
    public static final b v;
    public static final b w;
    public static final b y;
    public static final b z;

    /* JADX INFO: Fake field, exist only in values array */
    b EF1;

    static {
        b bVar = new b("Background", 0);
        b bVar2 = new b("Error", 1);
        b bVar3 = new b("ErrorContainer", 2);
        b bVar4 = new b("InverseOnSurface", 3);
        b bVar5 = new b("InversePrimary", 4);
        b bVar6 = new b("InverseSurface", 5);
        b bVar7 = new b("OnBackground", 6);
        b bVar8 = new b("OnError", 7);
        b bVar9 = new b("OnErrorContainer", 8);
        b bVar10 = new b("OnPrimary", 9);
        d = bVar10;
        b bVar11 = new b("OnPrimaryContainer", 10);
        e = bVar11;
        b bVar12 = new b("OnPrimaryFixed", 11);
        b bVar13 = new b("OnPrimaryFixedVariant", 12);
        b bVar14 = new b("OnSecondary", 13);
        b bVar15 = new b("OnSecondaryContainer", 14);
        b bVar16 = new b("OnSecondaryFixed", 15);
        b bVar17 = new b("OnSecondaryFixedVariant", 16);
        b bVar18 = new b("OnSurface", 17);
        i = bVar18;
        b bVar19 = new b("OnSurfaceVariant", 18);
        b bVar20 = new b("OnTertiary", 19);
        b bVar21 = new b("OnTertiaryContainer", 20);
        b bVar22 = new b("OnTertiaryFixed", 21);
        b bVar23 = new b("OnTertiaryFixedVariant", 22);
        b bVar24 = new b("Outline", 23);
        v = bVar24;
        b bVar25 = new b("OutlineVariant", 24);
        b bVar26 = new b("Primary", 25);
        w = bVar26;
        b bVar27 = new b("PrimaryContainer", 26);
        b bVar28 = new b("PrimaryFixed", 27);
        b bVar29 = new b("PrimaryFixedDim", 28);
        b bVar30 = new b("Scrim", 29);
        b bVar31 = new b("Secondary", 30);
        b bVar32 = new b("SecondaryContainer", 31);
        b bVar33 = new b("SecondaryFixed", 32);
        b bVar34 = new b("SecondaryFixedDim", 33);
        b bVar35 = new b("Surface", 34);
        y = bVar35;
        b bVar36 = new b("SurfaceBright", 35);
        b bVar37 = new b("SurfaceContainer", 36);
        b bVar38 = new b("SurfaceContainerHigh", 37);
        b bVar39 = new b("SurfaceContainerHighest", 38);
        z = bVar39;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, new b("SurfaceContainerLow", 39), new b("SurfaceContainerLowest", 40), new b("SurfaceDim", 41), new b("SurfaceTint", 42), new b("SurfaceVariant", 43), new b("Tertiary", 44), new b("TertiaryContainer", 45), new b("TertiaryFixed", 46), new b("TertiaryFixedDim", 47)};
        A = bVarArr;
        a4.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) A.clone();
    }
}
