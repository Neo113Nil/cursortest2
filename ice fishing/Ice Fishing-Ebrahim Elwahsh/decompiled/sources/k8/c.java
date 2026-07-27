package k8;

import M7.j;
import M7.q;
import e8.o;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import u8.r;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: x, reason: collision with root package name */
    public long f38837x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38838y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g f38839z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, o url) {
        super(gVar, url);
        h.e(url, "url");
        this.f38839z = gVar;
        this.f38837x = -1L;
        this.f38838y = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38832v) {
            return;
        }
        if (this.f38838y) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!f8.d.d(this)) {
                this.f38839z.f38848b.e();
                a(g.f38846f);
            }
        }
        this.f38832v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r10 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0075, code lost:
    
        p8.g.e(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.jvm.internal.h.d(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // k8.a, u8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j9, u8.e sink) {
        u8.e eVar;
        long j10;
        h.e(sink, "sink");
        if (this.f38832v) {
            throw new IllegalStateException("closed");
        }
        long j11 = -1;
        if (!this.f38838y) {
            return -1L;
        }
        long j12 = this.f38837x;
        g gVar = this.f38839z;
        if (j12 == 0 || j12 == -1) {
            if (j12 != -1) {
                ((r) gVar.f38849c.f3964v).C(Long.MAX_VALUE);
            }
            try {
                r rVar = (r) gVar.f38849c.f3964v;
                rVar.D(1L);
                int i = 0;
                while (true) {
                    int i4 = i + 1;
                    boolean S8 = rVar.S(i4);
                    eVar = rVar.f41309u;
                    if (!S8) {
                        j10 = j11;
                        break;
                    }
                    j10 = j11;
                    byte k6 = eVar.k(i);
                    if ((k6 < 48 || k6 > 57) && ((k6 < 97 || k6 > 102) && (k6 < 65 || k6 > 70))) {
                        break;
                    }
                    j11 = j10;
                    i = i4;
                }
                this.f38837x = eVar.C();
                String obj = j.h0(((r) gVar.f38849c.f3964v).C(Long.MAX_VALUE)).toString();
                if (this.f38837x < 0 || (obj.length() > 0 && !q.I(obj, ";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f38837x + obj + '\"');
                }
                if (this.f38837x == 0) {
                    this.f38838y = false;
                    a(gVar.f38851e.j());
                }
                if (!this.f38838y) {
                    return j10;
                }
            } catch (NumberFormatException e6) {
                throw new ProtocolException(e6.getMessage());
            }
        } else {
            j10 = -1;
        }
        long f6 = super.f(Math.min(8192L, this.f38837x), sink);
        if (f6 != j10) {
            this.f38837x -= f6;
            return f6;
        }
        gVar.f38848b.e();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a(g.f38846f);
        throw protocolException;
    }
}
