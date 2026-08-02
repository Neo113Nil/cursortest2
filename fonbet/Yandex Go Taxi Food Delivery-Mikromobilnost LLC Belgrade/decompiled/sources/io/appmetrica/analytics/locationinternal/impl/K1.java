package io.appmetrica.analytics.locationinternal.impl;

import defpackage.ifx;
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
import java.util.Collections;

/* loaded from: classes9.dex */
public final class K1 {
    public final ModulePreferences a;
    public final ExponentialBackoffDataHolder b;

    public K1(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
        this.b = new ExponentialBackoffDataHolder(new C1003y1(modulePreferences), "location");
    }

    public final NetworkTask a(ServiceContext serviceContext, C0948g c0948g, C0948g c0948g2, C0936c2 c0936c2, E1 e1) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C1000x1 c1000x1 = new C1000x1(serviceContext, aESRSARequestBodyEncrypter);
        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c0936c2);
        return new NetworkTask(new BlockingExecutor(), serviceContext.getNetworkContext().getExecutionPolicy(), new AllHostsExponentialBackoffPolicy(this.b), new C0991u1(serviceContext, c0948g, c0948g2, this.a, e1, c1000x1, finalConfigProvider, new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), new FullUrlFormer(c1000x1, finalConfigProvider), aESRSARequestBodyEncrypter), Collections.singletonList(new ifx()), serviceContext.getNetworkContext().getUserAgent());
    }

    public static final boolean a(int i) {
        return i != 400;
    }
}
