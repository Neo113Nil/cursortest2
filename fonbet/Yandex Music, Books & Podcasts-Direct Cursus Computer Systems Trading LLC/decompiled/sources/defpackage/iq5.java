package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class iq5 {
    public final oq5 a;
    public wb4 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final iqe d = new iqe(1, false);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public iq5(oq5 oq5Var, wb4 wb4Var) {
        this.a = oq5Var;
        this.b = wb4Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            puj pujVar = this.b.a;
            pujVar.G0(luj.d);
            pujVar.c[pujVar.d - pujVar.a[pujVar.b - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        wb4 wb4Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        wb4Var.getClass();
        if (size != 0) {
            puj pujVar2 = wb4Var.a;
            pujVar2.G0(mtj.d);
            q5g.J(pujVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                puj pujVar = this.b.a;
                pujVar.G0(buj.d);
                int i3 = pujVar.d - pujVar.a[pujVar.b - 1].b;
                int[] iArr = pujVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                puj pujVar2 = this.b.a;
                pujVar2.G0(xtj.d);
                int i6 = pujVar2.d - pujVar2.a[pujVar2.b - 1].b;
                int[] iArr2 = pujVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        exq exqVar = this.a.F;
        int i = z ? exqVar.i : exqVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            pq5.c("Tried to seek backward");
        }
        if (i2 > 0) {
            puj pujVar = this.b.a;
            pujVar.G0(etj.d);
            pujVar.c[pujVar.d - pujVar.a[pujVar.b - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e() {
        exq exqVar = this.a.F;
        if (exqVar.c > 0) {
            int i = exqVar.i;
            iqe iqeVar = this.d;
            if (iqeVar.b(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.a.G0(stj.d);
                    this.c = true;
                }
                if (i > 0) {
                    w80 a = exqVar.a(i);
                    iqeVar.d(i);
                    d(false);
                    puj pujVar = this.b.a;
                    pujVar.G0(rtj.d);
                    q5g.J(pujVar, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                pq5.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
