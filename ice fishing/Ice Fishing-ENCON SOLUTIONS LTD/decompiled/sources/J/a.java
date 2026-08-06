package J;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f747b;

    public a(f fVar) {
        this.f747b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (j2 < 0) {
            return -1;
        }
        try {
            long j3 = this.f746a;
            f fVar = this.f747b;
            if (j3 != j2) {
                if (j3 >= 0 && j2 >= j3 + fVar.f748a.available()) {
                    return -1;
                }
                fVar.b(j2);
                this.f746a = j2;
            }
            if (i3 > fVar.f748a.available()) {
                i3 = fVar.f748a.available();
            }
            int read = fVar.read(bArr, i2, i3);
            if (read >= 0) {
                this.f746a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f746a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
