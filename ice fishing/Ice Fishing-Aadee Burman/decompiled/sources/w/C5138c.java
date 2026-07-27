package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.AbstractC5049e;
import u.C5050f;
import x.AbstractC5170h;
import x.C5177o;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5138c {

    /* renamed from: b, reason: collision with root package name */
    public int f41469b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41470c;

    /* renamed from: d, reason: collision with root package name */
    public final C5139d f41471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41472e;

    /* renamed from: f, reason: collision with root package name */
    public C5138c f41473f;
    public C5050f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f41468a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f41474g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f41475h = Integer.MIN_VALUE;

    public C5138c(C5139d c5139d, int i) {
        this.f41471d = c5139d;
        this.f41472e = i;
    }

    public final void a(C5138c c5138c, int i) {
        b(c5138c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C5138c c5138c, int i, int i6, boolean z3) {
        if (c5138c == null) {
            j();
            return true;
        }
        if (!z3 && !i(c5138c)) {
            return false;
        }
        this.f41473f = c5138c;
        if (c5138c.f41468a == null) {
            c5138c.f41468a = new HashSet();
        }
        HashSet hashSet = this.f41473f.f41468a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f41474g = i;
        this.f41475h = i6;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C5177o c5177o) {
        HashSet hashSet = this.f41468a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC5170h.b(((C5138c) it.next()).f41471d, i, arrayList, c5177o);
            }
        }
    }

    public final int d() {
        if (this.f41470c) {
            return this.f41469b;
        }
        return 0;
    }

    public final int e() {
        C5138c c5138c;
        if (this.f41471d.f41513g0 == 8) {
            return 0;
        }
        int i = this.f41475h;
        return (i == Integer.MIN_VALUE || (c5138c = this.f41473f) == null || c5138c.f41471d.f41513g0 != 8) ? this.f41474g : i;
    }

    public final C5138c f() {
        int i = this.f41472e;
        int d2 = AbstractC5049e.d(i);
        C5139d c5139d = this.f41471d;
        switch (d2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c5139d.f41485K;
            case 2:
                return c5139d.f41486L;
            case 3:
                return c5139d.f41484I;
            case 4:
                return c5139d.J;
            default:
                throw new AssertionError(u1.h.l(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f41468a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C5138c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f41473f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(C5138c c5138c) {
        if (c5138c != null) {
            int i = this.f41472e;
            C5139d c5139d = c5138c.f41471d;
            int i6 = c5138c.f41472e;
            if (i6 != i) {
                switch (AbstractC5049e.d(i)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z3 = i6 == 2 || i6 == 4;
                        if (!(c5139d instanceof h)) {
                            return z3;
                        }
                        if (z3 || i6 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z6 = i6 == 3 || i6 == 5;
                        if (!(c5139d instanceof h)) {
                            return z6;
                        }
                        if (z6 || i6 == 9) {
                        }
                        break;
                    case 5:
                        if (i6 == 2 || i6 == 4) {
                        }
                        break;
                    case 6:
                        if (i6 == 6 || i6 == 8 || i6 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(u1.h.l(i));
                }
            } else if (i != 6 || (c5139d.f41480E && this.f41471d.f41480E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        C5138c c5138c = this.f41473f;
        if (c5138c != null && (hashSet = c5138c.f41468a) != null) {
            hashSet.remove(this);
            if (this.f41473f.f41468a.size() == 0) {
                this.f41473f.f41468a = null;
            }
        }
        this.f41468a = null;
        this.f41473f = null;
        this.f41474g = 0;
        this.f41475h = Integer.MIN_VALUE;
        this.f41470c = false;
        this.f41469b = 0;
    }

    public final void k() {
        C5050f c5050f = this.i;
        if (c5050f == null) {
            this.i = new C5050f(1);
        } else {
            c5050f.c();
        }
    }

    public final void l(int i) {
        this.f41469b = i;
        this.f41470c = true;
    }

    public final String toString() {
        return this.f41471d.f41515h0 + ":" + u1.h.l(this.f41472e);
    }
}
