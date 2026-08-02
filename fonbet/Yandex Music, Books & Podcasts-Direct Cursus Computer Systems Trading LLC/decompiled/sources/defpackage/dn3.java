package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes.dex */
public final class dn3 extends ln3 {
    private static final long serialVersionUID = 1;
    public final int e;
    public final int f;

    public dn3(byte[] bArr, int i, int i2) {
        super(bArr);
        qn3.g(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.ln3, defpackage.qn3
    public final byte a(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(k5r.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(f1d.e(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.ln3, defpackage.qn3
    public final byte o(int i) {
        return this.d[this.e + i];
    }

    @Override // defpackage.ln3
    public final int q() {
        return this.e;
    }

    @Override // defpackage.ln3, defpackage.qn3
    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i = this.f;
        if (i == 0) {
            bArr = vse.b;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(this.d, this.e, bArr2, 0, i);
            bArr = bArr2;
        }
        return new ln3(bArr);
    }
}
