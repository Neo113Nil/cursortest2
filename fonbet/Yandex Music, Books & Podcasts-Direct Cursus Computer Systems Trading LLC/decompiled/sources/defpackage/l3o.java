package defpackage;

import java.io.Closeable;

/* loaded from: classes5.dex */
public final class l3o implements Closeable {
    public final d0o a;
    public final izm b;
    public final String c;
    public final int d;
    public final hsd e;
    public final zvd f;
    public final o3o g;
    public final l3o h;
    public final l3o i;
    public final l3o j;
    public final long k;
    public final long l;
    public final evj m;
    public cp3 n;

    public l3o(d0o d0oVar, izm izmVar, String str, int i, hsd hsdVar, zvd zvdVar, o3o o3oVar, l3o l3oVar, l3o l3oVar2, l3o l3oVar3, long j, long j2, evj evjVar) {
        d0oVar.getClass();
        izmVar.getClass();
        str.getClass();
        this.a = d0oVar;
        this.b = izmVar;
        this.c = str;
        this.d = i;
        this.e = hsdVar;
        this.f = zvdVar;
        this.g = o3oVar;
        this.h = l3oVar;
        this.i = l3oVar2;
        this.j = l3oVar3;
        this.k = j;
        this.l = j2;
        this.m = evjVar;
    }

    public final cp3 a() {
        cp3 cp3Var = this.n;
        if (cp3Var != null) {
            return cp3Var;
        }
        cp3 cp3Var2 = cp3.n;
        cp3 F = men.F(this.f);
        this.n = F;
        return F;
    }

    public final boolean b() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o3o o3oVar = this.g;
        if (o3oVar != null) {
            o3oVar.close();
        } else {
            xq0.q("response is not eligible for a body and must not be closed");
        }
    }

    public final k3o g() {
        k3o k3oVar = new k3o();
        k3oVar.a = this.a;
        k3oVar.b = this.b;
        k3oVar.c = this.d;
        k3oVar.d = this.c;
        k3oVar.e = this.e;
        k3oVar.f = this.f.m();
        k3oVar.g = this.g;
        k3oVar.h = this.h;
        k3oVar.i = this.i;
        k3oVar.j = this.j;
        k3oVar.k = this.k;
        k3oVar.l = this.l;
        k3oVar.m = this.m;
        return k3oVar;
    }

    public final wkn o() {
        o3o o3oVar = this.g;
        o3oVar.getClass();
        ikn peek = o3oVar.z().peek();
        hi3 hi3Var = new hi3();
        peek.request(Long.MAX_VALUE);
        long min = Math.min(Long.MAX_VALUE, peek.b.b);
        while (min > 0) {
            long e0 = peek.e0(hi3Var, min);
            if (e0 == -1) {
                xq0.v();
                return null;
            }
            min -= e0;
        }
        return new wkn(o3oVar.o(), hi3Var.b, hi3Var, 1);
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
