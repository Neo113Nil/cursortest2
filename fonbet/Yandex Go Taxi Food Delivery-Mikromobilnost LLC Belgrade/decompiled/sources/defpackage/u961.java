package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.CircleButtonsListView;

/* loaded from: classes14.dex */
public final class u961 implements zo31 {
    public final ConstraintLayout a;
    public final CircleButtonsListView b;

    public u961(ConstraintLayout constraintLayout, CircleButtonsListView circleButtonsListView) {
        this.a = constraintLayout;
        this.b = circleButtonsListView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
