package P1;

import J1.m;
import J1.o;
import J1.s;
import N1.k;
import P.C0053b;
import W1.g;
import W1.q;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final o f1504d;

    /* renamed from: e, reason: collision with root package name */
    public long f1505e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N1.o f1507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(N1.o this$0, o url) {
        super(this$0);
        i.e(this$0, "this$0");
        i.e(url, "url");
        this.f1507g = this$0;
        this.f1504d = url;
        this.f1505e = -1L;
        this.f1506f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1499b) {
            return;
        }
        if (this.f1506f && !K1.b.h(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f1507g.f1227c).k();
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
        if (!this.f1506f) {
            return -1L;
        }
        long j3 = this.f1505e;
        N1.o oVar = this.f1507g;
        if (j3 == 0 || j3 == -1) {
            if (j3 != -1) {
                ((q) oVar.f1228d).o(Long.MAX_VALUE);
            }
            try {
                this.f1505e = ((q) oVar.f1228d).k();
                String obj = z1.g.k0(((q) oVar.f1228d).o(Long.MAX_VALUE)).toString();
                if (this.f1505e < 0 || (obj.length() > 0 && !z1.o.R(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1505e + obj + '\"');
                }
                if (this.f1505e == 0) {
                    this.f1506f = false;
                    oVar.f1231g = ((C0053b) oVar.f1230f).c();
                    s sVar = (s) oVar.f1226b;
                    i.b(sVar);
                    m mVar = (m) oVar.f1231g;
                    i.b(mVar);
                    O1.f.b(sVar.f948j, this.f1504d, mVar);
                    a();
                }
                if (!this.f1506f) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long e3 = super.e(sink, Math.min(8192L, this.f1505e));
        if (e3 != -1) {
            this.f1505e -= e3;
            return e3;
        }
        ((k) oVar.f1227c).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
