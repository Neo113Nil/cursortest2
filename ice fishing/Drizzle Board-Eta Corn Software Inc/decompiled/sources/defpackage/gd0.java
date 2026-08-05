package defpackage;

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
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.kolosta.rejin.jilosa.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gd0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static gd0 OnDfzHZD;
    public static gd0 ow5vqvCr;
    public final CharSequence MdtA4re8;
    public final View NCTxEWno;
    public final fd0 P7K7Inc8;
    public int Qr9iLBAD;
    public final fd0 VgvYg0wo;
    public int b2ZJblxo;
    public boolean eVhOlqcC;
    public hd0 jb9XjC4I;
    public boolean k3x7lurq;
    public final int wxUZMvaN;

    /* JADX WARN: Type inference failed for: r0v0, types: [fd0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [fd0] */
    public gd0(View view, CharSequence charSequence) {
        final int i = 0;
        this.VgvYg0wo = new Runnable(this) { // from class: fd0
            public final /* synthetic */ gd0 MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                gd0 gd0Var = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        gd0Var.MdtA4re8(false);
                        break;
                    default:
                        gd0Var.qoPGr6Ce();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.P7K7Inc8 = new Runnable(this) { // from class: fd0
            public final /* synthetic */ gd0 MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                gd0 gd0Var = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        gd0Var.MdtA4re8(false);
                        break;
                    default:
                        gd0Var.qoPGr6Ce();
                        break;
                }
            }
        };
        this.NCTxEWno = view;
        this.MdtA4re8 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = jg0.qoPGr6Ce;
        this.wxUZMvaN = Build.VERSION.SDK_INT >= 28 ? fd.b2ZJblxo(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.k3x7lurq = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void NCTxEWno(gd0 gd0Var) {
        gd0 gd0Var2 = ow5vqvCr;
        if (gd0Var2 != null) {
            gd0Var2.NCTxEWno.removeCallbacks(gd0Var2.VgvYg0wo);
        }
        ow5vqvCr = gd0Var;
        if (gd0Var != null) {
            gd0Var.NCTxEWno.postDelayed(gd0Var.VgvYg0wo, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void MdtA4re8(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.NCTxEWno;
        if (view.isAttachedToWindow()) {
            NCTxEWno(null);
            gd0 gd0Var = OnDfzHZD;
            if (gd0Var != null) {
                gd0Var.qoPGr6Ce();
            }
            OnDfzHZD = this;
            this.eVhOlqcC = z;
            hd0 hd0Var = new hd0(view.getContext());
            Context context = (Context) hd0Var.NCTxEWno;
            this.jb9XjC4I = hd0Var;
            int i5 = this.b2ZJblxo;
            int i6 = this.Qr9iLBAD;
            boolean z3 = this.eVhOlqcC;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) hd0Var.wxUZMvaN;
            View view2 = hd0Var.MdtA4re8;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            hd0Var.qoPGr6Ce.setText(this.MdtA4re8);
            int[] iArr = (int[]) hd0Var.b2ZJblxo;
            int[] iArr2 = (int[]) hd0Var.P7K7Inc8;
            Rect rect = (Rect) hd0Var.VgvYg0wo;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i7 = i5;
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
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i8 + i7) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i4];
                int i10 = ((i9 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams.y = i10;
                    } else {
                        layoutParams.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i10;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.eVhOlqcC) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            fd0 fd0Var = this.P7K7Inc8;
            view.removeCallbacks(fd0Var);
            view.postDelayed(fd0Var, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.Qr9iLBAD) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.jb9XjC4I == null || !this.eVhOlqcC) {
            View view2 = this.NCTxEWno;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.k3x7lurq = true;
                        qoPGr6Ce();
                        return false;
                    }
                } else if (view2.isEnabled() && this.jb9XjC4I == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.k3x7lurq) {
                        int abs = Math.abs(x - this.b2ZJblxo);
                        int i = this.wxUZMvaN;
                        if (abs <= i) {
                        }
                    }
                    this.b2ZJblxo = x;
                    this.Qr9iLBAD = y;
                    this.k3x7lurq = false;
                    NCTxEWno(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.b2ZJblxo = view.getWidth() / 2;
        this.Qr9iLBAD = view.getHeight() / 2;
        MdtA4re8(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        qoPGr6Ce();
    }

    public final void qoPGr6Ce() {
        gd0 gd0Var = OnDfzHZD;
        View view = this.NCTxEWno;
        if (gd0Var == this) {
            OnDfzHZD = null;
            hd0 hd0Var = this.jb9XjC4I;
            if (hd0Var != null) {
                View view2 = hd0Var.MdtA4re8;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) hd0Var.NCTxEWno).getSystemService("window")).removeView(view2);
                }
                this.jb9XjC4I = null;
                this.k3x7lurq = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (ow5vqvCr == this) {
            NCTxEWno(null);
        }
        view.removeCallbacks(this.P7K7Inc8);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
