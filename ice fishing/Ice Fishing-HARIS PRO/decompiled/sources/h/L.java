package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC0177a;
import k.C0184h;
import l.InterfaceC0227k;
import l.MenuC0229m;
import m.C0264l;

/* loaded from: classes.dex */
public final class L extends AbstractC0177a implements InterfaceC0227k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3150c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC0229m f3151d;
    public F.i e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M f3153g;

    public L(M m2, Context context, F.i iVar) {
        this.f3153g = m2;
        this.f3150c = context;
        this.e = iVar;
        MenuC0229m menuC0229m = new MenuC0229m(context);
        menuC0229m.f3717l = 1;
        this.f3151d = menuC0229m;
        menuC0229m.e = this;
    }

    @Override // k.AbstractC0177a
    public final void a() {
        M m2 = this.f3153g;
        if (m2.i != this) {
            return;
        }
        if (m2.f3168p) {
            m2.j = this;
            m2.f3163k = this.e;
        } else {
            this.e.B(this);
        }
        this.e = null;
        m2.v0(false);
        ActionBarContextView actionBarContextView = m2.f3160f;
        if (actionBarContextView.f1784k == null) {
            actionBarContextView.e();
        }
        m2.f3158c.setHideOnContentScrollEnabled(m2.f3173u);
        m2.i = null;
    }

    @Override // k.AbstractC0177a
    public final View b() {
        WeakReference weakReference = this.f3152f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0177a
    public final MenuC0229m c() {
        return this.f3151d;
    }

    @Override // k.AbstractC0177a
    public final MenuInflater d() {
        return new C0184h(this.f3150c);
    }

    @Override // k.AbstractC0177a
    public final CharSequence e() {
        return this.f3153g.f3160f.getSubtitle();
    }

    @Override // k.AbstractC0177a
    public final CharSequence f() {
        return this.f3153g.f3160f.getTitle();
    }

    @Override // k.AbstractC0177a
    public final void g() {
        if (this.f3153g.i != this) {
            return;
        }
        MenuC0229m menuC0229m = this.f3151d;
        menuC0229m.w();
        try {
            this.e.C(this, menuC0229m);
        } finally {
            menuC0229m.v();
        }
    }

    @Override // k.AbstractC0177a
    public final boolean h() {
        return this.f3153g.f3160f.f1792s;
    }

    @Override // k.AbstractC0177a
    public final void i(View view) {
        this.f3153g.f3160f.setCustomView(view);
        this.f3152f = new WeakReference(view);
    }

    @Override // k.AbstractC0177a
    public final void j(int i) {
        k(this.f3153g.f3156a.getResources().getString(i));
    }

    @Override // k.AbstractC0177a
    public final void k(CharSequence charSequence) {
        this.f3153g.f3160f.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0177a
    public final void l(int i) {
        m(this.f3153g.f3156a.getResources().getString(i));
    }

    @Override // k.AbstractC0177a
    public final void m(CharSequence charSequence) {
        this.f3153g.f3160f.setTitle(charSequence);
    }

    @Override // k.AbstractC0177a
    public final void n(boolean z2) {
        this.f3310b = z2;
        this.f3153g.f3160f.setTitleOptional(z2);
    }

    @Override // l.InterfaceC0227k
    public final boolean p(MenuC0229m menuC0229m, MenuItem menuItem) {
        F.i iVar = this.e;
        if (iVar != null) {
            return ((B.k) iVar.f208b).m(this, menuItem);
        }
        return false;
    }

    @Override // l.InterfaceC0227k
    public final void r(MenuC0229m menuC0229m) {
        if (this.e == null) {
            return;
        }
        g();
        C0264l c0264l = this.f3153g.f3160f.f1780d;
        if (c0264l != null) {
            c0264l.o();
        }
    }
}
