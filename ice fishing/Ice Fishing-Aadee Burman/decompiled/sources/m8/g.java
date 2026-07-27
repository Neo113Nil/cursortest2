package m8;

import com.google.android.gms.internal.ads.C3428jv;
import java.io.IOException;
import java.net.ProtocolException;
import y8.z;

/* loaded from: classes2.dex */
public final class g implements y8.v {

    /* renamed from: n, reason: collision with root package name */
    public final y8.v f39348n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39349u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39350v;

    /* renamed from: w, reason: collision with root package name */
    public long f39351w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39352x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39353y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C3428jv f39354z;

    public g(C3428jv c3428jv, y8.v delegate, long j6) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f39354z = c3428jv;
        this.f39348n = delegate;
        this.f39349u = j6;
        this.f39352x = c3428jv.f31345n;
    }

    @Override // y8.v
    public final z L() {
        return this.f39348n.L();
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39353y) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f39349u;
        if (j9 != -1 && this.f39351w + j6 > j9) {
            throw new ProtocolException("expected " + j9 + " bytes but received " + (this.f39351w + j6));
        }
        try {
            if (this.f39352x) {
                this.f39352x = false;
                C3428jv c3428jv = this.f39354z;
                c3428jv.getClass();
                q call = (q) c3428jv.f31347v;
                kotlin.jvm.internal.h.e(call, "call");
            }
            this.f39348n.T(j6, eVar);
            this.f39351w += j6;
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    public final void b() {
        this.f39348n.close();
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39353y) {
            return;
        }
        this.f39353y = true;
        long j6 = this.f39349u;
        if (j6 != -1 && this.f39351w != j6) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            i(null);
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
        try {
            j();
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    public final IOException i(IOException iOException) {
        if (this.f39350v) {
            return iOException;
        }
        this.f39350v = true;
        return C3428jv.a(this.f39354z, iOException, 2);
    }

    public final void j() {
        this.f39348n.flush();
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f39348n + ')';
    }
}
