package P;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import y.C1069b;
import z.C1096h;

/* loaded from: classes.dex */
public final class I extends C1069b {

    /* renamed from: d, reason: collision with root package name */
    public final J f1272d;

    public I(J j2) {
        this.f1272d = j2;
    }

    @Override // y.C1069b
    public final void b(View view, C1096h c1096h) {
        this.f8572a.onInitializeAccessibilityNodeInfo(view, c1096h.f8618a);
        J j2 = this.f1272d;
        if (j2.f1273d.l()) {
            return;
        }
        RecyclerView recyclerView = j2.f1273d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // y.C1069b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        J j2 = this.f1272d;
        if (!j2.f1273d.l()) {
            RecyclerView recyclerView = j2.f1273d;
            if (recyclerView.getLayoutManager() != null) {
                C c2 = recyclerView.getLayoutManager().f1373b.f2549a;
            }
        }
        return false;
    }
}
