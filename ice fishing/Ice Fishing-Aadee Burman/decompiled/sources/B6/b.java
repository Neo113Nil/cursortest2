package B6;

import Y6.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class b implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f213n;

    /* renamed from: u, reason: collision with root package name */
    public final E6.a f214u;

    /* renamed from: v, reason: collision with root package name */
    public final d f215v;

    /* renamed from: w, reason: collision with root package name */
    public final long f216w;

    /* renamed from: x, reason: collision with root package name */
    public final FileOutputStream f217x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f218y;

    /* renamed from: z, reason: collision with root package name */
    public int f219z;

    public b(File file, long j6, E6.a aVar) {
        d dVar = d.f3981a;
        this.f218y = new AtomicBoolean(false);
        this.f213n = file;
        this.f214u = aVar;
        this.f215v = dVar;
        this.f216w = j6 + aVar.f834a;
        this.f219z = (int) file.length();
        this.f217x = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f218y.compareAndSet(false, true)) {
            this.f217x.close();
        }
    }

    public final String toString() {
        return "WritableFile{file=" + this.f213n + '}';
    }
}
