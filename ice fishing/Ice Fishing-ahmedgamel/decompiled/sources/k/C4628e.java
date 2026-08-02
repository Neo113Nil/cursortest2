package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.ads.LP;
import java.lang.ref.WeakReference;
import m.C4708k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4628e extends AbstractC4625b implements l.k {

    /* renamed from: A, reason: collision with root package name */
    public l.m f38505A;

    /* renamed from: v, reason: collision with root package name */
    public Context f38506v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContextView f38507w;

    /* renamed from: x, reason: collision with root package name */
    public LP f38508x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f38509y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f38510z;

    @Override // k.AbstractC4625b
    public final void a() {
        if (this.f38510z) {
            return;
        }
        this.f38510z = true;
        this.f38508x.h(this);
    }

    @Override // k.AbstractC4625b
    public final View b() {
        WeakReference weakReference = this.f38509y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC4625b
    public final l.m c() {
        return this.f38505A;
    }

    @Override // k.AbstractC4625b
    public final MenuInflater d() {
        return new C4632i(this.f38507w.getContext());
    }

    @Override // k.AbstractC4625b
    public final CharSequence e() {
        return this.f38507w.getSubtitle();
    }

    @Override // k.AbstractC4625b
    public final CharSequence f() {
        return this.f38507w.getTitle();
    }

    @Override // k.AbstractC4625b
    public final void g() {
        this.f38508x.e(this, this.f38505A);
    }

    @Override // l.k
    public final void h(l.m mVar) {
        g();
        C4708k c4708k = this.f38507w.f4493w;
        if (c4708k != null) {
            c4708k.l();
        }
    }

    @Override // k.AbstractC4625b
    public final boolean i() {
        return this.f38507w.f4488L;
    }

    @Override // k.AbstractC4625b
    public final void j(View view) {
        this.f38507w.setCustomView(view);
        this.f38509y = view != null ? new WeakReference(view) : null;
    }

    @Override // k.AbstractC4625b
    public final void k(int i) {
        l(this.f38506v.getString(i));
    }

    @Override // k.AbstractC4625b
    public final void l(CharSequence charSequence) {
        this.f38507w.setSubtitle(charSequence);
    }

    @Override // l.k
    public final boolean m(l.m mVar, MenuItem menuItem) {
        return ((InterfaceC4624a) this.f38508x.f26916u).b(this, menuItem);
    }

    @Override // k.AbstractC4625b
    public final void n(int i) {
        o(this.f38506v.getString(i));
    }

    @Override // k.AbstractC4625b
    public final void o(CharSequence charSequence) {
        this.f38507w.setTitle(charSequence);
    }

    @Override // k.AbstractC4625b
    public final void p(boolean z6) {
        this.f38498u = z6;
        this.f38507w.setTitleOptional(z6);
    }
}
