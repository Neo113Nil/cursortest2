package g;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.icecatchbiger.hookfrostmaster.R;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2020a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2021b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2022c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2023d;

    /* renamed from: e, reason: collision with root package name */
    public View f2024e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2026g;

    /* renamed from: h, reason: collision with root package name */
    public o f2027h;

    /* renamed from: i, reason: collision with root package name */
    public l f2028i;

    /* renamed from: j, reason: collision with root package name */
    public m f2029j;

    /* renamed from: f, reason: collision with root package name */
    public int f2025f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f2030k = new m(this);

    public n(int i2, Context context, View view, j jVar, boolean z2) {
        this.f2020a = context;
        this.f2021b = jVar;
        this.f2024e = view;
        this.f2022c = z2;
        this.f2023d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f2028i == null) {
            Context context = this.f2020a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new ViewOnKeyListenerC0147g(context, this.f2024e, this.f2023d, this.f2022c);
            } else {
                View view = this.f2024e;
                Context context2 = this.f2020a;
                boolean z2 = this.f2022c;
                sVar = new s(this.f2023d, context2, view, this.f2021b, z2);
            }
            sVar.l(this.f2021b);
            sVar.r(this.f2030k);
            sVar.n(this.f2024e);
            sVar.g(this.f2027h);
            sVar.o(this.f2026g);
            sVar.p(this.f2025f);
            this.f2028i = sVar;
        }
        return this.f2028i;
    }

    public final boolean b() {
        l lVar = this.f2028i;
        return lVar != null && lVar.c();
    }

    public void c() {
        this.f2028i = null;
        m mVar = this.f2029j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        l a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f2025f;
            View view = this.f2024e;
            Field field = x.f3074a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2024e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f2020a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2018e = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.f();
    }
}
