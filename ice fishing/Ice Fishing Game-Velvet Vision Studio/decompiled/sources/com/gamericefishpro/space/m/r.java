package com.gamericefishpro.space.m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i2.x1;
import com.gamericefishpro.space.n.m1;
import com.gamericefishpro.space.n.n1;
import com.gamericefishpro.space.n.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final n1 A;
    public PopupWindow.OnDismissListener D;
    public View E;
    public View F;
    public n G;
    public ViewTreeObserver H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean M;
    public final Context e;
    public final i i;
    public final g v;
    public final boolean w;
    public final int y;
    public final int z;
    public final c B = new c(this, 1);
    public final x1 C = new x1(3, this);
    public int L = 0;

    public r(Context context, i iVar, View view, int i, boolean z) {
        this.e = context;
        this.i = iVar;
        this.w = z;
        this.v = new g(iVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.z = i;
        Resources resources = context.getResources();
        this.y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.E = view;
        this.A = new n1(context, i);
        iVar.b(this, context);
    }

    @Override // com.gamericefishpro.space.m.q
    public final void a() {
        View view;
        if (j()) {
            return;
        }
        if (this.I || (view = this.E) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.F = view;
        n1 n1Var = this.A;
        w wVar = n1Var.O;
        w wVar2 = n1Var.O;
        wVar.setOnDismissListener(this);
        n1Var.F = this;
        n1Var.N = true;
        wVar2.setFocusable(true);
        View view2 = this.F;
        boolean z = this.H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.H = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.B);
        }
        view2.addOnAttachStateChangeListener(this.C);
        n1Var.E = view2;
        n1Var.C = this.L;
        boolean z2 = this.J;
        Context context = this.e;
        g gVar = this.v;
        if (!z2) {
            this.K = k.m(gVar, context, this.y);
            this.J = true;
        }
        int i = this.K;
        Rect rect = n1Var.L;
        Drawable background = wVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            n1Var.v = rect.left + rect.right + i;
        } else {
            n1Var.v = i;
        }
        wVar2.setInputMethodMode(2);
        Rect rect2 = this.d;
        n1Var.M = rect2 != null ? new Rect(rect2) : null;
        n1Var.a();
        m1 m1Var = n1Var.i;
        m1Var.setOnKeyListener(this);
        if (this.M) {
            i iVar = this.i;
            if (iVar.l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.l);
                }
                frameLayout.setEnabled(false);
                m1Var.addHeaderView(frameLayout, null, false);
            }
        }
        n1Var.b(gVar);
        n1Var.a();
    }

    @Override // com.gamericefishpro.space.m.o
    public final void b(i iVar, boolean z) {
        if (iVar != this.i) {
            return;
        }
        dismiss();
        n nVar = this.G;
        if (nVar != null) {
            nVar.b(iVar, z);
        }
    }

    @Override // com.gamericefishpro.space.m.o
    public final void c() {
        this.J = false;
        g gVar = this.v;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // com.gamericefishpro.space.m.q
    public final void dismiss() {
        if (j()) {
            this.A.dismiss();
        }
    }

    @Override // com.gamericefishpro.space.m.q
    public final ListView e() {
        return this.A.i;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean f(s sVar) {
        boolean z;
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.e, sVar, this.F, this.w, this.z, 0);
            n nVar = this.G;
            mVar.h = nVar;
            k kVar = mVar.i;
            if (kVar != null) {
                kVar.g(nVar);
            }
            int size = sVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = sVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            mVar.g = z;
            k kVar2 = mVar.i;
            if (kVar2 != null) {
                kVar2.o(z);
            }
            mVar.j = this.D;
            this.D = null;
            this.i.c(false);
            n1 n1Var = this.A;
            int width = n1Var.w;
            int i2 = !n1Var.z ? 0 : n1Var.y;
            if ((Gravity.getAbsoluteGravity(this.L, this.E.getLayoutDirection()) & 7) == 5) {
                width += this.E.getWidth();
            }
            if (!mVar.b()) {
                if (mVar.e != null) {
                    mVar.d(width, i2, true, true);
                }
            }
            n nVar2 = this.G;
            if (nVar2 != null) {
                nVar2.c(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void g(n nVar) {
        this.G = nVar;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean i() {
        return false;
    }

    @Override // com.gamericefishpro.space.m.q
    public final boolean j() {
        return !this.I && this.A.O.isShowing();
    }

    @Override // com.gamericefishpro.space.m.k
    public final void n(View view) {
        this.E = view;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void o(boolean z) {
        this.v.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I = true;
        this.i.c(true);
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.H = this.F.getViewTreeObserver();
            }
            this.H.removeGlobalOnLayoutListener(this.B);
            this.H = null;
        }
        this.F.removeOnAttachStateChangeListener(this.C);
        PopupWindow.OnDismissListener onDismissListener = this.D;
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

    @Override // com.gamericefishpro.space.m.k
    public final void p(int i) {
        this.L = i;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void q(int i) {
        this.A.w = i;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void s(boolean z) {
        this.M = z;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void t(int i) {
        n1 n1Var = this.A;
        n1Var.y = i;
        n1Var.z = true;
    }

    @Override // com.gamericefishpro.space.m.k
    public final void l(i iVar) {
    }
}
