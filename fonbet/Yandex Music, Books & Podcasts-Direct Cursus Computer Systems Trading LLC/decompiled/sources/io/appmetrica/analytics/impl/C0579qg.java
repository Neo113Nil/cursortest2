package io.appmetrica.analytics.impl;

import defpackage.t75;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0579qg {
    public static final C0579qg a = new C0579qg();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.3", BuildConfig.BUILD_NUMBER);

    public static final NetworkTask a(P5 p5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        Cj cj = new Cj(aESRSARequestBodyEncrypter);
        Xc xc = new Xc(p5);
        return new NetworkTask(new BlockingExecutor(), new C0309h6(p5.a), new AllHostsExponentialBackoffPolicy(a.a(EnumC0521og.REPORT)), new Xj(p5, cj, xc, new FullUrlFormer(cj, xc), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), p5.j(), p5.q(), p5.v(), aESRSARequestBodyEncrypter), t75.c(new C0705ur()), c);
    }

    public final synchronized ExponentialBackoffDataHolder a(EnumC0521og enumC0521og) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = b;
            obj = linkedHashMap.get(enumC0521og);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new Gb(C0747wb.I.y(), enumC0521og), enumC0521og.name());
                linkedHashMap.put(enumC0521og, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }
}
