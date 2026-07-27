package D0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public o f663n;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f664u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff A[EDGE_INSN: B:120:0x01ff->B:121:0x01ff BREAK  A[LOOP:1: B:17:0x0088->B:29:0x01f4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [s.k] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        o oVar;
        int i;
        s.b bVar;
        s.b bVar2;
        int i4;
        int[] iArr;
        s.b bVar3;
        int i9;
        int i10;
        int i11;
        l lVar;
        View view;
        boolean z8;
        s.b bVar4;
        w wVar;
        View view2;
        View view3;
        boolean z9;
        ?? r15;
        FrameLayout frameLayout = this.f664u;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = s.f667c;
        FrameLayout frameLayout2 = this.f664u;
        boolean z10 = true;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        s.b b9 = s.b();
        Long l9 = null;
        ArrayList arrayList3 = (ArrayList) b9.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b9.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            oVar = this.f663n;
            arrayList3.add(oVar);
            oVar.a(new q(this, b9));
            i = 0;
            oVar.m(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).D(frameLayout2);
                }
            }
            oVar.f643D = new ArrayList();
            oVar.f644E = new ArrayList();
            S0.n nVar = oVar.f660z;
            S0.n nVar2 = oVar.f640A;
            bVar = new s.b((s.b) nVar.f2914n);
            bVar2 = new s.b((s.b) nVar2.f2914n);
            i4 = 0;
            while (true) {
                iArr = oVar.f642C;
                if (i4 < iArr.length) {
                    break;
                }
                int i12 = iArr[i4];
                if (i12 == z10) {
                    z8 = z10;
                    bVar4 = bVar2;
                    for (int i13 = bVar.f40409v - 1; i13 >= 0; i13--) {
                        View view4 = (View) bVar.h(i13);
                        if (view4 != null && oVar.y(view4) && (wVar = (w) bVar4.remove(view4)) != null && oVar.y(wVar.f672b)) {
                            oVar.f643D.add((w) bVar.j(i13));
                            oVar.f644E.add(wVar);
                        }
                    }
                } else if (i12 == 2) {
                    z8 = z10;
                    bVar4 = bVar2;
                    s.b bVar5 = (s.b) nVar.f2917w;
                    s.b bVar6 = (s.b) nVar2.f2917w;
                    int i14 = bVar5.f40409v;
                    for (int i15 = 0; i15 < i14; i15++) {
                        View view5 = (View) bVar5.l(i15);
                        if (view5 != null && oVar.y(view5) && (view2 = (View) bVar6.getOrDefault(bVar5.h(i15), null)) != null && oVar.y(view2)) {
                            w wVar2 = (w) bVar.getOrDefault(view5, null);
                            w wVar3 = (w) bVar4.getOrDefault(view2, null);
                            if (wVar2 != null && wVar3 != null) {
                                oVar.f643D.add(wVar2);
                                oVar.f644E.add(wVar3);
                                bVar.remove(view5);
                                bVar4.remove(view2);
                            }
                        }
                    }
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        s.e eVar = (s.e) nVar.f2916v;
                        int l10 = eVar.l();
                        int i16 = i;
                        while (i16 < l10) {
                            View view6 = (View) eVar.m(i16);
                            if (view6 == null || !oVar.y(view6)) {
                                z9 = z10;
                                r15 = bVar2;
                            } else {
                                if (eVar.f40384n) {
                                    eVar.i();
                                }
                                z9 = z10;
                                s.b bVar7 = bVar2;
                                View view7 = (View) ((s.e) nVar2.f2916v).j(eVar.f40385u[i16], l9);
                                if (view7 == null || !oVar.y(view7)) {
                                    r15 = bVar7;
                                } else {
                                    w wVar4 = (w) bVar.getOrDefault(view6, l9);
                                    r15 = bVar7;
                                    w wVar5 = (w) r15.getOrDefault(view7, l9);
                                    if (wVar4 != null && wVar5 != null) {
                                        oVar.f643D.add(wVar4);
                                        oVar.f644E.add(wVar5);
                                        bVar.remove(view6);
                                        r15.remove(view7);
                                    }
                                }
                            }
                            i16++;
                            bVar2 = r15;
                            z10 = z9;
                            l9 = null;
                        }
                    }
                    z8 = z10;
                    bVar4 = bVar2;
                } else {
                    z8 = z10;
                    bVar4 = bVar2;
                    SparseArray sparseArray = (SparseArray) nVar.f2915u;
                    SparseArray sparseArray2 = (SparseArray) nVar2.f2915u;
                    int size = sparseArray.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        View view8 = (View) sparseArray.valueAt(i17);
                        if (view8 != null && oVar.y(view8) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i17))) != null && oVar.y(view3)) {
                            w wVar6 = (w) bVar.getOrDefault(view8, null);
                            w wVar7 = (w) bVar4.getOrDefault(view3, null);
                            if (wVar6 != null && wVar7 != null) {
                                oVar.f643D.add(wVar6);
                                oVar.f644E.add(wVar7);
                                bVar.remove(view8);
                                bVar4.remove(view3);
                            }
                        }
                    }
                }
                i4++;
                bVar2 = bVar4;
                z10 = z8;
                i = 0;
                l9 = null;
            }
            boolean z11 = z10;
            bVar3 = bVar2;
            for (i9 = 0; i9 < bVar.f40409v; i9++) {
                w wVar8 = (w) bVar.l(i9);
                if (oVar.y(wVar8.f672b)) {
                    oVar.f643D.add(wVar8);
                    oVar.f644E.add(null);
                }
            }
            for (i10 = 0; i10 < bVar3.f40409v; i10++) {
                w wVar9 = (w) bVar3.l(i10);
                if (oVar.y(wVar9.f672b)) {
                    oVar.f644E.add(wVar9);
                    oVar.f643D.add(null);
                }
            }
            s.b u7 = o.u();
            int i18 = u7.f40409v;
            WindowId windowId = frameLayout2.getWindowId();
            i11 = i18 - 1;
            while (i11 >= 0) {
                Animator animator = (Animator) u7.h(i11);
                if (animator != null && (lVar = (l) u7.getOrDefault(animator, null)) != null && (view = lVar.f625a) != null && windowId.equals(lVar.f628d)) {
                    boolean z12 = z11;
                    w w9 = oVar.w(view, z12);
                    w s3 = oVar.s(view, z12);
                    if (w9 == null && s3 == null) {
                        s3 = (w) ((s.b) oVar.f640A.f2914n).getOrDefault(view, null);
                    }
                    if (w9 != null || s3 != null) {
                        w wVar10 = lVar.f627c;
                        o oVar2 = lVar.f629e;
                        if (oVar2.x(wVar10, s3)) {
                            oVar2.t().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                u7.remove(animator);
                            }
                        }
                    }
                }
                i11--;
                z11 = true;
            }
            oVar.q(frameLayout2, oVar.f660z, oVar.f640A, oVar.f643D, oVar.f644E);
            oVar.E();
            return true;
        }
        arrayList = null;
        oVar = this.f663n;
        arrayList3.add(oVar);
        oVar.a(new q(this, b9));
        i = 0;
        oVar.m(frameLayout2, false);
        if (arrayList != null) {
        }
        oVar.f643D = new ArrayList();
        oVar.f644E = new ArrayList();
        S0.n nVar3 = oVar.f660z;
        S0.n nVar22 = oVar.f640A;
        bVar = new s.b((s.b) nVar3.f2914n);
        bVar2 = new s.b((s.b) nVar22.f2914n);
        i4 = 0;
        while (true) {
            iArr = oVar.f642C;
            if (i4 < iArr.length) {
            }
            i4++;
            bVar2 = bVar4;
            z10 = z8;
            i = 0;
            l9 = null;
        }
        boolean z112 = z10;
        bVar3 = bVar2;
        while (i9 < bVar.f40409v) {
        }
        while (i10 < bVar3.f40409v) {
        }
        s.b u72 = o.u();
        int i182 = u72.f40409v;
        WindowId windowId2 = frameLayout2.getWindowId();
        i11 = i182 - 1;
        while (i11 >= 0) {
        }
        oVar.q(frameLayout2, oVar.f660z, oVar.f640A, oVar.f643D, oVar.f644E);
        oVar.E();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f664u;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = s.f667c;
        FrameLayout frameLayout2 = this.f664u;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) s.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).D(frameLayout2);
            }
        }
        this.f663n.n(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
