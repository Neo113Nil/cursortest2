package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.epk0;
import defpackage.ew81;
import defpackage.kgx;
import defpackage.r581;
import defpackage.uv71;
import defpackage.xj61;
import defpackage.zy11;

/* loaded from: classes7.dex */
public final class iw1 implements View.OnAttachStateChangeListener {
    public final ew81 a;
    public final long b;

    public iw1(ew81 ew81Var, long j) {
        this.a = ew81Var;
        this.b = j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        zy11 zy11Var;
        ew81 ew81Var = this.a;
        long j = this.b;
        if (j <= 0 || !ew81Var.e) {
            return;
        }
        ew81Var.a();
        r581 r581Var = ew81Var.c;
        kgx kgxVar = ew81.f[0];
        ViewPager2 viewPager2 = (ViewPager2) r581Var.a.get();
        if (viewPager2 != null) {
            xj61 xj61Var = new xj61(viewPager2, ew81Var.a, ew81Var.b);
            uv71 uv71Var = new uv71();
            ew81Var.d = uv71Var;
            if (xj61Var.a == ts.b) {
                uv71Var.a.postDelayed(new epk0(uv71Var, j, xj61Var), j);
            }
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            ew81Var.a();
            ew81Var.e = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a();
    }
}
