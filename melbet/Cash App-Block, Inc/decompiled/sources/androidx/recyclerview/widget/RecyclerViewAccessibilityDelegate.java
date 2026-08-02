package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;

/* loaded from: classes3.dex */
public final class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public final FailoverFragment.f mItemDelegate;
    public final RecyclerView mRecyclerView;

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        FailoverFragment.f fVar = this.mItemDelegate;
        if (fVar != null) {
            this.mItemDelegate = fVar;
        } else {
            this.mItemDelegate = new FailoverFragment.f(this);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        RecyclerView.LayoutManager layoutManager;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.mRecyclerView.hasPendingAdapterUpdates() || (layoutManager = ((RecyclerView) view).mLayout) == null) {
            return;
        }
        layoutManager.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        RecyclerView.LayoutManager layoutManager;
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView.hasPendingAdapterUpdates() || (layoutManager = recyclerView.mLayout) == null) {
            return;
        }
        RecyclerView recyclerView2 = layoutManager.mRecyclerView;
        layoutManager.onInitializeAccessibilityNodeInfo(recyclerView2.mRecycler, recyclerView2.mState, accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView.hasPendingAdapterUpdates() || (layoutManager = recyclerView.mLayout) == null) {
            return false;
        }
        return layoutManager.performAccessibilityAction(i, bundle);
    }
}
