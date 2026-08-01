package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.InterfaceC0227k;
import l.MenuC0229m;
import m.C0264l;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180d extends AbstractC0177a implements InterfaceC0227k {

    /* renamed from: c, reason: collision with root package name */
    public Context f3316c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f3317d;
    public F.i e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3318f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3319g;

    /* renamed from: h, reason: collision with root package name */
    public MenuC0229m f3320h;

    @Override // k.AbstractC0177a
    public final void a() {
        if (this.f3319g) {
            return;
        }
        this.f3319g = true;
        this.e.B(this);
    }

    @Override // k.AbstractC0177a
    public final View b() {
        WeakReference weakReference = this.f3318f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0177a
    public final MenuC0229m c() {
        return this.f3320h;
    }

    @Override // k.AbstractC0177a
    public final MenuInflater d() {
        return new C0184h(this.f3317d.getContext());
    }

    @Override // k.AbstractC0177a
    public final CharSequence e() {
        return this.f3317d.getSubtitle();
    }

    @Override // k.AbstractC0177a
    public final CharSequence f() {
        return this.f3317d.getTitle();
    }

    @Override // k.AbstractC0177a
    public final void g() {
        this.e.C(this, this.f3320h);
    }

    @Override // k.AbstractC0177a
    public final boolean h() {
        return this.f3317d.f1792s;
    }

    @Override // k.AbstractC0177a
    public final void i(View view) {
        this.f3317d.setCustomView(view);
        this.f3318f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.AbstractC0177a
    public final void j(int i) {
        k(this.f3316c.getString(i));
    }

    @Override // k.AbstractC0177a
    public final void k(CharSequence charSequence) {
        this.f3317d.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0177a
    public final void l(int i) {
        m(this.f3316c.getString(i));
    }

    @Override // k.AbstractC0177a
    public final void m(CharSequence charSequence) {
        this.f3317d.setTitle(charSequence);
    }

    @Override // k.AbstractC0177a
    public final void n(boolean z2) {
        this.f3310b = z2;
        this.f3317d.setTitleOptional(z2);
    }

    @Override // l.InterfaceC0227k
    public final boolean p(MenuC0229m menuC0229m, MenuItem menuItem) {
        return ((B.k) this.e.f208b).m(this, menuItem);
    }

    @Override // l.InterfaceC0227k
    public final void r(MenuC0229m menuC0229m) {
        g();
        C0264l c0264l = this.f3317d.f1780d;
        if (c0264l != null) {
            c0264l.o();
        }
    }
}
