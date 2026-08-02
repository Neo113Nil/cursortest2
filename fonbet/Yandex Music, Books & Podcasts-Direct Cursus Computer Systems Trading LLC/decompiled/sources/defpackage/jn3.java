package defpackage;

import androidx.core.app.q;

/* loaded from: classes3.dex */
public class jn3 extends mn3 {
    private static final long serialVersionUID = 1;
    public final byte[] d;

    public jn3(byte[] bArr) {
        this.a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // defpackage.mn3
    public byte a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mn3) || size() != ((mn3) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof jn3)) {
            return obj.equals(this);
        }
        jn3 jn3Var = (jn3) obj;
        int i = this.a;
        int i2 = jn3Var.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > jn3Var.size()) {
            tiu.e(size, size());
            return false;
        }
        if (size > jn3Var.size()) {
            q.j(jn3Var.size(), k5r.q(size, "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = jn3Var.d;
        int s = s() + size;
        int s2 = s();
        int s3 = jn3Var.s();
        while (s2 < s) {
            if (this.d[s2] != bArr[s3]) {
                return false;
            }
            s2++;
            s3++;
        }
        return true;
    }

    @Override // defpackage.mn3
    public void o(int i, byte[] bArr) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // defpackage.mn3
    public byte q(int i) {
        return this.d[i];
    }

    public int s() {
        return 0;
    }

    @Override // defpackage.mn3
    public int size() {
        return this.d.length;
    }
}
