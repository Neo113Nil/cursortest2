package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ksk {
    public int a;
    public int b;
    public long c;
    public long d = lsk.a;
    public long e = 0;

    public ksk() {
        long j = 0;
        this.c = (j & 4294967295L) | (j << 32);
    }

    public abstract int Y(v2e v2eVar);

    public int Z() {
        return (int) (this.c & 4294967295L);
    }

    public int a0() {
        return (int) (this.c >> 32);
    }

    public final void b0() {
        this.a = yhn.d((int) (this.c >> 32), ga6.k(this.d), ga6.i(this.d));
        this.b = yhn.d((int) (this.c & 4294967295L), ga6.j(this.d), ga6.h(this.d));
        int i = this.a;
        long j = this.c;
        this.e = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public Object n() {
        return null;
    }

    public void p0(long j, float f, xod xodVar) {
        r0(j, f, null);
    }

    public abstract void r0(long j, float f, Function1 function1);

    public final void t0(long j) {
        if (hqe.a(this.c, j)) {
            return;
        }
        this.c = j;
        b0();
    }

    public final void z0(long j) {
        if (ga6.c(this.d, j)) {
            return;
        }
        this.d = j;
        b0();
    }
}
