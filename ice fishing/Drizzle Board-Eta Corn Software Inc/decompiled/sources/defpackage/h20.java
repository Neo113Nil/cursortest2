package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h20 extends Mq3SeTnW {
    public final WeakHashMap VgvYg0wo = new WeakHashMap();
    public final i20 wxUZMvaN;

    public h20(i20 i20Var) {
        this.wxUZMvaN = i20Var;
    }

    @Override // defpackage.Mq3SeTnW
    public final void MdtA4re8(View view, AccessibilityEvent accessibilityEvent) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        if (mq3SeTnW != null) {
            mq3SeTnW.MdtA4re8(view, accessibilityEvent);
        } else {
            super.MdtA4re8(view, accessibilityEvent);
        }
    }

    @Override // defpackage.Mq3SeTnW
    public final tg0 NCTxEWno(View view) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        return mq3SeTnW != null ? mq3SeTnW.NCTxEWno(view) : super.NCTxEWno(view);
    }

    @Override // defpackage.Mq3SeTnW
    public final boolean P7K7Inc8(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(viewGroup);
        return mq3SeTnW != null ? mq3SeTnW.P7K7Inc8(viewGroup, view, accessibilityEvent) : this.qoPGr6Ce.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.Mq3SeTnW
    public final void Qr9iLBAD(View view, int i) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        if (mq3SeTnW != null) {
            mq3SeTnW.Qr9iLBAD(view, i);
        } else {
            super.Qr9iLBAD(view, i);
        }
    }

    @Override // defpackage.Mq3SeTnW
    public final void VgvYg0wo(View view, AccessibilityEvent accessibilityEvent) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        if (mq3SeTnW != null) {
            mq3SeTnW.VgvYg0wo(view, accessibilityEvent);
        } else {
            super.VgvYg0wo(view, accessibilityEvent);
        }
    }

    @Override // defpackage.Mq3SeTnW
    public final boolean b2ZJblxo(View view, int i, Bundle bundle) {
        i20 i20Var = this.wxUZMvaN;
        RecyclerView recyclerView = i20Var.wxUZMvaN;
        RecyclerView recyclerView2 = i20Var.wxUZMvaN;
        if (recyclerView.ytu5o6f4() || recyclerView2.getLayoutManager() == null) {
            return super.b2ZJblxo(view, i, bundle);
        }
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        if (mq3SeTnW != null) {
            if (mq3SeTnW.b2ZJblxo(view, i, bundle)) {
                return true;
            }
        } else if (super.b2ZJblxo(view, i, bundle)) {
            return true;
        }
        z10 z10Var = recyclerView2.getLayoutManager().NCTxEWno.MdtA4re8;
        return false;
    }

    @Override // defpackage.Mq3SeTnW
    public final void jb9XjC4I(View view, AccessibilityEvent accessibilityEvent) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        if (mq3SeTnW != null) {
            mq3SeTnW.jb9XjC4I(view, accessibilityEvent);
        } else {
            super.jb9XjC4I(view, accessibilityEvent);
        }
    }

    @Override // defpackage.Mq3SeTnW
    public final boolean qoPGr6Ce(View view, AccessibilityEvent accessibilityEvent) {
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        return mq3SeTnW != null ? mq3SeTnW.qoPGr6Ce(view, accessibilityEvent) : this.qoPGr6Ce.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.Mq3SeTnW
    public final void wxUZMvaN(View view, nSmgoSB5 nsmgosb5) {
        AccessibilityNodeInfo accessibilityNodeInfo = nsmgosb5.qoPGr6Ce;
        i20 i20Var = this.wxUZMvaN;
        RecyclerView recyclerView = i20Var.wxUZMvaN;
        RecyclerView recyclerView2 = i20Var.wxUZMvaN;
        boolean ytu5o6f4 = recyclerView.ytu5o6f4();
        View.AccessibilityDelegate accessibilityDelegate = this.qoPGr6Ce;
        if (ytu5o6f4 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().KRabZ4CU(view, nsmgosb5);
        Mq3SeTnW mq3SeTnW = (Mq3SeTnW) this.VgvYg0wo.get(view);
        if (mq3SeTnW != null) {
            mq3SeTnW.wxUZMvaN(view, nsmgosb5);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }
}
