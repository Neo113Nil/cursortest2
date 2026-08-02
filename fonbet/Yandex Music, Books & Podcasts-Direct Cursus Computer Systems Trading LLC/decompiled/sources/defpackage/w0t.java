package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class w0t {
    public static final w0t F;
    public static final w0t G;
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
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final cee D;
    public final hee E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final yde m;
    public final yde n;
    public final int o;
    public final yde p;
    public final int q;
    public final int r;
    public final int s;
    public final yde t;
    public final u0t u;
    public final yde v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    static {
        w0t w0tVar = new w0t(new v0t());
        F = w0tVar;
        G = w0tVar;
        int i = dvt.a;
        H = Integer.toString(1, 36);
        I = Integer.toString(2, 36);
        J = Integer.toString(3, 36);
        K = Integer.toString(4, 36);
        L = Integer.toString(5, 36);
        M = Integer.toString(6, 36);
        N = Integer.toString(7, 36);
        O = Integer.toString(8, 36);
        P = Integer.toString(9, 36);
        Q = Integer.toString(10, 36);
        R = Integer.toString(11, 36);
        S = Integer.toString(12, 36);
        T = Integer.toString(13, 36);
        U = Integer.toString(14, 36);
        V = Integer.toString(15, 36);
        W = Integer.toString(16, 36);
        X = Integer.toString(17, 36);
        Y = Integer.toString(18, 36);
        Z = Integer.toString(19, 36);
        a0 = Integer.toString(20, 36);
        b0 = Integer.toString(21, 36);
        c0 = Integer.toString(22, 36);
        d0 = Integer.toString(23, 36);
        e0 = Integer.toString(24, 36);
        f0 = Integer.toString(25, 36);
        g0 = Integer.toString(26, 36);
        h0 = Integer.toString(27, 36);
        i0 = Integer.toString(28, 36);
        j0 = Integer.toString(29, 36);
        k0 = Integer.toString(30, 36);
        l0 = Integer.toString(31, 36);
        m0 = Integer.toString(32, 36);
        n0 = Integer.toString(33, 36);
        o0 = Integer.toString(34, 36);
    }

    public w0t(v0t v0tVar) {
        this.a = v0tVar.a;
        this.b = v0tVar.b;
        this.c = v0tVar.c;
        this.d = v0tVar.d;
        this.e = v0tVar.e;
        this.f = v0tVar.f;
        this.g = v0tVar.g;
        this.h = v0tVar.h;
        this.i = v0tVar.i;
        this.j = v0tVar.j;
        this.k = v0tVar.k;
        this.l = v0tVar.l;
        this.m = v0tVar.m;
        this.n = v0tVar.n;
        this.o = v0tVar.o;
        this.p = v0tVar.p;
        this.q = v0tVar.q;
        this.r = v0tVar.r;
        this.s = v0tVar.s;
        this.t = v0tVar.t;
        this.u = v0tVar.u;
        this.v = v0tVar.v;
        this.w = v0tVar.w;
        this.x = v0tVar.x;
        this.y = v0tVar.y;
        this.z = v0tVar.z;
        this.A = v0tVar.A;
        this.B = v0tVar.B;
        this.C = v0tVar.C;
        this.D = cee.a(v0tVar.D);
        this.E = hee.v(v0tVar.E);
    }

    public static w0t b(Bundle bundle) {
        u0t u0tVar;
        qsn f;
        v0t v0tVar = new v0t();
        w0t w0tVar = F;
        v0tVar.a = bundle.getInt(M, w0tVar.a);
        v0tVar.b = bundle.getInt(N, w0tVar.b);
        v0tVar.c = bundle.getInt(O, w0tVar.c);
        v0tVar.d = bundle.getInt(P, w0tVar.d);
        v0tVar.e = bundle.getInt(Q, w0tVar.e);
        v0tVar.f = bundle.getInt(R, w0tVar.f);
        v0tVar.g = bundle.getInt(S, w0tVar.g);
        v0tVar.h = bundle.getInt(T, w0tVar.h);
        v0tVar.i = bundle.getInt(U, w0tVar.i);
        int i = bundle.getInt(V, w0tVar.j);
        v0tVar.j = i;
        v0tVar.k = v0tVar.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(n0, w0tVar.k);
        v0tVar.l = bundle.getBoolean(W, w0tVar.l);
        v0tVar.m = yde.w((String[]) ezf.A(bundle.getStringArray(X), new String[0]));
        v0tVar.n = yde.w((String[]) ezf.A(bundle.getStringArray(m0), new String[0]));
        v0tVar.o = bundle.getInt(f0, w0tVar.o);
        v0tVar.p = v0t.f((String[]) ezf.A(bundle.getStringArray(H), new String[0]));
        v0tVar.q = bundle.getInt(I, w0tVar.q);
        v0tVar.r = bundle.getInt(Y, w0tVar.r);
        v0tVar.s = bundle.getInt(Z, w0tVar.s);
        v0tVar.t = yde.w((String[]) ezf.A(bundle.getStringArray(a0), new String[0]));
        Bundle bundle2 = bundle.getBundle(k0);
        if (bundle2 != null) {
            t0t t0tVar = new t0t();
            String str = u0t.e;
            u0t u0tVar2 = u0t.d;
            t0tVar.a = bundle2.getInt(str, u0tVar2.a);
            t0tVar.b = bundle2.getBoolean(u0t.f, u0tVar2.b);
            t0tVar.c = bundle2.getBoolean(u0t.g, u0tVar2.c);
            u0tVar = new u0t(t0tVar);
        } else {
            t0t t0tVar2 = new t0t();
            u0t u0tVar3 = u0t.d;
            t0tVar2.a = bundle.getInt(h0, u0tVar3.a);
            t0tVar2.b = bundle.getBoolean(i0, u0tVar3.b);
            t0tVar2.c = bundle.getBoolean(j0, u0tVar3.c);
            u0tVar = new u0t(t0tVar2);
        }
        v0tVar.u = u0tVar;
        v0tVar.v = v0t.f((String[]) ezf.A(bundle.getStringArray(J), new String[0]));
        v0tVar.w = bundle.getInt(K, w0tVar.w);
        v0tVar.x = v0tVar.v.isEmpty() && v0tVar.w == 0 && bundle.getBoolean(o0, w0tVar.x);
        v0tVar.y = bundle.getInt(g0, w0tVar.y);
        v0tVar.z = bundle.getBoolean(L, w0tVar.z);
        v0tVar.A = bundle.getBoolean(l0, w0tVar.A);
        v0tVar.B = bundle.getBoolean(b0, w0tVar.B);
        v0tVar.C = bundle.getBoolean(c0, w0tVar.C);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d0);
        if (parcelableArrayList == null) {
            f = qsn.e;
        } else {
            tde u = yde.u();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(s0t.c);
                bundle4.getClass();
                xvs a = xvs.a(bundle4);
                int[] intArray = bundle3.getIntArray(s0t.d);
                intArray.getClass();
                u.a(new s0t(a, zc4.p(intArray)));
            }
            f = u.f();
        }
        v0tVar.D = new HashMap();
        for (int i3 = 0; i3 < f.d; i3++) {
            s0t s0tVar = (s0t) f.get(i3);
            v0tVar.D.put(s0tVar.a, s0tVar);
        }
        int[] iArr = (int[]) ezf.A(bundle.getIntArray(e0), new int[0]);
        v0tVar.E = new HashSet();
        for (int i4 : iArr) {
            v0tVar.E.add(Integer.valueOf(i4));
        }
        return new w0t(v0tVar);
    }

    public v0t a() {
        v0t v0tVar = new v0t();
        v0tVar.e(this);
        return v0tVar;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(M, this.a);
        bundle.putInt(N, this.b);
        bundle.putInt(O, this.c);
        bundle.putInt(P, this.d);
        bundle.putInt(Q, this.e);
        bundle.putInt(R, this.f);
        bundle.putInt(S, this.g);
        bundle.putInt(T, this.h);
        bundle.putInt(U, this.i);
        bundle.putInt(V, this.j);
        bundle.putBoolean(n0, this.k);
        bundle.putBoolean(W, this.l);
        bundle.putStringArray(X, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(m0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(f0, this.o);
        bundle.putStringArray(H, (String[]) this.p.toArray(new String[0]));
        bundle.putInt(I, this.q);
        bundle.putInt(Y, this.r);
        bundle.putInt(Z, this.s);
        bundle.putStringArray(a0, (String[]) this.t.toArray(new String[0]));
        bundle.putStringArray(J, (String[]) this.v.toArray(new String[0]));
        bundle.putInt(K, this.w);
        bundle.putBoolean(o0, this.x);
        bundle.putInt(g0, this.y);
        bundle.putBoolean(L, this.z);
        u0t u0tVar = this.u;
        bundle.putInt(h0, u0tVar.a);
        boolean z = u0tVar.b;
        bundle.putBoolean(i0, z);
        boolean z2 = u0tVar.c;
        bundle.putBoolean(j0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(u0t.e, u0tVar.a);
        bundle2.putBoolean(u0t.f, z);
        bundle2.putBoolean(u0t.g, z2);
        bundle.putBundle(k0, bundle2);
        bundle.putBoolean(l0, this.A);
        bundle.putBoolean(b0, this.B);
        bundle.putBoolean(c0, this.C);
        qde<s0t> values = this.D.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(values.size());
        for (s0t s0tVar : values) {
            s0tVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(s0t.c, s0tVar.a.d());
            bundle3.putIntArray(s0t.d, zc4.Y(s0tVar.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(d0, arrayList);
        bundle.putIntArray(e0, zc4.Y(this.E));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w0t w0tVar = (w0t) obj;
            if (this.a == w0tVar.a && this.b == w0tVar.b && this.c == w0tVar.c && this.d == w0tVar.d && this.e == w0tVar.e && this.f == w0tVar.f && this.g == w0tVar.g && this.h == w0tVar.h && this.l == w0tVar.l && this.i == w0tVar.i && this.j == w0tVar.j && this.k == w0tVar.k && this.m.equals(w0tVar.m) && this.n.equals(w0tVar.n) && this.o == w0tVar.o && this.p.equals(w0tVar.p) && this.q == w0tVar.q && this.r == w0tVar.r && this.s == w0tVar.s && this.t.equals(w0tVar.t) && this.u.equals(w0tVar.u) && this.v.equals(w0tVar.v) && this.w == w0tVar.w && this.x == w0tVar.x && this.y == w0tVar.y && this.z == w0tVar.z && this.A == w0tVar.A && this.B == w0tVar.B && this.C == w0tVar.C) {
                cee ceeVar = w0tVar.D;
                cee ceeVar2 = this.D;
                ceeVar2.getClass();
                if (gdg.v(ceeVar, ceeVar2) && this.E.equals(w0tVar.E)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((((((((((((((((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((((this.n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31) + this.o) * 31)) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31)) * 31)) * 31)) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31)) * 31);
    }
}
