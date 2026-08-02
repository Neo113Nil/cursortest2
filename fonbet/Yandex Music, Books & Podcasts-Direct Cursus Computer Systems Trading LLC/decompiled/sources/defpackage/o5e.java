package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o5e implements Closeable {
    public static final app z;
    public final i5e a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final m8s g;
    public final l8s h;
    public final l8s i;
    public final l8s j;
    public final b3i k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final app p;
    public app q;
    public long r;
    public long s;
    public long t;
    public long u;
    public final Socket v;
    public final y5e w;
    public final uv x;
    public final LinkedHashSet y;

    static {
        app appVar = new app();
        appVar.b(7, 65535);
        appVar.b(5, 16384);
        z = appVar;
    }

    public o5e(rdk rdkVar) {
        this.a = (i5e) rdkVar.g;
        String str = (String) rdkVar.b;
        if (str == null) {
            Intrinsics.j("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        m8s m8sVar = (m8s) rdkVar.c;
        this.g = m8sVar;
        this.h = m8sVar.e();
        this.i = m8sVar.e();
        this.j = m8sVar.e();
        this.k = b3i.i;
        app appVar = new app();
        appVar.b(7, 16777216);
        this.p = appVar;
        this.q = z;
        this.u = r0.a();
        Socket socket = (Socket) rdkVar.d;
        if (socket == null) {
            Intrinsics.j("socket");
            throw null;
        }
        this.v = socket;
        hkn hknVar = (hkn) rdkVar.f;
        if (hknVar == null) {
            Intrinsics.j("sink");
            throw null;
        }
        this.w = new y5e(hknVar);
        ikn iknVar = (ikn) rdkVar.e;
        if (iknVar == null) {
            Intrinsics.j("source");
            throw null;
        }
        this.x = new uv(this, new t5e(iknVar));
        this.y = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.w.c);
        r6 = r2;
        r8.t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i, boolean z2, hi3 hi3Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.w.b(z2, i, hi3Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.t;
                            long j4 = this.u;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
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
            j -= j2;
            this.w.b(z2 && j == 0, i, hi3Var, min);
        }
    }

    public final void H(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.h.c(new k5e(this.c + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void I(int i, long j) {
        this.h.c(new n5e(this.c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        byte[] bArr = cvt.a;
        try {
            o(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.b.isEmpty()) {
                objArr = this.b.values().toArray(new x5e[0]);
                this.b.clear();
            }
        }
        x5e[] x5eVarArr = (x5e[]) objArr;
        if (x5eVarArr != null) {
            for (x5e x5eVar : x5eVarArr) {
                try {
                    x5eVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.h.f();
        this.i.f();
        this.j.f();
    }

    public final synchronized x5e b(int i) {
        return (x5e) this.b.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized x5e g(int i) {
        x5e x5eVar;
        x5eVar = (x5e) this.b.remove(Integer.valueOf(i));
        notifyAll();
        return x5eVar;
    }

    public final void o(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.w) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.w.o(cvt.a, this.d, i);
            }
        }
    }

    public final synchronized void z(long j) {
        long j2 = this.r + j;
        this.r = j2;
        long j3 = j2 - this.s;
        if (j3 >= this.p.a() / 2) {
            I(0, j3);
            this.s += j3;
        }
    }
}
