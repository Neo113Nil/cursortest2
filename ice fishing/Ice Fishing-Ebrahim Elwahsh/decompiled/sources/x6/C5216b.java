package x6;

import U6.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5216b implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f41790n;

    /* renamed from: u, reason: collision with root package name */
    public final A6.a f41791u;

    /* renamed from: v, reason: collision with root package name */
    public final d f41792v;

    /* renamed from: w, reason: collision with root package name */
    public final long f41793w;

    /* renamed from: x, reason: collision with root package name */
    public final FileOutputStream f41794x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f41795y;

    /* renamed from: z, reason: collision with root package name */
    public int f41796z;

    public C5216b(File file, long j9, A6.a aVar) {
        d dVar = d.f3316a;
        this.f41795y = new AtomicBoolean(false);
        this.f41790n = file;
        this.f41791u = aVar;
        this.f41792v = dVar;
        this.f41793w = j9 + aVar.f37a;
        this.f41796z = (int) file.length();
        this.f41794x = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f41795y.compareAndSet(false, true)) {
            this.f41794x.close();
        }
    }

    public final String toString() {
        return "WritableFile{file=" + this.f41790n + '}';
    }
}
