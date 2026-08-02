package p8;

import h.I;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class z implements y8.w {

    /* renamed from: A, reason: collision with root package name */
    public final x f39978A;

    /* renamed from: B, reason: collision with root package name */
    public final w f39979B;

    /* renamed from: C, reason: collision with root package name */
    public final y f39980C;

    /* renamed from: D, reason: collision with root package name */
    public final y f39981D;

    /* renamed from: E, reason: collision with root package name */
    public EnumC4856b f39982E;

    /* renamed from: F, reason: collision with root package name */
    public IOException f39983F;

    /* renamed from: n, reason: collision with root package name */
    public final int f39984n;

    /* renamed from: u, reason: collision with root package name */
    public final r f39985u;

    /* renamed from: v, reason: collision with root package name */
    public final I f39986v;

    /* renamed from: w, reason: collision with root package name */
    public long f39987w;

    /* renamed from: x, reason: collision with root package name */
    public long f39988x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f39989y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39990z;

    public z(int i, r connection, boolean z6, boolean z9, i8.l lVar) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f39984n = i;
        this.f39985u = connection;
        this.f39986v = new I(i);
        this.f39988x = connection.f39934K.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f39989y = arrayDeque;
        this.f39978A = new x(this, connection.J.a(), z9);
        this.f39979B = new w(this, z6);
        this.f39980C = new y(this);
        this.f39981D = new y(this);
        if (lVar == null) {
            if (!i()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (i()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    public final void a() {
        boolean z6;
        boolean j6;
        TimeZone timeZone = j8.d.f38495a;
        synchronized (this) {
            x xVar = this.f39978A;
            if (!xVar.f39972u && xVar.f39975x) {
                w wVar = this.f39979B;
                if (wVar.f39967n || wVar.f39969v) {
                    z6 = true;
                    j6 = j();
                }
            }
            z6 = false;
            j6 = j();
        }
        if (z6) {
            c(EnumC4856b.f39863A, null);
        } else {
            if (j6) {
                return;
            }
            this.f39985u.n(this.f39984n);
        }
    }

    public final void b() {
        w wVar = this.f39979B;
        if (wVar.f39969v) {
            throw new IOException("stream closed");
        }
        if (wVar.f39967n) {
            throw new IOException("stream finished");
        }
        if (h() != null) {
            IOException iOException = this.f39983F;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4856b h3 = h();
            kotlin.jvm.internal.h.b(h3);
            throw new E(h3);
        }
    }

    public final void c(EnumC4856b enumC4856b, IOException iOException) {
        if (e(enumC4856b, iOException)) {
            this.f39985u.f39939P.m(this.f39984n, enumC4856b);
        }
    }

    @Override // y8.w
    public final y8.x d() {
        return this.f39978A;
    }

    public final boolean e(EnumC4856b enumC4856b, IOException iOException) {
        TimeZone timeZone = j8.d.f38495a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.f39982E = enumC4856b;
            this.f39983F = iOException;
            notifyAll();
            if (this.f39978A.f39972u) {
                if (this.f39979B.f39967n) {
                    return false;
                }
            }
            this.f39985u.n(this.f39984n);
            return true;
        }
    }

    public final void f(EnumC4856b enumC4856b) {
        if (e(enumC4856b, null)) {
            this.f39985u.y(this.f39984n, enumC4856b);
        }
    }

    @Override // y8.w
    public final y8.v g() {
        return this.f39979B;
    }

    public final EnumC4856b h() {
        EnumC4856b enumC4856b;
        synchronized (this) {
            enumC4856b = this.f39982E;
        }
        return enumC4856b;
    }

    public final boolean i() {
        boolean z6 = (this.f39984n & 1) == 1;
        this.f39985u.getClass();
        return true == z6;
    }

    public final boolean j() {
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            x xVar = this.f39978A;
            if (xVar.f39972u || xVar.f39975x) {
                w wVar = this.f39979B;
                if (wVar.f39967n || wVar.f39969v) {
                    if (this.f39990z) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(i8.l headers, boolean z6) {
        boolean j6;
        kotlin.jvm.internal.h.e(headers, "headers");
        TimeZone timeZone = j8.d.f38495a;
        synchronized (this) {
            try {
                if (this.f39990z && headers.a(com.anythink.core.common.n.b.a.e.c.f15911b) == null && headers.a(com.anythink.core.common.n.b.a.e.c.f15912c) == null) {
                    this.f39978A.getClass();
                    if (z6) {
                        this.f39978A.f39972u = true;
                    }
                    j6 = j();
                    notifyAll();
                }
                this.f39990z = true;
                this.f39989y.add(headers);
                if (z6) {
                }
                j6 = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j6) {
            return;
        }
        this.f39985u.n(this.f39984n);
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
