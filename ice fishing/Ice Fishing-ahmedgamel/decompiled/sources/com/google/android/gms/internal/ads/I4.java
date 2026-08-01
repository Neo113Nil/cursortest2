package com.google.android.gms.internal.ads;

import com.anythink.basead.ui.BaseATView;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class I4 implements J4 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f25441m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f25442n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, com.anythink.expressad.video.module.a.a.f21731U, 143, 157, 173, 190, BaseATView.a.f9772H, 230, 253, com.anythink.expressad.foundation.g.a.aX, com.anythink.core.common.n.b.a.c.k.f15070a, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final CQ f25443a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3543m1 f25444b;

    /* renamed from: c, reason: collision with root package name */
    public final M4 f25445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25446d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f25447e;

    /* renamed from: f, reason: collision with root package name */
    public final Cr f25448f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25449g;

    /* renamed from: h, reason: collision with root package name */
    public final DP f25450h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f25451j;

    /* renamed from: k, reason: collision with root package name */
    public int f25452k;

    /* renamed from: l, reason: collision with root package name */
    public long f25453l;

    public I4(CQ cq, InterfaceC3543m1 interfaceC3543m1, M4 m4) {
        this.f25443a = cq;
        this.f25444b = interfaceC3543m1;
        this.f25445c = m4;
        int i = m4.f26240b;
        int max = Math.max(1, i / 10);
        this.f25449g = max;
        Cr cr = new Cr((byte[]) m4.f26244f);
        cr.M();
        int M8 = cr.M();
        this.f25446d = M8;
        int i6 = m4.f26239a;
        int i9 = m4.f26241c;
        int i10 = (((i9 - (i6 * 4)) * 8) / (m4.f26242d * i6)) + 1;
        if (M8 != i10) {
            throw U4.a(null, D.y.r(new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(M8).length()), "Expected frames per block: ", i10, "; got: ", M8));
        }
        String str = AbstractC3159eu.f29993a;
        int i11 = ((max + M8) - 1) / M8;
        this.f25447e = new byte[i11 * i9];
        this.f25448f = new Cr((M8 + M8) * i6 * i11);
        int i12 = ((i9 * i) * 8) / M8;
        C3299hP c3299hP = new C3299hP();
        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8465w);
        c3299hP.f30787h = i12;
        c3299hP.i = i12;
        c3299hP.f30793o = (max + max) * i6;
        c3299hP.f30772G = i6;
        int i13 = m4.f26243e;
        c3299hP.f30773H = i13 != 0 ? i13 << 2 : -1;
        c3299hP.f30774I = i;
        c3299hP.J = 2;
        this.f25450h = new DP(c3299hP);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:5:0x0025->B:11:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:3:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.J4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.google.android.gms.internal.ads.K0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I4.a(com.google.android.gms.internal.ads.K0, long):boolean");
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void b(long j6) {
        this.i = 0;
        this.f25451j = j6;
        this.f25452k = 0;
        this.f25453l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void c(int i, long j6) {
        this.f25443a.D(new N4(this.f25445c, this.f25446d, i, j6));
        this.f25444b.e(this.f25450h);
    }

    public final void d(int i) {
        M4 m4 = this.f25445c;
        long w6 = this.f25451j + AbstractC3159eu.w(this.f25453l, 1000000L, m4.f26240b, RoundingMode.DOWN);
        int i6 = (i + i) * m4.f26239a;
        this.f25444b.c(w6, 1, i6, this.f25452k - i6, null);
        this.f25453l += i;
        this.f25452k -= i6;
    }
}
