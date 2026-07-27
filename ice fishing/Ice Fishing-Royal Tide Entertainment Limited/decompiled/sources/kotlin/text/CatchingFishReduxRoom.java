package kotlin.text;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class CatchingFishReduxRoom implements DialogInterface.OnDismissListener {
    public final /* synthetic */ CatchingFishPayPalMVP CatchingFishReduxKtor;

    public CatchingFishReduxRoom(CatchingFishPayPalMVP catchingFishPayPalMVP) {
        this.CatchingFishReduxKtor = catchingFishPayPalMVP;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CatchingFishPayPalMVP catchingFishPayPalMVP = this.CatchingFishReduxKtor;
        Dialog dialog = catchingFishPayPalMVP.CatchingFishDaggerMVVM;
        if (dialog != null) {
            catchingFishPayPalMVP.onDismiss(dialog);
        }
    }
}
