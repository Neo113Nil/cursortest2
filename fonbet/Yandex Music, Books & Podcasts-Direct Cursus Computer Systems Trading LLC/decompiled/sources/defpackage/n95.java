package defpackage;

/* loaded from: classes.dex */
public final class n95 {
    public static final float[] a;
    public static final float[] b;
    public static final u6t c;
    public static final u6t d;
    public static final rdo e;
    public static final rdo f;
    public static final rdo g;
    public static final rdo h;
    public static final rdo i;
    public static final rdo j;
    public static final rdo k;
    public static final rdo l;
    public static final rdo m;
    public static final rdo n;
    public static final rdo o;
    public static final rdo p;
    public static final rdo q;
    public static final rdo r;
    public static final qif s;
    public static final qif t;
    public static final rdo u;
    public static final rdo v;
    public static final rdo w;
    public static final fpj x;
    public static final l95[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        u6t u6tVar = new u6t(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        u6t u6tVar2 = new u6t(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        u6t u6tVar3 = new u6t(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = u6tVar3;
        u6t u6tVar4 = new u6t(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = u6tVar4;
        jkv jkvVar = i4w.r;
        rdo rdoVar = new rdo("sRGB IEC61966-2.1", fArr, jkvVar, u6tVar, 0);
        e = rdoVar;
        rdo rdoVar2 = new rdo("sRGB IEC61966-2.1 (Linear)", fArr, jkvVar, 1.0d, 0.0f, 1.0f, 1);
        f = rdoVar2;
        rdo rdoVar3 = new rdo("scRGB-nl IEC 61966-2-2:2003", fArr, jkvVar, null, new jj4(5), new jj4(6), -0.799f, 2.399f, u6tVar, 2);
        g = rdoVar3;
        rdo rdoVar4 = new rdo("scRGB IEC 61966-2-2:2003", fArr, jkvVar, 1.0d, -0.5f, 7.499f, 3);
        h = rdoVar4;
        rdo rdoVar5 = new rdo("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jkvVar, new u6t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = rdoVar5;
        rdo rdoVar6 = new rdo("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jkvVar, new u6t(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = rdoVar6;
        rdo rdoVar7 = new rdo("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new jkv(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = rdoVar7;
        rdo rdoVar8 = new rdo("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jkvVar, u6tVar, 7);
        l = rdoVar8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        rdo rdoVar9 = new rdo("NTSC (1953)", fArr2, i4w.o, new u6t(d4, d5, d6, d2, d3), 8);
        m = rdoVar9;
        rdo rdoVar10 = new rdo("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jkvVar, new u6t(d4, d5, d6, d2, d3), 9);
        n = rdoVar10;
        rdo rdoVar11 = new rdo("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jkvVar, 2.2d, 0.0f, 1.0f, 10);
        o = rdoVar11;
        rdo rdoVar12 = new rdo("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, i4w.p, new u6t(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = rdoVar12;
        jkv jkvVar2 = i4w.q;
        rdo rdoVar13 = new rdo("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, jkvVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = rdoVar13;
        rdo rdoVar14 = new rdo("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jkvVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = rdoVar14;
        qif qifVar = new qif(v85.b, "Generic XYZ", 14, 1);
        s = qifVar;
        long j2 = v85.c;
        qif qifVar2 = new qif(j2, "Generic L*a*b*", 15, 0);
        t = qifVar2;
        rdo rdoVar15 = new rdo("None", fArr, jkvVar, u6tVar2, 16);
        u = rdoVar15;
        rdo rdoVar16 = new rdo("Hybrid Log Gamma encoding", fArr3, jkvVar, null, new jj4(7), new jj4(8), 0.0f, 1.0f, u6tVar3, 17);
        v = rdoVar16;
        rdo rdoVar17 = new rdo("Perceptual Quantizer encoding", fArr3, jkvVar, null, new jj4(9), new jj4(10), 0.0f, 1.0f, u6tVar4, 18);
        w = rdoVar17;
        fpj fpjVar = new fpj("Oklab", j2, 19);
        x = fpjVar;
        y = new l95[]{rdoVar, rdoVar2, rdoVar3, rdoVar4, rdoVar5, rdoVar6, rdoVar7, rdoVar8, rdoVar9, rdoVar10, rdoVar11, rdoVar12, rdoVar13, rdoVar14, qifVar, qifVar2, rdoVar15, rdoVar16, rdoVar17, fpjVar};
    }

    public static double a(u6t u6tVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = u6tVar.b;
        double d6 = u6tVar.c;
        double d7 = u6tVar.d;
        double d8 = u6tVar.e;
        double d9 = u6tVar.f;
        double d10 = d5 * d4;
        return (u6tVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(u6t u6tVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / u6tVar.b;
        double d5 = 1.0d / u6tVar.c;
        double d6 = 1.0d / u6tVar.d;
        double d7 = u6tVar.e;
        double d8 = u6tVar.f;
        double d9 = (d2 * d3) / (u6tVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(u6t u6tVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = u6tVar.b;
        double d6 = u6tVar.d;
        double pow = (Math.pow(d4, d6) * u6tVar.c) + d5;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d4, d6) * u6tVar.f) + u6tVar.e), u6tVar.g) * d3;
    }

    public static double d(u6t u6tVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -u6tVar.b;
        double d6 = u6tVar.e;
        double d7 = 1.0d / u6tVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-u6tVar.f)) + u6tVar.c), 1.0d / u6tVar.d) * d3;
    }
}
