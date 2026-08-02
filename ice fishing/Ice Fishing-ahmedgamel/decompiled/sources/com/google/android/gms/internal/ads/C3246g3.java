package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3246g3 extends AbstractC3568m3 {

    /* renamed from: n, reason: collision with root package name */
    public W0 f31259n;

    /* renamed from: o, reason: collision with root package name */
    public G2 f31260o;

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final void a(boolean z6) {
        super.a(z6);
        if (z6) {
            this.f31259n = null;
            this.f31260o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final long b(Cr cr) {
        byte[] bArr = cr.f24997a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int v9 = AbstractC2991bG.v(i, cr);
            cr.E(0);
            return v9;
        }
        cr.G(4);
        cr.o();
        int v92 = AbstractC2991bG.v(i, cr);
        cr.E(0);
        return v92;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final boolean c(Cr cr, long j6, S0.c cVar) {
        byte[] bArr = cr.f24997a;
        W0 w02 = this.f31259n;
        if (w02 == null) {
            W0 w03 = new W0(bArr, 17);
            this.f31259n = w03;
            C3322hP c3322hP = new C3322hP(w03.b(Arrays.copyOfRange(bArr, 9, cr.f24999c), null));
            c3322hP.d("audio/ogg");
            cVar.f2902u = new DP(c3322hP);
            return true;
        }
        byte b9 = bArr[0];
        if ((b9 & Byte.MAX_VALUE) != 3) {
            if (b9 != -1) {
                return true;
            }
            G2 g22 = this.f31260o;
            if (g22 != null) {
                g22.f25697n = j6;
                cVar.f2903v = g22;
            }
            ((DP) cVar.f2902u).getClass();
            return false;
        }
        S0.s z6 = SK.z(cr);
        W0 w04 = new W0(w02.f29089a, w02.f29090b, w02.f29091c, w02.f29092d, w02.f29093e, w02.f29095g, w02.f29096h, w02.f29097j, z6, w02.f29099l);
        this.f31259n = w04;
        G2 g23 = new G2();
        g23.f25699v = w04;
        g23.f25700w = z6;
        g23.f25697n = -1L;
        g23.f25698u = -1L;
        this.f31260o = g23;
        return true;
    }
}
