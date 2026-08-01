package m8;

import com.google.android.gms.internal.ads.C3428jv;
import java.io.IOException;
import java.net.ProtocolException;
import y8.z;

/* loaded from: classes2.dex */
public final class h implements y8.x {

    /* renamed from: n, reason: collision with root package name */
    public final y8.x f39355n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39356u;

    /* renamed from: v, reason: collision with root package name */
    public long f39357v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39358w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39359x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39360y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C3428jv f39361z;

    public h(C3428jv c3428jv, y8.x delegate, long j6) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f39361z = c3428jv;
        this.f39355n = delegate;
        this.f39356u = j6;
        this.f39358w = true;
        if (j6 == 0) {
            i(null);
        }
    }

    @Override // y8.x
    public final z L() {
        return this.f39355n.L();
    }

    public final void b() {
        this.f39355n.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39360y) {
            return;
        }
        this.f39360y = true;
        try {
            b();
            i(null);
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    @Override // y8.x
    public final long d(long j6, y8.e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (this.f39360y) {
            throw new IllegalStateException("closed");
        }
        try {
            long d2 = this.f39355n.d(8192L, sink);
            boolean z3 = this.f39358w;
            C3428jv c3428jv = this.f39361z;
            if (z3) {
                this.f39358w = false;
                c3428jv.getClass();
                q call = (q) c3428jv.f31347v;
                kotlin.jvm.internal.h.e(call, "call");
            }
            if (d2 == -1) {
                i(null);
                return -1L;
            }
            long j9 = this.f39357v + d2;
            long j10 = this.f39356u;
            if (j10 == -1 || j9 <= j10) {
                this.f39357v = j9;
                if (((n8.f) c3428jv.f31349x).b()) {
                    i(null);
                }
                return d2;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j9);
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    public final IOException i(IOException iOException) {
        if (this.f39359x) {
            return iOException;
        }
        this.f39359x = true;
        C3428jv c3428jv = this.f39361z;
        if (iOException == null && this.f39358w) {
            this.f39358w = false;
            c3428jv.getClass();
            q call = (q) c3428jv.f31347v;
            kotlin.jvm.internal.h.e(call, "call");
        }
        return C3428jv.a(c3428jv, iOException, 4);
    }

    public final String toString() {
        return h.class.getSimpleName() + '(' + this.f39355n + ')';
    }
}
