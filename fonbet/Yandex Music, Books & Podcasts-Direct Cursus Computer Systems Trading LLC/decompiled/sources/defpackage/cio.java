package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class cio implements jgg {
    public final int a;
    public final zio b;
    public final h5n c;
    public final nnd d;
    public final aio f;
    public bio g;
    public dio h;
    public gm7 i;
    public volatile boolean j;
    public volatile long l;
    public final Handler e = dvt.p(null);
    public volatile long k = -9223372036854775807L;

    public cio(int i, zio zioVar, h5n h5nVar, nnd nndVar, aio aioVar) {
        this.a = i;
        this.b = zioVar;
        this.c = h5nVar;
        this.d = nndVar;
        this.f = aioVar;
    }

    @Override // defpackage.jgg
    public final void a() {
        if (this.j) {
            this.j = false;
        }
        try {
            if (this.g == null) {
                bio a = this.f.a(this.a);
                this.g = a;
                this.e.post(new gtm(1, this, a.e(), this.g));
                bio bioVar = this.g;
                bioVar.getClass();
                this.i = new gm7(bioVar, 0L, -1L);
                dio dioVar = new dio(this.b.a, this.a);
                this.h = dioVar;
                dioVar.l(this.d);
            }
            while (!this.j) {
                if (this.k != -9223372036854775807L) {
                    dio dioVar2 = this.h;
                    dioVar2.getClass();
                    dioVar2.b(this.l, this.k);
                    this.k = -9223372036854775807L;
                }
                dio dioVar3 = this.h;
                dioVar3.getClass();
                gm7 gm7Var = this.i;
                gm7Var.getClass();
                if (dioVar3.h(gm7Var, new ci0()) == -1) {
                    break;
                }
            }
            this.j = false;
            bio bioVar2 = this.g;
            bioVar2.getClass();
            if (bioVar2.r()) {
                hld.x(this.g);
                this.g = null;
            }
        } catch (Throwable th) {
            bio bioVar3 = this.g;
            bioVar3.getClass();
            if (bioVar3.r()) {
                hld.x(this.g);
                this.g = null;
            }
            throw th;
        }
    }

    @Override // defpackage.jgg
    public final void f() {
        this.j = true;
    }
}
