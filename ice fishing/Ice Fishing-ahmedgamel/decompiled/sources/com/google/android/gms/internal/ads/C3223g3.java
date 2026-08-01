package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3223g3 extends AbstractC3545m3 {

    /* renamed from: n, reason: collision with root package name */
    public W0 f30493n;

    /* renamed from: o, reason: collision with root package name */
    public G2 f30494o;

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f30493n = null;
            this.f30494o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final long b(Cr cr) {
        byte[] bArr = cr.f24252a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int v9 = AbstractC2968bG.v(i, cr);
            cr.E(0);
            return v9;
        }
        cr.G(4);
        cr.o();
        int v92 = AbstractC2968bG.v(i, cr);
        cr.E(0);
        return v92;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final boolean c(Cr cr, long j6, S0.c cVar) {
        byte[] bArr = cr.f24252a;
        W0 w02 = this.f30493n;
        if (w02 == null) {
            W0 w03 = new W0(bArr, 17);
            this.f30493n = w03;
            C3299hP c3299hP = new C3299hP(w03.b(Arrays.copyOfRange(bArr, 9, cr.f24254c), null));
            c3299hP.d("audio/ogg");
            cVar.f2775u = new DP(c3299hP);
            return true;
        }
        byte b9 = bArr[0];
        if ((b9 & Byte.MAX_VALUE) != 3) {
            if (b9 != -1) {
                return true;
            }
            G2 g22 = this.f30494o;
            if (g22 != null) {
                g22.f24907n = j6;
                cVar.f2776v = g22;
            }
            ((DP) cVar.f2775u).getClass();
            return false;
        }
        S0.s z3 = SK.z(cr);
        W0 w04 = new W0(w02.f28291a, w02.f28292b, w02.f28293c, w02.f28294d, w02.f28295e, w02.f28297g, w02.f28298h, w02.f28299j, z3, w02.f28301l);
        this.f30493n = w04;
        G2 g23 = new G2();
        g23.f24909v = w04;
        g23.f24910w = z3;
        g23.f24907n = -1L;
        g23.f24908u = -1L;
        this.f30494o = g23;
        return true;
    }
}
