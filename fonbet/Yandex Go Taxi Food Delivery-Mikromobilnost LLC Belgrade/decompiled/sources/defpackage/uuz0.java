package defpackage;

import android.view.View;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;

/* loaded from: classes3.dex */
public abstract class uuz0 {
    public static final int a = kp50.r(4);

    public static void a(View view, String str, Tooltip$PreferredGravity tooltip$PreferredGravity, int i, int i2) {
        if ((i2 & 2) != 0) {
            tooltip$PreferredGravity = Tooltip$PreferredGravity.CENTER;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        buz0 buz0Var = new buz0(view.getContext());
        Text.Companion.getClass();
        buz0Var.l(new Text.Constant(str));
        buz0Var.g(tooltip$PreferredGravity);
        buz0Var.l = i;
        buz0Var.p = a;
        buz0Var.o = 12;
        buz0Var.k(Tooltip$PreferredPosition.TOP);
        buz0Var.a().f(view, 0L);
    }
}
