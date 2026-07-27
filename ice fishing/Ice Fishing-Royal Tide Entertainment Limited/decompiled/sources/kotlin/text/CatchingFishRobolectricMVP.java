package kotlin.text;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class CatchingFishRobolectricMVP extends FilterInputStream {
    public long CatchingFishDaggerWebsocket;
    public long CatchingFishReduxKtor;

    public CatchingFishRobolectricMVP(InputStream inputStream) {
        super(inputStream);
        this.CatchingFishDaggerWebsocket = -1L;
        this.CatchingFishReduxKtor = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.CatchingFishReduxKtor);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.CatchingFishDaggerWebsocket = this.CatchingFishReduxKtor;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.CatchingFishReduxKtor == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.CatchingFishReduxKtor--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.CatchingFishDaggerWebsocket == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.CatchingFishReduxKtor = this.CatchingFishDaggerWebsocket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.CatchingFishReduxKtor));
        this.CatchingFishReduxKtor -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.CatchingFishReduxKtor;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.CatchingFishReduxKtor -= read;
        }
        return read;
    }
}
