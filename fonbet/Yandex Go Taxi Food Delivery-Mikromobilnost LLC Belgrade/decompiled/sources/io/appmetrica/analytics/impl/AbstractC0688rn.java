package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.rn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0688rn {
    public static ServiceComponentsInitializer a() {
        ServiceComponentsInitializer serviceComponentsInitializer;
        String str = BuildConfig.SERVICE_COMPONENTS_INITIALIZER_CLASS_NAME;
        return (str.length() <= 0 || (serviceComponentsInitializer = (ServiceComponentsInitializer) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ServiceComponentsInitializer.class)) == null) ? new C8() : serviceComponentsInitializer;
    }
}
