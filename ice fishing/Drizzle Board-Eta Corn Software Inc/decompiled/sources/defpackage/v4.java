package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class v4 extends b60 {
    public final /* synthetic */ AtomicReferenceArray Qr9iLBAD;
    public final z2 b2ZJblxo;

    public v4(long j, v4 v4Var, z2 z2Var, int i) {
        super(j, v4Var, i);
        this.b2ZJblxo = z2Var;
        this.Qr9iLBAD = new AtomicReferenceArray(b3.NCTxEWno * 2);
    }

    public final void OnDfzHZD(int i, Object obj) {
        this.Qr9iLBAD.set(i * 2, obj);
    }

    @Override // defpackage.b60
    public final int P7K7Inc8() {
        return b3.NCTxEWno;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        OnDfzHZD(r5, null);
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
    @Override // defpackage.b60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2ZJblxo(int i, l9 l9Var) {
        int i2 = b3.NCTxEWno;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.Qr9iLBAD.get(i * 2);
        while (true) {
            Object k3x7lurq = k3x7lurq(i);
            boolean z2 = k3x7lurq instanceof qh0;
            z2 z2Var = this.b2ZJblxo;
            if (z2 || (k3x7lurq instanceof rh0)) {
                if (eVhOlqcC(k3x7lurq, i, z ? b3.eVhOlqcC : b3.k3x7lurq)) {
                    OnDfzHZD(i, null);
                    ow5vqvCr(i, !z);
                    if (z) {
                        z2Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (k3x7lurq == b3.eVhOlqcC || k3x7lurq == b3.k3x7lurq) {
                    break;
                }
                if (k3x7lurq != b3.b2ZJblxo && k3x7lurq != b3.P7K7Inc8) {
                    if (k3x7lurq == b3.jb9XjC4I || k3x7lurq == b3.wxUZMvaN || k3x7lurq == b3.ow5vqvCr) {
                        return;
                    }
                    m1.P7K7Inc8(k3x7lurq, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean eVhOlqcC(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.Qr9iLBAD;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k3x7lurq(int i) {
        return this.Qr9iLBAD.get((i * 2) + 1);
    }

    public final void ow5vqvCr(int i, boolean z) {
        if (z) {
            z2 z2Var = this.b2ZJblxo;
            z2Var.getClass();
            z2Var.pRiPUEwG((this.wxUZMvaN * b3.NCTxEWno) + i);
        }
        Qr9iLBAD();
    }

    public final void ygLcUYwZ(int i, Object obj) {
        this.Qr9iLBAD.set((i * 2) + 1, obj);
    }
}
