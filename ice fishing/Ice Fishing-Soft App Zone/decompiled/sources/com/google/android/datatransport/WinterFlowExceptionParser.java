package com.google.android.datatransport;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionParser {
    public volatile boolean WinterFlowArrayNetwork;
    public boolean WinterFlowCacheManagerAgent;
    public Exception WinterFlowTransactionManagerStrategy;
    public Object WinterFlowVariableVersionControl;
    public final Object WinterFlowRouterStructure = new Object();
    public final WinterFlowCacheModule WinterFlowHookDataSource = new WinterFlowCacheModule();

    public final WinterFlowExceptionParser WinterFlowArrayNetwork(Executor executor, WinterFlowModuleClass winterFlowModuleClass) {
        WinterFlowExceptionParser winterFlowExceptionParser = new WinterFlowExceptionParser();
        this.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowResponseEntity(executor, winterFlowModuleClass, winterFlowExceptionParser, 1));
        WinterFlowThreadListener();
        return winterFlowExceptionParser;
    }

    public final WinterFlowExceptionParser WinterFlowCacheManagerAgent(Executor executor, WinterFlowModuleClass winterFlowModuleClass) {
        WinterFlowExceptionParser winterFlowExceptionParser = new WinterFlowExceptionParser();
        this.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowResponseEntity(executor, winterFlowModuleClass, winterFlowExceptionParser, 0));
        WinterFlowThreadListener();
        return winterFlowExceptionParser;
    }

    public final void WinterFlowHookDataSource(Executor executor, WinterFlowListenerModule winterFlowListenerModule) {
        this.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(executor, winterFlowListenerModule));
        WinterFlowThreadListener();
    }

    public final void WinterFlowResponseEngine(Exception exc) {
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(exc, "Exception must not be null");
        synchronized (this.WinterFlowRouterStructure) {
            WinterFlowServerProtocol();
            this.WinterFlowCacheManagerAgent = true;
            this.WinterFlowTransactionManagerStrategy = exc;
        }
        this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(this);
    }

    public final boolean WinterFlowRouterRouter() {
        boolean z;
        synchronized (this.WinterFlowRouterStructure) {
            try {
                z = false;
                if (this.WinterFlowCacheManagerAgent && !this.WinterFlowArrayNetwork && this.WinterFlowTransactionManagerStrategy == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void WinterFlowRouterStructure(Executor executor, WinterFlowDeserializationProcess winterFlowDeserializationProcess) {
        this.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(executor, winterFlowDeserializationProcess));
        WinterFlowThreadListener();
    }

    public final void WinterFlowServerProtocol() {
        if (this.WinterFlowCacheManagerAgent) {
            if (!WinterFlowUnitTestResponse()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception WinterFlowVariableVersionControl = WinterFlowVariableVersionControl();
        }
    }

    public final void WinterFlowSyntax(Object obj) {
        synchronized (this.WinterFlowRouterStructure) {
            WinterFlowServerProtocol();
            this.WinterFlowCacheManagerAgent = true;
            this.WinterFlowVariableVersionControl = obj;
        }
        this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(this);
    }

    public final void WinterFlowThreadListener() {
        synchronized (this.WinterFlowRouterStructure) {
            try {
                if (this.WinterFlowCacheManagerAgent) {
                    this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void WinterFlowTransactionAgent() {
        synchronized (this.WinterFlowRouterStructure) {
            try {
                if (this.WinterFlowCacheManagerAgent) {
                    return;
                }
                this.WinterFlowCacheManagerAgent = true;
                this.WinterFlowArrayNetwork = true;
                this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object WinterFlowTransactionManagerStrategy() {
        Object obj;
        synchronized (this.WinterFlowRouterStructure) {
            try {
                if (!this.WinterFlowCacheManagerAgent) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.WinterFlowArrayNetwork) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.WinterFlowTransactionManagerStrategy;
                if (exc != null) {
                    throw new WinterFlowDataSourceRouter(exc);
                }
                obj = this.WinterFlowVariableVersionControl;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean WinterFlowUnitTestResponse() {
        boolean z;
        synchronized (this.WinterFlowRouterStructure) {
            z = this.WinterFlowCacheManagerAgent;
        }
        return z;
    }

    public final Exception WinterFlowVariableVersionControl() {
        Exception exc;
        synchronized (this.WinterFlowRouterStructure) {
            exc = this.WinterFlowTransactionManagerStrategy;
        }
        return exc;
    }
}
