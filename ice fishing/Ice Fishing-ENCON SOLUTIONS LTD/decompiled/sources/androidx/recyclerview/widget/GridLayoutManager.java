package androidx.recyclerview.widget;

import C.j;
import C1.a;
import P.C;
import P.C0063l;
import P.F;
import P.w;
import P.x;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f2518p;

    /* renamed from: q, reason: collision with root package name */
    public final j f2519q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f2518p = -1;
        new SparseIntArray();
        new SparseIntArray();
        j jVar = new j(14);
        this.f2519q = jVar;
        new Rect();
        int i4 = w.w(context, attributeSet, i2, i3).f1359c;
        if (i4 == this.f2518p) {
            return;
        }
        if (i4 < 1) {
            throw new IllegalArgumentException(a.f(i4, "Span count should be at least 1. Provided "));
        }
        this.f2518p = i4;
        ((SparseIntArray) jVar.f124b).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(C c2, F f2, int i2) {
        boolean z2 = f2.f1262c;
        j jVar = this.f2519q;
        if (!z2) {
            int i3 = this.f2518p;
            jVar.getClass();
            return j.m(i2, i3);
        }
        RecyclerView recyclerView = c2.f1258f;
        if (i2 < 0 || i2 >= recyclerView.f2554c0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f2554c0.a() + recyclerView.h());
        }
        int y2 = !recyclerView.f2554c0.f1262c ? i2 : recyclerView.f2553c.y(i2, 0);
        if (y2 != -1) {
            int i4 = this.f2518p;
            jVar.getClass();
            return j.m(y2, i4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // P.w
    public final boolean d(x xVar) {
        return xVar instanceof C0063l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, P.w
    public final x l() {
        return this.f2520h == 0 ? new C0063l(-2, -1) : new C0063l(-1, -2);
    }

    @Override // P.w
    public final x m(Context context, AttributeSet attributeSet) {
        return new C0063l(context, attributeSet);
    }

    @Override // P.w
    public final x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0063l((ViewGroup.MarginLayoutParams) layoutParams) : new C0063l(layoutParams);
    }

    @Override // P.w
    public final int q(C c2, F f2) {
        if (this.f2520h == 1) {
            return this.f2518p;
        }
        if (f2.a() < 1) {
            return 0;
        }
        return R(c2, f2, f2.a() - 1) + 1;
    }

    @Override // P.w
    public final int x(C c2, F f2) {
        if (this.f2520h == 0) {
            return this.f2518p;
        }
        if (f2.a() < 1) {
            return 0;
        }
        return R(c2, f2, f2.a() - 1) + 1;
    }
}
