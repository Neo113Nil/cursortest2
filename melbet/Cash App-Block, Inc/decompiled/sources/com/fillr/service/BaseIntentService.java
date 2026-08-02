package com.fillr.service;

import android.app.IntentService;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;

/* loaded from: classes4.dex */
public abstract class BaseIntentService extends IntentService implements ConsumerAPIClientListener {
    public BaseIntentService() {
        super("Fillr Intent Service");
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final boolean onBeforeAPICallback() {
        return true;
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPICallProgressStart(String str) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPIError(int i) {
    }

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public final void onConsumerAPILog(String str) {
    }
}
