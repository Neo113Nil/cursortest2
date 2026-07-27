package o8;

import i8.l;
import i8.n;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: x, reason: collision with root package name */
    public long f39661x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f39662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, n url, long j6) {
        super(gVar, url);
        h.e(url, "url");
        this.f39662y = gVar;
        this.f39661x = j6;
        if (j6 == 0) {
            a(l.f38149u);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39653v) {
            return;
        }
        if (this.f39661x != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!j8.d.d(this)) {
                this.f39662y.f39669b.d();
                a(g.f39667f);
            }
        }
        this.f39653v = true;
    }

    @Override // o8.a, y8.x
    public final long d(long j6, y8.e sink) {
        h.e(sink, "sink");
        if (this.f39653v) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f39661x;
        if (j9 == 0) {
            return -1L;
        }
        long d2 = super.d(Math.min(j9, 8192L), sink);
        if (d2 == -1) {
            this.f39662y.f39669b.d();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(g.f39667f);
            throw protocolException;
        }
        long j10 = this.f39661x - d2;
        this.f39661x = j10;
        if (j10 == 0) {
            a(l.f38149u);
        }
        return d2;
    }
}
