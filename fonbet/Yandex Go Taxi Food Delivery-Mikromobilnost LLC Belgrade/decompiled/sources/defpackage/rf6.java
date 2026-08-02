package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes9.dex */
public final class rf6 {
    public static final CoordinatorLayout.a a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        }
        return null;
    }
}
