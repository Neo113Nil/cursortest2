package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0469l implements DialogInterface.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0471n f4998n;

    public DialogInterfaceOnDismissListenerC0469l(DialogInterfaceOnCancelListenerC0471n dialogInterfaceOnCancelListenerC0471n) {
        this.f4998n = dialogInterfaceOnCancelListenerC0471n;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0471n dialogInterfaceOnCancelListenerC0471n = this.f4998n;
        Dialog dialog = dialogInterfaceOnCancelListenerC0471n.f5008I0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0471n.onDismiss(dialog);
        }
    }
}
