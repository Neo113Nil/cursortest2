package L;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import w.C0270b;
import x.C0298h;

/* loaded from: classes.dex */
public final class J extends C0270b {

    /* renamed from: d, reason: collision with root package name */
    public final K f568d;

    public J(K k2) {
        this.f568d = k2;
    }

    @Override // w.C0270b
    public final void b(View view, C0298h c0298h) {
        this.f3045a.onInitializeAccessibilityNodeInfo(view, c0298h.f3083a);
        K k2 = this.f568d;
        if (k2.f569d.l()) {
            return;
        }
        RecyclerView recyclerView = k2.f569d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // w.C0270b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        K k2 = this.f568d;
        if (!k2.f569d.l()) {
            RecyclerView recyclerView = k2.f569d;
            if (recyclerView.getLayoutManager() != null) {
                D d2 = recyclerView.getLayoutManager().f679b.f1585f;
            }
        }
        return false;
    }
}
