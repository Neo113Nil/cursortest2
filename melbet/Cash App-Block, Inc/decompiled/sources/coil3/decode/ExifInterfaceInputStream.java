package coil3.decode;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ExifInterfaceInputStream extends InputStream {
    public final /* synthetic */ int $r8$classId = 0;
    public int availableBytes = 1073741824;
    public final Object delegate;

    public ExifInterfaceInputStream(InputStream inputStream) {
        this.delegate = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.$r8$classId) {
            case 0:
                return this.availableBytes;
            default:
                return ((ByteBuffer) this.delegate).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.$r8$classId) {
            case 0:
                ((InputStream) this.delegate).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.$r8$classId) {
            case 1:
                synchronized (this) {
                    this.availableBytes = ((ByteBuffer) this.delegate).position();
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.$r8$classId) {
            case 1:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.delegate;
        switch (i3) {
            case 0:
                int read = ((InputStream) obj).read(bArr, i, i2);
                if (read == -1) {
                    this.availableBytes = 0;
                }
                return read;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, min);
                return min;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        switch (this.$r8$classId) {
            case 1:
                synchronized (this) {
                    int i = this.availableBytes;
                    if (i == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.delegate).position(i);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.$r8$classId;
        Object obj = this.delegate;
        switch (i) {
            case 0:
                return ((InputStream) obj).skip(j);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long min = Math.min(j, byteBuffer.remaining());
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
        }
    }

    public ExifInterfaceInputStream(ByteBuffer byteBuffer) {
        this.delegate = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.$r8$classId;
        Object obj = this.delegate;
        switch (i) {
            case 0:
                int read = ((InputStream) obj).read();
                if (read == -1) {
                    this.availableBytes = 0;
                }
                return read;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.$r8$classId) {
            case 0:
                int read = ((InputStream) this.delegate).read(bArr);
                if (read == -1) {
                    this.availableBytes = 0;
                }
                return read;
            default:
                return super.read(bArr);
        }
    }
}
