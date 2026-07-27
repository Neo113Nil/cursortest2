package L;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import w.C0264b;
import x.C0292h;

/* loaded from: classes.dex */
public final class J extends C0264b {

    /* renamed from: d, reason: collision with root package name */
    public final K f490d;

    public J(K k2) {
        this.f490d = k2;
    }

    @Override // w.C0264b
    public final void b(View view, C0292h c0292h) {
        this.f3050a.onInitializeAccessibilityNodeInfo(view, c0292h.f3088a);
        K k2 = this.f490d;
        if (k2.f491d.l()) {
            return;
        }
        RecyclerView recyclerView = k2.f491d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // w.C0264b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        K k2 = this.f490d;
        if (!k2.f491d.l()) {
            RecyclerView recyclerView = k2.f491d;
            if (recyclerView.getLayoutManager() != null) {
                D d2 = recyclerView.getLayoutManager().f601b.f1592e;
            }
        }
        return false;
    }
}
