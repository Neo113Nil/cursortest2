package B6;

import Y6.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f207n;

    /* renamed from: u, reason: collision with root package name */
    public final D6.a f208u;

    /* renamed from: v, reason: collision with root package name */
    public final C6.a f209v;

    /* renamed from: w, reason: collision with root package name */
    public final d f210w;

    /* renamed from: x, reason: collision with root package name */
    public final long f211x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f212y;

    public a(File file, long j6, E6.a aVar) {
        d dVar = d.f3981a;
        this.f212y = new AtomicBoolean(false);
        this.f207n = file;
        this.f210w = dVar;
        this.f211x = j6 + aVar.f836c;
        int i = D6.a.f646v;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        FileChannel channel = randomAccessFile.getChannel();
        channel.force(false);
        D6.a aVar2 = new D6.a(randomAccessFile, channel);
        this.f208u = aVar2;
        this.f209v = new C6.a(0, aVar2);
    }

    public final synchronized void b() {
        close();
        if (!this.f207n.delete()) {
            throw new IOException("Could not delete file: " + this.f207n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f212y.compareAndSet(false, true)) {
            this.f209v.close();
        }
    }

    public final synchronized void j() {
        D6.a aVar = this.f208u;
        RandomAccessFile randomAccessFile = aVar.f647n;
        long filePointer = randomAccessFile.getFilePointer();
        if (filePointer != 0) {
            FileChannel fileChannel = aVar.f648u;
            long size = fileChannel.size() - filePointer;
            if (size > 0) {
                byte[] bArr = new byte[(int) size];
                randomAccessFile.read(bArr);
                randomAccessFile.seek(0L);
                fileChannel.truncate(size);
                randomAccessFile.write(bArr);
                randomAccessFile.seek(0L);
            } else {
                fileChannel.truncate(0L);
            }
        }
        if (this.f208u.f648u.size() == 0) {
            b();
        }
    }

    public final String toString() {
        return "ReadableFile{file=" + this.f207n + '}';
    }
}
