package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.InterfaceC4682j;
import m.C4743k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4617e extends AbstractC4614b implements InterfaceC4682j {

    /* renamed from: A, reason: collision with root package name */
    public l.l f38613A;

    /* renamed from: v, reason: collision with root package name */
    public Context f38614v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContextView f38615w;

    /* renamed from: x, reason: collision with root package name */
    public S0.l f38616x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f38617y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f38618z;

    @Override // k.AbstractC4614b
    public final void a() {
        if (this.f38618z) {
            return;
        }
        this.f38618z = true;
        this.f38616x.i(this);
    }

    @Override // k.AbstractC4614b
    public final View b() {
        WeakReference weakReference = this.f38617y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC4614b
    public final l.l c() {
        return this.f38613A;
    }

    @Override // k.AbstractC4614b
    public final MenuInflater d() {
        return new C4621i(this.f38615w.getContext());
    }

    @Override // k.AbstractC4614b
    public final CharSequence e() {
        return this.f38615w.getSubtitle();
    }

    @Override // k.AbstractC4614b
    public final CharSequence f() {
        return this.f38615w.getTitle();
    }

    @Override // k.AbstractC4614b
    public final void g() {
        this.f38616x.b(this, this.f38613A);
    }

    @Override // k.AbstractC4614b
    public final boolean h() {
        return this.f38615w.f4635L;
    }

    @Override // k.AbstractC4614b
    public final void i(View view) {
        this.f38615w.setCustomView(view);
        this.f38617y = view != null ? new WeakReference(view) : null;
    }

    @Override // l.InterfaceC4682j
    public final void j(l.l lVar) {
        g();
        C4743k c4743k = this.f38615w.f4640w;
        if (c4743k != null) {
            c4743k.l();
        }
    }

    @Override // k.AbstractC4614b
    public final void k(int i) {
        l(this.f38614v.getString(i));
    }

    @Override // k.AbstractC4614b
    public final void l(CharSequence charSequence) {
        this.f38615w.setSubtitle(charSequence);
    }

    @Override // k.AbstractC4614b
    public final void m(int i) {
        n(this.f38614v.getString(i));
    }

    @Override // k.AbstractC4614b
    public final void n(CharSequence charSequence) {
        this.f38615w.setTitle(charSequence);
    }

    @Override // l.InterfaceC4682j
    public final boolean o(l.l lVar, MenuItem menuItem) {
        return ((InterfaceC4613a) this.f38616x.f2910u).a(this, menuItem);
    }

    @Override // k.AbstractC4614b
    public final void p(boolean z8) {
        this.f38606u = z8;
        this.f38615w.setTitleOptional(z8);
    }
}
