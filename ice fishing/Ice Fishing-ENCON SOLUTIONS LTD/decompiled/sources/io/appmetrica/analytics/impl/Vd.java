package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
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

/* loaded from: classes.dex */
public final class Vd {

    /* renamed from: a, reason: collision with root package name */
    public static final Vd f5231a = new Vd();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f5232b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f5233c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.0.0", "50147728");

    public final synchronized ExponentialBackoffDataHolder a(Td td) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f5232b;
            obj = linkedHashMap.get(td);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new C0843wa(C0610na.f6575I.y(), td), td.name());
                linkedHashMap.put(td, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(X4 x4) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        Zg zg = new Zg(aESRSARequestBodyEncrypter);
        C0896yb c0896yb = new C0896yb(x4);
        return new NetworkTask(new BlockingExecutor(), new C0657p5(x4.f5346a), new AllHostsExponentialBackoffPolicy(f5231a.a(Td.REPORT)), new C0798uh(x4, zg, c0896yb, new FullUrlFormer(zg, c0896yb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), x4.i(), x4.p(), x4.u(), aESRSARequestBodyEncrypter), AbstractC0083a.m(new C0546ko()), f5233c);
    }
}
