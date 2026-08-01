package p8;

import C2.N;
import h.C4540H;
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
    public static final D f39877S;

    /* renamed from: A, reason: collision with root package name */
    public final l8.c f39878A;

    /* renamed from: B, reason: collision with root package name */
    public final l8.c f39879B;

    /* renamed from: C, reason: collision with root package name */
    public final l8.c f39880C;

    /* renamed from: D, reason: collision with root package name */
    public final C f39881D;

    /* renamed from: E, reason: collision with root package name */
    public long f39882E;

    /* renamed from: F, reason: collision with root package name */
    public long f39883F;

    /* renamed from: G, reason: collision with root package name */
    public long f39884G;

    /* renamed from: H, reason: collision with root package name */
    public long f39885H;

    /* renamed from: I, reason: collision with root package name */
    public final C4857c f39886I;
    public final D J;

    /* renamed from: K, reason: collision with root package name */
    public D f39887K;

    /* renamed from: L, reason: collision with root package name */
    public final C4540H f39888L;

    /* renamed from: M, reason: collision with root package name */
    public long f39889M;

    /* renamed from: N, reason: collision with root package name */
    public long f39890N;

    /* renamed from: O, reason: collision with root package name */
    public final j4.g f39891O;

    /* renamed from: P, reason: collision with root package name */
    public final A f39892P;

    /* renamed from: Q, reason: collision with root package name */
    public final q f39893Q;

    /* renamed from: R, reason: collision with root package name */
    public final LinkedHashSet f39894R;

    /* renamed from: n, reason: collision with root package name */
    public final n f39895n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f39896u = new LinkedHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final String f39897v;

    /* renamed from: w, reason: collision with root package name */
    public int f39898w;

    /* renamed from: x, reason: collision with root package name */
    public int f39899x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39900y;

    /* renamed from: z, reason: collision with root package name */
    public final l8.d f39901z;

    static {
        D d2 = new D();
        d2.c(4, 65535);
        d2.c(5, 16384);
        f39877S = d2;
    }

    public r(N n9) {
        this.f39895n = (n) n9.f304x;
        String str = (String) n9.f303w;
        if (str == null) {
            kotlin.jvm.internal.h.k("connectionName");
            throw null;
        }
        this.f39897v = str;
        this.f39899x = 3;
        l8.d dVar = (l8.d) n9.f301u;
        this.f39901z = dVar;
        this.f39878A = dVar.d();
        this.f39879B = dVar.d();
        this.f39880C = dVar.d();
        this.f39881D = C.f39812a;
        this.f39886I = (C4857c) n9.f305y;
        D d2 = new D();
        d2.c(4, com.anythink.basead.exoplayer.b.bc);
        this.J = d2;
        this.f39887K = f39877S;
        this.f39888L = new C4540H(0);
        this.f39890N = r0.a();
        j4.g gVar = (j4.g) n9.f302v;
        if (gVar == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        this.f39891O = gVar;
        this.f39892P = new A((y8.p) gVar.f38406w);
        this.f39893Q = new q(this, new v((y8.r) gVar.f38405v));
        this.f39894R = new LinkedHashSet();
    }

    public final void a(EnumC4856b enumC4856b, EnumC4856b enumC4856b2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = j8.d.f38483a;
        try {
            p(enumC4856b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f39896u.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f39896u.values().toArray(new z[0]);
                this.f39896u.clear();
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
            this.f39892P.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((S0.n) this.f39891O.f38404u).f2802u).close();
        } catch (IOException unused4) {
        }
        this.f39878A.f();
        this.f39879B.f();
        this.f39880C.f();
    }

    public final z b(int i) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f39896u.get(Integer.valueOf(i));
        }
        return zVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC4856b.f39819v, EnumC4856b.f39816A, null);
    }

    public final void flush() {
        this.f39892P.flush();
    }

    public final z n(int i) {
        z zVar;
        synchronized (this) {
            zVar = (z) this.f39896u.remove(Integer.valueOf(i));
            notifyAll();
        }
        return zVar;
    }

    public final void p(EnumC4856b enumC4856b) {
        synchronized (this.f39892P) {
            synchronized (this) {
                if (this.f39900y) {
                    return;
                }
                this.f39900y = true;
                this.f39892P.j(this.f39898w, enumC4856b, j8.c.f38482a);
            }
        }
    }

    public final void w(long j6) {
        synchronized (this) {
            try {
                C4540H.c(this.f39888L, j6, 0L, 2);
                long b9 = this.f39888L.b();
                if (b9 >= this.J.a() / 2) {
                    z(0, b9);
                    C4540H.c(this.f39888L, 0L, b9, 1);
                }
                C4857c c4857c = this.f39886I;
                C4540H windowCounter = this.f39888L;
                c4857c.getClass();
                kotlin.jvm.internal.h.e(windowCounter, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f39892P.f39806v);
        r6 = r2;
        r8.f39889M += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(int i, boolean z3, y8.e eVar, long j6) {
        int min;
        long j9;
        if (j6 == 0) {
            this.f39892P.b(z3, i, eVar, 0);
            return;
        }
        while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j10 = this.f39889M;
                            long j11 = this.f39890N;
                            if (j10 < j11) {
                                break;
                            } else {
                                if (!this.f39896u.containsKey(Integer.valueOf(i))) {
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
            this.f39892P.b(z3 && j6 == 0, i, eVar, min);
        }
    }

    public final void y(final int i, final EnumC4856b enumC4856b) {
        l8.c.c(this.f39878A, this.f39897v + '[' + i + "] writeSynReset", new I7.a() { // from class: p8.j
            @Override // I7.a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f39892P.m(i, enumC4856b);
                } catch (IOException e9) {
                    rVar.getClass();
                    EnumC4856b enumC4856b2 = EnumC4856b.f39820w;
                    rVar.a(enumC4856b2, enumC4856b2, e9);
                }
                return u7.v.f41353a;
            }
        });
    }

    public final void z(final int i, final long j6) {
        l8.c.c(this.f39878A, this.f39897v + '[' + i + "] windowUpdate", new I7.a() { // from class: p8.i
            @Override // I7.a
            public final Object invoke() {
                r rVar = r.this;
                try {
                    rVar.f39892P.n(i, j6);
                } catch (IOException e9) {
                    rVar.getClass();
                    EnumC4856b enumC4856b = EnumC4856b.f39820w;
                    rVar.a(enumC4856b, enumC4856b, e9);
                }
                return u7.v.f41353a;
            }
        });
    }
}
