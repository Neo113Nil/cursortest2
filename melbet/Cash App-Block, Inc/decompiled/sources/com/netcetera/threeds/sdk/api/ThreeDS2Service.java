package com.netcetera.threeds.sdk.api;

import android.content.Context;
import com.netcetera.threeds.sdk.api.configparameters.ConfigParameters;
import com.netcetera.threeds.sdk.api.info.SDKInfo;
import com.netcetera.threeds.sdk.api.security.Warning;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ThreeDS2Service {

    public interface InitializationCallback {
        void onCompleted();

        void onError(Throwable th);
    }

    void cleanup(Context context);

    Transaction createTransaction(String str, String str2);

    Transaction createTransaction(String str, String str2, Map<String, String> map);

    SDKInfo getSDKInfo();

    String getSDKVersion();

    List<Warning> getWarnings();

    @Deprecated
    void initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization);

    void initialize(Context context, ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, UiCustomization> map);

    void initialize(Context context, ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, UiCustomization> map, InitializationCallback initializationCallback);
}
