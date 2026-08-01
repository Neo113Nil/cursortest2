package Y3;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public long f3949n;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3949n++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3949n += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i6) {
        int i9;
        if (i >= 0 && i <= bArr.length && i6 >= 0 && (i9 = i + i6) <= bArr.length && i9 >= 0) {
            this.f3949n += i6;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
