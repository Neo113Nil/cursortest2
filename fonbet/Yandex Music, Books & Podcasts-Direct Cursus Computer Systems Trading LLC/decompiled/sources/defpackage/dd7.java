package defpackage;

/* loaded from: classes5.dex */
public final class dd7 implements cve {
    public final cve[] a;
    public final int b;

    public dd7(cve[] cveVarArr) {
        int a;
        this.a = cveVarArr;
        int length = cveVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            cve cveVar = cveVarArr[length];
            if (cveVar != null && (a = cveVar.a()) > i) {
                i = a;
            }
        }
    }

    @Override // defpackage.cve
    public final int a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0053, code lost:
    
        if (r6 > r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r6 != r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        if (r3 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
    
        return ~r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005c, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005e, code lost:
    
        r10.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0061, code lost:
    
        return r6;
     */
    @Override // defpackage.cve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        int b;
        int i2;
        int i3;
        cve[] cveVarArr = this.a;
        int length = cveVarArr.length;
        if (pd7Var.i == null) {
            pd7Var.i = new od7(pd7Var);
        }
        od7 od7Var = pd7Var.i;
        boolean z = false;
        od7 od7Var2 = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            cve cveVar = cveVarArr[i6];
            if (cveVar != null) {
                b = cveVar.b(pd7Var, charSequence, i);
                if (b >= i) {
                    if (b <= i4) {
                        continue;
                    } else {
                        if (b >= charSequence.length() || (i3 = i6 + 1) >= length || cveVarArr[i3] == null) {
                            break;
                        }
                        if (pd7Var.i == null) {
                            pd7Var.i = new od7(pd7Var);
                        }
                        od7Var2 = pd7Var.i;
                        i4 = b;
                    }
                } else if (b < 0 && (i2 = ~b) > i5) {
                    i5 = i2;
                }
                pd7Var.d(od7Var);
                i6++;
            } else {
                if (i4 <= i) {
                    return i;
                }
                z = true;
            }
        }
        return b;
    }
}
