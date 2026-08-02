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
    public o f504n;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f505u;

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
        int i6;
        int i9;
        int i10;
        l lVar;
        View view;
        boolean z6;
        s.b bVar4;
        w wVar;
        View view2;
        View view3;
        boolean z9;
        ?? r15;
        FrameLayout frameLayout = this.f505u;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = s.f508c;
        FrameLayout frameLayout2 = this.f505u;
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
            oVar = this.f504n;
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
            oVar.f484D = new ArrayList();
            oVar.f485E = new ArrayList();
            S0.n nVar = oVar.f501z;
            S0.n nVar2 = oVar.f481A;
            bVar = new s.b((s.b) nVar.f2931u);
            bVar2 = new s.b((s.b) nVar2.f2931u);
            i4 = 0;
            while (true) {
                iArr = oVar.f483C;
                if (i4 < iArr.length) {
                    break;
                }
                int i11 = iArr[i4];
                if (i11 == z10) {
                    z6 = z10;
                    bVar4 = bVar2;
                    for (int i12 = bVar.f40276v - 1; i12 >= 0; i12--) {
                        View view4 = (View) bVar.h(i12);
                        if (view4 != null && oVar.y(view4) && (wVar = (w) bVar4.remove(view4)) != null && oVar.y(wVar.f513b)) {
                            oVar.f484D.add((w) bVar.j(i12));
                            oVar.f485E.add(wVar);
                        }
                    }
                } else if (i11 == 2) {
                    z6 = z10;
                    bVar4 = bVar2;
                    s.b bVar5 = (s.b) nVar.f2934x;
                    s.b bVar6 = (s.b) nVar2.f2934x;
                    int i13 = bVar5.f40276v;
                    for (int i14 = 0; i14 < i13; i14++) {
                        View view5 = (View) bVar5.l(i14);
                        if (view5 != null && oVar.y(view5) && (view2 = (View) bVar6.getOrDefault(bVar5.h(i14), null)) != null && oVar.y(view2)) {
                            w wVar2 = (w) bVar.getOrDefault(view5, null);
                            w wVar3 = (w) bVar4.getOrDefault(view2, null);
                            if (wVar2 != null && wVar3 != null) {
                                oVar.f484D.add(wVar2);
                                oVar.f485E.add(wVar3);
                                bVar.remove(view5);
                                bVar4.remove(view2);
                            }
                        }
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        s.e eVar = (s.e) nVar.f2933w;
                        int l10 = eVar.l();
                        int i15 = i;
                        while (i15 < l10) {
                            View view6 = (View) eVar.m(i15);
                            if (view6 == null || !oVar.y(view6)) {
                                z9 = z10;
                                r15 = bVar2;
                            } else {
                                if (eVar.f40251n) {
                                    eVar.i();
                                }
                                z9 = z10;
                                s.b bVar7 = bVar2;
                                View view7 = (View) ((s.e) nVar2.f2933w).j(eVar.f40252u[i15], l9);
                                if (view7 == null || !oVar.y(view7)) {
                                    r15 = bVar7;
                                } else {
                                    w wVar4 = (w) bVar.getOrDefault(view6, l9);
                                    r15 = bVar7;
                                    w wVar5 = (w) r15.getOrDefault(view7, l9);
                                    if (wVar4 != null && wVar5 != null) {
                                        oVar.f484D.add(wVar4);
                                        oVar.f485E.add(wVar5);
                                        bVar.remove(view6);
                                        r15.remove(view7);
                                    }
                                }
                            }
                            i15++;
                            bVar2 = r15;
                            z10 = z9;
                            l9 = null;
                        }
                    }
                    z6 = z10;
                    bVar4 = bVar2;
                } else {
                    z6 = z10;
                    bVar4 = bVar2;
                    SparseArray sparseArray = (SparseArray) nVar.f2932v;
                    SparseArray sparseArray2 = (SparseArray) nVar2.f2932v;
                    int size = sparseArray.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        View view8 = (View) sparseArray.valueAt(i16);
                        if (view8 != null && oVar.y(view8) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i16))) != null && oVar.y(view3)) {
                            w wVar6 = (w) bVar.getOrDefault(view8, null);
                            w wVar7 = (w) bVar4.getOrDefault(view3, null);
                            if (wVar6 != null && wVar7 != null) {
                                oVar.f484D.add(wVar6);
                                oVar.f485E.add(wVar7);
                                bVar.remove(view8);
                                bVar4.remove(view3);
                            }
                        }
                    }
                }
                i4++;
                bVar2 = bVar4;
                z10 = z6;
                i = 0;
                l9 = null;
            }
            boolean z11 = z10;
            bVar3 = bVar2;
            for (i6 = 0; i6 < bVar.f40276v; i6++) {
                w wVar8 = (w) bVar.l(i6);
                if (oVar.y(wVar8.f513b)) {
                    oVar.f484D.add(wVar8);
                    oVar.f485E.add(null);
                }
            }
            for (i9 = 0; i9 < bVar3.f40276v; i9++) {
                w wVar9 = (w) bVar3.l(i9);
                if (oVar.y(wVar9.f513b)) {
                    oVar.f485E.add(wVar9);
                    oVar.f484D.add(null);
                }
            }
            s.b u6 = o.u();
            int i17 = u6.f40276v;
            WindowId windowId = frameLayout2.getWindowId();
            i10 = i17 - 1;
            while (i10 >= 0) {
                Animator animator = (Animator) u6.h(i10);
                if (animator != null && (lVar = (l) u6.getOrDefault(animator, null)) != null && (view = lVar.f465a) != null && windowId.equals(lVar.f468d)) {
                    boolean z12 = z11;
                    w w3 = oVar.w(view, z12);
                    w s9 = oVar.s(view, z12);
                    if (w3 == null && s9 == null) {
                        s9 = (w) ((s.b) oVar.f481A.f2931u).getOrDefault(view, null);
                    }
                    if (w3 != null || s9 != null) {
                        w wVar10 = lVar.f467c;
                        o oVar2 = lVar.f469e;
                        if (oVar2.x(wVar10, s9)) {
                            oVar2.t().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                u6.remove(animator);
                            }
                        }
                    }
                }
                i10--;
                z11 = true;
            }
            oVar.q(frameLayout2, oVar.f501z, oVar.f481A, oVar.f484D, oVar.f485E);
            oVar.E();
            return true;
        }
        arrayList = null;
        oVar = this.f504n;
        arrayList3.add(oVar);
        oVar.a(new q(this, b9));
        i = 0;
        oVar.m(frameLayout2, false);
        if (arrayList != null) {
        }
        oVar.f484D = new ArrayList();
        oVar.f485E = new ArrayList();
        S0.n nVar3 = oVar.f501z;
        S0.n nVar22 = oVar.f481A;
        bVar = new s.b((s.b) nVar3.f2931u);
        bVar2 = new s.b((s.b) nVar22.f2931u);
        i4 = 0;
        while (true) {
            iArr = oVar.f483C;
            if (i4 < iArr.length) {
            }
            i4++;
            bVar2 = bVar4;
            z10 = z6;
            i = 0;
            l9 = null;
        }
        boolean z112 = z10;
        bVar3 = bVar2;
        while (i6 < bVar.f40276v) {
        }
        while (i9 < bVar3.f40276v) {
        }
        s.b u62 = o.u();
        int i172 = u62.f40276v;
        WindowId windowId2 = frameLayout2.getWindowId();
        i10 = i172 - 1;
        while (i10 >= 0) {
        }
        oVar.q(frameLayout2, oVar.f501z, oVar.f481A, oVar.f484D, oVar.f485E);
        oVar.E();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f505u;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = s.f508c;
        FrameLayout frameLayout2 = this.f505u;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) s.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).D(frameLayout2);
            }
        }
        this.f504n.n(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
