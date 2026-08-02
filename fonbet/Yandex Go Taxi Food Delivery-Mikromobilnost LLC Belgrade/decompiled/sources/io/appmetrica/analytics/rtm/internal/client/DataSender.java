package io.appmetrica.analytics.rtm.internal.client;

import android.os.Bundle;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes9.dex */
public class DataSender {
    private final ReporterDescriptor a;
    private final IServiceReporter b;

    public DataSender(IServiceReporter iServiceReporter, ReporterDescriptor reporterDescriptor) {
        this.b = iServiceReporter;
        this.a = reporterDescriptor;
    }

    public void sendData(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_API_KEY, this.a.apiKey);
        bundle.putBoolean(Constants.KEY_IS_MAIN_REPORTER, this.a.isMain);
        bundle.putString("action", str2);
        bundle.putString(Constants.KEY_DATA, str);
        this.b.reportToService(2, bundle);
    }
}
