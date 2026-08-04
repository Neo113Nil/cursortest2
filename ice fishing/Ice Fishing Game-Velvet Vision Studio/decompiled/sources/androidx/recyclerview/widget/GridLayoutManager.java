package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.gamericefishpro.space.e4.h;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.m5.a;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.c0;
import com.gamericefishpro.space.r5.j0;
import com.gamericefishpro.space.r5.m;
import com.gamericefishpro.space.r5.p;
import com.gamericefishpro.space.r5.q;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final d A;
    public final Rect B;
    public final int v;
    public int[] w;
    public View[] x;
    public final SparseIntArray y;
    public final SparseIntArray z;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.v = -1;
        this.y = new SparseIntArray();
        this.z = new SparseIntArray();
        d dVar = new d(25);
        this.A = dVar;
        this.B = new Rect();
        int i3 = b0.B(context, attributeSet, i, i2).c;
        if (i3 == this.v) {
            return;
        }
        if (i3 < 1) {
            throw new IllegalArgumentException(a.g(i3, "Span count should be at least 1. Provided "));
        }
        this.v = i3;
        ((SparseIntArray) dVar.e).clear();
        W();
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int C(com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        if (this.k == 0) {
            return this.v;
        }
        if (j0Var.a() < 1) {
            return 0;
        }
        return v0(j0Var.a() - 1, aVar, j0Var) + 1;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void O(com.gamericefishpro.space.bb.a aVar, j0 j0Var, View view, h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        if (view.getLayoutParams() instanceof m) {
            throw null;
        }
        N(view, hVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final int X(int i, com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        y0();
        t0();
        return super.X(i, aVar, j0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final int Y(int i, com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        y0();
        t0();
        return super.Y(i, aVar, j0Var);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean e(c0 c0Var) {
        return c0Var instanceof m;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final int h(j0 j0Var) {
        return d0(j0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final int i(j0 j0Var) {
        return e0(j0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final int k(j0 j0Var) {
        return d0(j0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final int l(j0 j0Var) {
        return e0(j0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.gamericefishpro.space.r5.b0
    public final c0 m() {
        return this.k == 0 ? new m(-2, -1) : new m(-1, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void m0(com.gamericefishpro.space.bb.a aVar, j0 j0Var, q qVar, p pVar) {
        int iW0;
        int i;
        int i2;
        int i3;
        int iE;
        int iX;
        int iZ;
        int iE2;
        int iR;
        int iR2;
        ?? r13;
        int i4;
        View viewB;
        int i5;
        int iK = this.m.k();
        boolean z = iK != 1073741824;
        int i6 = q() > 0 ? this.w[this.v] : 0;
        if (z) {
            y0();
        }
        boolean z2 = qVar.e == 1;
        if (z2) {
            iW0 = this.v;
        } else {
            int i7 = qVar.d;
            boolean z3 = j0Var.e;
            d dVar = this.A;
            if (z3) {
                int i8 = this.z.get(i7, -1);
                if (i8 != -1) {
                    i5 = i8;
                } else {
                    int iD = aVar.d(i7);
                    if (iD == -1) {
                        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
                        i5 = 0;
                    } else {
                        dVar.getClass();
                        i5 = iD % this.v;
                    }
                }
            } else {
                dVar.getClass();
                i5 = i7 % this.v;
            }
            iW0 = w0(qVar.d, aVar, j0Var) + i5;
        }
        int i9 = 0;
        while (i9 < this.v && (i4 = qVar.d) >= 0 && i4 < j0Var.a() && iW0 > 0) {
            int i10 = qVar.d;
            int iW1 = w0(i10, aVar, j0Var);
            if (iW1 > this.v) {
                throw new IllegalArgumentException("Item at position " + i10 + " requires " + iW1 + " spans but GridLayoutManager has only " + this.v + " spans.");
            }
            iW0 -= iW1;
            if (iW0 < 0 || (viewB = qVar.b(aVar)) == null) {
                break;
            }
            this.x[i9] = viewB;
            i9++;
        }
        if (i9 == 0) {
            pVar.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i9;
            i = 0;
        } else {
            i = i9 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i11 = 0;
        while (i != i2) {
            View view = this.x[i];
            m mVar = (m) view.getLayoutParams();
            int iW2 = w0(b0.A(view), aVar, j0Var);
            mVar.e = iW2;
            mVar.d = i11;
            i11 += iW2;
            i += i3;
        }
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            View view2 = this.x[i13];
            if (qVar.j != null) {
                r13 = 0;
                r13 = 0;
                if (z2) {
                    a(view2, -1, true);
                } else {
                    a(view2, 0, true);
                }
            } else if (z2) {
                r13 = 0;
                a(view2, -1, false);
            } else {
                r13 = 0;
                a(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.B;
            if (recyclerView == null) {
                rect.set(r13, r13, r13, r13);
            } else {
                rect.set(recyclerView.t(view2));
            }
            x0(view2, iK, r13);
            int iD2 = this.m.d(view2);
            if (iD2 > i12) {
                i12 = iD2;
            }
            float fE = (this.m.e(view2) * 1.0f) / ((m) view2.getLayoutParams()).e;
            if (fE > f) {
                f = fE;
            }
        }
        if (z) {
            s0(Math.max(Math.round(f * this.v), i6));
            int i14 = 0;
            for (int i15 = 0; i15 < i9; i15++) {
                View view3 = this.x[i15];
                x0(view3, 1073741824, true);
                int iD3 = this.m.d(view3);
                if (iD3 > i14) {
                    i14 = iD3;
                }
            }
            i12 = i14;
        }
        for (int i16 = 0; i16 < i9; i16++) {
            View view4 = this.x[i16];
            if (this.m.d(view4) != i12) {
                m mVar2 = (m) view4.getLayoutParams();
                Rect rect2 = mVar2.a;
                int i17 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin;
                int i18 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin;
                int iU0 = u0(mVar2.d, mVar2.e);
                if (this.k == 1) {
                    iR2 = b0.r(false, iU0, 1073741824, i18, ((ViewGroup.MarginLayoutParams) mVar2).width);
                    iR = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i18, 1073741824);
                    iR = b0.r(false, iU0, 1073741824, i17, ((ViewGroup.MarginLayoutParams) mVar2).height);
                    iR2 = iMakeMeasureSpec;
                }
                if (b0(view4, iR2, iR, (c0) view4.getLayoutParams())) {
                    view4.measure(iR2, iR);
                }
            }
        }
        pVar.a = i12;
        if (this.k != 1) {
            if (qVar.f == -1) {
                int i19 = qVar.b;
                iX = i19 - i12;
                iE = i19;
            } else {
                int i20 = qVar.b;
                iE = i20 + i12;
                iX = i20;
            }
            iZ = 0;
            iE2 = 0;
        } else if (qVar.f == -1) {
            iE2 = qVar.b;
            iZ = iE2 - i12;
            iX = 0;
            iE = 0;
        } else {
            int i21 = qVar.b;
            iZ = i21;
            iE = 0;
            iE2 = i21 + i12;
            iX = 0;
        }
        if (i9 <= 0) {
            Arrays.fill(this.x, (Object) null);
            return;
        }
        View view5 = this.x[0];
        m mVar3 = (m) view5.getLayoutParams();
        if (this.k != 1) {
            iZ = z() + this.w[mVar3.d];
            iE2 = this.m.e(view5) + iZ;
        } else if (l0()) {
            iE = this.w[this.v - mVar3.d] + x();
            iX = iE - this.m.e(view5);
        } else {
            iX = x() + this.w[mVar3.d];
            iE = this.m.e(view5) + iX;
        }
        b0.G(view5, iX, iZ, iE, iE2);
        mVar3.getClass();
        throw null;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final c0 n(Context context, AttributeSet attributeSet) {
        m mVar = new m(context, attributeSet);
        mVar.d = -1;
        mVar.e = 0;
        return mVar;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final c0 o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            m mVar = new m((ViewGroup.MarginLayoutParams) layoutParams);
            mVar.d = -1;
            mVar.e = 0;
            return mVar;
        }
        m mVar2 = new m(layoutParams);
        mVar2.d = -1;
        mVar2.e = 0;
        return mVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r0(false);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int s(com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        if (this.k == 1) {
            return this.v;
        }
        if (j0Var.a() < 1) {
            return 0;
        }
        return v0(j0Var.a() - 1, aVar, j0Var) + 1;
    }

    public final void s0(int i) {
        int i2;
        int[] iArr = this.w;
        int i3 = this.v;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.w = iArr;
    }

    public final void t0() {
        View[] viewArr = this.x;
        if (viewArr == null || viewArr.length != this.v) {
            this.x = new View[this.v];
        }
    }

    public final int u0(int i, int i2) {
        if (this.k != 1 || !l0()) {
            int[] iArr = this.w;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.w;
        int i3 = this.v;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int v0(int i, com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        boolean z = j0Var.e;
        d dVar = this.A;
        if (!z) {
            dVar.getClass();
            return d.t(i, this.v);
        }
        int iD = aVar.d(i);
        if (iD != -1) {
            dVar.getClass();
            return d.t(iD, this.v);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int w0(int i, com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        boolean z = j0Var.e;
        d dVar = this.A;
        if (!z) {
            dVar.getClass();
            return 1;
        }
        int i2 = this.y.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (aVar.d(i) != -1) {
            dVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void x0(View view, int i, boolean z) {
        int iR;
        int iR2;
        m mVar = (m) view.getLayoutParams();
        Rect rect = mVar.a;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
        int iU0 = u0(mVar.d, mVar.e);
        if (this.k == 1) {
            iR2 = b0.r(false, iU0, i, i3, ((ViewGroup.MarginLayoutParams) mVar).width);
            iR = b0.r(true, this.m.o(), this.h, i2, ((ViewGroup.MarginLayoutParams) mVar).height);
        } else {
            int iR3 = b0.r(false, iU0, i, i2, ((ViewGroup.MarginLayoutParams) mVar).height);
            int iR4 = b0.r(true, this.m.o(), this.g, i3, ((ViewGroup.MarginLayoutParams) mVar).width);
            iR = iR3;
            iR2 = iR4;
        }
        c0 c0Var = (c0) view.getLayoutParams();
        if (z ? b0(view, iR2, iR, c0Var) : a0(view, iR2, iR, c0Var)) {
            view.measure(iR2, iR);
        }
    }

    public final void y0() {
        int iW;
        int iZ;
        if (this.k == 1) {
            iW = this.i - y();
            iZ = x();
        } else {
            iW = this.j - w();
            iZ = z();
        }
        s0(iW - iZ);
    }
}
