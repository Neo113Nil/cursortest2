package k0;

import O.C0026b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d0 extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f3473d;
    public final c0 e;

    public d0(RecyclerView recyclerView) {
        this.f3473d = recyclerView;
        c0 c0Var = this.e;
        if (c0Var != null) {
            this.e = c0Var;
        } else {
            this.e = new c0(this);
        }
    }

    @Override // O.C0026b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f3473d.N()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().V(accessibilityEvent);
        }
    }

    @Override // O.C0026b
    public final void d(View view, P.f fVar) {
        this.f785a.onInitializeAccessibilityNodeInfo(view, fVar.f891a);
        RecyclerView recyclerView = this.f3473d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        K layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3385b;
        layoutManager.W(recyclerView2.f2143c, recyclerView2.f2151g0, fVar);
    }

    @Override // O.C0026b
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E2;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3473d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        K layoutManager = recyclerView.getLayoutManager();
        Q q2 = layoutManager.f3385b.f2143c;
        int i2 = layoutManager.f3395o;
        int i3 = layoutManager.f3394n;
        Rect rect = new Rect();
        if (layoutManager.f3385b.getMatrix().isIdentity() && layoutManager.f3385b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            G2 = layoutManager.f3385b.canScrollVertically(1) ? (i2 - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.f3385b.canScrollHorizontally(1)) {
                E2 = (i3 - layoutManager.E()) - layoutManager.F();
            }
            E2 = 0;
        } else if (i != 8192) {
            G2 = 0;
            E2 = 0;
        } else {
            G2 = layoutManager.f3385b.canScrollVertically(-1) ? -((i2 - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.f3385b.canScrollHorizontally(-1)) {
                E2 = -((i3 - layoutManager.E()) - layoutManager.F());
            }
            E2 = 0;
        }
        if (G2 == 0 && E2 == 0) {
            return false;
        }
        layoutManager.f3385b.h0(E2, G2, true);
        return true;
    }
}
