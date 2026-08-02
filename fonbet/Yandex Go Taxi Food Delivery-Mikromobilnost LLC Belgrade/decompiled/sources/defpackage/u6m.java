package defpackage;

import androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: classes10.dex */
public final class u6m {
    public final DownloadRequest a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final n7m h;

    public u6m(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, n7m n7mVar) {
        n7mVar.getClass();
        boolean z = false;
        d6z.l((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            d6z.l(z);
        }
        this.a = downloadRequest;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = n7mVar;
    }

    public u6m(DownloadRequest downloadRequest, int i, long j, long j2, int i2) {
        this(downloadRequest, i, j, j2, -1L, i2, 0, new n7m());
    }
}
