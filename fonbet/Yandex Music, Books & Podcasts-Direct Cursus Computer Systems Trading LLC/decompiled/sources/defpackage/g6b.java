package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g6b {
    public static final g6b a;
    public static final g6b b;
    public static final g6b c;
    public static final g6b d;
    public static final g6b e;
    public static final g6b f;
    public static final g6b g;
    public static final /* synthetic */ g6b[] h;

    static {
        g6b g6bVar = new g6b("ERROR_CORRECTION", 0);
        a = g6bVar;
        g6b g6bVar2 = new g6b("CHARACTER_SET", 1);
        b = g6bVar2;
        g6b g6bVar3 = new g6b("DATA_MATRIX_SHAPE", 2);
        g6b g6bVar4 = new g6b("DATA_MATRIX_COMPACT", 3);
        g6b g6bVar5 = new g6b("MIN_SIZE", 4);
        g6b g6bVar6 = new g6b("MAX_SIZE", 5);
        g6b g6bVar7 = new g6b("MARGIN", 6);
        c = g6bVar7;
        g6b g6bVar8 = new g6b("PDF417_COMPACT", 7);
        g6b g6bVar9 = new g6b("PDF417_COMPACTION", 8);
        g6b g6bVar10 = new g6b("PDF417_DIMENSIONS", 9);
        g6b g6bVar11 = new g6b("PDF417_AUTO_ECI", 10);
        g6b g6bVar12 = new g6b("AZTEC_LAYERS", 11);
        g6b g6bVar13 = new g6b("QR_VERSION", 12);
        d = g6bVar13;
        g6b g6bVar14 = new g6b("QR_MASK_PATTERN", 13);
        e = g6bVar14;
        g6b g6bVar15 = new g6b("QR_COMPACT", 14);
        f = g6bVar15;
        g6b g6bVar16 = new g6b("GS1_FORMAT", 15);
        g = g6bVar16;
        h = new g6b[]{g6bVar, g6bVar2, g6bVar3, g6bVar4, g6bVar5, g6bVar6, g6bVar7, g6bVar8, g6bVar9, g6bVar10, g6bVar11, g6bVar12, g6bVar13, g6bVar14, g6bVar15, g6bVar16, new g6b("FORCE_CODE_SET", 16), new g6b("FORCE_C40", 17), new g6b("CODE128_COMPACT", 18)};
    }

    public static g6b valueOf(String str) {
        return (g6b) Enum.valueOf(g6b.class, str);
    }

    public static g6b[] values() {
        return (g6b[]) h.clone();
    }
}
