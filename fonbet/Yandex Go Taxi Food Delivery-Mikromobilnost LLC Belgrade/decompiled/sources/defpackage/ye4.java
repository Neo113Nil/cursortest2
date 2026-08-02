package defpackage;

import android.view.View;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;

/* loaded from: classes.dex */
public final class ye4 {
    public final BackHandlingRecyclerView a;
    public ve4 b;

    public ye4(BackHandlingRecyclerView backHandlingRecyclerView) {
        this.a = backHandlingRecyclerView;
    }

    public final void a() {
        View rootView;
        if (this.b != null) {
            BackHandlingRecyclerView backHandlingRecyclerView = this.a;
            if (backHandlingRecyclerView.hasWindowFocus()) {
                if (backHandlingRecyclerView.isShown()) {
                    backHandlingRecyclerView.performAccessibilityAction(64, null);
                    backHandlingRecyclerView.sendAccessibilityEvent(1);
                } else {
                    if (!backHandlingRecyclerView.isAccessibilityFocused() || (rootView = backHandlingRecyclerView.getRootView()) == null) {
                        return;
                    }
                    rootView.performAccessibilityAction(64, null);
                    rootView.sendAccessibilityEvent(1);
                }
            }
        }
    }
}
