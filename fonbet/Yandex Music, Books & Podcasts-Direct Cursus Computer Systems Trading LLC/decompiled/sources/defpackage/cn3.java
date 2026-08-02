package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class cn3 extends kn3 {
    private static final long serialVersionUID = 1;
    public final int e;
    public final int f;

    public cn3(byte[] bArr, int i, int i2) {
        super(bArr);
        nn3.g(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.kn3
    public final int A() {
        return this.e;
    }

    @Override // defpackage.kn3, defpackage.nn3
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

    @Override // defpackage.kn3, defpackage.nn3
    public final void q(int i, byte[] bArr) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // defpackage.kn3, defpackage.nn3
    public final byte r(int i) {
        return this.d[this.e + i];
    }

    @Override // defpackage.kn3, defpackage.nn3
    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        return new kn3(w());
    }
}
