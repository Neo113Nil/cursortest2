package g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.icedrifter.arcticquest.R;
import h.L;
import h.M;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    public final Context f2023g;

    /* renamed from: h, reason: collision with root package name */
    public final j f2024h;

    /* renamed from: i, reason: collision with root package name */
    public final C0148h f2025i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2026j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2027k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2028l;

    /* renamed from: m, reason: collision with root package name */
    public final M f2029m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0143c f2030n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0144d f2031o;

    /* renamed from: p, reason: collision with root package name */
    public m f2032p;

    /* renamed from: q, reason: collision with root package name */
    public View f2033q;
    public View r;

    /* renamed from: s, reason: collision with root package name */
    public o f2034s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f2035t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2036u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2037v;

    /* renamed from: w, reason: collision with root package name */
    public int f2038w;

    /* renamed from: x, reason: collision with root package name */
    public int f2039x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2040y;

    public s(int i2, Context context, View view, j jVar, boolean z2) {
        int i3 = 1;
        this.f2030n = new ViewTreeObserverOnGlobalLayoutListenerC0143c(this, i3);
        this.f2031o = new ViewOnAttachStateChangeListenerC0144d(this, i3);
        this.f2023g = context;
        this.f2024h = jVar;
        this.f2026j = z2;
        this.f2025i = new C0148h(jVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2028l = i2;
        Resources resources = context.getResources();
        this.f2027k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2033q = view;
        this.f2029m = new M(context, i2);
        jVar.b(this, context);
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        if (jVar != this.f2024h) {
            return;
        }
        dismiss();
        o oVar = this.f2034s;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // g.p
    public final void b() {
        this.f2037v = false;
        C0148h c0148h = this.f2025i;
        if (c0148h != null) {
            c0148h.notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean c() {
        return !this.f2036u && this.f2029m.f2091A.isShowing();
    }

    @Override // g.p
    public final boolean d(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f2028l, this.f2023g, this.r, tVar, this.f2026j);
            o oVar = this.f2034s;
            nVar.f2019h = oVar;
            l lVar = nVar.f2020i;
            if (lVar != null) {
                lVar.g(oVar);
            }
            boolean u2 = l.u(tVar);
            nVar.f2018g = u2;
            l lVar2 = nVar.f2020i;
            if (lVar2 != null) {
                lVar2.o(u2);
            }
            nVar.f2021j = this.f2032p;
            this.f2032p = null;
            this.f2024h.c(false);
            M m2 = this.f2029m;
            int i2 = m2.f2096j;
            int i3 = !m2.f2098l ? 0 : m2.f2097k;
            int i4 = this.f2039x;
            View view = this.f2033q;
            Field field = x.f3069a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f2033q.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f2016e != null) {
                    nVar.d(i2, i3, true, true);
                }
            }
            o oVar2 = this.f2034s;
            if (oVar2 != null) {
                oVar2.m(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // g.r
    public final void dismiss() {
        if (c()) {
            this.f2029m.dismiss();
        }
    }

    @Override // g.r
    public final ListView e() {
        return this.f2029m.f2094h;
    }

    @Override // g.r
    public final void f() {
        View view;
        if (c()) {
            return;
        }
        if (this.f2036u || (view = this.f2033q) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.r = view;
        M m2 = this.f2029m;
        m2.f2091A.setOnDismissListener(this);
        m2.r = this;
        m2.f2111z = true;
        m2.f2091A.setFocusable(true);
        View view2 = this.r;
        boolean z2 = this.f2035t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2035t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2030n);
        }
        view2.addOnAttachStateChangeListener(this.f2031o);
        m2.f2103q = view2;
        m2.f2101o = this.f2039x;
        boolean z3 = this.f2037v;
        Context context = this.f2023g;
        C0148h c0148h = this.f2025i;
        if (!z3) {
            this.f2038w = l.m(c0148h, context, this.f2027k);
            this.f2037v = true;
        }
        int i2 = this.f2038w;
        Drawable background = m2.f2091A.getBackground();
        if (background != null) {
            Rect rect = m2.f2109x;
            background.getPadding(rect);
            m2.f2095i = rect.left + rect.right + i2;
        } else {
            m2.f2095i = i2;
        }
        m2.f2091A.setInputMethodMode(2);
        Rect rect2 = this.f2010f;
        m2.f2110y = rect2 != null ? new Rect(rect2) : null;
        m2.f();
        L l2 = m2.f2094h;
        l2.setOnKeyListener(this);
        if (this.f2040y) {
            j jVar = this.f2024h;
            if (jVar.f1975l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f1975l);
                }
                frameLayout.setEnabled(false);
                l2.addHeaderView(frameLayout, null, false);
            }
        }
        m2.a(c0148h);
        m2.f();
    }

    @Override // g.p
    public final void g(o oVar) {
        this.f2034s = oVar;
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.l
    public final void n(View view) {
        this.f2033q = view;
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f2025i.f1959h = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2036u = true;
        this.f2024h.c(true);
        ViewTreeObserver viewTreeObserver = this.f2035t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2035t = this.r.getViewTreeObserver();
            }
            this.f2035t.removeGlobalOnLayoutListener(this.f2030n);
            this.f2035t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.f2031o);
        m mVar = this.f2032p;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // g.l
    public final void p(int i2) {
        this.f2039x = i2;
    }

    @Override // g.l
    public final void q(int i2) {
        this.f2029m.f2096j = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2032p = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f2040y = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        M m2 = this.f2029m;
        m2.f2097k = i2;
        m2.f2098l = true;
    }

    @Override // g.l
    public final void l(j jVar) {
    }
}
