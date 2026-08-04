package com.gamericefishpro.space.i6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d4.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Cloneable {
    public static final Animator[] R = new Animator[0];
    public static final int[] S = {2, 1, 3, 4};
    public static final com.gamericefishpro.space.lb.e T = new com.gamericefishpro.space.lb.e(6);
    public static final ThreadLocal U = new ThreadLocal();
    public ArrayList D;
    public ArrayList E;
    public m[] F;
    public long P;
    public long Q;
    public final String d = getClass().getName();
    public long e = -1;
    public long i = -1;
    public TimeInterpolator v = null;
    public final ArrayList w = new ArrayList();
    public final ArrayList y = new ArrayList();
    public com.gamericefishpro.space.u6.i z = new com.gamericefishpro.space.u6.i(2);
    public com.gamericefishpro.space.u6.i A = new com.gamericefishpro.space.u6.i(2);
    public a B = null;
    public final int[] C = S;
    public final ArrayList G = new ArrayList();
    public Animator[] H = R;
    public int I = 0;
    public boolean J = false;
    public boolean K = false;
    public o L = null;
    public ArrayList M = null;
    public ArrayList N = new ArrayList();
    public com.gamericefishpro.space.lb.e O = T;

    public static void b(com.gamericefishpro.space.u6.i iVar, View view, v vVar) {
        com.gamericefishpro.space.t.e eVar = (com.gamericefishpro.space.t.e) iVar.a;
        com.gamericefishpro.space.t.e eVar2 = (com.gamericefishpro.space.t.e) iVar.d;
        SparseArray sparseArray = (SparseArray) iVar.b;
        com.gamericefishpro.space.t.q qVar = (com.gamericefishpro.space.t.q) iVar.c;
        eVar.put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = l0.a;
        String strE = d0.e(view);
        if (strE != null) {
            if (eVar2.containsKey(strE)) {
                eVar2.put(strE, null);
            } else {
                eVar2.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (qVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    qVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) qVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    qVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static com.gamericefishpro.space.t.e p() {
        ThreadLocal threadLocal = U;
        com.gamericefishpro.space.t.e eVar = (com.gamericefishpro.space.t.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        com.gamericefishpro.space.t.e eVar2 = new com.gamericefishpro.space.t.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean v(v vVar, v vVar2, String str) {
        Object obj = vVar.a.get(str);
        Object obj2 = vVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.J) {
            if (!this.K) {
                ArrayList arrayList = this.G;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
                this.H = R;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.H = animatorArr;
                w(this, n.h, false);
            }
            this.J = false;
        }
    }

    public void B() {
        J();
        com.gamericefishpro.space.t.e eVarP = p();
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (eVarP.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new q0(this, eVarP));
                    long j = this.i;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.e;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.v;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new i(0, this));
                    animator.start();
                }
            }
        }
        this.N.clear();
        m();
    }

    public void C(long j, long j2) {
        long j3 = this.P;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.K = false;
            w(this, n.b, z);
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
        this.H = R;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.H = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.K = true;
        }
        w(this, n.c, z);
    }

    public void D(long j) {
        this.i = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.v = timeInterpolator;
    }

    public void G(com.gamericefishpro.space.lb.e eVar) {
        if (eVar == null) {
            this.O = T;
        } else {
            this.O = eVar;
        }
    }

    public void I(long j) {
        this.e = j;
    }

    public final void J() {
        if (this.I == 0) {
            w(this, n.b, false);
            this.K = false;
        }
        this.I++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.i != -1) {
            sb.append("dur(");
            sb.append(this.i);
            sb.append(") ");
        }
        if (this.e != -1) {
            sb.append("dly(");
            sb.append(this.e);
            sb.append(") ");
        }
        if (this.v != null) {
            sb.append("interp(");
            sb.append(this.v);
            sb.append(") ");
        }
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(m mVar) {
        if (this.M == null) {
            this.M = new ArrayList();
        }
        this.M.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
        this.H = R;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.H = animatorArr;
        w(this, n.f, false);
    }

    public abstract void d(v vVar);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z) {
                g(vVar);
            } else {
                d(vVar);
            }
            vVar.c.add(this);
            f(vVar);
            if (z) {
                b(this.z, view, vVar);
            } else {
                b(this.A, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void g(v vVar);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.y;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                v vVar = new v(viewFindViewById);
                if (z) {
                    g(vVar);
                } else {
                    d(vVar);
                }
                vVar.c.add(this);
                f(vVar);
                if (z) {
                    b(this.z, viewFindViewById, vVar);
                } else {
                    b(this.A, viewFindViewById, vVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            v vVar2 = new v(view);
            if (z) {
                g(vVar2);
            } else {
                d(vVar2);
            }
            vVar2.c.add(this);
            f(vVar2);
            if (z) {
                b(this.z, view, vVar2);
            } else {
                b(this.A, view, vVar2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((com.gamericefishpro.space.t.e) this.z.a).clear();
            ((SparseArray) this.z.b).clear();
            ((com.gamericefishpro.space.t.q) this.z.c).a();
        } else {
            ((com.gamericefishpro.space.t.e) this.A.a).clear();
            ((SparseArray) this.A.b).clear();
            ((com.gamericefishpro.space.t.q) this.A.c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.N = new ArrayList();
            oVar.z = new com.gamericefishpro.space.u6.i(2);
            oVar.A = new com.gamericefishpro.space.u6.i(2);
            oVar.D = null;
            oVar.E = null;
            oVar.L = this;
            oVar.M = null;
            return oVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, com.gamericefishpro.space.u6.i iVar, com.gamericefishpro.space.u6.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        v vVar;
        Animator animator;
        v vVar2;
        com.gamericefishpro.space.t.e eVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            v vVar3 = (v) arrayList.get(i3);
            v vVar4 = (v) arrayList2.get(i3);
            if (vVar3 != null && !vVar3.c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.c.contains(this)) {
                vVar4 = null;
            }
            if ((vVar3 != null || vVar4 != null) && (vVar3 == null || vVar4 == null || t(vVar3, vVar4))) {
                Animator animatorK = k(viewGroup, vVar3, vVar4);
                if (animatorK != null) {
                    String str = this.d;
                    if (vVar4 != null) {
                        view = vVar4.b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            vVar2 = new v(view);
                            v vVar5 = (v) ((com.gamericefishpro.space.t.e) iVar2.a).get(view);
                            i = size;
                            if (vVar5 != null) {
                                int i4 = 0;
                                while (i4 < strArrQ.length) {
                                    String str2 = strArrQ[i4];
                                    int i5 = i3;
                                    vVar2.a.put(str2, vVar5.a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    vVar5 = vVar5;
                                }
                            }
                            i2 = i3;
                            int i6 = eVarP.i;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorK;
                                    break;
                                }
                                j jVar = (j) eVarP.get((Animator) eVarP.f(i7));
                                if (jVar.c != null && jVar.a == view && jVar.b.equals(str) && jVar.c.equals(vVar2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorK;
                            vVar2 = null;
                        }
                        animatorK = animator;
                        vVar = vVar2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = vVar3.b;
                        vVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        j jVar2 = new j();
                        jVar2.a = view;
                        jVar2.b = str;
                        jVar2.c = vVar;
                        jVar2.d = windowId;
                        jVar2.e = this;
                        jVar2.f = animatorK;
                        eVarP.put(animatorK, jVar2);
                        this.N.add(animatorK);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                j jVar3 = (j) eVarP.get((Animator) this.N.get(sparseIntArray.keyAt(i8)));
                jVar3.f.setStartDelay(jVar3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.I - 1;
        this.I = i;
        if (i == 0) {
            w(this, n.c, false);
            for (int i2 = 0; i2 < ((com.gamericefishpro.space.t.q) this.z.c).g(); i2++) {
                View view = (View) ((com.gamericefishpro.space.t.q) this.z.c).h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((com.gamericefishpro.space.t.q) this.A.c).g(); i3++) {
                View view2 = (View) ((com.gamericefishpro.space.t.q) this.A.c).h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.K = true;
        }
    }

    public final v n(View view, boolean z) {
        a aVar = this.B;
        if (aVar != null) {
            return aVar.n(view, z);
        }
        ArrayList arrayList = z ? this.D : this.E;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            v vVar = (v) arrayList.get(i);
            if (vVar == null) {
                return null;
            }
            if (vVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (v) (z ? this.E : this.D).get(i);
        }
        return null;
    }

    public final o o() {
        a aVar = this.B;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final v r(View view, boolean z) {
        a aVar = this.B;
        if (aVar != null) {
            return aVar.r(view, z);
        }
        return (v) ((com.gamericefishpro.space.t.e) (z ? this.z : this.A).a).get(view);
    }

    public boolean s() {
        return !this.G.isEmpty();
    }

    public boolean t(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (v(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        ArrayList arrayList2 = this.y;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void w(o oVar, n nVar, boolean z) {
        o oVar2 = this.L;
        if (oVar2 != null) {
            oVar2.w(oVar, nVar, z);
        }
        ArrayList arrayList = this.M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.M.size();
        m[] mVarArr = this.F;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.F = null;
        m[] mVarArr2 = (m[]) this.M.toArray(mVarArr);
        for (int i = 0; i < size; i++) {
            nVar.b(mVarArr2[i], oVar, z);
            mVarArr2[i] = null;
        }
        this.F = mVarArr2;
    }

    public void x(View view) {
        if (this.K) {
            return;
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.H);
        this.H = R;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.H = animatorArr;
        w(this, n.g, false);
        this.J = true;
    }

    public void y() {
        com.gamericefishpro.space.t.e eVarP = p();
        this.P = 0L;
        for (int i = 0; i < this.N.size(); i++) {
            Animator animator = (Animator) this.N.get(i);
            j jVar = (j) eVarP.get(animator);
            if (animator != null && jVar != null) {
                Animator animator2 = jVar.f;
                long j = this.i;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.e;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.v;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.G.add(animator);
                this.P = Math.max(this.P, animator.getTotalDuration());
            }
        }
        this.N.clear();
    }

    public o z(m mVar) {
        o oVar;
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.L) != null) {
                oVar.z(mVar);
            }
            if (this.M.size() == 0) {
                this.M = null;
            }
        }
        return this;
    }

    public void H() {
    }

    public void E(com.gamericefishpro.space.a.a aVar) {
    }

    public void f(v vVar) {
    }
}
