package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.icefishingapp.icefishing.C5275R;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38870a;

    /* renamed from: b, reason: collision with root package name */
    public final m f38871b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38872c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38873d;

    /* renamed from: e, reason: collision with root package name */
    public View f38874e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38876g;

    /* renamed from: h, reason: collision with root package name */
    public x f38877h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public v f38878j;

    /* renamed from: f, reason: collision with root package name */
    public int f38875f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f38879k = new v(this);

    public w(int i, Context context, View view, m mVar, boolean z3) {
        this.f38870a = context;
        this.f38871b = mVar;
        this.f38874e = view;
        this.f38872c = z3;
        this.f38873d = i;
    }

    public final u a() {
        u viewOnKeyListenerC4642D;
        if (this.i == null) {
            Context context = this.f38870a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(C5275R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC4642D = new ViewOnKeyListenerC4650g(context, this.f38874e, this.f38873d, this.f38872c);
            } else {
                View view = this.f38874e;
                Context context2 = this.f38870a;
                boolean z3 = this.f38872c;
                viewOnKeyListenerC4642D = new ViewOnKeyListenerC4642D(this.f38873d, context2, view, this.f38871b, z3);
            }
            viewOnKeyListenerC4642D.k(this.f38871b);
            viewOnKeyListenerC4642D.q(this.f38879k);
            viewOnKeyListenerC4642D.m(this.f38874e);
            viewOnKeyListenerC4642D.g(this.f38877h);
            viewOnKeyListenerC4642D.n(this.f38876g);
            viewOnKeyListenerC4642D.o(this.f38875f);
            this.i = viewOnKeyListenerC4642D;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.i = null;
        v vVar = this.f38878j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i, int i6, boolean z3, boolean z6) {
        u a9 = a();
        a9.r(z6);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f38875f, this.f38874e.getLayoutDirection()) & 7) == 5) {
                i -= this.f38874e.getWidth();
            }
            a9.p(i);
            a9.s(i6);
            int i9 = (int) ((this.f38870a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a9.f38868n = new Rect(i - i9, i6 - i9, i + i9, i6 + i9);
        }
        a9.show();
    }
}
