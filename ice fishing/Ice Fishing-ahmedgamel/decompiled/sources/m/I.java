package m;

import O2.C0360j;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.DialogInterfaceC4548h;

/* loaded from: classes.dex */
public final class I implements N, DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public DialogInterfaceC4548h f39008n;

    /* renamed from: u, reason: collision with root package name */
    public J f39009u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f39010v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f39011w;

    public I(O o6) {
        this.f39011w = o6;
    }

    @Override // m.N
    public final boolean a() {
        DialogInterfaceC4548h dialogInterfaceC4548h = this.f39008n;
        if (dialogInterfaceC4548h != null) {
            return dialogInterfaceC4548h.isShowing();
        }
        return false;
    }

    @Override // m.N
    public final int b() {
        return 0;
    }

    @Override // m.N
    public final void d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.N
    public final void dismiss() {
        DialogInterfaceC4548h dialogInterfaceC4548h = this.f39008n;
        if (dialogInterfaceC4548h != null) {
            dialogInterfaceC4548h.dismiss();
            this.f39008n = null;
        }
    }

    @Override // m.N
    public final CharSequence e() {
        return this.f39010v;
    }

    @Override // m.N
    public final void g(CharSequence charSequence) {
        this.f39010v = charSequence;
    }

    @Override // m.N
    public final Drawable getBackground() {
        return null;
    }

    @Override // m.N
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.N
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.N
    public final void j(int i, int i6) {
        if (this.f39009u == null) {
            return;
        }
        O o6 = this.f39011w;
        G1.a aVar = new G1.a(o6.getPopupContext());
        CharSequence charSequence = this.f39010v;
        C0360j c0360j = (C0360j) aVar.f1051v;
        if (charSequence != null) {
            c0360j.f2253y = charSequence;
        }
        J j6 = this.f39009u;
        int selectedItemPosition = o6.getSelectedItemPosition();
        c0360j.f2246B = j6;
        c0360j.f2247C = this;
        c0360j.f2249u = selectedItemPosition;
        c0360j.f2248n = true;
        DialogInterfaceC4548h c9 = aVar.c();
        this.f39008n = c9;
        AlertController$RecycleListView alertController$RecycleListView = c9.f37897y.f37877e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i6);
        this.f39008n.show();
    }

    @Override // m.N
    public final int k() {
        return 0;
    }

    @Override // m.N
    public final void m(ListAdapter listAdapter) {
        this.f39009u = (J) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        O o6 = this.f39011w;
        o6.setSelection(i);
        if (o6.getOnItemClickListener() != null) {
            o6.performItemClick(null, i, this.f39009u.getItemId(i));
        }
        dismiss();
    }

    @Override // m.N
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
