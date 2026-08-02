package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sus0 extends nus0 implements vtd, Iterable, xfx {
    public int A;
    public HashMap C;
    public wx40 D;
    public int b;
    public int w;
    public int x;
    public boolean z;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object y = new Object();
    public ArrayList B = new ArrayList();

    public static final void i(ows0 ows0Var, int i) {
        while (ows0Var.v >= 0 && ows0Var.u <= i) {
            ows0Var.O();
            ows0Var.j();
        }
    }

    @Override // defpackage.vtd
    public final Iterable d() {
        return this;
    }

    @Override // defpackage.nus0
    public final hz40 e(o13 o13Var, mp60 mp60Var) {
        int i;
        Object[] objArr = mp60Var.a;
        int i2 = mp60Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (l(uh6.e(((kb30) objArr[i3]).a()))) {
                i3++;
            } else {
                xy40 xy40Var = new xy40((Object) null);
                Object[] objArr2 = mp60Var.a;
                int i4 = mp60Var.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (l(uh6.e(((kb30) obj).a()))) {
                        xy40Var.g(obj);
                    }
                }
                mp60Var = xy40Var;
            }
        }
        mp60 d = mia1.d(mp60Var, new quq0(19, this));
        if (d.d()) {
            return cmm0.b;
        }
        hz40 b = cmm0.b();
        ows0 k = k();
        try {
            Object[] objArr3 = d.a;
            int i6 = d.b;
            for (int i7 = 0; i7 < i6; i7++) {
                kb30 kb30Var = (kb30) objArr3[i7];
                int c = k.c(uh6.e(kb30Var.a()));
                int G = k.G(c, k.b);
                i(k, G);
                i(k, G);
                while (true) {
                    i = k.t;
                    if (i == G || i == k.u) {
                        break;
                    }
                    if (G < k.u(i) + i) {
                        k.R();
                    } else {
                        k.N();
                    }
                }
                if (i != G) {
                    lid.a("Unexpected slot table structure");
                }
                k.R();
                k.a(c - k.t);
                b.o(kb30Var, lid.c(kb30Var.b(), kb30Var, k, o13Var));
            }
            i(k, Integer.MAX_VALUE);
            k.e(true);
            return b;
        } catch (Throwable th) {
            k.e(false);
            throw th;
        }
    }

    public final yss f(int i) {
        if (this.z) {
            lid.a("use active SlotWriter to create an anchor location instead");
        }
        if (i < 0 || i >= this.b) {
            khe0.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.B;
        int g = uus0.g(i, this.b, arrayList);
        if (g >= 0) {
            return (yss) arrayList.get(g);
        }
        yss yssVar = new yss(i);
        arrayList.add(-(g + 1), yssVar);
        return yssVar;
    }

    public final int g(yss yssVar) {
        if (this.z) {
            lid.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!yssVar.a()) {
            khe0.a("Anchor refers to a group that was removed");
        }
        return yssVar.a;
    }

    public final void h() {
        this.C = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u2u(this, 0, this.b);
    }

    public final dus0 j() {
        if (this.z) {
            ny61.r("Cannot read while a writer is pending");
            return null;
        }
        this.x++;
        return new dus0(this);
    }

    public final ows0 k() {
        if (this.z) {
            lid.a("Cannot start a writer when another writer is pending");
        }
        if (this.x > 0) {
            lid.a("Cannot start a writer when a reader is pending");
        }
        this.z = true;
        this.A++;
        return new ows0(this);
    }

    public final boolean l(yss yssVar) {
        if (!yssVar.a()) {
            return false;
        }
        int g = uus0.g(yssVar.a, this.b, this.B);
        return g >= 0 && jl40.l(this.B.get(g), yssVar);
    }

    public final dts m(int i) {
        int i2;
        ArrayList arrayList;
        int g;
        HashMap hashMap = this.C;
        if (hashMap != null) {
            if (this.z) {
                lid.a("use active SlotWriter to crate an anchor for location instead");
            }
            yss yssVar = (i < 0 || i >= (i2 = this.b) || (g = uus0.g(i, i2, (arrayList = this.B))) < 0) ? null : (yss) arrayList.get(g);
            if (yssVar != null) {
                return (dts) hashMap.get(yssVar);
            }
        }
        return null;
    }
}
