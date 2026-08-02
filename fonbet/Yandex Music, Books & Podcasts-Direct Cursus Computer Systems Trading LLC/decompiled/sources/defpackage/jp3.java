package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class jp3 implements db7 {
    public final so3 a;
    public final db7 b;
    public final o8s c;
    public final db7 d;
    public final vp3 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public nb7 j;
    public nb7 k;
    public db7 l;
    public long m;
    public long n;
    public long o;
    public jq3 p;
    public boolean q;
    public boolean r;
    public long s;

    public jp3(so3 so3Var, db7 db7Var, db7 db7Var2, ta7 ta7Var, vp3 vp3Var, int i, ssm ssmVar, int i2) {
        this.a = so3Var;
        this.b = db7Var2;
        this.e = vp3Var == null ? vp3.R : vp3Var;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        if (db7Var == null) {
            this.d = qsk.a;
            this.c = null;
        } else {
            db7Var = ssmVar != null ? new osm(db7Var, ssmVar, i2) : db7Var;
            this.d = db7Var;
            this.c = ta7Var != null ? new o8s(db7Var, ta7Var) : null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x006e, B:20:0x007a, B:21:0x0076, B:22:0x007c, B:29:0x008c, B:31:0x0086, B:32:0x004c, B:34:0x005a, B:37:0x0062, B:38:0x0069, B:39:0x0036), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x006e, B:20:0x007a, B:21:0x0076, B:22:0x007c, B:29:0x008c, B:31:0x0086, B:32:0x004c, B:34:0x005a, B:37:0x0062, B:38:0x0069, B:39:0x0036), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x006e, B:20:0x007a, B:21:0x0076, B:22:0x007c, B:29:0x008c, B:31:0x0086, B:32:0x004c, B:34:0x005a, B:37:0x0062, B:38:0x0069, B:39:0x0036), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x006e, B:20:0x007a, B:21:0x0076, B:22:0x007c, B:29:0x008c, B:31:0x0086, B:32:0x004c, B:34:0x005a, B:37:0x0062, B:38:0x0069, B:39:0x0036), top: B:2:0x0003 }] */
    @Override // defpackage.db7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(nb7 nb7Var) {
        boolean z;
        long j;
        so3 so3Var = this.a;
        try {
            String f = this.e.f(nb7Var);
            mb7 a = nb7Var.a();
            long j2 = nb7Var.f;
            long j3 = nb7Var.g;
            a.h = f;
            nb7 a2 = a.a();
            this.j = a2;
            Uri uri = a2.a;
            Uri b = qc6.b(so3Var.a(f));
            if (b != null) {
                uri = b;
            }
            this.i = uri;
            this.n = j2;
            if ((!this.g || !this.q) && (!this.h || j3 != -1)) {
                z = false;
                this.r = z;
                if (z) {
                    long a3 = qc6.a(so3Var.a(f));
                    this.o = a3;
                    if (a3 != -1) {
                        long j4 = a3 - j2;
                        this.o = j4;
                        if (j4 < 0) {
                            throw new hb7(2008);
                        }
                    }
                } else {
                    this.o = -1L;
                }
                if (j3 != -1) {
                    long j5 = this.o;
                    this.o = j5 == -1 ? j3 : Math.min(j5, j3);
                }
                j = this.o;
                if (j <= 0 || j == -1) {
                    d(a2, false);
                }
                return j3 == -1 ? j3 : this.o;
            }
            z = true;
            this.r = z;
            if (z) {
            }
            if (j3 != -1) {
            }
            j = this.o;
            if (j <= 0) {
            }
            d(a2, false);
            if (j3 == -1) {
            }
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof oo3)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        return !(this.l == this.b) ? this.d.b() : Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        so3 so3Var = this.a;
        db7 db7Var = this.l;
        if (db7Var == null) {
            return;
        }
        try {
            db7Var.close();
        } finally {
            this.k = null;
            this.l = null;
            jq3 jq3Var = this.p;
            if (jq3Var != null) {
                so3Var.b(jq3Var);
                this.p = null;
            }
        }
    }

    @Override // defpackage.db7
    public final void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            c();
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof oo3)) {
                this.q = true;
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
        boolean z2 = this.r;
        so3 so3Var = this.a;
        if (z2) {
            f = null;
        } else {
            long j2 = this.n;
            if (this.f) {
                try {
                    f = so3Var.f(j2, this.o, str);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                f = so3Var.g(j2, this.o, str);
            }
        }
        o8s o8sVar4 = this.c;
        ?? r5 = this.b;
        ?? r6 = this.d;
        if (f == null) {
            mb7 a2 = nb7Var.a();
            a2.f = this.n;
            a2.g = this.o;
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
                long j5 = this.n - j4;
                long j6 = j3 - j5;
                o8sVar = o8sVar4;
                o8sVar2 = r5;
                long j7 = this.o;
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
                long j8 = this.o;
                if (j3 == -1) {
                    j3 = j8;
                } else if (j8 != -1) {
                    j3 = Math.min(j3, j8);
                }
                mb7 a4 = nb7Var.a();
                a4.f = this.n;
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
        this.s = (this.r || o8sVar3 != r6) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            vq1.A(this.l == r6);
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
            this.p = f;
        }
        this.l = o8sVar3;
        this.k = a;
        this.m = 0L;
        long a5 = o8sVar3.a(a);
        rc6 rc6Var = new rc6(0);
        if (a.g == j && a5 != j) {
            this.o = a5;
            rc6Var.a(Long.valueOf(this.n + a5), "exo_len");
        }
        if (!(this.l == o8sVar2)) {
            Uri uri = o8sVar3.getUri();
            this.i = uri;
            rc6.d(rc6Var, !nb7Var.a.equals(uri) ? this.i : null);
        }
        if (this.l == o8sVar) {
            so3Var.l(str, rc6Var);
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.i;
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
        if (this.o == 0) {
            return -1;
        }
        nb7 nb7Var = this.j;
        nb7Var.getClass();
        nb7 nb7Var2 = this.k;
        nb7Var2.getClass();
        try {
            if (this.n >= this.s) {
                d(nb7Var, true);
            }
            db7 db7Var2 = this.l;
            db7Var2.getClass();
            int read = db7Var2.read(bArr, i, i2);
            db7 db7Var3 = this.l;
            if (read != -1) {
                long j2 = read;
                this.n += j2;
                this.m += j2;
                long j3 = this.o;
                if (j3 == -1) {
                    return read;
                }
                this.o = j3 - j2;
                return read;
            }
            if (!(db7Var3 == db7Var)) {
                j = -1;
                long j4 = nb7Var2.g;
                if (j4 != -1) {
                    i3 = read;
                    if (this.m < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = nb7Var.h;
                int i4 = dvt.a;
                this.o = 0L;
                if (!(db7Var3 == this.c)) {
                    return i3;
                }
                rc6 rc6Var = new rc6(0);
                rc6Var.a(Long.valueOf(this.n), "exo_len");
                this.a.l(str, rc6Var);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.o;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            c();
            d(nb7Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == db7Var || (th instanceof oo3)) {
                this.q = true;
            }
            throw th;
        }
    }
}
