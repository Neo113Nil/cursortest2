package kotlin.text;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CatchingFishMoshiJUnitKtor extends OutputStream {
    public final FileOutputStream CatchingFishReduxKtor;

    public CatchingFishMoshiJUnitKtor(FileOutputStream fileOutputStream) {
        this.CatchingFishReduxKtor = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.CatchingFishReduxKtor.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.CatchingFishReduxKtor.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "b");
        this.CatchingFishReduxKtor.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "bytes");
        this.CatchingFishReduxKtor.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
