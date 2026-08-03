package v1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import h3.a1;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import m0.d1;
import m0.i1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends h3.z implements Runnable, h3.h, View.OnAttachStateChangeListener {

    /* renamed from: i, reason: collision with root package name */
    public boolean f7109i;

    /* renamed from: j, reason: collision with root package name */
    public int f7110j;

    /* renamed from: k, reason: collision with root package name */
    public a1 f7111k;

    /* renamed from: l, reason: collision with root package name */
    public final s.g0 f7112l;

    /* renamed from: m, reason: collision with root package name */
    public final i1 f7113m;

    /* renamed from: n, reason: collision with root package name */
    public final s.a0 f7114n;

    /* renamed from: o, reason: collision with root package name */
    public final w0.q f7115o;

    public o() {
        super(1);
        s.g0 g0Var = new s.g0(9);
        w0.f7163a.getClass();
        g0Var.m(v0.f7149b, new y0("caption bar"));
        g0Var.m(v0.f7150c, new y0("display cutout"));
        g0Var.m(v0.f7151d, new y0("ime"));
        g0Var.m(v0.f7152e, new y0("mandatory system gestures"));
        g0Var.m(v0.f7153f, new y0("navigation bars"));
        g0Var.m(v0.f7154g, new y0("status bars"));
        g0Var.m(v0.f7155h, new y0("system gestures"));
        g0Var.m(v0.f7156i, new y0("tappable element"));
        g0Var.m(v0.f7157j, new y0("waterfall"));
        this.f7112l = g0Var;
        this.f7113m = new i1(0);
        this.f7114n = new s.a0(4);
        this.f7115o = new w0.q();
    }

    @Override // h3.h
    public final a1 a(View view, a1 a1Var) {
        if (this.f7109i) {
            this.f7111k = a1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return a1Var;
            }
        } else if (this.f7110j == 0) {
            f(a1Var);
        }
        return a1Var;
    }

    @Override // h3.z
    public final void b(h3.i0 i0Var) {
        boolean z10 = false;
        this.f7109i = false;
        int d10 = i0Var.f2788a.d();
        this.f7110j &= ~d10;
        this.f7111k = null;
        w0 w0Var = (w0) androidx.compose.ui.layout.b.f600c.b(d10);
        if (w0Var != null) {
            Object g8 = this.f7112l.g(w0Var);
            pc.j.b(g8);
            y0 y0Var = (y0) g8;
            y0Var.f7171c.g(0.0f);
            y0Var.f7173e.g(1.0f);
            y0Var.f7172d.g(0L);
            y0Var.f7171c.g(0.0f);
            y0Var.f7170b.setValue(Boolean.FALSE);
            y0Var.f7178j = -1L;
            y0Var.f7179k = -1L;
            i1 i1Var = this.f7113m;
            i1Var.h(i1Var.g() + 1);
            synchronized (w0.m.f7580c) {
                s.h0 h0Var = w0.m.f7587j.f7547h;
                if (h0Var != null) {
                    if (h0Var.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                w0.m.a();
            }
        }
    }

    @Override // h3.z
    public final void c() {
        this.f7109i = true;
    }

    @Override // h3.z
    public final a1 d(a1 a1Var, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h3.i0 i0Var = (h3.i0) list.get(i10);
            w0 w0Var = (w0) androidx.compose.ui.layout.b.f600c.b(i0Var.f2788a.d());
            if (w0Var != null) {
                Object g8 = this.f7112l.g(w0Var);
                pc.j.b(g8);
                y0 y0Var = (y0) g8;
                if (((Boolean) y0Var.f7170b.getValue()).booleanValue()) {
                    h3.h0 h0Var = i0Var.f2788a;
                    y0Var.f7171c.g(h0Var.c());
                    y0Var.f7173e.g(h0Var.a());
                    y0Var.f7172d.g(h0Var.b());
                }
            }
        }
        f(a1Var);
        return a1Var;
    }

    @Override // h3.z
    public final x4.l e(h3.i0 i0Var, x4.l lVar) {
        a1 a1Var = this.f7111k;
        boolean z10 = false;
        this.f7109i = false;
        this.f7111k = null;
        if (i0Var.f2788a.b() > 0 && a1Var != null) {
            int d10 = i0Var.f2788a.d();
            this.f7110j |= d10;
            w0 w0Var = (w0) androidx.compose.ui.layout.b.f600c.b(d10);
            if (w0Var != null) {
                Object g8 = this.f7112l.g(w0Var);
                pc.j.b(g8);
                y0 y0Var = (y0) g8;
                a3.b f10 = a1Var.f2745a.f(d10);
                long j3 = (f10.f194a << 48) | (f10.f195b << 32) | (f10.f196c << 16) | f10.f197d;
                long j6 = y0Var.f7176h;
                if (!p0.f(j3, j6)) {
                    y0Var.f7178j = j6;
                    y0Var.f7179k = j3;
                    y0Var.f7170b.setValue(Boolean.TRUE);
                    h3.h0 h0Var = i0Var.f2788a;
                    y0Var.f7171c.g(h0Var.c());
                    y0Var.f7173e.g(h0Var.a());
                    y0Var.f7172d.g(h0Var.b());
                    i1 i1Var = this.f7113m;
                    i1Var.h(i1Var.g() + 1);
                    synchronized (w0.m.f7580c) {
                        s.h0 h0Var2 = w0.m.f7587j.f7547h;
                        if (h0Var2 != null) {
                            if (h0Var2.h()) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        w0.m.a();
                        return lVar;
                    }
                }
            }
        }
        return lVar;
    }

    public final void f(a1 a1Var) {
        char c3;
        char c7;
        char c10;
        char c11;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12;
        long j6;
        long g8;
        boolean z13;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i10;
        s.u uVar = androidx.compose.ui.layout.b.f598a;
        int[] iArr5 = uVar.f6296b;
        Object[] objArr = uVar.f6297c;
        long[] jArr5 = uVar.f6295a;
        int length = jArr5.length - 2;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            z11 = false;
            z12 = false;
            c3 = 7;
            c7 = 16;
            c10 = ' ';
            while (true) {
                long j10 = jArr5[i12];
                c11 = '0';
                j3 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            int i16 = iArr5[i15];
                            w0 w0Var = (w0) objArr[i15];
                            i10 = i11;
                            a3.b f10 = a1Var.f2745a.f(i16);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j11 = (f10.f195b << 32) | (f10.f194a << 48) | (f10.f196c << 16) | f10.f197d;
                            Object g10 = this.f7112l.g(w0Var);
                            pc.j.b(g10);
                            y0 y0Var = (y0) g10;
                            if (!p0.f(j11, y0Var.f7176h)) {
                                y0Var.f7176h = j11;
                                z11 = true;
                                if (!p0.f(j11, 0L)) {
                                    z12 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i10 = i11;
                        }
                        j10 >>= i10;
                        i14++;
                        i11 = i10;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z10 = true;
                    if (i13 != i11) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z10 = true;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i11 = 8;
            }
        } else {
            c3 = 7;
            c7 = 16;
            c10 = ' ';
            c11 = '0';
            j3 = -9187201950435737472L;
            z10 = true;
            z11 = false;
            z12 = false;
        }
        s.u uVar2 = androidx.compose.ui.layout.b.f600c;
        int[] iArr6 = uVar2.f6296b;
        Object[] objArr2 = uVar2.f6297c;
        long[] jArr6 = uVar2.f6295a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j12 = jArr6[i17];
                if ((((~j12) << c3) & j12 & j3) != j3) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j12 & 255) < 128) {
                            int i20 = (i17 << 3) + i19;
                            int i21 = iArr6[i20];
                            Object g11 = this.f7112l.g((w0) objArr2[i20]);
                            pc.j.b(g11);
                            y0 y0Var2 = (y0) g11;
                            if (i21 != 8) {
                                a3.b g12 = a1Var.f2745a.g(i21);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j13 = (g12.f195b << c10) | (g12.f194a << c11) | (g12.f196c << c7) | g12.f197d;
                                if (!p0.f(y0Var2.f7177i, j13)) {
                                    y0Var2.f7177i = j13;
                                    z11 = z10;
                                    if (!p0.f(j13, 0L)) {
                                        z12 = z11;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            y0Var2.f7169a.setValue(Boolean.valueOf(a1Var.f2745a.p(i21)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j12 >>= 8;
                        i19++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        h3.d e10 = a1Var.f2745a.e();
        if (e10 == null) {
            j6 = 0;
        } else {
            a3.b a6 = e10.a();
            j6 = (a6.f194a << c11) | (a6.f195b << c10) | (a6.f196c << c7) | a6.f197d;
        }
        s.g0 g0Var = this.f7112l;
        w0.f7163a.getClass();
        Object g13 = g0Var.g(v0.f7157j);
        pc.j.b(g13);
        y0 y0Var3 = (y0) g13;
        if (!p0.f(y0Var3.f7176h, j6)) {
            y0Var3.f7176h = j6;
            y0Var3.f7177i = j6;
            z11 = z10;
            if (!p0.f(j6, 0L)) {
                z12 = z11;
            }
        }
        if (e10 == null) {
            g8 = 0;
        } else {
            int i22 = Build.VERSION.SDK_INT;
            g8 = (i22 >= 28 ? b3.a.g(e10.f2767a) : 0) | ((i22 >= 28 ? b3.a.j(e10.f2767a) : 0) << c10) | ((i22 >= 28 ? b3.a.h(e10.f2767a) : 0) << c11) | ((i22 >= 28 ? b3.a.i(e10.f2767a) : 0) << c7);
        }
        Object g14 = this.f7112l.g(v0.f7150c);
        pc.j.b(g14);
        y0 y0Var4 = (y0) g14;
        if (!p0.f(g8, y0Var4.f7176h)) {
            y0Var4.f7176h = g8;
            y0Var4.f7177i = g8;
            z11 = z10;
            if (!p0.f(g8, 0L)) {
                z12 = z11;
            }
        }
        if (e10 == null) {
            s.a0 a0Var = this.f7114n;
            if (a0Var.f6220b > 0) {
                a0Var.c();
                this.f7115o.clear();
                z11 = z10;
            }
        } else {
            List c12 = Build.VERSION.SDK_INT >= 28 ? b3.a.c(e10.f2767a) : Collections.EMPTY_LIST;
            int size = c12.size();
            s.a0 a0Var2 = this.f7114n;
            if (size < a0Var2.f6220b) {
                a0Var2.k(c12.size(), this.f7114n.f6220b);
                this.f7115o.d(c12.size(), this.f7115o.size());
                z11 = z10;
            } else {
                int size2 = c12.size() - this.f7114n.f6220b;
                int i23 = 0;
                while (i23 < size2) {
                    s.a0 a0Var3 = this.f7114n;
                    a0Var3.a(m0.z.s(c12.get(a0Var3.f6220b)));
                    this.f7115o.add(new n("display cutout rect " + this.f7114n.f6220b));
                    i23++;
                    z11 = z10;
                }
            }
            int size3 = c12.size();
            for (int i24 = 0; i24 < size3; i24++) {
                Rect rect = (Rect) c12.get(i24);
                d1 d1Var = (d1) this.f7114n.e(i24);
                if (!pc.j.a(d1Var.getValue(), rect)) {
                    d1Var.setValue(rect);
                    z11 = z10;
                }
            }
            if (!c12.isEmpty()) {
                z12 = z10;
            }
        }
        if ((z12 || this.f7113m.g() != 0) && z11) {
            i1 i1Var = this.f7113m;
            i1Var.h(i1Var.g() + 1);
            synchronized (w0.m.f7580c) {
                s.h0 h0Var = w0.m.f7587j.f7547h;
                if (h0Var != null) {
                    boolean z14 = z10;
                    z13 = h0Var.h() == z14 ? z14 : false;
                }
            }
            if (z13) {
                w0.m.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = h3.w.f2829a;
        h3.q.g(view, this);
        h3.w.c(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = h3.w.f2829a;
        h3.q.g(view, null);
        h3.w.c(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7109i) {
            this.f7110j = 0;
            this.f7109i = false;
            a1 a1Var = this.f7111k;
            if (a1Var != null) {
                f(a1Var);
                this.f7111k = null;
            }
        }
    }
}
