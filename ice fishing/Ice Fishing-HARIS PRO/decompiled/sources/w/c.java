package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.AbstractC0357e;
import x.AbstractC0373h;
import x.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f4516b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4517c;

    /* renamed from: d, reason: collision with root package name */
    public final d f4518d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public c f4519f;
    public u.f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f4515a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4520g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f4521h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.f4518d = dVar;
        this.e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i2, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z2 && !i(cVar)) {
            return false;
        }
        this.f4519f = cVar;
        if (cVar.f4515a == null) {
            cVar.f4515a = new HashSet();
        }
        HashSet hashSet = this.f4519f.f4515a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4520g = i;
        this.f4521h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f4515a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0373h.b(((c) it.next()).f4518d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f4517c) {
            return this.f4516b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f4518d.f4559g0 == 8) {
            return 0;
        }
        int i = this.f4521h;
        return (i == Integer.MIN_VALUE || (cVar = this.f4519f) == null || cVar.f4518d.f4559g0 != 8) ? this.f4520g : i;
    }

    public final c f() {
        int i = this.e;
        int a2 = AbstractC0357e.a(i);
        d dVar = this.f4518d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f4531K;
            case 2:
                return dVar.f4532L;
            case 3:
                return dVar.f4530I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(D1.h.k(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f4515a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f4519f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.e;
        d dVar = cVar.f4518d;
        int i2 = cVar.e;
        if (i2 == i) {
            return i != 6 || (dVar.f4526E && this.f4518d.f4526E);
        }
        switch (AbstractC0357e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (dVar instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (dVar instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(D1.h.k(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f4519f;
        if (cVar != null && (hashSet = cVar.f4515a) != null) {
            hashSet.remove(this);
            if (this.f4519f.f4515a.size() == 0) {
                this.f4519f.f4515a = null;
            }
        }
        this.f4515a = null;
        this.f4519f = null;
        this.f4520g = 0;
        this.f4521h = Integer.MIN_VALUE;
        this.f4517c = false;
        this.f4516b = 0;
    }

    public final void k() {
        u.f fVar = this.i;
        if (fVar == null) {
            this.i = new u.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i) {
        this.f4516b = i;
        this.f4517c = true;
    }

    public final String toString() {
        return this.f4518d.f4561h0 + ":" + D1.h.k(this.e);
    }
}
