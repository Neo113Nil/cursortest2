package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public final class t18 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ t18(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                dialog = iVar.mDialog;
                if (dialog != null) {
                    dialog2 = iVar.mDialog;
                    iVar.onCancel(dialog2);
                    break;
                }
                break;
            default:
                ((lbv) this.b).cancel();
                break;
        }
    }
}
