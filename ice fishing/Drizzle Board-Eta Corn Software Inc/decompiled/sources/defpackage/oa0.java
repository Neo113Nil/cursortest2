package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oa0 extends ActionMode {
    public final yzvmSy3z NCTxEWno;
    public final Context qoPGr6Ce;

    public oa0(Context context, yzvmSy3z yzvmsy3z) {
        this.qoPGr6Ce = context;
        this.NCTxEWno = yzvmsy3z;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.NCTxEWno.qoPGr6Ce();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.NCTxEWno.NCTxEWno();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new ss(this.qoPGr6Ce, this.NCTxEWno.MdtA4re8());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.NCTxEWno.wxUZMvaN();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.NCTxEWno.VgvYg0wo();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.NCTxEWno.NCTxEWno;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.NCTxEWno.P7K7Inc8();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.NCTxEWno.MdtA4re8;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.NCTxEWno.Qr9iLBAD();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.NCTxEWno.jb9XjC4I();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.NCTxEWno.eVhOlqcC(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.NCTxEWno.ow5vqvCr(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.NCTxEWno.NCTxEWno = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.NCTxEWno.lDXGDhIF(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.NCTxEWno.sjUBp5pO(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.NCTxEWno.k3x7lurq(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.NCTxEWno.OnDfzHZD(i);
    }
}
