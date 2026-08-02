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
import com.IceFishing.LiveIceFishing.C5248R;
import m.C4719p0;
import m.G0;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4653D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public final G0 f38647A;

    /* renamed from: D, reason: collision with root package name */
    public v f38650D;

    /* renamed from: E, reason: collision with root package name */
    public View f38651E;

    /* renamed from: F, reason: collision with root package name */
    public View f38652F;

    /* renamed from: G, reason: collision with root package name */
    public x f38653G;

    /* renamed from: H, reason: collision with root package name */
    public ViewTreeObserver f38654H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38655I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public int f38656K;

    /* renamed from: M, reason: collision with root package name */
    public boolean f38658M;

    /* renamed from: u, reason: collision with root package name */
    public final Context f38659u;

    /* renamed from: v, reason: collision with root package name */
    public final m f38660v;

    /* renamed from: w, reason: collision with root package name */
    public final C4664j f38661w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38662x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38663y;

    /* renamed from: z, reason: collision with root package name */
    public final int f38664z;

    /* renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4658d f38648B = new ViewTreeObserverOnGlobalLayoutListenerC4658d(1, this);

    /* renamed from: C, reason: collision with root package name */
    public final J3.p f38649C = new J3.p(3, this);

    /* renamed from: L, reason: collision with root package name */
    public int f38657L = 0;

    public ViewOnKeyListenerC4653D(int i, Context context, View view, m mVar, boolean z6) {
        this.f38659u = context;
        this.f38660v = mVar;
        this.f38662x = z6;
        this.f38661w = new C4664j(mVar, LayoutInflater.from(context), z6, C5248R.layout.abc_popup_menu_item_layout);
        this.f38664z = i;
        Resources resources = context.getResources();
        this.f38663y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5248R.dimen.abc_config_prefDialogWidth));
        this.f38651E = view;
        this.f38647A = new G0(context, null, i);
        mVar.b(this, context);
    }

    @Override // l.InterfaceC4652C
    public final boolean a() {
        return !this.f38655I && this.f38647A.f39053S.isShowing();
    }

    @Override // l.y
    public final void b(m mVar, boolean z6) {
        if (mVar != this.f38660v) {
            return;
        }
        dismiss();
        x xVar = this.f38653G;
        if (xVar != null) {
            xVar.b(mVar, z6);
        }
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC4652C
    public final void dismiss() {
        if (a()) {
            this.f38647A.dismiss();
        }
    }

    @Override // l.y
    public final void e() {
        this.J = false;
        C4664j c4664j = this.f38661w;
        if (c4664j != null) {
            c4664j.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC4652C
    public final C4719p0 f() {
        return this.f38647A.f39056v;
    }

    @Override // l.y
    public final void g(x xVar) {
        this.f38653G = xVar;
    }

    @Override // l.y
    public final boolean i(SubMenuC4654E subMenuC4654E) {
        if (subMenuC4654E.hasVisibleItems()) {
            View view = this.f38652F;
            w wVar = new w(this.f38664z, this.f38659u, view, subMenuC4654E, this.f38662x);
            x xVar = this.f38653G;
            wVar.f38804h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.g(xVar);
            }
            boolean t6 = u.t(subMenuC4654E);
            wVar.f38803g = t6;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.n(t6);
            }
            wVar.f38805j = this.f38650D;
            this.f38650D = null;
            this.f38660v.c(false);
            G0 g02 = this.f38647A;
            int i = g02.f39059y;
            int k9 = g02.k();
            if ((Gravity.getAbsoluteGravity(this.f38657L, this.f38651E.getLayoutDirection()) & 7) == 5) {
                i += this.f38651E.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f38801e != null) {
                    wVar.d(i, k9, true, true);
                }
            }
            x xVar2 = this.f38653G;
            if (xVar2 != null) {
                xVar2.e(subMenuC4654E);
            }
            return true;
        }
        return false;
    }

    @Override // l.u
    public final void m(View view) {
        this.f38651E = view;
    }

    @Override // l.u
    public final void n(boolean z6) {
        this.f38661w.f38726c = z6;
    }

    @Override // l.u
    public final void o(int i) {
        this.f38657L = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f38655I = true;
        this.f38660v.c(true);
        ViewTreeObserver viewTreeObserver = this.f38654H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f38654H = this.f38652F.getViewTreeObserver();
            }
            this.f38654H.removeGlobalOnLayoutListener(this.f38648B);
            this.f38654H = null;
        }
        this.f38652F.removeOnAttachStateChangeListener(this.f38649C);
        v vVar = this.f38650D;
        if (vVar != null) {
            vVar.onDismiss();
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

    @Override // l.u
    public final void p(int i) {
        this.f38647A.f39059y = i;
    }

    @Override // l.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f38650D = (v) onDismissListener;
    }

    @Override // l.u
    public final void r(boolean z6) {
        this.f38658M = z6;
    }

    @Override // l.u
    public final void s(int i) {
        this.f38647A.h(i);
    }

    @Override // l.InterfaceC4652C
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f38655I || (view = this.f38651E) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f38652F = view;
        G0 g02 = this.f38647A;
        g02.f39053S.setOnDismissListener(this);
        g02.f39044I = this;
        g02.f39052R = true;
        g02.f39053S.setFocusable(true);
        View view2 = this.f38652F;
        boolean z6 = this.f38654H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f38654H = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f38648B);
        }
        view2.addOnAttachStateChangeListener(this.f38649C);
        g02.f39043H = view2;
        g02.f39040E = this.f38657L;
        boolean z9 = this.J;
        Context context = this.f38659u;
        C4664j c4664j = this.f38661w;
        if (!z9) {
            this.f38656K = u.l(c4664j, context, this.f38663y);
            this.J = true;
        }
        g02.n(this.f38656K);
        g02.f39053S.setInputMethodMode(2);
        Rect rect = this.f38795n;
        g02.f39051Q = rect != null ? new Rect(rect) : null;
        g02.show();
        C4719p0 c4719p0 = g02.f39056v;
        c4719p0.setOnKeyListener(this);
        if (this.f38658M) {
            m mVar = this.f38660v;
            if (mVar.f38736F != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C5248R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c4719p0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f38736F);
                }
                frameLayout.setEnabled(false);
                c4719p0.addHeaderView(frameLayout, null, false);
            }
        }
        g02.l(c4664j);
        g02.show();
    }

    @Override // l.u
    public final void k(m mVar) {
    }
}
