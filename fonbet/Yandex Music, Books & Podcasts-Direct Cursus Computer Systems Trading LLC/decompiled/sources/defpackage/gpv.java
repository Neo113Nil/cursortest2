package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gpv extends ig implements fxh {
    public final Context c;
    public final hxh d;
    public nnk e;
    public WeakReference f;
    public final /* synthetic */ hpv g;

    public gpv(hpv hpvVar, Context context, nnk nnkVar) {
        this.g = hpvVar;
        this.c = context;
        this.e = nnkVar;
        hxh hxhVar = new hxh(context);
        hxhVar.l = 1;
        this.d = hxhVar;
        hxhVar.e = this;
    }

    @Override // defpackage.fxh
    public final boolean B(hxh hxhVar, MenuItem menuItem) {
        nnk nnkVar = this.e;
        if (nnkVar != null) {
            return ((hg) nnkVar.a).f(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.fxh
    public final void a(hxh hxhVar) {
        if (this.e == null) {
            return;
        }
        h();
        dg dgVar = this.g.f.d;
        if (dgVar != null) {
            dgVar.l();
        }
    }

    @Override // defpackage.ig
    public final void b() {
        hpv hpvVar = this.g;
        if (hpvVar.i != this) {
            return;
        }
        boolean z = hpvVar.p;
        boolean z2 = hpvVar.q;
        if (z || z2) {
            hpvVar.j = this;
            hpvVar.k = this.e;
        } else {
            this.e.r(this);
        }
        this.e = null;
        hpvVar.w(false);
        ActionBarContextView actionBarContextView = hpvVar.f;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        hpvVar.c.setHideOnContentScrollEnabled(hpvVar.v);
        hpvVar.i = null;
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
        return this.d;
    }

    @Override // defpackage.ig
    public final MenuInflater e() {
        return new msr(this.c);
    }

    @Override // defpackage.ig
    public final CharSequence f() {
        return this.g.f.getSubtitle();
    }

    @Override // defpackage.ig
    public final CharSequence g() {
        return this.g.f.getTitle();
    }

    @Override // defpackage.ig
    public final void h() {
        if (this.g.i != this) {
            return;
        }
        hxh hxhVar = this.d;
        hxhVar.w();
        try {
            this.e.G(this, hxhVar);
        } finally {
            hxhVar.v();
        }
    }

    @Override // defpackage.ig
    public final boolean i() {
        return this.g.f.s;
    }

    @Override // defpackage.ig
    public final void j(View view) {
        this.g.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.ig
    public final void k(int i) {
        l(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.ig
    public final void l(CharSequence charSequence) {
        this.g.f.setSubtitle(charSequence);
    }

    @Override // defpackage.ig
    public final void m(int i) {
        n(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.ig
    public final void n(CharSequence charSequence) {
        this.g.f.setTitle(charSequence);
    }

    @Override // defpackage.ig
    public final void o(boolean z) {
        this.b = z;
        this.g.f.setTitleOptional(z);
    }
}
