package io.appmetrica.analytics.billingv6.impl;

import i1.AbstractC0252i;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements BillingInfoManager {

    /* renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f3646a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3647b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3648c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f3646a = billingInfoStorage;
        this.f3647b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f3648c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f3648c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f3647b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f3647b) {
            return;
        }
        this.f3647b = true;
        this.f3646a.saveInfo(AbstractC0252i.R(this.f3648c.values()), this.f3647b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f3648c.put(billingInfo.productId, billingInfo);
        }
        this.f3646a.saveInfo(AbstractC0252i.R(this.f3648c.values()), this.f3647b);
    }
}
