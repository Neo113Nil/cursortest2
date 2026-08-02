package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.IceFishing.LiveIceFishing.C5248R;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38797a;

    /* renamed from: b, reason: collision with root package name */
    public final m f38798b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38799c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38800d;

    /* renamed from: e, reason: collision with root package name */
    public View f38801e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38803g;

    /* renamed from: h, reason: collision with root package name */
    public x f38804h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public v f38805j;

    /* renamed from: f, reason: collision with root package name */
    public int f38802f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f38806k = new v(this);

    public w(int i, Context context, View view, m mVar, boolean z6) {
        this.f38797a = context;
        this.f38798b = mVar;
        this.f38801e = view;
        this.f38799c = z6;
        this.f38800d = i;
    }

    public final u a() {
        u viewOnKeyListenerC4653D;
        if (this.i == null) {
            Context context = this.f38797a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(C5248R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC4653D = new ViewOnKeyListenerC4661g(context, this.f38801e, this.f38800d, this.f38799c);
            } else {
                View view = this.f38801e;
                Context context2 = this.f38797a;
                boolean z6 = this.f38799c;
                viewOnKeyListenerC4653D = new ViewOnKeyListenerC4653D(this.f38800d, context2, view, this.f38798b, z6);
            }
            viewOnKeyListenerC4653D.k(this.f38798b);
            viewOnKeyListenerC4653D.q(this.f38806k);
            viewOnKeyListenerC4653D.m(this.f38801e);
            viewOnKeyListenerC4653D.g(this.f38804h);
            viewOnKeyListenerC4653D.n(this.f38803g);
            viewOnKeyListenerC4653D.o(this.f38802f);
            this.i = viewOnKeyListenerC4653D;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.i = null;
        v vVar = this.f38805j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i, int i4, boolean z6, boolean z9) {
        u a9 = a();
        a9.r(z9);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f38802f, this.f38801e.getLayoutDirection()) & 7) == 5) {
                i -= this.f38801e.getWidth();
            }
            a9.p(i);
            a9.s(i4);
            int i6 = (int) ((this.f38797a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a9.f38795n = new Rect(i - i6, i4 - i6, i + i6, i4 + i6);
        }
        a9.show();
    }
}
