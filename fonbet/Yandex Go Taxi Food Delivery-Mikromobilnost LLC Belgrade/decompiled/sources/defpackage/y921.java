package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public abstract class y921 {
    public static final int a(YbButtonView ybButtonView) {
        ViewGroup.LayoutParams layoutParams = ybButtonView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        Integer valueOf = layoutParams2 != null ? Integer.valueOf(layoutParams2.goneStartMargin) : null;
        Integer num = (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) ? valueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
