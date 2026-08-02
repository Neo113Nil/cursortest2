package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes11.dex */
public abstract class sme {
    public static final void a(ConstraintLayout constraintLayout) {
        int generateViewId;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() == -1) {
                if (kzy0.a == Thread.currentThread()) {
                    generateViewId = xva1.a;
                    xva1.a = (generateViewId == 1 ? 16777215 : generateViewId) - 1;
                } else {
                    generateViewId = View.generateViewId();
                }
                childAt.setId(generateViewId);
            }
        }
    }
}
