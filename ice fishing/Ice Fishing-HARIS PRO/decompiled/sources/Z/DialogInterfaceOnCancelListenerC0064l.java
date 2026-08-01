package Z;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0064l implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f1563a;

    public DialogInterfaceOnCancelListenerC0064l(DialogFragment dialogFragment) {
        this.f1563a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f1563a;
        Dialog dialog = dialogFragment.f1974h0;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
