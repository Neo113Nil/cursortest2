package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0479l implements DialogInterface.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0481n f5110n;

    public DialogInterfaceOnDismissListenerC0479l(DialogInterfaceOnCancelListenerC0481n dialogInterfaceOnCancelListenerC0481n) {
        this.f5110n = dialogInterfaceOnCancelListenerC0481n;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0481n dialogInterfaceOnCancelListenerC0481n = this.f5110n;
        Dialog dialog = dialogInterfaceOnCancelListenerC0481n.f5120I0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0481n.onDismiss(dialog);
        }
    }
}
