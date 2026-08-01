package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.C0161b;
import h.DialogInterfaceC0165f;

/* loaded from: classes.dex */
public final class K implements P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0165f f3840a;

    /* renamed from: b, reason: collision with root package name */
    public L f3841b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f3843d;

    public K(Q q2) {
        this.f3843d = q2;
    }

    @Override // m.P
    public final boolean a() {
        DialogInterfaceC0165f dialogInterfaceC0165f = this.f3840a;
        if (dialogInterfaceC0165f != null) {
            return dialogInterfaceC0165f.isShowing();
        }
        return false;
    }

    @Override // m.P
    public final CharSequence b() {
        return this.f3842c;
    }

    @Override // m.P
    public final void d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.P
    public final void dismiss() {
        DialogInterfaceC0165f dialogInterfaceC0165f = this.f3840a;
        if (dialogInterfaceC0165f != null) {
            dialogInterfaceC0165f.dismiss();
            this.f3840a = null;
        }
    }

    @Override // m.P
    public final int f() {
        return 0;
    }

    @Override // m.P
    public final void h(int i, int i2) {
        if (this.f3841b == null) {
            return;
        }
        Q q2 = this.f3843d;
        B0.g gVar = new B0.g(q2.getPopupContext());
        CharSequence charSequence = this.f3842c;
        C0161b c0161b = (C0161b) gVar.f47b;
        if (charSequence != null) {
            c0161b.f3182d = charSequence;
        }
        L l2 = this.f3841b;
        int selectedItemPosition = q2.getSelectedItemPosition();
        c0161b.f3184g = l2;
        c0161b.f3185h = this;
        c0161b.j = selectedItemPosition;
        c0161b.i = true;
        DialogInterfaceC0165f b2 = gVar.b();
        this.f3840a = b2;
        AlertController$RecycleListView alertController$RecycleListView = b2.f3207f.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f3840a.show();
    }

    @Override // m.P
    public final void j(CharSequence charSequence) {
        this.f3842c = charSequence;
    }

    @Override // m.P
    public final int k() {
        return 0;
    }

    @Override // m.P
    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.P
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.P
    public final Drawable n() {
        return null;
    }

    @Override // m.P
    public final void o(ListAdapter listAdapter) {
        this.f3841b = (L) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Q q2 = this.f3843d;
        q2.setSelection(i);
        if (q2.getOnItemClickListener() != null) {
            q2.performItemClick(null, i, this.f3841b.getItemId(i));
        }
        dismiss();
    }

    @Override // m.P
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
