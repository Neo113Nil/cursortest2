package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class V8 extends Gq {
    public final C0545mo d;
    public final as e;

    public V8(O8 o8, InterfaceC0344fp interfaceC0344fp, C0545mo c0545mo, as asVar) {
        super(o8, interfaceC0344fp);
        this.d = c0545mo;
        this.e = asVar;
    }

    public final void a(K6 k6) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        if (Jb.I.h().isRestrictedForSdk() || this.c.get()) {
            return;
        }
        this.b.a();
        InterfaceC0302ec interfaceC0302ec = this.a;
        Context context = ((O8) interfaceC0302ec).a;
        ConfigProvider configProvider = (ConfigProvider) interfaceC0302ec;
        C0545mo c0545mo = this.d;
        as asVar = this.e;
        Hg hg = Hg.a;
        FullUrlFormer fullUrlFormer = new FullUrlFormer(new Q8(), configProvider);
        BlockingExecutor blockingExecutor = new BlockingExecutor();
        C0181a6 c0181a6 = new C0181a6(new C0283dl(Jb.I.h()), new C0469k6(context));
        Hg hg2 = Hg.a;
        Eg eg = Eg.DIAGNOSTIC;
        synchronized (hg2) {
            try {
                LinkedHashMap linkedHashMap = Hg.b;
                Object obj = linkedHashMap.get(eg);
                if (obj == null) {
                    obj = new ExponentialBackoffDataHolder(new Wb(Jb.I.y(), eg), "DIAGNOSTIC");
                    linkedHashMap.put(eg, obj);
                }
                exponentialBackoffDataHolder = (ExponentialBackoffDataHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        a(new NetworkTask(blockingExecutor, c0181a6, new AllHostsExponentialBackoffPolicy(exponentialBackoffDataHolder), new R8(configProvider, k6, c0545mo, asVar, new DefaultNetworkResponseHandler(), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), fullUrlFormer), Collections.singletonList(new Nr()), Hg.c));
    }

    public final C0545mo h() {
        return this.d;
    }
}
