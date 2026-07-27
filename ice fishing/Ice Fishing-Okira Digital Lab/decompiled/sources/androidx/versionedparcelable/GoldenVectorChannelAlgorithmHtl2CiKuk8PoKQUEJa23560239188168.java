package androidx.versionedparcelable;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class GoldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168 extends DialogFragment {
    public DialogInterface.OnCancelListener LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public Dialog RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public AlertDialog YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == null) {
            Activity activity = getActivity();
            YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(activity);
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new AlertDialog.Builder(activity).create();
        }
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }
}
