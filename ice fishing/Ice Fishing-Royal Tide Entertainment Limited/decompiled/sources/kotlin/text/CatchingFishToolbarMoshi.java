package kotlin.text;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class CatchingFishToolbarMoshi implements DialogInterface.OnClickListener {
    public final /* synthetic */ Intent CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishToolbarMoshi(Intent intent, Object obj, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = intent;
        this.CatchingFishWorkManager = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.text.CatchingFishWebsocketPayPal] */
    public final void CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent intent = this.CatchingFishDaggerWebsocket;
                if (intent != null) {
                    ((GoogleApiActivity) this.CatchingFishWorkManager).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.CatchingFishDaggerWebsocket;
                if (intent2 != null) {
                    this.CatchingFishWorkManager.CatchingFishParcelableFAB(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                CatchingFishParcelableFAB();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
