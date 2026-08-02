package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class ayh {
    public final Context a;
    public final hxh b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public fyh h;
    public yxh i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final zxh k = new zxh(this);

    public ayh(Context context, hxh hxhVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = hxhVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final yxh a() {
        yxh ebrVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                ebrVar = new q54(context2, this.e, this.d, this.c);
            } else {
                ebrVar = new ebr(context2, this.b, this.e, this.d, this.c);
            }
            ebrVar.k(this.b);
            ebrVar.r(this.k);
            ebrVar.m(this.e);
            ebrVar.d(this.h);
            ebrVar.n(this.g);
            ebrVar.o(this.f);
            this.i = ebrVar;
        }
        return this.i;
    }

    public final boolean b() {
        yxh yxhVar = this.i;
        return yxhVar != null && yxhVar.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        yxh a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.f();
    }
}
