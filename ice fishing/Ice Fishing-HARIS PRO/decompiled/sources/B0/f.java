package B0;

import a.AbstractC0078a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.C0299g;
import m0.C0303k;
import m0.InterfaceC0300h;

/* loaded from: classes.dex */
public final class f extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45b;

    public /* synthetic */ f(int i, Object obj) {
        this.f44a = i;
        this.f45b = obj;
    }

    @Override // R.j
    public int J(View view) {
        switch (this.f44a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f45b;
                return sideSheetBehavior.f2572l + sideSheetBehavior.f2575o;
            case 2:
                return ((C0303k) this.f45b).i;
            default:
                return super.J(view);
        }
    }

    @Override // R.j
    public int K() {
        switch (this.f44a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f45b;
                return bottomSheetBehavior.f2374I ? bottomSheetBehavior.f2384T : bottomSheetBehavior.f2372G;
            default:
                return super.K();
        }
    }

    @Override // R.j
    public void U(int i) {
        switch (this.f44a) {
            case 2:
                if (v0()) {
                    C0303k c0303k = (C0303k) this.f45b;
                    c0303k.f4094p.c(c0303k.f4086f, i);
                    break;
                }
                break;
        }
    }

    @Override // R.j
    public void V(int i) {
        switch (this.f44a) {
            case 2:
                if (v0()) {
                    C0303k c0303k = (C0303k) this.f45b;
                    c0303k.f4094p.c(c0303k.f4086f, i);
                    break;
                }
                break;
        }
    }

    @Override // R.j
    public void a0(View view, int i) {
        switch (this.f44a) {
            case 2:
                C0303k c0303k = (C0303k) this.f45b;
                int childCount = c0303k.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = c0303k.getChildAt(i2);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                break;
        }
    }

    @Override // R.j
    public final void b0(int i) {
        switch (this.f44a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f45b;
                    if (bottomSheetBehavior.f2375K) {
                        bottomSheetBehavior.I(1);
                        break;
                    }
                }
                break;
            case 1:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f45b;
                    if (sideSheetBehavior.f2569g) {
                        sideSheetBehavior.w(1);
                        break;
                    }
                }
                break;
            default:
                C0303k c0303k = (C0303k) this.f45b;
                if (c0303k.f4094p.f1174a == 0) {
                    float f2 = c0303k.f4087g;
                    CopyOnWriteArrayList copyOnWriteArrayList = c0303k.f4092n;
                    if (f2 != 1.0f) {
                        View view = c0303k.f4086f;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            h0.a aVar = (h0.a) ((InterfaceC0300h) it.next());
                            aVar.getClass();
                            D1.i.e(view, "panel");
                            aVar.b(true);
                        }
                        c0303k.sendAccessibilityEvent(32);
                        c0303k.f4095q = true;
                        break;
                    } else {
                        c0303k.g(c0303k.f4086f);
                        View view2 = c0303k.f4086f;
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            h0.a aVar2 = (h0.a) ((InterfaceC0300h) it2.next());
                            aVar2.getClass();
                            D1.i.e(view2, "panel");
                            aVar2.b(false);
                        }
                        c0303k.sendAccessibilityEvent(32);
                        c0303k.f4095q = false;
                        break;
                    }
                }
                break;
        }
    }

    @Override // R.j
    public final void c0(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f44a) {
            case 0:
                ((BottomSheetBehavior) this.f45b).y(i2);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f45b;
                WeakReference weakReference = sideSheetBehavior.f2577q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2564a.t0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2582v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2564a.j(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                C0303k c0303k = (C0303k) this.f45b;
                if (c0303k.f4086f == null) {
                    c0303k.f4087g = RecyclerView.f2111C0;
                } else {
                    boolean c2 = c0303k.c();
                    C0299g c0299g = (C0299g) c0303k.f4086f.getLayoutParams();
                    int width = c0303k.f4086f.getWidth();
                    if (c2) {
                        i = (c0303k.getWidth() - i) - width;
                    }
                    float paddingRight = (i - ((c2 ? c0303k.getPaddingRight() : c0303k.getPaddingLeft()) + (c2 ? ((ViewGroup.MarginLayoutParams) c0299g).rightMargin : ((ViewGroup.MarginLayoutParams) c0299g).leftMargin))) / c0303k.i;
                    c0303k.f4087g = paddingRight;
                    if (c0303k.f4089k != 0) {
                        c0303k.e(paddingRight);
                    }
                    View view3 = c0303k.f4086f;
                    Iterator it2 = c0303k.f4092n.iterator();
                    while (it2.hasNext()) {
                        ((h0.a) ((InterfaceC0300h) it2.next())).getClass();
                        D1.i.e(view3, "panel");
                    }
                }
                c0303k.invalidate();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r0.f2564a.O(r6) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2564a.y()) < java.lang.Math.abs(r7 - r0.f2564a.A())) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r7 > r4.f2370E) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012b, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.C()) < java.lang.Math.abs(r6.getTop() - r4.f2370E)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0176, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2369D) < java.lang.Math.abs(r7 - r4.f2372G)) goto L45;
     */
    @Override // R.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(View view, float f2, float f3) {
        int paddingLeft;
        switch (this.f44a) {
            case 0:
                int i = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f45b;
                if (f3 < RecyclerView.f2111C0) {
                    if (!bottomSheetBehavior.f2393b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.K(view, i, true);
                    break;
                } else if (bottomSheetBehavior.f2374I && bottomSheetBehavior.J(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.f2397d) {
                        if (view.getTop() <= (bottomSheetBehavior.C() + bottomSheetBehavior.f2384T) / 2) {
                            if (!bottomSheetBehavior.f2393b) {
                                break;
                            }
                            i = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.K(view, i, true);
                        }
                    }
                    i = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.K(view, i, true);
                } else {
                    if (f3 == RecyclerView.f2111C0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f2393b) {
                            break;
                        } else {
                            int i2 = bottomSheetBehavior.f2370E;
                            if (top2 < i2) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f2372G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i = 3;
                            } else {
                                if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.f2372G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f2393b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f2370E) < Math.abs(top3 - bottomSheetBehavior.f2372G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.K(view, i, true);
                }
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f45b;
                int i3 = 3;
                if (!sideSheetBehavior.f2564a.N(f2)) {
                    if (sideSheetBehavior.f2564a.p0(view, f2)) {
                        if (!sideSheetBehavior.f2564a.P(f2, f3)) {
                            break;
                        }
                        i3 = 5;
                    } else {
                        if (f2 == RecyclerView.f2111C0 || Math.abs(f2) <= Math.abs(f3)) {
                            int left = view.getLeft();
                            break;
                        }
                        i3 = 5;
                    }
                }
                sideSheetBehavior.y(view, i3, true);
                break;
            default:
                C0299g c0299g = (C0299g) view.getLayoutParams();
                C0303k c0303k = (C0303k) this.f45b;
                if (c0303k.c()) {
                    int paddingRight = c0303k.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0299g).rightMargin;
                    if (f2 < RecyclerView.f2111C0 || (f2 == RecyclerView.f2111C0 && c0303k.f4087g > 0.5f)) {
                        paddingRight += c0303k.i;
                    }
                    paddingLeft = (c0303k.getWidth() - paddingRight) - c0303k.f4086f.getWidth();
                } else {
                    paddingLeft = ((ViewGroup.MarginLayoutParams) c0299g).leftMargin + c0303k.getPaddingLeft();
                    if (f2 > RecyclerView.f2111C0 || (f2 == RecyclerView.f2111C0 && c0303k.f4087g > 0.5f)) {
                        paddingLeft += c0303k.i;
                    }
                }
                c0303k.f4094p.s(paddingLeft, view.getTop());
                c0303k.invalidate();
                break;
        }
    }

    @Override // R.j
    public final int m(View view, int i) {
        switch (this.f44a) {
            case 0:
                return view.getLeft();
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f45b;
                return AbstractC0078a.j(i, sideSheetBehavior.f2564a.D(), sideSheetBehavior.f2564a.C());
            default:
                C0303k c0303k = (C0303k) this.f45b;
                C0299g c0299g = (C0299g) c0303k.f4086f.getLayoutParams();
                if (!c0303k.c()) {
                    int paddingLeft = c0303k.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0299g).leftMargin;
                    return Math.min(Math.max(i, paddingLeft), c0303k.i + paddingLeft);
                }
                int width = c0303k.getWidth() - (c0303k.f4086f.getWidth() + (c0303k.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0299g).rightMargin));
                return Math.max(Math.min(i, width), width - c0303k.i);
        }
    }

    @Override // R.j
    public final int n(View view, int i) {
        switch (this.f44a) {
        }
        return view.getTop();
    }

    @Override // R.j
    public final boolean r0(View view, int i) {
        WeakReference weakReference;
        switch (this.f44a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f45b;
                int i2 = bottomSheetBehavior.f2376L;
                if (i2 == 1 || bottomSheetBehavior.f2394b0) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.f2390Z == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.f2386V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f2385U;
                return weakReference3 != null && weakReference3.get() == view;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f45b;
                return (sideSheetBehavior.f2570h == 1 || (weakReference = sideSheetBehavior.f2576p) == null || weakReference.get() != view) ? false : true;
            default:
                if (v0()) {
                    return ((C0299g) view.getLayoutParams()).f4077b;
                }
                return false;
        }
    }

    public boolean v0() {
        C0303k c0303k = (C0303k) this.f45b;
        if (c0303k.j || c0303k.getLockMode() == 3) {
            return false;
        }
        if (c0303k.d() && c0303k.getLockMode() == 1) {
            return false;
        }
        return c0303k.d() || c0303k.getLockMode() != 2;
    }
}
