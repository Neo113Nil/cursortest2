package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.ads.LP;
import java.lang.ref.WeakReference;
import k.AbstractC4625b;
import k.C4632i;
import k.InterfaceC4624a;
import m.C4708k;

/* loaded from: classes.dex */
public final class L extends AbstractC4625b implements l.k {

    /* renamed from: v, reason: collision with root package name */
    public final Context f37861v;

    /* renamed from: w, reason: collision with root package name */
    public final l.m f37862w;

    /* renamed from: x, reason: collision with root package name */
    public LP f37863x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f37864y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ M f37865z;

    public L(M m9, Context context, LP lp) {
        this.f37865z = m9;
        this.f37861v = context;
        this.f37863x = lp;
        l.m mVar = new l.m(context);
        mVar.f38735E = 1;
        this.f37862w = mVar;
        mVar.f38751x = this;
    }

    @Override // k.AbstractC4625b
    public final void a() {
        M m9 = this.f37865z;
        if (m9.i != this) {
            return;
        }
        if (m9.f37882p) {
            m9.f37876j = this;
            m9.f37877k = this.f37863x;
        } else {
            this.f37863x.h(this);
        }
        this.f37863x = null;
        m9.t(false);
        ActionBarContextView actionBarContextView = m9.f37873f;
        if (actionBarContextView.f4481D == null) {
            actionBarContextView.e();
        }
        m9.f37870c.setHideOnContentScrollEnabled(m9.f37887u);
        m9.i = null;
    }

    @Override // k.AbstractC4625b
    public final View b() {
        WeakReference weakReference = this.f37864y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC4625b
    public final l.m c() {
        return this.f37862w;
    }

    @Override // k.AbstractC4625b
    public final MenuInflater d() {
        return new C4632i(this.f37861v);
    }

    @Override // k.AbstractC4625b
    public final CharSequence e() {
        return this.f37865z.f37873f.getSubtitle();
    }

    @Override // k.AbstractC4625b
    public final CharSequence f() {
        return this.f37865z.f37873f.getTitle();
    }

    @Override // k.AbstractC4625b
    public final void g() {
        if (this.f37865z.i != this) {
            return;
        }
        l.m mVar = this.f37862w;
        mVar.w();
        try {
            this.f37863x.e(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // l.k
    public final void h(l.m mVar) {
        if (this.f37863x == null) {
            return;
        }
        g();
        C4708k c4708k = this.f37865z.f37873f.f4493w;
        if (c4708k != null) {
            c4708k.l();
        }
    }

    @Override // k.AbstractC4625b
    public final boolean i() {
        return this.f37865z.f37873f.f4488L;
    }

    @Override // k.AbstractC4625b
    public final void j(View view) {
        this.f37865z.f37873f.setCustomView(view);
        this.f37864y = new WeakReference(view);
    }

    @Override // k.AbstractC4625b
    public final void k(int i) {
        l(this.f37865z.f37868a.getResources().getString(i));
    }

    @Override // k.AbstractC4625b
    public final void l(CharSequence charSequence) {
        this.f37865z.f37873f.setSubtitle(charSequence);
    }

    @Override // l.k
    public final boolean m(l.m mVar, MenuItem menuItem) {
        LP lp = this.f37863x;
        if (lp != null) {
            return ((InterfaceC4624a) lp.f26916u).b(this, menuItem);
        }
        return false;
    }

    @Override // k.AbstractC4625b
    public final void n(int i) {
        o(this.f37865z.f37868a.getResources().getString(i));
    }

    @Override // k.AbstractC4625b
    public final void o(CharSequence charSequence) {
        this.f37865z.f37873f.setTitle(charSequence);
    }

    @Override // k.AbstractC4625b
    public final void p(boolean z6) {
        this.f38498u = z6;
        this.f37865z.f37873f.setTitleOptional(z6);
    }
}
