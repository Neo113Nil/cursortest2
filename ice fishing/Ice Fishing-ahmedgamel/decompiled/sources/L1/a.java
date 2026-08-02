package L1;

import D1.AbstractC0300e;
import D1.n;
import D1.s;
import P1.p;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.h.o;
import u1.InterfaceC5066e;
import u1.h;
import u1.l;
import w1.j;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    public boolean f1729B;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1733F;

    /* renamed from: G, reason: collision with root package name */
    public Resources.Theme f1734G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1735H;
    public boolean J;

    /* renamed from: n, reason: collision with root package name */
    public int f1737n;

    /* renamed from: w, reason: collision with root package name */
    public int f1740w;

    /* renamed from: u, reason: collision with root package name */
    public j f1738u = j.f41498d;

    /* renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.j f1739v = com.bumptech.glide.j.f24190v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1741x = true;

    /* renamed from: y, reason: collision with root package name */
    public int f1742y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f1743z = -1;

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC5066e f1728A = O1.c.f2250b;

    /* renamed from: C, reason: collision with root package name */
    public h f1730C = new h();

    /* renamed from: D, reason: collision with root package name */
    public P1.c f1731D = new P1.c();

    /* renamed from: E, reason: collision with root package name */
    public Class f1732E = Object.class;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1736I = true;

    public static boolean l(int i, int i4) {
        return (i & i4) != 0;
    }

    public a a(a aVar) {
        if (this.f1735H) {
            return clone().a(aVar);
        }
        int i = aVar.f1737n;
        if (l(aVar.f1737n, o.f8528d)) {
            this.J = aVar.J;
        }
        if (l(aVar.f1737n, 4)) {
            this.f1738u = aVar.f1738u;
        }
        if (l(aVar.f1737n, 8)) {
            this.f1739v = aVar.f1739v;
        }
        if (l(aVar.f1737n, 16)) {
            this.f1737n &= -33;
        }
        if (l(aVar.f1737n, 32)) {
            this.f1737n &= -17;
        }
        if (l(aVar.f1737n, 64)) {
            this.f1740w = 0;
            this.f1737n &= -129;
        }
        if (l(aVar.f1737n, 128)) {
            this.f1740w = aVar.f1740w;
            this.f1737n &= -65;
        }
        if (l(aVar.f1737n, 256)) {
            this.f1741x = aVar.f1741x;
        }
        if (l(aVar.f1737n, 512)) {
            this.f1743z = aVar.f1743z;
            this.f1742y = aVar.f1742y;
        }
        if (l(aVar.f1737n, 1024)) {
            this.f1728A = aVar.f1728A;
        }
        if (l(aVar.f1737n, 4096)) {
            this.f1732E = aVar.f1732E;
        }
        if (l(aVar.f1737n, 8192)) {
            this.f1737n &= -16385;
        }
        if (l(aVar.f1737n, 16384)) {
            this.f1737n &= -8193;
        }
        if (l(aVar.f1737n, 32768)) {
            this.f1734G = aVar.f1734G;
        }
        if (l(aVar.f1737n, 131072)) {
            this.f1729B = aVar.f1729B;
        }
        if (l(aVar.f1737n, 2048)) {
            this.f1731D.putAll(aVar.f1731D);
            this.f1736I = aVar.f1736I;
        }
        this.f1737n |= aVar.f1737n;
        this.f1730C.f41011b.i(aVar.f1730C.f41011b);
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
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            h hVar = new h();
            aVar.f1730C = hVar;
            hVar.f41011b.i(this.f1730C.f41011b);
            P1.c cVar = new P1.c();
            aVar.f1731D = cVar;
            cVar.putAll(this.f1731D);
            aVar.f1733F = false;
            aVar.f1735H = false;
            return aVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public int hashCode() {
        char[] cArr = p.f2376a;
        return p.h(p.h(p.h(p.h(p.h(p.h(p.h(p.g(0, p.g(0, p.g(1, p.g(this.f1729B ? 1 : 0, p.g(this.f1743z, p.g(this.f1742y, p.g(this.f1741x ? 1 : 0, p.h(p.g(0, p.h(p.g(this.f1740w, p.h(p.g(0, p.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f1738u), this.f1739v), this.f1730C), this.f1731D), this.f1732E), this.f1728A), this.f1734G);
    }

    public final a i(Class cls) {
        if (this.f1735H) {
            return clone().i(cls);
        }
        this.f1732E = cls;
        this.f1737n |= 4096;
        r();
        return this;
    }

    public final a j(j jVar) {
        if (this.f1735H) {
            return clone().j(jVar);
        }
        this.f1738u = jVar;
        this.f1737n |= 4;
        r();
        return this;
    }

    public final boolean k(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = p.f2376a;
        return this.f1740w == aVar.f1740w && this.f1741x == aVar.f1741x && this.f1742y == aVar.f1742y && this.f1743z == aVar.f1743z && this.f1729B == aVar.f1729B && this.f1738u.equals(aVar.f1738u) && this.f1739v == aVar.f1739v && this.f1730C.equals(aVar.f1730C) && this.f1731D.equals(aVar.f1731D) && this.f1732E.equals(aVar.f1732E) && this.f1728A.equals(aVar.f1728A) && p.b(this.f1734G, aVar.f1734G);
    }

    public final a m(n nVar, AbstractC0300e abstractC0300e) {
        if (this.f1735H) {
            return clone().m(nVar, abstractC0300e);
        }
        s(n.f556g, nVar);
        return x(abstractC0300e, false);
    }

    public final a n(int i, int i4) {
        if (this.f1735H) {
            return clone().n(i, i4);
        }
        this.f1743z = i;
        this.f1742y = i4;
        this.f1737n |= 512;
        r();
        return this;
    }

    public final a o() {
        if (this.f1735H) {
            return clone().o();
        }
        this.f1740w = C5248R.drawable.default_image;
        this.f1737n = (this.f1737n | 128) & (-65);
        r();
        return this;
    }

    public final a p() {
        com.bumptech.glide.j jVar = com.bumptech.glide.j.f24191w;
        if (this.f1735H) {
            return clone().p();
        }
        this.f1739v = jVar;
        this.f1737n |= 8;
        r();
        return this;
    }

    public final a q(u1.g gVar) {
        if (this.f1735H) {
            return clone().q(gVar);
        }
        this.f1730C.f41011b.remove(gVar);
        r();
        return this;
    }

    public final void r() {
        if (this.f1733F) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a s(u1.g gVar, Object obj) {
        if (this.f1735H) {
            return clone().s(gVar, obj);
        }
        P1.g.b(gVar);
        P1.g.b(obj);
        this.f1730C.f41011b.put(gVar, obj);
        r();
        return this;
    }

    public final a t(InterfaceC5066e interfaceC5066e) {
        if (this.f1735H) {
            return clone().t(interfaceC5066e);
        }
        this.f1728A = interfaceC5066e;
        this.f1737n |= 1024;
        r();
        return this;
    }

    public final a u() {
        if (this.f1735H) {
            return clone().u();
        }
        this.f1741x = false;
        this.f1737n |= 256;
        r();
        return this;
    }

    public final a v(Resources.Theme theme) {
        if (this.f1735H) {
            return clone().v(theme);
        }
        this.f1734G = theme;
        if (theme != null) {
            this.f1737n |= 32768;
            return s(F1.c.f969b, theme);
        }
        this.f1737n &= -32769;
        return q(F1.c.f969b);
    }

    public final a w(Class cls, l lVar, boolean z6) {
        if (this.f1735H) {
            return clone().w(cls, lVar, z6);
        }
        P1.g.b(lVar);
        this.f1731D.put(cls, lVar);
        int i = this.f1737n;
        this.f1737n = 67584 | i;
        this.f1736I = false;
        if (z6) {
            this.f1737n = i | 198656;
            this.f1729B = true;
        }
        r();
        return this;
    }

    public final a x(l lVar, boolean z6) {
        if (this.f1735H) {
            return clone().x(lVar, z6);
        }
        s sVar = new s(lVar, z6);
        w(Bitmap.class, lVar, z6);
        w(Drawable.class, sVar, z6);
        w(BitmapDrawable.class, sVar, z6);
        w(H1.c.class, new H1.d(lVar), z6);
        r();
        return this;
    }

    public final a y() {
        if (this.f1735H) {
            return clone().y();
        }
        this.J = true;
        this.f1737n |= o.f8528d;
        r();
        return this;
    }
}
