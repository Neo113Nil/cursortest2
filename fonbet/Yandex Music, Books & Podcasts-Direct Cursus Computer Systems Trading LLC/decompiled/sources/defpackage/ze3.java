package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class ze3 extends gr0 {
    public BottomSheetBehavior f;
    public FrameLayout g;
    public CoordinatorLayout h;
    public FrameLayout i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ye3 n;
    public final boolean o;
    public t1f p;
    public final xe3 q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ze3(Context context, int i) {
        super(context, i);
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        this.k = true;
        this.l = true;
        this.q = new xe3(0, this);
        c().j(1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.o = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f == null) {
            e();
        }
        BottomSheetBehavior bottomSheetBehavior = this.f;
        if (!this.j || bottomSheetBehavior.getState() == 5) {
            super.cancel();
        } else {
            bottomSheetBehavior.setState(5);
        }
    }

    public final void e() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(R.id.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
            this.f = from;
            from.addBottomSheetCallback(this.q);
            this.f.setHideable(this.k);
            this.p = new t1f(this.f, this.i);
        }
    }

    public final FrameLayout f(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o) {
            FrameLayout frameLayout = this.g;
            sld sldVar = new sld(13, this);
            WeakHashMap weakHashMap = wdu.a;
            ndu.n(frameLayout, sldVar);
        }
        this.i.removeAllViews();
        FrameLayout frameLayout2 = this.i;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new je(2, this));
        wdu.q(this.i, new fu2(1, this));
        this.i.setOnTouchListener(new abe(3));
        return this.g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            q5g.I(window, !z);
            ye3 ye3Var = this.n;
            if (ye3Var != null) {
                ye3Var.e(window);
            }
        }
        t1f t1fVar = this.p;
        if (t1fVar == null) {
            return;
        }
        View view = (View) t1fVar.d;
        boolean z2 = this.k;
        och ochVar = (och) t1fVar.b;
        if (z2) {
            if (ochVar != null) {
                ochVar.b((nch) t1fVar.c, view, false);
            }
        } else if (ochVar != null) {
            ochVar.c(view);
        }
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        och ochVar;
        ye3 ye3Var = this.n;
        if (ye3Var != null) {
            ye3Var.e(null);
        }
        t1f t1fVar = this.p;
        if (t1fVar == null || (ochVar = (och) t1fVar.b) == null) {
            return;
        }
        ochVar.c((View) t1fVar.d);
    }

    @Override // defpackage.ln5, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f.setState(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        t1f t1fVar;
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
            if (getWindow() == null || (t1fVar = this.p) == null) {
                return;
            }
            View view = (View) t1fVar.d;
            boolean z2 = this.k;
            och ochVar = (och) t1fVar.b;
            if (z2) {
                if (ochVar != null) {
                    ochVar.b((nch) t1fVar.c, view, false);
                }
            } else if (ochVar != null) {
                ochVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(view, 0, null));
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(f(null, i, null));
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(view, 0, layoutParams));
    }
}
