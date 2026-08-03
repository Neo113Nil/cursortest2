package l;

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
import h3.w;
import java.lang.reflect.Field;
import m.q0;
import m.r0;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends j implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: h, reason: collision with root package name */
    public final Context f3749h;

    /* renamed from: i, reason: collision with root package name */
    public final h f3750i;

    /* renamed from: j, reason: collision with root package name */
    public final f f3751j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3752k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3753l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3754m;

    /* renamed from: n, reason: collision with root package name */
    public final r0 f3755n;

    /* renamed from: q, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3758q;

    /* renamed from: r, reason: collision with root package name */
    public View f3759r;

    /* renamed from: s, reason: collision with root package name */
    public View f3760s;

    /* renamed from: t, reason: collision with root package name */
    public m f3761t;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f3762u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3763v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3764w;

    /* renamed from: x, reason: collision with root package name */
    public int f3765x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3767z;

    /* renamed from: o, reason: collision with root package name */
    public final c f3756o = new c(this, 1);

    /* renamed from: p, reason: collision with root package name */
    public final f1.e f3757p = new f1.e(2, this);

    /* renamed from: y, reason: collision with root package name */
    public int f3766y = 0;

    public q(Context context, h hVar, View view, int i10, boolean z10) {
        this.f3749h = context;
        this.f3750i = hVar;
        this.f3752k = z10;
        this.f3751j = new f(hVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f3754m = i10;
        Resources resources = context.getResources();
        this.f3753l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3759r = view;
        this.f3755n = new r0(context, i10);
        hVar.b(this, context);
    }

    @Override // l.n
    public final void a(h hVar, boolean z10) {
        if (hVar != this.f3750i) {
            return;
        }
        dismiss();
        m mVar = this.f3761t;
        if (mVar != null) {
            mVar.a(hVar, z10);
        }
    }

    @Override // l.p
    public final void b() {
        View view;
        if (j()) {
            return;
        }
        if (this.f3763v || (view = this.f3759r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3760s = view;
        r0 r0Var = this.f3755n;
        m.r rVar = r0Var.B;
        m.r rVar2 = r0Var.B;
        rVar.setOnDismissListener(this);
        r0Var.f4412s = this;
        r0Var.A = true;
        rVar2.setFocusable(true);
        View view2 = this.f3760s;
        boolean z10 = this.f3762u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3762u = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3756o);
        }
        view2.addOnAttachStateChangeListener(this.f3757p);
        r0Var.f4411r = view2;
        r0Var.f4409p = this.f3766y;
        boolean z11 = this.f3764w;
        Context context = this.f3749h;
        f fVar = this.f3751j;
        if (!z11) {
            this.f3765x = j.m(fVar, context, this.f3753l);
            this.f3764w = true;
        }
        int i10 = this.f3765x;
        Rect rect = r0Var.f4418y;
        Drawable background = rVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            r0Var.f4403j = rect.left + rect.right + i10;
        } else {
            r0Var.f4403j = i10;
        }
        rVar2.setInputMethodMode(2);
        Rect rect2 = this.f3736g;
        r0Var.f4419z = rect2 != null ? new Rect(rect2) : null;
        r0Var.b();
        q0 q0Var = r0Var.f4402i;
        q0Var.setOnKeyListener(this);
        if (this.f3767z) {
            h hVar = this.f3750i;
            if (hVar.f3701l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) q0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(hVar.f3701l);
                }
                frameLayout.setEnabled(false);
                q0Var.addHeaderView(frameLayout, null, false);
            }
        }
        r0Var.a(fVar);
        r0Var.b();
    }

    @Override // l.n
    public final void c() {
        this.f3764w = false;
        f fVar = this.f3751j;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // l.p
    public final ListView d() {
        return this.f3755n.f4402i;
    }

    @Override // l.p
    public final void dismiss() {
        if (j()) {
            this.f3755n.dismiss();
        }
    }

    @Override // l.n
    public final void e(m mVar) {
        this.f3761t = mVar;
    }

    @Override // l.n
    public final boolean h() {
        return false;
    }

    @Override // l.n
    public final boolean i(r rVar) {
        boolean z10;
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f3749h, rVar, this.f3760s, this.f3752k, this.f3754m, 0);
            m mVar = this.f3761t;
            lVar.f3745h = mVar;
            j jVar = lVar.f3746i;
            if (jVar != null) {
                jVar.e(mVar);
            }
            int size = rVar.f3695f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = rVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            lVar.f3744g = z10;
            j jVar2 = lVar.f3746i;
            if (jVar2 != null) {
                jVar2.o(z10);
            }
            lVar.f3747j = this.f3758q;
            this.f3758q = null;
            this.f3750i.c(false);
            r0 r0Var = this.f3755n;
            int i11 = r0Var.f4404k;
            int i12 = !r0Var.f4406m ? 0 : r0Var.f4405l;
            int i13 = this.f3766y;
            View view = this.f3759r;
            Field field = w.f2829a;
            if ((Gravity.getAbsoluteGravity(i13, view.getLayoutDirection()) & 7) == 5) {
                i11 += this.f3759r.getWidth();
            }
            if (!lVar.b()) {
                if (lVar.f3742e != null) {
                    lVar.d(i11, i12, true, true);
                }
            }
            m mVar2 = this.f3761t;
            if (mVar2 != null) {
                mVar2.f(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // l.p
    public final boolean j() {
        return !this.f3763v && this.f3755n.B.isShowing();
    }

    @Override // l.j
    public final void n(View view) {
        this.f3759r = view;
    }

    @Override // l.j
    public final void o(boolean z10) {
        this.f3751j.f3685i = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3763v = true;
        this.f3750i.c(true);
        ViewTreeObserver viewTreeObserver = this.f3762u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3762u = this.f3760s.getViewTreeObserver();
            }
            this.f3762u.removeGlobalOnLayoutListener(this.f3756o);
            this.f3762u = null;
        }
        this.f3760s.removeOnAttachStateChangeListener(this.f3757p);
        PopupWindow.OnDismissListener onDismissListener = this.f3758q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.j
    public final void p(int i10) {
        this.f3766y = i10;
    }

    @Override // l.j
    public final void q(int i10) {
        this.f3755n.f4404k = i10;
    }

    @Override // l.j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3758q = onDismissListener;
    }

    @Override // l.j
    public final void s(boolean z10) {
        this.f3767z = z10;
    }

    @Override // l.j
    public final void t(int i10) {
        r0 r0Var = this.f3755n;
        r0Var.f4405l = i10;
        r0Var.f4406m = true;
    }

    @Override // l.j
    public final void l(h hVar) {
    }
}
