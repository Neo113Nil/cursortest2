package io.appmetrica.analytics.locationinternal.impl;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.c9f;
import defpackage.t75;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;

/* loaded from: classes5.dex */
public final class K1 {
    public final ModulePreferences a;
    public final ExponentialBackoffDataHolder b;

    public K1(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
        this.b = new ExponentialBackoffDataHolder(new C0928y1(modulePreferences), SSDPDeviceDescriptionParser.TAG_LOCATION);
    }

    public final NetworkTask a(ServiceContext serviceContext, C0872g c0872g, C0872g c0872g2, C0859c2 c0859c2, E1 e1) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C0925x1 c0925x1 = new C0925x1(serviceContext, aESRSARequestBodyEncrypter);
        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c0859c2);
        return new NetworkTask(new BlockingExecutor(), serviceContext.getNetworkContext().getExecutionPolicy(), new AllHostsExponentialBackoffPolicy(this.b), new C0916u1(serviceContext, c0872g, c0872g2, this.a, e1, c0925x1, finalConfigProvider, new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), new FullUrlFormer(c0925x1, finalConfigProvider), aESRSARequestBodyEncrypter), t75.c(new c9f()), serviceContext.getNetworkContext().getUserAgent());
    }

    public static final boolean a(int i) {
        return i != 400;
    }
}
