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
import com.icefishinggame.icefishinggamemultigames.C5275R;
import m.C4706p0;
import m.G0;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4642D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public final G0 f38720A;

    /* renamed from: D, reason: collision with root package name */
    public v f38723D;

    /* renamed from: E, reason: collision with root package name */
    public View f38724E;

    /* renamed from: F, reason: collision with root package name */
    public View f38725F;

    /* renamed from: G, reason: collision with root package name */
    public x f38726G;

    /* renamed from: H, reason: collision with root package name */
    public ViewTreeObserver f38727H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38728I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public int f38729K;

    /* renamed from: M, reason: collision with root package name */
    public boolean f38731M;

    /* renamed from: u, reason: collision with root package name */
    public final Context f38732u;

    /* renamed from: v, reason: collision with root package name */
    public final m f38733v;

    /* renamed from: w, reason: collision with root package name */
    public final C4653j f38734w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38735x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38736y;

    /* renamed from: z, reason: collision with root package name */
    public final int f38737z;

    /* renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4647d f38721B = new ViewTreeObserverOnGlobalLayoutListenerC4647d(1, this);

    /* renamed from: C, reason: collision with root package name */
    public final H3.p f38722C = new H3.p(3, this);

    /* renamed from: L, reason: collision with root package name */
    public int f38730L = 0;

    public ViewOnKeyListenerC4642D(int i, Context context, View view, m mVar, boolean z3) {
        this.f38732u = context;
        this.f38733v = mVar;
        this.f38735x = z3;
        this.f38734w = new C4653j(mVar, LayoutInflater.from(context), z3, C5275R.layout.abc_popup_menu_item_layout);
        this.f38737z = i;
        Resources resources = context.getResources();
        this.f38736y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5275R.dimen.abc_config_prefDialogWidth));
        this.f38724E = view;
        this.f38720A = new G0(context, null, i);
        mVar.b(this, context);
    }

    @Override // l.InterfaceC4641C
    public final boolean a() {
        return !this.f38728I && this.f38720A.f38985S.isShowing();
    }

    @Override // l.y
    public final void b(m mVar, boolean z3) {
        if (mVar != this.f38733v) {
            return;
        }
        dismiss();
        x xVar = this.f38726G;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.InterfaceC4641C
    public final void dismiss() {
        if (a()) {
            this.f38720A.dismiss();
        }
    }

    @Override // l.y
    public final void e() {
        this.J = false;
        C4653j c4653j = this.f38734w;
        if (c4653j != null) {
            c4653j.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC4641C
    public final C4706p0 f() {
        return this.f38720A.f38988v;
    }

    @Override // l.y
    public final void g(x xVar) {
        this.f38726G = xVar;
    }

    @Override // l.y
    public final boolean i(SubMenuC4643E subMenuC4643E) {
        if (subMenuC4643E.hasVisibleItems()) {
            View view = this.f38725F;
            w wVar = new w(this.f38737z, this.f38732u, view, subMenuC4643E, this.f38735x);
            x xVar = this.f38726G;
            wVar.f38877h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.g(xVar);
            }
            boolean t6 = u.t(subMenuC4643E);
            wVar.f38876g = t6;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.n(t6);
            }
            wVar.f38878j = this.f38723D;
            this.f38723D = null;
            this.f38733v.c(false);
            G0 g02 = this.f38720A;
            int i = g02.f38991y;
            int k9 = g02.k();
            if ((Gravity.getAbsoluteGravity(this.f38730L, this.f38724E.getLayoutDirection()) & 7) == 5) {
                i += this.f38724E.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f38874e != null) {
                    wVar.d(i, k9, true, true);
                }
            }
            x xVar2 = this.f38726G;
            if (xVar2 != null) {
                xVar2.j(subMenuC4643E);
            }
            return true;
        }
        return false;
    }

    @Override // l.u
    public final void m(View view) {
        this.f38724E = view;
    }

    @Override // l.u
    public final void n(boolean z3) {
        this.f38734w.f38799c = z3;
    }

    @Override // l.u
    public final void o(int i) {
        this.f38730L = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f38728I = true;
        this.f38733v.c(true);
        ViewTreeObserver viewTreeObserver = this.f38727H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f38727H = this.f38725F.getViewTreeObserver();
            }
            this.f38727H.removeGlobalOnLayoutListener(this.f38721B);
            this.f38727H = null;
        }
        this.f38725F.removeOnAttachStateChangeListener(this.f38722C);
        v vVar = this.f38723D;
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
        this.f38720A.f38991y = i;
    }

    @Override // l.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f38723D = (v) onDismissListener;
    }

    @Override // l.u
    public final void r(boolean z3) {
        this.f38731M = z3;
    }

    @Override // l.u
    public final void s(int i) {
        this.f38720A.h(i);
    }

    @Override // l.InterfaceC4641C
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f38728I || (view = this.f38724E) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f38725F = view;
        G0 g02 = this.f38720A;
        g02.f38985S.setOnDismissListener(this);
        g02.f38976I = this;
        g02.f38984R = true;
        g02.f38985S.setFocusable(true);
        View view2 = this.f38725F;
        boolean z3 = this.f38727H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f38727H = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f38721B);
        }
        view2.addOnAttachStateChangeListener(this.f38722C);
        g02.f38975H = view2;
        g02.f38972E = this.f38730L;
        boolean z6 = this.J;
        Context context = this.f38732u;
        C4653j c4653j = this.f38734w;
        if (!z6) {
            this.f38729K = u.l(c4653j, context, this.f38736y);
            this.J = true;
        }
        g02.o(this.f38729K);
        g02.f38985S.setInputMethodMode(2);
        Rect rect = this.f38868n;
        g02.f38983Q = rect != null ? new Rect(rect) : null;
        g02.show();
        C4706p0 c4706p0 = g02.f38988v;
        c4706p0.setOnKeyListener(this);
        if (this.f38731M) {
            m mVar = this.f38733v;
            if (mVar.f38809F != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C5275R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c4706p0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f38809F);
                }
                frameLayout.setEnabled(false);
                c4706p0.addHeaderView(frameLayout, null, false);
            }
        }
        g02.m(c4653j);
        g02.show();
    }

    @Override // l.u
    public final void k(m mVar) {
    }
}
