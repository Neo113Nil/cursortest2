package m8;

import com.google.android.gms.internal.ads.C3451jv;
import java.io.IOException;
import java.net.ProtocolException;
import y8.z;

/* loaded from: classes2.dex */
public final class g implements y8.v {

    /* renamed from: n, reason: collision with root package name */
    public final y8.v f39507n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39508u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39509v;

    /* renamed from: w, reason: collision with root package name */
    public long f39510w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39511x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39512y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C3451jv f39513z;

    public g(C3451jv c3451jv, y8.v delegate, long j6) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f39513z = c3451jv;
        this.f39507n = delegate;
        this.f39508u = j6;
        this.f39511x = c3451jv.f32124n;
    }

    @Override // y8.v
    public final z L() {
        return this.f39507n.L();
    }

    @Override // y8.v
    public final void T(long j6, y8.e eVar) {
        if (this.f39512y) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f39508u;
        if (j9 != -1 && this.f39510w + j6 > j9) {
            throw new ProtocolException("expected " + j9 + " bytes but received " + (this.f39510w + j6));
        }
        try {
            if (this.f39511x) {
                this.f39511x = false;
                C3451jv c3451jv = this.f39513z;
                c3451jv.getClass();
                p call = (p) c3451jv.f32126v;
                kotlin.jvm.internal.h.e(call, "call");
            }
            this.f39507n.T(j6, eVar);
            this.f39510w += j6;
        } catch (IOException e9) {
            IOException i = i(e9);
            kotlin.jvm.internal.h.b(i);
            throw i;
        }
    }

    public final void b() {
        this.f39507n.close();
    }

    @Override // y8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39512y) {
            return;
        }
        this.f39512y = true;
        long j6 = this.f39508u;
        if (j6 != -1 && this.f39510w != j6) {
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
        if (this.f39509v) {
            return iOException;
        }
        this.f39509v = true;
        return C3451jv.a(this.f39513z, iOException, 2);
    }

    public final void j() {
        this.f39507n.flush();
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f39507n + ')';
    }
}
