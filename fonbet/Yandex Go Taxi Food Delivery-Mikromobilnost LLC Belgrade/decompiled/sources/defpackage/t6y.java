package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class t6y implements n6y, u5y {
    public final int a;
    public final List b;
    public final boolean c;
    public final it1 d;
    public final to5 e;
    public final LayoutDirection f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final c m;
    public final long n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;
    public int t = Integer.MIN_VALUE;
    public int u;
    public int v;
    public final int[] w;

    public t6y(int i, List list, boolean z, it1 it1Var, to5 to5Var, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, c cVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = it1Var;
        this.e = to5Var;
        this.f = layoutDirection;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = cVar;
        this.n = j2;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) list.get(i7);
            boolean z2 = this.c;
            i5 += z2 ? oVar.b : oVar.a;
            i6 = Math.max(i6, !z2 ? oVar.b : oVar.a);
        }
        this.p = i5;
        int i8 = i5 + this.i;
        this.q = i8 >= 0 ? i8 : 0;
        this.r = i6;
        this.w = new int[this.b.size() * 2];
    }

    public final int a(long j) {
        return (int) (this.c ? j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : j >> 32);
    }

    public final void b(o.a aVar, boolean z) {
        a aVar2;
        if (this.t == Integer.MIN_VALUE) {
            lxv.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) list.get(i);
            int i2 = this.u;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? oVar.b : oVar.a);
            int i4 = this.v;
            long l = l(i);
            b a = this.m.a(i, this.k);
            if (a != null) {
                if (z) {
                    a.r = l;
                } else {
                    if (!z5w.a(a.r, 9223372034707292159L)) {
                        l = a.r;
                    }
                    long c = z5w.c(l, ((z5w) a.q.getValue()).a);
                    if ((a(l) <= i3 && a(c) <= i3) || (a(l) >= i4 && a(c) >= i4)) {
                        a.b();
                    }
                    l = c;
                }
                aVar2 = a.n;
            } else {
                aVar2 = null;
            }
            long c2 = z5w.c(l, this.j);
            if (!z && a != null) {
                a.m = c2;
            }
            if (z2) {
                if (aVar2 != null) {
                    aVar.getClass();
                    o.a.a(aVar, oVar);
                    oVar.x0(z5w.c(c2, oVar.x), 0.0f, aVar2);
                } else {
                    o.a.y(aVar, oVar, c2);
                }
            } else if (aVar2 == null) {
                o.a.u(aVar, oVar, c2);
            } else if (aVar.d() == LayoutDirection.Ltr || aVar.e() == 0) {
                o.a.a(aVar, oVar);
                oVar.x0(z5w.c(c2, oVar.x), 0.0f, aVar2);
            } else {
                long e = (((int) (c2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((aVar.e() - oVar.a) - ((int) (c2 >> 32))) << 32);
                o.a.a(aVar, oVar);
                oVar.x0(z5w.c(e, oVar.x), 0.0f, aVar2);
            }
        }
    }

    @Override // defpackage.u5y
    public final void c(int i, int i2, int i3, int i4) {
        n(i, i3, i4);
    }

    @Override // defpackage.u5y
    public final int d() {
        return this.b.size();
    }

    @Override // defpackage.u5y
    public final int e() {
        return 1;
    }

    @Override // defpackage.u5y
    public final boolean f() {
        return this.s;
    }

    @Override // defpackage.u5y
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.u5y
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.u5y
    public final Object getKey() {
        return this.k;
    }

    @Override // defpackage.u5y
    public final void h() {
        this.s = true;
    }

    @Override // defpackage.u5y
    public final long i() {
        return this.n;
    }

    @Override // defpackage.u5y
    public final int j() {
        return this.q;
    }

    @Override // defpackage.u5y
    public final Object k(int i) {
        return ((o) this.b.get(i)).a();
    }

    @Override // defpackage.u5y
    public final long l(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.o;
            return this.c ? i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : i2 << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.w;
        return (iArr[i3 + 1] & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (iArr[i3] << 32);
    }

    @Override // defpackage.u5y
    public final int m() {
        return 0;
    }

    public final void n(int i, int i2, int i3) {
        int i4;
        this.o = i;
        boolean z = this.c;
        this.t = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.w;
            if (z) {
                it1 it1Var = this.d;
                if (it1Var == null) {
                    throw nzs.g("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = it1Var.a(oVar.a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = oVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                to5 to5Var = this.e;
                if (to5Var == null) {
                    throw nzs.g("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = to5Var.a(oVar.b, i3);
                i4 = oVar.a;
            }
            i += i4;
        }
        this.u = -this.g;
        this.v = this.t + this.h;
    }
}
