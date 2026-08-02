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
    public static final Animator[] f477P = new Animator[0];

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f478Q = {2, 1, 3, 4};

    /* renamed from: R, reason: collision with root package name */
    public static final O2.i f479R = new O2.i(2);

    /* renamed from: S, reason: collision with root package name */
    public static final ThreadLocal f480S = new ThreadLocal();

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f484D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f485E;

    /* renamed from: F, reason: collision with root package name */
    public m[] f486F;

    /* renamed from: n, reason: collision with root package name */
    public final String f495n = getClass().getName();

    /* renamed from: u, reason: collision with root package name */
    public long f496u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f497v = -1;

    /* renamed from: w, reason: collision with root package name */
    public TimeInterpolator f498w = null;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f499x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f500y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public S0.n f501z = new S0.n(1);

    /* renamed from: A, reason: collision with root package name */
    public S0.n f481A = new S0.n(1);

    /* renamed from: B, reason: collision with root package name */
    public C0288a f482B = null;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f483C = f478Q;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f487G = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    public Animator[] f488H = f477P;

    /* renamed from: I, reason: collision with root package name */
    public int f489I = 0;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f490K = false;

    /* renamed from: L, reason: collision with root package name */
    public o f491L = null;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f492M = null;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f493N = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    public O2.i f494O = f479R;

    public static void b(S0.n nVar, View view, w wVar) {
        ((s.b) nVar.f2931u).put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) nVar.f2932v;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = X.f2142a;
        String k9 = L.k(view);
        if (k9 != null) {
            s.b bVar = (s.b) nVar.f2934x;
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
                s.e eVar = (s.e) nVar.f2933w;
                if (eVar.f40251n) {
                    eVar.i();
                }
                if (s.d.b(eVar.f40252u, eVar.f40254w, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f480S;
        s.b bVar = (s.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean z(w wVar, w wVar2, String str) {
        Object obj = wVar.f512a.get(str);
        Object obj2 = wVar2.f512a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(o oVar, n nVar) {
        o oVar2 = this.f491L;
        if (oVar2 != null) {
            oVar2.A(oVar, nVar);
        }
        ArrayList arrayList = this.f492M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f492M.size();
        m[] mVarArr = this.f486F;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f486F = null;
        m[] mVarArr2 = (m[]) this.f492M.toArray(mVarArr);
        for (int i = 0; i < size; i++) {
            m mVar = mVarArr2[i];
            switch (nVar.f476n) {
                case 0:
                    mVar.f(oVar);
                    break;
                case 1:
                    mVar.d(oVar);
                    break;
                case 2:
                    mVar.c(oVar);
                    break;
                case 3:
                    mVar.b();
                    break;
                default:
                    mVar.e();
                    break;
            }
            mVarArr2[i] = null;
        }
        this.f486F = mVarArr2;
    }

    public void B(ViewGroup viewGroup) {
        if (this.f490K) {
            return;
        }
        ArrayList arrayList = this.f487G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f488H);
        this.f488H = f477P;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f488H = animatorArr;
        A(this, n.f474x);
        this.J = true;
    }

    public o C(m mVar) {
        o oVar;
        ArrayList arrayList = this.f492M;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f491L) != null) {
                oVar.C(mVar);
            }
            if (this.f492M.size() == 0) {
                this.f492M = null;
            }
        }
        return this;
    }

    public void D(FrameLayout frameLayout) {
        if (this.J) {
            if (!this.f490K) {
                ArrayList arrayList = this.f487G;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f488H);
                this.f488H = f477P;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f488H = animatorArr;
                A(this, n.f475y);
            }
            this.J = false;
        }
    }

    public void E() {
        L();
        s.b u6 = u();
        Iterator it = this.f493N.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (u6.containsKey(animator)) {
                L();
                if (animator != null) {
                    animator.addListener(new j(this, u6));
                    long j6 = this.f497v;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j9 = this.f496u;
                    if (j9 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j9);
                    }
                    TimeInterpolator timeInterpolator = this.f498w;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new k(0, this));
                    animator.start();
                }
            }
        }
        this.f493N.clear();
        r();
    }

    public void F(long j6) {
        this.f497v = j6;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.f498w = timeInterpolator;
    }

    public void I(O2.i iVar) {
        if (iVar == null) {
            this.f494O = f479R;
        } else {
            this.f494O = iVar;
        }
    }

    public void K(long j6) {
        this.f496u = j6;
    }

    public final void L() {
        if (this.f489I == 0) {
            A(this, n.f471u);
            this.f490K = false;
        }
        this.f489I++;
    }

    public String M(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f497v != -1) {
            sb.append("dur(");
            sb.append(this.f497v);
            sb.append(") ");
        }
        if (this.f496u != -1) {
            sb.append("dly(");
            sb.append(this.f496u);
            sb.append(") ");
        }
        if (this.f498w != null) {
            sb.append("interp(");
            sb.append(this.f498w);
            sb.append(") ");
        }
        ArrayList arrayList = this.f499x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f500y;
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
        if (this.f492M == null) {
            this.f492M = new ArrayList();
        }
        this.f492M.add(mVar);
    }

    public void h() {
        ArrayList arrayList = this.f487G;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f488H);
        this.f488H = f477P;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f488H = animatorArr;
        A(this, n.f473w);
    }

    public abstract void i(w wVar);

    public final void j(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z6) {
                l(wVar);
            } else {
                i(wVar);
            }
            wVar.f514c.add(this);
            k(wVar);
            if (z6) {
                b(this.f501z, view, wVar);
            } else {
                b(this.f481A, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                j(viewGroup.getChildAt(i), z6);
            }
        }
    }

    public abstract void l(w wVar);

    public final void m(FrameLayout frameLayout, boolean z6) {
        n(z6);
        ArrayList arrayList = this.f499x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f500y;
        if (size <= 0 && arrayList2.size() <= 0) {
            j(frameLayout, z6);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z6) {
                    l(wVar);
                } else {
                    i(wVar);
                }
                wVar.f514c.add(this);
                k(wVar);
                if (z6) {
                    b(this.f501z, findViewById, wVar);
                } else {
                    b(this.f481A, findViewById, wVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            w wVar2 = new w(view);
            if (z6) {
                l(wVar2);
            } else {
                i(wVar2);
            }
            wVar2.f514c.add(this);
            k(wVar2);
            if (z6) {
                b(this.f501z, view, wVar2);
            } else {
                b(this.f481A, view, wVar2);
            }
        }
    }

    public final void n(boolean z6) {
        if (z6) {
            ((s.b) this.f501z.f2931u).clear();
            ((SparseArray) this.f501z.f2932v).clear();
            ((s.e) this.f501z.f2933w).h();
        } else {
            ((s.b) this.f481A.f2931u).clear();
            ((SparseArray) this.f481A.f2932v).clear();
            ((s.e) this.f481A.f2933w).h();
        }
    }

    @Override // 
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f493N = new ArrayList();
            oVar.f501z = new S0.n(1);
            oVar.f481A = new S0.n(1);
            oVar.f484D = null;
            oVar.f485E = null;
            oVar.f491L = this;
            oVar.f492M = null;
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
        int i4;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        s.b u6 = u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        t().getClass();
        int i6 = 0;
        while (i6 < size) {
            w wVar3 = (w) arrayList.get(i6);
            w wVar4 = (w) arrayList2.get(i6);
            if (wVar3 != null && !wVar3.f514c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f514c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 != null || wVar4 != null) && (wVar3 == null || wVar4 == null || x(wVar3, wVar4))) {
                Animator p9 = p(frameLayout, wVar3, wVar4);
                if (p9 != null) {
                    String str = this.f495n;
                    if (wVar4 != null) {
                        String[] v9 = v();
                        view = wVar4.f513b;
                        if (v9 != null && v9.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((s.b) nVar2.f2931u).getOrDefault(view, null);
                            i = size;
                            if (wVar5 != null) {
                                int i9 = 0;
                                while (i9 < v9.length) {
                                    HashMap hashMap = wVar2.f512a;
                                    int i10 = i6;
                                    String str2 = v9[i9];
                                    hashMap.put(str2, wVar5.f512a.get(str2));
                                    i9++;
                                    i6 = i10;
                                }
                            }
                            i4 = i6;
                            int i11 = u6.f40276v;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    animator = p9;
                                    break;
                                }
                                l lVar = (l) u6.getOrDefault((Animator) u6.h(i12), null);
                                if (lVar.f467c != null && lVar.f465a == view && lVar.f466b.equals(str) && lVar.f467c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            i = size;
                            i4 = i6;
                            animator = p9;
                            wVar2 = null;
                        }
                        p9 = animator;
                        wVar = wVar2;
                    } else {
                        i = size;
                        i4 = i6;
                        view = wVar3.f513b;
                        wVar = null;
                    }
                    if (p9 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        l lVar2 = new l();
                        lVar2.f465a = view;
                        lVar2.f466b = str;
                        lVar2.f467c = wVar;
                        lVar2.f468d = windowId;
                        lVar2.f469e = this;
                        lVar2.f470f = p9;
                        u6.put(p9, lVar2);
                        this.f493N.add(p9);
                    }
                    i6 = i4 + 1;
                    size = i;
                }
            }
            i = size;
            i4 = i6;
            i6 = i4 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                l lVar3 = (l) u6.getOrDefault((Animator) this.f493N.get(sparseIntArray.keyAt(i13)), null);
                lVar3.f470f.setStartDelay(lVar3.f470f.getStartDelay() + (sparseIntArray.valueAt(i13) - Long.MAX_VALUE));
            }
        }
    }

    public final void r() {
        int i = this.f489I - 1;
        this.f489I = i;
        if (i == 0) {
            A(this, n.f472v);
            for (int i4 = 0; i4 < ((s.e) this.f501z.f2933w).l(); i4++) {
                View view = (View) ((s.e) this.f501z.f2933w).m(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < ((s.e) this.f481A.f2933w).l(); i6++) {
                View view2 = (View) ((s.e) this.f481A.f2933w).m(i6);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f490K = true;
        }
    }

    public final w s(View view, boolean z6) {
        C0288a c0288a = this.f482B;
        if (c0288a != null) {
            return c0288a.s(view, z6);
        }
        ArrayList arrayList = z6 ? this.f484D : this.f485E;
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
            if (wVar.f513b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (w) (z6 ? this.f485E : this.f484D).get(i);
        }
        return null;
    }

    public final o t() {
        C0288a c0288a = this.f482B;
        return c0288a != null ? c0288a.t() : this;
    }

    public final String toString() {
        return M("");
    }

    public String[] v() {
        return null;
    }

    public final w w(View view, boolean z6) {
        C0288a c0288a = this.f482B;
        if (c0288a != null) {
            return c0288a.w(view, z6);
        }
        return (w) ((s.b) (z6 ? this.f501z : this.f481A).f2931u).getOrDefault(view, null);
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
                Iterator it = wVar.f512a.keySet().iterator();
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
        ArrayList arrayList = this.f499x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f500y;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void J() {
    }

    public void G(Z2.d dVar) {
    }

    public void k(w wVar) {
    }
}
