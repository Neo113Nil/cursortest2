package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.AbstractC5050e;
import u.C5051f;
import x.AbstractC5169h;
import x.C5176o;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5129d {

    /* renamed from: b, reason: collision with root package name */
    public int f41251b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41252c;

    /* renamed from: d, reason: collision with root package name */
    public final C5130e f41253d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41254e;

    /* renamed from: f, reason: collision with root package name */
    public C5129d f41255f;
    public C5051f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f41250a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f41256g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f41257h = Integer.MIN_VALUE;

    public C5129d(C5130e c5130e, int i) {
        this.f41253d = c5130e;
        this.f41254e = i;
    }

    public final void a(C5129d c5129d, int i) {
        b(c5129d, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C5129d c5129d, int i, int i4, boolean z6) {
        if (c5129d == null) {
            j();
            return true;
        }
        if (!z6 && !i(c5129d)) {
            return false;
        }
        this.f41255f = c5129d;
        if (c5129d.f41250a == null) {
            c5129d.f41250a = new HashSet();
        }
        HashSet hashSet = this.f41255f.f41250a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f41256g = i;
        this.f41257h = i4;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C5176o c5176o) {
        HashSet hashSet = this.f41250a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC5169h.b(((C5129d) it.next()).f41253d, i, arrayList, c5176o);
            }
        }
    }

    public final int d() {
        if (this.f41252c) {
            return this.f41251b;
        }
        return 0;
    }

    public final int e() {
        C5129d c5129d;
        if (this.f41253d.f41295g0 == 8) {
            return 0;
        }
        int i = this.f41257h;
        return (i == Integer.MIN_VALUE || (c5129d = this.f41255f) == null || c5129d.f41253d.f41295g0 != 8) ? this.f41256g : i;
    }

    public final C5129d f() {
        int i = this.f41254e;
        int d9 = AbstractC5050e.d(i);
        C5130e c5130e = this.f41253d;
        switch (d9) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c5130e.f41267K;
            case 2:
                return c5130e.f41268L;
            case 3:
                return c5130e.f41266I;
            case 4:
                return c5130e.J;
            default:
                throw new AssertionError(AbstractC5128c.k(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f41250a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C5129d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f41255f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(C5129d c5129d) {
        if (c5129d != null) {
            int i = this.f41254e;
            C5130e c5130e = c5129d.f41253d;
            int i4 = c5129d.f41254e;
            if (i4 != i) {
                switch (AbstractC5050e.d(i)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z6 = i4 == 2 || i4 == 4;
                        if (!(c5130e instanceof i)) {
                            return z6;
                        }
                        if (z6 || i4 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z9 = i4 == 3 || i4 == 5;
                        if (!(c5130e instanceof i)) {
                            return z9;
                        }
                        if (z9 || i4 == 9) {
                        }
                        break;
                    case 5:
                        if (i4 == 2 || i4 == 4) {
                        }
                        break;
                    case 6:
                        if (i4 == 6 || i4 == 8 || i4 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC5128c.k(i));
                }
            } else if (i != 6 || (c5130e.f41262E && this.f41253d.f41262E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        C5129d c5129d = this.f41255f;
        if (c5129d != null && (hashSet = c5129d.f41250a) != null) {
            hashSet.remove(this);
            if (this.f41255f.f41250a.size() == 0) {
                this.f41255f.f41250a = null;
            }
        }
        this.f41250a = null;
        this.f41255f = null;
        this.f41256g = 0;
        this.f41257h = Integer.MIN_VALUE;
        this.f41252c = false;
        this.f41251b = 0;
    }

    public final void k() {
        C5051f c5051f = this.i;
        if (c5051f == null) {
            this.i = new C5051f(1);
        } else {
            c5051f.c();
        }
    }

    public final void l(int i) {
        this.f41251b = i;
        this.f41252c = true;
    }

    public final String toString() {
        return this.f41253d.f41297h0 + ":" + AbstractC5128c.k(this.f41254e);
    }
}
