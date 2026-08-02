package m8;

import com.google.android.gms.internal.ads.C3451jv;
import java.io.IOException;
import java.net.ProtocolException;
import y8.z;

/* loaded from: classes2.dex */
public final class h implements y8.x {

    /* renamed from: n, reason: collision with root package name */
    public final y8.x f39514n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39515u;

    /* renamed from: v, reason: collision with root package name */
    public long f39516v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39517w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39518x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39519y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C3451jv f39520z;

    public h(C3451jv c3451jv, y8.x delegate, long j6) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f39520z = c3451jv;
        this.f39514n = delegate;
        this.f39515u = j6;
        this.f39517w = true;
        if (j6 == 0) {
            i(null);
        }
    }

    @Override // y8.x
    public final z L() {
        return this.f39514n.L();
    }

    public final void b() {
        this.f39514n.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39519y) {
            return;
        }
        this.f39519y = true;
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
        if (this.f39519y) {
            throw new IllegalStateException("closed");
        }
        try {
            long d9 = this.f39514n.d(8192L, sink);
            boolean z6 = this.f39517w;
            C3451jv c3451jv = this.f39520z;
            if (z6) {
                this.f39517w = false;
                c3451jv.getClass();
                p call = (p) c3451jv.f32126v;
                kotlin.jvm.internal.h.e(call, "call");
            }
            if (d9 == -1) {
                i(null);
                return -1L;
            }
            long j9 = this.f39516v + d9;
            long j10 = this.f39515u;
            if (j10 == -1 || j9 <= j10) {
                this.f39516v = j9;
                if (((n8.f) c3451jv.f32128x).c()) {
                    i(null);
                }
                return d9;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j9);
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    public final IOException i(IOException iOException) {
        if (this.f39518x) {
            return iOException;
        }
        this.f39518x = true;
        C3451jv c3451jv = this.f39520z;
        if (iOException == null && this.f39517w) {
            this.f39517w = false;
            c3451jv.getClass();
            p call = (p) c3451jv.f32126v;
            kotlin.jvm.internal.h.e(call, "call");
        }
        return C3451jv.a(c3451jv, iOException, 4);
    }

    public final String toString() {
        return h.class.getSimpleName() + '(' + this.f39514n + ')';
    }
}
