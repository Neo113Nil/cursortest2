package A6;

import com.anythink.basead.exoplayer.h.o;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final File f194n;

    /* renamed from: u, reason: collision with root package name */
    public final E6.a f195u;

    /* renamed from: v, reason: collision with root package name */
    public B6.a f196v;

    /* renamed from: w, reason: collision with root package name */
    public B6.b f197w;

    public b(File file, E6.a aVar) {
        this.f194n = file;
        this.f195u = aVar;
    }

    public final File b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        B6.b bVar;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit2.toNanos(epochSecond);
        nano = instant.getNano();
        long millis = timeUnit.toMillis(nanos + nano);
        File[] listFiles = this.f194n.listFiles();
        File file = null;
        if (listFiles != null) {
            long j6 = 0;
            for (File file2 : listFiles) {
                long parseLong = Long.parseLong(file2.getName());
                E6.a aVar = this.f195u;
                if (millis >= aVar.f898b + parseLong && millis <= aVar.f899c + parseLong && (file == null || parseLong < j6)) {
                    file = file2;
                    j6 = parseLong;
                }
            }
        }
        if (file != null && (bVar = this.f197w) != null && file.equals(bVar.f279n)) {
            this.f197w.close();
        }
        return file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                B6.a aVar = this.f196v;
                if (aVar != null) {
                    aVar.close();
                }
                B6.b bVar = this.f197w;
                if (bVar != null) {
                    bVar.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(File[] fileArr) {
        if (fileArr.length > 0) {
            int i = 0;
            for (File file : fileArr) {
                i += (int) file.length();
            }
            if (i + o.f8528d > 10485760) {
                File file2 = null;
                for (File file3 : fileArr) {
                    if (file2 == null || file3.getName().compareTo(file2.getName()) < 0) {
                        file2 = file3;
                    }
                }
                Objects.requireNonNull(file2);
                B6.a aVar = this.f196v;
                if (aVar != null && file2.equals(aVar.f273n)) {
                    this.f196v.close();
                }
                if (file2.delete()) {
                    return;
                }
                throw new IOException("Could not delete the file: " + file2);
            }
        }
    }
}
