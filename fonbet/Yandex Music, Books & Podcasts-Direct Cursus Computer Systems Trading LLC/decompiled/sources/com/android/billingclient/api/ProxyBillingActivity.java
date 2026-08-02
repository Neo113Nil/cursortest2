package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.l8x;
import defpackage.tzb;
import defpackage.uz2;
import defpackage.v5x;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public ResultReceiver b;
    public boolean c;
    public boolean d;
    public int e;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Intent a;
        int i3;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 110) {
            int i4 = l8x.d(intent, "ProxyBillingActivity").a;
            if (i2 == -1) {
                if (i4 != 0) {
                    i2 = -1;
                } else {
                    i4 = 0;
                    resultReceiver = this.a;
                    if (resultReceiver == null) {
                        resultReceiver.send(i4, intent != null ? intent.getExtras() : null);
                    } else {
                        if (intent == null) {
                            a = a();
                        } else if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                a = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                a.setPackage(getApplicationContext().getPackageName());
                                a.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            } else {
                                Intent a2 = a();
                                a2.putExtras(intent.getExtras());
                                a2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                a = a2;
                            }
                        } else {
                            a = a();
                            l8x.g("ProxyBillingActivity", "Got null bundle!");
                            a.putExtra("RESPONSE_CODE", 6);
                            a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            tzb a3 = uz2.a();
                            a3.b = 6;
                            a3.a = "An internal error occurred.";
                            a.putExtra("FAILURE_LOGGING_PAYLOAD", v5x.b(22, 2, a3.a()).b());
                            a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
                        if (i == 110) {
                            a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(a);
                    }
                }
            }
            l8x.g("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i4);
            resultReceiver = this.a;
            if (resultReceiver == null) {
            }
        } else if (i == 101) {
            if (intent == null) {
                l8x.g("ProxyBillingActivity", "Got null intent!");
            } else {
                int i5 = l8x.a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    l8x.g("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i3 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver2 = this.b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i3, intent != null ? intent.getExtras() : null);
                    }
                }
            }
            i3 = 0;
            resultReceiver2 = this.b;
            if (resultReceiver2 != null) {
            }
        } else {
            l8x.g("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.c = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            l8x.f("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.e = bundle.getInt("activity_code", 100);
            return;
        }
        l8x.f("ProxyBillingActivity", "Launching Play Store billing flow");
        this.e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.d = true;
                this.e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            l8x.h("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a = a();
                    if (this.d) {
                        a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a.putExtra("RESPONSE_CODE", 6);
                    a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a);
                }
            }
            this.c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.c) {
            Intent a = a();
            a.putExtra("RESPONSE_CODE", 1);
            a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i = this.e;
            if (i == 110 || i == 100) {
                a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(a);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.d);
        bundle.putInt("activity_code", this.e);
    }
}
