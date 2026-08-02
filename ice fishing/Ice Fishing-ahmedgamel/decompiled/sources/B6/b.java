package B6;

import Y6.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class b implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f279n;

    /* renamed from: u, reason: collision with root package name */
    public final E6.a f280u;

    /* renamed from: v, reason: collision with root package name */
    public final d f281v;

    /* renamed from: w, reason: collision with root package name */
    public final long f282w;

    /* renamed from: x, reason: collision with root package name */
    public final FileOutputStream f283x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f284y;

    /* renamed from: z, reason: collision with root package name */
    public int f285z;

    public b(File file, long j6, E6.a aVar) {
        d dVar = d.f3925a;
        this.f284y = new AtomicBoolean(false);
        this.f279n = file;
        this.f280u = aVar;
        this.f281v = dVar;
        this.f282w = j6 + aVar.f897a;
        this.f285z = (int) file.length();
        this.f283x = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f284y.compareAndSet(false, true)) {
            this.f283x.close();
        }
    }

    public final String toString() {
        return "WritableFile{file=" + this.f279n + '}';
    }
}
