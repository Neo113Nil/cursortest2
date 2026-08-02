package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0473l implements DialogInterface.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0475n f4966n;

    public DialogInterfaceOnDismissListenerC0473l(DialogInterfaceOnCancelListenerC0475n dialogInterfaceOnCancelListenerC0475n) {
        this.f4966n = dialogInterfaceOnCancelListenerC0475n;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0475n dialogInterfaceOnCancelListenerC0475n = this.f4966n;
        Dialog dialog = dialogInterfaceOnCancelListenerC0475n.f4971D0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0475n.onDismiss(dialog);
        }
    }
}
