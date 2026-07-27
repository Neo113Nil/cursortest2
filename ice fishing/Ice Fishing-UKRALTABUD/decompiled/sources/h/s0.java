package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.icedrifter.arcticquest.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w.AbstractC0264B;

/* loaded from: classes.dex */
public final class s0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static s0 f2262j;

    /* renamed from: k, reason: collision with root package name */
    public static s0 f2263k;

    /* renamed from: a, reason: collision with root package name */
    public final View f2264a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2266c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f2267d = new r0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final r0 f2268e = new r0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f2269f;

    /* renamed from: g, reason: collision with root package name */
    public int f2270g;

    /* renamed from: h, reason: collision with root package name */
    public t0 f2271h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2272i;

    public s0(View view, CharSequence charSequence) {
        this.f2264a = view;
        this.f2265b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0264B.f3010a;
        this.f2266c = Build.VERSION.SDK_INT >= 28 ? w.z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2269f = Integer.MAX_VALUE;
        this.f2270g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s0 s0Var) {
        s0 s0Var2 = f2262j;
        if (s0Var2 != null) {
            s0Var2.f2264a.removeCallbacks(s0Var2.f2267d);
        }
        f2262j = s0Var;
        if (s0Var != null) {
            s0Var.f2264a.postDelayed(s0Var.f2267d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s0 s0Var = f2263k;
        View view = this.f2264a;
        if (s0Var == this) {
            f2263k = null;
            t0 t0Var = this.f2271h;
            if (t0Var != null) {
                View view2 = t0Var.f2287b;
                if (view2.getParent() != null) {
                    ((WindowManager) t0Var.f2286a.getSystemService("window")).removeView(view2);
                }
                this.f2271h = null;
                this.f2269f = Integer.MAX_VALUE;
                this.f2270g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2262j == this) {
            b(null);
        }
        view.removeCallbacks(this.f2268e);
    }

    public final void c(boolean z2) {
        int height;
        int i2;
        String str;
        int i3;
        String str2;
        long longPressTimeout;
        long j2;
        long j3;
        Field field = w.x.f3069a;
        View view = this.f2264a;
        if (view.isAttachedToWindow()) {
            b(null);
            s0 s0Var = f2263k;
            if (s0Var != null) {
                s0Var.a();
            }
            f2263k = this;
            this.f2272i = z2;
            t0 t0Var = new t0(view.getContext());
            this.f2271h = t0Var;
            int i4 = this.f2269f;
            int i5 = this.f2270g;
            boolean z3 = this.f2272i;
            View view2 = t0Var.f2287b;
            ViewParent parent = view2.getParent();
            Context context = t0Var.f2286a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            t0Var.f2288c.setText(this.f2265b);
            WindowManager.LayoutParams layoutParams = t0Var.f2289d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = t0Var.f2290e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = t0Var.f2292g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = t0Var.f2291f;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i6;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i6 + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[1];
                int i8 = ((i2 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f2272i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            r0 r0Var = this.f2268e;
            view.removeCallbacks(r0Var);
            view.postDelayed(r0Var, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2271h != null && this.f2272i) {
            return false;
        }
        View view2 = this.f2264a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f2269f = Integer.MAX_VALUE;
                this.f2270g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f2271h == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int abs = Math.abs(x2 - this.f2269f);
            int i2 = this.f2266c;
            if (abs > i2 || Math.abs(y2 - this.f2270g) > i2) {
                this.f2269f = x2;
                this.f2270g = y2;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2269f = view.getWidth() / 2;
        this.f2270g = view.getHeight() / 2;
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
