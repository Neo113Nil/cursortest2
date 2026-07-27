package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3396j3 extends AbstractC3450k3 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f32062o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f32063p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f32064n;

    public static boolean e(Lr lr, byte[] bArr) {
        if (lr.B() < 8) {
            return false;
        }
        int i = lr.f26234b;
        byte[] bArr2 = new byte[8];
        lr.H(bArr2, 0, 8);
        lr.E(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final void a(boolean z8) {
        super.a(z8);
        if (z8) {
            this.f32064n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final long b(Lr lr) {
        byte[] bArr = lr.f26233a;
        return (this.i * AbstractC3035cL.E(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3450k3
    public final boolean c(Lr lr, long j9, C2881Yl c2881Yl) {
        if (e(lr, f32062o)) {
            byte[] copyOf = Arrays.copyOf(lr.f26233a, lr.f26235c);
            int i = copyOf[9] & 255;
            ArrayList h9 = AbstractC3035cL.h(copyOf);
            if (((TP) c2881Yl.f28862u) == null) {
                C4065vP c4065vP = new C4065vP();
                c4065vP.d("audio/ogg");
                c4065vP.e(com.anythink.basead.exoplayer.k.o.f8584H);
                c4065vP.f34765F = i;
                c4065vP.f34767H = 48000;
                c4065vP.f34788q = h9;
                c2881Yl.f28862u = new TP(c4065vP);
                return true;
            }
        } else {
            if (!e(lr, f32063p)) {
                ((TP) c2881Yl.f28862u).getClass();
                return false;
            }
            ((TP) c2881Yl.f28862u).getClass();
            if (!this.f32064n) {
                this.f32064n = true;
                lr.G(8);
                R3 a9 = AbstractC3556m1.a(UB.o((String[]) C3686oN.h(lr, false, false).f23905u));
                if (a9 != null) {
                    TP tp = (TP) c2881Yl.f28862u;
                    tp.getClass();
                    C4065vP c4065vP2 = new C4065vP(tp);
                    c4065vP2.f34782k = a9.b(((TP) c2881Yl.f28862u).f27773l);
                    c2881Yl.f28862u = new TP(c4065vP2);
                    return true;
                }
            }
        }
        return true;
    }
}
