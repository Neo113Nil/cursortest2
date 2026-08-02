package J1;

import B1.AbstractC0263e;
import B1.n;
import B1.s;
import N1.p;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.basead.exoplayer.h.o;
import com.bumptech.glide.j;
import com.icefishingapp.icefishing.C5275R;
import s1.InterfaceC4970e;
import s1.h;
import s1.l;
import u1.k;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    public boolean f1413B;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1417F;

    /* renamed from: G, reason: collision with root package name */
    public Resources.Theme f1418G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1419H;
    public boolean J;

    /* renamed from: n, reason: collision with root package name */
    public int f1421n;

    /* renamed from: w, reason: collision with root package name */
    public int f1424w;

    /* renamed from: u, reason: collision with root package name */
    public k f1422u = k.f41115d;

    /* renamed from: v, reason: collision with root package name */
    public j f1423v = j.f23403v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1425x = true;

    /* renamed from: y, reason: collision with root package name */
    public int f1426y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f1427z = -1;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4970e f1412A = M1.c.f1824b;

    /* renamed from: C, reason: collision with root package name */
    public h f1414C = new h();

    /* renamed from: D, reason: collision with root package name */
    public N1.c f1415D = new N1.c();

    /* renamed from: E, reason: collision with root package name */
    public Class f1416E = Object.class;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1420I = true;

    public static boolean l(int i, int i6) {
        return (i & i6) != 0;
    }

    public a a(a aVar) {
        if (this.f1419H) {
            return h().a(aVar);
        }
        int i = aVar.f1421n;
        if (l(aVar.f1421n, o.f7742d)) {
            this.J = aVar.J;
        }
        if (l(aVar.f1421n, 4)) {
            this.f1422u = aVar.f1422u;
        }
        if (l(aVar.f1421n, 8)) {
            this.f1423v = aVar.f1423v;
        }
        if (l(aVar.f1421n, 16)) {
            this.f1421n &= -33;
        }
        if (l(aVar.f1421n, 32)) {
            this.f1421n &= -17;
        }
        if (l(aVar.f1421n, 64)) {
            this.f1424w = 0;
            this.f1421n &= -129;
        }
        if (l(aVar.f1421n, 128)) {
            this.f1424w = aVar.f1424w;
            this.f1421n &= -65;
        }
        if (l(aVar.f1421n, 256)) {
            this.f1425x = aVar.f1425x;
        }
        if (l(aVar.f1421n, 512)) {
            this.f1427z = aVar.f1427z;
            this.f1426y = aVar.f1426y;
        }
        if (l(aVar.f1421n, 1024)) {
            this.f1412A = aVar.f1412A;
        }
        if (l(aVar.f1421n, 4096)) {
            this.f1416E = aVar.f1416E;
        }
        if (l(aVar.f1421n, 8192)) {
            this.f1421n &= -16385;
        }
        if (l(aVar.f1421n, 16384)) {
            this.f1421n &= -8193;
        }
        if (l(aVar.f1421n, 32768)) {
            this.f1418G = aVar.f1418G;
        }
        if (l(aVar.f1421n, 131072)) {
            this.f1413B = aVar.f1413B;
        }
        if (l(aVar.f1421n, 2048)) {
            this.f1415D.putAll(aVar.f1415D);
            this.f1420I = aVar.f1420I;
        }
        this.f1421n |= aVar.f1421n;
        this.f1414C.f40457b.i(aVar.f1414C.f40457b);
        r();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return k((a) obj);
        }
        return false;
    }

    @Override // 
    public a h() {
        try {
            a aVar = (a) super.clone();
            h hVar = new h();
            aVar.f1414C = hVar;
            hVar.f40457b.i(this.f1414C.f40457b);
            N1.c cVar = new N1.c();
            aVar.f1415D = cVar;
            cVar.putAll(this.f1415D);
            aVar.f1417F = false;
            aVar.f1419H = false;
            return aVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public int hashCode() {
        char[] cArr = p.f1932a;
        return p.h(p.h(p.h(p.h(p.h(p.h(p.h(p.g(0, p.g(0, p.g(1, p.g(this.f1413B ? 1 : 0, p.g(this.f1427z, p.g(this.f1426y, p.g(this.f1425x ? 1 : 0, p.h(p.g(0, p.h(p.g(this.f1424w, p.h(p.g(0, p.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f1422u), this.f1423v), this.f1414C), this.f1415D), this.f1416E), this.f1412A), this.f1418G);
    }

    public final a i(Class cls) {
        if (this.f1419H) {
            return h().i(cls);
        }
        this.f1416E = cls;
        this.f1421n |= 4096;
        r();
        return this;
    }

    public final a j(k kVar) {
        if (this.f1419H) {
            return h().j(kVar);
        }
        this.f1422u = kVar;
        this.f1421n |= 4;
        r();
        return this;
    }

    public final boolean k(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = p.f1932a;
        return this.f1424w == aVar.f1424w && this.f1425x == aVar.f1425x && this.f1426y == aVar.f1426y && this.f1427z == aVar.f1427z && this.f1413B == aVar.f1413B && this.f1422u.equals(aVar.f1422u) && this.f1423v == aVar.f1423v && this.f1414C.equals(aVar.f1414C) && this.f1415D.equals(aVar.f1415D) && this.f1416E.equals(aVar.f1416E) && this.f1412A.equals(aVar.f1412A) && p.b(this.f1418G, aVar.f1418G);
    }

    public final a m(n nVar, AbstractC0263e abstractC0263e) {
        if (this.f1419H) {
            return h().m(nVar, abstractC0263e);
        }
        s(n.f142g, nVar);
        return x(abstractC0263e, false);
    }

    public final a n(int i, int i6) {
        if (this.f1419H) {
            return h().n(i, i6);
        }
        this.f1427z = i;
        this.f1426y = i6;
        this.f1421n |= 512;
        r();
        return this;
    }

    public final a o() {
        if (this.f1419H) {
            return h().o();
        }
        this.f1424w = C5275R.drawable.default_image;
        this.f1421n = (this.f1421n | 128) & (-65);
        r();
        return this;
    }

    public final a p() {
        j jVar = j.f23404w;
        if (this.f1419H) {
            return h().p();
        }
        this.f1423v = jVar;
        this.f1421n |= 8;
        r();
        return this;
    }

    public final a q(s1.g gVar) {
        if (this.f1419H) {
            return h().q(gVar);
        }
        this.f1414C.f40457b.remove(gVar);
        r();
        return this;
    }

    public final void r() {
        if (this.f1417F) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a s(s1.g gVar, Object obj) {
        if (this.f1419H) {
            return h().s(gVar, obj);
        }
        N1.g.b(gVar);
        N1.g.b(obj);
        this.f1414C.f40457b.put(gVar, obj);
        r();
        return this;
    }

    public final a t(InterfaceC4970e interfaceC4970e) {
        if (this.f1419H) {
            return h().t(interfaceC4970e);
        }
        this.f1412A = interfaceC4970e;
        this.f1421n |= 1024;
        r();
        return this;
    }

    public final a u() {
        if (this.f1419H) {
            return h().u();
        }
        this.f1425x = false;
        this.f1421n |= 256;
        r();
        return this;
    }

    public final a v(Resources.Theme theme) {
        if (this.f1419H) {
            return h().v(theme);
        }
        this.f1418G = theme;
        if (theme != null) {
            this.f1421n |= 32768;
            return s(D1.c.f625b, theme);
        }
        this.f1421n &= -32769;
        return q(D1.c.f625b);
    }

    public final a w(Class cls, l lVar, boolean z3) {
        if (this.f1419H) {
            return h().w(cls, lVar, z3);
        }
        N1.g.b(lVar);
        this.f1415D.put(cls, lVar);
        int i = this.f1421n;
        this.f1421n = 67584 | i;
        this.f1420I = false;
        if (z3) {
            this.f1421n = i | 198656;
            this.f1413B = true;
        }
        r();
        return this;
    }

    public final a x(l lVar, boolean z3) {
        if (this.f1419H) {
            return h().x(lVar, z3);
        }
        s sVar = new s(lVar, z3);
        w(Bitmap.class, lVar, z3);
        w(Drawable.class, sVar, z3);
        w(BitmapDrawable.class, sVar, z3);
        w(F1.c.class, new F1.d(lVar), z3);
        r();
        return this;
    }

    public final a y() {
        if (this.f1419H) {
            return h().y();
        }
        this.J = true;
        this.f1421n |= o.f7742d;
        r();
        return this;
    }
}
