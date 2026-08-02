package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z0;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;

/* loaded from: classes14.dex */
public final class t2l extends z0 {
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ DivPagerView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2l(RecyclerView recyclerView, DivPagerView divPagerView) {
        super(recyclerView);
        this.c = recyclerView;
        this.w = divPagerView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        View wrapperFor;
        RecyclerView recyclerView;
        int childAdapterPosition;
        if (accessibilityEvent.getEventType() == 32768) {
            DivPagerView divPagerView = this.w;
            wrapperFor = divPagerView.getWrapperFor(view);
            if (wrapperFor != null && divPagerView.getCurrentItem$div_release() != (childAdapterPosition = (recyclerView = this.c).getChildAdapterPosition(wrapperFor)) && childAdapterPosition != -1) {
                recyclerView.performAccessibilityAction(childAdapterPosition > divPagerView.getCurrentItem$div_release() ? 4096 : 8192, null);
            }
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
