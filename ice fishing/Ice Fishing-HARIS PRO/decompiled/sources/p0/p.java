package p0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import r.C0338f;
import r.C0340h;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public m f4205a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f4206b;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e0 A[EDGE_INSN: B:117:0x01e0->B:118:0x01e0 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        m mVar;
        int i;
        B.k kVar;
        C0338f c0338f;
        C0338f c0338f2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        j jVar;
        View view;
        B.k kVar2;
        u uVar;
        View view2;
        B.k kVar3;
        ViewGroup viewGroup = this.f4206b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = q.f4209c;
        ViewGroup viewGroup2 = this.f4206b;
        int i6 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C0338f b2 = q.b();
        ArrayList arrayList3 = (ArrayList) b2.get(viewGroup2);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(viewGroup2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            mVar = this.f4205a;
            arrayList3.add(mVar);
            mVar.a(new o(this, b2));
            i = 0;
            mVar.h(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).y(viewGroup2);
                }
            }
            mVar.f4191k = new ArrayList();
            mVar.f4192l = new ArrayList();
            kVar = mVar.f4189g;
            B.k kVar4 = mVar.f4190h;
            c0338f = new C0338f((C0338f) kVar.f28a);
            c0338f2 = new C0338f((C0338f) kVar4.f28a);
            i2 = 0;
            while (true) {
                iArr = mVar.j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    kVar2 = kVar;
                    for (int i8 = c0338f.f4322c - 1; i8 >= 0; i8--) {
                        View view3 = (View) c0338f.f(i8);
                        if (view3 != null && mVar.t(view3) && (uVar = (u) c0338f2.remove(view3)) != null && mVar.t(uVar.f4214b)) {
                            mVar.f4191k.add((u) c0338f.g(i8));
                            mVar.f4192l.add(uVar);
                        }
                    }
                } else if (i7 == 2) {
                    kVar2 = kVar;
                    C0338f c0338f3 = (C0338f) kVar2.f31d;
                    int i9 = c0338f3.f4322c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) c0338f3.i(i10);
                        if (view4 != null && mVar.t(view4)) {
                            View view5 = (View) ((C0338f) kVar4.f31d).get(c0338f3.f(i10));
                            if (view5 != null && mVar.t(view5)) {
                                u uVar2 = (u) c0338f.get(view4);
                                u uVar3 = (u) c0338f2.get(view5);
                                if (uVar2 != null && uVar3 != null) {
                                    mVar.f4191k.add(uVar2);
                                    mVar.f4192l.add(uVar3);
                                    c0338f.remove(view4);
                                    c0338f2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        C0340h c0340h = (C0340h) kVar.f30c;
                        int e = c0340h.e();
                        int i11 = i;
                        while (i11 < e) {
                            View view6 = (View) c0340h.f(i11);
                            if (view6 == null || !mVar.t(view6)) {
                                kVar3 = kVar;
                            } else {
                                kVar3 = kVar;
                                View view7 = (View) ((C0340h) kVar4.f30c).b(c0340h.c(i11));
                                if (view7 != null && mVar.t(view7)) {
                                    u uVar4 = (u) c0338f.get(view6);
                                    u uVar5 = (u) c0338f2.get(view7);
                                    if (uVar4 != null && uVar5 != null) {
                                        mVar.f4191k.add(uVar4);
                                        mVar.f4192l.add(uVar5);
                                        c0338f.remove(view6);
                                        c0338f2.remove(view7);
                                    }
                                }
                            }
                            i11++;
                            kVar = kVar3;
                        }
                    }
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar;
                    SparseArray sparseArray = (SparseArray) kVar2.f29b;
                    SparseArray sparseArray2 = (SparseArray) kVar4.f29b;
                    int size = sparseArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View view8 = (View) sparseArray.valueAt(i12);
                        if (view8 != null && mVar.t(view8) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && mVar.t(view2)) {
                            u uVar6 = (u) c0338f.get(view8);
                            u uVar7 = (u) c0338f2.get(view2);
                            if (uVar6 != null && uVar7 != null) {
                                mVar.f4191k.add(uVar6);
                                mVar.f4192l.add(uVar7);
                                c0338f.remove(view8);
                                c0338f2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                kVar = kVar2;
                i = 0;
                i6 = 1;
            }
            for (i3 = 0; i3 < c0338f.f4322c; i3++) {
                u uVar8 = (u) c0338f.i(i3);
                if (mVar.t(uVar8.f4214b)) {
                    mVar.f4191k.add(uVar8);
                    mVar.f4192l.add(null);
                }
            }
            for (i4 = 0; i4 < c0338f2.f4322c; i4++) {
                u uVar9 = (u) c0338f2.i(i4);
                if (mVar.t(uVar9.f4214b)) {
                    mVar.f4192l.add(uVar9);
                    mVar.f4191k.add(null);
                }
            }
            C0338f p2 = m.p();
            int i13 = p2.f4322c;
            WindowId windowId = viewGroup2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.f(i5);
                if (animator != null && (jVar = (j) p2.get(animator)) != null && (view = jVar.f4171a) != null && windowId.equals(jVar.f4174d)) {
                    u r2 = mVar.r(view, true);
                    u n2 = mVar.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (u) ((C0338f) mVar.f4190h.f28a).get(view);
                    }
                    if (r2 != null || n2 != null) {
                        u uVar10 = jVar.f4173c;
                        m mVar2 = jVar.e;
                        if (mVar2.s(uVar10, n2)) {
                            mVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            mVar.l(viewGroup2, mVar.f4189g, mVar.f4190h, mVar.f4191k, mVar.f4192l);
            mVar.z();
            return true;
        }
        arrayList = null;
        mVar = this.f4205a;
        arrayList3.add(mVar);
        mVar.a(new o(this, b2));
        i = 0;
        mVar.h(viewGroup2, false);
        if (arrayList != null) {
        }
        mVar.f4191k = new ArrayList();
        mVar.f4192l = new ArrayList();
        kVar = mVar.f4189g;
        B.k kVar42 = mVar.f4190h;
        c0338f = new C0338f((C0338f) kVar.f28a);
        c0338f2 = new C0338f((C0338f) kVar42.f28a);
        i2 = 0;
        while (true) {
            iArr = mVar.j;
            if (i2 < iArr.length) {
            }
            i2++;
            kVar = kVar2;
            i = 0;
            i6 = 1;
        }
        while (i3 < c0338f.f4322c) {
        }
        while (i4 < c0338f2.f4322c) {
        }
        C0338f p22 = m.p();
        int i132 = p22.f4322c;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i5 >= 0) {
        }
        mVar.l(viewGroup2, mVar.f4189g, mVar.f4190h, mVar.f4191k, mVar.f4192l);
        mVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f4206b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = q.f4209c;
        ViewGroup viewGroup2 = this.f4206b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) q.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).y(viewGroup2);
            }
        }
        this.f4205a.i(true);
    }
}
