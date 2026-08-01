package t0;

import O.C0323b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3675oP;

/* renamed from: t0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5004T extends C0323b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f40610d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.b f40611e;

    public C5004T(RecyclerView recyclerView) {
        this.f40610d = recyclerView;
        a0.b bVar = this.f40611e;
        if (bVar != null) {
            this.f40611e = bVar;
        } else {
            this.f40611e = new a0.b(this);
        }
    }

    @Override // O.C0323b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f40610d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // O.C0323b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f40610d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC4990E layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f40541b;
        C3675oP c3675oP = recyclerView2.f5264u;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f40541b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f40541b.canScrollVertically(1) || layoutManager.f40541b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C5000O c5000o = recyclerView2.f5227I0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(c3675oP, c5000o), layoutManager.x(c3675oP, c5000o), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // O.C0323b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i, Bundle bundle) {
        int G7;
        int E8;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f40610d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            AbstractC4990E layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f40541b;
            C3675oP c3675oP = recyclerView2.f5264u;
            if (i == 4096) {
                G7 = recyclerView2.canScrollVertically(1) ? (layoutManager.f40553o - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f40541b.canScrollHorizontally(1)) {
                    E8 = (layoutManager.f40552n - layoutManager.E()) - layoutManager.F();
                    if (G7 == 0) {
                    }
                    layoutManager.f40541b.Z(E8, G7, true);
                    return true;
                }
                E8 = 0;
                if (G7 == 0) {
                }
                layoutManager.f40541b.Z(E8, G7, true);
                return true;
            }
            if (i != 8192) {
                E8 = 0;
                G7 = 0;
            } else {
                G7 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f40553o - layoutManager.G()) - layoutManager.D()) : 0;
                if (layoutManager.f40541b.canScrollHorizontally(-1)) {
                    E8 = -((layoutManager.f40552n - layoutManager.E()) - layoutManager.F());
                }
                E8 = 0;
            }
            if (G7 == 0 || E8 != 0) {
                layoutManager.f40541b.Z(E8, G7, true);
                return true;
            }
        }
        return false;
    }
}
