package m;

import O.AbstractC0337b0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: D, reason: collision with root package name */
    public static b1 f39380D;

    /* renamed from: E, reason: collision with root package name */
    public static b1 f39381E;

    /* renamed from: A, reason: collision with root package name */
    public c1 f39382A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39383B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39384C;

    /* renamed from: n, reason: collision with root package name */
    public final View f39385n;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f39386u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39387v;

    /* renamed from: w, reason: collision with root package name */
    public final a1 f39388w;

    /* renamed from: x, reason: collision with root package name */
    public final a1 f39389x;

    /* renamed from: y, reason: collision with root package name */
    public int f39390y;

    /* renamed from: z, reason: collision with root package name */
    public int f39391z;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.a1] */
    public b1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f39388w = new Runnable(this) { // from class: m.a1

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b1 f39378u;

            {
                this.f39378u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f39378u.c(false);
                        break;
                    default:
                        this.f39378u.a();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f39389x = new Runnable(this) { // from class: m.a1

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b1 f39378u;

            {
                this.f39378u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f39378u.c(false);
                        break;
                    default:
                        this.f39378u.a();
                        break;
                }
            }
        };
        this.f39385n = view;
        this.f39386u = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0337b0.f2250a;
        this.f39387v = Build.VERSION.SDK_INT >= 28 ? O.Z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f39384C = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(b1 b1Var) {
        b1 b1Var2 = f39380D;
        if (b1Var2 != null) {
            b1Var2.f39385n.removeCallbacks(b1Var2.f39388w);
        }
        f39380D = b1Var;
        if (b1Var != null) {
            b1Var.f39385n.postDelayed(b1Var.f39388w, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        b1 b1Var = f39381E;
        View view = this.f39385n;
        if (b1Var == this) {
            f39381E = null;
            c1 c1Var = this.f39382A;
            if (c1Var != null) {
                View view2 = (View) c1Var.f39395u;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1Var.f39394n).getSystemService("window")).removeView(view2);
                }
                this.f39382A = null;
                this.f39384C = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f39380D == this) {
            b(null);
        }
        view.removeCallbacks(this.f39389x);
    }

    public final void c(boolean z8) {
        int height;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        long longPressTimeout;
        long j9;
        long j10;
        View view = this.f39385n;
        if (view.isAttachedToWindow()) {
            b(null);
            b1 b1Var = f39381E;
            if (b1Var != null) {
                b1Var.a();
            }
            f39381E = this;
            this.f39383B = z8;
            Context context = view.getContext();
            c1 c1Var = new c1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c1Var.f39397w = layoutParams;
            c1Var.f39398x = new Rect();
            c1Var.f39399y = new int[2];
            c1Var.f39400z = new int[2];
            c1Var.f39394n = context;
            View inflate = LayoutInflater.from(context).inflate(C5284R.layout.abc_tooltip, (ViewGroup) null);
            c1Var.f39395u = inflate;
            c1Var.f39396v = (TextView) inflate.findViewById(C5284R.id.message);
            layoutParams.setTitle(c1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = C5284R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f39382A = c1Var;
            int i12 = this.f39390y;
            int i13 = this.f39391z;
            boolean z9 = this.f39383B;
            View view2 = (View) c1Var.f39395u;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) c1Var.f39394n;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1Var.f39396v).setText(this.f39386u);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) c1Var.f39397w;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(C5284R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i12 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(C5284R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z9 ? C5284R.dimen.tooltip_y_offset_touch : C5284R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i11 = 1;
            } else {
                Rect rect = (Rect) c1Var.f39398x;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = i12;
                    i9 = i;
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i11 = 1;
                    i4 = i12;
                    i9 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c1Var.f39400z;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c1Var.f39399y;
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i14;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams2.x = (i14 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i11];
                int i16 = ((i15 + i9) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z9) {
                    if (i16 >= 0) {
                        layoutParams2.y = i16;
                    } else {
                        layoutParams2.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams2.y = i17;
                } else {
                    layoutParams2.y = i16;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f39383B) {
                j10 = 2500;
            } else {
                WeakHashMap weakHashMap = O.X.f2240a;
                if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j9 = com.anythink.expressad.video.module.a.a.m.ai;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j9 = 15000;
                }
                j10 = j9 - longPressTimeout;
            }
            a1 a1Var = this.f39389x;
            view.removeCallbacks(a1Var);
            view.postDelayed(a1Var, j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f39391z) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f39382A == null || !this.f39383B) {
            View view2 = this.f39385n;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f39384C = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f39382A == null) {
                    int x3 = (int) motionEvent.getX();
                    int y6 = (int) motionEvent.getY();
                    if (!this.f39384C) {
                        int abs = Math.abs(x3 - this.f39390y);
                        int i = this.f39387v;
                        if (abs <= i) {
                        }
                    }
                    this.f39390y = x3;
                    this.f39391z = y6;
                    this.f39384C = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f39390y = view.getWidth() / 2;
        this.f39391z = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
