package io.appmetrica.analytics.push.notification;

import defpackage.bms;
import defpackage.cms;
import defpackage.wls;
import defpackage.zls;
import io.appmetrica.analytics.push.impl.C1059n1;
import io.appmetrica.analytics.push.impl.C1062o1;
import io.appmetrica.analytics.push.impl.C1065p1;
import io.appmetrica.analytics.push.impl.C1068q1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class NotificationCustomizersHolder {
    private final HashMap a = new HashMap();
    private ExtraBundleProvider b;
    private NotificationCustomizer c;
    private NotificationCustomizer d;

    public NotificationCustomizer getAfterCustomizer() {
        return this.d;
    }

    public NotificationCustomizer getBeforeCustomizer() {
        return this.c;
    }

    public final Map<cms, NotificationCustomizer> getCustomizers() {
        return new HashMap(this.a);
    }

    public ExtraBundleProvider getExtraBundleProvider() {
        return this.b;
    }

    public NotificationCustomizersHolder useAfterCustomizer(NotificationCustomizer notificationCustomizer) {
        this.d = notificationCustomizer;
        return this;
    }

    public NotificationCustomizersHolder useBeforeCustomizer(NotificationCustomizer notificationCustomizer) {
        this.c = notificationCustomizer;
        return this;
    }

    public final NotificationCustomizersHolder useExtraBundleProvider(ExtraBundleProvider extraBundleProvider) {
        this.b = extraBundleProvider;
        return this;
    }

    public final <T> NotificationCustomizersHolder useListProviderFor(wls wlsVar, NotificationValueProvider<List<T>> notificationValueProvider) {
        this.a.put(wlsVar, new C1068q1(wlsVar, notificationValueProvider));
        return this;
    }

    public final <T> NotificationCustomizersHolder useProviderFor(wls wlsVar, NotificationValueProvider<T> notificationValueProvider) {
        this.a.put(wlsVar, new C1059n1(wlsVar, notificationValueProvider));
        return this;
    }

    public final <T> NotificationCustomizersHolder useProviderFor(zls zlsVar, NotificationValueProvider<List<T>> notificationValueProvider) {
        this.a.put(zlsVar, new C1062o1(zlsVar, notificationValueProvider));
        return this;
    }

    public final <T> NotificationCustomizersHolder useProviderFor(bms bmsVar, NotificationValueProvider<List<T>> notificationValueProvider) {
        this.a.put(bmsVar, new C1065p1(bmsVar, notificationValueProvider));
        return this;
    }
}
