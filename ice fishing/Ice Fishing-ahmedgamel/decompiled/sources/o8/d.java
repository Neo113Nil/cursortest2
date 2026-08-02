package o8;

import i8.l;
import i8.n;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: x, reason: collision with root package name */
    public long f39772x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f39773y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, n url, long j6) {
        super(gVar, url);
        h.e(url, "url");
        this.f39773y = gVar;
        this.f39772x = j6;
        if (j6 == 0) {
            a(l.f38268u);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39764v) {
            return;
        }
        if (this.f39772x != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!j8.d.d(this)) {
                this.f39773y.f39780b.d();
                a(g.f39778f);
            }
        }
        this.f39764v = true;
    }

    @Override // o8.a, y8.x
    public final long d(long j6, y8.e sink) {
        h.e(sink, "sink");
        if (this.f39764v) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f39772x;
        if (j9 == 0) {
            return -1L;
        }
        long d9 = super.d(Math.min(j9, 8192L), sink);
        if (d9 == -1) {
            this.f39773y.f39780b.d();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(g.f39778f);
            throw protocolException;
        }
        long j10 = this.f39772x - d9;
        this.f39772x = j10;
        if (j10 == 0) {
            a(l.f38268u);
        }
        return d9;
    }
}
