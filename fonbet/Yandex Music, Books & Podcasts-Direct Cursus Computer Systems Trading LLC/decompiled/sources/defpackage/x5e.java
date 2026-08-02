package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes5.dex */
public final class x5e {
    public final int a;
    public final o5e b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final v5e i;
    public final u5e j;
    public final w5e k;
    public final w5e l;
    public int m;
    public IOException n;

    public x5e(int i, o5e o5eVar, boolean z, boolean z2, zvd zvdVar) {
        o5eVar.getClass();
        this.a = i;
        this.b = o5eVar;
        this.f = o5eVar.q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new v5e(this, o5eVar.p.a(), z2);
        this.j = new u5e(this, z);
        this.k = new w5e(this);
        this.l = new w5e(this);
        if (zvdVar == null) {
            if (g()) {
                return;
            }
            xq0.q("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            xq0.q("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(zvdVar);
    }

    public final void a() {
        boolean z;
        boolean h;
        byte[] bArr = cvt.a;
        synchronized (this) {
            try {
                v5e v5eVar = this.i;
                if (!v5eVar.b && v5eVar.e) {
                    u5e u5eVar = this.j;
                    if (!u5eVar.a) {
                        if (u5eVar.c) {
                        }
                    }
                    z = true;
                    h = h();
                }
                z = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (h) {
                return;
            }
            this.b.g(this.a);
        }
    }

    public final void b() {
        u5e u5eVar = this.j;
        if (u5eVar.c) {
            kac.f("stream closed");
            return;
        }
        if (u5eVar.a) {
            kac.f("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new sjr(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            o5e o5eVar = this.b;
            if (i != 0) {
                o5eVar.w.H(this.a, i);
            } else {
                o5eVar.getClass();
                throw null;
            }
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = cvt.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.b) {
                if (this.j.a) {
                    return false;
                }
            }
            this.b.g(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.H(this.a, i);
        }
    }

    public final u5e f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            v5e v5eVar = this.i;
            if (!v5eVar.b) {
                if (v5eVar.e) {
                }
                return true;
            }
            u5e u5eVar = this.j;
            if (u5eVar.a || u5eVar.c) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:8:0x000e, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(zvd zvdVar, boolean z) {
        boolean h;
        zvdVar.getClass();
        byte[] bArr = cvt.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.b = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.g.add(zvdVar);
                if (z) {
                }
                h = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h) {
            return;
        }
        this.b.g(this.a);
    }
}
