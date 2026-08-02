package io.appmetrica.analytics.billinginterface.internal.storage;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import java.util.Map;

/* loaded from: classes9.dex */
public interface BillingInfoManager {
    BillingInfo get(String str);

    boolean isFirstInappCheckOccurred();

    void markFirstInappCheckOccurred();

    void update(Map<String, BillingInfo> map);
}
