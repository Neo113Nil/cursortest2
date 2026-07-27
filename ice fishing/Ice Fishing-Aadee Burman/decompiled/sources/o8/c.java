package o8;

import Q7.j;
import Q7.q;
import i8.n;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import y8.r;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: x, reason: collision with root package name */
    public long f39658x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39659y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g f39660z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, n url) {
        super(gVar, url);
        h.e(url, "url");
        this.f39660z = gVar;
        this.f39658x = -1L;
        this.f39659y = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39653v) {
            return;
        }
        if (this.f39659y) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!j8.d.d(this)) {
                this.f39660z.f39669b.d();
                a(g.f39667f);
            }
        }
        this.f39653v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r10 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0075, code lost:
    
        L3.F.g(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.jvm.internal.h.d(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // o8.a, y8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(long j6, y8.e sink) {
        y8.e eVar;
        long j9;
        h.e(sink, "sink");
        if (this.f39653v) {
            throw new IllegalStateException("closed");
        }
        long j10 = -1;
        if (!this.f39659y) {
            return -1L;
        }
        long j11 = this.f39658x;
        g gVar = this.f39660z;
        if (j11 == 0 || j11 == -1) {
            if (j11 != -1) {
                ((r) gVar.f39670c.f38405v).D(Long.MAX_VALUE);
            }
            try {
                r rVar = (r) gVar.f39670c.f38405v;
                rVar.E(1L);
                int i = 0;
                while (true) {
                    int i6 = i + 1;
                    boolean S8 = rVar.S(i6);
                    eVar = rVar.f41982u;
                    if (!S8) {
                        j9 = j10;
                        break;
                    }
                    j9 = j10;
                    byte k9 = eVar.k(i);
                    if ((k9 < 48 || k9 > 57) && ((k9 < 97 || k9 > 102) && (k9 < 65 || k9 > 70))) {
                        break;
                    }
                    j10 = j9;
                    i = i6;
                }
                this.f39658x = eVar.C();
                String obj = j.q0(((r) gVar.f39670c.f38405v).D(Long.MAX_VALUE)).toString();
                if (this.f39658x < 0 || (obj.length() > 0 && !q.R(obj, ";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f39658x + obj + '\"');
                }
                if (this.f39658x == 0) {
                    this.f39659y = false;
                    a(gVar.f39672e.h());
                }
                if (!this.f39659y) {
                    return j9;
                }
            } catch (NumberFormatException e9) {
                throw new ProtocolException(e9.getMessage());
            }
        } else {
            j9 = -1;
        }
        long d2 = super.d(Math.min(8192L, this.f39658x), sink);
        if (d2 != j9) {
            this.f39658x -= d2;
            return d2;
        }
        gVar.f39669b.d();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a(g.f39667f);
        throw protocolException;
    }
}
