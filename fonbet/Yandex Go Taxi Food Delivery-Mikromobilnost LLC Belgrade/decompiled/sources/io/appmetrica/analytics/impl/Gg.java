package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
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
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class Gg {
    public static final Gg a = new Gg();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.2.0", BuildConfig.BUILD_NUMBER);

    public static final NetworkTask a(Wp wp, C0864xp c0864xp) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        C0719sp c0719sp = new C0719sp(new Ug(), Jb.I.p());
        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c0864xp);
        SynchronizedBlockingExecutor synchronizedBlockingExecutor = new SynchronizedBlockingExecutor();
        C0469k6 c0469k6 = new C0469k6(wp.a.a);
        Gg gg = a;
        Eg eg = Eg.STARTUP;
        synchronized (gg) {
            try {
                LinkedHashMap linkedHashMap = b;
                Object obj = linkedHashMap.get(eg);
                if (obj == null) {
                    obj = new ExponentialBackoffDataHolder(new Wb(Jb.I.y(), eg), "STARTUP");
                    linkedHashMap.put(eg, obj);
                }
                exponentialBackoffDataHolder = (ExponentialBackoffDataHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new NetworkTask(synchronizedBlockingExecutor, c0469k6, new AllHostsExponentialBackoffPolicy(exponentialBackoffDataHolder), new Up(wp, new C0546mp(), new FullUrlFormer(c0719sp, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), EmptyList.a, c);
    }

    public static final NetworkTask a(S5 s5) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        Mj mj = new Mj(aESRSARequestBodyEncrypter);
        C0563nd c0563nd = new C0563nd(s5);
        BlockingExecutor blockingExecutor = new BlockingExecutor();
        C0469k6 c0469k6 = new C0469k6(s5.a);
        Gg gg = a;
        Eg eg = Eg.REPORT;
        synchronized (gg) {
            try {
                LinkedHashMap linkedHashMap = b;
                Object obj = linkedHashMap.get(eg);
                if (obj == null) {
                    obj = new ExponentialBackoffDataHolder(new Wb(Jb.I.y(), eg), "REPORT");
                    linkedHashMap.put(eg, obj);
                }
                exponentialBackoffDataHolder = (ExponentialBackoffDataHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new NetworkTask(blockingExecutor, c0469k6, new AllHostsExponentialBackoffPolicy(exponentialBackoffDataHolder), new C0368gk(s5, mj, c0563nd, new FullUrlFormer(mj, c0563nd), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), aESRSARequestBodyEncrypter), Collections.singletonList(new Nr()), c);
    }
}
