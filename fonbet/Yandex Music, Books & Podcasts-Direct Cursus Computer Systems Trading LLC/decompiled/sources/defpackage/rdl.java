package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.session.m;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rdl {
    public static final rdl F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public final long A;
    public final long B;
    public final long C;
    public final e3t D;
    public final w0t E;
    public final hzk a;
    public final int b;
    public final tmp c;
    public final g8l d;
    public final g8l e;
    public final int f;
    public final p0l g;
    public final int h;
    public final boolean i;
    public final sis j;
    public final int k;
    public final tcu l;
    public final hoh m;
    public final float n;
    public final dv1 o;
    public final sv6 p;
    public final p08 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final hoh z;

    static {
        tmp tmpVar = tmp.l;
        g8l g8lVar = tmp.k;
        p0l p0lVar = p0l.d;
        tcu tcuVar = tcu.d;
        mis misVar = sis.a;
        hoh hohVar = hoh.K;
        F = new rdl(null, 0, tmpVar, g8lVar, g8lVar, 0, p0lVar, 0, false, tcuVar, misVar, 0, hohVar, 1.0f, dv1.g, sv6.c, p08.e, 0, false, false, 1, 0, 1, false, false, hohVar, 5000L, 15000L, 3000L, e3t.b, w0t.F);
        int i = dvt.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
    }

    public rdl(hzk hzkVar, int i, tmp tmpVar, g8l g8lVar, g8l g8lVar2, int i2, p0l p0lVar, int i3, boolean z, tcu tcuVar, sis sisVar, int i4, hoh hohVar, float f, dv1 dv1Var, sv6 sv6Var, p08 p08Var, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, hoh hohVar2, long j, long j2, long j3, e3t e3tVar, w0t w0tVar) {
        this.a = hzkVar;
        this.b = i;
        this.c = tmpVar;
        this.d = g8lVar;
        this.e = g8lVar2;
        this.f = i2;
        this.g = p0lVar;
        this.h = i3;
        this.i = z;
        this.l = tcuVar;
        this.j = sisVar;
        this.k = i4;
        this.m = hohVar;
        this.n = f;
        this.o = dv1Var;
        this.p = sv6Var;
        this.q = p08Var;
        this.r = i5;
        this.s = z2;
        this.t = z3;
        this.u = i6;
        this.x = i7;
        this.y = i8;
        this.v = z4;
        this.w = z5;
        this.z = hohVar2;
        this.A = j;
        this.B = j2;
        this.C = j3;
        this.D = e3tVar;
        this.E = w0tVar;
    }

    public static rdl r(int i, Bundle bundle) {
        hzk hzkVar;
        qsn G2;
        qsn G3;
        sis pisVar;
        sis sisVar;
        int i2;
        tcu tcuVar;
        hoh hohVar;
        float f;
        tcu tcuVar2;
        qsn f2;
        sv6 sv6Var;
        sv6 sv6Var2;
        p08 c;
        int i3;
        long j;
        e3t e3tVar;
        IBinder binder = bundle.getBinder(l0);
        if (binder instanceof qdl) {
            return ((qdl) binder).a;
        }
        Bundle bundle2 = bundle.getBundle(X);
        if (bundle2 == null) {
            hzkVar = null;
        } else {
            String string = bundle2.getString(hzk.f);
            String string2 = bundle2.getString(hzk.g);
            String string3 = bundle2.getString(hzk.h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, hzk.class.getClassLoader());
                    r3 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (r3 == null) {
                        r3 = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    r3 = new RemoteException(string3);
                }
            }
            Throwable th = r3;
            int i4 = bundle2.getInt(hzk.d, 1000);
            Bundle bundle3 = bundle2.getBundle(hzk.i);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            hzkVar = new hzk(string, th, i4, bundle3, bundle2.getLong(hzk.e, SystemClock.elapsedRealtime()));
        }
        int i5 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(Y);
        tmp b = bundle4 == null ? tmp.l : tmp.b(bundle4);
        Bundle bundle5 = bundle.getBundle(a0);
        g8l c2 = bundle5 == null ? tmp.k : g8l.c(bundle5);
        Bundle bundle6 = bundle.getBundle(b0);
        g8l c3 = bundle6 == null ? tmp.k : g8l.c(bundle6);
        int i6 = bundle.getInt(c0, 0);
        Bundle bundle7 = bundle.getBundle(G);
        p0l p0lVar = bundle7 == null ? p0l.d : new p0l(bundle7.getFloat(p0l.e, 1.0f), bundle7.getFloat(p0l.f, 1.0f));
        int i7 = bundle.getInt(H, 0);
        boolean z = bundle.getBoolean(I, false);
        Bundle bundle8 = bundle.getBundle(J);
        if (bundle8 == null) {
            pisVar = sis.a;
        } else {
            e7o e7oVar = new e7o(28);
            IBinder binder2 = bundle8.getBinder(sis.b);
            if (binder2 == null) {
                ude udeVar = yde.b;
                G2 = qsn.e;
            } else {
                G2 = sk3.G(e7oVar, vk3.a(binder2));
            }
            e7o e7oVar2 = new e7o(29);
            IBinder binder3 = bundle8.getBinder(sis.c);
            if (binder3 == null) {
                ude udeVar2 = yde.b;
                G3 = qsn.e;
            } else {
                G3 = sk3.G(e7oVar2, vk3.a(binder3));
            }
            int[] intArray = bundle8.getIntArray(sis.d);
            if (intArray == null) {
                int i8 = G2.d;
                int[] iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
                intArray = iArr;
            }
            pisVar = new pis(G2, G3, intArray);
        }
        int i10 = bundle.getInt(k0, 0);
        Bundle bundle9 = bundle.getBundle(K);
        if (bundle9 == null) {
            tcuVar = tcu.d;
            sisVar = pisVar;
            i2 = i10;
        } else {
            sisVar = pisVar;
            i2 = i10;
            tcuVar = new tcu(bundle9.getInt(tcu.e, 0), bundle9.getFloat(tcu.g, 1.0f), bundle9.getInt(tcu.f, 0));
        }
        Bundle bundle10 = bundle.getBundle(L);
        hoh b2 = bundle10 == null ? hoh.K : hoh.b(bundle10);
        float f3 = bundle.getFloat(M, 1.0f);
        Bundle bundle11 = bundle.getBundle(N);
        dv1 a = bundle11 == null ? dv1.g : dv1.a(bundle11);
        Bundle bundle12 = bundle.getBundle(d0);
        if (bundle12 == null) {
            sv6Var = sv6.c;
            hohVar = b2;
            f = f3;
            tcuVar2 = tcuVar;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(sv6.d);
            if (parcelableArrayList == null) {
                f2 = qsn.e;
                hohVar = b2;
                f = f3;
                tcuVar2 = tcuVar;
            } else {
                hohVar = b2;
                tde u = yde.u();
                f = f3;
                tcuVar2 = tcuVar;
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i11);
                    bundle13.getClass();
                    u.a(rv6.b(bundle13));
                }
                f2 = u.f();
            }
            sv6Var = new sv6(f2, bundle12.getLong(sv6.e));
        }
        Bundle bundle14 = bundle.getBundle(O);
        if (bundle14 == null) {
            c = p08.e;
            sv6Var2 = sv6Var;
        } else {
            int i12 = bundle14.getInt(p08.f, 0);
            int i13 = bundle14.getInt(p08.g, 0);
            sv6Var2 = sv6Var;
            int i14 = bundle14.getInt(p08.h, 0);
            String string4 = bundle14.getString(p08.i);
            n8n n8nVar = new n8n(i12);
            n8nVar.c = i13;
            n8nVar.d = i14;
            vq1.v(i12 != 0 || string4 == null);
            n8nVar.e = string4;
            c = n8nVar.c();
        }
        int i15 = bundle.getInt(P, 0);
        boolean z2 = bundle.getBoolean(Q, false);
        boolean z3 = bundle.getBoolean(R, false);
        int i16 = bundle.getInt(S, 1);
        int i17 = bundle.getInt(T, 0);
        int i18 = bundle.getInt(U, 1);
        boolean z4 = bundle.getBoolean(V, false);
        boolean z5 = bundle.getBoolean(W, false);
        Bundle bundle15 = bundle.getBundle(e0);
        hoh b3 = bundle15 == null ? hoh.K : hoh.b(bundle15);
        p08 p08Var = c;
        long j2 = bundle.getLong(f0, i < 4 ? 0L : 5000L);
        long j3 = bundle.getLong(g0, i < 4 ? 0L : 15000L);
        if (i < 4) {
            i3 = i15;
            j = 0;
        } else {
            i3 = i15;
            j = 3000;
        }
        long j4 = bundle.getLong(h0, j);
        Bundle bundle16 = bundle.getBundle(j0);
        if (bundle16 == null) {
            e3tVar = e3t.b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(e3t.c);
            e3tVar = new e3t(parcelableArrayList2 == null ? qsn.e : sk3.G(new wvs(3), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(i0);
        return new rdl(hzkVar, i5, b, c2, c3, i6, p0lVar, i7, z, tcuVar2, sisVar, i2, hohVar, f, a, sv6Var2, p08Var, i3, z2, z3, i16, i17, i18, z4, z5, b3, j2, j3, j4, e3tVar, bundle17 == null ? w0t.F : w0t.b(bundle17));
    }

    public final rdl a(dv1 dv1Var) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, dv1Var, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl b(e3t e3tVar) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, e3tVar, this.E);
    }

    public final rdl c(int i, boolean z) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, i, z, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl d(int i, int i2, boolean z) {
        int i3 = this.y;
        boolean z2 = i3 == 3 && z && i2 == 0;
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, i, i2, i3, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl e(p0l p0lVar) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, p0lVar, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl f(int i, hzk hzkVar) {
        boolean z = this.t;
        int i2 = this.x;
        boolean z2 = i == 3 && z && i2 == 0;
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(hzkVar, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, this.u, i2, i, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl g(hoh hohVar) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, hohVar, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl h(int i, g8l g8lVar, g8l g8lVar2) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, g8lVar, g8lVar2, i, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl i(int i) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, i, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl j(tmp tmpVar) {
        sis sisVar = this.j;
        vq1.A(sisVar.p() || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl k(boolean z) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, z, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl l(sis sisVar) {
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl m(m mVar, int i) {
        tmp tmpVar = this.c;
        g8l g8lVar = tmpVar.a;
        tmp tmpVar2 = new tmp(new g8l(g8lVar.a, i, g8lVar.c, g8lVar.d, g8lVar.e, g8lVar.f, g8lVar.g, g8lVar.h, g8lVar.i), tmpVar.b, tmpVar.c, tmpVar.d, tmpVar.e, tmpVar.f, tmpVar.g, tmpVar.h, tmpVar.i, tmpVar.j);
        vq1.A(mVar.p() || tmpVar2.a.b < mVar.o());
        return new rdl(this.a, this.b, tmpVar2, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mVar, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl n(sis sisVar, tmp tmpVar, int i) {
        vq1.A(sisVar.p() || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, i, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl o(w0t w0tVar) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, w0tVar);
    }

    public final rdl p(float f) {
        sis sisVar = this.j;
        boolean p = sisVar.p();
        tmp tmpVar = this.c;
        vq1.A(p || tmpVar.a.b < sisVar.o());
        return new rdl(this.a, this.b, tmpVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, sisVar, this.k, this.m, f, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final rdl q(d8l d8lVar, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        boolean a = d8lVar.a(16);
        boolean a2 = d8lVar.a(17);
        tmp tmpVar = this.c;
        tmp a3 = tmpVar.a(a, a2);
        g8l b = this.d.b(a, a2);
        g8l b2 = this.e.b(a, a2);
        boolean z4 = true;
        sis sisVar = this.j;
        if (!a2 && a && !sisVar.p()) {
            int i3 = tmpVar.a.b;
            if (sisVar.o() != 1) {
                ris m = sisVar.m(i3, new ris(), 0L);
                tde u = yde.u();
                int i4 = m.n;
                while (true) {
                    i2 = m.o;
                    if (i4 > i2) {
                        break;
                    }
                    ois f = sisVar.f(i4, new ois(), true);
                    f.c = 0;
                    u.a(f);
                    i4++;
                }
                m.o = i2 - m.n;
                m.n = 0;
                sisVar = new pis(yde.y(m), u.f(), new int[]{0});
            }
        } else if (z || !a2) {
            sisVar = sis.a;
        }
        sis sisVar2 = sisVar;
        hoh hohVar = !d8lVar.a(18) ? hoh.K : this.m;
        float f2 = !d8lVar.a(22) ? 1.0f : this.n;
        dv1 dv1Var = !d8lVar.a(21) ? dv1.g : this.o;
        sv6 sv6Var = !d8lVar.a(28) ? sv6.c : this.p;
        if (d8lVar.a(23)) {
            i = this.r;
            z3 = this.s;
        } else {
            i = 0;
            z3 = false;
        }
        hoh hohVar2 = !d8lVar.a(18) ? hoh.K : this.z;
        e3t e3tVar = (z2 || !d8lVar.a(30)) ? e3t.b : this.D;
        if (!sisVar2.p() && a3.a.b >= sisVar2.o()) {
            z4 = false;
        }
        vq1.A(z4);
        return new rdl(this.a, this.b, a3, b, b2, this.f, this.g, this.h, this.i, this.l, sisVar2, this.k, hohVar, f2, dv1Var, sv6Var, this.q, i, z3, this.t, this.u, this.x, this.y, this.v, this.w, hohVar2, this.A, this.B, this.C, e3tVar, this.E);
    }

    public final onh s() {
        sis sisVar = this.j;
        if (sisVar.p()) {
            return null;
        }
        return sisVar.m(this.c.a.b, new ris(), 0L).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Bundle t(int i) {
        long j;
        boolean z;
        int i2;
        ois oisVar;
        int i3;
        int i4;
        Bundle e;
        long j2;
        Bundle bundle = new Bundle();
        hzk hzkVar = this.a;
        if (hzkVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(hzk.d, hzkVar.a);
            bundle2.putLong(hzk.e, hzkVar.b);
            bundle2.putString(hzk.f, hzkVar.getMessage());
            bundle2.putBundle(hzk.i, hzkVar.c);
            Throwable cause = hzkVar.getCause();
            if (cause != null) {
                bundle2.putString(hzk.g, cause.getClass().getName());
                bundle2.putString(hzk.h, cause.getMessage());
            }
            bundle.putBundle(X, bundle2);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle.putInt(Z, i5);
        }
        tmp tmpVar = this.c;
        if (i < 3 || !tmpVar.equals(tmp.l)) {
            bundle.putBundle(Y, tmpVar.c(i));
        }
        g8l g8lVar = this.d;
        if (i < 3 || !tmp.k.a(g8lVar)) {
            bundle.putBundle(a0, g8lVar.d(i));
        }
        g8l g8lVar2 = this.e;
        if (i < 3 || !tmp.k.a(g8lVar2)) {
            bundle.putBundle(b0, g8lVar2.d(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle.putInt(c0, i6);
        }
        p0l p0lVar = p0l.d;
        p0l p0lVar2 = this.g;
        if (!p0lVar2.equals(p0lVar)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(p0l.e, p0lVar2.a);
            bundle3.putFloat(p0l.f, p0lVar2.b);
            bundle.putBundle(G, bundle3);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle.putInt(H, i7);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle.putBoolean(I, z2);
        }
        mis misVar = sis.a;
        sis sisVar = this.j;
        boolean z3 = false;
        long j3 = 0;
        if (sisVar.equals(misVar)) {
            j = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int o = sisVar.o();
            ris risVar = new ris();
            int i8 = 0;
            while (i8 < o) {
                ris m = sisVar.m(i8, risVar, j3);
                m.getClass();
                Bundle bundle4 = new Bundle();
                long j4 = j3;
                if (!onh.g.equals(m.c)) {
                    bundle4.putBundle(ris.t, m.c.e(false));
                }
                long j5 = m.e;
                if (j5 != -9223372036854775807L) {
                    j2 = -9223372036854775807L;
                    bundle4.putLong(ris.u, j5);
                } else {
                    j2 = -9223372036854775807L;
                }
                long j6 = m.f;
                if (j6 != j2) {
                    bundle4.putLong(ris.v, j6);
                }
                long j7 = m.g;
                if (j7 != j2) {
                    bundle4.putLong(ris.w, j7);
                }
                boolean z4 = m.h;
                if (z4) {
                    bundle4.putBoolean(ris.x, z4);
                }
                boolean z5 = m.i;
                if (z5) {
                    bundle4.putBoolean(ris.y, z5);
                }
                fnh fnhVar = m.j;
                if (fnhVar != null) {
                    bundle4.putBundle(ris.z, fnhVar.c());
                }
                boolean z6 = m.k;
                if (z6) {
                    bundle4.putBoolean(ris.A, z6);
                }
                long j8 = m.l;
                if (j8 != j4) {
                    bundle4.putLong(ris.B, j8);
                }
                long j9 = m.m;
                if (j9 != j2) {
                    bundle4.putLong(ris.C, j9);
                }
                int i9 = m.n;
                if (i9 != 0) {
                    bundle4.putInt(ris.D, i9);
                }
                int i10 = m.o;
                if (i10 != 0) {
                    bundle4.putInt(ris.E, i10);
                }
                long j10 = m.p;
                if (j10 != j4) {
                    bundle4.putLong(ris.F, j10);
                }
                arrayList.add(bundle4);
                i8++;
                j3 = j4;
            }
            j = j3;
            ArrayList arrayList2 = new ArrayList();
            int h = sisVar.h();
            ois oisVar2 = new ois();
            int i11 = 0;
            while (i11 < h) {
                ois f = sisVar.f(i11, oisVar2, z3);
                f.getClass();
                Bundle bundle5 = new Bundle();
                int i12 = f.c;
                if (i12 != 0) {
                    bundle5.putInt(ois.h, i12);
                }
                long j11 = f.d;
                if (j11 != -9223372036854775807L) {
                    z = z3;
                    bundle5.putLong(ois.i, j11);
                } else {
                    z = z3;
                }
                long j12 = f.e;
                if (j12 != j) {
                    bundle5.putLong(ois.j, j12);
                }
                boolean z7 = f.f;
                if (z7) {
                    bundle5.putBoolean(ois.k, z7);
                }
                if (f.g.equals(lj.f)) {
                    i2 = h;
                    oisVar = oisVar2;
                    i3 = i11;
                } else {
                    String str = ois.l;
                    lj ljVar = f.g;
                    ljVar.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    jj[] jjVarArr = ljVar.e;
                    i2 = h;
                    int length = jjVarArr.length;
                    ?? r6 = z;
                    while (r6 < length) {
                        int i13 = r6;
                        jj jjVar = jjVarArr[i13];
                        jjVar.getClass();
                        int i14 = length;
                        Bundle bundle7 = new Bundle();
                        ois oisVar3 = oisVar2;
                        bundle7.putLong(jj.l, jjVar.a);
                        bundle7.putInt(jj.m, jjVar.b);
                        bundle7.putInt(jj.s, jjVar.c);
                        bundle7.putParcelableArrayList(jj.n, new ArrayList<>(Arrays.asList(jjVar.d)));
                        String str2 = jj.t;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        onh[] onhVarArr = jjVar.e;
                        int i15 = i11;
                        int length2 = onhVarArr.length;
                        ?? r10 = z;
                        while (r10 < length2) {
                            int i16 = r10;
                            onh onhVar = onhVarArr[i16];
                            if (onhVar == null) {
                                e = null;
                                i4 = length2;
                            } else {
                                i4 = length2;
                                e = onhVar.e(true);
                            }
                            arrayList4.add(e);
                            length2 = i4;
                            r10 = i16 + 1;
                        }
                        bundle7.putParcelableArrayList(str2, arrayList4);
                        bundle7.putIntArray(jj.o, jjVar.f);
                        bundle7.putLongArray(jj.p, jjVar.g);
                        bundle7.putLong(jj.q, jjVar.i);
                        bundle7.putBoolean(jj.r, jjVar.j);
                        bundle7.putStringArrayList(jj.u, new ArrayList<>(Arrays.asList(jjVar.h)));
                        bundle7.putBoolean(jj.v, jjVar.k);
                        arrayList3.add(bundle7);
                        length = i14;
                        oisVar2 = oisVar3;
                        i11 = i15;
                        r6 = i13 + 1;
                    }
                    oisVar = oisVar2;
                    i3 = i11;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(lj.h, arrayList3);
                    }
                    long j13 = ljVar.b;
                    if (j13 != j) {
                        bundle6.putLong(lj.i, j13);
                    }
                    long j14 = ljVar.c;
                    if (j14 != -9223372036854775807L) {
                        bundle6.putLong(lj.j, j14);
                    }
                    int i17 = ljVar.d;
                    if (i17 != 0) {
                        bundle6.putInt(lj.k, i17);
                    }
                    bundle5.putBundle(str, bundle6);
                }
                arrayList2.add(bundle5);
                i11 = i3 + 1;
                z3 = z;
                h = i2;
                oisVar2 = oisVar;
            }
            int i18 = z3;
            int[] iArr = new int[o];
            boolean z8 = true;
            if (o > 0) {
                iArr[i18] = sisVar.a(true);
            }
            int i19 = 1;
            while (i19 < o) {
                iArr[i19] = sisVar.e(iArr[i19 - 1], i18, z8);
                i19++;
                z8 = true;
                i18 = 0;
            }
            Bundle bundle8 = new Bundle();
            bundle8.putBinder(sis.b, new vk3(arrayList));
            bundle8.putBinder(sis.c, new vk3(arrayList2));
            bundle8.putIntArray(sis.d, iArr);
            bundle.putBundle(J, bundle8);
        }
        int i20 = this.k;
        if (i20 != 0) {
            bundle.putInt(k0, i20);
        }
        tcu tcuVar = tcu.d;
        tcu tcuVar2 = this.l;
        if (!tcuVar2.equals(tcuVar)) {
            Bundle bundle9 = new Bundle();
            int i21 = tcuVar2.a;
            if (i21 != 0) {
                bundle9.putInt(tcu.e, i21);
            }
            int i22 = tcuVar2.b;
            if (i22 != 0) {
                bundle9.putInt(tcu.f, i22);
            }
            float f2 = tcuVar2.c;
            if (f2 != 1.0f) {
                bundle9.putFloat(tcu.g, f2);
            }
            bundle.putBundle(K, bundle9);
        }
        hoh hohVar = hoh.K;
        hoh hohVar2 = this.m;
        if (!hohVar2.equals(hohVar)) {
            bundle.putBundle(L, hohVar2.c());
        }
        float f3 = this.n;
        if (f3 != 1.0f) {
            bundle.putFloat(M, f3);
        }
        dv1 dv1Var = dv1.g;
        dv1 dv1Var2 = this.o;
        if (!dv1Var2.equals(dv1Var)) {
            bundle.putBundle(N, dv1Var2.c());
        }
        sv6 sv6Var = sv6.c;
        sv6 sv6Var2 = this.p;
        if (!sv6Var2.equals(sv6Var)) {
            Bundle bundle10 = new Bundle();
            String str3 = sv6.d;
            yde ydeVar = sv6Var2.a;
            tde u = yde.u();
            for (int i23 = 0; i23 < ydeVar.size(); i23++) {
                if (((rv6) ydeVar.get(i23)).d == null) {
                    u.a((rv6) ydeVar.get(i23));
                }
            }
            qsn f4 = u.f();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(f4.d);
            ude listIterator = f4.listIterator(0);
            while (listIterator.hasNext()) {
                rv6 rv6Var = (rv6) listIterator.next();
                Bundle c = rv6Var.c();
                Bitmap bitmap = rv6Var.d;
                if (bitmap != null) {
                    c.putParcelable(rv6.v, bitmap);
                }
                arrayList5.add(c);
            }
            bundle10.putParcelableArrayList(str3, arrayList5);
            bundle10.putLong(sv6.e, sv6Var2.b);
            bundle.putBundle(d0, bundle10);
        }
        p08 p08Var = p08.e;
        p08 p08Var2 = this.q;
        if (!p08Var2.equals(p08Var)) {
            Bundle bundle11 = new Bundle();
            int i24 = p08Var2.a;
            if (i24 != 0) {
                bundle11.putInt(p08.f, i24);
            }
            int i25 = p08Var2.b;
            if (i25 != 0) {
                bundle11.putInt(p08.g, i25);
            }
            int i26 = p08Var2.c;
            if (i26 != 0) {
                bundle11.putInt(p08.h, i26);
            }
            String str4 = p08Var2.d;
            if (str4 != null) {
                bundle11.putString(p08.i, str4);
            }
            bundle.putBundle(O, bundle11);
        }
        int i27 = this.r;
        if (i27 != 0) {
            bundle.putInt(P, i27);
        }
        boolean z9 = this.s;
        if (z9) {
            bundle.putBoolean(Q, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            bundle.putBoolean(R, z10);
        }
        int i28 = this.u;
        if (i28 != 1) {
            bundle.putInt(S, i28);
        }
        int i29 = this.x;
        if (i29 != 0) {
            bundle.putInt(T, i29);
        }
        int i30 = this.y;
        if (i30 != 1) {
            bundle.putInt(U, i30);
        }
        boolean z11 = this.v;
        if (z11) {
            bundle.putBoolean(V, z11);
        }
        boolean z12 = this.w;
        if (z12) {
            bundle.putBoolean(W, z12);
        }
        hoh hohVar3 = hoh.K;
        hoh hohVar4 = this.z;
        if (!hohVar4.equals(hohVar3)) {
            bundle.putBundle(e0, hohVar4.c());
        }
        long j15 = i < 6 ? j : 5000L;
        long j16 = this.A;
        if (j16 != j15) {
            bundle.putLong(f0, j16);
        }
        long j17 = i < 6 ? j : 15000L;
        long j18 = this.B;
        if (j18 != j17) {
            bundle.putLong(g0, j18);
        }
        long j19 = i < 6 ? j : 3000L;
        long j20 = this.C;
        if (j20 != j19) {
            bundle.putLong(h0, j20);
        }
        e3t e3tVar = e3t.b;
        e3t e3tVar2 = this.D;
        if (!e3tVar2.equals(e3tVar)) {
            Bundle bundle12 = new Bundle();
            bundle12.putParcelableArrayList(e3t.c, sk3.X(e3tVar2.a, new wvs(2)));
            bundle.putBundle(j0, bundle12);
        }
        w0t w0tVar = w0t.F;
        w0t w0tVar2 = this.E;
        if (!w0tVar2.equals(w0tVar)) {
            bundle.putBundle(i0, w0tVar2.c());
        }
        return bundle;
    }
}
