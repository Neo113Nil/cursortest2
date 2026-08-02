package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3514l3 extends AbstractC3568m3 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f32466o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f32467p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f32468n;

    public static boolean e(Cr cr, byte[] bArr) {
        if (cr.B() < 8) {
            return false;
        }
        int i = cr.f24998b;
        byte[] bArr2 = new byte[8];
        cr.H(bArr2, 0, 8);
        cr.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final void a(boolean z6) {
        super.a(z6);
        if (z6) {
            this.f32468n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final long b(Cr cr) {
        byte[] bArr = cr.f24997a;
        return (this.i * AbstractC3066cl.F(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3568m3
    public final boolean c(Cr cr, long j6, S0.c cVar) {
        if (e(cr, f32466o)) {
            byte[] copyOf = Arrays.copyOf(cr.f24997a, cr.f24999c);
            int i = copyOf[9] & 255;
            ArrayList i4 = AbstractC3066cl.i(copyOf);
            if (((DP) cVar.f2902u) == null) {
                C3322hP c3322hP = new C3322hP();
                c3322hP.d("audio/ogg");
                c3322hP.e(com.anythink.basead.exoplayer.k.o.f9213H);
                c3322hP.f31538G = i;
                c3322hP.f31540I = 48000;
                c3322hP.f31561q = i4;
                cVar.f2902u = new DP(c3322hP);
                return true;
            }
        } else {
            if (!e(cr, f32467p)) {
                ((DP) cVar.f2902u).getClass();
                return false;
            }
            ((DP) cVar.f2902u).getClass();
            if (!this.f32468n) {
                this.f32468n = true;
                cr.G(8);
                O3 a9 = AbstractC3674o1.a(RB.o((String[]) QC.h(cr, false, false).f35841u));
                if (a9 != null) {
                    DP dp = (DP) cVar.f2902u;
                    dp.getClass();
                    C3322hP c3322hP2 = new C3322hP(dp);
                    c3322hP2.f31555k = a9.b(((DP) cVar.f2902u).f25173l);
                    cVar.f2902u = new DP(c3322hP2);
                    return true;
                }
            }
        }
        return true;
    }
}
