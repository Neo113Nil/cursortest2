package D0;

import O.L;
import O.X;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* renamed from: P, reason: collision with root package name */
    public static final Animator[] f636P = new Animator[0];

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f637Q = {2, 1, 3, 4};

    /* renamed from: R, reason: collision with root package name */
    public static final W3.e f638R = new W3.e(2);

    /* renamed from: S, reason: collision with root package name */
    public static final ThreadLocal f639S = new ThreadLocal();

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f643D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f644E;

    /* renamed from: F, reason: collision with root package name */
    public m[] f645F;

    /* renamed from: n, reason: collision with root package name */
    public final String f654n = getClass().getName();

    /* renamed from: u, reason: collision with root package name */
    public long f655u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f656v = -1;

    /* renamed from: w, reason: collision with root package name */
    public TimeInterpolator f657w = null;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f658x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f659y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public S0.n f660z = new S0.n(1);

    /* renamed from: A, reason: collision with root package name */
    public S0.n f640A = new S0.n(1);

    /* renamed from: B, reason: collision with root package name */
    public C0299a f641B = null;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f642C = f637Q;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f646G = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    public Animator[] f647H = f636P;

    /* renamed from: I, reason: collision with root package name */
    public int f648I = 0;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f649K = false;

    /* renamed from: L, reason: collision with root package name */
    public o f650L = null;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f651M = null;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f652N = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    public W3.e f653O = f638R;

    public static void b(S0.n nVar, View view, w wVar) {
        ((s.b) nVar.f2914n).put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) nVar.f2915u;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = X.f2240a;
        String k6 = L.k(view);
        if (k6 != null) {
            s.b bVar = (s.b) nVar.f2917w;
            if (bVar.containsKey(k6)) {
                bVar.put(k6, null);
            } else {
                bVar.put(k6, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                s.e eVar = (s.e) nVar.f2916v;
                if (eVar.f40384n) {
                    eVar.i();
                }
                if (s.d.b(eVar.f40385u, eVar.f40387w, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    eVar.k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) eVar.j(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    eVar.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public static s.b u() {
        ThreadLocal threadLocal = f639S;
        s.b bVar = (s.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean z(w wVar, w wVar2, String str) {
        Object obj = wVar.f671a.get(str);
        Object obj2 = wVar2.f671a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(o oVar, n nVar) {
        o oVar2 = this.f650L;
        if (oVar2 != null) {
            oVar2.A(oVar, nVar);
        }
        ArrayList arrayList = this.f651M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f651M.size();
        m[] mVarArr = this.f645F;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f645F = null;
        m[] mVarArr2 = (m[]) this.f651M.toArray(mVarArr);
        for (int i = 0; i < size; i++) {
            nVar.a(mVarArr2[i], oVar);
            mVarArr2[i] = null;
        }
        this.f645F = mVarArr2;
    }

    public void B(ViewGroup viewGroup) {
        if (this.f649K) {
            return;
        }
        ArrayList arrayList = this.f646G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f647H);
        this.f647H = f636P;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f647H = animatorArr;
        A(this, n.f634d0);
        this.J = true;
    }

    public o C(m mVar) {
        o oVar;
        ArrayList arrayList = this.f651M;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f650L) != null) {
                oVar.C(mVar);
            }
            if (this.f651M.size() == 0) {
                this.f651M = null;
            }
        }
        return this;
    }

    public void D(FrameLayout frameLayout) {
        if (this.J) {
            if (!this.f649K) {
                ArrayList arrayList = this.f646G;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f647H);
                this.f647H = f636P;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f647H = animatorArr;
                A(this, n.f635e0);
            }
            this.J = false;
        }
    }

    public void E() {
        L();
        s.b u7 = u();
        Iterator it = this.f652N.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (u7.containsKey(animator)) {
                L();
                if (animator != null) {
                    animator.addListener(new j(this, u7));
                    long j9 = this.f656v;
                    if (j9 >= 0) {
                        animator.setDuration(j9);
                    }
                    long j10 = this.f655u;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f657w;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new k(0, this));
                    animator.start();
                }
            }
        }
        this.f652N.clear();
        r();
    }

    public void F(long j9) {
        this.f656v = j9;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.f657w = timeInterpolator;
    }

    public void I(W3.e eVar) {
        if (eVar == null) {
            this.f653O = f638R;
        } else {
            this.f653O = eVar;
        }
    }

    public void K(long j9) {
        this.f655u = j9;
    }

    public final void L() {
        if (this.f648I == 0) {
            A(this, n.f631a0);
            this.f649K = false;
        }
        this.f648I++;
    }

    public String M(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f656v != -1) {
            sb.append("dur(");
            sb.append(this.f656v);
            sb.append(") ");
        }
        if (this.f655u != -1) {
            sb.append("dly(");
            sb.append(this.f655u);
            sb.append(") ");
        }
        if (this.f657w != null) {
            sb.append("interp(");
            sb.append(this.f657w);
            sb.append(") ");
        }
        ArrayList arrayList = this.f658x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f659y;
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
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(m mVar) {
        if (this.f651M == null) {
            this.f651M = new ArrayList();
        }
        this.f651M.add(mVar);
    }

    public void h() {
        ArrayList arrayList = this.f646G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f647H);
        this.f647H = f636P;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f647H = animatorArr;
        A(this, n.f633c0);
    }

    public abstract void i(w wVar);

    public final void j(View view, boolean z8) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z8) {
                l(wVar);
            } else {
                i(wVar);
            }
            wVar.f673c.add(this);
            k(wVar);
            if (z8) {
                b(this.f660z, view, wVar);
            } else {
                b(this.f640A, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                j(viewGroup.getChildAt(i), z8);
            }
        }
    }

    public abstract void l(w wVar);

    public final void m(FrameLayout frameLayout, boolean z8) {
        n(z8);
        ArrayList arrayList = this.f658x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f659y;
        if (size <= 0 && arrayList2.size() <= 0) {
            j(frameLayout, z8);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z8) {
                    l(wVar);
                } else {
                    i(wVar);
                }
                wVar.f673c.add(this);
                k(wVar);
                if (z8) {
                    b(this.f660z, findViewById, wVar);
                } else {
                    b(this.f640A, findViewById, wVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            w wVar2 = new w(view);
            if (z8) {
                l(wVar2);
            } else {
                i(wVar2);
            }
            wVar2.f673c.add(this);
            k(wVar2);
            if (z8) {
                b(this.f660z, view, wVar2);
            } else {
                b(this.f640A, view, wVar2);
            }
        }
    }

    public final void n(boolean z8) {
        if (z8) {
            ((s.b) this.f660z.f2914n).clear();
            ((SparseArray) this.f660z.f2915u).clear();
            ((s.e) this.f660z.f2916v).h();
        } else {
            ((s.b) this.f640A.f2914n).clear();
            ((SparseArray) this.f640A.f2915u).clear();
            ((s.e) this.f640A.f2916v).h();
        }
    }

    @Override // 
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f652N = new ArrayList();
            oVar.f660z = new S0.n(1);
            oVar.f640A = new S0.n(1);
            oVar.f643D = null;
            oVar.f644E = null;
            oVar.f650L = this;
            oVar.f651M = null;
            return oVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public Animator p(FrameLayout frameLayout, w wVar, w wVar2) {
        return null;
    }

    public void q(FrameLayout frameLayout, S0.n nVar, S0.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i4;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        s.b u7 = u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        t().getClass();
        int i9 = 0;
        while (i9 < size) {
            w wVar3 = (w) arrayList.get(i9);
            w wVar4 = (w) arrayList2.get(i9);
            if (wVar3 != null && !wVar3.f673c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f673c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 != null || wVar4 != null) && (wVar3 == null || wVar4 == null || x(wVar3, wVar4))) {
                Animator p6 = p(frameLayout, wVar3, wVar4);
                if (p6 != null) {
                    String str = this.f654n;
                    if (wVar4 != null) {
                        String[] v6 = v();
                        view = wVar4.f672b;
                        if (v6 != null && v6.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((s.b) nVar2.f2914n).getOrDefault(view, null);
                            i = size;
                            if (wVar5 != null) {
                                int i10 = 0;
                                while (i10 < v6.length) {
                                    HashMap hashMap = wVar2.f671a;
                                    int i11 = i9;
                                    String str2 = v6[i10];
                                    hashMap.put(str2, wVar5.f671a.get(str2));
                                    i10++;
                                    i9 = i11;
                                }
                            }
                            i4 = i9;
                            int i12 = u7.f40409v;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator = p6;
                                    break;
                                }
                                l lVar = (l) u7.getOrDefault((Animator) u7.h(i13), null);
                                if (lVar.f627c != null && lVar.f625a == view && lVar.f626b.equals(str) && lVar.f627c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i = size;
                            i4 = i9;
                            animator = p6;
                            wVar2 = null;
                        }
                        p6 = animator;
                        wVar = wVar2;
                    } else {
                        i = size;
                        i4 = i9;
                        view = wVar3.f672b;
                        wVar = null;
                    }
                    if (p6 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        l lVar2 = new l();
                        lVar2.f625a = view;
                        lVar2.f626b = str;
                        lVar2.f627c = wVar;
                        lVar2.f628d = windowId;
                        lVar2.f629e = this;
                        lVar2.f630f = p6;
                        u7.put(p6, lVar2);
                        this.f652N.add(p6);
                    }
                    i9 = i4 + 1;
                    size = i;
                }
            }
            i = size;
            i4 = i9;
            i9 = i4 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                l lVar3 = (l) u7.getOrDefault((Animator) this.f652N.get(sparseIntArray.keyAt(i14)), null);
                lVar3.f630f.setStartDelay(lVar3.f630f.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void r() {
        int i = this.f648I - 1;
        this.f648I = i;
        if (i == 0) {
            A(this, n.f632b0);
            for (int i4 = 0; i4 < ((s.e) this.f660z.f2916v).l(); i4++) {
                View view = (View) ((s.e) this.f660z.f2916v).m(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < ((s.e) this.f640A.f2916v).l(); i9++) {
                View view2 = (View) ((s.e) this.f640A.f2916v).m(i9);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f649K = true;
        }
    }

    public final w s(View view, boolean z8) {
        C0299a c0299a = this.f641B;
        if (c0299a != null) {
            return c0299a.s(view, z8);
        }
        ArrayList arrayList = z8 ? this.f643D : this.f644E;
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
            w wVar = (w) arrayList.get(i);
            if (wVar == null) {
                return null;
            }
            if (wVar.f672b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (w) (z8 ? this.f644E : this.f643D).get(i);
        }
        return null;
    }

    public final o t() {
        C0299a c0299a = this.f641B;
        return c0299a != null ? c0299a.t() : this;
    }

    public final String toString() {
        return M("");
    }

    public String[] v() {
        return null;
    }

    public final w w(View view, boolean z8) {
        C0299a c0299a = this.f641B;
        if (c0299a != null) {
            return c0299a.w(view, z8);
        }
        return (w) ((s.b) (z8 ? this.f660z : this.f640A).f2914n).getOrDefault(view, null);
    }

    public boolean x(w wVar, w wVar2) {
        if (wVar != null && wVar2 != null) {
            String[] v6 = v();
            if (v6 != null) {
                for (String str : v6) {
                    if (z(wVar, wVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wVar.f671a.keySet().iterator();
                while (it.hasNext()) {
                    if (z(wVar, wVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f658x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f659y;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void J() {
    }

    public void G(com.bumptech.glide.d dVar) {
    }

    public void k(w wVar) {
    }
}
