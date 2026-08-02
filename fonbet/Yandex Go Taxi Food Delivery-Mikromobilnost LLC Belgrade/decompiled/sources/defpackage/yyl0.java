package defpackage;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class yyl0 extends nlu {
    public static final AtomicIntegerArray d = new AtomicIntegerArray(0);
    public static final Object e = new Object();
    public final po6 b;
    public final AtomicReference c;

    public yyl0(long j, po6 po6Var) {
        super(j, new v820());
        this.b = po6Var;
        this.c = new AtomicReference(null);
    }

    @Override // defpackage.nlu
    public final boolean b(pyl0 pyl0Var, int i) {
        if (!pyl0Var.d()) {
            int c = pyl0Var.c();
            long e2 = pyl0Var.e();
            int count = pyl0Var.getCount();
            int g = g(c);
            int b = pyl0Var.a() ? g - pyl0Var.b() : 0;
            po6 po6Var = this.b;
            if (g < po6Var.a()) {
                pyl0Var.next();
                if (f() == null) {
                    if (pyl0Var.d()) {
                        if (bvf0.g(this.a.e, g, i == 0 ? count : -count)) {
                            if (f() != null) {
                                i();
                                return true;
                            }
                        }
                    }
                    h();
                }
                while (true) {
                    if (c != po6Var.a[g] || e2 != r9[g + 1]) {
                        break;
                    }
                    AtomicIntegerArray f = f();
                    if (i != 0) {
                        count = -count;
                    }
                    f.addAndGet(g, count);
                    if (pyl0Var.d()) {
                        break;
                    }
                    c = pyl0Var.c();
                    e2 = pyl0Var.e();
                    count = pyl0Var.getCount();
                    g = pyl0Var.a() ? pyl0Var.b() + b : g(c);
                    if (g >= po6Var.a()) {
                        break;
                    }
                    pyl0Var.next();
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.nlu
    public final int c() {
        int i = this.a.e.get();
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
            i3 += f.get(i4);
        }
        return i3;
    }

    @Override // defpackage.nlu
    public final pyl0 e() {
        int i = this.a.e.get();
        if (i == -1) {
            i = 0;
        }
        int i2 = (i >>> 16) & 65535;
        int i3 = i & 65535;
        po6 po6Var = this.b;
        if (i2 == 0) {
            return (f() == null && f() == null) ? new suu(d, po6Var) : new suu(f(), po6Var);
        }
        return new whs0(po6Var.a[i3], i2, r9[i3 + 1], i3);
    }

    public final AtomicIntegerArray f() {
        return (AtomicIntegerArray) this.c.get();
    }

    public final int g(int i) {
        po6 po6Var = this.b;
        int a = po6Var.a();
        int[] iArr = po6Var.a;
        int i2 = 0;
        if (a < 1) {
            ny61.r("bucketCount too small");
            return 0;
        }
        if (i < iArr[0]) {
            ny61.r("sampleValue too small");
            return 0;
        }
        if (i >= iArr[a]) {
            ny61.r("sampleValue too big");
            return 0;
        }
        while (true) {
            int c = x4e.c(a, i2, 2, i2);
            if (c == i2) {
                int i3 = iArr[c];
                int i4 = iArr[c + 1];
                return c;
            }
            if (iArr[c] <= i) {
                i2 = c;
            } else {
                a = c;
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
        int andSet = this.a.e.getAndSet(-1);
        if (andSet == -1) {
            andSet = 0;
        }
        int i = (andSet >>> 16) & 65535;
        if (i == 0) {
            return;
        }
        f().addAndGet(andSet & 65535, i);
    }
}
