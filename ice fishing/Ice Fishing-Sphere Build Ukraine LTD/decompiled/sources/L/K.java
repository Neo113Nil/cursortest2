package L;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import w.C0264b;
import x.C0292h;

/* loaded from: classes.dex */
public final class K extends C0264b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f491d;

    public K(RecyclerView recyclerView) {
        this.f491d = recyclerView;
        new J(this);
    }

    @Override // w.C0264b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f491d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // w.C0264b
    public final void b(View view, C0292h c0292h) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3050a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0292h.f3088a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f491d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        x layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f601b;
        D d2 = recyclerView2.f1592e;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f601b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f601b.canScrollVertically(1) || layoutManager.f601b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        G g2 = recyclerView2.f1589b0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(d2, g2), layoutManager.q(d2, g2), false, 0));
    }

    @Override // w.C0264b
    public final boolean c(View view, int i2, Bundle bundle) {
        int u2;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f491d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        x layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f601b;
        D d2 = recyclerView2.f1592e;
        if (i2 == 4096) {
            u2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f606g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f601b.canScrollHorizontally(1)) {
                s2 = (layoutManager.f605f - layoutManager.s()) - layoutManager.t();
            }
            s2 = 0;
        } else if (i2 != 8192) {
            s2 = 0;
            u2 = 0;
        } else {
            u2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f606g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f601b.canScrollHorizontally(-1)) {
                s2 = -((layoutManager.f605f - layoutManager.s()) - layoutManager.t());
            }
            s2 = 0;
        }
        if (u2 == 0 && s2 == 0) {
            return false;
        }
        layoutManager.f601b.r(s2, u2);
        return true;
    }
}
