package m;

import N2.C0324j;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.DialogInterfaceC4550i;

/* renamed from: m.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC4722I implements N, DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public DialogInterfaceC4550i f39275n;

    /* renamed from: u, reason: collision with root package name */
    public J f39276u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f39277v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f39278w;

    public DialogInterfaceOnClickListenerC4722I(O o9) {
        this.f39278w = o9;
    }

    @Override // m.N
    public final boolean a() {
        DialogInterfaceC4550i dialogInterfaceC4550i = this.f39275n;
        if (dialogInterfaceC4550i != null) {
            return dialogInterfaceC4550i.isShowing();
        }
        return false;
    }

    @Override // m.N
    public final int b() {
        return 0;
    }

    @Override // m.N
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.N
    public final CharSequence d() {
        return this.f39277v;
    }

    @Override // m.N
    public final void dismiss() {
        DialogInterfaceC4550i dialogInterfaceC4550i = this.f39275n;
        if (dialogInterfaceC4550i != null) {
            dialogInterfaceC4550i.dismiss();
            this.f39275n = null;
        }
    }

    @Override // m.N
    public final void e(CharSequence charSequence) {
        this.f39277v = charSequence;
    }

    @Override // m.N
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.N
    public final Drawable getBackground() {
        return null;
    }

    @Override // m.N
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.N
    public final void j(int i, int i4) {
        if (this.f39276u == null) {
            return;
        }
        O o9 = this.f39278w;
        G1.a aVar = new G1.a(o9.getPopupContext());
        CharSequence charSequence = this.f39277v;
        C0324j c0324j = (C0324j) aVar.f1195v;
        if (charSequence != null) {
            c0324j.f2070y = charSequence;
        }
        J j9 = this.f39276u;
        int selectedItemPosition = o9.getSelectedItemPosition();
        c0324j.f2063B = j9;
        c0324j.f2064C = this;
        c0324j.f2066u = selectedItemPosition;
        c0324j.f2065n = true;
        DialogInterfaceC4550i b9 = aVar.b();
        this.f39275n = b9;
        AlertController$RecycleListView alertController$RecycleListView = b9.f38112y.f38092e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f39275n.show();
    }

    @Override // m.N
    public final int k() {
        return 0;
    }

    @Override // m.N
    public final void l(ListAdapter listAdapter) {
        this.f39276u = (J) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        O o9 = this.f39278w;
        o9.setSelection(i);
        if (o9.getOnItemClickListener() != null) {
            o9.performItemClick(null, i, this.f39276u.getItemId(i));
        }
        dismiss();
    }

    @Override // m.N
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
