package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3771a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0229m f3772b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3773c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3774d;
    public View e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3776g;

    /* renamed from: h, reason: collision with root package name */
    public x f3777h;
    public u i;
    public v j;

    /* renamed from: f, reason: collision with root package name */
    public int f3775f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f3778k = new v(this);

    public w(int i, Context context, View view, MenuC0229m menuC0229m, boolean z2) {
        this.f3771a = context;
        this.f3772b = menuC0229m;
        this.e = view;
        this.f3773c = z2;
        this.f3774d = i;
    }

    public final u a() {
        u viewOnKeyListenerC0215D;
        if (this.i == null) {
            Context context = this.f3771a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0215D = new ViewOnKeyListenerC0223g(context, this.e, this.f3774d, this.f3773c);
            } else {
                View view = this.e;
                Context context2 = this.f3771a;
                boolean z2 = this.f3773c;
                viewOnKeyListenerC0215D = new ViewOnKeyListenerC0215D(this.f3774d, context2, view, this.f3772b, z2);
            }
            viewOnKeyListenerC0215D.o(this.f3772b);
            viewOnKeyListenerC0215D.u(this.f3778k);
            viewOnKeyListenerC0215D.q(this.e);
            viewOnKeyListenerC0215D.h(this.f3777h);
            viewOnKeyListenerC0215D.r(this.f3776g);
            viewOnKeyListenerC0215D.s(this.f3775f);
            this.i = viewOnKeyListenerC0215D;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.i = null;
        v vVar = this.j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        u a2 = a();
        a2.v(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3775f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a2.t(i);
            a2.w(i2);
            int i3 = (int) ((this.f3771a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3769a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.c();
    }
}
