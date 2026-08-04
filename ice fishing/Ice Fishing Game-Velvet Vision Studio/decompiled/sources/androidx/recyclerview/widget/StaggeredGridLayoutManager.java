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
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.c0;
import com.gamericefishpro.space.r5.j0;
import com.gamericefishpro.space.r5.n;
import com.gamericefishpro.space.r5.o;
import com.gamericefishpro.space.r5.p0;
import com.gamericefishpro.space.r5.r0;
import com.gamericefishpro.space.r5.s0;
import com.gamericefishpro.space.u6.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends b0 {
    public final int k;
    public final s0[] l;
    public final b m;
    public final b n;
    public final int o;
    public final n p;
    public final boolean q;
    public final boolean r = false;
    public final BitSet s;
    public final c t;
    public final int u;
    public boolean v;
    public final Rect w;
    public final boolean x;
    public final com.gamericefishpro.space.h4.b y;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -1;
        this.q = false;
        c cVar = new c();
        this.t = cVar;
        this.u = 2;
        this.w = new Rect();
        new a0(this);
        this.x = true;
        this.y = new com.gamericefishpro.space.h4.b(18, this);
        o oVarB = b0.B(context, attributeSet, i, i2);
        int i3 = oVarB.b;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        b(null);
        if (i3 != this.o) {
            this.o = i3;
            b bVar = this.m;
            this.m = this.n;
            this.n = bVar;
            W();
        }
        int i4 = oVarB.c;
        b(null);
        if (i4 != this.k) {
            cVar.d();
            W();
            this.k = i4;
            this.s = new BitSet(this.k);
            this.l = new s0[this.k];
            for (int i5 = 0; i5 < this.k; i5++) {
                this.l[i5] = new s0(this, i5);
            }
            W();
        }
        boolean z = oVarB.d;
        b(null);
        this.q = z;
        W();
        n nVar = new n();
        nVar.a = true;
        nVar.f = 0;
        nVar.g = 0;
        this.p = nVar;
        this.m = b.a(this, this.o);
        this.n = b.a(this, 1 - this.o);
    }

    public static int n0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean E() {
        return this.u != 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void H(int i) {
        super.H(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            s0 s0Var = this.l[i2];
            int i3 = s0Var.b;
            if (i3 != Integer.MIN_VALUE) {
                s0Var.b = i3 + i;
            }
            int i4 = s0Var.c;
            if (i4 != Integer.MIN_VALUE) {
                s0Var.c = i4 + i;
            }
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void I(int i) {
        super.I(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            s0 s0Var = this.l[i2];
            int i3 = s0Var.b;
            if (i3 != Integer.MIN_VALUE) {
                s0Var.b = i3 + i;
            }
            int i4 = s0Var.c;
            if (i4 != Integer.MIN_VALUE) {
                s0Var.c = i4 + i;
            }
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void J() {
        this.t.d();
        for (int i = 0; i < this.k; i++) {
            this.l[i].b();
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.y);
        }
        for (int i = 0; i < this.k; i++) {
            this.l[i].b();
        }
        recyclerView.requestLayout();
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            View viewF0 = f0(false);
            View viewE0 = e0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iA = b0.A(viewF0);
            int iA2 = b0.A(viewE0);
            if (iA < iA2) {
                accessibilityEvent.setFromIndex(iA);
                accessibilityEvent.setToIndex(iA2);
            } else {
                accessibilityEvent.setFromIndex(iA2);
                accessibilityEvent.setToIndex(iA);
            }
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final Parcelable P() {
        int iF;
        int iM;
        int[] iArr;
        r0 r0Var = new r0();
        r0Var.A = this.q;
        r0Var.B = this.v;
        r0Var.C = false;
        c cVar = this.t;
        if (cVar == null || (iArr = (int[]) cVar.d) == null) {
            r0Var.w = 0;
        } else {
            r0Var.y = iArr;
            r0Var.w = iArr.length;
            r0Var.z = (ArrayList) cVar.e;
        }
        if (q() <= 0) {
            r0Var.d = -1;
            r0Var.e = -1;
            r0Var.i = 0;
            return r0Var;
        }
        r0Var.d = this.v ? h0() : g0();
        View viewE0 = this.r ? e0(true) : f0(true);
        r0Var.e = viewE0 != null ? b0.A(viewE0) : -1;
        int i = this.k;
        r0Var.i = i;
        r0Var.v = new int[i];
        for (int i2 = 0; i2 < this.k; i2++) {
            if (this.v) {
                iF = this.l[i2].e(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iM = this.m.h();
                    iF -= iM;
                }
            } else {
                iF = this.l[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iM = this.m.m();
                    iF -= iM;
                }
            }
            r0Var.v[i2] = iF;
        }
        return r0Var;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void Q(int i) {
        if (i == 0) {
            c0();
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int X(int i, a aVar, j0 j0Var) {
        return m0(i, aVar, j0Var);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int Y(int i, a aVar, j0 j0Var) {
        return m0(i, aVar, j0Var);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void b(String str) {
        super.b(str);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean c() {
        return this.o == 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0138 A[EDGE_INSN: B:78:0x0138->B:74:0x0138 BREAK  A[LOOP:0: B:28:0x0058->B:72:0x0131], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean c0() {
        int iG0;
        ?? r6;
        View viewP;
        ?? r7;
        ?? r10;
        if (q() != 0 && this.u != 0 && this.e) {
            boolean z = this.r;
            if (z) {
                iG0 = h0();
                g0();
            } else {
                iG0 = g0();
                h0();
            }
            if (iG0 == 0) {
                int iQ = q();
                int i = iQ - 1;
                int i2 = this.k;
                BitSet bitSet = new BitSet(i2);
                boolean z2 = true;
                bitSet.set(0, i2, true);
                if (this.o == 1) {
                    RecyclerView recyclerView = this.b;
                    Field field = l0.a;
                    if ((recyclerView.getLayoutDirection() == 1) == true) {
                        r6 = 1;
                    } else {
                        r6 = -1;
                    }
                } else {
                    r6 = -1;
                }
                if (z) {
                    iQ = -1;
                } else {
                    i = 0;
                }
                int i3 = i < iQ ? 1 : -1;
                while (true) {
                    if (i == iQ) {
                        z2 = z2 ? 1 : 0;
                        viewP = null;
                        break;
                    }
                    viewP = p(i);
                    p0 p0Var = (p0) viewP.getLayoutParams();
                    boolean z3 = bitSet.get(p0Var.d.e);
                    b bVar = this.m;
                    if (z3) {
                        s0 s0Var = p0Var.d;
                        if (z) {
                            int i4 = s0Var.c;
                            if (i4 == Integer.MIN_VALUE) {
                                s0Var.a();
                                i4 = s0Var.c;
                            }
                            if (i4 < bVar.h()) {
                                ArrayList arrayList = (ArrayList) s0Var.f;
                                ((p0) ((View) arrayList.get(arrayList.size() - (z2 ? 1 : 0))).getLayoutParams()).getClass();
                                z2 = z2 ? 1 : 0;
                                break;
                            }
                            z2 = z2 ? 1 : 0;
                            bitSet.clear(p0Var.d.e);
                        } else {
                            int i5 = s0Var.b;
                            ArrayList arrayList2 = (ArrayList) s0Var.f;
                            if (i5 == Integer.MIN_VALUE) {
                                View view = (View) arrayList2.get(0);
                                p0 p0Var2 = (p0) view.getLayoutParams();
                                s0Var.b = ((StaggeredGridLayoutManager) s0Var.g).m.f(view);
                                p0Var2.getClass();
                                i5 = s0Var.b;
                            }
                            if (i5 > bVar.m()) {
                                ((p0) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                                break;
                            }
                            bitSet.clear(p0Var.d.e);
                        }
                    } else {
                        z2 = z2 ? 1 : 0;
                    }
                    i += i3;
                    if (i != iQ) {
                        View viewP2 = p(i);
                        if (!z) {
                            int iF = bVar.f(viewP);
                            int iF2 = bVar.f(viewP2);
                            if (iF > iF2) {
                                break;
                            }
                            if (iF == iF2) {
                                if (p0Var.d.e - ((p0) viewP2.getLayoutParams()).d.e < 0) {
                                    r7 = z2 ? 1 : 0;
                                } else {
                                    r7 = 0;
                                }
                                if (r6 < 0) {
                                    r10 = z2 ? 1 : 0;
                                } else {
                                    r10 = 0;
                                }
                                if (r7 != r10) {
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int iC = bVar.c(viewP);
                            int iC2 = bVar.c(viewP2);
                            if (iC < iC2) {
                                break;
                            }
                            if (iC == iC2) {
                                if (p0Var.d.e - ((p0) viewP2.getLayoutParams()).d.e < 0) {
                                    r7 = z2 ? 1 : 0;
                                } else {
                                    r7 = 0;
                                }
                                if (r6 < 0) {
                                    r10 = z2 ? 1 : 0;
                                } else {
                                    r10 = 0;
                                }
                                if (r7 != r10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    z2 = z2 ? 1 : 0;
                }
                if (viewP != null) {
                    this.t.d();
                    W();
                    return z2;
                }
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean d() {
        return this.o == 1;
    }

    public final int d0(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.x;
        return com.gamericefishpro.space.wa.b.n(j0Var, this.m, f0(z), e0(z), this, this.x, this.r);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean e(c0 c0Var) {
        return c0Var instanceof p0;
    }

    public final View e0(boolean z) {
        int iM = this.m.m();
        int iH = this.m.h();
        View view = null;
        for (int iQ = q() - 1; iQ >= 0; iQ--) {
            View viewP = p(iQ);
            int iF = this.m.f(viewP);
            int iC = this.m.c(viewP);
            if (iC > iM && iF < iH) {
                if (iC <= iH || !z) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    public final View f0(boolean z) {
        int iM = this.m.m();
        int iH = this.m.h();
        int iQ = q();
        View view = null;
        for (int i = 0; i < iQ; i++) {
            View viewP = p(i);
            int iF = this.m.f(viewP);
            if (this.m.c(viewP) > iM && iF < iH) {
                if (iF >= iM || !z) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int g(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.x;
        return com.gamericefishpro.space.wa.b.m(j0Var, this.m, f0(z), e0(z), this, this.x);
    }

    public final int g0() {
        if (q() == 0) {
            return 0;
        }
        return b0.A(p(0));
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int h(j0 j0Var) {
        return d0(j0Var);
    }

    public final int h0() {
        int iQ = q();
        if (iQ == 0) {
            return 0;
        }
        return b0.A(p(iQ - 1));
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int i(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.x;
        return com.gamericefishpro.space.wa.b.o(j0Var, this.m, f0(z), e0(z), this, this.x);
    }

    public final void i0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.w;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.t(view));
        }
        p0 p0Var = (p0) view.getLayoutParams();
        int iN0 = n0(i, ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + rect.right);
        int iN1 = n0(i2, ((ViewGroup.MarginLayoutParams) p0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + rect.bottom);
        if (a0(view, iN0, iN1, p0Var)) {
            view.measure(iN0, iN1);
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int j(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.x;
        return com.gamericefishpro.space.wa.b.m(j0Var, this.m, f0(z), e0(z), this, this.x);
    }

    public final void j0(a aVar, n nVar) {
        int iMin;
        if (!nVar.a || nVar.i) {
            return;
        }
        if (nVar.b == 0) {
            if (nVar.e == -1) {
                k0(aVar, nVar.g);
                return;
            } else {
                l0(aVar, nVar.f);
                return;
            }
        }
        int i = 1;
        if (nVar.e == -1) {
            int i2 = nVar.f;
            int iF = this.l[0].f(i2);
            while (i < this.k) {
                int iF2 = this.l[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            k0(aVar, i3 < 0 ? nVar.g : nVar.g - Math.min(i3, nVar.b));
            return;
        }
        int i4 = nVar.g;
        int iE = this.l[0].e(i4);
        while (i < this.k) {
            int iE2 = this.l[i].e(i4);
            if (iE2 < iE) {
                iE = iE2;
            }
            i++;
        }
        int i5 = iE - nVar.g;
        if (i5 < 0) {
            iMin = nVar.f;
        } else {
            iMin = Math.min(i5, nVar.b) + nVar.f;
        }
        l0(aVar, iMin);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int k(j0 j0Var) {
        return d0(j0Var);
    }

    public final void k0(a aVar, int i) {
        int iQ = q() - 1;
        if (iQ >= 0) {
            View viewP = p(iQ);
            if (this.m.f(viewP) < i || this.m.q(viewP) < i) {
                return;
            }
            p0 p0Var = (p0) viewP.getLayoutParams();
            p0Var.getClass();
            if (((ArrayList) p0Var.d.f).size() == 1) {
                return;
            }
            ArrayList arrayList = (ArrayList) p0Var.d.f;
            ((p0) ((View) arrayList.remove(arrayList.size() - 1)).getLayoutParams()).d = null;
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int l(j0 j0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.x;
        return com.gamericefishpro.space.wa.b.o(j0Var, this.m, f0(z), e0(z), this, this.x);
    }

    public final void l0(a aVar, int i) {
        if (q() > 0) {
            View viewP = p(0);
            if (this.m.c(viewP) > i || this.m.p(viewP) > i) {
                return;
            }
            p0 p0Var = (p0) viewP.getLayoutParams();
            p0Var.getClass();
            if (((ArrayList) p0Var.d.f).size() == 1) {
                return;
            }
            s0 s0Var = p0Var.d;
            ArrayList arrayList = (ArrayList) s0Var.f;
            ((p0) ((View) arrayList.remove(0)).getLayoutParams()).d = null;
            if (arrayList.size() == 0) {
                s0Var.c = Integer.MIN_VALUE;
            }
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final c0 m() {
        return this.o == 0 ? new p0(-2, -1) : new p0(-1, -2);
    }

    public final int m0(int i, a aVar, j0 j0Var) {
        int iG0;
        int i2;
        int iH;
        if (q() == 0 || i == 0) {
            return 0;
        }
        if (i > 0) {
            iG0 = h0();
            i2 = 1;
        } else {
            iG0 = g0();
            i2 = -1;
        }
        n nVar = this.p;
        nVar.a = true;
        n nVar2 = this.p;
        boolean z = false;
        nVar2.b = 0;
        nVar2.c = iG0;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.y) {
            nVar2.g = this.m.g();
            nVar2.f = 0;
        } else {
            nVar2.f = this.m.m();
            nVar2.g = this.m.h();
        }
        nVar2.h = false;
        nVar2.a = true;
        if (this.m.j() == 0 && this.m.g() == 0) {
            z = true;
        }
        nVar2.i = z;
        n nVar3 = this.p;
        nVar3.e = i2;
        nVar3.d = this.r != (i2 == -1) ? -1 : 1;
        nVar.c = iG0 + nVar.d;
        nVar.b = Math.abs(i);
        this.s.set(0, this.k, true);
        n nVar4 = this.p;
        boolean z2 = nVar4.i;
        n nVar5 = this.p;
        int i3 = z2 ? nVar5.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar5.e == 1 ? nVar5.g + nVar5.b : nVar5.f - nVar5.b;
        int i4 = nVar5.e;
        for (int i5 = 0; i5 < this.k; i5++) {
            if (!((ArrayList) this.l[i5].f).isEmpty()) {
                s0 s0Var = this.l[i5];
                int i6 = s0Var.d;
                int i7 = s0Var.e;
                if (i4 == -1) {
                    int i8 = s0Var.b;
                    if (i8 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) s0Var.f).get(0);
                        p0 p0Var = (p0) view.getLayoutParams();
                        s0Var.b = ((StaggeredGridLayoutManager) s0Var.g).m.f(view);
                        p0Var.getClass();
                        i8 = s0Var.b;
                    }
                    if (i8 + i6 <= i3) {
                        this.s.set(i7, false);
                    }
                } else {
                    int i9 = s0Var.c;
                    if (i9 == Integer.MIN_VALUE) {
                        s0Var.a();
                        i9 = s0Var.c;
                    }
                    if (i9 - i6 >= i3) {
                        this.s.set(i7, false);
                    }
                }
            }
        }
        if (this.r) {
            this.m.h();
        } else {
            this.m.m();
        }
        int i10 = nVar5.c;
        if (i10 >= 0 && i10 < j0Var.a() && (nVar4.i || !this.s.isEmpty())) {
            View viewF = aVar.f(nVar5.c);
            nVar5.c += nVar5.d;
            ((p0) viewF.getLayoutParams()).getClass();
            throw null;
        }
        j0(aVar, nVar4);
        if (nVar4.e == -1) {
            int iM = this.m.m();
            int iF = this.l[0].f(iM);
            for (int i11 = 1; i11 < this.k; i11++) {
                int iF2 = this.l[i11].f(iM);
                if (iF2 < iF) {
                    iF = iF2;
                }
            }
            iH = this.m.m() - iF;
        } else {
            int iH2 = this.m.h();
            int iE = this.l[0].e(iH2);
            for (int i12 = 1; i12 < this.k; i12++) {
                int iE2 = this.l[i12].e(iH2);
                if (iE2 > iE) {
                    iE = iE2;
                }
            }
            iH = iE - this.m.h();
        }
        int iMin = iH > 0 ? Math.min(nVar5.b, iH) : 0;
        int i13 = nVar5.b < iMin ? i : i < 0 ? -iMin : iMin;
        this.m.s(-i13);
        this.v = this.r;
        nVar5.b = 0;
        j0(aVar, nVar5);
        return i13;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final c0 n(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final c0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p0((ViewGroup.MarginLayoutParams) layoutParams) : new p0(layoutParams);
    }
}
