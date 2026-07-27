package kotlin.text;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class CatchingFishMockkBundle extends DialogFragment {
    public DialogInterface.OnCancelListener CatchingFishDaggerWebsocket;
    public Dialog CatchingFishReduxKtor;
    public AlertDialog CatchingFishWorkManager;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.CatchingFishDaggerWebsocket;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.CatchingFishReduxKtor;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.CatchingFishWorkManager == null) {
            Activity activity = getActivity();
            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(activity);
            this.CatchingFishWorkManager = new AlertDialog.Builder(activity).create();
        }
        return this.CatchingFishWorkManager;
    }
}
