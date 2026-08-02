package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* loaded from: classes.dex */
public final class wgc {
    public static final float[] a;
    public static final float[] b;
    public static final wm01 c;
    public static final wm01 d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final ypx s;
    public static final ypx t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final qw60 x;
    public static final ugc[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        wm01 wm01Var = new wm01(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        wm01 wm01Var2 = new wm01(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        wm01 wm01Var3 = new wm01(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = wm01Var3;
        wm01 wm01Var4 = new wm01(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = wm01Var4;
        lz41 lz41Var = rzo.e;
        a aVar = new a("sRGB IEC61966-2.1", fArr, lz41Var, wm01Var, 0);
        e = aVar;
        a aVar2 = new a("sRGB IEC61966-2.1 (Linear)", fArr, lz41Var, 1.0d, 0.0f, 1.0f, 1);
        f = aVar2;
        a aVar3 = new a("scRGB-nl IEC 61966-2-2:2003", fArr, lz41Var, null, new dac(1), new dac(2), -0.799f, 2.399f, wm01Var, 2);
        g = aVar3;
        a aVar4 = new a("scRGB IEC 61966-2-2:2003", fArr, lz41Var, 1.0d, -0.5f, 7.499f, 3);
        h = aVar4;
        a aVar5 = new a("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, lz41Var, new wm01(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = aVar5;
        a aVar6 = new a("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, lz41Var, new wm01(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = aVar6;
        a aVar7 = new a("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new lz41(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = aVar7;
        a aVar8 = new a("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, lz41Var, wm01Var, 7);
        l = aVar8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        a aVar9 = new a("NTSC (1953)", fArr2, rzo.b, new wm01(d4, d5, d6, d2, d3), 8);
        m = aVar9;
        a aVar10 = new a("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, lz41Var, new wm01(d4, d5, d6, d2, d3), 9);
        n = aVar10;
        a aVar11 = new a("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, lz41Var, 2.2d, 0.0f, 1.0f, 10);
        o = aVar11;
        a aVar12 = new a("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, rzo.c, new wm01(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = aVar12;
        lz41 lz41Var2 = rzo.d;
        a aVar13 = new a("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, lz41Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = aVar13;
        a aVar14 = new a("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, lz41Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = aVar14;
        ypx ypxVar = new ypx("Generic XYZ", 12884901889L, 14, 1);
        s = ypxVar;
        ypx ypxVar2 = new ypx("Generic L*a*b*", 12884901890L, 15, 0);
        t = ypxVar2;
        a aVar15 = new a("None", fArr, lz41Var, wm01Var2, 16);
        u = aVar15;
        a aVar16 = new a("Hybrid Log Gamma encoding", fArr3, lz41Var, null, new dac(3), new dac(4), 0.0f, 1.0f, wm01Var3, 17);
        v = aVar16;
        a aVar17 = new a("Perceptual Quantizer encoding", fArr3, lz41Var, null, new dac(5), new dac(6), 0.0f, 1.0f, wm01Var4, 18);
        w = aVar17;
        qw60 qw60Var = new qw60("Oklab", 12884901890L, 19);
        x = qw60Var;
        y = new ugc[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, ypxVar, ypxVar2, aVar15, aVar16, aVar17, qw60Var};
    }

    public static double a(wm01 wm01Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = wm01Var.b;
        double d6 = wm01Var.c;
        double d7 = wm01Var.d;
        double d8 = wm01Var.e;
        double d9 = wm01Var.f;
        double d10 = d5 * d4;
        return (wm01Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(wm01 wm01Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / wm01Var.b;
        double d5 = 1.0d / wm01Var.c;
        double d6 = 1.0d / wm01Var.d;
        double d7 = wm01Var.e;
        double d8 = wm01Var.f;
        double d9 = (d2 * d3) / (wm01Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(wm01 wm01Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = wm01Var.b;
        double d6 = wm01Var.d;
        double pow = (Math.pow(d4, d6) * wm01Var.c) + d5;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d4, d6) * wm01Var.f) + wm01Var.e), wm01Var.g) * d3;
    }

    public static double d(wm01 wm01Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -wm01Var.b;
        double d6 = wm01Var.e;
        double d7 = 1.0d / wm01Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-wm01Var.f)) + wm01Var.c), 1.0d / wm01Var.d) * d3;
    }
}
