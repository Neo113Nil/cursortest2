package d0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4449a extends MediaDataSource {

    /* renamed from: n, reason: collision with root package name */
    public long f37118n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4454f f37119u;

    public C4449a(C4454f c4454f) {
        this.f37119u = c4454f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j9 = this.f37118n;
            C4454f c4454f = this.f37119u;
            if (j9 != j6) {
                if (j9 >= 0 && j6 >= j9 + c4454f.f37122n.available()) {
                    return -1;
                }
                c4454f.j(j6);
                this.f37118n = j6;
            }
            if (i4 > c4454f.f37122n.available()) {
                i4 = c4454f.f37122n.available();
            }
            int read = c4454f.read(bArr, i, i4);
            if (read >= 0) {
                this.f37118n += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f37118n = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
