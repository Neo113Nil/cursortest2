package P;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import y.C1069b;
import z.C1096h;

/* loaded from: classes.dex */
public final class J extends C1069b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1273d;

    public J(RecyclerView recyclerView) {
        this.f1273d = recyclerView;
        new I(this);
    }

    @Override // y.C1069b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f1273d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // y.C1069b
    public final void b(View view, C1096h c1096h) {
        View.AccessibilityDelegate accessibilityDelegate = this.f8572a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1096h.f8618a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f1273d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1373b;
        C c2 = recyclerView2.f2549a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1373b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1373b.canScrollVertically(1) || layoutManager.f1373b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(Base64Utils.IO_BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        F f2 = recyclerView2.f2554c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(c2, f2), layoutManager.q(c2, f2), false, 0));
    }

    @Override // y.C1069b
    public final boolean c(View view, int i2, Bundle bundle) {
        int u2;
        int s2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1273d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        w layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1373b;
        C c2 = recyclerView2.f2549a;
        if (i2 == 4096) {
            u2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f1378g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f1373b.canScrollHorizontally(1)) {
                s2 = (layoutManager.f1377f - layoutManager.s()) - layoutManager.t();
            }
            s2 = 0;
        } else if (i2 != 8192) {
            s2 = 0;
            u2 = 0;
        } else {
            u2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1378g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f1373b.canScrollHorizontally(-1)) {
                s2 = -((layoutManager.f1377f - layoutManager.s()) - layoutManager.t());
            }
            s2 = 0;
        }
        if (u2 == 0 && s2 == 0) {
            return false;
        }
        layoutManager.f1373b.r(s2, u2);
        return true;
    }
}
