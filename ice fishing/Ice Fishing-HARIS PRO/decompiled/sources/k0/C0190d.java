package k0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190d {

    /* renamed from: a, reason: collision with root package name */
    public final B f3469a;
    public View e;

    /* renamed from: d, reason: collision with root package name */
    public int f3472d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0189c f3470b = new C0189c();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3471c = new ArrayList();

    public C0190d(B b2) {
        this.f3469a = b2;
    }

    public final void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = this.f3469a.f3369a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f3470b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.L(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f3469a.f3369a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f3470b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        b0 L2 = RecyclerView.L(view);
        if (L2 != null) {
            if (!L2.l() && !L2.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L2);
                throw new IllegalArgumentException(D1.h.d(recyclerView, sb));
            }
            if (RecyclerView.f2109A0) {
                Log.d("RecyclerView", "reAttach " + L2);
            }
            L2.j &= -257;
        } else if (RecyclerView.z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(D1.h.d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f2 = f(i);
        this.f3470b.f(f2);
        RecyclerView recyclerView = this.f3469a.f3369a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null) {
            b0 L2 = RecyclerView.L(childAt);
            if (L2 != null) {
                if (L2.l() && !L2.q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L2);
                    throw new IllegalArgumentException(D1.h.d(recyclerView, sb));
                }
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "tmpDetach " + L2);
                }
                L2.a(256);
            }
        } else if (RecyclerView.z0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f2);
            throw new IllegalArgumentException(D1.h.d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i) {
        return this.f3469a.f3369a.getChildAt(f(i));
    }

    public final int e() {
        return this.f3469a.f3369a.getChildCount() - this.f3471c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f3469a.f3369a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0189c c0189c = this.f3470b;
            int b2 = i - (i2 - c0189c.b(i2));
            if (b2 == 0) {
                while (c0189c.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f3469a.f3369a.getChildAt(i);
    }

    public final int h() {
        return this.f3469a.f3369a.getChildCount();
    }

    public final void i(View view) {
        this.f3471c.add(view);
        B b2 = this.f3469a;
        b0 L2 = RecyclerView.L(view);
        if (L2 != null) {
            int i = L2.f3462q;
            View view2 = L2.f3449a;
            if (i != -1) {
                L2.f3461p = i;
            } else {
                WeakHashMap weakHashMap = O.K.f747a;
                L2.f3461p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = b2.f3369a;
            if (recyclerView.O()) {
                L2.f3462q = 4;
                recyclerView.f2174t0.add(L2);
            } else {
                WeakHashMap weakHashMap2 = O.K.f747a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        if (this.f3471c.remove(view)) {
            B b2 = this.f3469a;
            b0 L2 = RecyclerView.L(view);
            if (L2 != null) {
                int i = L2.f3461p;
                RecyclerView recyclerView = b2.f3369a;
                if (recyclerView.O()) {
                    L2.f3462q = i;
                    recyclerView.f2174t0.add(L2);
                } else {
                    WeakHashMap weakHashMap = O.K.f747a;
                    L2.f3449a.setImportantForAccessibility(i);
                }
                L2.f3461p = 0;
            }
        }
    }

    public final String toString() {
        return this.f3470b.toString() + ", hidden list:" + this.f3471c.size();
    }
}
