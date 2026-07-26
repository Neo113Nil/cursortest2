package android.content.Context;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterViewBindingCosmosTurbo6117 extends DialogFragment {
    public AlertDialog FrostHunterAlertDialogAuroraDelta3200;
    public Dialog FrostHunterCameraXPixelTurboCosmos9814;
    public DialogInterface.OnCancelListener FrostHunterFlowMaxDragonHero5809;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.FrostHunterFlowMaxDragonHero5809;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.FrostHunterAlertDialogAuroraDelta3200 == null) {
            Activity activity = getActivity();
            FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(activity);
            this.FrostHunterAlertDialogAuroraDelta3200 = new AlertDialog.Builder(activity).create();
        }
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }
}
