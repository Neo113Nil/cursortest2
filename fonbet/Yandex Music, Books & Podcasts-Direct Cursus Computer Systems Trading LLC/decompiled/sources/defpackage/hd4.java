package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class hd4 extends yap {
    public final zi3 e;
    public final /* synthetic */ AtomicReferenceArray f;

    public hd4(long j, hd4 hd4Var, zi3 zi3Var, int i) {
        super(j, hd4Var, i);
        this.e = zi3Var;
        this.f = new AtomicReferenceArray(bj3.b * 2);
    }

    @Override // defpackage.yap
    public final int g() {
        return bj3.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.yap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, CoroutineContext coroutineContext) {
        int i2 = bj3.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof hku;
            zi3 zi3Var = this.e;
            if (z2 || (l instanceof iku)) {
                if (k(i, l, z ? bj3.j : bj3.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        zi3Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (l == bj3.j || l == bj3.k) {
                    break;
                }
                if (l != bj3.g && l != bj3.f) {
                    if (l == bj3.i || l == bj3.d || l == bj3.l) {
                        return;
                    }
                    b6e.l(l, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            zi3 zi3Var = this.e;
            zi3Var.getClass();
            zi3Var.N((this.c * bj3.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
