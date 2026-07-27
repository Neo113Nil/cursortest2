package G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ a[] f995A;

    /* renamed from: n, reason: collision with root package name */
    public static final a f996n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f997u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f998v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f999w;

    /* renamed from: x, reason: collision with root package name */
    public static final a f1000x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f1001y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f1002z;

    /* JADX INFO: Fake field, exist only in values array */
    a EF1;

    static {
        a aVar = new a("CLEAR", 0);
        a aVar2 = new a("SRC", 1);
        a aVar3 = new a("DST", 2);
        a aVar4 = new a("SRC_OVER", 3);
        a aVar5 = new a("DST_OVER", 4);
        a aVar6 = new a("SRC_IN", 5);
        a aVar7 = new a("DST_IN", 6);
        a aVar8 = new a("SRC_OUT", 7);
        a aVar9 = new a("DST_OUT", 8);
        a aVar10 = new a("SRC_ATOP", 9);
        a aVar11 = new a("DST_ATOP", 10);
        a aVar12 = new a("XOR", 11);
        a aVar13 = new a("PLUS", 12);
        f996n = aVar13;
        a aVar14 = new a("MODULATE", 13);
        f997u = aVar14;
        a aVar15 = new a("SCREEN", 14);
        f998v = aVar15;
        a aVar16 = new a("OVERLAY", 15);
        f999w = aVar16;
        a aVar17 = new a("DARKEN", 16);
        f1000x = aVar17;
        a aVar18 = new a("LIGHTEN", 17);
        f1001y = aVar18;
        a aVar19 = new a("COLOR_DODGE", 18);
        a aVar20 = new a("COLOR_BURN", 19);
        a aVar21 = new a("HARD_LIGHT", 20);
        a aVar22 = new a("SOFT_LIGHT", 21);
        a aVar23 = new a("DIFFERENCE", 22);
        a aVar24 = new a("EXCLUSION", 23);
        a aVar25 = new a("MULTIPLY", 24);
        f1002z = aVar25;
        f995A = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, new a("HUE", 25), new a("SATURATION", 26), new a("COLOR", 27), new a("LUMINOSITY", 28)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f995A.clone();
    }
}
