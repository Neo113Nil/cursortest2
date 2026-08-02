package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3269gQ implements MQ {

    /* renamed from: n, reason: collision with root package name */
    public final C3523lC f31335n;

    /* renamed from: u, reason: collision with root package name */
    public long f31336u;

    public C3269gQ(List list, List list2) {
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        AbstractC2792Sd.i(list.size() == list2.size());
        int i4 = 0;
        while (i < list.size()) {
            C3215fQ c3215fQ = new C3215fQ((MQ) list.get(i), (List) list2.get(i));
            int length = objArr.length;
            int i6 = i4 + 1;
            int d9 = MB.d(length, i6);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i4] = c3215fQ;
            i++;
            i4 = i6;
        }
        this.f31335n = RB.p(objArr, i4);
        this.f31336u = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean d() {
        int i = 0;
        while (true) {
            C3523lC c3523lC = this.f31335n;
            if (i >= c3523lC.f32527w) {
                return false;
            }
            if (((C3215fQ) c3523lC.get(i)).f31037n.d()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean e(C2945aO c2945aO) {
        boolean z6;
        boolean z9 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                break;
            }
            int i4 = 0;
            z6 = false;
            while (true) {
                C3523lC c3523lC = this.f31335n;
                if (i4 >= c3523lC.f32527w) {
                    break;
                }
                long i6 = ((C3215fQ) c3523lC.get(i4)).f31037n.i();
                boolean z10 = i6 != Long.MIN_VALUE && i6 <= c2945aO.f29822a;
                if (i6 == i || z10) {
                    z6 |= ((C3215fQ) c3523lC.get(i4)).f31037n.e(c2945aO);
                }
                i4++;
            }
            z9 |= z6;
        } while (z6);
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long f() {
        int i = 0;
        long j6 = Long.MAX_VALUE;
        long j9 = Long.MAX_VALUE;
        while (true) {
            C3523lC c3523lC = this.f31335n;
            if (i >= c3523lC.f32527w) {
                break;
            }
            C3215fQ c3215fQ = (C3215fQ) c3523lC.get(i);
            long f2 = c3215fQ.f31037n.f();
            RB rb = c3215fQ.f31038u;
            if ((rb.contains(1) || rb.contains(2) || rb.contains(4)) && f2 != Long.MIN_VALUE) {
                j6 = Math.min(j6, f2);
            }
            if (f2 != Long.MIN_VALUE) {
                j9 = Math.min(j9, f2);
            }
            i++;
        }
        if (j6 != Long.MAX_VALUE) {
            this.f31336u = j6;
            return j6;
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f31336u;
        return j10 != com.anythink.basead.exoplayer.b.f7168b ? j10 : j9;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long i() {
        int i = 0;
        long j6 = Long.MAX_VALUE;
        while (true) {
            C3523lC c3523lC = this.f31335n;
            if (i >= c3523lC.f32527w) {
                break;
            }
            long i4 = ((C3215fQ) c3523lC.get(i)).f31037n.i();
            if (i4 != Long.MIN_VALUE) {
                j6 = Math.min(j6, i4);
            }
            i++;
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void k(long j6) {
        int i = 0;
        while (true) {
            C3523lC c3523lC = this.f31335n;
            if (i >= c3523lC.f32527w) {
                return;
            }
            ((C3215fQ) c3523lC.get(i)).k(j6);
            i++;
        }
    }
}
