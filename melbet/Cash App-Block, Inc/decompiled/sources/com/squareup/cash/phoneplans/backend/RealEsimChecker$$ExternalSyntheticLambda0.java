package com.squareup.cash.phoneplans.backend;

import android.app.Application;
import android.content.SharedPreferences;
import android.telephony.euicc.EuiccManager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.PaymentConfiguration;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class RealEsimChecker$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Application f$0;

    public /* synthetic */ RealEsimChecker$$ExternalSyntheticLambda0(Application application, int i) {
        this.$r8$classId = i;
        this.f$0 = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Application application = this.f$0;
        switch (i) {
            case 0:
                return (EuiccManager) application.getSystemService(EuiccManager.class);
            default:
                PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
                if (paymentConfiguration == null) {
                    SharedPreferences sharedPreferences = new PaymentConfiguration.Store(application).prefs;
                    String string2 = sharedPreferences.getString("key_publishable_key", null);
                    paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                    if (paymentConfiguration == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        return null;
                    }
                    PaymentConfiguration.instance = paymentConfiguration;
                }
                return paymentConfiguration.stripeAccountId;
        }
    }
}
