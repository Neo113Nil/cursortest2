package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.t75;
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
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class Q8 extends C0560pq {
    public final Sn d;
    public final Hr e;

    public Q8(@NonNull J8 j8, @NonNull No no, @NonNull Sn sn, @NonNull Hr hr) {
        super(j8, no);
        this.d = sn;
        this.e = hr;
    }

    public final void a(@NonNull H6 h6) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        if (C0747wb.I.h().isRestrictedForSdk() || this.c.get()) {
            return;
        }
        this.b.a();
        Pb pb = this.a;
        Context context = ((J8) pb).a;
        ConfigProvider configProvider = (ConfigProvider) pb;
        Sn sn = this.d;
        Hr hr = this.e;
        C0607rg c0607rg = C0607rg.a;
        FullUrlFormer fullUrlFormer = new FullUrlFormer(new L8(), configProvider);
        BlockingExecutor blockingExecutor = new BlockingExecutor();
        X5 x5 = new X5(new Tk(C0747wb.I.h()), new C0309h6(context));
        C0607rg c0607rg2 = C0607rg.a;
        EnumC0521og enumC0521og = EnumC0521og.DIAGNOSTIC;
        synchronized (c0607rg2) {
            try {
                LinkedHashMap linkedHashMap = C0607rg.b;
                Object obj = linkedHashMap.get(enumC0521og);
                if (obj == null) {
                    obj = new ExponentialBackoffDataHolder(new Gb(C0747wb.I.y(), enumC0521og), "DIAGNOSTIC");
                    linkedHashMap.put(enumC0521og, obj);
                }
                exponentialBackoffDataHolder = (ExponentialBackoffDataHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        a(new NetworkTask(blockingExecutor, x5, new AllHostsExponentialBackoffPolicy(exponentialBackoffDataHolder), new M8(configProvider, h6, sn, hr, new DefaultNetworkResponseHandler(), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), fullUrlFormer), t75.c(new C0705ur()), C0607rg.c));
    }

    @NonNull
    public final Sn h() {
        return this.d;
    }
}
