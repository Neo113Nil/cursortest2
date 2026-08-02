package com.google.android.gms.internal.ads;

import com.anythink.basead.ui.BaseATView;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class I4 implements J4 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f26184m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f26185n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, com.anythink.expressad.video.module.a.a.f22518U, 143, 157, 173, 190, BaseATView.a.f10558H, 230, 253, com.anythink.expressad.foundation.g.a.aX, com.anythink.core.common.n.b.a.c.k.f15857a, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final FQ f26186a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3566m1 f26187b;

    /* renamed from: c, reason: collision with root package name */
    public final M4 f26188c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26189d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f26190e;

    /* renamed from: f, reason: collision with root package name */
    public final Cr f26191f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26192g;

    /* renamed from: h, reason: collision with root package name */
    public final DP f26193h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f26194j;

    /* renamed from: k, reason: collision with root package name */
    public int f26195k;

    /* renamed from: l, reason: collision with root package name */
    public long f26196l;

    public I4(FQ fq, InterfaceC3566m1 interfaceC3566m1, M4 m42) {
        this.f26186a = fq;
        this.f26187b = interfaceC3566m1;
        this.f26188c = m42;
        int i = m42.f27031b;
        int max = Math.max(1, i / 10);
        this.f26192g = max;
        Cr cr = new Cr((byte[]) m42.f27035f);
        cr.M();
        int M8 = cr.M();
        this.f26189d = M8;
        int i4 = m42.f27030a;
        int i6 = m42.f27032c;
        int i9 = (((i6 - (i4 * 4)) * 8) / (m42.f27033d * i4)) + 1;
        if (M8 != i9) {
            throw U4.a(null, D.x.o(new StringBuilder(String.valueOf(i9).length() + 34 + String.valueOf(M8).length()), "Expected frames per block: ", i9, "; got: ", M8));
        }
        String str = AbstractC3182eu.f30782a;
        int i10 = ((max + M8) - 1) / M8;
        this.f26190e = new byte[i10 * i6];
        this.f26191f = new Cr((M8 + M8) * i4 * i10);
        int i11 = ((i6 * i) * 8) / M8;
        C3322hP c3322hP = new C3322hP();
        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9251w);
        c3322hP.f31553h = i11;
        c3322hP.i = i11;
        c3322hP.f31559o = (max + max) * i4;
        c3322hP.f31538G = i4;
        int i12 = m42.f27034e;
        c3322hP.f31539H = i12 != 0 ? i12 << 2 : -1;
        c3322hP.f31540I = i;
        c3322hP.J = 2;
        this.f26193h = new DP(c3322hP);
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
        this.f26194j = j6;
        this.f26195k = 0;
        this.f26196l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void c(int i, long j6) {
        this.f26186a.D(new N4(this.f26188c, this.f26189d, i, j6));
        this.f26187b.e(this.f26193h);
    }

    public final void d(int i) {
        M4 m42 = this.f26188c;
        long w3 = this.f26194j + AbstractC3182eu.w(this.f26196l, 1000000L, m42.f27031b, RoundingMode.DOWN);
        int i4 = (i + i) * m42.f27030a;
        this.f26187b.c(w3, 1, i4, this.f26195k - i4, null);
        this.f26196l += i;
        this.f26195k -= i4;
    }
}
