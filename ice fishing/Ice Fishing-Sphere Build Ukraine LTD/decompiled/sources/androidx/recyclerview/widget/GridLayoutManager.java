package androidx.recyclerview.widget;

import A.j;
import E0.h;
import L.C0037m;
import L.D;
import L.G;
import L.x;
import L.y;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f1553p;

    /* renamed from: q, reason: collision with root package name */
    public final j f1554q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1553p = -1;
        new SparseIntArray();
        new SparseIntArray();
        j jVar = new j(7);
        this.f1554q = jVar;
        new Rect();
        int i4 = x.w(context, attributeSet, i2, i3).f586c;
        if (i4 == this.f1553p) {
            return;
        }
        if (i4 < 1) {
            throw new IllegalArgumentException(h.e("Span count should be at least 1. Provided ", i4));
        }
        this.f1553p = i4;
        ((SparseIntArray) jVar.f30f).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(D d2, G g2, int i2) {
        boolean z2 = g2.f480c;
        j jVar = this.f1554q;
        if (!z2) {
            int i3 = this.f1553p;
            jVar.getClass();
            return j.y(i2, i3);
        }
        RecyclerView recyclerView = d2.f476f;
        if (i2 < 0 || i2 >= recyclerView.f1589b0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1589b0.a() + recyclerView.h());
        }
        int v2 = !recyclerView.f1589b0.f480c ? i2 : recyclerView.f1596g.v(i2, 0);
        if (v2 != -1) {
            int i4 = this.f1553p;
            jVar.getClass();
            return j.y(v2, i4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // L.x
    public final boolean d(y yVar) {
        return yVar instanceof C0037m;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, L.x
    public final y l() {
        return this.f1555h == 0 ? new C0037m(-2, -1) : new C0037m(-1, -2);
    }

    @Override // L.x
    public final y m(Context context, AttributeSet attributeSet) {
        return new C0037m(context, attributeSet);
    }

    @Override // L.x
    public final y n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0037m((ViewGroup.MarginLayoutParams) layoutParams) : new C0037m(layoutParams);
    }

    @Override // L.x
    public final int q(D d2, G g2) {
        if (this.f1555h == 1) {
            return this.f1553p;
        }
        if (g2.a() < 1) {
            return 0;
        }
        return R(d2, g2, g2.a() - 1) + 1;
    }

    @Override // L.x
    public final int x(D d2, G g2) {
        if (this.f1555h == 0) {
            return this.f1553p;
        }
        if (g2.a() < 1) {
            return 0;
        }
        return R(d2, g2, g2.a() - 1) + 1;
    }
}
