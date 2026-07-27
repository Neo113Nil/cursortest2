package g;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.icedrifter.arcticquest.R;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2012a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2015d;

    /* renamed from: e, reason: collision with root package name */
    public View f2016e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2018g;

    /* renamed from: h, reason: collision with root package name */
    public o f2019h;

    /* renamed from: i, reason: collision with root package name */
    public l f2020i;

    /* renamed from: j, reason: collision with root package name */
    public m f2021j;

    /* renamed from: f, reason: collision with root package name */
    public int f2017f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f2022k = new m(this);

    public n(int i2, Context context, View view, j jVar, boolean z2) {
        this.f2012a = context;
        this.f2013b = jVar;
        this.f2016e = view;
        this.f2014c = z2;
        this.f2015d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f2020i == null) {
            Context context = this.f2012a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new ViewOnKeyListenerC0147g(context, this.f2016e, this.f2015d, this.f2014c);
            } else {
                View view = this.f2016e;
                Context context2 = this.f2012a;
                boolean z2 = this.f2014c;
                sVar = new s(this.f2015d, context2, view, this.f2013b, z2);
            }
            sVar.l(this.f2013b);
            sVar.r(this.f2022k);
            sVar.n(this.f2016e);
            sVar.g(this.f2019h);
            sVar.o(this.f2018g);
            sVar.p(this.f2017f);
            this.f2020i = sVar;
        }
        return this.f2020i;
    }

    public final boolean b() {
        l lVar = this.f2020i;
        return lVar != null && lVar.c();
    }

    public void c() {
        this.f2020i = null;
        m mVar = this.f2021j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        l a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f2017f;
            View view = this.f2016e;
            Field field = x.f3069a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2016e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f2012a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2010f = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.f();
    }
}
