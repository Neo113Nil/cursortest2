package kotlin.text;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class CatchingFishFluxWidget extends CatchingFishPayPalMVP {
    public DialogInterface.OnCancelListener CatchingFishGradleLiveData;
    public AlertDialog CatchingFishRetrofit;
    public Dialog CatchingFishRetrofitMVI;

    @Override // kotlin.text.CatchingFishPayPalMVP
    public final Dialog CatchingFishMutableLiveData() {
        Dialog dialog = this.CatchingFishRetrofitMVI;
        if (dialog != null) {
            return dialog;
        }
        this.CatchingFishAndroidX = false;
        if (this.CatchingFishRetrofit == null) {
            Context CatchingFishViewModelFAB = CatchingFishViewModelFAB();
            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(CatchingFishViewModelFAB);
            this.CatchingFishRetrofit = new AlertDialog.Builder(CatchingFishViewModelFAB).create();
        }
        return this.CatchingFishRetrofit;
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.CatchingFishGradleLiveData;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
