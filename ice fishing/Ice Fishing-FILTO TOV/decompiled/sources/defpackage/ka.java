package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ka extends wz0 {
    public final n8 AvO7iQsrTN;
    public final /* synthetic */ AtomicReferenceArray encWxUiV2;

    public ka(long j, ka kaVar, n8 n8Var, int i) {
        super(j, kaVar, i);
        this.AvO7iQsrTN = n8Var;
        this.encWxUiV2 = new AtomicReferenceArray(p8.Yi7zF1RB1 * 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        Mjvvu5DE(r5, null);
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
    @Override // defpackage.wz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E7jCp8Ls(int i, gh ghVar) {
        int i2 = p8.Yi7zF1RB1;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.encWxUiV2.get(i * 2);
        while (true) {
            Object WIEu4Ya2g8 = WIEu4Ya2g8(i);
            boolean z2 = WIEu4Ya2g8 instanceof if1;
            n8 n8Var = this.AvO7iQsrTN;
            if (z2 || (WIEu4Ya2g8 instanceof jf1)) {
                if (iwATDS1i01k(i, WIEu4Ya2g8, z ? p8.JFJ3QoxA : p8.rQPn8YBR)) {
                    Mjvvu5DE(i, null);
                    YmKjaVtbfp5Z(i, !z);
                    if (z) {
                        n8Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (WIEu4Ya2g8 == p8.JFJ3QoxA || WIEu4Ya2g8 == p8.rQPn8YBR) {
                    break;
                }
                if (WIEu4Ya2g8 != p8.AvO7iQsrTN && WIEu4Ya2g8 != p8.EljAMC1QTz) {
                    if (WIEu4Ya2g8 == p8.mOu10nynGul || WIEu4Ya2g8 == p8.xqGvceK5x || WIEu4Ya2g8 == p8.E7jCp8Ls) {
                        return;
                    }
                    o4.EljAMC1QTz(WIEu4Ya2g8, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final void Mjvvu5DE(int i, Object obj) {
        this.encWxUiV2.set(i * 2, obj);
    }

    public final Object WIEu4Ya2g8(int i) {
        return this.encWxUiV2.get((i * 2) + 1);
    }

    public final void YmKjaVtbfp5Z(int i, boolean z) {
        if (z) {
            n8 n8Var = this.AvO7iQsrTN;
            n8Var.getClass();
            n8Var.HFYAaqMd6((this.OOA6hdeuvCS * p8.Yi7zF1RB1) + i);
        }
        XnEVoBF0td1l();
    }

    public final boolean iwATDS1i01k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.encWxUiV2;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void mE4lRynR(int i, Object obj) {
        this.encWxUiV2.set((i * 2) + 1, obj);
    }

    @Override // defpackage.wz0
    public final int rQPn8YBR() {
        return p8.Yi7zF1RB1;
    }
}
