package p0;

import O.K;
import O.Q;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import r.AbstractC0341i;
import r.C0338f;
import r.C0340h;
import s.AbstractC0346a;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f4180w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f4181x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final S0.e f4182y = new S0.e(29);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f4183z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4191k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4192l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f4193m;

    /* renamed from: a, reason: collision with root package name */
    public final String f4184a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f4185b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f4186c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f4187d = null;
    public final ArrayList e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4188f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public B.k f4189g = new B.k(5);

    /* renamed from: h, reason: collision with root package name */
    public B.k f4190h = new B.k(5);
    public C0323a i = null;
    public final int[] j = f4181x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4194n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f4195o = f4180w;

    /* renamed from: p, reason: collision with root package name */
    public int f4196p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4197q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4198r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f4199s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f4200t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4201u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public S0.e f4202v = f4182y;

    public static void b(B.k kVar, View view, u uVar) {
        ((C0338f) kVar.f28a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) kVar.f29b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = K.f747a;
        String f2 = O.B.f(view);
        if (f2 != null) {
            C0338f c0338f = (C0338f) kVar.f31d;
            if (c0338f.containsKey(f2)) {
                c0338f.put(f2, null);
            } else {
                c0338f.put(f2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0340h c0340h = (C0340h) kVar.f30c;
                if (c0340h.f4314a) {
                    int i = c0340h.f4317d;
                    long[] jArr = c0340h.f4315b;
                    Object[] objArr = c0340h.f4316c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC0341i.f4318a) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c0340h.f4314a = false;
                    c0340h.f4317d = i2;
                }
                if (AbstractC0346a.b(c0340h.f4315b, c0340h.f4317d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0340h.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0340h.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0340h.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C0338f p() {
        ThreadLocal threadLocal = f4183z;
        C0338f c0338f = (C0338f) threadLocal.get();
        if (c0338f != null) {
            return c0338f;
        }
        C0338f c0338f2 = new C0338f(0);
        threadLocal.set(c0338f2);
        return c0338f2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f4213a.get(str);
        Object obj2 = uVar2.f4213a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.f4186c = j;
    }

    public void B(h0.f fVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f4187d = timeInterpolator;
    }

    public void D(S0.e eVar) {
        if (eVar == null) {
            this.f4202v = f4182y;
        } else {
            this.f4202v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j) {
        this.f4185b = j;
    }

    public final void G() {
        if (this.f4196p == 0) {
            v(this, l.f4176a);
            this.f4198r = false;
        }
        this.f4196p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4186c != -1) {
            sb.append("dur(");
            sb.append(this.f4186c);
            sb.append(") ");
        }
        if (this.f4185b != -1) {
            sb.append("dly(");
            sb.append(this.f4185b);
            sb.append(") ");
        }
        if (this.f4187d != null) {
            sb.append("interp(");
            sb.append(this.f4187d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4188f;
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

    public void a(k kVar) {
        if (this.f4200t == null) {
            this.f4200t = new ArrayList();
        }
        this.f4200t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f4194n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4195o);
        this.f4195o = f4180w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f4195o = animatorArr;
        v(this, l.f4178c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            u uVar = new u(view);
            if (z2) {
                g(uVar);
            } else {
                d(uVar);
            }
            uVar.f4215c.add(this);
            f(uVar);
            if (z2) {
                b(this.f4189g, view, uVar);
            } else {
                b(this.f4190h, view, uVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(u uVar) {
    }

    public abstract void g(u uVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4188f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                u uVar = new u(findViewById);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f4215c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f4189g, findViewById, uVar);
                } else {
                    b(this.f4190h, findViewById, uVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            u uVar2 = new u(view);
            if (z2) {
                g(uVar2);
            } else {
                d(uVar2);
            }
            uVar2.f4215c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f4189g, view, uVar2);
            } else {
                b(this.f4190h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((C0338f) this.f4189g.f28a).clear();
            ((SparseArray) this.f4189g.f29b).clear();
            ((C0340h) this.f4189g.f30c).a();
        } else {
            ((C0338f) this.f4190h.f28a).clear();
            ((SparseArray) this.f4190h.f29b).clear();
            ((C0340h) this.f4190h.f30c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f4201u = new ArrayList();
            mVar.f4189g = new B.k(5);
            mVar.f4190h = new B.k(5);
            mVar.f4191k = null;
            mVar.f4192l = null;
            mVar.f4199s = this;
            mVar.f4200t = null;
            return mVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, B.k kVar, B.k kVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        C0338f p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            u uVar3 = (u) arrayList.get(i2);
            u uVar4 = (u) arrayList2.get(i2);
            if (uVar3 != null && !uVar3.f4215c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f4215c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(viewGroup, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f4184a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f4214b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((C0338f) kVar2.f28a).get(view);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f4213a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f4213a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f4322c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.get((Animator) p2.f(i5));
                                if (jVar.f4173c != null && jVar.f4171a == view && jVar.f4172b.equals(str) && jVar.f4173c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            uVar2 = null;
                        }
                        k2 = animator;
                        uVar = uVar2;
                    } else {
                        i = size;
                        view = uVar3.f4214b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        j jVar2 = new j();
                        jVar2.f4171a = view;
                        jVar2.f4172b = str;
                        jVar2.f4173c = uVar;
                        jVar2.f4174d = windowId;
                        jVar2.e = this;
                        jVar2.f4175f = k2;
                        p2.put(k2, jVar2);
                        this.f4201u.add(k2);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                j jVar3 = (j) p2.get((Animator) this.f4201u.get(sparseIntArray.keyAt(i6)));
                jVar3.f4175f.setStartDelay(jVar3.f4175f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f4196p - 1;
        this.f4196p = i;
        if (i == 0) {
            v(this, l.f4177b);
            for (int i2 = 0; i2 < ((C0340h) this.f4189g.f30c).e(); i2++) {
                View view = (View) ((C0340h) this.f4189g.f30c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0340h) this.f4190h.f30c).e(); i3++) {
                View view2 = (View) ((C0340h) this.f4190h.f30c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4198r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0323a c0323a = this.i;
        if (c0323a != null) {
            return c0323a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f4191k : this.f4192l;
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
            u uVar = (u) arrayList.get(i);
            if (uVar == null) {
                return null;
            }
            if (uVar.f4214b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f4192l : this.f4191k).get(i);
        }
        return null;
    }

    public final m o() {
        C0323a c0323a = this.i;
        return c0323a != null ? c0323a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0323a c0323a = this.i;
        if (c0323a != null) {
            return c0323a.r(view, z2);
        }
        return (u) ((C0338f) (z2 ? this.f4189g : this.f4190h).f28a).get(view);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f4213a.keySet().iterator();
            while (it.hasNext()) {
                if (u(uVar, uVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(uVar, uVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4188f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f4199s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f4200t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f4200t.size();
        k[] kVarArr = this.f4193m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f4193m = null;
        k[] kVarArr2 = (k[]) this.f4200t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f4193m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f4198r) {
            return;
        }
        ArrayList arrayList = this.f4194n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4195o);
        this.f4195o = f4180w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f4195o = animatorArr;
        v(this, l.f4179d);
        this.f4197q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f4200t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f4199s) != null) {
            mVar.x(kVar);
        }
        if (this.f4200t.size() == 0) {
            this.f4200t = null;
        }
        return this;
    }

    public void y(View view) {
        if (this.f4197q) {
            if (!this.f4198r) {
                ArrayList arrayList = this.f4194n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4195o);
                this.f4195o = f4180w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f4195o = animatorArr;
                v(this, l.e);
            }
            this.f4197q = false;
        }
    }

    public void z() {
        G();
        C0338f p2 = p();
        Iterator it = this.f4201u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new Q(this, p2));
                    long j = this.f4186c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f4185b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f4187d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new B0.c(6, this));
                    animator.start();
                }
            }
        }
        this.f4201u.clear();
        m();
    }
}
