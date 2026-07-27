package kotlin.text;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarKtor implements DialogInterface.OnCancelListener {
    public final /* synthetic */ CatchingFishPayPalMVP CatchingFishReduxKtor;

    public CatchingFishSnackbarKtor(CatchingFishPayPalMVP catchingFishPayPalMVP) {
        this.CatchingFishReduxKtor = catchingFishPayPalMVP;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        CatchingFishPayPalMVP catchingFishPayPalMVP = this.CatchingFishReduxKtor;
        Dialog dialog = catchingFishPayPalMVP.CatchingFishDaggerMVVM;
        if (dialog != null) {
            catchingFishPayPalMVP.onCancel(dialog);
        }
    }
}
