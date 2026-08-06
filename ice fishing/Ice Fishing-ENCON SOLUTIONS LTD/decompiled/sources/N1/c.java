package N1;

import W1.u;
import W1.y;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final u f1154a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1155b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1156c;

    /* renamed from: d, reason: collision with root package name */
    public long f1157d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1159f;

    public c(e this$0, u delegate, long j2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1159f = this$0;
        this.f1154a = delegate;
        this.f1155b = j2;
    }

    public final void a() {
        this.f1154a.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f1156c) {
            return iOException;
        }
        this.f1156c = true;
        return this.f1159f.a(false, true, iOException);
    }

    public final void c() {
        this.f1154a.flush();
    }

    @Override // W1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1158e) {
            return;
        }
        this.f1158e = true;
        long j2 = this.f1155b;
        if (j2 != -1 && this.f1157d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e2) {
            throw b(e2);
        }
    }

    @Override // W1.u
    public final y d() {
        return this.f1154a.d();
    }

    @Override // W1.u, java.io.Flushable
    public final void flush() {
        try {
            c();
        } catch (IOException e2) {
            throw b(e2);
        }
    }

    @Override // W1.u
    public final void h(W1.g gVar, long j2) {
        if (this.f1158e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f1155b;
        if (j3 == -1 || this.f1157d + j2 <= j3) {
            try {
                this.f1154a.h(gVar, j2);
                this.f1157d += j2;
                return;
            } catch (IOException e2) {
                throw b(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.f1157d + j2));
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f1154a + ')';
    }
}
