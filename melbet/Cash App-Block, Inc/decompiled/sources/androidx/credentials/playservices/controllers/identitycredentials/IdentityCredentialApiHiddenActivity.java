package androidx.credentials.playservices.controllers.identitycredentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController$Companion;
import androidx.credentials.playservices.controllers.CredentialProviderController;

/* loaded from: classes3.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController$Companion credentialProviderBaseController$Companion = CredentialProviderController.Companion;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.mWaitingForActivityResult) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        if (pendingIntent != null) {
            this.mWaitingForActivityResult = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), CredentialProviderController.CONTROLLER_REQUEST_CODE, null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            CredentialProviderBaseController$Companion credentialProviderBaseController$Companion = CredentialProviderController.Companion;
            CredentialProviderBaseController$Companion.reportError$credentials_play_services_auth(resultReceiver2, stringExtra, "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }
}
