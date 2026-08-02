package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public final class u18 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ i a;

    public u18(i iVar) {
        this.a = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        i iVar = this.a;
        dialog = iVar.mDialog;
        if (dialog != null) {
            dialog2 = iVar.mDialog;
            iVar.onDismiss(dialog2);
        }
    }
}
