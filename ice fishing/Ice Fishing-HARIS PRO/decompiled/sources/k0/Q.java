package k0;

import O.C0025a;
import O.C0026b;
import O.C0038n;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3407a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3408b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3409c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3410d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3411f;

    /* renamed from: g, reason: collision with root package name */
    public P f3412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3413h;

    public Q(RecyclerView recyclerView) {
        this.f3413h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3407a = arrayList;
        this.f3408b = null;
        this.f3409c = new ArrayList();
        this.f3410d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f3411f = 2;
    }

    public final void a(b0 b0Var, boolean z2) {
        RecyclerView.l(b0Var);
        RecyclerView recyclerView = this.f3413h;
        d0 d0Var = recyclerView.f2163n0;
        View view = b0Var.f3449a;
        if (d0Var != null) {
            c0 c0Var = d0Var.e;
            O.K.l(view, c0Var != null ? (C0026b) ((WeakHashMap) c0Var.f3468f).remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f2164o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f2151g0 != null) {
                recyclerView.f2150g.H(b0Var);
            }
            if (RecyclerView.f2109A0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + b0Var);
            }
        }
        b0Var.f3464s = null;
        b0Var.f3463r = null;
        P c2 = c();
        c2.getClass();
        int i = b0Var.f3453f;
        ArrayList arrayList2 = c2.a(i).f3400a;
        if (((O) c2.f3404a.get(i)).f3401b <= arrayList2.size()) {
            R.j.k(view);
        } else {
            if (RecyclerView.z0 && arrayList2.contains(b0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            b0Var.o();
            arrayList2.add(b0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f3413h;
        if (i >= 0 && i < recyclerView.f2151g0.b()) {
            return !recyclerView.f2151g0.f3427g ? i : recyclerView.e.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f2151g0.b() + recyclerView.B());
    }

    public final P c() {
        if (this.f3412g == null) {
            P p2 = new P();
            p2.f3404a = new SparseArray();
            p2.f3405b = 0;
            p2.f3406c = Collections.newSetFromMap(new IdentityHashMap());
            this.f3412g = p2;
            d();
        }
        return this.f3412g;
    }

    public final void d() {
        RecyclerView recyclerView;
        C c2;
        P p2 = this.f3412g;
        if (p2 == null || (c2 = (recyclerView = this.f3413h).f2160m) == null || !recyclerView.f2172s) {
            return;
        }
        p2.f3406c.add(c2);
    }

    public final void e(C c2, boolean z2) {
        P p2 = this.f3412g;
        if (p2 == null) {
            return;
        }
        Set set = p2.f3406c;
        set.remove(c2);
        if (set.size() != 0 || z2) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = p2.f3404a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((O) sparseArray.get(sparseArray.keyAt(i))).f3400a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                R.j.k(((b0) arrayList.get(i2)).f3449a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f3409c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f2114F0) {
            C0201o c0201o = this.f3413h.f2149f0;
            int[] iArr = c0201o.f3575c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0201o.f3576d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f2109A0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f3409c;
        b0 b0Var = (b0) arrayList.get(i);
        if (RecyclerView.f2109A0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + b0Var);
        }
        a(b0Var, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        b0 L2 = RecyclerView.L(view);
        boolean l2 = L2.l();
        RecyclerView recyclerView = this.f3413h;
        if (l2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L2.k()) {
            L2.f3459n.l(L2);
        } else if (L2.r()) {
            L2.j &= -33;
        }
        i(L2);
        if (recyclerView.f2127L == null || L2.i()) {
            return;
        }
        recyclerView.f2127L.d(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(b0 b0Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean k2 = b0Var.k();
        boolean z5 = true;
        RecyclerView recyclerView = this.f3413h;
        View view = b0Var.f3449a;
        if (k2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(b0Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (b0Var.l()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(b0Var);
            throw new IllegalArgumentException(D1.h.d(recyclerView, sb2));
        }
        if (b0Var.q()) {
            throw new IllegalArgumentException(D1.h.d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((b0Var.j & 16) == 0) {
            WeakHashMap weakHashMap = O.K.f747a;
            if (view.hasTransientState()) {
                z2 = true;
                C c2 = recyclerView.f2160m;
                z3 = RecyclerView.z0;
                ArrayList arrayList = this.f3409c;
                if (!z3 && arrayList.contains(b0Var)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(b0Var);
                    throw new IllegalArgumentException(D1.h.d(recyclerView, sb3));
                }
                if (b0Var.i()) {
                    if (RecyclerView.f2109A0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z5 = false;
                } else {
                    if (this.f3411f <= 0 || b0Var.e(526)) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f3411f && size > 0) {
                            g(0);
                            size--;
                        }
                        if (RecyclerView.f2114F0 && size > 0) {
                            C0201o c0201o = recyclerView.f2149f0;
                            int i = b0Var.f3451c;
                            if (c0201o.f3575c != null) {
                                int i2 = c0201o.f3576d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0201o.f3575c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((b0) arrayList.get(i4)).f3451c;
                                C0201o c0201o2 = recyclerView.f2149f0;
                                if (c0201o2.f3575c == null) {
                                    break;
                                }
                                int i6 = c0201o2.f3576d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0201o2.f3575c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, b0Var);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(b0Var, true);
                    }
                    r1 = z4;
                }
                recyclerView.f2150g.H(b0Var);
                if (r1 && !z5 && z2) {
                    R.j.k(view);
                    b0Var.f3464s = null;
                    b0Var.f3463r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        C c22 = recyclerView.f2160m;
        z3 = RecyclerView.z0;
        ArrayList arrayList2 = this.f3409c;
        if (!z3) {
        }
        if (b0Var.i()) {
        }
        recyclerView.f2150g.H(b0Var);
        if (r1) {
        }
    }

    public final void j(View view) {
        G g2;
        b0 L2 = RecyclerView.L(view);
        boolean e = L2.e(12);
        RecyclerView recyclerView = this.f3413h;
        if (!e && L2.m() && (g2 = recyclerView.f2127L) != null) {
            C0197k c0197k = (C0197k) g2;
            if (L2.d().isEmpty() && c0197k.f3525g && !L2.h()) {
                if (this.f3408b == null) {
                    this.f3408b = new ArrayList();
                }
                L2.f3459n = this;
                L2.f3460o = true;
                this.f3408b.add(L2);
                return;
            }
        }
        if (L2.h() && !L2.j() && !recyclerView.f2160m.f3371b) {
            throw new IllegalArgumentException(D1.h.d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        L2.f3459n = this;
        L2.f3460o = false;
        this.f3407a.add(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0463, code lost:
    
        if (r11.h() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ac, code lost:
    
        if ((r9 + r12) >= r27) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
    
        if (r11.f3453f != 0) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b0 k(int i, long j) {
        boolean z2;
        b0 b0Var;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        L l2;
        RecyclerView G2;
        b0 b0Var2;
        b0 b0Var3;
        View view;
        int b2;
        boolean z5;
        int size;
        int g2;
        RecyclerView recyclerView = this.f3413h;
        if (i < 0 || i >= recyclerView.f2151g0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f2151g0.b() + recyclerView.B());
        }
        X x2 = recyclerView.f2151g0;
        boolean z6 = false;
        if (x2.f3427g) {
            ArrayList arrayList = this.f3408b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        b0Var = (b0) this.f3408b.get(i2);
                        if (!b0Var.r() && b0Var.c() == i) {
                            b0Var.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f2160m.f3371b && (g2 = recyclerView.e.g(i, 0)) > 0 && g2 < recyclerView.f2160m.a()) {
                        long b3 = recyclerView.f2160m.b(g2);
                        for (int i3 = 0; i3 < size; i3++) {
                            b0 b0Var4 = (b0) this.f3408b.get(i3);
                            if (!b0Var4.r() && b0Var4.e == b3) {
                                b0Var4.a(32);
                                b0Var = b0Var4;
                                break;
                            }
                        }
                    }
                }
                z2 = b0Var == null;
            }
            b0Var = null;
            if (b0Var == null) {
            }
        } else {
            z2 = false;
            b0Var = null;
        }
        ArrayList arrayList2 = this.f3409c;
        ArrayList arrayList3 = this.f3407a;
        if (b0Var == null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                b0 b0Var5 = (b0) arrayList3.get(i4);
                if (!b0Var5.r() && b0Var5.c() == i && !b0Var5.h() && (x2.f3427g || !b0Var5.j())) {
                    b0Var5.a(32);
                    b0Var = b0Var5;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f2148f.f3471c;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i5);
                b0 L2 = RecyclerView.L(view);
                if (L2.c() == i && !L2.h() && !L2.j()) {
                    break;
                }
                i5++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        b0Var = null;
                        break;
                    }
                    b0Var = (b0) arrayList2.get(i6);
                    if (b0Var.h() || b0Var.c() != i || b0Var.f()) {
                        i6++;
                    } else {
                        arrayList2.remove(i6);
                        if (RecyclerView.f2109A0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + b0Var);
                        }
                    }
                }
            } else {
                b0 L3 = RecyclerView.L(view);
                C0190d c0190d = recyclerView.f2148f;
                int indexOfChild = c0190d.f3469a.f3369a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0189c c0189c = c0190d.f3470b;
                if (!c0189c.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0189c.a(indexOfChild);
                c0190d.j(view);
                C0190d c0190d2 = recyclerView.f2148f;
                int indexOfChild2 = c0190d2.f3469a.f3369a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    C0189c c0189c2 = c0190d2.f3470b;
                    if (!c0189c2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0189c2.b(indexOfChild2);
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(L3);
                            throw new IllegalStateException(D1.h.d(recyclerView, sb));
                        }
                        recyclerView.f2148f.c(b2);
                        j(view);
                        L3.a(8224);
                        b0Var = L3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (b0Var != null) {
                if (!b0Var.j()) {
                    int i7 = b0Var.f3451c;
                    if (i7 < 0 || i7 >= recyclerView.f2160m.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(b0Var);
                        throw new IndexOutOfBoundsException(D1.h.d(recyclerView, sb2));
                    }
                    if (!x2.f3427g) {
                        recyclerView.f2160m.getClass();
                    }
                    C c2 = recyclerView.f2160m;
                    if (!c2.f3371b || b0Var.e == c2.b(b0Var.f3451c)) {
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    if (RecyclerView.z0 && !x2.f3427g) {
                        throw new IllegalStateException(D1.h.d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z5 = x2.f3427g;
                }
                if (z5) {
                    z2 = true;
                } else {
                    b0Var.a(4);
                    if (b0Var.k()) {
                        recyclerView.removeDetachedView(b0Var.f3449a, false);
                        b0Var.f3459n.l(b0Var);
                    } else if (b0Var.r()) {
                        b0Var.j &= -33;
                    }
                    i(b0Var);
                    b0Var = null;
                }
            }
        }
        if (b0Var == null) {
            int g3 = recyclerView.e.g(i, 0);
            if (g3 < 0 || g3 >= recyclerView.f2160m.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g3 + ").state:" + x2.b() + recyclerView.B());
            }
            recyclerView.f2160m.getClass();
            C c3 = recyclerView.f2160m;
            if (c3.f3371b) {
                long b4 = c3.b(g3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        b0 b0Var6 = (b0) arrayList3.get(size5);
                        if (b0Var6.e == b4 && !b0Var6.r()) {
                            if (b0Var6.f3453f == 0) {
                                b0Var6.a(32);
                                if (b0Var6.j() && !x2.f3427g) {
                                    b0Var6.j = (b0Var6.j & (-15)) | 2;
                                }
                                b0Var3 = b0Var6;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = b0Var6.f3449a;
                                recyclerView.removeDetachedView(view2, false);
                                b0 L4 = RecyclerView.L(view2);
                                L4.f3459n = null;
                                L4.f3460o = false;
                                L4.j &= -33;
                                i(L4);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            b0Var3 = (b0) arrayList2.get(size6);
                            if (b0Var3.e != b4 || b0Var3.f()) {
                                size6--;
                            } else if (b0Var3.f3453f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                g(size6);
                            }
                        }
                        b0Var3 = null;
                    }
                }
                if (b0Var3 != null) {
                    b0Var3.f3451c = g3;
                    b0Var = b0Var3;
                    z2 = true;
                } else {
                    b0Var = b0Var3;
                }
            }
            if (b0Var == null) {
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                }
                O o2 = (O) c().f3404a.get(0);
                if (o2 != null) {
                    ArrayList arrayList5 = o2.f3400a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((b0) arrayList5.get(size7)).f()) {
                                b0Var2 = (b0) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                b0Var2 = null;
                if (b0Var2 != null) {
                    b0Var2.o();
                    boolean z7 = RecyclerView.z0;
                }
                b0Var = b0Var2;
            }
            if (b0Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.f3412g.a(0).f3402c;
                    if (!(j2 == 0 || j2 + nanoTime < j)) {
                        return null;
                    }
                }
                C c4 = recyclerView.f2160m;
                c4.getClass();
                try {
                    int i8 = K.i.f387a;
                    Trace.beginSection("RV CreateView");
                    b0Var = c4.d(recyclerView);
                    View view3 = b0Var.f3449a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    b0Var.f3453f = 0;
                    Trace.endSection();
                    if (RecyclerView.f2114F0 && (G2 = RecyclerView.G(view3)) != null) {
                        b0Var.f3450b = new WeakReference(G2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    O a2 = this.f3412g.a(0);
                    long j3 = a2.f3402c;
                    if (j3 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
                    }
                    a2.f3402c = nanoTime2;
                    if (RecyclerView.f2109A0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i9 = K.i.f387a;
                    Trace.endSection();
                }
            }
        }
        if (z2 && !x2.f3427g && b0Var.e(8192)) {
            b0Var.j &= -8193;
            if (x2.j) {
                G.b(b0Var);
                G g4 = recyclerView.f2127L;
                b0Var.d();
                g4.getClass();
                C0038n c0038n = new C0038n();
                c0038n.a(b0Var);
                recyclerView.Y(b0Var, c0038n);
            }
        }
        boolean z8 = x2.f3427g;
        View view4 = b0Var.f3449a;
        if (!z8 || !b0Var.g()) {
            if (b0Var.g()) {
                if (!((b0Var.j & 2) != 0)) {
                }
            }
            if (RecyclerView.z0 && b0Var.j()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(b0Var);
                throw new IllegalStateException(D1.h.d(recyclerView, sb3));
            }
            int g5 = recyclerView.e.g(i, 0);
            b0Var.f3464s = null;
            b0Var.f3463r = recyclerView;
            int i10 = b0Var.f3453f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j4 = this.f3412g.a(i10).f3403d;
                if (j4 != 0) {
                }
            }
            if (b0Var.l()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            C c5 = recyclerView.f2160m;
            c5.getClass();
            boolean z9 = b0Var.f3464s == null;
            if (z9) {
                b0Var.f3451c = g5;
                if (c5.f3371b) {
                    b0Var.e = c5.b(g5);
                }
                b0Var.j = (b0Var.j & (-520)) | 1;
                int i11 = K.i.f387a;
                Trace.beginSection("RV OnBindView");
            }
            b0Var.f3464s = c5;
            if (RecyclerView.z0) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = O.K.f747a;
                    if (view4.isAttachedToWindow() != b0Var.l()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + b0Var.l() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + b0Var);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = O.K.f747a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + b0Var);
                    }
                }
            }
            b0Var.d();
            c5.c(b0Var, g5);
            if (z9) {
                ArrayList arrayList6 = b0Var.f3456k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                b0Var.j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof L) {
                    ((L) layoutParams2).f3398c = true;
                }
            }
            if (z3) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            O a3 = this.f3412g.a(b0Var.f3453f);
            long j5 = a3.f3403d;
            if (j5 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j5 / 4) * 3);
            }
            a3.f3403d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f2118B;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = O.K.f747a;
                if (view4.getImportantForAccessibility() == 0) {
                    z4 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z4 = true;
                }
                d0 d0Var = recyclerView.f2163n0;
                if (d0Var != null) {
                    c0 c0Var = d0Var.e;
                    if (c0Var != null) {
                        View.AccessibilityDelegate c6 = O.K.c(view4);
                        C0026b c0026b = c6 == null ? null : c6 instanceof C0025a ? ((C0025a) c6).f783a : new C0026b(c6);
                        if (c0026b != null && c0026b != c0Var) {
                            ((WeakHashMap) c0Var.f3468f).put(view4, c0026b);
                        }
                    }
                    O.K.l(view4, c0Var);
                }
            } else {
                z4 = true;
            }
            if (x2.f3427g) {
                b0Var.f3454g = i;
            }
            z6 = z4;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                l2 = (L) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(l2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                l2 = (L) layoutParams;
            } else {
                l2 = (L) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(l2);
            }
            l2.f3396a = b0Var;
            l2.f3399d = (z2 || !z6) ? false : z4;
            return b0Var;
        }
        b0Var.f3454g = i;
        z4 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        l2.f3396a = b0Var;
        l2.f3399d = (z2 || !z6) ? false : z4;
        return b0Var;
    }

    public final void l(b0 b0Var) {
        if (b0Var.f3460o) {
            this.f3408b.remove(b0Var);
        } else {
            this.f3407a.remove(b0Var);
        }
        b0Var.f3459n = null;
        b0Var.f3460o = false;
        b0Var.j &= -33;
    }

    public final void m() {
        K k2 = this.f3413h.f2162n;
        this.f3411f = this.e + (k2 != null ? k2.j : 0);
        ArrayList arrayList = this.f3409c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3411f; size--) {
            g(size);
        }
    }
}
