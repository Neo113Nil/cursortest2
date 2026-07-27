package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import m.C4754p0;
import m.G0;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4671C extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public final G0 f38864A;

    /* renamed from: D, reason: collision with root package name */
    public u f38867D;

    /* renamed from: E, reason: collision with root package name */
    public View f38868E;

    /* renamed from: F, reason: collision with root package name */
    public View f38869F;

    /* renamed from: G, reason: collision with root package name */
    public w f38870G;

    /* renamed from: H, reason: collision with root package name */
    public ViewTreeObserver f38871H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38872I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public int f38873K;

    /* renamed from: M, reason: collision with root package name */
    public boolean f38875M;

    /* renamed from: u, reason: collision with root package name */
    public final Context f38876u;

    /* renamed from: v, reason: collision with root package name */
    public final l f38877v;

    /* renamed from: w, reason: collision with root package name */
    public final C4681i f38878w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38879x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38880y;

    /* renamed from: z, reason: collision with root package name */
    public final int f38881z;

    /* renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4676d f38865B = new ViewTreeObserverOnGlobalLayoutListenerC4676d(1, this);

    /* renamed from: C, reason: collision with root package name */
    public final F3.p f38866C = new F3.p(3, this);

    /* renamed from: L, reason: collision with root package name */
    public int f38874L = 0;

    public ViewOnKeyListenerC4671C(int i, Context context, View view, l lVar, boolean z8) {
        this.f38876u = context;
        this.f38877v = lVar;
        this.f38879x = z8;
        this.f38878w = new C4681i(lVar, LayoutInflater.from(context), z8, C5284R.layout.abc_popup_menu_item_layout);
        this.f38881z = i;
        Resources resources = context.getResources();
        this.f38880y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5284R.dimen.abc_config_prefDialogWidth));
        this.f38868E = view;
        this.f38864A = new G0(context, null, i);
        lVar.b(this, context);
    }

    @Override // l.InterfaceC4670B
    public final boolean a() {
        return !this.f38872I && this.f38864A.f39252S.isShowing();
    }

    @Override // l.x
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d() {
        this.J = false;
        C4681i c4681i = this.f38878w;
        if (c4681i != null) {
            c4681i.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC4670B
    public final void dismiss() {
        if (a()) {
            this.f38864A.dismiss();
        }
    }

    @Override // l.x
    public final void e(l lVar, boolean z8) {
        if (lVar != this.f38877v) {
            return;
        }
        dismiss();
        w wVar = this.f38870G;
        if (wVar != null) {
            wVar.e(lVar, z8);
        }
    }

    @Override // l.InterfaceC4670B
    public final C4754p0 f() {
        return this.f38864A.f39255v;
    }

    @Override // l.x
    public final void g(w wVar) {
        this.f38870G = wVar;
    }

    @Override // l.x
    public final boolean i(SubMenuC4672D subMenuC4672D) {
        if (subMenuC4672D.hasVisibleItems()) {
            View view = this.f38869F;
            v vVar = new v(this.f38881z, this.f38876u, view, subMenuC4672D, this.f38879x);
            w wVar = this.f38870G;
            vVar.f39019h = wVar;
            t tVar = vVar.i;
            if (tVar != null) {
                tVar.g(wVar);
            }
            boolean t9 = t.t(subMenuC4672D);
            vVar.f39018g = t9;
            t tVar2 = vVar.i;
            if (tVar2 != null) {
                tVar2.n(t9);
            }
            vVar.f39020j = this.f38867D;
            this.f38867D = null;
            this.f38877v.c(false);
            G0 g02 = this.f38864A;
            int i = g02.f39258y;
            int k6 = g02.k();
            if ((Gravity.getAbsoluteGravity(this.f38874L, this.f38868E.getLayoutDirection()) & 7) == 5) {
                i += this.f38868E.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f39016e != null) {
                    vVar.d(i, k6, true, true);
                }
            }
            w wVar2 = this.f38870G;
            if (wVar2 != null) {
                wVar2.g(subMenuC4672D);
            }
            return true;
        }
        return false;
    }

    @Override // l.t
    public final void m(View view) {
        this.f38868E = view;
    }

    @Override // l.t
    public final void n(boolean z8) {
        this.f38878w.f38941c = z8;
    }

    @Override // l.t
    public final void o(int i) {
        this.f38874L = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f38872I = true;
        this.f38877v.c(true);
        ViewTreeObserver viewTreeObserver = this.f38871H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f38871H = this.f38869F.getViewTreeObserver();
            }
            this.f38871H.removeGlobalOnLayoutListener(this.f38865B);
            this.f38871H = null;
        }
        this.f38869F.removeOnAttachStateChangeListener(this.f38866C);
        u uVar = this.f38867D;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.t
    public final void p(int i) {
        this.f38864A.f39258y = i;
    }

    @Override // l.t
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f38867D = (u) onDismissListener;
    }

    @Override // l.t
    public final void r(boolean z8) {
        this.f38875M = z8;
    }

    @Override // l.t
    public final void s(int i) {
        this.f38864A.g(i);
    }

    @Override // l.InterfaceC4670B
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f38872I || (view = this.f38868E) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f38869F = view;
        G0 g02 = this.f38864A;
        g02.f39252S.setOnDismissListener(this);
        g02.f39243I = this;
        g02.f39251R = true;
        g02.f39252S.setFocusable(true);
        View view2 = this.f38869F;
        boolean z8 = this.f38871H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f38871H = viewTreeObserver;
        if (z8) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f38865B);
        }
        view2.addOnAttachStateChangeListener(this.f38866C);
        g02.f39242H = view2;
        g02.f39239E = this.f38874L;
        boolean z9 = this.J;
        Context context = this.f38876u;
        C4681i c4681i = this.f38878w;
        if (!z9) {
            this.f38873K = t.l(c4681i, context, this.f38880y);
            this.J = true;
        }
        g02.n(this.f38873K);
        g02.f39252S.setInputMethodMode(2);
        Rect rect = this.f39010n;
        g02.f39250Q = rect != null ? new Rect(rect) : null;
        g02.show();
        C4754p0 c4754p0 = g02.f39255v;
        c4754p0.setOnKeyListener(this);
        if (this.f38875M) {
            l lVar = this.f38877v;
            if (lVar.f38951F != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C5284R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c4754p0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f38951F);
                }
                frameLayout.setEnabled(false);
                c4754p0.addHeaderView(frameLayout, null, false);
            }
        }
        g02.l(c4681i);
        g02.show();
    }

    @Override // l.t
    public final void k(l lVar) {
    }
}
