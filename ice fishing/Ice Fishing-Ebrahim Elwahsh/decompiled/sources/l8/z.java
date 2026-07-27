package l8;

import h.I;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class z implements u8.w {

    /* renamed from: A, reason: collision with root package name */
    public final x f39211A;

    /* renamed from: B, reason: collision with root package name */
    public final w f39212B;

    /* renamed from: C, reason: collision with root package name */
    public final y f39213C;

    /* renamed from: D, reason: collision with root package name */
    public final y f39214D;

    /* renamed from: E, reason: collision with root package name */
    public EnumC4710b f39215E;

    /* renamed from: F, reason: collision with root package name */
    public IOException f39216F;

    /* renamed from: n, reason: collision with root package name */
    public final int f39217n;

    /* renamed from: u, reason: collision with root package name */
    public final r f39218u;

    /* renamed from: v, reason: collision with root package name */
    public final I f39219v;

    /* renamed from: w, reason: collision with root package name */
    public long f39220w;

    /* renamed from: x, reason: collision with root package name */
    public long f39221x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f39222y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39223z;

    public z(int i, r connection, boolean z8, boolean z9, e8.m mVar) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f39217n = i;
        this.f39218u = connection;
        this.f39219v = new I(i);
        this.f39221x = connection.f39167K.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f39222y = arrayDeque;
        this.f39211A = new x(this, connection.J.a(), z9);
        this.f39212B = new w(this, z8);
        this.f39213C = new y(this);
        this.f39214D = new y(this);
        if (mVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    public final void a() {
        boolean z8;
        boolean i;
        TimeZone timeZone = f8.d.f37815a;
        synchronized (this) {
            x xVar = this.f39211A;
            if (!xVar.f39205u && xVar.f39208x) {
                w wVar = this.f39212B;
                if (wVar.f39200n || wVar.f39202v) {
                    z8 = true;
                    i = i();
                }
            }
            z8 = false;
            i = i();
        }
        if (z8) {
            d(EnumC4710b.f39096A, null);
        } else {
            if (i) {
                return;
            }
            this.f39218u.g(this.f39217n);
        }
    }

    public final void b() {
        w wVar = this.f39212B;
        if (wVar.f39202v) {
            throw new IOException("stream closed");
        }
        if (wVar.f39200n) {
            throw new IOException("stream finished");
        }
        if (g() != null) {
            IOException iOException = this.f39216F;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4710b g9 = g();
            kotlin.jvm.internal.h.b(g9);
            throw new E(g9);
        }
    }

    @Override // u8.w
    public final u8.x c() {
        return this.f39211A;
    }

    public final void d(EnumC4710b enumC4710b, IOException iOException) {
        if (e(enumC4710b, iOException)) {
            this.f39218u.f39172P.m(this.f39217n, enumC4710b);
        }
    }

    public final boolean e(EnumC4710b enumC4710b, IOException iOException) {
        TimeZone timeZone = f8.d.f37815a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.f39215E = enumC4710b;
            this.f39216F = iOException;
            notifyAll();
            if (this.f39211A.f39205u) {
                if (this.f39212B.f39200n) {
                    return false;
                }
            }
            this.f39218u.g(this.f39217n);
            return true;
        }
    }

    public final void f(EnumC4710b enumC4710b) {
        if (e(enumC4710b, null)) {
            this.f39218u.m(this.f39217n, enumC4710b);
        }
    }

    public final EnumC4710b g() {
        EnumC4710b enumC4710b;
        synchronized (this) {
            enumC4710b = this.f39215E;
        }
        return enumC4710b;
    }

    public final boolean h() {
        boolean z8 = (this.f39217n & 1) == 1;
        this.f39218u.getClass();
        return true == z8;
    }

    public final boolean i() {
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            x xVar = this.f39211A;
            if (xVar.f39205u || xVar.f39208x) {
                w wVar = this.f39212B;
                if (wVar.f39200n || wVar.f39202v) {
                    if (this.f39223z) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    @Override // u8.w
    public final u8.v j() {
        return this.f39212B;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e8.m headers, boolean z8) {
        boolean i;
        kotlin.jvm.internal.h.e(headers, "headers");
        TimeZone timeZone = f8.d.f37815a;
        synchronized (this) {
            try {
                if (this.f39223z && headers.a(com.anythink.core.common.n.b.a.e.c.f15282b) == null && headers.a(com.anythink.core.common.n.b.a.e.c.f15283c) == null) {
                    this.f39211A.getClass();
                    if (z8) {
                        this.f39211A.f39205u = true;
                    }
                    i = i();
                    notifyAll();
                }
                this.f39223z = true;
                this.f39222y.add(headers);
                if (z8) {
                }
                i = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i) {
            return;
        }
        this.f39218u.g(this.f39217n);
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
