package M2;

import P2.w;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0471n {

    /* renamed from: N0, reason: collision with root package name */
    public AlertDialog f1850N0;

    /* renamed from: O0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f1851O0;

    /* renamed from: P0, reason: collision with root package name */
    public AlertDialog f1852P0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n
    public final Dialog C() {
        AlertDialog alertDialog = this.f1850N0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f5004E0 = false;
        if (this.f1852P0 == null) {
            Context d2 = d();
            w.h(d2);
            this.f1852P0 = new AlertDialog.Builder(d2).create();
        }
        return this.f1852P0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1851O0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
