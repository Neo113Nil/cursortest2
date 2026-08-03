package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import h3.w;
import java.lang.reflect.Field;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3738a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3739b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3740c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3741d;

    /* renamed from: e, reason: collision with root package name */
    public View f3742e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3744g;

    /* renamed from: h, reason: collision with root package name */
    public m f3745h;

    /* renamed from: i, reason: collision with root package name */
    public j f3746i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3747j;

    /* renamed from: f, reason: collision with root package name */
    public int f3743f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final k f3748k = new k(this);

    public l(Context context, h hVar, View view, boolean z10, int i10, int i11) {
        this.f3738a = context;
        this.f3739b = hVar;
        this.f3742e = view;
        this.f3740c = z10;
        this.f3741d = i10;
    }

    public final j a() {
        j qVar;
        if (this.f3746i == null) {
            Context context = this.f3738a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                qVar = new e(context, this.f3742e, this.f3741d, this.f3740c);
            } else {
                qVar = new q(this.f3738a, this.f3739b, this.f3742e, this.f3741d, this.f3740c);
            }
            qVar.l(this.f3739b);
            qVar.r(this.f3748k);
            qVar.n(this.f3742e);
            qVar.e(this.f3745h);
            qVar.o(this.f3744g);
            qVar.p(this.f3743f);
            this.f3746i = qVar;
        }
        return this.f3746i;
    }

    public final boolean b() {
        j jVar = this.f3746i;
        return jVar != null && jVar.j();
    }

    public void c() {
        this.f3746i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f3747j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        j a6 = a();
        a6.s(z11);
        if (z10) {
            int i12 = this.f3743f;
            View view = this.f3742e;
            Field field = w.f2829a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f3742e.getWidth();
            }
            a6.q(i10);
            a6.t(i11);
            int i13 = (int) ((this.f3738a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a6.f3736g = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a6.b();
    }
}
