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
import com.icecatchbiger.hookfrostmaster.R;
import h.L;
import h.M;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: f, reason: collision with root package name */
    public final Context f2031f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2032g;

    /* renamed from: h, reason: collision with root package name */
    public final C0148h f2033h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2034i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2035j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2036k;

    /* renamed from: l, reason: collision with root package name */
    public final M f2037l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0143c f2038m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0144d f2039n;

    /* renamed from: o, reason: collision with root package name */
    public m f2040o;

    /* renamed from: p, reason: collision with root package name */
    public View f2041p;

    /* renamed from: q, reason: collision with root package name */
    public View f2042q;
    public o r;

    /* renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f2043s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2044t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2045u;

    /* renamed from: v, reason: collision with root package name */
    public int f2046v;

    /* renamed from: w, reason: collision with root package name */
    public int f2047w = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2048x;

    public s(int i2, Context context, View view, j jVar, boolean z2) {
        int i3 = 1;
        this.f2038m = new ViewTreeObserverOnGlobalLayoutListenerC0143c(this, i3);
        this.f2039n = new ViewOnAttachStateChangeListenerC0144d(this, i3);
        this.f2031f = context;
        this.f2032g = jVar;
        this.f2034i = z2;
        this.f2033h = new C0148h(jVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2036k = i2;
        Resources resources = context.getResources();
        this.f2035j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2041p = view;
        this.f2037l = new M(context, i2);
        jVar.b(this, context);
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        if (jVar != this.f2032g) {
            return;
        }
        dismiss();
        o oVar = this.r;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // g.p
    public final void b() {
        this.f2045u = false;
        C0148h c0148h = this.f2033h;
        if (c0148h != null) {
            c0148h.notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean c() {
        return !this.f2044t && this.f2037l.f2120z.isShowing();
    }

    @Override // g.p
    public final boolean d(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f2036k, this.f2031f, this.f2042q, tVar, this.f2034i);
            o oVar = this.r;
            nVar.f2027h = oVar;
            l lVar = nVar.f2028i;
            if (lVar != null) {
                lVar.g(oVar);
            }
            boolean u2 = l.u(tVar);
            nVar.f2026g = u2;
            l lVar2 = nVar.f2028i;
            if (lVar2 != null) {
                lVar2.o(u2);
            }
            nVar.f2029j = this.f2040o;
            this.f2040o = null;
            this.f2032g.c(false);
            M m2 = this.f2037l;
            int i2 = m2.f2104i;
            int i3 = !m2.f2106k ? 0 : m2.f2105j;
            int i4 = this.f2047w;
            View view = this.f2041p;
            Field field = x.f3074a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f2041p.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f2024e != null) {
                    nVar.d(i2, i3, true, true);
                }
            }
            o oVar2 = this.r;
            if (oVar2 != null) {
                oVar2.n(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // g.r
    public final void dismiss() {
        if (c()) {
            this.f2037l.dismiss();
        }
    }

    @Override // g.r
    public final ListView e() {
        return this.f2037l.f2102g;
    }

    @Override // g.r
    public final void f() {
        View view;
        if (c()) {
            return;
        }
        if (this.f2044t || (view = this.f2041p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2042q = view;
        M m2 = this.f2037l;
        m2.f2120z.setOnDismissListener(this);
        m2.f2112q = this;
        m2.f2119y = true;
        m2.f2120z.setFocusable(true);
        View view2 = this.f2042q;
        boolean z2 = this.f2043s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2043s = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2038m);
        }
        view2.addOnAttachStateChangeListener(this.f2039n);
        m2.f2111p = view2;
        m2.f2109n = this.f2047w;
        boolean z3 = this.f2045u;
        Context context = this.f2031f;
        C0148h c0148h = this.f2033h;
        if (!z3) {
            this.f2046v = l.m(c0148h, context, this.f2035j);
            this.f2045u = true;
        }
        int i2 = this.f2046v;
        Drawable background = m2.f2120z.getBackground();
        if (background != null) {
            Rect rect = m2.f2117w;
            background.getPadding(rect);
            m2.f2103h = rect.left + rect.right + i2;
        } else {
            m2.f2103h = i2;
        }
        m2.f2120z.setInputMethodMode(2);
        Rect rect2 = this.f2018e;
        m2.f2118x = rect2 != null ? new Rect(rect2) : null;
        m2.f();
        L l2 = m2.f2102g;
        l2.setOnKeyListener(this);
        if (this.f2048x) {
            j jVar = this.f2032g;
            if (jVar.f1983l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f1983l);
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
        this.r = oVar;
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.l
    public final void n(View view) {
        this.f2041p = view;
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f2033h.f1967g = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2044t = true;
        this.f2032g.c(true);
        ViewTreeObserver viewTreeObserver = this.f2043s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2043s = this.f2042q.getViewTreeObserver();
            }
            this.f2043s.removeGlobalOnLayoutListener(this.f2038m);
            this.f2043s = null;
        }
        this.f2042q.removeOnAttachStateChangeListener(this.f2039n);
        m mVar = this.f2040o;
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
        this.f2047w = i2;
    }

    @Override // g.l
    public final void q(int i2) {
        this.f2037l.f2104i = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2040o = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f2048x = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        M m2 = this.f2037l;
        m2.f2105j = i2;
        m2.f2106k = true;
    }

    @Override // g.l
    public final void l(j jVar) {
    }
}
