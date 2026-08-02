package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.x071;

/* loaded from: classes7.dex */
public final class e42 extends FrameLayout {
    public final yl2 a;
    public final x071 b;

    /* JADX WARN: Multi-variable type inference failed */
    public e42(Context context, yl2 yl2Var, x071 x071Var) {
        super(context);
        this.a = yl2Var;
        this.b = x071Var;
        addView(yl2Var);
        if (x071Var == 0 || !(x071Var instanceof View)) {
            return;
        }
        addView((View) x071Var);
    }
}
