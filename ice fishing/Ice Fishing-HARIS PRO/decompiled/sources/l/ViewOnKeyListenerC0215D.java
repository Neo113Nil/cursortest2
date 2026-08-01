package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.lumenpath.harispro.hrnavigator.R;
import m.C0276r0;
import m.J0;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0215D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3633b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0229m f3634c;

    /* renamed from: d, reason: collision with root package name */
    public final C0226j f3635d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3636f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3637g;

    /* renamed from: h, reason: collision with root package name */
    public final J0 f3638h;

    /* renamed from: k, reason: collision with root package name */
    public v f3639k;

    /* renamed from: l, reason: collision with root package name */
    public View f3640l;

    /* renamed from: m, reason: collision with root package name */
    public View f3641m;

    /* renamed from: n, reason: collision with root package name */
    public x f3642n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f3643o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3644p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3645q;

    /* renamed from: r, reason: collision with root package name */
    public int f3646r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3648t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0220d i = new ViewTreeObserverOnGlobalLayoutListenerC0220d(1, this);
    public final V0.n j = new V0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f3647s = 0;

    public ViewOnKeyListenerC0215D(int i, Context context, View view, MenuC0229m menuC0229m, boolean z2) {
        this.f3633b = context;
        this.f3634c = menuC0229m;
        this.e = z2;
        this.f3635d = new C0226j(menuC0229m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f3637g = i;
        Resources resources = context.getResources();
        this.f3636f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3640l = view;
        this.f3638h = new J0(context, null, i);
        menuC0229m.b(this, context);
    }

    @Override // l.InterfaceC0214C
    public final boolean a() {
        return !this.f3644p && this.f3638h.f3828z.isShowing();
    }

    @Override // l.y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        if (menuC0229m != this.f3634c) {
            return;
        }
        dismiss();
        x xVar = this.f3642n;
        if (xVar != null) {
            xVar.b(menuC0229m, z2);
        }
    }

    @Override // l.InterfaceC0214C
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.f3644p || (view = this.f3640l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3641m = view;
        J0 j02 = this.f3638h;
        j02.f3828z.setOnDismissListener(this);
        j02.f3818p = this;
        j02.f3827y = true;
        j02.f3828z.setFocusable(true);
        View view2 = this.f3641m;
        boolean z2 = this.f3643o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3643o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        j02.f3817o = view2;
        j02.f3814l = this.f3647s;
        boolean z3 = this.f3645q;
        Context context = this.f3633b;
        C0226j c0226j = this.f3635d;
        if (!z3) {
            this.f3646r = u.p(c0226j, context, this.f3636f);
            this.f3645q = true;
        }
        j02.r(this.f3646r);
        j02.f3828z.setInputMethodMode(2);
        Rect rect = this.f3769a;
        j02.f3826x = rect != null ? new Rect(rect) : null;
        j02.c();
        C0276r0 c0276r0 = j02.f3808c;
        c0276r0.setOnKeyListener(this);
        if (this.f3648t) {
            MenuC0229m menuC0229m = this.f3634c;
            if (menuC0229m.f3718m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0276r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0229m.f3718m);
                }
                frameLayout.setEnabled(false);
                c0276r0.addHeaderView(frameLayout, null, false);
            }
        }
        j02.o(c0226j);
        j02.c();
    }

    @Override // l.InterfaceC0214C
    public final void dismiss() {
        if (a()) {
            this.f3638h.dismiss();
        }
    }

    @Override // l.y
    public final boolean e(SubMenuC0216E subMenuC0216E) {
        if (subMenuC0216E.hasVisibleItems()) {
            View view = this.f3641m;
            w wVar = new w(this.f3637g, this.f3633b, view, subMenuC0216E, this.e);
            x xVar = this.f3642n;
            wVar.f3777h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.h(xVar);
            }
            boolean x2 = u.x(subMenuC0216E);
            wVar.f3776g = x2;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.r(x2);
            }
            wVar.j = this.f3639k;
            this.f3639k = null;
            this.f3634c.c(false);
            J0 j02 = this.f3638h;
            int i = j02.f3810f;
            int k2 = j02.k();
            if ((Gravity.getAbsoluteGravity(this.f3647s, this.f3640l.getLayoutDirection()) & 7) == 5) {
                i += this.f3640l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.e != null) {
                    wVar.d(i, k2, true, true);
                }
            }
            x xVar2 = this.f3642n;
            if (xVar2 != null) {
                xVar2.j(subMenuC0216E);
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC0214C
    public final C0276r0 g() {
        return this.f3638h.f3808c;
    }

    @Override // l.y
    public final void h(x xVar) {
        this.f3642n = xVar;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final Parcelable l() {
        return null;
    }

    @Override // l.y
    public final void m(boolean z2) {
        this.f3645q = false;
        C0226j c0226j = this.f3635d;
        if (c0226j != null) {
            c0226j.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void n(Parcelable parcelable) {
    }

    @Override // l.u
    public final void o(MenuC0229m menuC0229m) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3644p = true;
        this.f3634c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3643o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3643o = this.f3641m.getViewTreeObserver();
            }
            this.f3643o.removeGlobalOnLayoutListener(this.i);
            this.f3643o = null;
        }
        this.f3641m.removeOnAttachStateChangeListener(this.j);
        v vVar = this.f3639k;
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
    public final void q(View view) {
        this.f3640l = view;
    }

    @Override // l.u
    public final void r(boolean z2) {
        this.f3635d.f3705c = z2;
    }

    @Override // l.u
    public final void s(int i) {
        this.f3647s = i;
    }

    @Override // l.u
    public final void t(int i) {
        this.f3638h.f3810f = i;
    }

    @Override // l.u
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f3639k = (v) onDismissListener;
    }

    @Override // l.u
    public final void v(boolean z2) {
        this.f3648t = z2;
    }

    @Override // l.u
    public final void w(int i) {
        this.f3638h.m(i);
    }
}
