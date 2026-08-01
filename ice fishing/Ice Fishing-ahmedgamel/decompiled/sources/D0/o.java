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
    public static final Animator[] f581P = new Animator[0];

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f582Q = {2, 1, 3, 4};

    /* renamed from: R, reason: collision with root package name */
    public static final a4.e f583R = new a4.e();

    /* renamed from: S, reason: collision with root package name */
    public static final ThreadLocal f584S = new ThreadLocal();

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f588D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f589E;

    /* renamed from: F, reason: collision with root package name */
    public m[] f590F;

    /* renamed from: n, reason: collision with root package name */
    public final String f599n = getClass().getName();

    /* renamed from: u, reason: collision with root package name */
    public long f600u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f601v = -1;

    /* renamed from: w, reason: collision with root package name */
    public TimeInterpolator f602w = null;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f603x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f604y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public S0.n f605z = new S0.n(1);

    /* renamed from: A, reason: collision with root package name */
    public S0.n f585A = new S0.n(1);

    /* renamed from: B, reason: collision with root package name */
    public C0300a f586B = null;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f587C = f582Q;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f591G = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    public Animator[] f592H = f581P;

    /* renamed from: I, reason: collision with root package name */
    public int f593I = 0;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f594K = false;

    /* renamed from: L, reason: collision with root package name */
    public o f595L = null;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f596M = null;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f597N = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    public a4.e f598O = f583R;

    public static void b(S0.n nVar, View view, w wVar) {
        ((s.b) nVar.f2802u).put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) nVar.f2803v;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = X.f2054a;
        String k9 = L.k(view);
        if (k9 != null) {
            s.b bVar = (s.b) nVar.f2805x;
            if (bVar.containsKey(k9)) {
                bVar.put(k9, null);
            } else {
                bVar.put(k9, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                s.e eVar = (s.e) nVar.f2804w;
                if (eVar.f40415n) {
                    eVar.i();
                }
                if (s.d.b(eVar.f40416u, eVar.f40418w, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f584S;
        s.b bVar = (s.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean z(w wVar, w wVar2, String str) {
        Object obj = wVar.f616a.get(str);
        Object obj2 = wVar2.f616a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(o oVar, n nVar) {
        o oVar2 = this.f595L;
        if (oVar2 != null) {
            oVar2.A(oVar, nVar);
        }
        ArrayList arrayList = this.f596M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f596M.size();
        m[] mVarArr = this.f590F;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f590F = null;
        m[] mVarArr2 = (m[]) this.f596M.toArray(mVarArr);
        for (int i = 0; i < size; i++) {
            nVar.a(mVarArr2[i], oVar);
            mVarArr2[i] = null;
        }
        this.f590F = mVarArr2;
    }

    public void B(ViewGroup viewGroup) {
        if (this.f594K) {
            return;
        }
        ArrayList arrayList = this.f591G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f592H);
        this.f592H = f581P;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f592H = animatorArr;
        A(this, n.f579d0);
        this.J = true;
    }

    public o C(m mVar) {
        o oVar;
        ArrayList arrayList = this.f596M;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f595L) != null) {
                oVar.C(mVar);
            }
            if (this.f596M.size() == 0) {
                this.f596M = null;
            }
        }
        return this;
    }

    public void D(FrameLayout frameLayout) {
        if (this.J) {
            if (!this.f594K) {
                ArrayList arrayList = this.f591G;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f592H);
                this.f592H = f581P;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f592H = animatorArr;
                A(this, n.f580e0);
            }
            this.J = false;
        }
    }

    public void E() {
        L();
        s.b u3 = u();
        Iterator it = this.f597N.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (u3.containsKey(animator)) {
                L();
                if (animator != null) {
                    animator.addListener(new j(this, u3));
                    long j6 = this.f601v;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j9 = this.f600u;
                    if (j9 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j9);
                    }
                    TimeInterpolator timeInterpolator = this.f602w;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new k(0, this));
                    animator.start();
                }
            }
        }
        this.f597N.clear();
        r();
    }

    public void F(long j6) {
        this.f601v = j6;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.f602w = timeInterpolator;
    }

    public void I(a4.e eVar) {
        if (eVar == null) {
            this.f598O = f583R;
        } else {
            this.f598O = eVar;
        }
    }

    public void K(long j6) {
        this.f600u = j6;
    }

    public final void L() {
        if (this.f593I == 0) {
            A(this, n.f576a0);
            this.f594K = false;
        }
        this.f593I++;
    }

    public String M(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f601v != -1) {
            sb.append("dur(");
            sb.append(this.f601v);
            sb.append(") ");
        }
        if (this.f600u != -1) {
            sb.append("dly(");
            sb.append(this.f600u);
            sb.append(") ");
        }
        if (this.f602w != null) {
            sb.append("interp(");
            sb.append(this.f602w);
            sb.append(") ");
        }
        ArrayList arrayList = this.f603x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f604y;
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
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i6));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(m mVar) {
        if (this.f596M == null) {
            this.f596M = new ArrayList();
        }
        this.f596M.add(mVar);
    }

    public void h() {
        ArrayList arrayList = this.f591G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f592H);
        this.f592H = f581P;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f592H = animatorArr;
        A(this, n.f578c0);
    }

    public abstract void i(w wVar);

    public final void j(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z3) {
                l(wVar);
            } else {
                i(wVar);
            }
            wVar.f618c.add(this);
            k(wVar);
            if (z3) {
                b(this.f605z, view, wVar);
            } else {
                b(this.f585A, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                j(viewGroup.getChildAt(i), z3);
            }
        }
    }

    public abstract void l(w wVar);

    public final void m(FrameLayout frameLayout, boolean z3) {
        n(z3);
        ArrayList arrayList = this.f603x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f604y;
        if (size <= 0 && arrayList2.size() <= 0) {
            j(frameLayout, z3);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z3) {
                    l(wVar);
                } else {
                    i(wVar);
                }
                wVar.f618c.add(this);
                k(wVar);
                if (z3) {
                    b(this.f605z, findViewById, wVar);
                } else {
                    b(this.f585A, findViewById, wVar);
                }
            }
        }
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            View view = (View) arrayList2.get(i6);
            w wVar2 = new w(view);
            if (z3) {
                l(wVar2);
            } else {
                i(wVar2);
            }
            wVar2.f618c.add(this);
            k(wVar2);
            if (z3) {
                b(this.f605z, view, wVar2);
            } else {
                b(this.f585A, view, wVar2);
            }
        }
    }

    public final void n(boolean z3) {
        if (z3) {
            ((s.b) this.f605z.f2802u).clear();
            ((SparseArray) this.f605z.f2803v).clear();
            ((s.e) this.f605z.f2804w).h();
        } else {
            ((s.b) this.f585A.f2802u).clear();
            ((SparseArray) this.f585A.f2803v).clear();
            ((s.e) this.f585A.f2804w).h();
        }
    }

    @Override // 
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f597N = new ArrayList();
            oVar.f605z = new S0.n(1);
            oVar.f585A = new S0.n(1);
            oVar.f588D = null;
            oVar.f589E = null;
            oVar.f595L = this;
            oVar.f596M = null;
            return oVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public Animator p(FrameLayout frameLayout, w wVar, w wVar2) {
        return null;
    }

    public void q(FrameLayout frameLayout, S0.n nVar, S0.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i6;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        s.b u3 = u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        t().getClass();
        int i9 = 0;
        while (i9 < size) {
            w wVar3 = (w) arrayList.get(i9);
            w wVar4 = (w) arrayList2.get(i9);
            if (wVar3 != null && !wVar3.f618c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f618c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 != null || wVar4 != null) && (wVar3 == null || wVar4 == null || x(wVar3, wVar4))) {
                Animator p9 = p(frameLayout, wVar3, wVar4);
                if (p9 != null) {
                    String str = this.f599n;
                    if (wVar4 != null) {
                        String[] v9 = v();
                        view = wVar4.f617b;
                        if (v9 != null && v9.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((s.b) nVar2.f2802u).getOrDefault(view, null);
                            i = size;
                            if (wVar5 != null) {
                                int i10 = 0;
                                while (i10 < v9.length) {
                                    HashMap hashMap = wVar2.f616a;
                                    int i11 = i9;
                                    String str2 = v9[i10];
                                    hashMap.put(str2, wVar5.f616a.get(str2));
                                    i10++;
                                    i9 = i11;
                                }
                            }
                            i6 = i9;
                            int i12 = u3.f40440v;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator = p9;
                                    break;
                                }
                                l lVar = (l) u3.getOrDefault((Animator) u3.h(i13), null);
                                if (lVar.f572c != null && lVar.f570a == view && lVar.f571b.equals(str) && lVar.f572c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i = size;
                            i6 = i9;
                            animator = p9;
                            wVar2 = null;
                        }
                        p9 = animator;
                        wVar = wVar2;
                    } else {
                        i = size;
                        i6 = i9;
                        view = wVar3.f617b;
                        wVar = null;
                    }
                    if (p9 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        l lVar2 = new l();
                        lVar2.f570a = view;
                        lVar2.f571b = str;
                        lVar2.f572c = wVar;
                        lVar2.f573d = windowId;
                        lVar2.f574e = this;
                        lVar2.f575f = p9;
                        u3.put(p9, lVar2);
                        this.f597N.add(p9);
                    }
                    i9 = i6 + 1;
                    size = i;
                }
            }
            i = size;
            i6 = i9;
            i9 = i6 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                l lVar3 = (l) u3.getOrDefault((Animator) this.f597N.get(sparseIntArray.keyAt(i14)), null);
                lVar3.f575f.setStartDelay(lVar3.f575f.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void r() {
        int i = this.f593I - 1;
        this.f593I = i;
        if (i == 0) {
            A(this, n.f577b0);
            for (int i6 = 0; i6 < ((s.e) this.f605z.f2804w).l(); i6++) {
                View view = (View) ((s.e) this.f605z.f2804w).m(i6);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < ((s.e) this.f585A.f2804w).l(); i9++) {
                View view2 = (View) ((s.e) this.f585A.f2804w).m(i9);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f594K = true;
        }
    }

    public final w s(View view, boolean z3) {
        C0300a c0300a = this.f586B;
        if (c0300a != null) {
            return c0300a.s(view, z3);
        }
        ArrayList arrayList = z3 ? this.f588D : this.f589E;
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
            if (wVar.f617b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (w) (z3 ? this.f589E : this.f588D).get(i);
        }
        return null;
    }

    public final o t() {
        C0300a c0300a = this.f586B;
        return c0300a != null ? c0300a.t() : this;
    }

    public final String toString() {
        return M("");
    }

    public String[] v() {
        return null;
    }

    public final w w(View view, boolean z3) {
        C0300a c0300a = this.f586B;
        if (c0300a != null) {
            return c0300a.w(view, z3);
        }
        return (w) ((s.b) (z3 ? this.f605z : this.f585A).f2802u).getOrDefault(view, null);
    }

    public boolean x(w wVar, w wVar2) {
        if (wVar != null && wVar2 != null) {
            String[] v9 = v();
            if (v9 != null) {
                for (String str : v9) {
                    if (z(wVar, wVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wVar.f616a.keySet().iterator();
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
        ArrayList arrayList = this.f603x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f604y;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void J() {
    }

    public void G(com.bumptech.glide.f fVar) {
    }

    public void k(w wVar) {
    }
}
