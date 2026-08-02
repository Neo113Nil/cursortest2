package defpackage;

import android.os.RemoteException;
import androidx.media3.session.i;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jth implements f8l {
    public final WeakReference a;
    public final WeakReference b;

    public jth(i iVar, lrl lrlVar) {
        this.a = new WeakReference(iVar);
        this.b = new WeakReference(lrlVar);
    }

    @Override // defpackage.f8l
    public final void D(dv1 dv1Var) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.a(dv1Var);
        c.c.a(true, true);
        try {
            c.h.j.v(dv1Var);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void E(w0t w0tVar) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.o(w0tVar);
        c.c.a(true, true);
        c.d(new dlh(10));
    }

    @Override // defpackage.f8l
    public final void F(boolean z) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar = rdlVar.E;
        vq1.A(sisVar.p() || tmpVar.a.b < sisVar.o());
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
        try {
            c.h.j.getClass();
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
        c.v();
    }

    @Override // defpackage.f8l
    public final void G(int i, boolean z) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        c.s = rdlVar.d(i, rdlVar.x, z);
        c.c.a(true, true);
        try {
            sth sthVar = (sth) c.h.j.e;
            sthVar.q0(sthVar.h.t);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void H(float f) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        c.s = c.s.p(f);
        c.c.a(true, true);
        try {
            c.h.j.getClass();
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void I(int i, onh onhVar) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        try {
            if (sisVar.p()) {
                w0tVar = w0tVar2;
            } else {
                w0tVar = w0tVar2;
                if (tmpVar.a.b >= sisVar.o()) {
                    z = false;
                    vq1.A(z);
                    c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
                    c.c.a(true, true);
                    c.h.j.y(onhVar);
                    return;
                }
            }
            c.h.j.y(onhVar);
            return;
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void L(hzk hzkVar) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        try {
            if (sisVar.p()) {
                w0tVar = w0tVar2;
            } else {
                w0tVar = w0tVar2;
                if (tmpVar.a.b >= sisVar.o()) {
                    z = false;
                    vq1.A(z);
                    c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
                    c.c.a(true, true);
                    sth sthVar = (sth) c.h.j.e;
                    sthVar.q0(sthVar.h.t);
                    return;
                }
            }
            sth sthVar2 = (sth) c.h.j.e;
            sthVar2.q0(sthVar2.h.t);
            return;
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void M(e3t e3tVar) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.b(e3tVar);
        c.c.a(true, false);
        c.d(new dlh(11));
    }

    @Override // defpackage.f8l
    public final void P(hoh hohVar) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar2 = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        try {
            if (sisVar.p()) {
                w0tVar = w0tVar2;
            } else {
                w0tVar = w0tVar2;
                if (tmpVar.a.b >= sisVar.o()) {
                    z = false;
                    vq1.A(z);
                    c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar2, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar, j, j2, j3, e3tVar, w0tVar);
                    c.c.a(true, true);
                    c.h.j.Q();
                    return;
                }
            }
            c.h.j.Q();
            return;
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar2, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void Q(long j) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j2 = rdlVar.A;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        try {
            if (sisVar.p()) {
                w0tVar = w0tVar2;
            } else {
                w0tVar = w0tVar2;
                if (tmpVar.a.b >= sisVar.o()) {
                    z = false;
                    vq1.A(z);
                    c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j2, j, j3, e3tVar, w0tVar);
                    c.c.a(true, true);
                    c.h.j.getClass();
                    return;
                }
            }
            c.h.j.getClass();
            return;
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j2, j, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void R(sis sisVar, int i) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        lrl lrlVar = (lrl) this.b.get();
        if (lrlVar == null) {
            return;
        }
        c.s = c.s.n(sisVar, lrlVar.l1(), i);
        c.c.a(false, true);
        try {
            c.h.j.H(sisVar);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void U(p0l p0lVar) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.e(p0lVar);
        c.c.a(true, true);
        try {
            sth sthVar = (sth) c.h.j.e;
            sthVar.q0(sthVar.h.t);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void V(d8l d8lVar) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.g(d8lVar);
    }

    @Override // defpackage.f8l
    public final void W(long j) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j2 = rdlVar.A;
        long j3 = rdlVar.B;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        if (sisVar.p()) {
            w0tVar = w0tVar2;
        } else {
            w0tVar = w0tVar2;
            if (tmpVar.a.b >= sisVar.o()) {
                z = false;
                vq1.A(z);
                c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j2, j3, j, e3tVar, w0tVar);
                c.c.a(true, true);
            }
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j2, j3, j, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar = rdlVar.E;
        vq1.A(sisVar.p() || tmpVar.a.b < sisVar.o());
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z, z5, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
        try {
            sth sthVar = (sth) c.h.j.e;
            sthVar.q0(sthVar.h.t);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
        c.v();
    }

    @Override // defpackage.f8l
    public final void b(int i) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.i(i);
        c.c.a(true, true);
        try {
            c.h.j.F(i);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final i c() {
        return (i) this.a.get();
    }

    @Override // defpackage.f8l
    public final void k(tcu tcuVar) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z2 = rdlVar.s;
        boolean z3 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z4 = rdlVar.v;
        boolean z5 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar = rdlVar.E;
        vq1.A(sisVar.p() || tmpVar.a.b < sisVar.o());
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z2, z3, i6, i7, i8, z4, z5, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
        try {
            c.h.j.getClass();
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void l(sv6 sv6Var) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        if (sisVar.p()) {
            w0tVar = w0tVar2;
        } else {
            w0tVar = w0tVar2;
            if (tmpVar.a.b >= sisVar.o()) {
                z = false;
                vq1.A(z);
                c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
                c.c.a(true, true);
            }
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void m(int i) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        c.s = rdlVar.d(rdlVar.u, i, rdlVar.t);
        c.c.a(true, true);
        try {
            sth sthVar = (sth) c.h.j.e;
            sthVar.q0(sthVar.h.t);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        lrl lrlVar = (lrl) this.b.get();
        if (lrlVar == null) {
            return;
        }
        c.s = c.s.f(i, lrlVar.k());
        c.c.a(true, true);
        try {
            m78 m78Var = c.h.j;
            lrlVar.k();
            sth sthVar = (sth) m78Var.e;
            sthVar.q0(sthVar.h.t);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void q(boolean z) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.k(z);
        c.c.a(true, true);
        try {
            c.h.j.G(z);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void s(int i, boolean z) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.c(i, z);
        c.c.a(true, true);
        try {
            krl krlVar = ((sth) c.h.j.e).o;
            if (krlVar != null) {
                if (z) {
                    i = 0;
                }
                krlVar.d = i;
                krlVar.a().setCurrentVolume(i);
            }
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void t(long j) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        try {
            if (sisVar.p()) {
                w0tVar = w0tVar2;
            } else {
                w0tVar = w0tVar2;
                if (tmpVar.a.b >= sisVar.o()) {
                    z = false;
                    vq1.A(z);
                    c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
                    c.c.a(true, true);
                    c.h.j.getClass();
                    return;
                }
            }
            c.h.j.getClass();
            return;
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }

    @Override // defpackage.f8l
    public final void u(int i, g8l g8lVar, g8l g8lVar2) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        c.s = c.s.h(i, g8lVar, g8lVar2);
        c.c.a(true, true);
        try {
            sth sthVar = (sth) c.h.j.e;
            sthVar.q0(sthVar.h.t);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void v(hoh hohVar) {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        c.s = c.s.g(hohVar);
        c.c.a(true, true);
        try {
            c.h.j.A(hohVar);
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.f8l
    public final void y() {
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        c.d(new dlh(12));
    }

    @Override // defpackage.f8l
    public final void z(p08 p08Var) {
        w0t w0tVar;
        boolean z;
        i c = c();
        if (c == null) {
            return;
        }
        c.y();
        if (((lrl) this.b.get()) == null) {
            return;
        }
        rdl rdlVar = c.s;
        hzk hzkVar = rdlVar.a;
        int i = rdlVar.b;
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = rdlVar.d;
        g8l g8lVar2 = rdlVar.e;
        int i2 = rdlVar.f;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        sis sisVar = rdlVar.j;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        try {
            if (sisVar.p()) {
                w0tVar = w0tVar2;
            } else {
                w0tVar = w0tVar2;
                if (tmpVar.a.b >= sisVar.o()) {
                    z = false;
                    vq1.A(z);
                    c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
                    c.c.a(true, true);
                    c.h.j.w();
                    return;
                }
            }
            c.h.j.w();
            return;
        } catch (RemoteException e) {
            vq1.L("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        vq1.A(z);
        c.s = new rdl(hzkVar, i, tmpVar, g8lVar, g8lVar2, i2, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
        c.c.a(true, true);
    }
}
