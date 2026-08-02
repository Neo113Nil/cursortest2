package p8;

import E2.M;
import h.I;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class r implements Closeable {

    /* renamed from: S, reason: collision with root package name */
    public static final D f39924S;

    /* renamed from: A, reason: collision with root package name */
    public final l8.c f39925A;

    /* renamed from: B, reason: collision with root package name */
    public final l8.c f39926B;

    /* renamed from: C, reason: collision with root package name */
    public final l8.c f39927C;

    /* renamed from: D, reason: collision with root package name */
    public final C f39928D;

    /* renamed from: E, reason: collision with root package name */
    public long f39929E;

    /* renamed from: F, reason: collision with root package name */
    public long f39930F;

    /* renamed from: G, reason: collision with root package name */
    public long f39931G;

    /* renamed from: H, reason: collision with root package name */
    public long f39932H;

    /* renamed from: I, reason: collision with root package name */
    public final C4857c f39933I;
    public final D J;

    /* renamed from: K, reason: collision with root package name */
    public D f39934K;

    /* renamed from: L, reason: collision with root package name */
    public final I f39935L;

    /* renamed from: M, reason: collision with root package name */
    public long f39936M;

    /* renamed from: N, reason: collision with root package name */
    public long f39937N;

    /* renamed from: O, reason: collision with root package name */
    public final l4.g f39938O;

    /* renamed from: P, reason: collision with root package name */
    public final A f39939P;

    /* renamed from: Q, reason: collision with root package name */
    public final q f39940Q;

    /* renamed from: R, reason: collision with root package name */
    public final LinkedHashSet f39941R;

    /* renamed from: n, reason: collision with root package name */
    public final n f39942n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f39943u = new LinkedHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final String f39944v;

    /* renamed from: w, reason: collision with root package name */
    public int f39945w;

    /* renamed from: x, reason: collision with root package name */
    public int f39946x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39947y;

    /* renamed from: z, reason: collision with root package name */
    public final l8.d f39948z;

    static {
        D d9 = new D();
        d9.c(4, 65535);
        d9.c(5, 16384);
        f39924S = d9;
    }

    public r(M m9) {
        this.f39942n = (n) m9.f764x;
        String str = (String) m9.f763w;
        if (str == null) {
            kotlin.jvm.internal.h.k("connectionName");
            throw null;
        }
        this.f39944v = str;
        this.f39946x = 3;
        l8.d dVar = (l8.d) m9.f761u;
        this.f39948z = dVar;
        this.f39925A = dVar.d();
        this.f39926B = dVar.d();
        this.f39927C = dVar.d();
        this.f39928D = C.f39859a;
        this.f39933I = (C4857c) m9.f765y;
        D d9 = new D();
        d9.c(4, com.anythink.basead.exoplayer.b.bc);
        this.J = d9;
        this.f39934K = f39924S;
        this.f39935L = new I(0);
        this.f39937N = r0.a();
        l4.g gVar = (l4.g) m9.f762v;
        if (gVar == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        this.f39938O = gVar;
        this.f39939P = new A((y8.p) gVar.f38918w);
        this.f39940Q = new q(this, new v((y8.r) gVar.f38917v));
        this.f39941R = new LinkedHashSet();
    }

    public final void a(EnumC4856b enumC4856b, EnumC4856b enumC4856b2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = j8.d.f38495a;
        try {
            p(enumC4856b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f39943u.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f39943u.values().toArray(new z[0]);
                this.f39943u.clear();
            }
        }
        z[] zVarArr = (z[]) objArr;
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.c(enumC4856b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f39939P.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((S0.n) this.f39938O.f38916u).f2931u).close();
        } catch (IOException unused4) {
        }
        this.f39925A.f();
        this.f39926B.f();
        this.f39927C.f();
    }

    public final z b(int i) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f39943u.get(Integer.valueOf(i));
        }
        return zVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC4856b.f39866v, EnumC4856b.f39863A, null);
    }

    public final void flush() {
        this.f39939P.flush();
    }

    public final z n(int i) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f39943u.remove(Integer.valueOf(i));
            notifyAll();
        }
        return zVar;
    }

    public final void p(EnumC4856b enumC4856b) {
        synchronized (this.f39939P) {
            synchronized (this) {
                if (this.f39947y) {
                    return;
                }
                this.f39947y = true;
                this.f39939P.j(this.f39945w, enumC4856b, j8.c.f38494a);
            }
        }
    }

    public final void w(long j6) {
        synchronized (this) {
            try {
                I.c(this.f39935L, j6, 0L, 2);
                long b9 = this.f39935L.b();
                if (b9 >= this.J.a() / 2) {
                    z(0, b9);
                    I.c(this.f39935L, 0L, b9, 1);
                }
                C4857c c4857c = this.f39933I;
                I windowCounter = this.f39935L;
                c4857c.getClass();
                kotlin.jvm.internal.h.e(windowCounter, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f39939P.f39853v);
        r6 = r2;
        r8.f39936M += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i, boolean z6, y8.e eVar, long j6) {
        int min;
        long j9;
        if (j6 == 0) {
            this.f39939P.b(z6, i, eVar, 0);
            return;
        }
        while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j10 = this.f39936M;
                            long j11 = this.f39937N;
                            if (j10 < j11) {
                                break;
                            } else {
                                if (!this.f39943u.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j6 -= j9;
            this.f39939P.b(z6 && j6 == 0, i, eVar, min);
        }
    }

    public final void y(final int i, final EnumC4856b enumC4856b) {
        l8.c.c(this.f39925A, this.f39944v + '[' + i + "] writeSynReset", new I7.a() { // from class: p8.j
            @Override // I7.a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f39939P.m(i, enumC4856b);
                } catch (IOException e9) {
                    rVar.getClass();
                    EnumC4856b enumC4856b2 = EnumC4856b.f39867w;
                    rVar.a(enumC4856b2, enumC4856b2, e9);
                }
                return u7.v.f41073a;
            }
        });
    }

    public final void z(final int i, final long j6) {
        l8.c.c(this.f39925A, this.f39944v + '[' + i + "] windowUpdate", new I7.a() { // from class: p8.i
            @Override // I7.a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f39939P.n(i, j6);
                } catch (IOException e9) {
                    rVar.getClass();
                    EnumC4856b enumC4856b = EnumC4856b.f39867w;
                    rVar.a(enumC4856b, enumC4856b, e9);
                }
                return u7.v.f41073a;
            }
        });
    }
}
