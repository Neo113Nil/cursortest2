package com.gamericefishpro.space.r5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends com.gamericefishpro.space.d4.b {
    public final o0 v;
    public final WeakHashMap w = new WeakHashMap();

    public n0(o0 o0Var) {
        this.v = o0Var;
    }

    @Override // com.gamericefishpro.space.d4.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // com.gamericefishpro.space.d4.b
    public final com.gamericefishpro.space.vb.c b(View view) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void d(View view, com.gamericefishpro.space.e4.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        o0 o0Var = this.v;
        RecyclerView recyclerView = o0Var.v;
        RecyclerView recyclerView2 = o0Var.v;
        boolean zU = recyclerView.u();
        View.AccessibilityDelegate accessibilityDelegate = this.d;
        if (zU || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().N(view, hVar);
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        if (bVar != null) {
            bVar.d(view, hVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // com.gamericefishpro.space.d4.b
    public final boolean g(View view, int i, Bundle bundle) {
        o0 o0Var = this.v;
        RecyclerView recyclerView = o0Var.v;
        RecyclerView recyclerView2 = o0Var.v;
        if (recyclerView.u() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        com.gamericefishpro.space.bb.a aVar = recyclerView2.getLayoutManager().b.d;
        return false;
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void h(View view, int i) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        com.gamericefishpro.space.d4.b bVar = (com.gamericefishpro.space.d4.b) this.w.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
