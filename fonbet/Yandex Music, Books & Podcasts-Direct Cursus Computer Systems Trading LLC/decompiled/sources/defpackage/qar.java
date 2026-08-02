package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qar extends ig implements fxh {
    public Context c;
    public ActionBarContextView d;
    public nnk e;
    public WeakReference f;
    public boolean g;
    public hxh h;

    @Override // defpackage.fxh
    public final boolean B(hxh hxhVar, MenuItem menuItem) {
        return ((hg) this.e.a).f(this, menuItem);
    }

    @Override // defpackage.fxh
    public final void a(hxh hxhVar) {
        h();
        dg dgVar = this.d.d;
        if (dgVar != null) {
            dgVar.l();
        }
    }

    @Override // defpackage.ig
    public final void b() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.r(this);
    }

    @Override // defpackage.ig
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ig
    public final hxh d() {
        return this.h;
    }

    @Override // defpackage.ig
    public final MenuInflater e() {
        return new msr(this.d.getContext());
    }

    @Override // defpackage.ig
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.ig
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // defpackage.ig
    public final void h() {
        this.e.G(this, this.h);
    }

    @Override // defpackage.ig
    public final boolean i() {
        return this.d.s;
    }

    @Override // defpackage.ig
    public final void j(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.ig
    public final void k(int i) {
        l(this.c.getString(i));
    }

    @Override // defpackage.ig
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.ig
    public final void m(int i) {
        n(this.c.getString(i));
    }

    @Override // defpackage.ig
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.ig
    public final void o(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
