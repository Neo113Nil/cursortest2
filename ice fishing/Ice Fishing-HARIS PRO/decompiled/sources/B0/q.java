package B0;

import O.B;
import O.K;
import a.AbstractC0078a;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lumenpath.harispro.hrnavigator.R;
import h.D;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q extends D {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f67f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f68g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f69h;
    public FrameLayout i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f70k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f71l;

    /* renamed from: m, reason: collision with root package name */
    public p f72m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f73n;

    /* renamed from: o, reason: collision with root package name */
    public M0.h f74o;

    /* renamed from: p, reason: collision with root package name */
    public o f75p;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        j();
        super.cancel();
    }

    public final void i() {
        if (this.f68g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f68g = frameLayout;
            this.f69h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f68g.findViewById(R.id.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior A2 = BottomSheetBehavior.A(frameLayout2);
            this.f67f = A2;
            o oVar = this.f75p;
            ArrayList arrayList = A2.f2387W;
            if (!arrayList.contains(oVar)) {
                arrayList.add(oVar);
            }
            this.f67f.F(this.j);
            this.f74o = new M0.h(this.f67f, this.i);
        }
    }

    public final BottomSheetBehavior j() {
        if (this.f67f == null) {
            i();
        }
        return this.f67f;
    }

    public final FrameLayout k(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = 0;
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f68g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f73n) {
            FrameLayout frameLayout = this.i;
            B.b bVar = new B.b(1, this);
            WeakHashMap weakHashMap = K.f747a;
            B.l(frameLayout, bVar);
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new l(i2, this));
        K.l(this.i, new m(i2, this));
        this.i.setOnTouchListener(new n(0));
        return this.f68g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z2 = this.f73n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f68g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.f69h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            AbstractC0078a.b0(window, !z2);
            p pVar = this.f72m;
            if (pVar != null) {
                pVar.e(window);
            }
        }
        M0.h hVar = this.f74o;
        if (hVar == null) {
            return;
        }
        boolean z3 = this.j;
        View view = (View) hVar.f618d;
        M0.e eVar = (M0.e) hVar.f616b;
        if (z3) {
            if (eVar != null) {
                eVar.b((M0.b) hVar.f617c, view, false);
            }
        } else if (eVar != null) {
            eVar.c(view);
        }
    }

    @Override // h.D, b.DialogC0114j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
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
        M0.e eVar;
        p pVar = this.f72m;
        if (pVar != null) {
            pVar.e(null);
        }
        M0.h hVar = this.f74o;
        if (hVar == null || (eVar = (M0.e) hVar.f616b) == null) {
            return;
        }
        eVar.c((View) hVar.f618d);
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f67f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f2376L != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z2) {
        M0.h hVar;
        super.setCancelable(z2);
        if (this.j != z2) {
            this.j = z2;
            BottomSheetBehavior bottomSheetBehavior = this.f67f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z2);
            }
            if (getWindow() == null || (hVar = this.f74o) == null) {
                return;
            }
            boolean z3 = this.j;
            View view = (View) hVar.f618d;
            M0.e eVar = (M0.e) hVar.f616b;
            if (z3) {
                if (eVar != null) {
                    eVar.b((M0.b) hVar.f617c, view, false);
                }
            } else if (eVar != null) {
                eVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.j) {
            this.j = true;
        }
        this.f70k = z2;
        this.f71l = true;
    }

    @Override // h.D, b.DialogC0114j, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(k(null, i, null));
    }

    @Override // h.D, b.DialogC0114j, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(k(view, 0, null));
    }

    @Override // h.D, b.DialogC0114j, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(k(view, 0, layoutParams));
    }
}
