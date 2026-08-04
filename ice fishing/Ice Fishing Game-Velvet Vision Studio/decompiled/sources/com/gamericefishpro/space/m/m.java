package com.gamericefishpro.space.m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class m {
    public final Context a;
    public final i b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public n h;
    public k i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final l k = new l(this);

    public m(Context context, i iVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = iVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final k a() {
        k rVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                rVar = new f(context, this.e, this.d, this.c);
            } else {
                rVar = new r(this.a, this.b, this.e, this.d, this.c);
            }
            rVar.l(this.b);
            rVar.r(this.k);
            rVar.n(this.e);
            rVar.g(this.h);
            rVar.o(this.g);
            rVar.p(this.f);
            this.i = rVar;
        }
        return this.i;
    }

    public final boolean b() {
        k kVar = this.i;
        return kVar != null && kVar.j();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        k kVarA = a();
        kVarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            kVarA.q(i);
            kVarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarA.d = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        kVarA.a();
    }
}
