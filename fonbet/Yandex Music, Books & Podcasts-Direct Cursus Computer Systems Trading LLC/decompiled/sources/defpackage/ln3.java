package defpackage;

import androidx.core.app.q;

/* loaded from: classes.dex */
public class ln3 extends in3 {
    private static final long serialVersionUID = 1;
    public final byte[] d;

    public ln3(byte[] bArr) {
        this.a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // defpackage.qn3
    public byte a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn3) || size() != ((qn3) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof ln3)) {
            return obj.equals(this);
        }
        ln3 ln3Var = (ln3) obj;
        int i = this.a;
        int i2 = ln3Var.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > ln3Var.size()) {
            tiu.e(size, size());
            return false;
        }
        if (size > ln3Var.size()) {
            q.j(ln3Var.size(), k5r.q(size, "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = ln3Var.d;
        int q = q() + size;
        int q2 = q();
        int q3 = ln3Var.q();
        while (q2 < q) {
            if (this.d[q2] != bArr[q3]) {
                return false;
            }
            q2++;
            q3++;
        }
        return true;
    }

    @Override // defpackage.qn3
    public byte o(int i) {
        return this.d[i];
    }

    public int q() {
        return 0;
    }

    @Override // defpackage.qn3
    public int size() {
        return this.d.length;
    }
}
