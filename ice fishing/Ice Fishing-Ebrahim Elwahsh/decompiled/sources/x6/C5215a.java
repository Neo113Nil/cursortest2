package x6;

import U6.d;
import g1.C4521a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import z6.C5282a;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5215a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f41784n;

    /* renamed from: u, reason: collision with root package name */
    public final C5282a f41785u;

    /* renamed from: v, reason: collision with root package name */
    public final C4521a f41786v;

    /* renamed from: w, reason: collision with root package name */
    public final d f41787w;

    /* renamed from: x, reason: collision with root package name */
    public final long f41788x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f41789y;

    public C5215a(File file, long j9, A6.a aVar) {
        d dVar = d.f3316a;
        this.f41789y = new AtomicBoolean(false);
        this.f41784n = file;
        this.f41787w = dVar;
        this.f41788x = j9 + aVar.f39c;
        int i = C5282a.f42176v;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        FileChannel channel = randomAccessFile.getChannel();
        channel.force(false);
        C5282a c5282a = new C5282a(randomAccessFile, channel);
        this.f41785u = c5282a;
        this.f41786v = new C4521a(1, c5282a);
    }

    public final synchronized void b() {
        close();
        if (!this.f41784n.delete()) {
            throw new IOException("Could not delete file: " + this.f41784n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f41789y.compareAndSet(false, true)) {
            this.f41786v.close();
        }
    }

    public final synchronized void j() {
        C5282a c5282a = this.f41785u;
        RandomAccessFile randomAccessFile = c5282a.f42177n;
        long filePointer = randomAccessFile.getFilePointer();
        if (filePointer != 0) {
            FileChannel fileChannel = c5282a.f42178u;
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
        if (this.f41785u.f42178u.size() == 0) {
            b();
        }
    }

    public final String toString() {
        return "ReadableFile{file=" + this.f41784n + '}';
    }
}
