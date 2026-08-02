package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ebr extends yxh implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final hxh c;
    public final dxh d;
    public final boolean e;
    public final int f;
    public final int g;
    public final eyh h;
    public PopupWindow.OnDismissListener k;
    public View l;
    public View m;
    public fyh n;
    public ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean t;
    public final vr0 i = new vr0(4, this);
    public final jb j = new jb(11, this);
    public int s = 0;

    public ebr(Context context, hxh hxhVar, View view, int i, boolean z) {
        this.b = context;
        this.c = hxhVar;
        this.e = z;
        this.d = new dxh(hxhVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.h = new eyh(context, null, i, 0);
        hxhVar.b(this, context);
    }

    @Override // defpackage.keq
    public final boolean a() {
        return !this.p && this.h.z.isShowing();
    }

    @Override // defpackage.gyh
    public final boolean b(tmr tmrVar) {
        boolean z;
        if (tmrVar.hasVisibleItems()) {
            ayh ayhVar = new ayh(this.b, tmrVar, this.m, this.e, this.g, 0);
            fyh fyhVar = this.n;
            ayhVar.h = fyhVar;
            yxh yxhVar = ayhVar.i;
            if (yxhVar != null) {
                yxhVar.d(fyhVar);
            }
            int size = tmrVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = tmrVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ayhVar.g = z;
            yxh yxhVar2 = ayhVar.i;
            if (yxhVar2 != null) {
                yxhVar2.n(z);
            }
            ayhVar.j = this.k;
            this.k = null;
            this.c.c(false);
            eyh eyhVar = this.h;
            int i2 = eyhVar.f;
            int n = eyhVar.n();
            if ((Gravity.getAbsoluteGravity(this.s, this.l.getLayoutDirection()) & 7) == 5) {
                i2 += this.l.getWidth();
            }
            if (!ayhVar.b()) {
                if (ayhVar.e != null) {
                    ayhVar.d(i2, n, true, true);
                }
            }
            fyh fyhVar2 = this.n;
            if (fyhVar2 != null) {
                fyhVar2.w(tmrVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gyh
    public final void d(fyh fyhVar) {
        this.n = fyhVar;
    }

    @Override // defpackage.keq
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // defpackage.gyh
    public final void e(hxh hxhVar, boolean z) {
        if (hxhVar != this.c) {
            return;
        }
        dismiss();
        fyh fyhVar = this.n;
        if (fyhVar != null) {
            fyhVar.e(hxhVar, z);
        }
    }

    @Override // defpackage.keq
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.p || (view = this.l) == null) {
            xq0.q("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.m = view;
        eyh eyhVar = this.h;
        or0 or0Var = eyhVar.z;
        or0 or0Var2 = eyhVar.z;
        or0Var.setOnDismissListener(this);
        eyhVar.p = this;
        eyhVar.y = true;
        or0Var2.setFocusable(true);
        View view2 = this.m;
        boolean z = this.o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        eyhVar.o = view2;
        eyhVar.l = this.s;
        boolean z2 = this.q;
        Context context = this.b;
        dxh dxhVar = this.d;
        if (!z2) {
            this.r = yxh.l(dxhVar, context, this.f);
            this.q = true;
        }
        eyhVar.r(this.r);
        or0Var2.setInputMethodMode(2);
        Rect rect = this.a;
        eyhVar.x = rect != null ? new Rect(rect) : null;
        eyhVar.f();
        nra nraVar = eyhVar.c;
        nraVar.setOnKeyListener(this);
        if (this.t) {
            hxh hxhVar = this.c;
            if (hxhVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) nraVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(hxhVar.m);
                }
                frameLayout.setEnabled(false);
                nraVar.addHeaderView(frameLayout, null, false);
            }
        }
        eyhVar.o(dxhVar);
        eyhVar.f();
    }

    @Override // defpackage.gyh
    public final void g() {
        this.q = false;
        dxh dxhVar = this.d;
        if (dxhVar != null) {
            dxhVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gyh
    public final boolean h() {
        return false;
    }

    @Override // defpackage.yxh
    public final void m(View view) {
        this.l = view;
    }

    @Override // defpackage.yxh
    public final void n(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.yxh
    public final void o(int i) {
        this.s = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.i);
            this.o = null;
        }
        this.m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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

    @Override // defpackage.keq
    public final nra p() {
        return this.h.c;
    }

    @Override // defpackage.yxh
    public final void q(int i) {
        this.h.f = i;
    }

    @Override // defpackage.yxh
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // defpackage.yxh
    public final void s(boolean z) {
        this.t = z;
    }

    @Override // defpackage.yxh
    public final void t(int i) {
        this.h.j(i);
    }

    @Override // defpackage.yxh
    public final void k(hxh hxhVar) {
    }
}
