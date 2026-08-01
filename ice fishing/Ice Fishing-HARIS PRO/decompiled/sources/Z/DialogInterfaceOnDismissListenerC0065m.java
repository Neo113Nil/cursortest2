package Z;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: Z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0065m implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f1564a;

    public DialogInterfaceOnDismissListenerC0065m(DialogFragment dialogFragment) {
        this.f1564a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f1564a;
        Dialog dialog = dialogFragment.f1974h0;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
