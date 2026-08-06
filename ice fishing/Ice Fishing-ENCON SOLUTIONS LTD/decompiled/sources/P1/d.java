package P1;

import N1.k;
import N1.o;
import W1.g;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public long f1508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f1509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o this$0, long j2) {
        super(this$0);
        i.e(this$0, "this$0");
        this.f1509e = this$0;
        this.f1508d = j2;
        if (j2 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1499b) {
            return;
        }
        if (this.f1508d != 0 && !K1.b.h(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f1509e.f1227c).k();
            a();
        }
        this.f1499b = true;
    }

    @Override // P1.a, W1.w
    public final long e(g sink, long j2) {
        i.e(sink, "sink");
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f1508d;
        if (j3 == 0) {
            return -1L;
        }
        long e2 = super.e(sink, Math.min(j3, 8192L));
        if (e2 == -1) {
            ((k) this.f1509e.f1227c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j4 = this.f1508d - e2;
        this.f1508d = j4;
        if (j4 == 0) {
            a();
        }
        return e2;
    }
}
