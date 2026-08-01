package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC4640B;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4619f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38499a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4615b f38500b;

    public C4619f(Context context, AbstractC4615b abstractC4615b) {
        this.f38499a = context;
        this.f38500b = abstractC4615b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f38500b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f38500b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC4640B(this.f38499a, this.f38500b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f38500b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f38500b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f38500b.f38485n;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f38500b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f38500b.f38486u;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f38500b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f38500b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f38500b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f38500b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f38500b.f38485n = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f38500b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f38500b.o(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f38500b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f38500b.m(i);
    }
}
