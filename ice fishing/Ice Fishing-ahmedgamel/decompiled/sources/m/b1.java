package m;

import O.AbstractC0329b0;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: D, reason: collision with root package name */
    public static b1 f39178D;

    /* renamed from: E, reason: collision with root package name */
    public static b1 f39179E;

    /* renamed from: A, reason: collision with root package name */
    public c1 f39180A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39181B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39182C;

    /* renamed from: n, reason: collision with root package name */
    public final View f39183n;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f39184u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39185v;

    /* renamed from: w, reason: collision with root package name */
    public final a1 f39186w;

    /* renamed from: x, reason: collision with root package name */
    public final a1 f39187x;

    /* renamed from: y, reason: collision with root package name */
    public int f39188y;

    /* renamed from: z, reason: collision with root package name */
    public int f39189z;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.a1] */
    public b1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f39186w = new Runnable(this) { // from class: m.a1

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b1 f39176u;

            {
                this.f39176u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f39176u.c(false);
                        break;
                    default:
                        this.f39176u.a();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f39187x = new Runnable(this) { // from class: m.a1

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b1 f39176u;

            {
                this.f39176u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f39176u.c(false);
                        break;
                    default:
                        this.f39176u.a();
                        break;
                }
            }
        };
        this.f39183n = view;
        this.f39184u = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0329b0.f2152a;
        this.f39185v = Build.VERSION.SDK_INT >= 28 ? O.Z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f39182C = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(b1 b1Var) {
        b1 b1Var2 = f39178D;
        if (b1Var2 != null) {
            b1Var2.f39183n.removeCallbacks(b1Var2.f39186w);
        }
        f39178D = b1Var;
        if (b1Var != null) {
            b1Var.f39183n.postDelayed(b1Var.f39186w, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        b1 b1Var = f39179E;
        View view = this.f39183n;
        if (b1Var == this) {
            f39179E = null;
            c1 c1Var = this.f39180A;
            if (c1Var != null) {
                View view2 = (View) c1Var.f39193u;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1Var.f39192n).getSystemService("window")).removeView(view2);
                }
                this.f39180A = null;
                this.f39182C = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f39178D == this) {
            b(null);
        }
        view.removeCallbacks(this.f39187x);
    }

    public final void c(boolean z6) {
        int height;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        long longPressTimeout;
        long j6;
        long j9;
        View view = this.f39183n;
        if (view.isAttachedToWindow()) {
            b(null);
            b1 b1Var = f39179E;
            if (b1Var != null) {
                b1Var.a();
            }
            f39179E = this;
            this.f39181B = z6;
            Context context = view.getContext();
            c1 c1Var = new c1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c1Var.f39195w = layoutParams;
            c1Var.f39196x = new Rect();
            c1Var.f39197y = new int[2];
            c1Var.f39198z = new int[2];
            c1Var.f39192n = context;
            View inflate = LayoutInflater.from(context).inflate(C5248R.layout.abc_tooltip, (ViewGroup) null);
            c1Var.f39193u = inflate;
            c1Var.f39194v = (TextView) inflate.findViewById(C5248R.id.message);
            layoutParams.setTitle(c1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = C5248R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f39180A = c1Var;
            int i11 = this.f39188y;
            int i12 = this.f39189z;
            boolean z9 = this.f39181B;
            View view2 = (View) c1Var.f39193u;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) c1Var.f39192n;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1Var.f39194v).setText(this.f39184u);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) c1Var.f39195w;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(C5248R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i11 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(C5248R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z9 ? C5248R.dimen.tooltip_y_offset_touch : C5248R.dimen.tooltip_y_offset_non_touch);
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
                i10 = 1;
            } else {
                Rect rect = (Rect) c1Var.f39196x;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = i11;
                    i6 = i;
                    i9 = 0;
                    i10 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i10 = 1;
                    i4 = i11;
                    i6 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i9 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c1Var.f39198z;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c1Var.f39197y;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i9] - iArr[i9];
                iArr2[i9] = i13;
                iArr2[i10] = iArr2[i10] - iArr[i10];
                layoutParams2.x = (i13 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, i9);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[i10];
                int i15 = ((i14 + i6) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z9) {
                    if (i15 >= 0) {
                        layoutParams2.y = i15;
                    } else {
                        layoutParams2.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams2.y = i16;
                } else {
                    layoutParams2.y = i15;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f39181B) {
                j9 = 2500;
            } else {
                WeakHashMap weakHashMap = O.X.f2142a;
                if ((view.getWindowSystemUiVisibility() & 1) == i10) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = com.anythink.expressad.video.module.a.a.m.ai;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j9 = j6 - longPressTimeout;
            }
            a1 a1Var = this.f39187x;
            view.removeCallbacks(a1Var);
            view.postDelayed(a1Var, j9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f39189z) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f39180A == null || !this.f39181B) {
            View view2 = this.f39183n;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f39182C = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f39180A == null) {
                    int x9 = (int) motionEvent.getX();
                    int y7 = (int) motionEvent.getY();
                    if (!this.f39182C) {
                        int abs = Math.abs(x9 - this.f39188y);
                        int i = this.f39185v;
                        if (abs <= i) {
                        }
                    }
                    this.f39188y = x9;
                    this.f39189z = y7;
                    this.f39182C = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f39188y = view.getWidth() / 2;
        this.f39189z = view.getHeight() / 2;
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
