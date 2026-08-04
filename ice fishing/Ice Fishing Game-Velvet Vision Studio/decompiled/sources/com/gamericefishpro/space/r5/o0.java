package com.gamericefishpro.space.r5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends com.gamericefishpro.space.d4.b {
    public final RecyclerView v;
    public final n0 w;

    public o0(RecyclerView recyclerView) {
        this.v = recyclerView;
        n0 n0Var = this.w;
        if (n0Var != null) {
            this.w = n0Var;
        } else {
            this.w = new n0(this);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.v.u()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().M(accessibilityEvent);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void d(View view, com.gamericefishpro.space.e4.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        this.d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.v;
        if (recyclerView.u() || recyclerView.getLayoutManager() == null) {
            return;
        }
        b0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        com.gamericefishpro.space.bb.a aVar = recyclerView2.d;
        j0 j0Var = recyclerView2.s0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            hVar.a(8192);
            hVar.j(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            hVar.a(4096);
            hVar.j(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.C(aVar, j0Var), layoutManager.s(aVar, j0Var), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.gamericefishpro.space.d4.b
    public final boolean g(View view, int i, Bundle bundle) {
        int iZ;
        int iX;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.v;
        if (!recyclerView.u() && recyclerView.getLayoutManager() != null) {
            b0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            com.gamericefishpro.space.bb.a aVar = recyclerView2.d;
            if (i == 4096) {
                iZ = recyclerView2.canScrollVertically(1) ? (layoutManager.j - layoutManager.z()) - layoutManager.w() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    iX = (layoutManager.i - layoutManager.x()) - layoutManager.y();
                } else {
                    iX = 0;
                }
            } else if (i != 8192) {
                iX = 0;
                iZ = 0;
            } else {
                iZ = recyclerView2.canScrollVertically(-1) ? -((layoutManager.j - layoutManager.z()) - layoutManager.w()) : 0;
                if (layoutManager.b.canScrollHorizontally(-1)) {
                    iX = -((layoutManager.i - layoutManager.x()) - layoutManager.y());
                } else {
                    iX = 0;
                }
            }
            if (iZ != 0 || iX != 0) {
                layoutManager.b.E(iX, iZ, true);
                return true;
            }
        }
        return false;
    }
}
