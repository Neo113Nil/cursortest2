package w6;

import com.anythink.basead.exoplayer.h.o;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import x6.C5215a;
import x6.C5216b;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5175b implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f41683n;

    /* renamed from: u, reason: collision with root package name */
    public final A6.a f41684u;

    /* renamed from: v, reason: collision with root package name */
    public C5215a f41685v;

    /* renamed from: w, reason: collision with root package name */
    public C5216b f41686w;

    public C5175b(File file, A6.a aVar) {
        this.f41683n = file;
        this.f41684u = aVar;
    }

    public final File b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        C5216b c5216b;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit2.toNanos(epochSecond);
        nano = instant.getNano();
        long millis = timeUnit.toMillis(nanos + nano);
        File[] listFiles = this.f41683n.listFiles();
        File file = null;
        if (listFiles != null) {
            long j9 = 0;
            for (File file2 : listFiles) {
                long parseLong = Long.parseLong(file2.getName());
                A6.a aVar = this.f41684u;
                if (millis >= aVar.f38b + parseLong && millis <= aVar.f39c + parseLong && (file == null || parseLong < j9)) {
                    file = file2;
                    j9 = parseLong;
                }
            }
        }
        if (file != null && (c5216b = this.f41686w) != null && file.equals(c5216b.f41790n)) {
            this.f41686w.close();
        }
        return file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                C5215a c5215a = this.f41685v;
                if (c5215a != null) {
                    c5215a.close();
                }
                C5216b c5216b = this.f41686w;
                if (c5216b != null) {
                    c5216b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(File[] fileArr) {
        if (fileArr.length > 0) {
            int i = 0;
            for (File file : fileArr) {
                i += (int) file.length();
            }
            if (i + o.f7899d > 10485760) {
                File file2 = null;
                for (File file3 : fileArr) {
                    if (file2 == null || file3.getName().compareTo(file2.getName()) < 0) {
                        file2 = file3;
                    }
                }
                Objects.requireNonNull(file2);
                C5215a c5215a = this.f41685v;
                if (c5215a != null && file2.equals(c5215a.f41784n)) {
                    this.f41685v.close();
                }
                if (file2.delete()) {
                    return;
                }
                throw new IOException("Could not delete the file: " + file2);
            }
        }
    }
}
