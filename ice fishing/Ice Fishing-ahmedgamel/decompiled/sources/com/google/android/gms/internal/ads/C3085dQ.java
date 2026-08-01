package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3085dQ implements JQ {

    /* renamed from: n, reason: collision with root package name */
    public final C3500lC f29777n;

    /* renamed from: u, reason: collision with root package name */
    public long f29778u;

    public C3085dQ(List list, List list2) {
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        AbstractC2772Sd.i(list.size() == list2.size());
        int i6 = 0;
        while (i < list.size()) {
            C3031cQ c3031cQ = new C3031cQ((JQ) list.get(i), (List) list2.get(i));
            int length = objArr.length;
            int i9 = i6 + 1;
            int d2 = MB.d(length, i9);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i6] = c3031cQ;
            i++;
            i6 = i9;
        }
        this.f29777n = RB.p(objArr, i6);
        this.f29778u = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean d() {
        int i = 0;
        while (true) {
            C3500lC c3500lC = this.f29777n;
            if (i >= c3500lC.f31747w) {
                return false;
            }
            if (((C3031cQ) c3500lC.get(i)).f29496n.d()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean e(C2922aO c2922aO) {
        boolean z3;
        boolean z6 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                break;
            }
            int i6 = 0;
            z3 = false;
            while (true) {
                C3500lC c3500lC = this.f29777n;
                if (i6 >= c3500lC.f31747w) {
                    break;
                }
                long i9 = ((C3031cQ) c3500lC.get(i6)).f29496n.i();
                boolean z9 = i9 != Long.MIN_VALUE && i9 <= c2922aO.f29052a;
                if (i9 == i || z9) {
                    z3 |= ((C3031cQ) c3500lC.get(i6)).f29496n.e(c2922aO);
                }
                i6++;
            }
            z6 |= z3;
        } while (z3);
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long f() {
        int i = 0;
        long j6 = Long.MAX_VALUE;
        long j9 = Long.MAX_VALUE;
        while (true) {
            C3500lC c3500lC = this.f29777n;
            if (i >= c3500lC.f31747w) {
                break;
            }
            C3031cQ c3031cQ = (C3031cQ) c3500lC.get(i);
            long f3 = c3031cQ.f29496n.f();
            RB rb = c3031cQ.f29497u;
            if ((rb.contains(1) || rb.contains(2) || rb.contains(4)) && f3 != Long.MIN_VALUE) {
                j6 = Math.min(j6, f3);
            }
            if (f3 != Long.MIN_VALUE) {
                j9 = Math.min(j9, f3);
            }
            i++;
        }
        if (j6 != Long.MAX_VALUE) {
            this.f29778u = j6;
            return j6;
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f29778u;
        return j10 != com.anythink.basead.exoplayer.b.f6382b ? j10 : j9;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long i() {
        int i = 0;
        long j6 = Long.MAX_VALUE;
        while (true) {
            C3500lC c3500lC = this.f29777n;
            if (i >= c3500lC.f31747w) {
                break;
            }
            long i6 = ((C3031cQ) c3500lC.get(i)).f29496n.i();
            if (i6 != Long.MIN_VALUE) {
                j6 = Math.min(j6, i6);
            }
            i++;
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final void k(long j6) {
        int i = 0;
        while (true) {
            C3500lC c3500lC = this.f29777n;
            if (i >= c3500lC.f31747w) {
                return;
            }
            ((C3031cQ) c3500lC.get(i)).k(j6);
            i++;
        }
    }
}
