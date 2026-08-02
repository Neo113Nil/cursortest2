package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class qpn extends a {
    public final RecyclerView d;
    public final ppn e;

    public qpn(RecyclerView recyclerView) {
        this.d = recyclerView;
        a j = j();
        if (j == null || !(j instanceof ppn)) {
            this.e = new ppn(this);
        } else {
            this.e = (ppn) j;
        }
    }

    @Override // androidx.core.view.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.d0()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().v0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void d(View view, vb vbVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.d0() || recyclerView.getLayoutManager() == null) {
            return;
        }
        yon layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.w0(recyclerView2.c, recyclerView2.N0, vbVar);
    }

    @Override // androidx.core.view.a
    public boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.d0() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().K0(i, bundle);
    }

    public a j() {
        return this.e;
    }
}
