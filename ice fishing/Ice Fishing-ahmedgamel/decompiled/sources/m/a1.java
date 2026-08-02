package m;

import O.AbstractC0324b0;
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
import com.icefishingapp.icefishing.C5275R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: D, reason: collision with root package name */
    public static a1 f39108D;

    /* renamed from: E, reason: collision with root package name */
    public static a1 f39109E;

    /* renamed from: A, reason: collision with root package name */
    public b1 f39110A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39111B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39112C;

    /* renamed from: n, reason: collision with root package name */
    public final View f39113n;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f39114u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39115v;

    /* renamed from: w, reason: collision with root package name */
    public final Z0 f39116w;

    /* renamed from: x, reason: collision with root package name */
    public final Z0 f39117x;

    /* renamed from: y, reason: collision with root package name */
    public int f39118y;

    /* renamed from: z, reason: collision with root package name */
    public int f39119z;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.Z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.Z0] */
    public a1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f39116w = new Runnable(this) { // from class: m.Z0

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a1 f39104u;

            {
                this.f39104u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f39104u.c(false);
                        break;
                    default:
                        this.f39104u.a();
                        break;
                }
            }
        };
        final int i6 = 1;
        this.f39117x = new Runnable(this) { // from class: m.Z0

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a1 f39104u;

            {
                this.f39104u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f39104u.c(false);
                        break;
                    default:
                        this.f39104u.a();
                        break;
                }
            }
        };
        this.f39113n = view;
        this.f39114u = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0324b0.f2064a;
        this.f39115v = Build.VERSION.SDK_INT >= 28 ? O.Z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f39112C = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a1 a1Var) {
        a1 a1Var2 = f39108D;
        if (a1Var2 != null) {
            a1Var2.f39113n.removeCallbacks(a1Var2.f39116w);
        }
        f39108D = a1Var;
        if (a1Var != null) {
            a1Var.f39113n.postDelayed(a1Var.f39116w, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        a1 a1Var = f39109E;
        View view = this.f39113n;
        if (a1Var == this) {
            f39109E = null;
            b1 b1Var = this.f39110A;
            if (b1Var != null) {
                View view2 = (View) b1Var.f39122u;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) b1Var.f39121n).getSystemService("window")).removeView(view2);
                }
                this.f39110A = null;
                this.f39112C = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f39108D == this) {
            b(null);
        }
        view.removeCallbacks(this.f39117x);
    }

    public final void c(boolean z3) {
        int height;
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        long longPressTimeout;
        long j6;
        long j9;
        View view = this.f39113n;
        if (view.isAttachedToWindow()) {
            b(null);
            a1 a1Var = f39109E;
            if (a1Var != null) {
                a1Var.a();
            }
            f39109E = this;
            this.f39111B = z3;
            Context context = view.getContext();
            b1 b1Var = new b1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            b1Var.f39124w = layoutParams;
            b1Var.f39125x = new Rect();
            b1Var.f39126y = new int[2];
            b1Var.f39127z = new int[2];
            b1Var.f39121n = context;
            View inflate = LayoutInflater.from(context).inflate(C5275R.layout.abc_tooltip, (ViewGroup) null);
            b1Var.f39122u = inflate;
            b1Var.f39123v = (TextView) inflate.findViewById(C5275R.id.message);
            layoutParams.setTitle(b1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = C5275R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f39110A = b1Var;
            int i12 = this.f39118y;
            int i13 = this.f39119z;
            boolean z6 = this.f39111B;
            View view2 = (View) b1Var.f39122u;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) b1Var.f39121n;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) b1Var.f39123v).setText(this.f39114u);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) b1Var.f39124w;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(C5275R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i12 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(C5275R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z6 ? C5275R.dimen.tooltip_y_offset_touch : C5275R.dimen.tooltip_y_offset_non_touch);
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
                Rect rect = (Rect) b1Var.f39125x;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i6 = i12;
                    i9 = i;
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i11 = 1;
                    i6 = i12;
                    i9 = i;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) b1Var.f39127z;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) b1Var.f39126y;
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i14;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams2.x = (i14 + i6) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i11];
                int i16 = ((i15 + i9) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z6) {
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
            if (this.f39111B) {
                j9 = 2500;
            } else {
                WeakHashMap weakHashMap = O.X.f2054a;
                if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = com.anythink.expressad.video.module.a.a.m.ai;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j9 = j6 - longPressTimeout;
            }
            Z0 z02 = this.f39117x;
            view.removeCallbacks(z02);
            view.postDelayed(z02, j9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f39119z) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f39110A == null || !this.f39111B) {
            View view2 = this.f39113n;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f39112C = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f39110A == null) {
                    int x9 = (int) motionEvent.getX();
                    int y7 = (int) motionEvent.getY();
                    if (!this.f39112C) {
                        int abs = Math.abs(x9 - this.f39118y);
                        int i = this.f39115v;
                        if (abs <= i) {
                        }
                    }
                    this.f39118y = x9;
                    this.f39119z = y7;
                    this.f39112C = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f39118y = view.getWidth() / 2;
        this.f39119z = view.getHeight() / 2;
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
