package k0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211z extends M {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3628a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f3629b = new e0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0210y f3630c;

    /* renamed from: d, reason: collision with root package name */
    public C0210y f3631d;

    public static int b(View view, V.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(K k2, V.g gVar) {
        int v2 = k2.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = k2.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(K k2, View view) {
        int[] iArr = new int[2];
        if (k2.d()) {
            iArr[0] = b(view, d(k2));
        } else {
            iArr[0] = 0;
        }
        if (k2.e()) {
            iArr[1] = b(view, e(k2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final V.g d(K k2) {
        C0210y c0210y = this.f3631d;
        if (c0210y == null || ((K) c0210y.f1211b) != k2) {
            this.f3631d = new C0210y(k2, 0);
        }
        return this.f3631d;
    }

    public final V.g e(K k2) {
        C0210y c0210y = this.f3630c;
        if (c0210y == null || ((K) c0210y.f1211b) != k2) {
            this.f3630c = new C0210y(k2, 1);
        }
        return this.f3630c;
    }

    public final void f() {
        K layoutManager;
        RecyclerView recyclerView = this.f3628a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c2 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c2 == null) {
            return;
        }
        int[] a2 = a(layoutManager, c2);
        int i = a2[0];
        if (i == 0 && a2[1] == 0) {
            return;
        }
        this.f3628a.h0(i, a2[1], false);
    }
}
