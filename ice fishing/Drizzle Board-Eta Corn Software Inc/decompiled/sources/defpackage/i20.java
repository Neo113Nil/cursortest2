package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i20 extends Mq3SeTnW {
    public final h20 VgvYg0wo;
    public final RecyclerView wxUZMvaN;

    public i20(RecyclerView recyclerView) {
        this.wxUZMvaN = recyclerView;
        h20 h20Var = this.VgvYg0wo;
        if (h20Var != null) {
            this.VgvYg0wo = h20Var;
        } else {
            this.VgvYg0wo = new h20(this);
        }
    }

    @Override // defpackage.Mq3SeTnW
    public final void MdtA4re8(View view, AccessibilityEvent accessibilityEvent) {
        super.MdtA4re8(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.wxUZMvaN.ytu5o6f4()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().ZyZthT5G(accessibilityEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // defpackage.Mq3SeTnW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b2ZJblxo(View view, int i, Bundle bundle) {
        int SgZGMMPL;
        int Mq3SeTnW;
        if (super.b2ZJblxo(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.wxUZMvaN;
        if (!recyclerView.ytu5o6f4() && recyclerView.getLayoutManager() != null) {
            t10 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.NCTxEWno;
            z10 z10Var = recyclerView2.MdtA4re8;
            if (i == 4096) {
                SgZGMMPL = recyclerView2.canScrollVertically(1) ? (layoutManager.ygLcUYwZ - layoutManager.SgZGMMPL()) - layoutManager.i7xS8jrb() : 0;
                if (layoutManager.NCTxEWno.canScrollHorizontally(1)) {
                    Mq3SeTnW = (layoutManager.OnDfzHZD - layoutManager.Mq3SeTnW()) - layoutManager.euDDoUNr();
                    if (SgZGMMPL == 0) {
                    }
                    layoutManager.NCTxEWno.bvfAo0eO(Mq3SeTnW, SgZGMMPL, true);
                    return true;
                }
                Mq3SeTnW = 0;
                if (SgZGMMPL == 0) {
                }
                layoutManager.NCTxEWno.bvfAo0eO(Mq3SeTnW, SgZGMMPL, true);
                return true;
            }
            if (i != 8192) {
                SgZGMMPL = 0;
                Mq3SeTnW = 0;
            } else {
                SgZGMMPL = recyclerView2.canScrollVertically(-1) ? -((layoutManager.ygLcUYwZ - layoutManager.SgZGMMPL()) - layoutManager.i7xS8jrb()) : 0;
                if (layoutManager.NCTxEWno.canScrollHorizontally(-1)) {
                    Mq3SeTnW = -((layoutManager.OnDfzHZD - layoutManager.Mq3SeTnW()) - layoutManager.euDDoUNr());
                }
                Mq3SeTnW = 0;
            }
            if (SgZGMMPL == 0 || Mq3SeTnW != 0) {
                layoutManager.NCTxEWno.bvfAo0eO(Mq3SeTnW, SgZGMMPL, true);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.Mq3SeTnW
    public final void wxUZMvaN(View view, nSmgoSB5 nsmgosb5) {
        AccessibilityNodeInfo accessibilityNodeInfo = nsmgosb5.qoPGr6Ce;
        this.qoPGr6Ce.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.wxUZMvaN;
        if (recyclerView.ytu5o6f4() || recyclerView.getLayoutManager() == null) {
            return;
        }
        t10 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.NCTxEWno;
        z10 z10Var = recyclerView2.MdtA4re8;
        d20 d20Var = recyclerView2.pP9Y2m6O;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.NCTxEWno.canScrollHorizontally(-1)) {
            nsmgosb5.qoPGr6Ce(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.NCTxEWno.canScrollVertically(1) || layoutManager.NCTxEWno.canScrollHorizontally(1)) {
            nsmgosb5.qoPGr6Ce(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.pRiPUEwG(z10Var, d20Var), layoutManager.FySoLYna(z10Var, d20Var), false, 0));
    }
}
