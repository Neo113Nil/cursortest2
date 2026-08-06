package N1;

import W1.w;
import W1.y;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f1160a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1161b;

    /* renamed from: c, reason: collision with root package name */
    public long f1162c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1163d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1164e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1166g;

    public d(e this$0, w delegate, long j2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1166g = this$0;
        this.f1160a = delegate;
        this.f1161b = j2;
        this.f1163d = true;
        if (j2 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f1160a.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f1164e) {
            return iOException;
        }
        this.f1164e = true;
        e eVar = this.f1166g;
        if (iOException == null && this.f1163d) {
            this.f1163d = false;
            eVar.getClass();
            i call = (i) eVar.f1168b;
            kotlin.jvm.internal.i.e(call, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1165f) {
            return;
        }
        this.f1165f = true;
        try {
            a();
            b(null);
        } catch (IOException e2) {
            throw b(e2);
        }
    }

    @Override // W1.w
    public final y d() {
        return this.f1160a.d();
    }

    @Override // W1.w
    public final long e(W1.g sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f1165f) {
            throw new IllegalStateException("closed");
        }
        try {
            long e2 = this.f1160a.e(sink, 8192L);
            if (this.f1163d) {
                this.f1163d = false;
                e eVar = this.f1166g;
                eVar.getClass();
                i call = (i) eVar.f1168b;
                kotlin.jvm.internal.i.e(call, "call");
            }
            if (e2 == -1) {
                b(null);
                return -1L;
            }
            long j3 = this.f1162c + e2;
            long j4 = this.f1161b;
            if (j4 == -1 || j3 <= j4) {
                this.f1162c = j3;
                if (j3 == j4) {
                    b(null);
                }
                return e2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f1160a + ')';
    }
}
