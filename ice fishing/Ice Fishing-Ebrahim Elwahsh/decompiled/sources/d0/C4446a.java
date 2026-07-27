package d0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4446a extends MediaDataSource {

    /* renamed from: n, reason: collision with root package name */
    public long f37128n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4451f f37129u;

    public C4446a(C4451f c4451f) {
        this.f37129u = c4451f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j9, byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j9 < 0) {
            return -1;
        }
        try {
            long j10 = this.f37128n;
            C4451f c4451f = this.f37129u;
            if (j10 != j9) {
                if (j10 >= 0 && j9 >= j10 + c4451f.f37132n.available()) {
                    return -1;
                }
                c4451f.g(j9);
                this.f37128n = j9;
            }
            if (i4 > c4451f.f37132n.available()) {
                i4 = c4451f.f37132n.available();
            }
            int read = c4451f.read(bArr, i, i4);
            if (read >= 0) {
                this.f37128n += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f37128n = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
