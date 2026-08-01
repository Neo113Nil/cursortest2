package com.google.android.datatransport;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionMicroservice {
    public final WinterFlowEventEvent WinterFlowArrayNetwork;
    public final WinterFlowResolverLibrary WinterFlowCacheManagerAgent;
    public final WinterFlowExceptionScheduler WinterFlowHookDataSource;
    public WinterFlowCacheManagerTransactionManager WinterFlowResponseEngine;
    public final WinterFlowTransactionBackend WinterFlowRouterStructure;
    public final WinterFlowIDENetwork WinterFlowServerProtocol;
    public final WinterFlowValidator WinterFlowTransactionAgent;
    public final WinterFlowResolverController WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final boolean WinterFlowVariableVersionControl;
    public final AtomicReference WinterFlowRouterRouter = new AtomicReference(WinterFlowResolverUserManager.WinterFlowUnitTestResponse);
    public long WinterFlowSyntax = WinterFlowConfigurationException.WinterFlowRouterStructure();

    public WinterFlowExceptionMicroservice(WinterFlowTransactionBackend winterFlowTransactionBackend, WinterFlowExceptionScheduler winterFlowExceptionScheduler, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowProcessorDeserialization winterFlowProcessorDeserialization, WinterFlowEventEvent winterFlowEventEvent, boolean z, WinterFlowResolverController winterFlowResolverController, Object obj) {
        this.WinterFlowRouterStructure = winterFlowTransactionBackend;
        this.WinterFlowHookDataSource = winterFlowExceptionScheduler;
        this.WinterFlowCacheManagerAgent = winterFlowResolverLibrary;
        this.WinterFlowArrayNetwork = winterFlowEventEvent;
        this.WinterFlowVariableVersionControl = z;
        this.WinterFlowTransactionManagerStrategy = winterFlowResolverController;
        this.WinterFlowUnitTestResponse = obj;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        winterFlowCacheManagerTransactionManager.getClass();
        this.WinterFlowResponseEngine = winterFlowCacheManagerTransactionManager;
        WinterFlowValidator winterFlowValidator = new WinterFlowValidator();
        winterFlowValidator.WinterFlowUnitTestResponse(winterFlowProcessorDeserialization, winterFlowResolverLibrary.WinterFlowConsumerUserManager());
        this.WinterFlowTransactionAgent = winterFlowValidator;
        this.WinterFlowServerProtocol = new WinterFlowIDENetwork(winterFlowResolverController.WinterFlowUnitTestResponse);
    }

    public final void WinterFlowArrayNetwork() {
        AtomicReference atomicReference;
        WinterFlowResolverUserManager winterFlowResolverUserManager;
        WinterFlowResolverUserManager winterFlowResolverUserManager2;
        do {
            atomicReference = this.WinterFlowRouterRouter;
            winterFlowResolverUserManager = WinterFlowResolverUserManager.WinterFlowRouterRouter;
            winterFlowResolverUserManager2 = WinterFlowResolverUserManager.WinterFlowResponseEngine;
            if (atomicReference.compareAndSet(winterFlowResolverUserManager, winterFlowResolverUserManager2)) {
                return;
            }
        } while (atomicReference.get() == winterFlowResolverUserManager);
        WinterFlowResponseCloud.WinterFlowHookDataSource("Unexpected state change from: " + winterFlowResolverUserManager + " to: " + winterFlowResolverUserManager2 + '.');
    }

    public final boolean WinterFlowCacheManagerAgent() {
        return ((WinterFlowResolverUserManager) this.WinterFlowRouterRouter.get()).compareTo(WinterFlowResolverUserManager.WinterFlowResponseEngine) >= 0;
    }

    public final void WinterFlowHookDataSource() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.WinterFlowUnitTestResponse) {
                try {
                    this.WinterFlowServerProtocol.WinterFlowRouterStructure(this.WinterFlowTransactionManagerStrategy, this.WinterFlowTransactionAgent);
                    this.WinterFlowTransactionAgent.WinterFlowCacheManagerAgent();
                    this.WinterFlowTransactionAgent.WinterFlowArrayNetwork();
                } finally {
                    this.WinterFlowTransactionAgent.WinterFlowHookDataSource();
                    this.WinterFlowRouterStructure.WinterFlowRouterAdapter = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void WinterFlowRouterStructure() {
        AtomicReference atomicReference = this.WinterFlowRouterRouter;
        try {
            switch (((WinterFlowResolverUserManager) atomicReference.get()).ordinal()) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    WinterFlowHookDataSource();
                    WinterFlowResolverUserManager winterFlowResolverUserManager = WinterFlowResolverUserManager.WinterFlowResponseEngine;
                    WinterFlowResolverUserManager winterFlowResolverUserManager2 = WinterFlowResolverUserManager.WinterFlowTransactionAgent;
                    while (!atomicReference.compareAndSet(winterFlowResolverUserManager, winterFlowResolverUserManager2)) {
                        if (atomicReference.get() != winterFlowResolverUserManager) {
                            WinterFlowResponseCloud.WinterFlowHookDataSource("Unexpected state change from: " + winterFlowResolverUserManager + " to: " + winterFlowResolverUserManager2 + '.');
                            return;
                        }
                    }
                    return;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new WinterFlowServerSystem();
            }
        } catch (Exception e) {
            atomicReference.set(WinterFlowResolverUserManager.WinterFlowVariableVersionControl);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean WinterFlowVariableVersionControl(WinterFlowFunctionEngine winterFlowFunctionEngine) {
        WinterFlowResolverUserManager winterFlowResolverUserManager = WinterFlowResolverUserManager.WinterFlowSyntax;
        AtomicReference atomicReference = this.WinterFlowRouterRouter;
        try {
            int ordinal = ((WinterFlowResolverUserManager) atomicReference.get()).ordinal();
            WinterFlowResolverUserManager winterFlowResolverUserManager2 = WinterFlowResolverUserManager.WinterFlowRouterRouter;
            WinterFlowTransactionBackend winterFlowTransactionBackend = this.WinterFlowRouterStructure;
            WinterFlowExceptionScheduler winterFlowExceptionScheduler = this.WinterFlowHookDataSource;
            switch (ordinal) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    WinterFlowResolverLibrary winterFlowResolverLibrary = this.WinterFlowCacheManagerAgent;
                    boolean z = this.WinterFlowVariableVersionControl;
                    if (z) {
                        winterFlowResolverLibrary.WinterFlowBackendCacheManager = 0;
                        winterFlowResolverLibrary.WinterFlowConsumerUserManager = true;
                    }
                    try {
                        this.WinterFlowResponseEngine = winterFlowExceptionScheduler.WinterFlowHookDataSource(winterFlowTransactionBackend, winterFlowFunctionEngine, this.WinterFlowArrayNetwork);
                        WinterFlowResolverUserManager winterFlowResolverUserManager3 = WinterFlowResolverUserManager.WinterFlowUnitTestResponse;
                        while (true) {
                            if (!atomicReference.compareAndSet(winterFlowResolverUserManager3, winterFlowResolverUserManager2)) {
                                if (atomicReference.get() != winterFlowResolverUserManager3) {
                                    WinterFlowResponseCloud.WinterFlowHookDataSource("Unexpected state change from: " + winterFlowResolverUserManager3 + " to: " + winterFlowResolverUserManager2 + '.');
                                }
                            }
                        }
                        if (this.WinterFlowResponseEngine.WinterFlowUnitTestResponse()) {
                            WinterFlowArrayNetwork();
                        }
                        return WinterFlowCacheManagerAgent();
                    } finally {
                        if (z) {
                            winterFlowResolverLibrary.WinterFlowSingletonPlatform();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(winterFlowResolverUserManager2, winterFlowResolverUserManager)) {
                            if (atomicReference.get() != winterFlowResolverUserManager2) {
                                WinterFlowResponseCloud.WinterFlowHookDataSource("Unexpected state change from: " + winterFlowResolverUserManager2 + " to: " + winterFlowResolverUserManager + '.');
                            }
                        }
                    }
                    long j = this.WinterFlowSyntax;
                    try {
                        this.WinterFlowSyntax = WinterFlowConfigurationException.WinterFlowRouterStructure();
                        this.WinterFlowResponseEngine = winterFlowExceptionScheduler.WinterFlowServiceUtility(winterFlowTransactionBackend, winterFlowFunctionEngine, this.WinterFlowResponseEngine);
                        this.WinterFlowSyntax = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(winterFlowResolverUserManager, winterFlowResolverUserManager2)) {
                                if (atomicReference.get() != winterFlowResolverUserManager) {
                                    WinterFlowResponseCloud.WinterFlowHookDataSource("Unexpected state change from: " + winterFlowResolverUserManager + " to: " + winterFlowResolverUserManager2 + '.');
                                }
                            }
                        }
                        if (this.WinterFlowResponseEngine.WinterFlowUnitTestResponse()) {
                            WinterFlowArrayNetwork();
                        }
                        return WinterFlowCacheManagerAgent();
                    } catch (Throwable th) {
                        this.WinterFlowSyntax = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(winterFlowResolverUserManager, winterFlowResolverUserManager2)) {
                                if (atomicReference.get() != winterFlowResolverUserManager) {
                                    WinterFlowResponseCloud.WinterFlowHookDataSource("Unexpected state change from: " + winterFlowResolverUserManager + " to: " + winterFlowResolverUserManager2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Recursive call to resume()");
                    throw new WinterFlowServerSystem();
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new WinterFlowServerSystem();
            }
        } catch (Exception e) {
            atomicReference.set(WinterFlowResolverUserManager.WinterFlowVariableVersionControl);
            throw e;
        }
    }
}
