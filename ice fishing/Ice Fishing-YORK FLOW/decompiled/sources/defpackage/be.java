package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class be extends defpackage.ka1 {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray P05cfTpS5W5L;
    public final defpackage.dc QiMR8OkAhezm;

    public be(long j, defpackage.be beVar, defpackage.dc dcVar, int i) {
        super(j, beVar, i);
        this.QiMR8OkAhezm = dcVar;
        this.P05cfTpS5W5L = new java.util.concurrent.atomic.AtomicReferenceArray(defpackage.fc.giKS3J6vZuNy * 2);
    }

    public final void BHfvd2J71qpO(int i, java.lang.Object obj) {
        this.P05cfTpS5W5L.set((i * 2) + 1, obj);
    }

    @Override // defpackage.ka1
    public final int Ns0WNyEWdPsk() {
        return defpackage.fc.giKS3J6vZuNy;
    }

    public final boolean T1fB7bDYiVJQ(int i, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.P05cfTpS5W5L;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void WmetiUbpKU9I(int i, boolean z) {
        if (z) {
            defpackage.dc dcVar = this.QiMR8OkAhezm;
            dcVar.getClass();
            dcVar.Wc0TdmRSwbbi((this.WDYagTQQm9ns * defpackage.fc.giKS3J6vZuNy) + i);
        }
        h3m55N1URyyK();
    }

    public final java.lang.Object XntWc4eZSQ8j(int i) {
        return this.P05cfTpS5W5L.get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        s0TASMVLSWD5(r5, null);
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
    @Override // defpackage.ka1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fNwYGHIYeJcR(int i, defpackage.jm jmVar) {
        int i2 = defpackage.fc.giKS3J6vZuNy;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.P05cfTpS5W5L.get(i * 2);
        while (true) {
            java.lang.Object XntWc4eZSQ8j = XntWc4eZSQ8j(i);
            boolean z2 = XntWc4eZSQ8j instanceof defpackage.vu1;
            defpackage.dc dcVar = this.QiMR8OkAhezm;
            if (z2 || (XntWc4eZSQ8j instanceof defpackage.wu1)) {
                if (T1fB7bDYiVJQ(i, XntWc4eZSQ8j, z ? defpackage.fc.GE9mJIPrb8gP : defpackage.fc.Ns0WNyEWdPsk)) {
                    s0TASMVLSWD5(i, null);
                    WmetiUbpKU9I(i, !z);
                    if (z) {
                        dcVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (XntWc4eZSQ8j == defpackage.fc.GE9mJIPrb8gP || XntWc4eZSQ8j == defpackage.fc.Ns0WNyEWdPsk) {
                    break;
                }
                if (XntWc4eZSQ8j != defpackage.fc.QiMR8OkAhezm && XntWc4eZSQ8j != defpackage.fc.oh71FJcDz6S2) {
                    if (XntWc4eZSQ8j == defpackage.fc.e6mdH7fiFuta || XntWc4eZSQ8j == defpackage.fc.JhCgjQRTAOCT || XntWc4eZSQ8j == defpackage.fc.fNwYGHIYeJcR) {
                        return;
                    }
                    defpackage.h7.QiMR8OkAhezm(XntWc4eZSQ8j, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final void s0TASMVLSWD5(int i, java.lang.Object obj) {
        this.P05cfTpS5W5L.set(i * 2, obj);
    }
}
