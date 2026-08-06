package g;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.watchfacestudio.spraktum.R;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3099a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3102d;

    /* renamed from: e, reason: collision with root package name */
    public View f3103e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3105g;

    /* renamed from: h, reason: collision with root package name */
    public o f3106h;

    /* renamed from: i, reason: collision with root package name */
    public l f3107i;

    /* renamed from: j, reason: collision with root package name */
    public m f3108j;

    /* renamed from: f, reason: collision with root package name */
    public int f3104f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f3109k = new m(this);

    public n(int i2, Context context, View view, j jVar, boolean z2) {
        this.f3099a = context;
        this.f3100b = jVar;
        this.f3103e = view;
        this.f3101c = z2;
        this.f3102d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f3107i == null) {
            Context context = this.f3099a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g(context, this.f3103e, this.f3102d, this.f3101c);
            } else {
                View view = this.f3103e;
                Context context2 = this.f3099a;
                boolean z2 = this.f3101c;
                sVar = new s(this.f3102d, context2, view, this.f3100b, z2);
            }
            sVar.l(this.f3100b);
            sVar.r(this.f3109k);
            sVar.n(this.f3103e);
            sVar.d(this.f3106h);
            sVar.o(this.f3105g);
            sVar.p(this.f3104f);
            this.f3107i = sVar;
        }
        return this.f3107i;
    }

    public final boolean b() {
        l lVar = this.f3107i;
        return lVar != null && lVar.i();
    }

    public void c() {
        this.f3107i = null;
        m mVar = this.f3108j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        l a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f3104f;
            View view = this.f3103e;
            Field field = x.f8596a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f3103e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f3099a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3097a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.c();
    }
}
