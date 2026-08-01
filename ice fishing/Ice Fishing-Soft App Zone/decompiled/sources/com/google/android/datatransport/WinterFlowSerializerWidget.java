package com.google.android.datatransport;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerWidget extends WinterFlowProviderController implements Runnable {
    public static final WinterFlowSerializerWidget WinterFlowBandwidthObject;
    public static final long WinterFlowOrchestrationSubsystem;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        WinterFlowSerializerWidget winterFlowSerializerWidget = new WinterFlowSerializerWidget();
        WinterFlowBandwidthObject = winterFlowSerializerWidget;
        winterFlowSerializerWidget.WinterFlowSoftwareEngine(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        WinterFlowOrchestrationSubsystem = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // com.google.android.datatransport.WinterFlowProviderController
    public final void WinterFlowCacheTool(long j, WinterFlowCompilerNode winterFlowCompilerNode) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.google.android.datatransport.WinterFlowProviderController
    public final void WinterFlowCompilerHandler(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.WinterFlowCompilerHandler(runnable);
    }

    public final synchronized void WinterFlowConfiguration() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            unsafe.putObjectVolatile(this, WinterFlowProviderController.WinterFlowThreadListener, (Object) null);
            unsafe.putObjectVolatile(this, WinterFlowProviderController.WinterFlowTransactionAgent, (Object) null);
            notifyAll();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProviderController, com.google.android.datatransport.WinterFlowDataSourceHelper
    public final WinterFlowVersionControlView WinterFlowTransactionManagerStrategy(long j, Runnable runnable, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return WinterFlowClassConsumer.WinterFlowVariableVersionControl;
        }
        long nanoTime = System.nanoTime();
        WinterFlowMicroserviceUtility winterFlowMicroserviceUtility = new WinterFlowMicroserviceUtility(runnable, j2 + nanoTime);
        WinterFlowProxyStructure(nanoTime, winterFlowMicroserviceUtility);
        return winterFlowMicroserviceUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowProviderController
    public final Thread WinterFlowUIMiddleware() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(WinterFlowBandwidthObject.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean WinterFlowQueueService;
        WinterFlowNetworkSubsystem.WinterFlowRouterStructure.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (WinterFlowQueueService) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem();
                    if (WinterFlowSyntaxSubsystem == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = WinterFlowOrchestrationSubsystem + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            WinterFlowConfiguration();
                            if (WinterFlowQueueService()) {
                                return;
                            }
                            WinterFlowUIMiddleware();
                            return;
                        }
                        if (WinterFlowSyntaxSubsystem > j2) {
                            WinterFlowSyntaxSubsystem = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (WinterFlowSyntaxSubsystem > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            WinterFlowConfiguration();
                            if (WinterFlowQueueService()) {
                                return;
                            }
                            WinterFlowUIMiddleware();
                            return;
                        }
                        LockSupport.parkNanos(this, WinterFlowSyntaxSubsystem);
                    }
                }
            }
        } finally {
            _thread = null;
            WinterFlowConfiguration();
            if (!WinterFlowQueueService()) {
                WinterFlowUIMiddleware();
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProviderController, com.google.android.datatransport.WinterFlowResponseObject
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // com.google.android.datatransport.WinterFlowUnitTestRouter
    public final String toString() {
        return "DefaultExecutor";
    }
}
