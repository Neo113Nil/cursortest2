package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import m.C4695k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4618e extends AbstractC4615b implements l.k {

    /* renamed from: A, reason: collision with root package name */
    public l.m f38493A;

    /* renamed from: v, reason: collision with root package name */
    public Context f38494v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContextView f38495w;

    /* renamed from: x, reason: collision with root package name */
    public S0.e f38496x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f38497y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f38498z;

    @Override // k.AbstractC4615b
    public final void a() {
        if (this.f38498z) {
            return;
        }
        this.f38498z = true;
        this.f38496x.i(this);
    }

    @Override // k.AbstractC4615b
    public final View b() {
        WeakReference weakReference = this.f38497y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC4615b
    public final l.m c() {
        return this.f38493A;
    }

    @Override // k.AbstractC4615b
    public final MenuInflater d() {
        return new C4622i(this.f38495w.getContext());
    }

    @Override // k.AbstractC4615b
    public final CharSequence e() {
        return this.f38495w.getSubtitle();
    }

    @Override // k.AbstractC4615b
    public final CharSequence f() {
        return this.f38495w.getTitle();
    }

    @Override // k.AbstractC4615b
    public final void g() {
        this.f38496x.c(this, this.f38493A);
    }

    @Override // k.AbstractC4615b
    public final boolean h() {
        return this.f38495w.f4520L;
    }

    @Override // k.AbstractC4615b
    public final void i(View view) {
        this.f38495w.setCustomView(view);
        this.f38497y = view != null ? new WeakReference(view) : null;
    }

    @Override // k.AbstractC4615b
    public final void j(int i) {
        l(this.f38494v.getString(i));
    }

    @Override // l.k
    public final void k(l.m mVar) {
        g();
        C4695k c4695k = this.f38495w.f4525w;
        if (c4695k != null) {
            c4695k.l();
        }
    }

    @Override // k.AbstractC4615b
    public final void l(CharSequence charSequence) {
        this.f38495w.setSubtitle(charSequence);
    }

    @Override // k.AbstractC4615b
    public final void m(int i) {
        n(this.f38494v.getString(i));
    }

    @Override // k.AbstractC4615b
    public final void n(CharSequence charSequence) {
        this.f38495w.setTitle(charSequence);
    }

    @Override // k.AbstractC4615b
    public final void o(boolean z3) {
        this.f38486u = z3;
        this.f38495w.setTitleOptional(z3);
    }

    @Override // l.k
    public final boolean q(l.m mVar, MenuItem menuItem) {
        return ((InterfaceC4614a) this.f38496x.f2781u).b(this, menuItem);
    }
}
