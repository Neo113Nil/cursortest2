package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3797qQ implements WQ {

    /* renamed from: n, reason: collision with root package name */
    public final C3675oC f33730n;

    /* renamed from: u, reason: collision with root package name */
    public long f33731u;

    public C3797qQ(List list, List list2) {
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        PA.n(list.size() == list2.size());
        int i4 = 0;
        while (i < list.size()) {
            C3743pQ c3743pQ = new C3743pQ((WQ) list.get(i), (List) list2.get(i));
            int length = objArr.length;
            int i9 = i4 + 1;
            int d2 = PB.d(length, i9);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i4] = c3743pQ;
            i++;
            i4 = i9;
        }
        this.f33730n = UB.p(objArr, i4);
        this.f33731u = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean b(C3633nO c3633nO) {
        boolean z8;
        boolean z9 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                break;
            }
            int i4 = 0;
            z8 = false;
            while (true) {
                C3675oC c3675oC = this.f33730n;
                if (i4 >= c3675oC.f33117w) {
                    break;
                }
                long i9 = ((C3743pQ) c3675oC.get(i4)).f33408n.i();
                boolean z10 = i9 != Long.MIN_VALUE && i9 <= c3633nO.f32859a;
                if (i9 == i || z10) {
                    z8 |= ((C3743pQ) c3675oC.get(i4)).f33408n.b(c3633nO);
                }
                i4++;
            }
            z9 |= z8;
        } while (z8);
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean c() {
        int i = 0;
        while (true) {
            C3675oC c3675oC = this.f33730n;
            if (i >= c3675oC.f33117w) {
                return false;
            }
            if (((C3743pQ) c3675oC.get(i)).f33408n.c()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long d() {
        int i = 0;
        long j9 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            C3675oC c3675oC = this.f33730n;
            if (i >= c3675oC.f33117w) {
                break;
            }
            C3743pQ c3743pQ = (C3743pQ) c3675oC.get(i);
            long d2 = c3743pQ.f33408n.d();
            UB ub = c3743pQ.f33409u;
            if ((ub.contains(1) || ub.contains(2) || ub.contains(4)) && d2 != Long.MIN_VALUE) {
                j9 = Math.min(j9, d2);
            }
            if (d2 != Long.MIN_VALUE) {
                j10 = Math.min(j10, d2);
            }
            i++;
        }
        if (j9 != Long.MAX_VALUE) {
            this.f33731u = j9;
            return j9;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.f33731u;
        return j11 != com.anythink.basead.exoplayer.b.f6539b ? j11 : j10;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final void f(long j9) {
        int i = 0;
        while (true) {
            C3675oC c3675oC = this.f33730n;
            if (i >= c3675oC.f33117w) {
                return;
            }
            ((C3743pQ) c3675oC.get(i)).f(j9);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long i() {
        int i = 0;
        long j9 = Long.MAX_VALUE;
        while (true) {
            C3675oC c3675oC = this.f33730n;
            if (i >= c3675oC.f33117w) {
                break;
            }
            long i4 = ((C3743pQ) c3675oC.get(i)).f33408n.i();
            if (i4 != Long.MIN_VALUE) {
                j9 = Math.min(j9, i4);
            }
            i++;
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j9;
    }
}
