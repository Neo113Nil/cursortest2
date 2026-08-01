package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC4615b;
import k.C4622i;
import k.InterfaceC4614a;
import m.C4695k;

/* loaded from: classes.dex */
public final class K extends AbstractC4615b implements l.k {

    /* renamed from: v, reason: collision with root package name */
    public final Context f37835v;

    /* renamed from: w, reason: collision with root package name */
    public final l.m f37836w;

    /* renamed from: x, reason: collision with root package name */
    public S0.e f37837x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f37838y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ L f37839z;

    public K(L l9, Context context, S0.e eVar) {
        this.f37839z = l9;
        this.f37835v = context;
        this.f37837x = eVar;
        l.m mVar = new l.m(context);
        mVar.f38808E = 1;
        this.f37836w = mVar;
        mVar.f38824x = this;
    }

    @Override // k.AbstractC4615b
    public final void a() {
        L l9 = this.f37839z;
        if (l9.i != this) {
            return;
        }
        if (l9.f37856p) {
            l9.f37850j = this;
            l9.f37851k = this.f37837x;
        } else {
            this.f37837x.i(this);
        }
        this.f37837x = null;
        l9.t(false);
        ActionBarContextView actionBarContextView = l9.f37847f;
        if (actionBarContextView.f4513D == null) {
            actionBarContextView.e();
        }
        l9.f37844c.setHideOnContentScrollEnabled(l9.f37861u);
        l9.i = null;
    }

    @Override // k.AbstractC4615b
    public final View b() {
        WeakReference weakReference = this.f37838y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC4615b
    public final l.m c() {
        return this.f37836w;
    }

    @Override // k.AbstractC4615b
    public final MenuInflater d() {
        return new C4622i(this.f37835v);
    }

    @Override // k.AbstractC4615b
    public final CharSequence e() {
        return this.f37839z.f37847f.getSubtitle();
    }

    @Override // k.AbstractC4615b
    public final CharSequence f() {
        return this.f37839z.f37847f.getTitle();
    }

    @Override // k.AbstractC4615b
    public final void g() {
        if (this.f37839z.i != this) {
            return;
        }
        l.m mVar = this.f37836w;
        mVar.w();
        try {
            this.f37837x.c(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // k.AbstractC4615b
    public final boolean h() {
        return this.f37839z.f37847f.f4520L;
    }

    @Override // k.AbstractC4615b
    public final void i(View view) {
        this.f37839z.f37847f.setCustomView(view);
        this.f37838y = new WeakReference(view);
    }

    @Override // k.AbstractC4615b
    public final void j(int i) {
        l(this.f37839z.f37842a.getResources().getString(i));
    }

    @Override // l.k
    public final void k(l.m mVar) {
        if (this.f37837x == null) {
            return;
        }
        g();
        C4695k c4695k = this.f37839z.f37847f.f4525w;
        if (c4695k != null) {
            c4695k.l();
        }
    }

    @Override // k.AbstractC4615b
    public final void l(CharSequence charSequence) {
        this.f37839z.f37847f.setSubtitle(charSequence);
    }

    @Override // k.AbstractC4615b
    public final void m(int i) {
        n(this.f37839z.f37842a.getResources().getString(i));
    }

    @Override // k.AbstractC4615b
    public final void n(CharSequence charSequence) {
        this.f37839z.f37847f.setTitle(charSequence);
    }

    @Override // k.AbstractC4615b
    public final void o(boolean z3) {
        this.f38486u = z3;
        this.f37839z.f37847f.setTitleOptional(z3);
    }

    @Override // l.k
    public final boolean q(l.m mVar, MenuItem menuItem) {
        S0.e eVar = this.f37837x;
        if (eVar != null) {
            return ((InterfaceC4614a) eVar.f2781u).b(this, menuItem);
        }
        return false;
    }
}
