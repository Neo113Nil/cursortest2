package d0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4434a extends MediaDataSource {

    /* renamed from: n, reason: collision with root package name */
    public long f36965n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4439f f36966u;

    public C4434a(C4439f c4439f) {
        this.f36966u = c4439f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j9 = this.f36965n;
            C4439f c4439f = this.f36966u;
            if (j9 != j6) {
                if (j9 >= 0 && j6 >= j9 + c4439f.f36969n.available()) {
                    return -1;
                }
                c4439f.j(j6);
                this.f36965n = j6;
            }
            if (i6 > c4439f.f36969n.available()) {
                i6 = c4439f.f36969n.available();
            }
            int read = c4439f.read(bArr, i, i6);
            if (read >= 0) {
                this.f36965n += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f36965n = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
