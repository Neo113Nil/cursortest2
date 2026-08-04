package com.gamericefishpro.space.i6;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public o d;
    public ViewGroup e;

    /* JADX WARN: Code duplicated, block: B:100:0x021f  */
    /* JADX WARN: Code duplicated, block: B:102:0x022d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0239  */
    /* JADX WARN: Code duplicated, block: B:107:0x0250  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f7 A[EDGE_INSN: B:141:0x01f7->B:90:0x01f7 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x020c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        com.gamericefishpro.space.u6.i iVar;
        com.gamericefishpro.space.u6.i iVar2;
        com.gamericefishpro.space.t.e eVar;
        com.gamericefishpro.space.t.e eVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        com.gamericefishpro.space.t.e eVarP;
        ArrayList arrayList2;
        int i5;
        int i6;
        o oVar;
        Animator animator;
        j jVar;
        v vVar;
        v vVar2;
        int i7;
        com.gamericefishpro.space.u6.i iVar3;
        boolean z2;
        int i8;
        View view;
        v vVar3;
        com.gamericefishpro.space.t.e eVar3;
        int i9;
        int i10;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i11;
        View view4;
        View view5;
        com.gamericefishpro.space.t.q qVar;
        int iG;
        int i12;
        View view6;
        com.gamericefishpro.space.u6.i iVar4;
        int size2;
        int i13;
        o oVar2 = this.d;
        ViewGroup viewGroup = this.e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!s.c.remove(viewGroup)) {
            return true;
        }
        com.gamericefishpro.space.t.e eVarB = s.b();
        ArrayList arrayList3 = (ArrayList) eVarB.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(oVar2);
            oVar2.a(new q(this, eVarB));
            i = 0;
            oVar2.h(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    ((o) obj).A(viewGroup);
                }
            }
            oVar2.D = new ArrayList();
            oVar2.E = new ArrayList();
            iVar = oVar2.z;
            iVar2 = oVar2.A;
            eVar = new com.gamericefishpro.space.t.e((com.gamericefishpro.space.t.e) iVar.a);
            eVar2 = new com.gamericefishpro.space.t.e((com.gamericefishpro.space.t.e) iVar2.a);
            i2 = 0;
            while (true) {
                iArr = oVar2.C;
                if (i2 < iArr.length) {
                    break;
                }
                i7 = iArr[i2];
                if (i7 != z3) {
                    iVar3 = iVar2;
                    z2 = z3;
                    for (i8 = eVar.i - 1; i8 >= 0; i8--) {
                        view = (View) eVar.f(i8);
                        if (view == null && oVar2.u(view) && (vVar3 = (v) eVar2.remove(view)) != null && oVar2.u(vVar3.b)) {
                            oVar2.D.add((v) eVar.g(i8));
                            oVar2.E.add(vVar3);
                        }
                    }
                } else if (i7 != 2) {
                    iVar3 = iVar2;
                    z2 = z3;
                    eVar3 = (com.gamericefishpro.space.t.e) iVar.d;
                    com.gamericefishpro.space.t.e eVar4 = (com.gamericefishpro.space.t.e) iVar3.d;
                    i9 = eVar3.i;
                    for (i10 = 0; i10 < i9; i10++) {
                        view2 = (View) eVar3.i(i10);
                        if (view2 == null && oVar2.u(view2) && (view3 = (View) eVar4.get((String) eVar3.f(i10))) != null && oVar2.u(view3)) {
                            v vVar4 = (v) eVar.get(view2);
                            v vVar5 = (v) eVar2.get(view3);
                            if (vVar4 != null && vVar5 != null) {
                                oVar2.D.add(vVar4);
                                oVar2.E.add(vVar5);
                                eVar.remove(view2);
                                eVar2.remove(view3);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    z2 = z3;
                    sparseArray = (SparseArray) iVar.b;
                    iVar3 = iVar2;
                    SparseArray sparseArray2 = (SparseArray) iVar3.b;
                    size = sparseArray.size();
                    for (i11 = 0; i11 < size; i11++) {
                        view4 = (View) sparseArray.valueAt(i11);
                        if (view4 == null && oVar2.u(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && oVar2.u(view5)) {
                            v vVar6 = (v) eVar.get(view4);
                            v vVar7 = (v) eVar2.get(view5);
                            if (vVar6 != null && vVar7 != null) {
                                oVar2.D.add(vVar6);
                                oVar2.E.add(vVar7);
                                eVar.remove(view4);
                                eVar2.remove(view5);
                            }
                        }
                    }
                } else if (i7 != 4) {
                    iVar3 = iVar2;
                    z2 = z3;
                } else {
                    qVar = (com.gamericefishpro.space.t.q) iVar.c;
                    com.gamericefishpro.space.t.q qVar2 = (com.gamericefishpro.space.t.q) iVar2.c;
                    iG = qVar.g();
                    i12 = i;
                    while (i12 < iG) {
                        view6 = (View) qVar.h(i12);
                        if (view6 == null && oVar2.u(view6)) {
                            iVar4 = iVar2;
                            View view7 = (View) qVar2.b(qVar.d(i12));
                            if (view7 != null && oVar2.u(view7)) {
                                v vVar8 = (v) eVar.get(view6);
                                v vVar9 = (v) eVar2.get(view7);
                                if (vVar8 != null && vVar9 != null) {
                                    oVar2.D.add(vVar8);
                                    oVar2.E.add(vVar9);
                                    eVar.remove(view6);
                                    eVar2.remove(view7);
                                }
                            }
                            i12++;
                            iVar2 = iVar4;
                            z3 = z3;
                        } else {
                            iVar4 = iVar2;
                        }
                        i12++;
                        iVar2 = iVar4;
                        z3 = z3;
                    }
                    z2 = z3;
                    iVar3 = iVar2;
                }
                i2++;
                iVar2 = iVar3;
                z3 = z2;
                i = 0;
            }
            z = z3;
            for (i3 = 0; i3 < eVar.i; i3++) {
                vVar2 = (v) eVar.i(i3);
                if (oVar2.u(vVar2.b)) {
                    oVar2.D.add(vVar2);
                    oVar2.E.add(null);
                }
            }
            for (i4 = 0; i4 < eVar2.i; i4++) {
                vVar = (v) eVar2.i(i4);
                if (oVar2.u(vVar.b)) {
                    oVar2.E.add(vVar);
                    oVar2.D.add(null);
                }
            }
            eVarP = o.p();
            int i14 = eVarP.i;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i14 - 1;
            while (i5 >= 0) {
                animator = (Animator) eVarP.f(i5);
                if (animator == null && (jVar = (j) eVarP.get(animator)) != null) {
                    o oVar3 = jVar.e;
                    View view8 = jVar.a;
                    if (view8 != null && windowId.equals(jVar.d)) {
                        v vVar10 = jVar.c;
                        boolean z4 = z;
                        v vVarR = oVar2.r(view8, z4);
                        v vVarN = oVar2.n(view8, z4);
                        if (vVarR == null && vVarN == null) {
                            vVarN = (v) ((com.gamericefishpro.space.t.e) oVar2.A.a).get(view8);
                        }
                        if ((vVarR != null || vVarN != null) && oVar3.t(vVar10, vVarN)) {
                            oVar3.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                eVarP.g(i5);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                oVar = (o) arrayList2.get(i6);
                oVar.w(oVar, n.f, false);
                if (!oVar.K) {
                    oVar.K = true;
                    oVar.w(oVar, n.c, false);
                }
            }
            oVar2.l(viewGroup, oVar2.z, oVar2.A, oVar2.D, oVar2.E);
            oVar2.B();
            return true;
        }
        arrayList3 = new ArrayList();
        eVarB.put(viewGroup, arrayList3);
        arrayList3.add(oVar2);
        oVar2.a(new q(this, eVarB));
        i = 0;
        oVar2.h(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList.get(i13);
                i13++;
                ((o) obj2).A(viewGroup);
            }
        }
        oVar2.D = new ArrayList();
        oVar2.E = new ArrayList();
        iVar = oVar2.z;
        iVar2 = oVar2.A;
        eVar = new com.gamericefishpro.space.t.e((com.gamericefishpro.space.t.e) iVar.a);
        eVar2 = new com.gamericefishpro.space.t.e((com.gamericefishpro.space.t.e) iVar2.a);
        i2 = 0;
        while (true) {
            iArr = oVar2.C;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i7 = iArr[i2];
            if (i7 != z3) {
                iVar3 = iVar2;
                z2 = z3;
                while (i8 >= 0) {
                    view = (View) eVar.f(i8);
                    if (view == null) {
                    }
                }
            } else if (i7 != 2) {
                iVar3 = iVar2;
                z2 = z3;
                eVar3 = (com.gamericefishpro.space.t.e) iVar.d;
                com.gamericefishpro.space.t.e eVar5 = (com.gamericefishpro.space.t.e) iVar3.d;
                i9 = eVar3.i;
                while (i10 < i9) {
                    view2 = (View) eVar3.i(i10);
                    if (view2 == null) {
                    }
                }
            } else if (i7 != 3) {
                z2 = z3;
                sparseArray = (SparseArray) iVar.b;
                iVar3 = iVar2;
                SparseArray sparseArray3 = (SparseArray) iVar3.b;
                size = sparseArray.size();
                while (i11 < size) {
                    view4 = (View) sparseArray.valueAt(i11);
                    if (view4 == null) {
                    }
                }
            } else if (i7 != 4) {
                iVar3 = iVar2;
                z2 = z3;
            } else {
                qVar = (com.gamericefishpro.space.t.q) iVar.c;
                com.gamericefishpro.space.t.q qVar3 = (com.gamericefishpro.space.t.q) iVar2.c;
                iG = qVar.g();
                i12 = i;
                while (i12 < iG) {
                    view6 = (View) qVar.h(i12);
                    if (view6 == null) {
                        iVar4 = iVar2;
                    } else {
                        iVar4 = iVar2;
                    }
                    i12++;
                    iVar2 = iVar4;
                    z3 = z3;
                }
                z2 = z3;
                iVar3 = iVar2;
            }
            i2++;
            iVar2 = iVar3;
            z3 = z2;
            i = 0;
        }
        z = z3;
        while (i3 < eVar.i) {
            vVar2 = (v) eVar.i(i3);
            if (oVar2.u(vVar2.b)) {
                oVar2.D.add(vVar2);
                oVar2.E.add(null);
            }
        }
        while (i4 < eVar2.i) {
            vVar = (v) eVar2.i(i4);
            if (oVar2.u(vVar.b)) {
                oVar2.E.add(vVar);
                oVar2.D.add(null);
            }
        }
        eVarP = o.p();
        int i15 = eVarP.i;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i15 - 1;
        while (i5 >= 0) {
            animator = (Animator) eVarP.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        while (i6 < arrayList2.size()) {
            oVar = (o) arrayList2.get(i6);
            oVar.w(oVar, n.f, false);
            if (!oVar.K) {
                oVar.K = true;
                oVar.w(oVar, n.c, false);
            }
        }
        oVar2.l(viewGroup, oVar2.z, oVar2.A, oVar2.D, oVar2.E);
        oVar2.B();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        s.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) s.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o) obj).A(viewGroup);
            }
        }
        this.d.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
