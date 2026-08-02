package com.fillr.browsersdk.utilities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.os.CancellationSignal;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.internal.time.zzbq;

/* loaded from: classes4.dex */
public final class FillrCaptureSensitiveDataDialogManager$BoardResponseReceiver$3 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ zzbq this$1;
    public final /* synthetic */ Dialog val$dialog;
    public final /* synthetic */ boolean val$isPassword;

    public FillrCaptureSensitiveDataDialogManager$BoardResponseReceiver$3(zzbq zzbqVar, boolean z, Dialog dialog) {
        this.this$1 = zzbqVar;
        this.val$isPassword = z;
        this.val$dialog = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        zzbq zzbqVar = this.this$1;
        boolean z = this.val$isPassword;
        Dialog dialog = this.val$dialog;
        switch (i) {
            case 0:
                Intent intent = new Intent("com.fillr.service.CaptureFieldsMappingService.SensitiveDataSave");
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_password", z);
                CancellationSignal cancellationSignal = (CancellationSignal) zzbqVar.zza;
                bundle.putBoolean("do_not_ask_again", cancellationSignal.mCancelInProgress);
                bundle.putBoolean("save_to_profile", false);
                intent.putExtras(bundle);
                LocalBroadcastManager.getInstance(((Fillr) cancellationSignal.mOnCancelListener).parentActivity).sendBroadcast(intent);
                dialog.dismiss();
                break;
            default:
                dialog.dismiss();
                Intent intent2 = new Intent("com.fillr.service.CaptureFieldsMappingService.SensitiveDataSave");
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("is_password", z);
                CancellationSignal cancellationSignal2 = (CancellationSignal) zzbqVar.zza;
                bundle2.putBoolean("do_not_ask_again", cancellationSignal2.mCancelInProgress);
                bundle2.putBoolean("save_to_profile", true);
                intent2.putExtras(bundle2);
                LocalBroadcastManager.getInstance(((Fillr) cancellationSignal2.mOnCancelListener).parentActivity).sendBroadcast(intent2);
                break;
        }
    }

    public FillrCaptureSensitiveDataDialogManager$BoardResponseReceiver$3(zzbq zzbqVar, Dialog dialog, boolean z) {
        this.this$1 = zzbqVar;
        this.val$dialog = dialog;
        this.val$isPassword = z;
    }
}
