package com.datadog.android.core.internal;

import coil3.request.OneShotDisposable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.internal.time.DefaultTimeProvider;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.thread.NoOpScheduledExecutorService;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.gson.JsonObject;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class NoOpInternalSdkCore implements InternalSdkCore {
    public static final NoOpInternalSdkCore INSTANCE = new NoOpInternalSdkCore();
    public static final TimeInfo time;

    /* loaded from: classes4.dex */
    public final class NoOpExecutorService implements ExecutorService, AutoCloseable {
        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            ForkJoinPool.commonPool();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final List invokeAll(Collection collection) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final Object invokeAny(Collection collection) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future submit(Runnable runnable) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future submit(Runnable runnable, Object obj) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future submit(Callable callable) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
            return new ArrayList();
        }
    }

    static {
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        time = new TimeInfo(timeUnit.toNanos(currentTimeMillis), timeUnit.toNanos(currentTimeMillis), 0L, 0L);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final ScheduledExecutorService createScheduledExecutorService(String str) {
        return new NoOpScheduledExecutorService(1);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final ExecutorService createSingleThreadExecutorService(String str) {
        return new NoOpExecutorService();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final List getAllFeatures() {
        return EmptyList.INSTANCE;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final long getAppStartTimeNs() {
        return 0L;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final long getAppUptimeNs() {
        return 0L;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final DatadogContext getDatadogContext(Set set) {
        set.getClass();
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final SdkFeature getFeature(String str) {
        str.getClass();
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final OneShotDisposable getFirstPartyHostResolver() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return new OneShotDisposable(emptyMap);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final InternalLogger getInternalLogger() {
        return new zzlj(this);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final Long getLastFatalAnrSent() {
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final JsonObject getLastViewEvent() {
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final String getName() {
        return "no-op";
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final NetworkInfo getNetworkInfo() {
        return new NetworkInfo(12, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final String getService() {
        return "";
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final TimeInfo getTime() {
        return time;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final Strings getTimeProvider() {
        return new DefaultTimeProvider();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final boolean isDeveloperModeEnabled() {
        return false;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void registerFeature(Feature feature) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void removeContextUpdateReceiver(VitalReaderRunnable vitalReaderRunnable) {
        vitalReaderRunnable.getClass();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void removeEventReceiver(String str) {
        str.getClass();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setAnonymousId(UUID uuid) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setContextUpdateReceiver(VitalReaderRunnable vitalReaderRunnable) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setEventReceiver(String str, RumFeature rumFeature) {
        str.getClass();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setUserInfo(String str, Map map) {
        map.getClass();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void updateFeatureContext(String str, Function1 function1, boolean z) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void writeLastFatalAnrSent(long j) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void writeLastViewEvent(byte[] bArr) {
    }

    /* loaded from: classes4.dex */
    public final class NoOpScheduledFuture implements ScheduledFuture {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return false;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return 0;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            throw new ExecutionException("Unsupported", new UnsupportedOperationException());
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            throw new ExecutionException("Unsupported", new UnsupportedOperationException());
        }
    }
}
