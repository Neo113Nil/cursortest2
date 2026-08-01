package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC0213B;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3321a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0177a f3322b;

    public C0181e(Context context, AbstractC0177a abstractC0177a) {
        this.f3321a = context;
        this.f3322b = abstractC0177a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3322b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3322b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0213B(this.f3321a, this.f3322b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3322b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3322b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3322b.f3309a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3322b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3322b.f3310b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3322b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3322b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3322b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3322b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3322b.f3309a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3322b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3322b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3322b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3322b.l(i);
    }
}
