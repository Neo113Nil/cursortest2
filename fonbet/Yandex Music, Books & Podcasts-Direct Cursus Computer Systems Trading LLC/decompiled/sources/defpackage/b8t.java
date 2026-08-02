package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
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

/* loaded from: classes.dex */
public abstract class b8t implements Cloneable {
    public static final Animator[] D = new Animator[0];
    public static final int[] E = {2, 1, 3, 4};
    public static final z7l F = new z7l(6);
    public static final ThreadLocal G = new ThreadLocal();
    public long A;
    public w7t B;
    public long C;
    public ArrayList m;
    public ArrayList n;
    public a8t[] o;
    public e88 x;
    public p6g y;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public ArrayList g = null;
    public final ArrayList h = null;
    public x3n i = new x3n(28);
    public x3n j = new x3n(28);
    public n8t k = null;
    public final int[] l = E;
    public final ArrayList p = new ArrayList();
    public Animator[] q = D;
    public int r = 0;
    public boolean s = false;
    public boolean t = false;
    public b8t u = null;
    public ArrayList v = null;
    public ArrayList w = new ArrayList();
    public z7l z = F;

    public static boolean C(b9t b9tVar, b9t b9tVar2, String str) {
        Object obj = b9tVar.a.get(str);
        Object obj2 = b9tVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void f(x3n x3nVar, View view, b9t b9tVar) {
        xy0 xy0Var = (xy0) x3nVar.a;
        xy0 xy0Var2 = (xy0) x3nVar.d;
        SparseArray sparseArray = (SparseArray) x3nVar.b;
        ovg ovgVar = (ovg) x3nVar.c;
        xy0Var.put(view, b9tVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = wdu.a;
        String g = ndu.g(view);
        if (g != null) {
            if (xy0Var2.containsKey(g)) {
                xy0Var2.put(g, null);
            } else {
                xy0Var2.put(g, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (ovgVar.d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ovgVar.f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ovgVar.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ovgVar.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static xy0 u() {
        ThreadLocal threadLocal = G;
        xy0 xy0Var = (xy0) threadLocal.get();
        if (xy0Var != null) {
            return xy0Var;
        }
        xy0 xy0Var2 = new xy0(0);
        threadLocal.set(xy0Var2);
        return xy0Var2;
    }

    public boolean A(b9t b9tVar, b9t b9tVar2) {
        if (b9tVar != null && b9tVar2 != null) {
            String[] v = v();
            if (v != null) {
                for (String str : v) {
                    if (C(b9tVar, b9tVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = b9tVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (C(b9tVar, b9tVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean B(View view) {
        ArrayList arrayList;
        int id = view.getId();
        ArrayList arrayList2 = this.h;
        if (arrayList2 != null) {
            WeakHashMap weakHashMap = wdu.a;
            if (ndu.g(view) != null && arrayList2.contains(ndu.g(view))) {
                return false;
            }
        }
        ArrayList arrayList3 = this.e;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.f;
        if ((size == 0 && arrayList4.size() == 0 && ((arrayList = this.g) == null || arrayList.isEmpty())) || arrayList3.contains(Integer.valueOf(id)) || arrayList4.contains(view)) {
            return true;
        }
        ArrayList arrayList5 = this.g;
        if (arrayList5 != null) {
            WeakHashMap weakHashMap2 = wdu.a;
            if (arrayList5.contains(ndu.g(view))) {
                return true;
            }
        }
        return false;
    }

    public final void E(b8t b8tVar, wvs wvsVar, boolean z) {
        b8t b8tVar2 = this.u;
        if (b8tVar2 != null) {
            b8tVar2.E(b8tVar, wvsVar, z);
        }
        ArrayList arrayList = this.v;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.v.size();
        a8t[] a8tVarArr = this.o;
        if (a8tVarArr == null) {
            a8tVarArr = new a8t[size];
        }
        this.o = null;
        a8t[] a8tVarArr2 = (a8t[]) this.v.toArray(a8tVarArr);
        for (int i = 0; i < size; i++) {
            a8t a8tVar = a8tVarArr2[i];
            switch (wvsVar.a) {
                case 4:
                    a8tVar.b(b8tVar);
                    break;
                case 5:
                    a8tVar.g(b8tVar);
                    break;
                case 6:
                    a8tVar.d(b8tVar);
                    break;
                case 7:
                    a8tVar.a();
                    break;
                default:
                    a8tVar.c();
                    break;
            }
            a8tVarArr2[i] = null;
        }
        this.o = a8tVarArr2;
    }

    public void F(View view) {
        if (this.t) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.q = animatorArr;
        E(this, wvs.e, false);
        this.s = true;
    }

    public void G() {
        xy0 u = u();
        this.A = 0L;
        int i = 0;
        while (true) {
            int size = this.w.size();
            ArrayList arrayList = this.w;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            r7t r7tVar = (r7t) u.get(animator);
            if (animator != null && r7tVar != null) {
                Animator animator2 = r7tVar.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.p.add(animator);
                this.A = Math.max(this.A, animator.getTotalDuration());
            }
            i++;
        }
    }

    public b8t H(a8t a8tVar) {
        b8t b8tVar;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            if (!arrayList.remove(a8tVar) && (b8tVar = this.u) != null) {
                b8tVar.H(a8tVar);
            }
            if (this.v.size() == 0) {
                this.v = null;
            }
        }
        return this;
    }

    public void I(View view) {
        this.f.remove(view);
    }

    public void J(View view) {
        if (this.s) {
            if (!this.t) {
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
                this.q = D;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.q = animatorArr;
                E(this, wvs.f, false);
            }
            this.s = false;
        }
    }

    public void K() {
        S();
        xy0 u = u();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (u.containsKey(animator)) {
                S();
                if (animator != null) {
                    animator.addListener(new w2c(this, u));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new le(12, this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        q();
    }

    public void L(long j, long j2) {
        long j3 = this.A;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.t = false;
            E(this, wvs.b, z);
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = D;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            gvt.S(animator, Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.q = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.t = true;
        }
        E(this, wvs.c, z);
    }

    public void M(long j) {
        this.c = j;
    }

    public void N(p6g p6gVar) {
        this.y = p6gVar;
    }

    public void O(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void P(z7l z7lVar) {
        if (z7lVar == null) {
            this.z = F;
        } else {
            this.z = z7lVar;
        }
    }

    public void Q(e88 e88Var) {
        this.x = e88Var;
    }

    public void R(long j) {
        this.b = j;
    }

    public final void S() {
        if (this.r == 0) {
            E(this, wvs.b, false);
            this.t = false;
        }
        this.r++;
    }

    public String T(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
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

    public void b(a8t a8tVar) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(a8tVar);
    }

    public b8t c(String str) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(str);
        return this;
    }

    public void cancel() {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.q);
        this.q = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.q = animatorArr;
        E(this, wvs.d, false);
    }

    public void d(int i) {
        if (i != 0) {
            this.e.add(Integer.valueOf(i));
        }
    }

    public void e(View view) {
        this.f.add(view);
    }

    public abstract void g(b9t b9tVar);

    public final void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            b9t b9tVar = new b9t(view);
            if (z) {
                j(b9tVar);
            } else {
                g(b9tVar);
            }
            b9tVar.c.add(this);
            i(b9tVar);
            if (z) {
                f(this.i, view, b9tVar);
            } else {
                f(this.j, view, b9tVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void i(b9t b9tVar) {
        if (this.x != null) {
            HashMap hashMap = b9tVar.a;
            if (hashMap.isEmpty()) {
                return;
            }
            this.x.getClass();
            String[] strArr = e88.i;
            for (int i = 0; i < 2; i++) {
                if (!hashMap.containsKey(strArr[i])) {
                    this.x.getClass();
                    View view = b9tVar.b;
                    Integer num = (Integer) hashMap.get("android:visibility:visibility");
                    if (num == null) {
                        num = Integer.valueOf(view.getVisibility());
                    }
                    hashMap.put("android:visibilityPropagation:visibility", num);
                    int[] iArr = {r5, 0};
                    view.getLocationOnScreen(iArr);
                    int round = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + round;
                    int round2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = round2;
                    iArr[1] = (view.getHeight() / 2) + round2;
                    hashMap.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void j(b9t b9tVar);

    public final void k(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        l(z);
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.f;
        if ((size <= 0 && arrayList3.size() <= 0) || ((arrayList = this.g) != null && !arrayList.isEmpty())) {
            h(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList2.get(i)).intValue());
            if (findViewById != null) {
                b9t b9tVar = new b9t(findViewById);
                if (z) {
                    j(b9tVar);
                } else {
                    g(b9tVar);
                }
                b9tVar.c.add(this);
                i(b9tVar);
                if (z) {
                    f(this.i, findViewById, b9tVar);
                } else {
                    f(this.j, findViewById, b9tVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            View view = (View) arrayList3.get(i2);
            b9t b9tVar2 = new b9t(view);
            if (z) {
                j(b9tVar2);
            } else {
                g(b9tVar2);
            }
            b9tVar2.c.add(this);
            i(b9tVar2);
            if (z) {
                f(this.i, view, b9tVar2);
            } else {
                f(this.j, view, b9tVar2);
            }
        }
    }

    public final void l(boolean z) {
        if (z) {
            ((xy0) this.i.a).clear();
            ((SparseArray) this.i.b).clear();
            ((ovg) this.i.c).b();
        } else {
            ((xy0) this.j.a).clear();
            ((SparseArray) this.j.b).clear();
            ((ovg) this.j.c).b();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b8t clone() {
        try {
            b8t b8tVar = (b8t) super.clone();
            b8tVar.w = new ArrayList();
            b8tVar.i = new x3n(28);
            b8tVar.j = new x3n(28);
            b8tVar.m = null;
            b8tVar.n = null;
            b8tVar.B = null;
            b8tVar.u = this;
            b8tVar.v = null;
            return b8tVar;
        } catch (CloneNotSupportedException e) {
            b6e.q(e);
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, b9t b9tVar, b9t b9tVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(ViewGroup viewGroup, x3n x3nVar, x3n x3nVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator n;
        int i;
        boolean z;
        int i2;
        View view;
        b9t b9tVar;
        long j;
        int i3;
        int i4;
        long j2;
        long round;
        int[] iArr;
        int[] iArr2;
        xy0 u = u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = t().B != null;
        long j3 = Long.MAX_VALUE;
        int i5 = 0;
        while (i5 < size) {
            b9t b9tVar2 = (b9t) arrayList.get(i5);
            b9t b9tVar3 = (b9t) arrayList2.get(i5);
            if (b9tVar2 != null && !b9tVar2.c.contains(this)) {
                b9tVar2 = null;
            }
            if (b9tVar3 != null && !b9tVar3.c.contains(this)) {
                b9tVar3 = null;
            }
            if (!(b9tVar2 == null && b9tVar3 == null) && ((b9tVar2 == null || b9tVar3 == null || A(b9tVar2, b9tVar3)) && (n = n(viewGroup, b9tVar2, b9tVar3)) != null)) {
                String str = this.a;
                if (b9tVar3 != null) {
                    view = b9tVar3.b;
                    i = size;
                    String[] v = v();
                    z = z2;
                    if (v == null || v.length <= 0) {
                        i2 = i5;
                        n = n;
                    } else {
                        b9tVar = new b9t(view);
                        i2 = i5;
                        b9t b9tVar4 = (b9t) ((xy0) x3nVar2.a).get(view);
                        if (b9tVar4 != null) {
                            int i6 = 0;
                            while (i6 < v.length) {
                                String str2 = v[i6];
                                b9tVar.a.put(str2, b9tVar4.a.get(str2));
                                i6++;
                                v = v;
                            }
                        }
                        int i7 = u.c;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i7) {
                                n = n;
                                break;
                            }
                            r7t r7tVar = (r7t) u.get((Animator) u.f(i8));
                            if (r7tVar.c != null && r7tVar.a == view && r7tVar.b.equals(str) && r7tVar.c.equals(b9tVar)) {
                                n = null;
                                break;
                            }
                            i8++;
                        }
                        if (n != null) {
                            if (this.x != null) {
                                if (b9tVar2 == null && b9tVar3 == null) {
                                    round = 0;
                                } else {
                                    p6g p6gVar = this.y;
                                    Rect E2 = p6gVar == null ? null : p6gVar.E();
                                    if (b9tVar3 != null) {
                                        int i9 = 8;
                                        if (b9tVar2 == null) {
                                            j = 0;
                                        } else {
                                            j = 0;
                                            Integer num = (Integer) b9tVar2.a.get("android:visibilityPropagation:visibility");
                                            if (num != null) {
                                                i9 = num.intValue();
                                            }
                                        }
                                        if (i9 != 0) {
                                            b9tVar2 = b9tVar3;
                                            i3 = 1;
                                            int i10 = (b9tVar2 == null || (iArr2 = (int[]) b9tVar2.a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr2[0];
                                            int i11 = (b9tVar2 == null || (iArr = (int[]) b9tVar2.a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr[1];
                                            int[] iArr3 = new int[2];
                                            viewGroup.getLocationOnScreen(iArr3);
                                            int round2 = Math.round(viewGroup.getTranslationX()) + iArr3[0];
                                            int round3 = Math.round(viewGroup.getTranslationY()) + iArr3[1];
                                            int width = viewGroup.getWidth() + round2;
                                            viewGroup.getHeight();
                                            if (E2 == null) {
                                                i4 = E2.centerX();
                                                E2.centerY();
                                            } else {
                                                i4 = (round2 + width) / 2;
                                            }
                                            float abs = (Math.abs(i4 - i10) + (i11 - round3)) / viewGroup.getHeight();
                                            j2 = this.c;
                                            if (j2 < j) {
                                                j2 = 300;
                                            }
                                            round = Math.round(((i3 * j2) / 3.0f) * abs);
                                        }
                                    } else {
                                        j = 0;
                                    }
                                    i3 = -1;
                                    if (b9tVar2 == null) {
                                        if (b9tVar2 == null) {
                                            int[] iArr32 = new int[2];
                                            viewGroup.getLocationOnScreen(iArr32);
                                            int round22 = Math.round(viewGroup.getTranslationX()) + iArr32[0];
                                            int round32 = Math.round(viewGroup.getTranslationY()) + iArr32[1];
                                            int width2 = viewGroup.getWidth() + round22;
                                            viewGroup.getHeight();
                                            if (E2 == null) {
                                            }
                                            float abs2 = (Math.abs(i4 - i10) + (i11 - round32)) / viewGroup.getHeight();
                                            j2 = this.c;
                                            if (j2 < j) {
                                            }
                                            round = Math.round(((i3 * j2) / 3.0f) * abs2);
                                        }
                                        int[] iArr322 = new int[2];
                                        viewGroup.getLocationOnScreen(iArr322);
                                        int round222 = Math.round(viewGroup.getTranslationX()) + iArr322[0];
                                        int round322 = Math.round(viewGroup.getTranslationY()) + iArr322[1];
                                        int width22 = viewGroup.getWidth() + round222;
                                        viewGroup.getHeight();
                                        if (E2 == null) {
                                        }
                                        float abs22 = (Math.abs(i4 - i10) + (i11 - round322)) / viewGroup.getHeight();
                                        j2 = this.c;
                                        if (j2 < j) {
                                        }
                                        round = Math.round(((i3 * j2) / 3.0f) * abs22);
                                    }
                                    if (b9tVar2 == null) {
                                    }
                                    int[] iArr3222 = new int[2];
                                    viewGroup.getLocationOnScreen(iArr3222);
                                    int round2222 = Math.round(viewGroup.getTranslationX()) + iArr3222[0];
                                    int round3222 = Math.round(viewGroup.getTranslationY()) + iArr3222[1];
                                    int width222 = viewGroup.getWidth() + round2222;
                                    viewGroup.getHeight();
                                    if (E2 == null) {
                                    }
                                    float abs222 = (Math.abs(i4 - i10) + (i11 - round3222)) / viewGroup.getHeight();
                                    j2 = this.c;
                                    if (j2 < j) {
                                    }
                                    round = Math.round(((i3 * j2) / 3.0f) * abs222);
                                }
                                sparseIntArray.put(this.w.size(), (int) round);
                                j3 = Math.min(round, j3);
                            }
                            WindowId windowId = viewGroup.getWindowId();
                            r7t r7tVar2 = new r7t();
                            r7tVar2.a = view;
                            r7tVar2.b = str;
                            r7tVar2.c = b9tVar;
                            r7tVar2.d = windowId;
                            r7tVar2.e = this;
                            r7tVar2.f = n;
                            if (z) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(n);
                                n = animatorSet;
                            }
                            u.put(n, r7tVar2);
                            this.w.add(n);
                        }
                    }
                } else {
                    i = size;
                    z = z2;
                    i2 = i5;
                    view = b9tVar2.b;
                }
                b9tVar = null;
                if (n != null) {
                }
            } else {
                i = size;
                z = z2;
                i2 = i5;
            }
            i5 = i2 + 1;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                r7t r7tVar3 = (r7t) u.get((Animator) this.w.get(sparseIntArray.keyAt(i12)));
                r7tVar3.f.setStartDelay(r7tVar3.f.getStartDelay() + (sparseIntArray.valueAt(i12) - j3));
            }
        }
    }

    public final void q() {
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            E(this, wvs.c, false);
            for (int i2 = 0; i2 < ((ovg) this.i.c).h(); i2++) {
                View view = (View) ((ovg) this.i.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((ovg) this.j.c).h(); i3++) {
                View view2 = (View) ((ovg) this.j.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.t = true;
        }
    }

    public void r(ViewGroup viewGroup) {
        xy0 u = u();
        int i = u.c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        xy0 xy0Var = new xy0(u);
        u.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            r7t r7tVar = (r7t) xy0Var.j(i2);
            if (r7tVar.a != null && windowId.equals(r7tVar.d)) {
                ((Animator) xy0Var.f(i2)).end();
            }
        }
    }

    public final b9t s(View view, boolean z) {
        n8t n8tVar = this.k;
        if (n8tVar != null) {
            return n8tVar.s(view, z);
        }
        ArrayList arrayList = z ? this.m : this.n;
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
            b9t b9tVar = (b9t) arrayList.get(i);
            if (b9tVar == null) {
                return null;
            }
            if (b9tVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (b9t) (z ? this.n : this.m).get(i);
        }
        return null;
    }

    public final b8t t() {
        n8t n8tVar = this.k;
        return n8tVar != null ? n8tVar.t() : this;
    }

    public final String toString() {
        return T("");
    }

    public String[] v() {
        return null;
    }

    public final b9t w(View view, boolean z) {
        n8t n8tVar = this.k;
        if (n8tVar != null) {
            return n8tVar.w(view, z);
        }
        return (b9t) ((xy0) (z ? this.i : this.j).a).get(view);
    }

    public boolean x() {
        return !this.p.isEmpty();
    }

    public boolean y() {
        return this instanceof qb4;
    }
}
