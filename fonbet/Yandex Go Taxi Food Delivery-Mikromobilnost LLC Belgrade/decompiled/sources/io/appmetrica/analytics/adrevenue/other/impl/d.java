package io.appmetrica.analytics.adrevenue.other.impl;

import android.os.Bundle;
import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.adrevenue.other.internal.ClientSideAdRevenueOtherConfigWrapper;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;

/* loaded from: classes9.dex */
public final class d implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ClientSideAdRevenueOtherConfigWrapper fromBundle(Bundle bundle) {
        return ClientSideAdRevenueOtherConfigWrapper.INSTANCE.toWrapper$ad_revenue_other_release(new e(bundle.getBoolean(BackendConfig.Restrictions.ENABLED, f.a), bundle.getBoolean("include_source", f.b)));
    }
}
