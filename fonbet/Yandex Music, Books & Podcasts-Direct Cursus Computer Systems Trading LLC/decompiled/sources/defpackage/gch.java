package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.source.a;

/* loaded from: classes.dex */
public final class gch extends c6w {
    public final boolean l;
    public final ris m;
    public final ois n;
    public a o;
    public ech p;
    public boolean q;
    public boolean r;
    public boolean s;

    public gch(wvh wvhVar, boolean z) {
        super(wvhVar);
        this.l = z && wvhVar.q();
        this.m = new ris();
        this.n = new ois();
        sis r = wvhVar.r();
        if (r == null) {
            this.o = new a(new fch(wvhVar.f()), ris.q, a.h);
        } else {
            this.o = new a(r, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.c6w
    public final uvh F(uvh uvhVar) {
        Object obj = uvhVar.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.h;
        }
        return uvhVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // defpackage.c6w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(sis sisVar) {
        long j;
        a aVar;
        ech echVar;
        Object obj;
        uvh a;
        a aVar2;
        if (this.r) {
            a aVar3 = this.o;
            this.o = new a(sisVar, aVar3.f, aVar3.g);
            ech echVar2 = this.p;
            if (echVar2 != null) {
                J(echVar2.g);
            }
        } else if (sisVar.p()) {
            if (this.s) {
                a aVar4 = this.o;
                aVar2 = new a(sisVar, aVar4.f, aVar4.g);
            } else {
                aVar2 = new a(sisVar, ris.q, a.h);
            }
            this.o = aVar2;
        } else {
            ris risVar = this.m;
            sisVar.n(0, risVar);
            long j2 = risVar.l;
            Object obj2 = risVar.a;
            ech echVar3 = this.p;
            if (echVar3 != null) {
                long j3 = echVar3.b;
                a aVar5 = this.o;
                Object obj3 = echVar3.a.a;
                ois oisVar = this.n;
                aVar5.g(obj3, oisVar);
                long j4 = oisVar.e + j3;
                this.o.m(0, risVar, 0L);
                if (j4 != risVar.l) {
                    j = j4;
                    Pair i = sisVar.i(this.m, this.n, 0, j);
                    Object obj4 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (this.s) {
                        aVar = new a(sisVar, obj2, obj4);
                    } else {
                        a aVar6 = this.o;
                        aVar = new a(sisVar, aVar6.f, aVar6.g);
                    }
                    this.o = aVar;
                    echVar = this.p;
                    if (echVar != null && J(longValue)) {
                        uvh uvhVar = echVar.a;
                        obj = uvhVar.a;
                        if (this.o.g != null && obj.equals(a.h)) {
                            obj = this.o.g;
                        }
                        a = uvhVar.a(obj);
                        this.s = true;
                        this.r = true;
                        y(this.o);
                        if (a != null) {
                            ech echVar4 = this.p;
                            echVar4.getClass();
                            echVar4.d(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair i2 = sisVar.i(this.m, this.n, 0, j);
            Object obj42 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (this.s) {
            }
            this.o = aVar;
            echVar = this.p;
            if (echVar != null) {
                uvh uvhVar2 = echVar.a;
                obj = uvhVar2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a = uvhVar2.a(obj);
                this.s = true;
                this.r = true;
                y(this.o);
                if (a != null) {
                }
            }
        }
        a = null;
        this.s = true;
        this.r = true;
        y(this.o);
        if (a != null) {
        }
    }

    @Override // defpackage.c6w
    public final void H() {
        if (this.l) {
            return;
        }
        this.q = true;
        E(null, this.k);
    }

    @Override // defpackage.wvh
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ech n(uvh uvhVar, zi7 zi7Var, long j) {
        ech echVar = new ech(uvhVar, zi7Var, j);
        vq1.A(echVar.d == null);
        wvh wvhVar = this.k;
        echVar.d = wvhVar;
        if (!this.r) {
            this.p = echVar;
            if (!this.q) {
                this.q = true;
                E(null, wvhVar);
            }
            return echVar;
        }
        Object obj = uvhVar.a;
        if (this.o.g != null && obj.equals(a.h)) {
            obj = this.o.g;
        }
        echVar.d(uvhVar.a(obj));
        return echVar;
    }

    public final boolean J(long j) {
        ech echVar = this.p;
        int b = this.o.b(echVar.a.a);
        if (b == -1) {
            return false;
        }
        a aVar = this.o;
        ois oisVar = this.n;
        aVar.f(b, oisVar, false);
        long j2 = oisVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        echVar.g = j;
        return true;
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        return this.k.a(onhVar);
    }

    @Override // defpackage.c6w, defpackage.wvh
    public final void i(onh onhVar) {
        if (this.s) {
            a aVar = this.o;
            this.o = new a(new g1m(this.o.e, onhVar), aVar.f, aVar.g);
        } else {
            this.o = new a(new fch(onhVar), ris.q, a.h);
        }
        this.k.i(onhVar);
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        ech echVar = (ech) wohVar;
        if (echVar.e != null) {
            wvh wvhVar = echVar.d;
            wvhVar.getClass();
            wvhVar.s(echVar.e);
        }
        if (wohVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.fr5, defpackage.js2
    public final void z() {
        this.r = false;
        this.q = false;
        super.z();
    }

    @Override // defpackage.fr5, defpackage.wvh
    public final void p() {
    }
}
