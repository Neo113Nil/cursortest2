package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class boo extends wyd {
    public static final AtomicIntegerArray d = new AtomicIntegerArray(0);
    public static final Object e = new Object();
    public final di3 b;
    public final AtomicReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boo(long j, di3 di3Var) {
        super(j, new m78());
        di3Var.getClass();
        this.b = di3Var;
        this.c = new AtomicReference(null);
    }

    @Override // defpackage.wyd
    public final boolean b(uno unoVar, int i) {
        unoVar.getClass();
        if (!unoVar.u()) {
            int t = unoVar.t();
            long B = unoVar.B();
            int count = unoVar.getCount();
            int g = g(t);
            int s = unoVar.g() ? g - unoVar.s() : 0;
            di3 di3Var = this.b;
            if (g < di3Var.a()) {
                unoVar.next();
                if (f() == null) {
                    if (unoVar.u()) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.a.e;
                        atomicInteger.getClass();
                        if (men.q(atomicInteger, g, i == 0 ? count : -count)) {
                            if (f() != null) {
                                i();
                                return true;
                            }
                        }
                    }
                    h();
                }
                while (true) {
                    if (t != di3Var.a[g] || B != r9[g + 1]) {
                        break;
                    }
                    AtomicIntegerArray f = f();
                    f.getClass();
                    if (i != 0) {
                        count = -count;
                    }
                    f.addAndGet(g, count);
                    if (unoVar.u()) {
                        break;
                    }
                    t = unoVar.t();
                    B = unoVar.B();
                    count = unoVar.getCount();
                    g = unoVar.g() ? unoVar.s() + s : g(t);
                    if (g >= di3Var.a()) {
                        break;
                    }
                    unoVar.next();
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wyd
    public final int c() {
        AtomicInteger atomicInteger = (AtomicInteger) this.a.e;
        atomicInteger.getClass();
        int i = atomicInteger.get();
        if (i == -1) {
            i = 0;
        }
        int i2 = (i >>> 16) & 65535;
        if (i2 != 0) {
            return i2;
        }
        if (f() == null && f() == null) {
            return 0;
        }
        int a = this.b.a();
        AtomicIntegerArray f = f();
        int i3 = 0;
        for (int i4 = 0; i4 < a; i4++) {
            f.getClass();
            i3 += f.get(i4);
        }
        return i3;
    }

    @Override // defpackage.wyd
    public final uno e() {
        AtomicInteger atomicInteger = (AtomicInteger) this.a.e;
        atomicInteger.getClass();
        int i = atomicInteger.get();
        if (i == -1) {
            i = 0;
        }
        int i2 = (i >>> 16) & 65535;
        int i3 = i & 65535;
        di3 di3Var = this.b;
        if (i2 != 0) {
            return new plq(di3Var.a[i3], i2, r0[i3 + 1], i3);
        }
        if (f() == null && f() == null) {
            return new x0(d, di3Var);
        }
        AtomicIntegerArray f = f();
        f.getClass();
        return new x0(f, di3Var);
    }

    public final AtomicIntegerArray f() {
        return (AtomicIntegerArray) this.c.get();
    }

    public final int g(int i) {
        di3 di3Var = this.b;
        int a = di3Var.a();
        int[] iArr = di3Var.a;
        if (a < 1) {
            xq0.q("bucketCount too small");
            return 0;
        }
        int i2 = 0;
        if (i < iArr[0]) {
            xq0.q("sampleValue too small");
            return 0;
        }
        if (i >= iArr[a]) {
            xq0.q("sampleValue too big");
            return 0;
        }
        while (true) {
            int b = ouj.b(a, i2, 2, i2);
            if (b == i2) {
                int i3 = iArr[b];
                int i4 = iArr[b + 1];
                return b;
            }
            if (iArr[b] <= i) {
                i2 = b;
            } else {
                a = b;
            }
        }
    }

    public final void h() {
        if (f() == null) {
            synchronized (e) {
                if (f() == null) {
                    this.c.set(new AtomicIntegerArray(this.b.a()));
                }
            }
        }
        i();
    }

    public final void i() {
        f();
        AtomicInteger atomicInteger = (AtomicInteger) this.a.e;
        atomicInteger.getClass();
        int andSet = atomicInteger.getAndSet(-1);
        if (andSet == -1) {
            andSet = 0;
        }
        int i = (andSet >>> 16) & 65535;
        if (i == 0) {
            return;
        }
        AtomicIntegerArray f = f();
        f.getClass();
        f.addAndGet(andSet & 65535, i);
    }
}
