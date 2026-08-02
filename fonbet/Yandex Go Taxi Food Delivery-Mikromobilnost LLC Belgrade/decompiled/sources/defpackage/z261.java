package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes14.dex */
public final class z261 implements zo31 {
    public final LinearLayout a;
    public final YbButtonView b;

    public z261(LinearLayout linearLayout, YbButtonView ybButtonView) {
        this.a = linearLayout;
        this.b = ybButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
