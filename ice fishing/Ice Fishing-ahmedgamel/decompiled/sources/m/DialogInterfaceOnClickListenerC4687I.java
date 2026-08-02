package m;

import Q2.C0365j;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.DialogInterfaceC4552h;

/* renamed from: m.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC4687I implements N, DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public DialogInterfaceC4552h f39076n;

    /* renamed from: u, reason: collision with root package name */
    public J f39077u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f39078v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f39079w;

    public DialogInterfaceOnClickListenerC4687I(O o4) {
        this.f39079w = o4;
    }

    @Override // m.N
    public final boolean a() {
        DialogInterfaceC4552h dialogInterfaceC4552h = this.f39076n;
        if (dialogInterfaceC4552h != null) {
            return dialogInterfaceC4552h.isShowing();
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
        DialogInterfaceC4552h dialogInterfaceC4552h = this.f39076n;
        if (dialogInterfaceC4552h != null) {
            dialogInterfaceC4552h.dismiss();
            this.f39076n = null;
        }
    }

    @Override // m.N
    public final CharSequence e() {
        return this.f39078v;
    }

    @Override // m.N
    public final void g(CharSequence charSequence) {
        this.f39078v = charSequence;
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
    public final void j(int i, int i4) {
        if (this.f39077u == null) {
            return;
        }
        O o4 = this.f39079w;
        I1.a aVar = new I1.a(o4.getPopupContext());
        CharSequence charSequence = this.f39078v;
        C0365j c0365j = (C0365j) aVar.f1304v;
        if (charSequence != null) {
            c0365j.f2571y = charSequence;
        }
        J j6 = this.f39077u;
        int selectedItemPosition = o4.getSelectedItemPosition();
        c0365j.f2564B = j6;
        c0365j.f2565C = this;
        c0365j.f2567u = selectedItemPosition;
        c0365j.f2566n = true;
        DialogInterfaceC4552h b9 = aVar.b();
        this.f39076n = b9;
        AlertController$RecycleListView alertController$RecycleListView = b9.f37923y.f37903e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f39076n.show();
    }

    @Override // m.N
    public final int k() {
        return 0;
    }

    @Override // m.N
    public final void l(ListAdapter listAdapter) {
        this.f39077u = (J) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        O o4 = this.f39079w;
        o4.setSelection(i);
        if (o4.getOnItemClickListener() != null) {
            o4.performItemClick(null, i, this.f39077u.getItemId(i));
        }
        dismiss();
    }

    @Override // m.N
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
