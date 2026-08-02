package defpackage;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k8t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public b8t a;
    public ViewGroup b;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5 A[EDGE_INSN: B:117:0x01e5->B:118:0x01e5 BREAK  A[LOOP:1: B:18:0x0087->B:29:0x01dc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        xy0 xy0Var;
        xy0 xy0Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        r7t r7tVar;
        boolean z;
        b9t b9tVar;
        View view;
        View view2;
        boolean z2;
        b8t b8tVar = this.a;
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!l8t.c.remove(viewGroup)) {
            return true;
        }
        xy0 c = l8t.c();
        ArrayList arrayList3 = (ArrayList) c.get(viewGroup);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            c.put(viewGroup, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            arrayList3.add(b8tVar);
            b8tVar.b(new kw9(this, c));
            i = 0;
            b8tVar.k(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((b8t) it.next()).J(viewGroup);
                }
            }
            b8tVar.m = new ArrayList();
            b8tVar.n = new ArrayList();
            x3n x3nVar = b8tVar.i;
            x3n x3nVar2 = b8tVar.j;
            xy0Var = new xy0((xy0) x3nVar.a);
            xy0Var2 = new xy0((xy0) x3nVar2.a);
            i2 = 0;
            while (true) {
                iArr = b8tVar.l;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = xy0Var.c - 1; i8 >= 0; i8--) {
                        View view3 = (View) xy0Var.f(i8);
                        if (view3 != null && b8tVar.B(view3) && (b9tVar = (b9t) xy0Var2.remove(view3)) != null && b8tVar.B(b9tVar.b)) {
                            b8tVar.m.add((b9t) xy0Var.h(i8));
                            b8tVar.n.add(b9tVar);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    xy0 xy0Var3 = (xy0) x3nVar.d;
                    xy0 xy0Var4 = (xy0) x3nVar2.d;
                    int i9 = xy0Var3.c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) xy0Var3.j(i10);
                        if (view4 != null && b8tVar.B(view4) && (view = (View) xy0Var4.get((String) xy0Var3.f(i10))) != null && b8tVar.B(view)) {
                            b9t b9tVar2 = (b9t) xy0Var.get(view4);
                            b9t b9tVar3 = (b9t) xy0Var2.get(view);
                            if (b9tVar2 != null && b9tVar3 != null) {
                                b8tVar.m.add(b9tVar2);
                                b8tVar.n.add(b9tVar3);
                                xy0Var.remove(view4);
                                xy0Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        ovg ovgVar = (ovg) x3nVar.c;
                        ovg ovgVar2 = (ovg) x3nVar2.c;
                        int h = ovgVar.h();
                        int i11 = i;
                        while (i11 < h) {
                            View view5 = (View) ovgVar.i(i11);
                            if (view5 == null || !b8tVar.B(view5)) {
                                z2 = z3;
                            } else {
                                z2 = z3;
                                View view6 = (View) ovgVar2.c(ovgVar.e(i11));
                                if (view6 != null && b8tVar.B(view6)) {
                                    b9t b9tVar4 = (b9t) xy0Var.get(view5);
                                    b9t b9tVar5 = (b9t) xy0Var2.get(view6);
                                    if (b9tVar4 != null && b9tVar5 != null) {
                                        b8tVar.m.add(b9tVar4);
                                        b8tVar.n.add(b9tVar5);
                                        xy0Var.remove(view5);
                                        xy0Var2.remove(view6);
                                    }
                                }
                            }
                            i11++;
                            z3 = z2;
                        }
                    }
                    z = z3;
                } else {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) x3nVar.b;
                    SparseArray sparseArray2 = (SparseArray) x3nVar2.b;
                    int size = sparseArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && b8tVar.B(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && b8tVar.B(view2)) {
                            b9t b9tVar6 = (b9t) xy0Var.get(view7);
                            b9t b9tVar7 = (b9t) xy0Var2.get(view2);
                            if (b9tVar6 != null && b9tVar7 != null) {
                                b8tVar.m.add(b9tVar6);
                                b8tVar.n.add(b9tVar7);
                                xy0Var.remove(view7);
                                xy0Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z4 = z3;
            for (i3 = 0; i3 < xy0Var.c; i3++) {
                b9t b9tVar8 = (b9t) xy0Var.j(i3);
                if (b8tVar.B(b9tVar8.b)) {
                    b8tVar.m.add(b9tVar8);
                    b8tVar.n.add(null);
                }
            }
            for (i4 = 0; i4 < xy0Var2.c; i4++) {
                b9t b9tVar9 = (b9t) xy0Var2.j(i4);
                if (b8tVar.B(b9tVar9.b)) {
                    b8tVar.n.add(b9tVar9);
                    b8tVar.m.add(null);
                }
            }
            xy0 u = b8t.u();
            int i13 = u.c;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) u.f(i5);
                if (animator != null && (r7tVar = (r7t) u.get(animator)) != null) {
                    b8t b8tVar2 = r7tVar.e;
                    View view8 = r7tVar.a;
                    if (view8 != null && windowId.equals(r7tVar.d)) {
                        b9t b9tVar10 = r7tVar.c;
                        boolean z5 = z4;
                        b9t w = b8tVar.w(view8, z5);
                        b9t s = b8tVar.s(view8, z5);
                        if (w == null && s == null) {
                            s = (b9t) ((xy0) b8tVar.j.a).get(view8);
                        }
                        if ((w != null || s != null) && b8tVar2.A(b9tVar10, s)) {
                            b8t t = b8tVar2.t();
                            ArrayList arrayList4 = b8tVar2.p;
                            if (t.B != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                u.h(i5);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(b8tVar2);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                u.h(i5);
                            }
                        }
                    }
                }
                i5--;
                z4 = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                b8t b8tVar3 = (b8t) arrayList2.get(i6);
                b8tVar3.E(b8tVar3, wvs.d, false);
                if (!b8tVar3.t) {
                    b8tVar3.t = true;
                    b8tVar3.E(b8tVar3, wvs.c, false);
                }
            }
            b8tVar.p(viewGroup, b8tVar.i, b8tVar.j, b8tVar.m, b8tVar.n);
            if (b8tVar.B != null) {
                b8tVar.K();
                return true;
            }
            if (Build.VERSION.SDK_INT < 34) {
                return true;
            }
            b8tVar.G();
            w7t w7tVar = b8tVar.B;
            n8t n8tVar = w7tVar.h;
            long j = n8tVar.A == 0 ? 1L : 0L;
            n8tVar.L(j, w7tVar.a);
            w7tVar.a = j;
            w7t w7tVar2 = b8tVar.B;
            w7tVar2.b = true;
            int i14 = w7tVar2.d;
            if (i14 == 1) {
                w7tVar2.d = 0;
                w7tVar2.h();
                return true;
            }
            if (i14 != 2) {
                return true;
            }
            w7tVar2.d = 0;
            w7tVar2.g = w7tVar2.g;
            w7tVar2.i();
            w7tVar2.e.a(0.0f);
            return true;
        }
        arrayList = null;
        arrayList3.add(b8tVar);
        b8tVar.b(new kw9(this, c));
        i = 0;
        b8tVar.k(viewGroup, false);
        if (arrayList != null) {
        }
        b8tVar.m = new ArrayList();
        b8tVar.n = new ArrayList();
        x3n x3nVar3 = b8tVar.i;
        x3n x3nVar22 = b8tVar.j;
        xy0Var = new xy0((xy0) x3nVar3.a);
        xy0Var2 = new xy0((xy0) x3nVar22.a);
        i2 = 0;
        while (true) {
            iArr = b8tVar.l;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z42 = z3;
        while (i3 < xy0Var.c) {
        }
        while (i4 < xy0Var2.c) {
        }
        xy0 u2 = b8t.u();
        int i132 = u2.c;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        while (i6 < arrayList2.size()) {
        }
        b8tVar.p(viewGroup, b8tVar.i, b8tVar.j, b8tVar.m, b8tVar.n);
        if (b8tVar.B != null) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        l8t.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) l8t.c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b8t) it.next()).J(viewGroup);
            }
        }
        this.a.l(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
