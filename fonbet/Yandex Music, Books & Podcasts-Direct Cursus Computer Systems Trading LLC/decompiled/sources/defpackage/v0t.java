package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v0t {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int e;
    public int f;
    public int g;
    public int h;
    public yde m;
    public yde n;
    public int o;
    public yde p;
    public int q;
    public int r;
    public int s;
    public yde t;
    public u0t u;
    public yde v;
    public int w;
    public boolean x;
    public int y;
    public boolean z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public boolean l = true;

    public v0t() {
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        this.m = qsnVar;
        this.n = qsnVar;
        this.o = 0;
        this.p = qsnVar;
        this.q = 0;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = qsnVar;
        this.u = u0t.d;
        this.v = qsnVar;
        this.w = 0;
        this.x = true;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public static qsn f(String[] strArr) {
        tde u = yde.u();
        for (String str : strArr) {
            str.getClass();
            u.a(dvt.Z(str));
        }
        return u.f();
    }

    public void a(s0t s0tVar) {
        this.D.put(s0tVar.a, s0tVar);
    }

    public w0t b() {
        return new w0t(this);
    }

    public v0t c() {
        this.D.clear();
        return this;
    }

    public v0t d(int i) {
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            if (((s0t) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(w0t w0tVar) {
        this.a = w0tVar.a;
        this.b = w0tVar.b;
        this.c = w0tVar.c;
        this.d = w0tVar.d;
        this.e = w0tVar.e;
        this.f = w0tVar.f;
        this.g = w0tVar.g;
        this.h = w0tVar.h;
        this.i = w0tVar.i;
        this.j = w0tVar.j;
        this.k = w0tVar.k;
        this.l = w0tVar.l;
        this.m = w0tVar.m;
        this.n = w0tVar.n;
        this.o = w0tVar.o;
        this.p = w0tVar.p;
        this.q = w0tVar.q;
        this.r = w0tVar.r;
        this.s = w0tVar.s;
        this.t = w0tVar.t;
        this.u = w0tVar.u;
        this.v = w0tVar.v;
        this.w = w0tVar.w;
        this.x = w0tVar.x;
        this.y = w0tVar.y;
        this.z = w0tVar.z;
        this.A = w0tVar.A;
        this.B = w0tVar.B;
        this.C = w0tVar.C;
        this.E = new HashSet(w0tVar.E);
        this.D = new HashMap(w0tVar.D);
    }

    public void g(boolean z) {
        this.C = z;
    }

    public void h() {
        this.B = false;
    }

    public v0t i() {
        this.y = -3;
        return this;
    }

    public void j(int i) {
        this.s = i;
    }

    public v0t k(s0t s0tVar) {
        xvs xvsVar = s0tVar.a;
        d(xvsVar.c);
        this.D.put(xvsVar, s0tVar);
        return this;
    }

    public v0t l(String str) {
        return str == null ? m(new String[0]) : m(str);
    }

    public v0t m(String... strArr) {
        this.v = f(strArr);
        this.x = false;
        return this;
    }

    public v0t n() {
        this.w = 0;
        this.x = false;
        return this;
    }

    public v0t o(int i) {
        this.E.remove(Integer.valueOf(i));
        return this;
    }
}
