package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class zabe {
    public static final ExecutorService zaa;

    static {
        NumberedThreadFactory numberedThreadFactory = new NumberedThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), numberedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zaa = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
