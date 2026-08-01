package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.datatransport.WinterFlowTransactionManagerStack;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowWidgetDebug;
import com.google.android.datatransport.WinterFlowWidgetInterface;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int WinterFlowTransactionManagerStrategy = 0;
    public int WinterFlowVariableVersionControl = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.WinterFlowVariableVersionControl = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                WinterFlowTransactionManagerStack WinterFlowCacheManagerAgent = WinterFlowTransactionManagerStack.WinterFlowCacheManagerAgent(this);
                if (i2 == -1) {
                    WinterFlowWidgetInterface winterFlowWidgetInterface = WinterFlowCacheManagerAgent.WinterFlowThreadListener;
                    winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(3));
                } else if (i2 == 0) {
                    WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.WinterFlowVariableVersionControl = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.WinterFlowVariableVersionControl = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.WinterFlowVariableVersionControl = bundle.getInt("resolution");
        }
        if (this.WinterFlowVariableVersionControl != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(num);
                WinterFlowWidgetDebug.WinterFlowArrayNetwork.WinterFlowCacheManagerAgent(this, num.intValue(), this);
                this.WinterFlowVariableVersionControl = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException unused) {
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException unused2) {
                googleApiActivity = this;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.WinterFlowVariableVersionControl = 1;
            } catch (ActivityNotFoundException unused3) {
                if (extras.getBoolean("notify_manager", true)) {
                    WinterFlowTransactionManagerStack.WinterFlowCacheManagerAgent(googleApiActivity).WinterFlowTransactionManagerStrategy(new ConnectionResult(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.WinterFlowVariableVersionControl = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException unused4) {
                googleApiActivity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.WinterFlowVariableVersionControl);
        super.onSaveInstanceState(bundle);
    }
}
