package ru.yandex.taxi.vendor_api.push;

import defpackage.xfo;
import io.appmetrica.analytics.push.AppMetricaPush;

/* loaded from: classes10.dex */
public abstract class b {
    public final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    public final void a() {
        AppMetricaPush.getNotificationCustomizersHolder().useProviderFor(BaseAppMetricaPushInitializer$preSetup$1.b, new xfo(22)).useProviderFor(BaseAppMetricaPushInitializer$preSetup$3.b, new xfo(23)).useExtraBundleProvider(new xfo(24));
    }
}
