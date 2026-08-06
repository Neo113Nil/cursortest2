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
import com.watchfacestudio.spraktum.R;
import h.C0204K;
import h.L;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3110b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3111c;

    /* renamed from: d, reason: collision with root package name */
    public final h f3112d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3113e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3114f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3115g;

    /* renamed from: h, reason: collision with root package name */
    public final L f3116h;

    /* renamed from: i, reason: collision with root package name */
    public final c f3117i;

    /* renamed from: j, reason: collision with root package name */
    public final d f3118j;

    /* renamed from: k, reason: collision with root package name */
    public m f3119k;

    /* renamed from: l, reason: collision with root package name */
    public View f3120l;

    /* renamed from: m, reason: collision with root package name */
    public View f3121m;

    /* renamed from: n, reason: collision with root package name */
    public o f3122n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f3123o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3124p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3125q;

    /* renamed from: r, reason: collision with root package name */
    public int f3126r;

    /* renamed from: s, reason: collision with root package name */
    public int f3127s = 0;
    public boolean t;

    public s(int i2, Context context, View view, j jVar, boolean z2) {
        int i3 = 1;
        this.f3117i = new c(this, i3);
        this.f3118j = new d(this, i3);
        this.f3110b = context;
        this.f3111c = jVar;
        this.f3113e = z2;
        this.f3112d = new h(jVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f3115g = i2;
        Resources resources = context.getResources();
        this.f3114f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3120l = view;
        this.f3116h = new L(context, i2);
        jVar.b(this, context);
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        if (jVar != this.f3111c) {
            return;
        }
        dismiss();
        o oVar = this.f3122n;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // g.p
    public final boolean b(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f3115g, this.f3110b, this.f3121m, tVar, this.f3113e);
            o oVar = this.f3122n;
            nVar.f3106h = oVar;
            l lVar = nVar.f3107i;
            if (lVar != null) {
                lVar.d(oVar);
            }
            boolean u2 = l.u(tVar);
            nVar.f3105g = u2;
            l lVar2 = nVar.f3107i;
            if (lVar2 != null) {
                lVar2.o(u2);
            }
            nVar.f3108j = this.f3119k;
            this.f3119k = null;
            this.f3111c.c(false);
            L l2 = this.f3116h;
            int i2 = l2.f3162e;
            int i3 = !l2.f3164g ? 0 : l2.f3163f;
            int i4 = this.f3127s;
            View view = this.f3120l;
            Field field = x.f8596a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f3120l.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f3103e != null) {
                    nVar.d(i2, i3, true, true);
                }
            }
            o oVar2 = this.f3122n;
            if (oVar2 != null) {
                oVar2.e(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // g.r
    public final void c() {
        View view;
        if (i()) {
            return;
        }
        if (this.f3124p || (view = this.f3120l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3121m = view;
        L l2 = this.f3116h;
        l2.f3178v.setOnDismissListener(this);
        l2.f3170m = this;
        l2.f3177u = true;
        l2.f3178v.setFocusable(true);
        View view2 = this.f3121m;
        boolean z2 = this.f3123o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3123o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3117i);
        }
        view2.addOnAttachStateChangeListener(this.f3118j);
        l2.f3169l = view2;
        l2.f3167j = this.f3127s;
        boolean z3 = this.f3125q;
        Context context = this.f3110b;
        h hVar = this.f3112d;
        if (!z3) {
            this.f3126r = l.m(hVar, context, this.f3114f);
            this.f3125q = true;
        }
        int i2 = this.f3126r;
        Drawable background = l2.f3178v.getBackground();
        if (background != null) {
            Rect rect = l2.f3176s;
            background.getPadding(rect);
            l2.f3161d = rect.left + rect.right + i2;
        } else {
            l2.f3161d = i2;
        }
        l2.f3178v.setInputMethodMode(2);
        Rect rect2 = this.f3097a;
        l2.t = rect2 != null ? new Rect(rect2) : null;
        l2.c();
        C0204K c0204k = l2.f3160c;
        c0204k.setOnKeyListener(this);
        if (this.t) {
            j jVar = this.f3111c;
            if (jVar.f3062l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0204k, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f3062l);
                }
                frameLayout.setEnabled(false);
                c0204k.addHeaderView(frameLayout, null, false);
            }
        }
        l2.a(hVar);
        l2.c();
    }

    @Override // g.p
    public final void d(o oVar) {
        this.f3122n = oVar;
    }

    @Override // g.r
    public final void dismiss() {
        if (i()) {
            this.f3116h.dismiss();
        }
    }

    @Override // g.p
    public final boolean e() {
        return false;
    }

    @Override // g.p
    public final void h() {
        this.f3125q = false;
        h hVar = this.f3112d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean i() {
        return !this.f3124p && this.f3116h.f3178v.isShowing();
    }

    @Override // g.r
    public final ListView j() {
        return this.f3116h.f3160c;
    }

    @Override // g.l
    public final void n(View view) {
        this.f3120l = view;
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f3112d.f3046c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3124p = true;
        this.f3111c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3123o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3123o = this.f3121m.getViewTreeObserver();
            }
            this.f3123o.removeGlobalOnLayoutListener(this.f3117i);
            this.f3123o = null;
        }
        this.f3121m.removeOnAttachStateChangeListener(this.f3118j);
        m mVar = this.f3119k;
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
        this.f3127s = i2;
    }

    @Override // g.l
    public final void q(int i2) {
        this.f3116h.f3162e = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3119k = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.t = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        L l2 = this.f3116h;
        l2.f3163f = i2;
        l2.f3164g = true;
    }

    @Override // g.l
    public final void l(j jVar) {
    }
}
