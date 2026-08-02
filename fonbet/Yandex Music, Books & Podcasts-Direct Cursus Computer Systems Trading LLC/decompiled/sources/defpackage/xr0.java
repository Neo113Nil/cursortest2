package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class xr0 implements ds0, DialogInterface.OnClickListener {
    public p30 a;
    public yr0 b;
    public CharSequence c;
    public final /* synthetic */ es0 d;

    public xr0(es0 es0Var) {
        this.d = es0Var;
    }

    @Override // defpackage.ds0
    public final boolean a() {
        p30 p30Var = this.a;
        if (p30Var != null) {
            return p30Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.ds0
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.ds0
    public final void dismiss() {
        p30 p30Var = this.a;
        if (p30Var != null) {
            p30Var.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.ds0
    public final int e() {
        return 0;
    }

    @Override // defpackage.ds0
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ds0
    public final CharSequence h() {
        return this.c;
    }

    @Override // defpackage.ds0
    public final void i(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.ds0
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ds0
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ds0
    public final void l(int i, int i2) {
        if (this.b == null) {
            return;
        }
        es0 es0Var = this.d;
        o30 o30Var = new o30(es0Var.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            o30Var.setTitle(charSequence);
        }
        yr0 yr0Var = this.b;
        int selectedItemPosition = es0Var.getSelectedItemPosition();
        k30 k30Var = o30Var.a;
        k30Var.p = yr0Var;
        k30Var.q = this;
        k30Var.t = selectedItemPosition;
        k30Var.s = true;
        p30 create = o30Var.create();
        this.a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.ds0
    public final int n() {
        return 0;
    }

    @Override // defpackage.ds0
    public final void o(ListAdapter listAdapter) {
        this.b = (yr0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        es0 es0Var = this.d;
        es0Var.setSelection(i);
        if (es0Var.getOnItemClickListener() != null) {
            es0Var.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.ds0
    public final void q(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
