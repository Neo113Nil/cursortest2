package s7;

import java.io.OutputStream;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    public long f6456g;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f6456g++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f6456g += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f6456g += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
