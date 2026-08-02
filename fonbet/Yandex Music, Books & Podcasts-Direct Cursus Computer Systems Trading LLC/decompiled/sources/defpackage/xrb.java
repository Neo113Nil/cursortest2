package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.trackselection.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xrb implements ExoPlayer, i8l {
    public final z0j A;
    public final kj3 B;
    public final kj3 C;
    public final long D;
    public final sj E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public hap L;
    public ueq M;
    public d8l N;
    public hoh O;
    public hoh P;
    public Object Q;
    public Surface R;
    public SurfaceHolder S;
    public l6r T;
    public boolean U;
    public TextureView V;
    public final int W;
    public kmq X;
    public dv1 Y;
    public float Z;
    public boolean a0;
    public final c1t b;
    public sv6 b0;
    public final d8l c;
    public final boolean c0;
    public boolean d0;
    public final Context e;
    public final int e0;
    public final xrb f;
    public ssm f0;
    public final at2[] g;
    public boolean g0;
    public final at2[] h;
    public boolean h0;
    public final ct7 i;
    public final p08 i0;
    public final hzr j;
    public tcu j0;
    public final prb k;
    public hoh k0;
    public final fsb l;
    public rzk l0;
    public final bdg m;
    public int m0;
    public final CopyOnWriteArraySet n;
    public long n0;
    public final ois o;
    public final ArrayList p;
    public final boolean q;
    public final tvh r;
    public final uj7 s;
    public final Looper t;
    public final yk2 u;
    public final long v;
    public final long w;
    public final long x;
    public final urb y;
    public final vrb z;
    public final ris a = new ris();
    public final n20 d = new n20();

    static {
        ynh.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xrb(qqb qqbVar) {
        xrb xrbVar;
        Context context;
        dzr dzrVar;
        Looper looper;
        fsb fsbVar;
        Looper looper2;
        xrb xrbVar2;
        hzr a;
        srb srbVar;
        final int i;
        try {
            vq1.Y("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + dvt.b + "]");
            context = qqbVar.a;
            dzrVar = qqbVar.b;
            this.e = context.getApplicationContext();
            this.s = (uj7) qqbVar.h.apply(dzrVar);
            this.e0 = qqbVar.j;
            this.f0 = null;
            this.Y = qqbVar.k;
            this.W = qqbVar.n;
            this.a0 = false;
            this.D = qqbVar.v;
            urb urbVar = new urb(this);
            this.y = urbVar;
            this.z = new vrb();
            Handler handler = new Handler(qqbVar.i);
            mxn mxnVar = (mxn) qqbVar.c.get();
            at2[] a2 = mxnVar.a(handler, urbVar, urbVar, urbVar, urbVar);
            this.g = a2;
            vq1.A(a2.length > 0);
            this.h = new at2[a2.length];
            int i2 = 0;
            while (true) {
                at2[] at2VarArr = this.h;
                if (i2 >= at2VarArr.length) {
                    break;
                }
                mxnVar.b(this.g[i2]);
                at2VarArr[i2] = null;
                i2++;
            }
            ct7 ct7Var = (ct7) qqbVar.e.get();
            this.i = ct7Var;
            this.r = (tvh) qqbVar.d.get();
            yk2 yk2Var = (yk2) qqbVar.g.get();
            this.u = yk2Var;
            this.q = qqbVar.o;
            this.L = qqbVar.p;
            this.v = qqbVar.q;
            this.w = qqbVar.r;
            this.x = qqbVar.s;
            looper = qqbVar.i;
            this.t = looper;
            this.f = this;
            this.m = new bdg(looper, dzrVar, new prb(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.M = new ueq();
            at2[] at2VarArr2 = this.g;
            c1t c1tVar = new c1t(new gxn[at2VarArr2.length], new zsb[at2VarArr2.length], e3t.b, (Object) null);
            this.b = c1tVar;
            this.o = new ois();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i3 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                vq1.A(!false);
                sparseBooleanArray.append(i3, true);
            }
            ct7Var.getClass();
            vq1.A(!false);
            sparseBooleanArray.append(29, true);
            vq1.A(!false);
            xgc xgcVar = new xgc(sparseBooleanArray);
            this.c = new d8l(xgcVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i4 = 0; i4 < xgcVar.a.size(); i4++) {
                int b = xgcVar.b(i4);
                vq1.A(!false);
                sparseBooleanArray2.append(b, true);
            }
            vq1.A(!false);
            sparseBooleanArray2.append(4, true);
            vq1.A(!false);
            sparseBooleanArray2.append(10, true);
            vq1.A(!false);
            this.N = new d8l(new xgc(sparseBooleanArray2));
            this.j = dzrVar.a(looper, null);
            prb prbVar = new prb(this, 1);
            this.k = prbVar;
            this.l0 = rzk.j(c1tVar);
            this.s.e0(this, looper);
            ndl ndlVar = new ndl(qqbVar.y);
            fsbVar = new fsb(this.e, this.g, this.h, ct7Var, c1tVar, (heg) qqbVar.f.get(), yk2Var, this.F, this.G, this.s, this.L, qqbVar.t, qqbVar.u, looper, dzrVar, prbVar, ndlVar);
            this.l = fsbVar;
            looper2 = fsbVar.j;
            this.Z = 1.0f;
            this.F = 0;
            hoh hohVar = hoh.K;
            this.O = hohVar;
            this.P = hohVar;
            this.k0 = hohVar;
            this.m0 = -1;
            this.b0 = sv6.c;
            this.c0 = true;
            j0(this.s);
            yk2Var.e(new Handler(looper), this.s);
            copyOnWriteArraySet.add(this.y);
            if (dvt.a >= 31) {
                try {
                    Context context2 = this.e;
                    boolean z = qqbVar.w;
                    a = dzrVar.a(fsbVar.j, null);
                    i = 1;
                    srbVar = new srb(context2, z, this, ndlVar, 0);
                    xrbVar2 = this;
                } catch (Throwable th) {
                    th = th;
                    xrbVar2 = this;
                    xrbVar = xrbVar2;
                    xrbVar.d.h();
                    throw th;
                }
                try {
                    a.e(srbVar);
                } catch (Throwable th2) {
                    th = th2;
                    xrbVar = xrbVar2;
                    xrbVar.d.h();
                    throw th;
                }
            } else {
                i = 1;
                xrbVar2 = this;
            }
            xrbVar = xrbVar2;
        } catch (Throwable th3) {
            th = th3;
            xrbVar = this;
        }
        try {
            sj sjVar = new sj((Object) 0, looper2, looper, dzrVar, new prb(xrbVar2, 2));
            xrbVar.E = sjVar;
            ((hzr) sjVar.b).e(new sr7(12, xrbVar));
            z0j z0jVar = new z0j(qqbVar.a, looper2, qqbVar.i, xrbVar.y, dzrVar);
            xrbVar.A = z0jVar;
            z0jVar.g0();
            final kj3 kj3Var = new kj3(context, looper2, dzrVar, 5);
            xrbVar.B = kj3Var;
            final boolean z2 = qqbVar.m != 0 ? i : 0;
            if (kj3Var.b != z2) {
                kj3Var.b = z2;
                final boolean z3 = kj3Var.c;
                final int i5 = 0;
                ((hzr) kj3Var.e).e(new Runnable() { // from class: kku
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                ((rjp) ((kj3) kj3Var).d).g(z2, z3);
                                break;
                            default:
                                ((y8p) ((kj3) kj3Var).d).p(z2, z3);
                                break;
                        }
                    }
                });
            }
            final kj3 kj3Var2 = new kj3(context, looper2, dzrVar, 6);
            xrbVar.C = kj3Var2;
            final boolean z4 = qqbVar.m == 2 ? i : 0;
            if (kj3Var2.b != z4) {
                kj3Var2.b = z4;
                final boolean z5 = kj3Var2.c;
                ((hzr) kj3Var2.e).e(new Runnable() { // from class: kku
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ((rjp) ((kj3) kj3Var2).d).g(z4, z5);
                                break;
                            default:
                                ((y8p) ((kj3) kj3Var2).d).p(z4, z5);
                                break;
                        }
                    }
                });
            }
            xrbVar.i0 = p08.e;
            xrbVar.j0 = tcu.d;
            xrbVar.X = kmq.c;
            fsbVar.h.b(31, qqbVar.l ? 1 : 0, xrbVar.Y, 0).b();
            xrbVar.E1(i, 3, xrbVar.Y);
            xrbVar.E1(2, 4, Integer.valueOf(xrbVar.W));
            xrbVar.E1(2, 5, 0);
            xrbVar.E1(i, 9, Boolean.valueOf(xrbVar.a0));
            xrbVar.E1(2, 7, xrbVar.z);
            xrbVar.E1(6, 8, xrbVar.z);
            xrbVar.E1(-1, 16, Integer.valueOf(xrbVar.e0));
            xrbVar.d.h();
        } catch (Throwable th4) {
            th = th4;
            xrbVar.d.h();
            throw th;
        }
    }

    public static long s1(rzk rzkVar) {
        ris risVar = new ris();
        ois oisVar = new ois();
        rzkVar.a.g(rzkVar.b.a, oisVar);
        long j = rzkVar.c;
        return j == -9223372036854775807L ? rzkVar.a.m(oisVar.c, risVar, 0L).l : oisVar.e + j;
    }

    public static rzk v1(rzk rzkVar, int i) {
        rzk h = rzkVar.h(i);
        return (i == 1 || i == 4) ? h.b(false) : h;
    }

    @Override // defpackage.i8l
    public final int A() {
        long t0 = t0();
        long duration = getDuration();
        if (t0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return dvt.i((int) ((t0 * 100) / duration), 0, 100);
    }

    @Override // defpackage.i8l
    public final void A0(List list) {
        K0(list, Integer.MAX_VALUE);
    }

    public final void A1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.p.remove(i3);
        }
        ueq ueqVar = this.M;
        int i4 = i2 - i;
        int[] iArr = ueqVar.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.M = new ueq(iArr2, new Random(ueqVar.a.nextLong()));
    }

    @Override // defpackage.i8l
    public final void B() {
        D1();
    }

    @Override // defpackage.i8l
    public final boolean B0() {
        N1();
        return false;
    }

    public final void B1() {
        l6r l6rVar = this.T;
        urb urbVar = this.y;
        if (l6rVar != null) {
            pgl n1 = n1(this.z);
            vq1.A(!n1.f);
            n1.c = 10000;
            vq1.A(!n1.f);
            n1.d = null;
            n1.b();
            this.T.a.remove(urbVar);
            this.T = null;
        }
        TextureView textureView = this.V;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != urbVar) {
                vq1.n0("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.S;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(urbVar);
            this.S = null;
        }
    }

    @Override // defpackage.i8l
    public final void C() {
        C1(v0(), -9223372036854775807L, false);
    }

    @Override // defpackage.i8l
    public final boolean C0() {
        N1();
        return this.G;
    }

    public final void C1(int i, long j, boolean z) {
        N1();
        if (i == -1) {
            return;
        }
        vq1.v(i >= 0);
        sis sisVar = this.l0.a;
        if (sisVar.p() || i < sisVar.o()) {
            uj7 uj7Var = this.s;
            if (!uj7Var.i) {
                c80 Y = uj7Var.Y();
                uj7Var.i = true;
                uj7Var.d0(Y, -1, new rj7(0));
            }
            this.H++;
            if (i()) {
                vq1.n0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                csb csbVar = new csb(this.l0);
                csbVar.e(1);
                xrb xrbVar = this.k.b;
                xrbVar.j.e(new jt6(27, xrbVar, csbVar));
                return;
            }
            rzk rzkVar = this.l0;
            int i2 = rzkVar.e;
            if (i2 == 3 || (i2 == 4 && !sisVar.p())) {
                rzkVar = this.l0.h(2);
            }
            int v0 = v0();
            rzk w1 = w1(rzkVar, sisVar, x1(sisVar, i, j));
            this.l.h.c(3, new esb(sisVar, i, dvt.Y(j))).b();
            L1(w1, 0, true, 1, p1(w1), v0, z);
        }
    }

    @Override // defpackage.i8l
    public final void D(int i, boolean z) {
        N1();
    }

    @Override // defpackage.i8l
    public final long D0() {
        N1();
        if (this.l0.a.p()) {
            return this.n0;
        }
        rzk rzkVar = this.l0;
        if (rzkVar.k.d != rzkVar.b.d) {
            return dvt.m0(rzkVar.a.m(v0(), this.a, 0L).m);
        }
        long j = rzkVar.q;
        if (this.l0.k.b()) {
            rzk rzkVar2 = this.l0;
            ois g = rzkVar2.a.g(rzkVar2.k.a, this.o);
            long d = g.d(this.l0.k.b);
            j = d == Long.MIN_VALUE ? g.d : d;
        }
        rzk rzkVar3 = this.l0;
        sis sisVar = rzkVar3.a;
        Object obj = rzkVar3.k.a;
        ois oisVar = this.o;
        sisVar.g(obj, oisVar);
        return dvt.m0(j + oisVar.e);
    }

    public final void D1() {
        int k;
        sis V = V();
        if (V.p()) {
            k = -1;
        } else {
            int v0 = v0();
            N1();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            N1();
            k = V.k(v0, i, this.G);
        }
        if (k == -1) {
            N1();
        } else if (k == v0()) {
            C1(v0(), -9223372036854775807L, true);
        } else {
            C1(k, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.i8l
    public final void E() {
        N1();
    }

    @Override // defpackage.i8l
    public final void E0(int i) {
        N1();
    }

    public final void E1(int i, int i2, Object obj) {
        for (at2 at2Var : this.g) {
            if (i == -1 || at2Var.b == i) {
                pgl n1 = n1(at2Var);
                vq1.A(!n1.f);
                n1.c = i2;
                vq1.A(!n1.f);
                n1.d = obj;
                n1.b();
            }
        }
        for (at2 at2Var2 : this.h) {
            if (at2Var2 != null && (i == -1 || at2Var2.b == i)) {
                pgl n12 = n1(at2Var2);
                vq1.A(!n12.f);
                n12.c = i2;
                vq1.A(!n12.f);
                n12.d = obj;
                n12.b();
            }
        }
    }

    @Override // defpackage.i8l
    public final void F(int i) {
        N1();
    }

    @Override // defpackage.i8l
    public final void F0() {
        N1();
        long J0 = J0() + this.w;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            J0 = Math.min(J0, duration);
        }
        C1(v0(), Math.max(J0, 0L), false);
    }

    public final void F1(List list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        int i4 = i;
        int q1 = q1(this.l0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            A1(0, arrayList.size());
        }
        ArrayList i1 = i1(list, 0);
        h1m h1mVar = new h1m(arrayList, this.M);
        boolean p = h1mVar.p();
        int i5 = h1mVar.g;
        if (!p && i4 >= i5) {
            throw new dbe();
        }
        if (z) {
            i4 = h1mVar.a(this.G);
            j2 = -9223372036854775807L;
        } else {
            if (i4 == -1) {
                i2 = q1;
                j2 = J0;
                rzk w1 = w1(this.l0, h1mVar, x1(h1mVar, i2, j2));
                i3 = w1.e;
                if (i2 != -1 && i3 != 1) {
                    i3 = (!h1mVar.p() || i2 >= i5) ? 4 : 2;
                }
                rzk v1 = v1(w1, i3);
                this.l.h.c(17, new asb(i1, this.M, i2, dvt.Y(j2))).b();
                L1(v1, 0, this.l0.b.a.equals(v1.b.a) && !this.l0.a.p(), 4, p1(v1), -1, false);
            }
            j2 = j;
        }
        i2 = i4;
        rzk w12 = w1(this.l0, h1mVar, x1(h1mVar, i2, j2));
        i3 = w12.e;
        if (i2 != -1) {
            if (h1mVar.p()) {
            }
        }
        rzk v12 = v1(w12, i3);
        this.l.h.c(17, new asb(i1, this.M, i2, dvt.Y(j2))).b();
        L1(v12, 0, this.l0.b.a.equals(v12.b.a) && !this.l0.a.p(), 4, p1(v12), -1, false);
    }

    @Override // defpackage.i8l
    public final void G(int i, int i2, List list) {
        N1();
        vq1.v(i >= 0 && i2 >= i);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (min - i == list.size()) {
            for (int i3 = i; i3 < min; i3++) {
                if (((wrb) arrayList.get(i3)).b.k.a((onh) list.get(i3 - i))) {
                }
            }
            this.H++;
            this.l.h.b(27, i, list, min).b();
            for (int i4 = i; i4 < min; i4++) {
                wrb wrbVar = (wrb) arrayList.get(i4);
                wrbVar.c = new g1m(wrbVar.c, (onh) list.get(i4 - i));
            }
            L1(this.l0.i(new h1m(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList m1 = m1(list);
        if (!arrayList.isEmpty()) {
            rzk z1 = z1(j1(this.l0, min, m1), i, min);
            L1(z1, 0, !z1.b.a.equals(this.l0.b.a), 4, p1(z1), -1, false);
        } else {
            boolean z = this.m0 == -1;
            N1();
            F1(m1, -1, -9223372036854775807L, z);
        }
    }

    @Override // defpackage.i8l
    public final void G0() {
        N1();
        long J0 = J0() + (-this.v);
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            J0 = Math.min(J0, duration);
        }
        C1(v0(), Math.max(J0, 0L), false);
    }

    public final void G1(SurfaceHolder surfaceHolder) {
        this.U = false;
        this.S = surfaceHolder;
        surfaceHolder.addCallback(this.y);
        Surface surface = this.S.getSurface();
        if (surface == null || !surface.isValid()) {
            y1(0, 0);
        } else {
            Rect surfaceFrame = this.S.getSurfaceFrame();
            y1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.i8l
    public final void H(w0t w0tVar) {
        N1();
        ct7 ct7Var = this.i;
        ct7Var.getClass();
        if (w0tVar.equals(ct7Var.d())) {
            return;
        }
        if (w0tVar instanceof a) {
            ct7Var.k((a) w0tVar);
        }
        us7 us7Var = new us7(ct7Var.d());
        us7Var.e(w0tVar);
        ct7Var.k(new a(us7Var));
        this.m.f(19, new nrb(w0tVar, 0));
    }

    @Override // defpackage.i8l
    public final hoh H0() {
        N1();
        return this.O;
    }

    public final void H1(Object obj) {
        Object obj2 = this.Q;
        boolean z = true;
        boolean z2 = (obj2 == null || obj2 == obj) ? false : true;
        long j = z2 ? this.D : -9223372036854775807L;
        fsb fsbVar = this.l;
        synchronized (fsbVar) {
            if (!fsbVar.E && fsbVar.j.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                fsbVar.h.c(30, new Pair(obj, atomicBoolean)).b();
                if (j != -9223372036854775807L) {
                    fsbVar.x0(new qo7(8, atomicBoolean), j);
                    z = atomicBoolean.get();
                }
            }
        }
        if (z2) {
            Object obj3 = this.Q;
            Surface surface = this.R;
            if (obj3 == surface) {
                surface.release();
                this.R = null;
            }
        }
        this.Q = obj;
        if (z) {
            return;
        }
        I1(new pqb(2, new wsb(3), 1003));
    }

    @Override // defpackage.i8l
    public final void I(int i) {
        J(i, i + 1);
    }

    @Override // defpackage.i8l
    public final void I0(List list) {
        N1();
        ArrayList m1 = m1(list);
        N1();
        F1(m1, -1, -9223372036854775807L, true);
    }

    public final void I1(pqb pqbVar) {
        rzk rzkVar = this.l0;
        rzk c = rzkVar.c(rzkVar.b);
        c.q = c.s;
        c.r = 0L;
        rzk v1 = v1(c, 1);
        if (pqbVar != null) {
            v1 = v1.f(pqbVar);
        }
        rzk rzkVar2 = v1;
        this.H++;
        hzr hzrVar = this.l.h;
        hzrVar.getClass();
        gzr d = hzr.d();
        d.a = hzrVar.a.obtainMessage(6);
        d.b();
        L1(rzkVar2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.i8l
    public final void J(int i, int i2) {
        N1();
        vq1.v(i >= 0 && i2 >= i);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i >= size || i == min) {
            return;
        }
        rzk z1 = z1(this.l0, i, min);
        L1(z1, 0, !z1.b.a.equals(this.l0.b.a), 4, p1(z1), -1, false);
    }

    @Override // defpackage.i8l
    public final long J0() {
        N1();
        return dvt.m0(p1(this.l0));
    }

    public final void J1() {
        d8l d8lVar = this.N;
        int i = dvt.a;
        xrb xrbVar = this.f;
        boolean i2 = xrbVar.i();
        boolean d1 = xrbVar.d1();
        boolean u1 = xrbVar.u1();
        boolean t1 = xrbVar.t1();
        boolean h1 = xrbVar.h1();
        boolean W0 = xrbVar.W0();
        boolean p = xrbVar.V().p();
        ozw ozwVar = new ozw(1, (byte) 0);
        bz2 bz2Var = (bz2) ozwVar.b;
        bz2Var.j(this.c.a);
        boolean z = !i2;
        ozwVar.a(4, z);
        ozwVar.a(5, d1 && !i2);
        ozwVar.a(6, u1 && !i2);
        ozwVar.a(7, !p && (u1 || !h1 || d1) && !i2);
        ozwVar.a(8, t1 && !i2);
        ozwVar.a(9, !p && (t1 || (h1 && W0)) && !i2);
        ozwVar.a(10, z);
        ozwVar.a(11, d1 && !i2);
        ozwVar.a(12, d1 && !i2);
        d8l d8lVar2 = new d8l(bz2Var.q());
        this.N = d8lVar2;
        if (d8lVar2.equals(d8lVar)) {
            return;
        }
        this.m.c(13, new prb(this, 3));
    }

    @Override // defpackage.i8l
    public final void K() {
        if (V().p() || i()) {
            N1();
            return;
        }
        boolean u1 = u1();
        if (h1() && !d1()) {
            if (u1) {
                D1();
                return;
            } else {
                N1();
                return;
            }
        }
        if (u1) {
            long J0 = J0();
            N1();
            if (J0 <= this.x) {
                D1();
                return;
            }
        }
        C1(v0(), 0L, false);
    }

    @Override // defpackage.i8l
    public final void K0(List list, int i) {
        N1();
        ArrayList m1 = m1(list);
        N1();
        vq1.v(i >= 0);
        ArrayList arrayList = this.p;
        int min = Math.min(i, arrayList.size());
        if (!arrayList.isEmpty()) {
            L1(j1(this.l0, min, m1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.m0 == -1;
        N1();
        F1(m1, -1, -9223372036854775807L, z);
    }

    public final void K1(int i, boolean z) {
        rzk rzkVar = this.l0;
        int i2 = rzkVar.n;
        int i3 = (i2 != 1 || z) ? 0 : 1;
        if (rzkVar.l == z && i2 == i3 && rzkVar.m == i) {
            return;
        }
        this.H++;
        if (rzkVar.p) {
            rzkVar = rzkVar.a();
        }
        rzk e = rzkVar.e(i, i3, z);
        this.l.h.a(1, z ? 1 : 0, i | (i3 << 4)).b();
        L1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.i8l
    public final void L(boolean z) {
        N1();
        K1(1, z);
    }

    @Override // defpackage.i8l
    public final long L0() {
        N1();
        return this.v;
    }

    public final void L1(final rzk rzkVar, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        onh onhVar;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        Object obj;
        onh onhVar2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long j4;
        long s1;
        Object obj3;
        onh onhVar3;
        Object obj4;
        int i7;
        rzk rzkVar2 = this.l0;
        this.l0 = rzkVar;
        boolean equals = rzkVar2.a.equals(rzkVar.a);
        ris risVar = this.a;
        ois oisVar = this.o;
        sis sisVar = rzkVar2.a;
        uvh uvhVar = rzkVar2.b;
        sis sisVar2 = rzkVar.a;
        uvh uvhVar2 = rzkVar.b;
        if (sisVar2.p() && sisVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (sisVar2.p() != sisVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (sisVar.m(sisVar.g(uvhVar.a, oisVar).c, risVar, 0L).a.equals(sisVar2.m(sisVar2.g(uvhVar2.a, oisVar).c, risVar, 0L).a)) {
            pair = (z && i2 == 0 && uvhVar.d < uvhVar2.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    e7o.n();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            onhVar = !rzkVar.a.p() ? rzkVar.a.m(rzkVar.a.g(rzkVar.b.a, this.o).c, this.a, 0L).c : null;
            this.k0 = hoh.K;
        } else {
            onhVar = null;
        }
        if (booleanValue || !rzkVar2.j.equals(rzkVar.j)) {
            eoh a = this.k0.a();
            List list = rzkVar.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                u2i u2iVar = (u2i) list.get(i8);
                int i9 = 0;
                while (true) {
                    n2i[] n2iVarArr = u2iVar.a;
                    if (i9 < n2iVarArr.length) {
                        n2iVarArr[i9].populateMediaMetadata(a);
                        i9++;
                    }
                }
            }
            this.k0 = new hoh(a);
        }
        hoh k1 = k1();
        boolean equals2 = k1.equals(this.O);
        this.O = k1;
        boolean z6 = rzkVar2.l != rzkVar.l;
        boolean z7 = rzkVar2.e != rzkVar.e;
        if (z7 || z6) {
            M1();
        }
        boolean z8 = rzkVar2.g;
        boolean z9 = rzkVar.g;
        boolean z10 = z8 != z9;
        if (z10) {
            int i10 = this.e0;
            ssm ssmVar = this.f0;
            if (ssmVar != null) {
                if (z9 && !this.g0) {
                    ssmVar.a(i10);
                    this.g0 = true;
                } else if (!z9 && this.g0) {
                    ssmVar.d(i10);
                    this.g0 = false;
                }
            }
        }
        if (!equals) {
            this.m.c(0, new jrb(rzkVar, i, 2));
        }
        if (z) {
            ois oisVar2 = new ois();
            if (rzkVar2.a.p()) {
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                i5 = i3;
                obj = null;
                onhVar2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = rzkVar2.b.a;
                rzkVar2.a.g(obj5, oisVar2);
                int i11 = oisVar2.c;
                int b = rzkVar2.a.b(obj5);
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                obj = rzkVar2.a.m(i11, this.a, 0L).a;
                onhVar2 = this.a.c;
                obj2 = obj5;
                i5 = i11;
                i6 = b;
            }
            uvh uvhVar3 = rzkVar2.b;
            if (i2 == 0) {
                boolean b2 = uvhVar3.b();
                uvh uvhVar4 = rzkVar2.b;
                if (b2) {
                    j4 = oisVar2.a(uvhVar4.b, uvhVar4.c);
                    s1 = s1(rzkVar2);
                } else if (uvhVar4.e != -1) {
                    j4 = s1(this.l0);
                    s1 = j4;
                } else {
                    j2 = oisVar2.e;
                    j3 = oisVar2.d;
                    j4 = j2 + j3;
                    s1 = j4;
                }
            } else if (uvhVar3.b()) {
                j4 = rzkVar2.s;
                s1 = s1(rzkVar2);
            } else {
                j2 = oisVar2.e;
                j3 = rzkVar2.s;
                j4 = j2 + j3;
                s1 = j4;
            }
            long m0 = dvt.m0(j4);
            long m02 = dvt.m0(s1);
            uvh uvhVar5 = rzkVar2.b;
            g8l g8lVar = new g8l(obj, i5, onhVar2, obj2, i6, m0, m02, uvhVar5.b, uvhVar5.c);
            ris risVar2 = this.a;
            int v0 = v0();
            if (this.l0.a.p()) {
                obj3 = null;
                onhVar3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                rzk rzkVar3 = this.l0;
                Object obj6 = rzkVar3.b.a;
                rzkVar3.a.g(obj6, this.o);
                int b3 = this.l0.a.b(obj6);
                Object obj7 = this.l0.a.m(v0, risVar2, 0L).a;
                onhVar3 = risVar2.c;
                i7 = b3;
                obj4 = obj6;
                obj3 = obj7;
            }
            long m03 = dvt.m0(j);
            long m04 = this.l0.b.b() ? dvt.m0(s1(this.l0)) : m03;
            uvh uvhVar6 = this.l0.b;
            this.m.c(11, new nj7(i2, g8lVar, new g8l(obj3, v0, onhVar3, obj4, i7, m03, m04, uvhVar6.b, uvhVar6.c)));
        } else {
            z3 = booleanValue;
            z4 = equals2;
            z5 = z7;
        }
        if (z3) {
            this.m.c(1, new jrb(onhVar, intValue, 0));
        }
        if (rzkVar2.f != rzkVar.f) {
            final int i12 = 0;
            this.m.c(10, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj8) {
                    f8l f8lVar = (f8l) obj8;
                    switch (i12) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
            if (rzkVar.f != null) {
                final int i13 = 1;
                this.m.c(10, new ycg() { // from class: krb
                    @Override // defpackage.ycg
                    public final void invoke(Object obj8) {
                        f8l f8lVar = (f8l) obj8;
                        switch (i13) {
                            case 0:
                                f8lVar.O(rzkVar.f);
                                break;
                            case 1:
                                f8lVar.L(rzkVar.f);
                                break;
                            case 2:
                                f8lVar.M((e3t) rzkVar.i.e);
                                break;
                            case 3:
                                rzk rzkVar4 = rzkVar;
                                f8lVar.n(rzkVar4.g);
                                f8lVar.F(rzkVar4.g);
                                break;
                            case 4:
                                rzk rzkVar5 = rzkVar;
                                f8lVar.S(rzkVar5.e, rzkVar5.l);
                                break;
                            case 5:
                                f8lVar.p(rzkVar.e);
                                break;
                            case 6:
                                rzk rzkVar6 = rzkVar;
                                f8lVar.G(rzkVar6.m, rzkVar6.l);
                                break;
                            case 7:
                                f8lVar.m(rzkVar.n);
                                break;
                            case 8:
                                f8lVar.X(rzkVar.l());
                                break;
                            default:
                                f8lVar.U(rzkVar.o);
                                break;
                        }
                    }
                });
            }
        }
        c1t c1tVar = rzkVar2.i;
        c1t c1tVar2 = rzkVar.i;
        if (c1tVar != c1tVar2) {
            ct7 ct7Var = this.i;
            Object obj8 = c1tVar2.f;
            ct7Var.getClass();
            ct7Var.c = (qah) obj8;
            final int i14 = 2;
            this.m.c(2, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i14) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (!z4) {
            this.m.c(14, new lrb(this.O, 0));
        }
        if (z10) {
            final int i15 = 3;
            this.m.c(3, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i15) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (z5 || z6) {
            final int i16 = 4;
            this.m.c(-1, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i16) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i17 = 5;
            this.m.c(4, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i17) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (z6 || rzkVar2.m != rzkVar.m) {
            final int i18 = 6;
            this.m.c(5, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i18) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (rzkVar2.n != rzkVar.n) {
            final int i19 = 7;
            this.m.c(6, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i19) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (rzkVar2.l() != rzkVar.l()) {
            final int i20 = 8;
            this.m.c(7, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i20) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        if (!rzkVar2.o.equals(rzkVar.o)) {
            final int i21 = 9;
            this.m.c(12, new ycg() { // from class: krb
                @Override // defpackage.ycg
                public final void invoke(Object obj82) {
                    f8l f8lVar = (f8l) obj82;
                    switch (i21) {
                        case 0:
                            f8lVar.O(rzkVar.f);
                            break;
                        case 1:
                            f8lVar.L(rzkVar.f);
                            break;
                        case 2:
                            f8lVar.M((e3t) rzkVar.i.e);
                            break;
                        case 3:
                            rzk rzkVar4 = rzkVar;
                            f8lVar.n(rzkVar4.g);
                            f8lVar.F(rzkVar4.g);
                            break;
                        case 4:
                            rzk rzkVar5 = rzkVar;
                            f8lVar.S(rzkVar5.e, rzkVar5.l);
                            break;
                        case 5:
                            f8lVar.p(rzkVar.e);
                            break;
                        case 6:
                            rzk rzkVar6 = rzkVar;
                            f8lVar.G(rzkVar6.m, rzkVar6.l);
                            break;
                        case 7:
                            f8lVar.m(rzkVar.n);
                            break;
                        case 8:
                            f8lVar.X(rzkVar.l());
                            break;
                        default:
                            f8lVar.U(rzkVar.o);
                            break;
                    }
                }
            });
        }
        J1();
        this.m.b();
        if (rzkVar2.p != rzkVar.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((urb) it.next()).a.M1();
            }
        }
    }

    @Override // defpackage.i8l
    public final void M() {
        int e;
        sis V = V();
        if (V.p()) {
            e = -1;
        } else {
            int v0 = v0();
            N1();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            N1();
            e = V.e(v0, i, this.G);
        }
        if (e == -1) {
            N1();
        } else if (e == v0()) {
            C1(v0(), -9223372036854775807L, true);
        } else {
            C1(e, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.i8l
    public final onh M0() {
        sis V = V();
        if (V.p()) {
            return null;
        }
        return V.m(v0(), this.a, 0L).c;
    }

    public final void M1() {
        int c = c();
        kj3 kj3Var = this.C;
        kj3 kj3Var2 = this.B;
        boolean z = false;
        if (c != 1) {
            if (c == 2 || c == 3) {
                N1();
                boolean z2 = this.l0.p;
                if (g0() && !z2) {
                    z = true;
                }
                kj3Var2.c(z);
                kj3Var.c(g0());
                return;
            }
            if (c != 4) {
                e7o.n();
                return;
            }
        }
        kj3Var2.c(false);
        kj3Var.c(false);
    }

    @Override // defpackage.i8l
    public final void N(int i) {
        N1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N0(int i) {
        N1();
        sj sjVar = this.E;
        if (((Integer) sjVar.i()).intValue() == i) {
            return;
        }
        jrb jrbVar = new jrb(this, i, 1);
        vq1.A(Looper.myLooper() == ((hzr) sjVar.c).a.getLooper());
        sjVar.a++;
        ((hzr) sjVar.b).e(new qf0(7, sjVar, jrbVar));
        Integer num = (Integer) sjVar.e;
        if (i == 0) {
            i = num.intValue();
        }
        sjVar.r(Integer.valueOf(i));
    }

    public final void N1() {
        this.d.c();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = dvt.a;
            Locale locale = Locale.US;
            String s = hrg.s("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.c0) {
                xq0.q(s);
            } else {
                vq1.o0("ExoPlayerImpl", s, this.d0 ? null : new IllegalStateException());
                this.d0 = true;
            }
        }
    }

    @Override // defpackage.i8l
    public final e3t O() {
        N1();
        return (e3t) this.l0.i.e;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void O0(boolean z) {
        boolean z2;
        N1();
        if (this.K != z) {
            this.K = z;
            fsb fsbVar = this.l;
            synchronized (fsbVar) {
                z2 = true;
                if (!fsbVar.E && fsbVar.j.getThread().isAlive()) {
                    if (z) {
                        fsbVar.h.a(13, 1, 0).b();
                    } else {
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        fsbVar.h.b(13, 0, atomicBoolean, 0).b();
                        fsbVar.x0(new qo7(8, atomicBoolean), fsbVar.C0);
                        z2 = atomicBoolean.get();
                    }
                }
            }
            if (z2) {
                return;
            }
            I1(new pqb(2, new wsb(2), 1003));
        }
    }

    @Override // defpackage.i8l
    public final void P(dv1 dv1Var, boolean z) {
        N1();
        if (this.h0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, dv1Var);
        bdg bdgVar = this.m;
        if (!equals) {
            this.Y = dv1Var;
            E1(1, 3, dv1Var);
            bdgVar.c(20, new rrb(dv1Var, 0));
        }
        this.l.h.b(31, z ? 1 : 0, this.Y, 0).b();
        bdgVar.b();
    }

    @Override // defpackage.i8l
    public final boolean P0() {
        return W0();
    }

    @Override // defpackage.i8l
    public final void Q(hoh hohVar) {
        N1();
        if (hohVar.equals(this.P)) {
            return;
        }
        this.P = hohVar;
        this.m.f(15, new prb(this, 4));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void Q0(hap hapVar) {
        N1();
        if (hapVar == null) {
            hapVar = hap.e;
        }
        if (this.L.equals(hapVar)) {
            return;
        }
        this.L = hapVar;
        this.l.h.c(5, hapVar).b();
    }

    @Override // defpackage.i8l
    public final int R() {
        N1();
        if (i()) {
            return this.l0.b.b;
        }
        return -1;
    }

    @Override // defpackage.i8l
    public final int R0() {
        return v0();
    }

    @Override // defpackage.i8l
    public final void S(boolean z) {
        N1();
    }

    @Override // defpackage.i8l
    public final Object S0() {
        sis V = V();
        if (V.p()) {
            return null;
        }
        return V.m(v0(), this.a, 0L).d;
    }

    @Override // defpackage.i8l
    public final void T(onh onhVar) {
        I0(yde.y(onhVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void T0(wvh wvhVar) {
        N1();
        List singletonList = Collections.singletonList(wvhVar);
        N1();
        N1();
        F1(singletonList, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.i8l
    public final int U() {
        N1();
        return this.l0.n;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void U0(wvh wvhVar) {
        N1();
        List singletonList = Collections.singletonList(wvhVar);
        N1();
        F1(singletonList, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.i8l
    public final sis V() {
        N1();
        return this.l0.a;
    }

    @Override // defpackage.i8l
    public final boolean V0(int i) {
        N1();
        return this.N.a(i);
    }

    @Override // defpackage.i8l
    public final void W(int i, onh onhVar) {
        G(i, i + 1, yde.y(onhVar));
    }

    @Override // defpackage.i8l
    public final boolean W0() {
        sis V = V();
        return !V.p() && V.m(v0(), this.a, 0L).i;
    }

    @Override // defpackage.i8l
    public final Looper X() {
        return this.t;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void X0(wvh wvhVar, long j) {
        N1();
        List singletonList = Collections.singletonList(wvhVar);
        N1();
        F1(singletonList, 0, j, false);
    }

    @Override // defpackage.i8l
    public final void Y() {
        N1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final q0t Y0() {
        N1();
        return new q0t((zsb[]) this.l0.i.d);
    }

    @Override // defpackage.i8l
    public final w0t Z() {
        N1();
        return this.i.d();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int Z0(int i) {
        N1();
        return this.g[i].b;
    }

    @Override // defpackage.i8l
    public final void a() {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.6.1] [");
        sb.append(dvt.b);
        sb.append("] [");
        HashSet hashSet = ynh.a;
        synchronized (ynh.class) {
            str = ynh.b;
        }
        sb.append(str);
        sb.append("]");
        vq1.Y("ExoPlayerImpl", sb.toString());
        N1();
        this.A.g0();
        this.B.c(false);
        this.C.c(false);
        fsb fsbVar = this.l;
        synchronized (fsbVar) {
            if (!fsbVar.E && fsbVar.j.getThread().isAlive()) {
                fsbVar.h.g(7);
                fsbVar.x0(new qo7(7, fsbVar), fsbVar.v);
                z = fsbVar.E;
            }
            z = true;
        }
        int i = 25;
        if (!z) {
            this.m.f(10, new xla(25));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        this.u.f(this.s);
        rzk rzkVar = this.l0;
        if (rzkVar.p) {
            this.l0 = rzkVar.a();
        }
        rzk v1 = v1(this.l0, 1);
        this.l0 = v1;
        rzk c = v1.c(v1.b);
        this.l0 = c;
        c.q = c.s;
        this.l0.r = 0L;
        uj7 uj7Var = this.s;
        hzr hzrVar = uj7Var.h;
        vq1.B(hzrVar);
        hzrVar.e(new he0(i, uj7Var));
        B1();
        Surface surface = this.R;
        if (surface != null) {
            surface.release();
            this.R = null;
        }
        if (this.g0) {
            ssm ssmVar = this.f0;
            ssmVar.getClass();
            ssmVar.d(this.e0);
            this.g0 = false;
        }
        this.b0 = sv6.c;
        this.h0 = true;
    }

    @Override // defpackage.i8l
    public final void a0(int i, long j, List list) {
        N1();
        ArrayList m1 = m1(list);
        N1();
        F1(m1, i, j, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a1(ssm ssmVar) {
        N1();
        if (Objects.equals(this.f0, ssmVar)) {
            return;
        }
        boolean z = this.g0;
        int i = this.e0;
        if (z) {
            ssm ssmVar2 = this.f0;
            ssmVar2.getClass();
            ssmVar2.d(i);
        }
        if (f()) {
            ssmVar.a(i);
            this.g0 = true;
        } else {
            this.g0 = false;
        }
        this.f0 = ssmVar;
    }

    @Override // defpackage.i8l
    public final void b() {
        L(false);
    }

    @Override // defpackage.i8l
    public final void b0() {
        int e;
        if (V().p() || i()) {
            N1();
            return;
        }
        if (!t1()) {
            if (h1() && W0()) {
                C1(v0(), -9223372036854775807L, false);
                return;
            } else {
                N1();
                return;
            }
        }
        sis V = V();
        if (V.p()) {
            e = -1;
        } else {
            int v0 = v0();
            N1();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            N1();
            e = V.e(v0, i, this.G);
        }
        if (e == -1) {
            N1();
        } else if (e == v0()) {
            C1(v0(), -9223372036854775807L, true);
        } else {
            C1(e, -9223372036854775807L, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void b1(d80 d80Var) {
        N1();
        d80Var.getClass();
        this.s.f.e(d80Var);
    }

    @Override // defpackage.i8l
    public final int c() {
        N1();
        return this.l0.e;
    }

    @Override // defpackage.i8l
    public final int c0() {
        N1();
        return 0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void c1(d80 d80Var) {
        d80Var.getClass();
        uj7 uj7Var = this.s;
        uj7Var.getClass();
        uj7Var.f.a(d80Var);
    }

    @Override // defpackage.i8l
    public final void d() {
        L(true);
    }

    @Override // defpackage.i8l
    public final long d0() {
        sis V = V();
        if (V.p()) {
            return -9223372036854775807L;
        }
        int v0 = v0();
        ris risVar = this.a;
        if (V.m(v0, risVar, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (dvt.H(risVar.g) - risVar.f) - s0();
    }

    @Override // defpackage.i8l
    public final boolean d1() {
        sis V = V();
        return !V.p() && V.m(v0(), this.a, 0L).h;
    }

    @Override // defpackage.i8l
    public final boolean e() {
        return c() == 3 && g0() && U() == 0;
    }

    @Override // defpackage.i8l
    public final void e0(int i, long j) {
        C1(i, j, false);
    }

    @Override // defpackage.i8l
    public final boolean e1() {
        return h1();
    }

    @Override // defpackage.i8l
    public final boolean f() {
        N1();
        return this.l0.g;
    }

    @Override // defpackage.i8l
    public final d8l f0() {
        N1();
        return this.N;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final uj7 f1() {
        N1();
        return this.s;
    }

    @Override // defpackage.i8l
    public final int g() {
        N1();
        return this.F;
    }

    @Override // defpackage.i8l
    public final boolean g0() {
        N1();
        return this.l0.l;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int g1() {
        N1();
        return ((Integer) this.E.i()).intValue();
    }

    @Override // defpackage.i8l
    public final long getDuration() {
        N1();
        if (!i()) {
            return o();
        }
        rzk rzkVar = this.l0;
        uvh uvhVar = rzkVar.b;
        sis sisVar = rzkVar.a;
        Object obj = uvhVar.a;
        ois oisVar = this.o;
        sisVar.g(obj, oisVar);
        return dvt.m0(oisVar.a(uvhVar.b, uvhVar.c));
    }

    @Override // defpackage.i8l
    public final float getVolume() {
        N1();
        return this.Z;
    }

    @Override // defpackage.i8l
    public final void h(Surface surface) {
        N1();
        B1();
        H1(surface);
        int i = surface == null ? 0 : -1;
        y1(i, i);
    }

    @Override // defpackage.i8l
    public final void h0(boolean z) {
        N1();
        if (this.G != z) {
            this.G = z;
            this.l.h.a(12, z ? 1 : 0, 0).b();
            qrb qrbVar = new qrb(0, z);
            bdg bdgVar = this.m;
            bdgVar.c(9, qrbVar);
            J1();
            bdgVar.b();
        }
    }

    @Override // defpackage.i8l
    public final boolean h1() {
        sis V = V();
        return !V.p() && V.m(v0(), this.a, 0L).a();
    }

    @Override // defpackage.i8l
    public final boolean i() {
        N1();
        return this.l0.b.b();
    }

    @Override // defpackage.i8l
    public final long i0() {
        N1();
        return this.x;
    }

    public final ArrayList i1(List list, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            mwh mwhVar = new mwh((wvh) list.get(i2), this.q);
            arrayList.add(mwhVar);
            wrb wrbVar = new wrb(mwhVar.b, mwhVar.a);
            this.p.add(i2 + i, wrbVar);
        }
        this.M = this.M.a(i, arrayList.size());
        return arrayList;
    }

    @Override // defpackage.i8l
    public final void j(SurfaceView surfaceView) {
        N1();
        if (surfaceView instanceof wau) {
            B1();
            H1(surfaceView);
            G1(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof l6r;
        urb urbVar = this.y;
        if (z) {
            B1();
            this.T = (l6r) surfaceView;
            pgl n1 = n1(this.z);
            vq1.A(!n1.f);
            n1.c = 10000;
            l6r l6rVar = this.T;
            vq1.A(true ^ n1.f);
            n1.d = l6rVar;
            n1.b();
            this.T.a.add(urbVar);
            H1(this.T.getVideoSurface());
            G1(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        N1();
        if (holder == null) {
            l1();
            return;
        }
        B1();
        this.U = true;
        this.S = holder;
        holder.addCallback(urbVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            H1(null);
            y1(0, 0);
        } else {
            H1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            y1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.i8l
    public final void j0(f8l f8lVar) {
        f8lVar.getClass();
        this.m.a(f8lVar);
    }

    public final rzk j1(rzk rzkVar, int i, ArrayList arrayList) {
        sis sisVar = rzkVar.a;
        this.H++;
        ArrayList i1 = i1(arrayList, i);
        h1m h1mVar = new h1m(this.p, this.M);
        rzk w1 = w1(rzkVar, h1mVar, r1(sisVar, h1mVar, q1(rzkVar), o1(rzkVar)));
        this.l.h.b(18, i, new asb(i1, this.M, -1, -9223372036854775807L), 0).b();
        return w1;
    }

    @Override // defpackage.i8l
    public final pqb k() {
        N1();
        return this.l0.f;
    }

    @Override // defpackage.i8l
    public final int k0() {
        N1();
        if (this.l0.a.p()) {
            return 0;
        }
        rzk rzkVar = this.l0;
        return rzkVar.a.b(rzkVar.b.a);
    }

    public final hoh k1() {
        sis V = V();
        if (V.p()) {
            return this.k0;
        }
        onh onhVar = V.m(v0(), this.a, 0L).c;
        eoh a = this.k0.a();
        hoh hohVar = onhVar.d;
        if (hohVar != null) {
            yde ydeVar = hohVar.J;
            byte[] bArr = hohVar.k;
            CharSequence charSequence = hohVar.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = hohVar.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = hohVar.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = hohVar.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = hohVar.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = hohVar.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = hohVar.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = hohVar.h;
            if (l != null) {
                a.c(l);
            }
            gin ginVar = hohVar.i;
            if (ginVar != null) {
                a.i = ginVar;
            }
            gin ginVar2 = hohVar.j;
            if (ginVar2 != null) {
                a.j = ginVar2;
            }
            Uri uri = hohVar.m;
            if (uri != null || bArr != null) {
                a.m = uri;
                a.b(bArr, hohVar.l);
            }
            Integer num = hohVar.n;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = hohVar.o;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = hohVar.p;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = hohVar.q;
            if (bool != null) {
                a.q = bool;
            }
            Boolean bool2 = hohVar.r;
            if (bool2 != null) {
                a.r = bool2;
            }
            Integer num4 = hohVar.s;
            if (num4 != null) {
                a.s = num4;
            }
            Integer num5 = hohVar.t;
            if (num5 != null) {
                a.s = num5;
            }
            Integer num6 = hohVar.u;
            if (num6 != null) {
                a.t = num6;
            }
            Integer num7 = hohVar.v;
            if (num7 != null) {
                a.u = num7;
            }
            Integer num8 = hohVar.w;
            if (num8 != null) {
                a.v = num8;
            }
            Integer num9 = hohVar.x;
            if (num9 != null) {
                a.w = num9;
            }
            Integer num10 = hohVar.y;
            if (num10 != null) {
                a.x = num10;
            }
            CharSequence charSequence8 = hohVar.z;
            if (charSequence8 != null) {
                a.y = charSequence8;
            }
            CharSequence charSequence9 = hohVar.A;
            if (charSequence9 != null) {
                a.z = charSequence9;
            }
            CharSequence charSequence10 = hohVar.B;
            if (charSequence10 != null) {
                a.A = charSequence10;
            }
            Integer num11 = hohVar.C;
            if (num11 != null) {
                a.B = num11;
            }
            Integer num12 = hohVar.D;
            if (num12 != null) {
                a.C = num12;
            }
            CharSequence charSequence11 = hohVar.E;
            if (charSequence11 != null) {
                a.D = charSequence11;
            }
            CharSequence charSequence12 = hohVar.F;
            if (charSequence12 != null) {
                a.E = charSequence12;
            }
            CharSequence charSequence13 = hohVar.G;
            if (charSequence13 != null) {
                a.F = charSequence13;
            }
            Integer num13 = hohVar.H;
            if (num13 != null) {
                a.G = num13;
            }
            Bundle bundle = hohVar.I;
            if (bundle != null) {
                a.H = bundle;
            }
            if (!ydeVar.isEmpty()) {
                a.I = yde.v(ydeVar);
            }
        }
        return new hoh(a);
    }

    @Override // defpackage.i8l
    public final sv6 l() {
        N1();
        return this.b0;
    }

    @Override // defpackage.i8l
    public final tcu l0() {
        N1();
        return this.j0;
    }

    public final void l1() {
        N1();
        B1();
        H1(null);
        y1(0, 0);
    }

    @Override // defpackage.i8l
    public final p0l m() {
        N1();
        return this.l0.o;
    }

    @Override // defpackage.i8l
    public final dv1 m0() {
        N1();
        return this.Y;
    }

    public final ArrayList m1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.d((onh) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.i8l
    public final void n(TextureView textureView) {
        N1();
        if (textureView == null) {
            l1();
            return;
        }
        B1();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            vq1.n0("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            H1(null);
            y1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            H1(surface);
            this.R = surface;
            y1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.i8l
    public final p08 n0() {
        N1();
        return this.i0;
    }

    public final pgl n1(ogl oglVar) {
        int q1 = q1(this.l0);
        sis sisVar = this.l0.a;
        if (q1 == -1) {
            q1 = 0;
        }
        fsb fsbVar = this.l;
        return new pgl(fsbVar, oglVar, sisVar, q1, fsbVar.j);
    }

    @Override // defpackage.i8l
    public final long o() {
        sis V = V();
        if (V.p()) {
            return -9223372036854775807L;
        }
        return dvt.m0(V.m(v0(), this.a, 0L).m);
    }

    @Override // defpackage.i8l
    public final void o0(int i, int i2) {
        N1();
    }

    public final long o1(rzk rzkVar) {
        uvh uvhVar = rzkVar.b;
        long j = rzkVar.c;
        sis sisVar = rzkVar.a;
        if (!uvhVar.b()) {
            return dvt.m0(p1(rzkVar));
        }
        Object obj = rzkVar.b.a;
        ois oisVar = this.o;
        sisVar.g(obj, oisVar);
        if (j == -9223372036854775807L) {
            return dvt.m0(sisVar.m(q1(rzkVar), this.a, 0L).l);
        }
        return dvt.m0(j) + dvt.m0(oisVar.e);
    }

    @Override // defpackage.i8l
    public final void p(TextureView textureView) {
        N1();
        if (textureView == null || textureView != this.V) {
            return;
        }
        l1();
    }

    @Override // defpackage.i8l
    public final int p0() {
        N1();
        if (i()) {
            return this.l0.b.c;
        }
        return -1;
    }

    public final long p1(rzk rzkVar) {
        if (rzkVar.a.p()) {
            return dvt.Y(this.n0);
        }
        long k = rzkVar.p ? rzkVar.k() : rzkVar.s;
        if (rzkVar.b.b()) {
            return k;
        }
        sis sisVar = rzkVar.a;
        Object obj = rzkVar.b.a;
        ois oisVar = this.o;
        sisVar.g(obj, oisVar);
        return k + oisVar.e;
    }

    @Override // defpackage.i8l
    public final void q() {
        N1();
        rzk rzkVar = this.l0;
        if (rzkVar.e != 1) {
            return;
        }
        rzk f = rzkVar.f(null);
        rzk v1 = v1(f, f.a.p() ? 4 : 2);
        this.H++;
        hzr hzrVar = this.l.h;
        hzrVar.getClass();
        gzr d = hzr.d();
        d.a = hzrVar.a.obtainMessage(29);
        d.b();
        L1(v1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.i8l
    public final void q0(int i) {
        C1(i, -9223372036854775807L, false);
    }

    public final int q1(rzk rzkVar) {
        return rzkVar.a.p() ? this.m0 : rzkVar.a.g(rzkVar.b.a, this.o).c;
    }

    @Override // defpackage.i8l
    public final void r(p0l p0lVar) {
        N1();
        if (this.l0.o.equals(p0lVar)) {
            return;
        }
        rzk g = this.l0.g(p0lVar);
        this.H++;
        this.l.h.c(4, p0lVar).b();
        L1(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.i8l
    public final long r0() {
        N1();
        return this.w;
    }

    public final Pair r1(sis sisVar, h1m h1mVar, int i, long j) {
        if (sisVar.p() || h1mVar.p()) {
            boolean z = !sisVar.p() && h1mVar.p();
            return x1(h1mVar, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair i2 = sisVar.i(this.a, this.o, i, dvt.Y(j));
        Object obj = i2.first;
        if (h1mVar.b(obj) != -1) {
            return i2;
        }
        int R = fsb.R(this.a, this.o, this.F, this.G, obj, sisVar, h1mVar);
        if (R == -1) {
            return x1(h1mVar, -1, -9223372036854775807L);
        }
        ris risVar = this.a;
        h1mVar.m(R, risVar, 0L);
        return x1(h1mVar, R, dvt.m0(risVar.l));
    }

    @Override // defpackage.i8l
    public final void s(long j) {
        C1(v0(), j, false);
    }

    @Override // defpackage.i8l
    public final long s0() {
        N1();
        return o1(this.l0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        N1();
        E1(4, 15, imageOutput);
    }

    @Override // defpackage.i8l
    public final void stop() {
        N1();
        I1(null);
        this.b0 = new sv6(qsn.e, this.l0.s);
    }

    @Override // defpackage.i8l
    public final void t(float f) {
        N1();
        float h = dvt.h(f, 0.0f, 1.0f);
        if (this.Z == h) {
            return;
        }
        this.Z = h;
        this.l.h.c(32, Float.valueOf(h)).b();
        this.m.f(22, new mrb(0, h));
    }

    @Override // defpackage.i8l
    public final long t0() {
        N1();
        if (!i()) {
            return D0();
        }
        rzk rzkVar = this.l0;
        return rzkVar.k.equals(rzkVar.b) ? dvt.m0(this.l0.q) : getDuration();
    }

    public final boolean t1() {
        int e;
        sis V = V();
        if (V.p()) {
            e = -1;
        } else {
            int v0 = v0();
            N1();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            N1();
            e = V.e(v0, i, this.G);
        }
        return e != -1;
    }

    @Override // defpackage.i8l
    public final void u(float f) {
        r(m().a(f));
    }

    @Override // defpackage.i8l
    public final hoh u0() {
        N1();
        return this.P;
    }

    public final boolean u1() {
        int k;
        sis V = V();
        if (V.p()) {
            k = -1;
        } else {
            int v0 = v0();
            N1();
            int i = this.F;
            if (i == 1) {
                i = 0;
            }
            N1();
            k = V.k(v0, i, this.G);
        }
        return k != -1;
    }

    @Override // defpackage.i8l
    public final void v(SurfaceView surfaceView) {
        N1();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        N1();
        if (holder == null || holder != this.S) {
            return;
        }
        l1();
    }

    @Override // defpackage.i8l
    public final int v0() {
        N1();
        int q1 = q1(this.l0);
        if (q1 == -1) {
            return 0;
        }
        return q1;
    }

    @Override // defpackage.i8l
    public final long w() {
        N1();
        return dvt.m0(this.l0.r);
    }

    @Override // defpackage.i8l
    public final void w0(int i) {
        N1();
        if (this.F != i) {
            this.F = i;
            this.l.h.a(11, i, 0).b();
            irb irbVar = new irb(i, 1);
            bdg bdgVar = this.m;
            bdgVar.c(8, irbVar);
            J1();
            bdgVar.b();
        }
    }

    public final rzk w1(rzk rzkVar, sis sisVar, Pair pair) {
        List list;
        vq1.v(sisVar.p() || pair != null);
        sis sisVar2 = rzkVar.a;
        long o1 = o1(rzkVar);
        rzk i = rzkVar.i(sisVar);
        if (sisVar.p()) {
            uvh uvhVar = rzk.u;
            long Y = dvt.Y(this.n0);
            rzk c = i.d(uvhVar, Y, Y, Y, 0L, yvs.d, this.b, qsn.e).c(uvhVar);
            c.q = c.s;
            return c;
        }
        Object obj = i.b.a;
        int i2 = dvt.a;
        boolean equals = obj.equals(pair.first);
        uvh uvhVar2 = !equals ? new uvh(pair.first) : i.b;
        long longValue = ((Long) pair.second).longValue();
        long Y2 = dvt.Y(o1);
        if (!sisVar2.p()) {
            Y2 -= sisVar2.g(obj, this.o).e;
        }
        if (!equals || longValue < Y2) {
            uvh uvhVar3 = uvhVar2;
            vq1.A(!uvhVar3.b());
            yvs yvsVar = !equals ? yvs.d : i.h;
            c1t c1tVar = !equals ? this.b : i.i;
            if (equals) {
                list = i.j;
            } else {
                ude udeVar = yde.b;
                list = qsn.e;
            }
            rzk c2 = i.d(uvhVar3, longValue, longValue, longValue, 0L, yvsVar, c1tVar, list).c(uvhVar3);
            c2.q = longValue;
            return c2;
        }
        if (longValue != Y2) {
            uvh uvhVar4 = uvhVar2;
            vq1.A(!uvhVar4.b());
            long max = Math.max(0L, i.r - (longValue - Y2));
            long j = i.q;
            if (i.k.equals(i.b)) {
                j = longValue + max;
            }
            rzk d = i.d(uvhVar4, longValue, longValue, longValue, max, i.h, i.i, i.j);
            d.q = j;
            return d;
        }
        int b = sisVar.b(i.k.a);
        if (b != -1 && sisVar.f(b, this.o, false).c == sisVar.g(uvhVar2.a, this.o).c) {
            return i;
        }
        sisVar.g(uvhVar2.a, this.o);
        boolean b2 = uvhVar2.b();
        ois oisVar = this.o;
        long a = b2 ? oisVar.a(uvhVar2.b, uvhVar2.c) : oisVar.d;
        uvh uvhVar5 = uvhVar2;
        rzk c3 = i.d(uvhVar5, i.s, i.s, i.d, a - i.s, i.h, i.i, i.j).c(uvhVar5);
        c3.q = a;
        return c3;
    }

    @Override // defpackage.i8l
    public final void x(onh onhVar, long j) {
        a0(0, j, yde.y(onhVar));
    }

    @Override // defpackage.i8l
    public final void x0(f8l f8lVar) {
        N1();
        f8lVar.getClass();
        this.m.e(f8lVar);
    }

    public final Pair x1(sis sisVar, int i, long j) {
        if (sisVar.p()) {
            this.m0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.n0 = j;
            return null;
        }
        if (i == -1 || i >= sisVar.o()) {
            i = sisVar.a(this.G);
            j = dvt.m0(sisVar.m(i, this.a, 0L).l);
        }
        return sisVar.i(this.a, this.o, i, dvt.Y(j));
    }

    @Override // defpackage.i8l
    public final void y() {
        J(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.i8l
    public final void y0(int i, int i2) {
        if (i != i2) {
            z0(i, i + 1, i2);
        }
    }

    public final void y1(int i, int i2) {
        kmq kmqVar = this.X;
        if (i == kmqVar.a && i2 == kmqVar.b) {
            return;
        }
        this.X = new kmq(i, i2);
        this.m.f(24, new orb(i, i2, 0));
        E1(2, 14, new kmq(i, i2));
    }

    @Override // defpackage.i8l
    public final void z(Surface surface) {
        N1();
        if (surface == null || surface != this.Q) {
            return;
        }
        l1();
    }

    @Override // defpackage.i8l
    public final void z0(int i, int i2, int i3) {
        N1();
        vq1.v(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i >= size || i == min || i == min2) {
            return;
        }
        sis V = V();
        this.H++;
        dvt.X(i, min, min2, arrayList);
        h1m h1mVar = new h1m(arrayList, this.M);
        rzk rzkVar = this.l0;
        rzk w1 = w1(rzkVar, h1mVar, r1(V, h1mVar, q1(rzkVar), o1(this.l0)));
        ueq ueqVar = this.M;
        fsb fsbVar = this.l;
        fsbVar.getClass();
        fsbVar.h.c(19, new bsb(i, min, min2, ueqVar)).b();
        L1(w1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final rzk z1(rzk rzkVar, int i, int i2) {
        int q1 = q1(rzkVar);
        long o1 = o1(rzkVar);
        sis sisVar = rzkVar.a;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        this.H++;
        A1(i, i2);
        h1m h1mVar = new h1m(arrayList, this.M);
        rzk w1 = w1(rzkVar, h1mVar, r1(sisVar, h1mVar, q1, o1));
        int i3 = w1.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && q1 >= w1.a.o()) {
            w1 = v1(w1, 4);
        }
        this.l.h.b(20, i, this.M, i2).b();
        return w1;
    }
}
