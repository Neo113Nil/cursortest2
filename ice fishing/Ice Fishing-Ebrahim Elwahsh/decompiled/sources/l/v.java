package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39012a;

    /* renamed from: b, reason: collision with root package name */
    public final l f39013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f39014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39015d;

    /* renamed from: e, reason: collision with root package name */
    public View f39016e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39018g;

    /* renamed from: h, reason: collision with root package name */
    public w f39019h;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public u f39020j;

    /* renamed from: f, reason: collision with root package name */
    public int f39017f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final u f39021k = new u(this);

    public v(int i, Context context, View view, l lVar, boolean z8) {
        this.f39012a = context;
        this.f39013b = lVar;
        this.f39016e = view;
        this.f39014c = z8;
        this.f39015d = i;
    }

    public final t a() {
        t viewOnKeyListenerC4671C;
        if (this.i == null) {
            Context context = this.f39012a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(C5284R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC4671C = new ViewOnKeyListenerC4678f(context, this.f39016e, this.f39015d, this.f39014c);
            } else {
                View view = this.f39016e;
                Context context2 = this.f39012a;
                boolean z8 = this.f39014c;
                viewOnKeyListenerC4671C = new ViewOnKeyListenerC4671C(this.f39015d, context2, view, this.f39013b, z8);
            }
            viewOnKeyListenerC4671C.k(this.f39013b);
            viewOnKeyListenerC4671C.q(this.f39021k);
            viewOnKeyListenerC4671C.m(this.f39016e);
            viewOnKeyListenerC4671C.g(this.f39019h);
            viewOnKeyListenerC4671C.n(this.f39018g);
            viewOnKeyListenerC4671C.o(this.f39017f);
            this.i = viewOnKeyListenerC4671C;
        }
        return this.i;
    }

    public final boolean b() {
        t tVar = this.i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.i = null;
        u uVar = this.f39020j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i, int i4, boolean z8, boolean z9) {
        t a9 = a();
        a9.r(z9);
        if (z8) {
            if ((Gravity.getAbsoluteGravity(this.f39017f, this.f39016e.getLayoutDirection()) & 7) == 5) {
                i -= this.f39016e.getWidth();
            }
            a9.p(i);
            a9.s(i4);
            int i9 = (int) ((this.f39012a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a9.f39010n = new Rect(i - i9, i4 - i9, i + i9, i4 + i9);
        }
        a9.show();
    }
}
