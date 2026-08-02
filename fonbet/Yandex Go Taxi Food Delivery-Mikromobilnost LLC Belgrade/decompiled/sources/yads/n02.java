package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import defpackage.bo31;
import defpackage.f871;
import defpackage.kp81;
import defpackage.ny61;

/* loaded from: classes7.dex */
public final class n02 implements View.OnTouchListener, View.OnClickListener {
    public final cu a;
    public final f871 b;

    public n02(Context context, wy1 wy1Var) {
        cu cuVar = new cu(context, wy1Var);
        if (f871.d == null) {
            synchronized (f871.c) {
                if (f871.d == null) {
                    f871.d = new f871();
                }
            }
        }
        f871 f871Var = f871.d;
        if (f871Var == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.a = cuVar;
        this.b = f871Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f871 f871Var = this.b;
        f871Var.getClass();
        if (((view instanceof TextView) || (view instanceof kp81)) && motionEvent.getAction() == 1) {
            if (!f871Var.b) {
                view.setAlpha(view.getAlpha() / 2.0f);
                f871Var.b = true;
            }
            f871Var.a.postDelayed(new bo31(26, f871Var, view), 100L);
        }
        return this.a.onTouch(view, motionEvent);
    }
}
