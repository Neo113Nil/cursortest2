package com.gamericefishpro.space.f2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.d4.o0 implements Runnable, com.gamericefishpro.space.d4.p, View.OnAttachStateChangeListener {
    public final com.gamericefishpro.space.t.d0 A;
    public final com.gamericefishpro.space.f1.u B;
    public boolean i;
    public int v;
    public com.gamericefishpro.space.d4.o1 w;
    public final com.gamericefishpro.space.t.h0 y;
    public final com.gamericefishpro.space.t0.c1 z;

    public o() {
        super(1);
        com.gamericefishpro.space.t.h0 h0Var = new com.gamericefishpro.space.t.h0(9);
        n1.a.getClass();
        h0Var.m(m1.b, new q1("caption bar"));
        h0Var.m(m1.c, new q1("display cutout"));
        h0Var.m(m1.d, new q1("ime"));
        h0Var.m(m1.e, new q1("mandatory system gestures"));
        h0Var.m(m1.f, new q1("navigation bars"));
        h0Var.m(m1.g, new q1("status bars"));
        h0Var.m(m1.h, new q1("system gestures"));
        h0Var.m(m1.i, new q1("tappable element"));
        h0Var.m(m1.j, new q1("waterfall"));
        this.y = h0Var;
        this.z = new com.gamericefishpro.space.t0.c1(0);
        this.A = new com.gamericefishpro.space.t.d0(4);
        this.B = new com.gamericefishpro.space.f1.u();
    }

    public final void E(com.gamericefishpro.space.d4.o1 o1Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        com.gamericefishpro.space.t.w wVar = p1.a;
        int[] iArr2 = wVar.b;
        Object[] objArr3 = wVar.c;
        long[] jArr2 = wVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            n1 n1Var = (n1) objArr3[i6];
                            com.gamericefishpro.space.u3.b bVarG = o1Var.a.g(i7);
                            long j3 = (((long) bVarG.a) << 48) | (((long) bVarG.b) << 32) | (((long) bVarG.c) << 16) | ((long) bVarG.d);
                            Object objG = this.y.g(n1Var);
                            Intrinsics.b(objG);
                            q1 q1Var = (q1) objG;
                            if (!x.g(j3, q1Var.h)) {
                                q1Var.h = j3;
                                z2 = true;
                                if (!x.g(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                com.gamericefishpro.space.u3.b bVarH = o1Var.a.h(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) bVarH.b) << 32) | (((long) bVarH.a) << 48) | (((long) bVarH.c) << 16) | ((long) bVarH.d);
                                if (!x.g(q1Var.i, j4)) {
                                    q1Var.i = j4;
                                    z2 = true;
                                    if (!x.g(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            q1Var.a.setValue(Boolean.valueOf(o1Var.a.q(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        com.gamericefishpro.space.d4.k kVarF = o1Var.a.f();
        if (kVarF == null) {
            j = 0;
        } else {
            com.gamericefishpro.space.u3.b bVarA = kVarF.a();
            j = (((long) bVarA.a) << c3) | (((long) bVarA.b) << c2) | (((long) bVarA.c) << c) | ((long) bVarA.d);
        }
        com.gamericefishpro.space.t.h0 h0Var = this.y;
        n1.a.getClass();
        Object objG2 = h0Var.g(m1.j);
        Intrinsics.b(objG2);
        q1 q1Var2 = (q1) objG2;
        q1Var2.a.setValue(Boolean.valueOf(!x.g(j, 0L)));
        if (!x.g(q1Var2.h, j)) {
            q1Var2.h = j;
            q1Var2.i = j;
            z2 = z;
            if (!x.g(j, 0L)) {
                z3 = z2;
            }
        }
        if (kVarF == null) {
            com.gamericefishpro.space.t.d0 d0Var = this.A;
            if (d0Var.b > 0) {
                d0Var.d();
                this.B.clear();
                z2 = z;
            }
        } else {
            List listD = Build.VERSION.SDK_INT >= 28 ? com.gamericefishpro.space.d4.h.d(kVarF.a) : Collections.EMPTY_LIST;
            int size = listD.size();
            com.gamericefishpro.space.t.d0 d0Var2 = this.A;
            if (size < d0Var2.b) {
                d0Var2.l(listD.size(), this.A.b);
                this.B.f(listD.size(), this.B.size());
                z2 = z;
            } else {
                int size2 = listD.size() - this.A.b;
                int i8 = 0;
                while (i8 < size2) {
                    com.gamericefishpro.space.t.d0 d0Var3 = this.A;
                    d0Var3.a(com.gamericefishpro.space.t0.i.v(listD.get(d0Var3.b)));
                    this.B.add(new n("display cutout rect " + this.A.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listD.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listD.get(i9);
                com.gamericefishpro.space.t0.v0 v0Var = (com.gamericefishpro.space.t0.v0) this.A.f(i9);
                if (!Intrinsics.a(v0Var.getValue(), rect)) {
                    v0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listD.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.z.g() != 0) && z2) {
            com.gamericefishpro.space.t0.c1 c1Var = this.z;
            c1Var.h(c1Var.g() + 1);
            synchronized (com.gamericefishpro.space.f1.p.c) {
                com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.f1.p.j.h;
                z4 = (i0Var == null || i0Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                com.gamericefishpro.space.f1.p.a();
            }
        }
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void d(com.gamericefishpro.space.d4.x0 x0Var) {
        boolean z = false;
        this.i = false;
        int iD = x0Var.a.d();
        this.v &= ~iD;
        this.w = null;
        n1 n1Var = (n1) p1.a.b(iD);
        if (n1Var != null) {
            Object objG = this.y.g(n1Var);
            Intrinsics.b(objG);
            q1 q1Var = (q1) objG;
            q1Var.c.h(0.0f);
            q1Var.e.h(1.0f);
            q1Var.d.g(0L);
            q1Var.c.h(0.0f);
            q1Var.b.setValue(Boolean.FALSE);
            q1Var.j = -1L;
            q1Var.k = -1L;
            com.gamericefishpro.space.t0.c1 c1Var = this.z;
            c1Var.h(c1Var.g() + 1);
            synchronized (com.gamericefishpro.space.f1.p.c) {
                com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.f1.p.j.h;
                if (i0Var != null && i0Var.h()) {
                    z = true;
                }
            }
            if (z) {
                com.gamericefishpro.space.f1.p.a();
            }
        }
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void e() {
        this.i = true;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final com.gamericefishpro.space.d4.o1 f(com.gamericefishpro.space.d4.o1 o1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.d4.x0 x0Var = (com.gamericefishpro.space.d4.x0) list.get(i);
            n1 n1Var = (n1) p1.a.b(x0Var.a.d());
            if (n1Var != null) {
                Object objG = this.y.g(n1Var);
                Intrinsics.b(objG);
                q1 q1Var = (q1) objG;
                if (((Boolean) q1Var.b.getValue()).booleanValue()) {
                    com.gamericefishpro.space.d4.w0 w0Var = x0Var.a;
                    q1Var.c.h(w0Var.c());
                    q1Var.e.h(w0Var.a());
                    q1Var.d.g(w0Var.b());
                }
            }
        }
        E(o1Var);
        return o1Var;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final com.gamericefishpro.space.u6.e g(com.gamericefishpro.space.d4.x0 x0Var, com.gamericefishpro.space.u6.e eVar) {
        com.gamericefishpro.space.d4.o1 o1Var = this.w;
        boolean z = false;
        this.i = false;
        this.w = null;
        if (x0Var.a.b() > 0 && o1Var != null) {
            int iD = x0Var.a.d();
            this.v |= iD;
            n1 n1Var = (n1) p1.a.b(iD);
            if (n1Var != null) {
                Object objG = this.y.g(n1Var);
                Intrinsics.b(objG);
                q1 q1Var = (q1) objG;
                com.gamericefishpro.space.u3.b bVarG = o1Var.a.g(iD);
                long j = (((long) bVarG.a) << 48) | (((long) bVarG.b) << 32) | (((long) bVarG.c) << 16) | ((long) bVarG.d);
                long j2 = q1Var.h;
                if (!x.g(j, j2)) {
                    q1Var.j = j2;
                    q1Var.k = j;
                    q1Var.b.setValue(Boolean.TRUE);
                    com.gamericefishpro.space.d4.w0 w0Var = x0Var.a;
                    q1Var.c.h(w0Var.c());
                    q1Var.e.h(w0Var.a());
                    q1Var.d.g(w0Var.b());
                    com.gamericefishpro.space.t0.c1 c1Var = this.z;
                    c1Var.h(c1Var.g() + 1);
                    synchronized (com.gamericefishpro.space.f1.p.c) {
                        com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.f1.p.j.h;
                        if (i0Var != null && i0Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        com.gamericefishpro.space.f1.p.a();
                        return eVar;
                    }
                }
            }
        }
        return eVar;
    }

    @Override // com.gamericefishpro.space.d4.p
    public final com.gamericefishpro.space.d4.o1 l(View view, com.gamericefishpro.space.d4.o1 o1Var) {
        if (this.i) {
            this.w = o1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return o1Var;
            }
        } else if (this.v == 0) {
            E(o1Var);
        }
        return o1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = com.gamericefishpro.space.d4.l0.a;
        com.gamericefishpro.space.d4.d0.i(view, this);
        com.gamericefishpro.space.d4.l0.n(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = com.gamericefishpro.space.d4.l0.a;
        com.gamericefishpro.space.d4.d0.i(view, null);
        com.gamericefishpro.space.d4.l0.n(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i) {
            this.v = 0;
            this.i = false;
            com.gamericefishpro.space.d4.o1 o1Var = this.w;
            if (o1Var != null) {
                E(o1Var);
                this.w = null;
            }
        }
    }
}
