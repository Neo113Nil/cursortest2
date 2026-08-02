package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class rvm implements jgg {
    public final Uri a;
    public final ngr b;
    public final nsh c;
    public final uvm d;
    public final n20 e;
    public volatile boolean g;
    public long i;
    public nb7 j;
    public azs k;
    public boolean l;
    public final /* synthetic */ uvm m;
    public final ci0 f = new ci0();
    public boolean h = true;

    public rvm(uvm uvmVar, Uri uri, db7 db7Var, nsh nshVar, uvm uvmVar2, n20 n20Var) {
        this.m = uvmVar;
        this.a = uri;
        this.b = new ngr(db7Var);
        this.c = nshVar;
        this.d = uvmVar2;
        this.e = n20Var;
        cfg.f.getAndIncrement();
        this.j = b(0L);
    }

    @Override // defpackage.jgg
    public final void a() {
        db7 db7Var;
        r2c r2cVar;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.g) {
            try {
                long j = this.f.a;
                nb7 b = b(j);
                this.j = b;
                long a = this.b.a(b);
                if (this.g) {
                    if (i2 != 1 && this.c.v() != -1) {
                        this.f.a = this.c.v();
                    }
                    hld.x(this.b);
                    return;
                }
                if (a != -1) {
                    a += j;
                    uvm uvmVar = this.m;
                    uvmVar.r.post(new pvm(uvmVar, 0));
                }
                long j2 = a;
                this.m.t = lae.a(this.b.a.b());
                ngr ngrVar = this.b;
                lae laeVar = this.m.t;
                if (laeVar == null || (i = laeVar.f) == -1) {
                    db7Var = ngrVar;
                } else {
                    db7Var = new jae(ngrVar, i, this);
                    azs A = this.m.A(new tvm(0, true));
                    this.k = A;
                    A.d(uvm.x0);
                }
                this.c.C(db7Var, this.a, this.b.a.b(), j, j2, this.d);
                if (this.m.t != null && (r2cVar = (r2c) this.c.c) != null && (r2cVar instanceof sfi)) {
                    ((sfi) r2cVar).r = true;
                }
                if (this.h) {
                    nsh nshVar = this.c;
                    long j3 = this.i;
                    r2c r2cVar2 = (r2c) nshVar.c;
                    r2cVar2.getClass();
                    r2cVar2.b(j, j3);
                    this.h = false;
                }
                while (i2 == 0 && !this.g) {
                    try {
                        this.e.b();
                        nsh nshVar2 = this.c;
                        ci0 ci0Var = this.f;
                        r2c r2cVar3 = (r2c) nshVar2.c;
                        r2cVar3.getClass();
                        gm7 gm7Var = (gm7) nshVar2.d;
                        gm7Var.getClass();
                        i2 = r2cVar3.h(gm7Var, ci0Var);
                        long v = this.c.v();
                        if (v > this.m.j + j) {
                            this.e.d();
                            uvm uvmVar2 = this.m;
                            uvmVar2.r.post(uvmVar2.q);
                            j = v;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.c.v() != -1) {
                    this.f.a = this.c.v();
                }
                hld.x(this.b);
            } catch (Throwable th) {
                if (i2 != 1 && this.c.v() != -1) {
                    this.f.a = this.c.v();
                }
                hld.x(this.b);
                throw th;
            }
        }
    }

    public final nb7 b(long j) {
        Map map = Collections.EMPTY_MAP;
        String str = this.m.i;
        Map map2 = uvm.w0;
        Uri uri = this.a;
        vq1.C(uri, "The uri must be set.");
        return new nb7(uri, 0L, 1, null, map2, j, -1L, str, 6);
    }

    @Override // defpackage.jgg
    public final void f() {
        this.g = true;
    }
}
