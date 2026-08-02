package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC4651B;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4629f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38511a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4625b f38512b;

    public C4629f(Context context, AbstractC4625b abstractC4625b) {
        this.f38511a = context;
        this.f38512b = abstractC4625b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f38512b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f38512b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC4651B(this.f38511a, this.f38512b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f38512b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f38512b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f38512b.f38497n;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f38512b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f38512b.f38498u;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f38512b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f38512b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f38512b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f38512b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f38512b.f38497n = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f38512b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f38512b.p(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f38512b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f38512b.n(i);
    }
}
