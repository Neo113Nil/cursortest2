package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class s8w implements db7 {
    public final so3 a;
    public final db7 b;
    public final o8s c;
    public final db7 d;
    public final vp3 e;
    public final q8w f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public Uri k;
    public nb7 l;
    public nb7 m;
    public db7 n;
    public long o;
    public long p;
    public long q;
    public jq3 r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public boolean w;

    public s8w(liq liqVar, db7 db7Var, db7 db7Var2, ta7 ta7Var, vp3 vp3Var, int i, q8w q8wVar) {
        this.a = liqVar;
        this.b = db7Var2;
        this.e = vp3Var == null ? vp3.R : vp3Var;
        this.g = (i & 1) != 0;
        this.h = (i & 2) != 0;
        this.i = (i & 4) != 0;
        this.j = (i & 8) != 0;
        if (db7Var != null) {
            this.d = db7Var;
            this.c = ta7Var != null ? new o8s(db7Var, ta7Var) : null;
        } else {
            this.d = qsk.a;
            this.c = null;
        }
        this.f = q8wVar;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        q8w q8wVar;
        so3 so3Var = this.a;
        try {
            String f = this.e.f(nb7Var);
            mb7 a = nb7Var.a();
            long j = nb7Var.g;
            long j2 = nb7Var.f;
            a.h = f;
            nb7 a2 = a.a();
            this.l = a2;
            Uri uri = a2.a;
            Uri b = qc6.b(so3Var.a(f));
            if (b != null) {
                uri = b;
            }
            this.k = uri;
            this.p = j2;
            int f2 = f(nb7Var);
            boolean z = f2 != -1;
            this.t = z;
            if (z && (q8wVar = this.f) != null) {
                q8wVar.a(f2);
            }
            if (this.t) {
                this.q = -1L;
            } else {
                long a3 = qc6.a(so3Var.a(f));
                this.q = a3;
                if (a3 != -1) {
                    long j3 = a3 - j2;
                    this.q = j3;
                    if (j3 < 0) {
                        throw new hb7(2008);
                    }
                }
            }
            if (j != -1) {
                long j4 = this.q;
                this.q = j4 == -1 ? j : Math.min(j4, j);
            }
            long j5 = this.q;
            if (j5 > 0 || j5 == -1) {
                d(a2, false);
            }
            return j != -1 ? j : this.q;
        } catch (Throwable th) {
            db7 db7Var = this.n;
            db7 db7Var2 = this.b;
            if (db7Var == db7Var2 || (th instanceof oo3)) {
                this.s = true;
            }
            if (this.j && !this.w && (db7Var == db7Var2 || (th instanceof oo3))) {
                this.w = true;
            }
            if (this.w) {
                return a(nb7Var);
            }
            throw th;
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        return !(this.n == this.b) ? this.d.b() : Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        so3 so3Var = this.a;
        db7 db7Var = this.n;
        if (db7Var == null) {
            return;
        }
        try {
            db7Var.close();
        } finally {
            this.m = null;
            this.n = null;
            jq3 jq3Var = this.r;
            if (jq3Var != null) {
                so3Var.b(jq3Var);
                this.r = null;
            }
        }
    }

    @Override // defpackage.db7
    public final void close() {
        this.l = null;
        this.k = null;
        this.p = 0L;
        if (this.f != null && this.u > 0) {
            this.a.d();
            this.u = 0L;
        }
        try {
            c();
        } catch (Throwable th) {
            if (this.n == this.b || (th instanceof oo3)) {
                this.s = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [db7] */
    /* JADX WARN: Type inference failed for: r6v0, types: [db7] */
    public final void d(nb7 nb7Var, boolean z) {
        jq3 f;
        o8s o8sVar;
        o8s o8sVar2;
        long j;
        nb7 a;
        o8s o8sVar3;
        String str = nb7Var.h;
        int i = dvt.a;
        boolean z2 = this.t;
        so3 so3Var = this.a;
        if (z2) {
            f = null;
        } else {
            long j2 = this.p;
            if (this.g) {
                try {
                    f = so3Var.f(j2, this.q, str);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                f = so3Var.g(j2, this.q, str);
            }
        }
        o8s o8sVar4 = this.c;
        ?? r5 = this.b;
        ?? r6 = this.d;
        if (f == null) {
            mb7 a2 = nb7Var.a();
            a2.f = this.p;
            a2.g = this.q;
            a = a2.a();
            o8sVar = o8sVar4;
            o8sVar2 = r5;
            o8sVar3 = r6;
            j = -1;
        } else {
            long j3 = f.c;
            if (f.d) {
                Uri fromFile = Uri.fromFile(f.e);
                long j4 = f.b;
                j = -1;
                long j5 = this.p - j4;
                long j6 = j3 - j5;
                o8sVar = o8sVar4;
                o8sVar2 = r5;
                long j7 = this.q;
                if (j7 != -1) {
                    j6 = Math.min(j6, j7);
                }
                mb7 a3 = nb7Var.a();
                a3.a = fromFile;
                a3.b = j4;
                a3.f = j5;
                a3.g = j6;
                a = a3.a();
                o8sVar3 = o8sVar2;
            } else {
                o8sVar = o8sVar4;
                o8sVar2 = r5;
                j = -1;
                long j8 = this.q;
                if (j3 == -1) {
                    j3 = j8;
                } else if (j8 != -1) {
                    j3 = Math.min(j3, j8);
                }
                mb7 a4 = nb7Var.a();
                a4.f = this.p;
                a4.g = j3;
                a = a4.a();
                if (o8sVar != null) {
                    o8sVar3 = o8sVar;
                } else {
                    so3Var.b(f);
                    o8sVar3 = r6;
                    f = null;
                }
            }
        }
        this.v = (this.t || o8sVar3 != r6) ? Long.MAX_VALUE : this.p + 102400;
        if (z) {
            vq1.A(this.n == r6);
            if (o8sVar3 == r6) {
                return;
            }
            try {
                c();
            } catch (Throwable th) {
                if (!f.d) {
                    so3Var.b(f);
                }
                throw th;
            }
        }
        if (f != null && !f.d) {
            this.r = f;
        }
        this.n = o8sVar3;
        this.m = a;
        this.o = 0L;
        long a5 = o8sVar3.a(a);
        rc6 rc6Var = new rc6(0);
        if (a.g == j && a5 != j) {
            this.q = a5;
            rc6Var.a(Long.valueOf(this.p + a5), "exo_len");
        }
        if (!(this.n == o8sVar2)) {
            Uri uri = o8sVar3.getUri();
            this.k = uri;
            rc6.d(rc6Var, !nb7Var.a.equals(uri) ? this.k : null);
        }
        if (this.n == o8sVar) {
            so3Var.l(str, rc6Var);
        }
    }

    public final int f(nb7 nb7Var) {
        Uri uri = nb7Var.a;
        boolean z = dvt.Q(uri) == 2;
        boolean z2 = dvt.Q(uri) == 0;
        if ((uri.toString().contains("/kal/") || uri.toString().contains("/live/")) && (z2 || z)) {
            return 2;
        }
        if (this.w && this.j) {
            return 3;
        }
        if (this.h && this.s) {
            return 0;
        }
        return (this.i && nb7Var.g == -1) ? 1 : -1;
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.k;
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.b.q(t6tVar);
        this.d.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        db7 db7Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.q == 0) {
            return -1;
        }
        nb7 nb7Var = this.l;
        nb7Var.getClass();
        nb7 nb7Var2 = this.m;
        nb7Var2.getClass();
        try {
            if (this.p >= this.v) {
                d(nb7Var, true);
            }
            db7 db7Var2 = this.n;
            db7Var2.getClass();
            int read = db7Var2.read(bArr, i, i2);
            db7 db7Var3 = this.n;
            if (read != -1) {
                if (db7Var3 == db7Var) {
                    this.u += read;
                }
                long j2 = read;
                this.p += j2;
                this.o += j2;
                long j3 = this.q;
                if (j3 == -1) {
                    return read;
                }
                this.q = j3 - j2;
                return read;
            }
            if (!(db7Var3 == db7Var)) {
                j = -1;
                long j4 = nb7Var2.g;
                if (j4 != -1) {
                    i3 = read;
                    if (this.o < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = nb7Var.h;
                int i4 = dvt.a;
                this.q = 0L;
                if (!(db7Var3 == this.c)) {
                    return i3;
                }
                rc6 rc6Var = new rc6(0);
                rc6Var.a(Long.valueOf(this.p), "exo_len");
                this.a.l(str, rc6Var);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.q;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            c();
            d(nb7Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.n == db7Var || (th instanceof oo3)) {
                this.s = true;
            }
            throw th;
        }
    }
}
