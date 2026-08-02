package O2;

import R2.w;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0475n {

    /* renamed from: I0, reason: collision with root package name */
    public AlertDialog f2276I0;

    /* renamed from: J0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2277J0;

    /* renamed from: K0, reason: collision with root package name */
    public AlertDialog f2278K0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n
    public final Dialog C() {
        AlertDialog alertDialog = this.f2276I0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f4981z0 = false;
        if (this.f2278K0 == null) {
            Context d9 = d();
            w.h(d9);
            this.f2278K0 = new AlertDialog.Builder(d9).create();
        }
        return this.f2278K0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2277J0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
