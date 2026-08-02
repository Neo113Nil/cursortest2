package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.hn5;
import defpackage.l8x;
import defpackage.rh;
import defpackage.sre;
import defpackage.vh;
import defpackage.zh;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends hn5 {
    public zh a;
    public zh b;
    public ResultReceiver c;
    public ResultReceiver d;

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        this.a = registerForActivityResult(new vh(5), new rh(this) { // from class: q6x
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                qh qhVar = (qh) obj;
                switch (i) {
                    case 0:
                        Intent intent = qhVar.b;
                        int i2 = l8x.d(intent, "ProxyBillingActivityV2").a;
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.c;
                        if (resultReceiver != null) {
                            resultReceiver.send(i2, intent == null ? null : intent.getExtras());
                        }
                        int i3 = qhVar.a;
                        if (i3 != -1 || i2 != 0) {
                            l8x.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i3 + " and billing's responseCode: " + i2);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = qhVar.b;
                        int i4 = l8x.d(intent2, "ProxyBillingActivityV2").a;
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.b;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.d;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i4, intent2 == null ? null : intent2.getExtras());
                        }
                        int i5 = qhVar.a;
                        if (i5 != -1 || i4 != 0) {
                            l8x.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i5 + " and billing's responseCode: " + i4);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.b = registerForActivityResult(new vh(5), new rh(this) { // from class: q6x
            public final /* synthetic */ ProxyBillingActivityV2 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                qh qhVar = (qh) obj;
                switch (i2) {
                    case 0:
                        Intent intent = qhVar.b;
                        int i22 = l8x.d(intent, "ProxyBillingActivityV2").a;
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.b;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.c;
                        if (resultReceiver != null) {
                            resultReceiver.send(i22, intent == null ? null : intent.getExtras());
                        }
                        int i3 = qhVar.a;
                        if (i3 != -1 || i22 != 0) {
                            l8x.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i3 + " and billing's responseCode: " + i22);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent2 = qhVar.b;
                        int i4 = l8x.d(intent2, "ProxyBillingActivityV2").a;
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.b;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.d;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i4, intent2 == null ? null : intent2.getExtras());
                        }
                        int i5 = qhVar.a;
                        if (i5 != -1 || i4 != 0) {
                            l8x.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i5 + " and billing's responseCode: " + i4);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                }
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        l8x.f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            zh zhVar = this.a;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            zhVar.a(new sre(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            zh zhVar2 = this.b;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            zhVar2.a(new sre(intentSender2, null, 0, 0));
        }
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
