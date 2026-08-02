package io.appmetrica.analytics.rtm.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes9.dex */
public class RtmModuleEntryPoint extends ModuleServiceEntryPoint<Object> {
    private static volatile ServiceContext a;

    public static ServiceContext getServiceContext() {
        return a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return Constants.MODULE_ID;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<Object> moduleRemoteConfig) {
        a = serviceContext;
    }
}
