package kotlin.text;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CatchingFishViewModelPayPal extends OutputStream {
    public long CatchingFishReduxKtor;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.CatchingFishReduxKtor++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.CatchingFishReduxKtor += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.CatchingFishReduxKtor += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
