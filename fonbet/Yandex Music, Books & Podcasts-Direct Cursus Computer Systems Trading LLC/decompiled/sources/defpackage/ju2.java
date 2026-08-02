package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class ju2 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final iu2 i;
    public final SnackbarContentLayout j;
    public int k;
    public final eu2 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final AccessibilityManager s;
    public final gu2 t = new gu2(this);
    public static final k5c u = wm0.b;
    public static final LinearInterpolator v = wm0.a;
    public static final k5c w = wm0.d;
    public static final int[] y = {R.attr.snackbarStyle};
    public static final String z = ju2.class.getSimpleName();
    public static final Handler x = new Handler(Looper.getMainLooper(), new du2(0));

    public ju2(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.l = new eu2(this, i);
        if (view == null) {
            xq0.x("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            xq0.x("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        bcx.v(context, bcx.j, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        iu2 iu2Var = (iu2) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = iu2Var;
        iu2Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = iu2Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.b.setTextColor(qgg.W(qgg.N(R.attr.colorSurface, snackbarContentLayout2), actionTextColorAlpha, snackbarContentLayout2.b.getCurrentTextColor()));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(iu2Var.getMaxInlineActionWidth());
        }
        iu2Var.addView(view);
        iu2Var.setAccessibilityLiveRegion(1);
        iu2Var.setImportantForAccessibility(1);
        iu2Var.setFitsSystemWindows(true);
        sld sldVar = new sld(11, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(iu2Var, sldVar);
        wdu.q(iu2Var, new fu2(i, this));
        this.s = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = szf.p0(context, R.attr.motionDurationLong2, 250);
        this.a = szf.p0(context, R.attr.motionDurationLong2, 150);
        this.b = szf.p0(context, R.attr.motionDurationMedium1, 75);
        this.d = szf.q0(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.f = szf.q0(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.e = szf.q0(context, R.attr.motionEasingEmphasizedInterpolator, u);
    }

    public final void a(int i) {
        x3n h0 = x3n.h0();
        gu2 gu2Var = this.t;
        synchronized (h0.a) {
            try {
                if (h0.o0(gu2Var)) {
                    h0.X((m1r) h0.c, i);
                } else {
                    m1r m1rVar = (m1r) h0.d;
                    if (m1rVar != null && m1rVar.a.get() == gu2Var) {
                        h0.X((m1r) h0.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        WindowInsets rootWindowInsets;
        int i;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        this.p = i;
        f();
    }

    public final void c() {
        x3n h0 = x3n.h0();
        gu2 gu2Var = this.t;
        synchronized (h0.a) {
            try {
                if (h0.o0(gu2Var)) {
                    h0.c = null;
                    if (((m1r) h0.d) != null) {
                        h0.N0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        x3n h0 = x3n.h0();
        gu2 gu2Var = this.t;
        synchronized (h0.a) {
            try {
                if (h0.o0(gu2Var)) {
                    h0.K0((m1r) h0.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        iu2 iu2Var = this.i;
        if (z2) {
            iu2Var.post(new eu2(this, 2));
            return;
        }
        if (iu2Var.getParent() != null) {
            iu2Var.setVisibility(0);
        }
        d();
    }

    public final void f() {
        iu2 iu2Var = this.i;
        ViewGroup.LayoutParams layoutParams = iu2Var.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = z;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (iu2Var.j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (iu2Var.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = iu2Var.j;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            iu2Var.requestLayout();
        }
        if ((z3 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = iu2Var.getLayoutParams();
            if ((layoutParams2 instanceof xk6) && (((xk6) layoutParams2).a instanceof SwipeDismissBehavior)) {
                eu2 eu2Var = this.l;
                iu2Var.removeCallbacks(eu2Var);
                iu2Var.post(eu2Var);
            }
        }
    }
}
