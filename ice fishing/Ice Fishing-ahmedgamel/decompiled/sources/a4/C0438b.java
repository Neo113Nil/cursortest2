package a4;

import java.io.OutputStream;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0438b extends OutputStream {

    /* renamed from: n, reason: collision with root package name */
    public long f4302n;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f4302n++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f4302n += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i4) {
        int i6;
        if (i >= 0 && i <= bArr.length && i4 >= 0 && (i6 = i + i4) <= bArr.length && i6 >= 0) {
            this.f4302n += i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
