package k8;

import e8.m;
import e8.o;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: x, reason: collision with root package name */
    public long f38840x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f38841y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, o url, long j9) {
        super(gVar, url);
        h.e(url, "url");
        this.f38841y = gVar;
        this.f38840x = j9;
        if (j9 == 0) {
            a(m.f37427u);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38832v) {
            return;
        }
        if (this.f38840x != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!f8.d.d(this)) {
                this.f38841y.f38848b.e();
                a(g.f38846f);
            }
        }
        this.f38832v = true;
    }

    @Override // k8.a, u8.x
    public final long f(long j9, u8.e sink) {
        h.e(sink, "sink");
        if (this.f38832v) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f38840x;
        if (j10 == 0) {
            return -1L;
        }
        long f6 = super.f(Math.min(j10, 8192L), sink);
        if (f6 == -1) {
            this.f38841y.f38848b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(g.f38846f);
            throw protocolException;
        }
        long j11 = this.f38840x - f6;
        this.f38840x = j11;
        if (j11 == 0) {
            a(m.f37427u);
        }
        return f6;
    }
}
