package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.screenshot.internal.ClientSideScreenshotConfigWrapper;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1102g implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ClientSideScreenshotConfigWrapper fromBundle(Bundle bundle) {
        boolean z = bundle.getBoolean(BackendConfig.Restrictions.ENABLED, AbstractC1108m.a);
        C1104i c1104i = new C1104i(bundle.getBoolean("api_captor_enabled", AbstractC1108m.c));
        C1107l c1107l = new C1107l(bundle.getBoolean("service_captor_enabled", AbstractC1108m.d), bundle.getLong("service_captor_delay_seconds", AbstractC1108m.e));
        boolean z2 = bundle.getBoolean("content_observer_enabled", AbstractC1108m.f);
        List stringArrayList = bundle.getStringArrayList("content_observer_media_store_column_names");
        if (stringArrayList == null) {
            stringArrayList = AbstractC1108m.b;
        }
        return ClientSideScreenshotConfigWrapper.INSTANCE.toWrapper$screenshot_release(new C1106k(z, c1104i, c1107l, new C1105j(z2, stringArrayList, bundle.getLong("content_observer_detect_window_seconds", AbstractC1108m.g))));
    }
}
