package p8;

import h.C4540H;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class z implements y8.w {

    /* renamed from: A, reason: collision with root package name */
    public final x f39928A;

    /* renamed from: B, reason: collision with root package name */
    public final w f39929B;

    /* renamed from: C, reason: collision with root package name */
    public final y f39930C;

    /* renamed from: D, reason: collision with root package name */
    public final y f39931D;

    /* renamed from: E, reason: collision with root package name */
    public EnumC4856b f39932E;

    /* renamed from: F, reason: collision with root package name */
    public IOException f39933F;

    /* renamed from: n, reason: collision with root package name */
    public final int f39934n;

    /* renamed from: u, reason: collision with root package name */
    public final r f39935u;

    /* renamed from: v, reason: collision with root package name */
    public final C4540H f39936v;

    /* renamed from: w, reason: collision with root package name */
    public long f39937w;

    /* renamed from: x, reason: collision with root package name */
    public long f39938x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f39939y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39940z;

    public z(int i, r connection, boolean z3, boolean z6, i8.l lVar) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f39934n = i;
        this.f39935u = connection;
        this.f39936v = new C4540H(i);
        this.f39938x = connection.f39884K.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f39939y = arrayDeque;
        this.f39928A = new x(this, connection.J.a(), z6);
        this.f39929B = new w(this, z3);
        this.f39930C = new y(this);
        this.f39931D = new y(this);
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
        boolean z3;
        boolean j6;
        TimeZone timeZone = j8.d.f38483a;
        synchronized (this) {
            x xVar = this.f39928A;
            if (!xVar.f39922u && xVar.f39925x) {
                w wVar = this.f39929B;
                if (wVar.f39917n || wVar.f39919v) {
                    z3 = true;
                    j6 = j();
                }
            }
            z3 = false;
            j6 = j();
        }
        if (z3) {
            c(EnumC4856b.f39813A, null);
        } else {
            if (j6) {
                return;
            }
            this.f39935u.n(this.f39934n);
        }
    }

    public final void b() {
        w wVar = this.f39929B;
        if (wVar.f39919v) {
            throw new IOException("stream closed");
        }
        if (wVar.f39917n) {
            throw new IOException("stream finished");
        }
        if (h() != null) {
            IOException iOException = this.f39933F;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4856b h9 = h();
            kotlin.jvm.internal.h.b(h9);
            throw new E(h9);
        }
    }

    public final void c(EnumC4856b enumC4856b, IOException iOException) {
        if (f(enumC4856b, iOException)) {
            this.f39935u.f39889P.m(this.f39934n, enumC4856b);
        }
    }

    @Override // y8.w
    public final y8.x d() {
        return this.f39928A;
    }

    @Override // y8.w
    public final y8.v e() {
        return this.f39929B;
    }

    public final boolean f(EnumC4856b enumC4856b, IOException iOException) {
        TimeZone timeZone = j8.d.f38483a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.f39932E = enumC4856b;
            this.f39933F = iOException;
            notifyAll();
            if (this.f39928A.f39922u) {
                if (this.f39929B.f39917n) {
                    return false;
                }
            }
            this.f39935u.n(this.f39934n);
            return true;
        }
    }

    public final void g(EnumC4856b enumC4856b) {
        if (f(enumC4856b, null)) {
            this.f39935u.y(this.f39934n, enumC4856b);
        }
    }

    public final EnumC4856b h() {
        EnumC4856b enumC4856b;
        synchronized (this) {
            enumC4856b = this.f39932E;
        }
        return enumC4856b;
    }

    public final boolean i() {
        boolean z3 = (this.f39934n & 1) == 1;
        this.f39935u.getClass();
        return true == z3;
    }

    public final boolean j() {
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            x xVar = this.f39928A;
            if (xVar.f39922u || xVar.f39925x) {
                w wVar = this.f39929B;
                if (wVar.f39917n || wVar.f39919v) {
                    if (this.f39940z) {
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
    public final void k(i8.l headers, boolean z3) {
        boolean j6;
        kotlin.jvm.internal.h.e(headers, "headers");
        TimeZone timeZone = j8.d.f38483a;
        synchronized (this) {
            try {
                if (this.f39940z && headers.a(com.anythink.core.common.n.b.a.e.c.f15124b) == null && headers.a(com.anythink.core.common.n.b.a.e.c.f15125c) == null) {
                    this.f39928A.getClass();
                    if (z3) {
                        this.f39928A.f39922u = true;
                    }
                    j6 = j();
                    notifyAll();
                }
                this.f39940z = true;
                this.f39939y.add(headers);
                if (z3) {
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
        this.f39935u.n(this.f39934n);
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
