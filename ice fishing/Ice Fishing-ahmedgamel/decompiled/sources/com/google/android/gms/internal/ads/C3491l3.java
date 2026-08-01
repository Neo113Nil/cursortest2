package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3491l3 extends AbstractC3545m3 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f31686o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f31687p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f31688n;

    public static boolean e(Cr cr, byte[] bArr) {
        if (cr.B() < 8) {
            return false;
        }
        int i = cr.f24253b;
        byte[] bArr2 = new byte[8];
        cr.H(bArr2, 0, 8);
        cr.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final void a(boolean z3) {
        super.a(z3);
        if (z3) {
            this.f31688n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final long b(Cr cr) {
        byte[] bArr = cr.f24252a;
        return (this.i * AbstractC3043cl.F(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3545m3
    public final boolean c(Cr cr, long j6, S0.c cVar) {
        if (e(cr, f31686o)) {
            byte[] copyOf = Arrays.copyOf(cr.f24252a, cr.f24254c);
            int i = copyOf[9] & 255;
            ArrayList i6 = AbstractC3043cl.i(copyOf);
            if (((DP) cVar.f2775u) == null) {
                C3299hP c3299hP = new C3299hP();
                c3299hP.d("audio/ogg");
                c3299hP.e(com.anythink.basead.exoplayer.k.o.f8427H);
                c3299hP.f30772G = i;
                c3299hP.f30774I = 48000;
                c3299hP.f30795q = i6;
                cVar.f2775u = new DP(c3299hP);
                return true;
            }
        } else {
            if (!e(cr, f31687p)) {
                ((DP) cVar.f2775u).getClass();
                return false;
            }
            ((DP) cVar.f2775u).getClass();
            if (!this.f31688n) {
                this.f31688n = true;
                cr.G(8);
                O3 a9 = AbstractC3651o1.a(RB.o((String[]) QC.h(cr, false, false).f35055u));
                if (a9 != null) {
                    DP dp = (DP) cVar.f2775u;
                    dp.getClass();
                    C3299hP c3299hP2 = new C3299hP(dp);
                    c3299hP2.f30789k = a9.b(((DP) cVar.f2775u).f24428l);
                    cVar.f2775u = new DP(c3299hP2);
                    return true;
                }
            }
        }
        return true;
    }
}
