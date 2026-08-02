package io.appmetrica.analytics.rtm.internal.service;

import defpackage.g8e;
import defpackage.j5i0;
import defpackage.k5i0;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.rtm.impl.w;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class UploadScheduler implements k5i0 {
    private static final long j = 30000;
    private final IHandlerExecutor a;
    private final RtmLibBuilderWrapper b;
    private final TempCacheStorage c;
    private UploadSchedulerConfig d;
    private final SystemTimeProvider e = new SystemTimeProvider();
    private final a f = new a(this);
    private final w g = new w();
    private final String h;
    private final DataSendingRestrictionProvider i;

    public UploadScheduler(IHandlerExecutor iHandlerExecutor, RtmLibBuilderWrapper rtmLibBuilderWrapper, TempCacheStorage tempCacheStorage, String str, DataSendingRestrictionProvider dataSendingRestrictionProvider) {
        this.a = iHandlerExecutor;
        this.b = rtmLibBuilderWrapper;
        this.c = tempCacheStorage;
        this.h = g8e.o("rtm-", str);
        this.i = dataSendingRestrictionProvider;
    }

    public static void a(UploadScheduler uploadScheduler) {
        UploadSchedulerConfig uploadSchedulerConfig;
        synchronized (uploadScheduler) {
            uploadSchedulerConfig = uploadScheduler.d;
        }
        if (uploadSchedulerConfig == null || !uploadSchedulerConfig.cacheEnabled) {
            return;
        }
        uploadScheduler.c.removeOlderThan(uploadScheduler.h, uploadSchedulerConfig.cacheTtl);
        Collection<TempCacheStorage.Entry> collection = uploadScheduler.c.get(uploadScheduler.h, 10);
        Iterator<TempCacheStorage.Entry> it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                TempCacheStorage.Entry next = it.next();
                if (uploadScheduler.e.currentTimeMillis() - next.getTimestamp() <= uploadSchedulerConfig.cacheTtl) {
                    try {
                        j5i0 uploadEventAndWaitResult = uploadScheduler.i.isRestricted() ? null : uploadScheduler.b.uploadEventAndWaitResult(new String(next.getData()));
                        uploadScheduler.g.getClass();
                        if (uploadEventAndWaitResult == null) {
                            break;
                        }
                        int i = uploadEventAndWaitResult.a;
                        if (!(200 <= i && i < 203) && i != 400 && i != 429 && i < 500) {
                            break;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
                uploadScheduler.c.remove(next.getId());
            } else if (collection.size() == 10) {
                uploadScheduler.a.execute(uploadScheduler.f);
                return;
            }
        }
        uploadScheduler.a.executeDelayed(uploadScheduler.f, j);
    }

    @Override // defpackage.k5i0
    public void schedule(String str) {
        this.a.execute(new b(this, str));
    }

    public synchronized void setUploadSchedulerConfig(UploadSchedulerConfig uploadSchedulerConfig) {
        try {
            UploadSchedulerConfig uploadSchedulerConfig2 = this.d;
            boolean z = uploadSchedulerConfig2 != null && uploadSchedulerConfig2.cacheEnabled;
            boolean z2 = uploadSchedulerConfig.cacheEnabled;
            this.d = uploadSchedulerConfig;
            if (z && !z2) {
                this.a.remove(this.f);
            } else if (!z && z2) {
                this.a.execute(this.f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static j5i0 a(UploadScheduler uploadScheduler, String str) {
        if (uploadScheduler.i.isRestricted()) {
            return null;
        }
        return uploadScheduler.b.uploadEventAndWaitResult(str);
    }

    public static void a(UploadScheduler uploadScheduler, j5i0 j5i0Var, String str) {
        UploadSchedulerConfig uploadSchedulerConfig;
        int i;
        synchronized (uploadScheduler) {
            uploadSchedulerConfig = uploadScheduler.d;
        }
        if (uploadSchedulerConfig != null && uploadSchedulerConfig.cacheEnabled) {
            uploadScheduler.g.getClass();
            if (j5i0Var == null || ((200 > (i = j5i0Var.a) || i >= 203) && i != 400 && i != 429 && i < 500)) {
                uploadScheduler.c.put(uploadScheduler.h, uploadScheduler.e.currentTimeMillis(), StringUtils.getUTF8Bytes(str));
            }
        }
    }
}
