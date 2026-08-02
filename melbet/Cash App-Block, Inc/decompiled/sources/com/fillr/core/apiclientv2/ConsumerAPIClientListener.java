package com.fillr.core.apiclientv2;

import com.fillr.core.model.ModelBase;

/* loaded from: classes4.dex */
public interface ConsumerAPIClientListener {
    boolean onBeforeAPICallback();

    void onConsumerAPICallProgressStart(String str);

    void onConsumerAPIData(int i, ModelBase modelBase);

    void onConsumerAPIError(int i);

    void onConsumerAPILog(String str);
}
