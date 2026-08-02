package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class CL extends JK {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f24865A = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: v, reason: collision with root package name */
    public final int f24866v;

    /* renamed from: w, reason: collision with root package name */
    public final JK f24867w;

    /* renamed from: x, reason: collision with root package name */
    public final JK f24868x;

    /* renamed from: y, reason: collision with root package name */
    public final int f24869y;

    /* renamed from: z, reason: collision with root package name */
    public final int f24870z;

    public CL(JK jk, JK jk2) {
        this.f24867w = jk;
        this.f24868x = jk2;
        int f2 = jk.f();
        this.f24869y = f2;
        this.f24866v = jk2.f() + f2;
        this.f24870z = Math.max(jk.p(), jk2.p()) + 1;
    }

    public static int v(int i) {
        int[] iArr = f24865A;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final byte e(int i) {
        int i4 = this.f24869y;
        return i < i4 ? this.f24867w.e(i) : this.f24868x.e(i - i4);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int f() {
        return this.f24866v;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK g(int i, int i4) {
        return h(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final JK h(int i, int i4) {
        int i6 = this.f24866v;
        int c9 = JK.c(i, i4, i6);
        if (c9 == 0) {
            return JK.f26428u;
        }
        if (c9 == i6) {
            return this;
        }
        JK jk = this.f24867w;
        int i9 = this.f24869y;
        if (i4 <= i9) {
            return jk.g(i, i4);
        }
        int i10 = i4 - i9;
        JK jk2 = this.f24868x;
        return i >= i9 ? jk2.g(i - i9, i10) : new CL(jk.g(i, jk.f()), jk2.g(0, i10));
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void i(int i, int i4, int i6, byte[] bArr) {
        int i9 = i + i6;
        JK jk = this.f24867w;
        int i10 = this.f24869y;
        if (i9 <= i10) {
            jk.i(i, i4, i6, bArr);
            return;
        }
        JK jk2 = this.f24868x;
        if (i >= i10) {
            jk2.i(i - i10, i4, i6, bArr);
            return;
        }
        int i11 = i10 - i;
        jk.i(i, i4, i11, bArr);
        jk2.i(0, i4 + i11, i6 - i11, bArr);
    }

    @Override // com.google.android.gms.internal.ads.JK, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new AL(this);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final void k(OK ok) {
        this.f24867w.k(ok);
        this.f24868x.k(ok);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final boolean l(JK jk) {
        BL bl = new BL(this);
        GK next = bl.next();
        BL bl2 = new BL(jk);
        GK next2 = bl2.next();
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            int f2 = next.f() - i;
            int f9 = next2.f() - i4;
            int min = Math.min(f2, f9);
            if (!(i == 0 ? next.v(next2, i4, min) : next2.v(next, i, min))) {
                return false;
            }
            i6 += min;
            int i9 = this.f24866v;
            if (i6 >= i9) {
                if (i6 == i9) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == f2) {
                i = 0;
                next = bl.next();
            } else {
                i += min;
                next = next;
            }
            if (min == f9) {
                next2 = bl2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int n(int i, int i4, int i6) {
        int i9 = i4 + i6;
        JK jk = this.f24867w;
        int i10 = this.f24869y;
        if (i9 <= i10) {
            return jk.n(i, i4, i6);
        }
        JK jk2 = this.f24868x;
        if (i4 >= i10) {
            return jk2.n(i, i4 - i10, i6);
        }
        int i11 = i10 - i4;
        return jk2.n(jk.n(i, i4, i11), 0, i6 - i11);
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final W7.b o() {
        GK gk;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f24870z);
        arrayDeque.push(this);
        JK jk = this.f24867w;
        while (jk instanceof CL) {
            CL cl = (CL) jk;
            arrayDeque.push(cl);
            jk = cl.f24867w;
        }
        GK gk2 = (GK) jk;
        while (true) {
            if (!(gk2 != null)) {
                C3372iL c3372iL = new C3372iL();
                c3372iL.f31804n = arrayList.iterator();
                c3372iL.f31806v = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c3372iL.f31806v++;
                }
                c3372iL.f31807w = -1;
                if (!c3372iL.b()) {
                    c3372iL.f31805u = AbstractC3103dL.f30519b;
                    c3372iL.f31808x = 0;
                }
                return new LK(c3372iL);
            }
            if (gk2 == null) {
                throw new NoSuchElementException();
            }
            do {
                gk = null;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                JK jk2 = ((CL) arrayDeque.pop()).f24868x;
                while (jk2 instanceof CL) {
                    CL cl2 = (CL) jk2;
                    arrayDeque.push(cl2);
                    jk2 = cl2.f24867w;
                }
                gk = (GK) jk2;
                arrayList.add(gk2.j());
                gk2 = gk;
            } while (gk.f() == 0);
            arrayList.add(gk2.j());
            gk2 = gk;
        }
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final int p() {
        return this.f24870z;
    }

    @Override // com.google.android.gms.internal.ads.JK
    public final boolean q() {
        return this.f24866v >= v(this.f24870z);
    }

    @Override // com.google.android.gms.internal.ads.JK
    /* renamed from: r */
    public final AbstractC4278zC iterator() {
        return new AL(this);
    }
}
