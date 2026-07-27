package L2;

import O2.w;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0481n {

    /* renamed from: N0, reason: collision with root package name */
    public AlertDialog f1732N0;

    /* renamed from: O0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f1733O0;

    /* renamed from: P0, reason: collision with root package name */
    public AlertDialog f1734P0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n
    public final Dialog C() {
        AlertDialog alertDialog = this.f1732N0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f5116E0 = false;
        if (this.f1734P0 == null) {
            Context d2 = d();
            w.h(d2);
            this.f1734P0 = new AlertDialog.Builder(d2).create();
        }
        return this.f1734P0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1733O0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
