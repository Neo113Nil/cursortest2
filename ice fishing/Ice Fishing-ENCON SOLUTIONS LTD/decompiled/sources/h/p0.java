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
import com.watchfacestudio.spraktum.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static p0 f3317j;

    /* renamed from: k, reason: collision with root package name */
    public static p0 f3318k;

    /* renamed from: a, reason: collision with root package name */
    public final View f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f3320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3321c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f3322d = new o0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final o0 f3323e = new o0(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public int f3324f;

    /* renamed from: g, reason: collision with root package name */
    public int f3325g;

    /* renamed from: h, reason: collision with root package name */
    public q0 f3326h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3327i;

    public p0(View view, CharSequence charSequence) {
        this.f3319a = view;
        this.f3320b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = y.B.f8537a;
        this.f3321c = Build.VERSION.SDK_INT >= 28 ? y.z.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3324f = Integer.MAX_VALUE;
        this.f3325g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p0 p0Var) {
        p0 p0Var2 = f3317j;
        if (p0Var2 != null) {
            p0Var2.f3319a.removeCallbacks(p0Var2.f3322d);
        }
        f3317j = p0Var;
        if (p0Var != null) {
            p0Var.f3319a.postDelayed(p0Var.f3322d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p0 p0Var = f3318k;
        View view = this.f3319a;
        if (p0Var == this) {
            f3318k = null;
            q0 q0Var = this.f3326h;
            if (q0Var != null) {
                View view2 = q0Var.f3331b;
                if (view2.getParent() != null) {
                    ((WindowManager) q0Var.f3330a.getSystemService("window")).removeView(view2);
                }
                this.f3326h = null;
                this.f3324f = Integer.MAX_VALUE;
                this.f3325g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3317j == this) {
            b(null);
        }
        view.removeCallbacks(this.f3323e);
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
        Field field = y.x.f8596a;
        View view = this.f3319a;
        if (view.isAttachedToWindow()) {
            b(null);
            p0 p0Var = f3318k;
            if (p0Var != null) {
                p0Var.a();
            }
            f3318k = this;
            this.f3327i = z2;
            q0 q0Var = new q0(view.getContext());
            this.f3326h = q0Var;
            int i4 = this.f3324f;
            int i5 = this.f3325g;
            boolean z3 = this.f3327i;
            View view2 = q0Var.f3331b;
            ViewParent parent = view2.getParent();
            Context context = q0Var.f3330a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            q0Var.f3332c.setText(this.f3320b);
            WindowManager.LayoutParams layoutParams = q0Var.f3333d;
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
                Rect rect = q0Var.f3334e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = q0Var.f3336g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = q0Var.f3335f;
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
            if (this.f3327i) {
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
            o0 o0Var = this.f3323e;
            view.removeCallbacks(o0Var);
            view.postDelayed(o0Var, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3326h != null && this.f3327i) {
            return false;
        }
        View view2 = this.f3319a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f3324f = Integer.MAX_VALUE;
                this.f3325g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f3326h == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int abs = Math.abs(x2 - this.f3324f);
            int i2 = this.f3321c;
            if (abs > i2 || Math.abs(y2 - this.f3325g) > i2) {
                this.f3324f = x2;
                this.f3325g = y2;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f3324f = view.getWidth() / 2;
        this.f3325g = view.getHeight() / 2;
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
