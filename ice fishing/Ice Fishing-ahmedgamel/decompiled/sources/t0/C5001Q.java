package t0;

import O.C0328b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3698oP;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5001Q extends C0328b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f40660d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.b f40661e;

    public C5001Q(RecyclerView recyclerView) {
        this.f40660d = recyclerView;
        a0.b bVar = this.f40661e;
        if (bVar != null) {
            this.f40661e = bVar;
        } else {
            this.f40661e = new a0.b(this);
        }
    }

    @Override // O.C0328b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f40660d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // O.C0328b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f40660d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC4987C layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f40591b;
        C3698oP c3698oP = recyclerView2.f5230u;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f40591b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f40591b.canScrollVertically(1) || layoutManager.f40591b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C4997M c4997m = recyclerView2.f5184D0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(c3698oP, c4997m), layoutManager.x(c3698oP, c4997m), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // O.C0328b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i, Bundle bundle) {
        int G2;
        int E8;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f40660d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            AbstractC4987C layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f40591b;
            C3698oP c3698oP = recyclerView2.f5230u;
            if (i == 4096) {
                G2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f40603o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f40591b.canScrollHorizontally(1)) {
                    E8 = (layoutManager.f40602n - layoutManager.E()) - layoutManager.F();
                    if (G2 == 0) {
                    }
                    layoutManager.f40591b.Z(E8, G2, true);
                    return true;
                }
                E8 = 0;
                if (G2 == 0) {
                }
                layoutManager.f40591b.Z(E8, G2, true);
                return true;
            }
            if (i != 8192) {
                E8 = 0;
                G2 = 0;
            } else {
                G2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f40603o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.f40591b.canScrollHorizontally(-1)) {
                    E8 = -((layoutManager.f40602n - layoutManager.E()) - layoutManager.F());
                }
                E8 = 0;
            }
            if (G2 == 0 || E8 != 0) {
                layoutManager.f40591b.Z(E8, G2, true);
                return true;
            }
        }
        return false;
    }
}
