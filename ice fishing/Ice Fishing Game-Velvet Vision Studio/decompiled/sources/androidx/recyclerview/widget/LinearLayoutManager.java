package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.gamericefishpro.space.bb.a;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.f.b;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.c0;
import com.gamericefishpro.space.r5.j0;
import com.gamericefishpro.space.r5.o;
import com.gamericefishpro.space.r5.p;
import com.gamericefishpro.space.r5.q;
import com.gamericefishpro.space.r5.r;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends b0 {
    public int k;
    public q l;
    public b m;
    public final boolean n;
    public final boolean o;
    public boolean p;
    public final boolean q;
    public final r r;
    public final o s;
    public final p t;
    public final int[] u;

    public LinearLayoutManager() {
        this.k = 1;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = null;
        this.s = new o(0);
        this.t = new p();
        this.u = new int[2];
        q0(1);
        b(null);
        if (this.n) {
            this.n = false;
            W();
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean E() {
        return true;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            View viewI0 = i0(0, q(), false);
            accessibilityEvent.setFromIndex(viewI0 == null ? -1 : b0.A(viewI0));
            View viewI1 = i0(q() - 1, -1, false);
            accessibilityEvent.setToIndex(viewI1 != null ? b0.A(viewI1) : -1);
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final Parcelable P() {
        r rVar = this.r;
        if (rVar != null) {
            r rVar2 = new r();
            rVar2.d = rVar.d;
            rVar2.e = rVar.e;
            rVar2.i = rVar.i;
            return rVar2;
        }
        r rVar3 = new r();
        if (q() <= 0) {
            rVar3.d = -1;
            return rVar3;
        }
        f0();
        boolean z = false ^ this.o;
        rVar3.i = z;
        if (z) {
            View viewJ0 = j0();
            rVar3.e = this.m.h() - this.m.c(viewJ0);
            rVar3.d = b0.A(viewJ0);
            return rVar3;
        }
        View viewK0 = k0();
        rVar3.d = b0.A(viewK0);
        rVar3.e = this.m.f(viewK0) - this.m.m();
        return rVar3;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public int X(int i, a aVar, j0 j0Var) {
        if (this.k == 1) {
            return 0;
        }
        return p0(i, aVar, j0Var);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public int Y(int i, a aVar, j0 j0Var) {
        if (this.k == 0) {
            return 0;
        }
        return p0(i, aVar, j0Var);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void b(String str) {
        if (this.r == null) {
            super.b(str);
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean c() {
        return this.k == 0;
    }

    public final int c0(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        b bVar = this.m;
        boolean z = !this.q;
        return com.gamericefishpro.space.wa.b.m(j0Var, bVar, h0(z), g0(z), this, this.q);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean d() {
        return this.k == 1;
    }

    public final int d0(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        b bVar = this.m;
        boolean z = !this.q;
        return com.gamericefishpro.space.wa.b.n(j0Var, bVar, h0(z), g0(z), this, this.q, this.o);
    }

    public final int e0(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        b bVar = this.m;
        boolean z = !this.q;
        return com.gamericefishpro.space.wa.b.o(j0Var, bVar, h0(z), g0(z), this, this.q);
    }

    public final void f0() {
        if (this.l == null) {
            q qVar = new q();
            qVar.a = true;
            qVar.h = 0;
            qVar.i = 0;
            qVar.j = null;
            this.l = qVar;
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int g(j0 j0Var) {
        return c0(j0Var);
    }

    public final View g0(boolean z) {
        return this.o ? i0(0, q(), z) : i0(q() - 1, -1, z);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public int h(j0 j0Var) {
        return d0(j0Var);
    }

    public final View h0(boolean z) {
        return this.o ? i0(q() - 1, -1, z) : i0(0, q(), z);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public int i(j0 j0Var) {
        return e0(j0Var);
    }

    public final View i0(int i, int i2, boolean z) {
        f0();
        int i3 = z ? 24579 : 320;
        return this.k == 0 ? this.c.e(i, i2, i3, 320) : this.d.e(i, i2, i3, 320);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int j(j0 j0Var) {
        return c0(j0Var);
    }

    public final View j0() {
        return p(this.o ? 0 : q() - 1);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public int k(j0 j0Var) {
        return d0(j0Var);
    }

    public final View k0() {
        return p(this.o ? q() - 1 : 0);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public int l(j0 j0Var) {
        return e0(j0Var);
    }

    public final boolean l0() {
        RecyclerView recyclerView = this.b;
        Field field = l0.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public c0 m() {
        return new c0(-2, -2);
    }

    public void m0(a aVar, j0 j0Var, q qVar, p pVar) {
        int i;
        int iE;
        int i2;
        int iX;
        int i3;
        View viewB = qVar.b(aVar);
        if (viewB == null) {
            pVar.b = true;
            return;
        }
        c0 c0Var = (c0) viewB.getLayoutParams();
        if (qVar.j == null) {
            if (this.o == (qVar.f == -1)) {
                a(viewB, -1, false);
            } else {
                a(viewB, 0, false);
            }
        } else {
            if (this.o == (qVar.f == -1)) {
                a(viewB, -1, true);
            } else {
                a(viewB, 0, true);
            }
        }
        c0 c0Var2 = (c0) viewB.getLayoutParams();
        Rect rectT = this.b.t(viewB);
        int i4 = rectT.left + rectT.right;
        int i5 = rectT.top + rectT.bottom;
        int iR = b0.r(c(), this.i, this.g, y() + x() + ((ViewGroup.MarginLayoutParams) c0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) c0Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0Var2).width);
        int iR2 = b0.r(d(), this.j, this.h, w() + z() + ((ViewGroup.MarginLayoutParams) c0Var2).topMargin + ((ViewGroup.MarginLayoutParams) c0Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0Var2).height);
        if (a0(viewB, iR, iR2, c0Var2)) {
            viewB.measure(iR, iR2);
        }
        pVar.a = this.m.d(viewB);
        if (this.k == 1) {
            if (l0()) {
                iE = this.i - y();
                iX = iE - this.m.e(viewB);
            } else {
                iX = x();
                iE = this.m.e(viewB) + iX;
            }
            if (qVar.f == -1) {
                i3 = qVar.b;
                i = i3 - pVar.a;
            } else {
                int i6 = qVar.b;
                i2 = pVar.a + i6;
                i = i6;
                i3 = i2;
            }
        } else {
            int iZ = z();
            int iE2 = this.m.e(viewB) + iZ;
            if (qVar.f == -1) {
                int i7 = qVar.b;
                int i8 = i7 - pVar.a;
                i = iZ;
                iE = i7;
                i3 = iE2;
                iX = i8;
            } else {
                int i9 = qVar.b;
                int i10 = pVar.a + i9;
                i = iZ;
                iE = i10;
                i2 = iE2;
                iX = i9;
                i3 = i2;
            }
        }
        b0.G(viewB, iX, i, iE, i3);
        c0Var.getClass();
        throw null;
    }

    public final void n0(a aVar, q qVar) {
        if (!qVar.a || qVar.k) {
            return;
        }
        int i = qVar.g;
        int i2 = qVar.i;
        if (qVar.f == -1) {
            int iQ = q();
            if (i < 0) {
                return;
            }
            int iG = (this.m.g() - i) + i2;
            if (this.o) {
                for (int i3 = 0; i3 < iQ; i3++) {
                    View viewP = p(i3);
                    if (this.m.f(viewP) < iG || this.m.q(viewP) < iG) {
                        o0(aVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iQ - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewP2 = p(i5);
                if (this.m.f(viewP2) < iG || this.m.q(viewP2) < iG) {
                    o0(aVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iQ2 = q();
        if (!this.o) {
            for (int i7 = 0; i7 < iQ2; i7++) {
                View viewP3 = p(i7);
                if (this.m.c(viewP3) > i6 || this.m.p(viewP3) > i6) {
                    o0(aVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iQ2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewP4 = p(i9);
            if (this.m.c(viewP4) > i6 || this.m.p(viewP4) > i6) {
                o0(aVar, i8, i9);
                return;
            }
        }
    }

    public final void o0(a aVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewP = p(i);
                U(i);
                aVar.i(viewP);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewP2 = p(i3);
            U(i3);
            aVar.i(viewP2);
        }
    }

    public final int p0(int i, a aVar, j0 j0Var) {
        int iM;
        int i2;
        if (q() != 0 && i != 0) {
            f0();
            this.l.a = true;
            int i3 = i <= 0 ? -1 : 1;
            int iAbs = Math.abs(i);
            this.l.k = this.m.j() == 0 && this.m.g() == 0;
            this.l.f = i3;
            int[] iArr = this.u;
            iArr[0] = 0;
            iArr[1] = 0;
            j0Var.getClass();
            int i4 = this.l.f;
            iArr[0] = 0;
            iArr[1] = 0;
            int iMax = Math.max(0, iArr[0]);
            int iMax2 = Math.max(0, iArr[1]);
            boolean z = i3 == 1;
            q qVar = this.l;
            int i5 = z ? iMax2 : iMax;
            qVar.h = i5;
            if (!z) {
                iMax = iMax2;
            }
            qVar.i = iMax;
            if (z) {
                qVar.h = this.m.i() + i5;
                View viewJ0 = j0();
                q qVar2 = this.l;
                qVar2.e = this.o ? -1 : 1;
                int iA = b0.A(viewJ0);
                q qVar3 = this.l;
                qVar2.d = iA + qVar3.e;
                qVar3.b = this.m.c(viewJ0);
                iM = this.m.c(viewJ0) - this.m.h();
            } else {
                View viewK0 = k0();
                q qVar4 = this.l;
                qVar4.h = this.m.m() + qVar4.h;
                q qVar5 = this.l;
                qVar5.e = this.o ? 1 : -1;
                int iA2 = b0.A(viewK0);
                q qVar6 = this.l;
                qVar5.d = iA2 + qVar6.e;
                qVar6.b = this.m.f(viewK0);
                iM = (-this.m.f(viewK0)) + this.m.m();
            }
            q qVar7 = this.l;
            qVar7.c = iAbs;
            qVar7.c = iAbs - iM;
            qVar7.g = iM;
            q qVar8 = this.l;
            int i6 = qVar8.g;
            int i7 = qVar8.c;
            int i8 = qVar8.g;
            if (i8 != Integer.MIN_VALUE) {
                if (i7 < 0) {
                    qVar8.g = i8 + i7;
                }
                n0(aVar, qVar8);
            }
            int i9 = qVar8.c + qVar8.h;
            while (true) {
                if ((!qVar8.k && i9 <= 0) || (i2 = qVar8.d) < 0 || i2 >= j0Var.a()) {
                    break;
                }
                p pVar = this.t;
                pVar.a = 0;
                pVar.b = false;
                pVar.c = false;
                pVar.d = false;
                m0(aVar, j0Var, qVar8, pVar);
                if (pVar.b) {
                    break;
                }
                int i10 = qVar8.b;
                int i11 = pVar.a;
                qVar8.b = (qVar8.f * i11) + i10;
                if (!pVar.c || qVar8.j != null || !j0Var.e) {
                    qVar8.c -= i11;
                    i9 -= i11;
                }
                int i12 = qVar8.g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    qVar8.g = i13;
                    int i14 = qVar8.c;
                    if (i14 < 0) {
                        qVar8.g = i13 + i14;
                    }
                    n0(aVar, qVar8);
                }
            }
            int i15 = (i7 - qVar8.c) + i6;
            if (i15 >= 0) {
                if (iAbs > i15) {
                    i = i3 * i15;
                }
                this.m.s(-i);
                this.l.getClass();
                return i;
            }
        }
        return 0;
    }

    public final void q0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "invalid orientation:"));
        }
        b(null);
        if (i != this.k || this.m == null) {
            this.m = b.a(this, i);
            this.s.getClass();
            this.k = i;
            W();
        }
    }

    public void r0(boolean z) {
        b(null);
        if (this.p == z) {
            return;
        }
        this.p = z;
        W();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = null;
        this.s = new o(0);
        this.t = new p();
        this.u = new int[2];
        o oVarB = b0.B(context, attributeSet, i, i2);
        q0(oVarB.b);
        boolean z = oVarB.d;
        b(null);
        if (z != this.n) {
            this.n = z;
            W();
        }
        r0(oVarB.e);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void L(RecyclerView recyclerView) {
    }
}
