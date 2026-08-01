package com.google.android.datatransport;

import android.content.Context;
import android.os.Trace;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerServiceProvider {
    public final Object WinterFlowArrayNetwork;
    public final Object WinterFlowCacheManagerAgent;
    public boolean WinterFlowHookDataSource;
    public Object WinterFlowRouterRouter;
    public boolean WinterFlowRouterStructure;
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowConsumerServiceProvider(WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware, WinterFlowRepositoryProtocol winterFlowRepositoryProtocol, WinterFlowServerSingleton winterFlowServerSingleton) {
        int i;
        Object winterFlowProviderLayer;
        WinterFlowClassView winterFlowClassView = winterFlowConfigurationMiddleware.WinterFlowTransactionManagerStrategy;
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = winterFlowConfigurationMiddleware.WinterFlowCacheManagerAgent;
        WinterFlowViewInterface winterFlowViewInterface = winterFlowConfigurationMiddleware.WinterFlowBandwidthObject;
        String str = winterFlowConfigurationMiddleware.WinterFlowHookDataSource;
        this.WinterFlowCacheManagerAgent = winterFlowConfigurationMiddleware;
        this.WinterFlowArrayNetwork = winterFlowRepositoryProtocol;
        Object obj = winterFlowConfigurationMiddleware.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = obj == null ? WinterFlowDataSourceEngine.WinterFlowVariableVersionControl : obj;
        WinterFlowHandlerNetwork winterFlowHandlerNetwork = null;
        if (winterFlowViewInterface != null) {
            this.WinterFlowUnitTestResponse = null;
            if (winterFlowViewInterface.WinterFlowTransactionManagerStrategy()) {
                winterFlowProviderLayer = new WinterFlowConfigurationLayer(new WinterFlowAlgorithmArray(this, winterFlowViewInterface), str == null ? ":memory:" : str, winterFlowServerSingleton);
            } else if (str == null) {
                winterFlowProviderLayer = new WinterFlowProviderLayer(new WinterFlowAlgorithmArray(this, winterFlowViewInterface));
            } else {
                WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(this, winterFlowViewInterface);
                int ordinal = winterFlowClassView.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + winterFlowClassView + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = winterFlowClassView.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + winterFlowClassView + '\'').toString());
                }
                winterFlowProviderLayer = new WinterFlowProviderLayer(winterFlowAlgorithmArray, str, i);
            }
            this.WinterFlowTransactionManagerStrategy = winterFlowProviderLayer;
        } else {
            if (winterFlowThreadPoolProcess == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = winterFlowConfigurationMiddleware.WinterFlowRouterStructure;
            context.getClass();
            winterFlowHandlerNetwork = new WinterFlowHandlerNetwork(context, str, new WinterFlowSyntax(this, winterFlowRepositoryProtocol.WinterFlowRouterStructure));
            this.WinterFlowUnitTestResponse = winterFlowHandlerNetwork;
            this.WinterFlowTransactionManagerStrategy = new WinterFlowConfigurationLayer(new WinterFlowJSONDecorator(winterFlowHandlerNetwork), str == null ? ":memory:" : str, winterFlowServerSingleton);
        }
        boolean z = winterFlowClassView == WinterFlowClassView.WinterFlowTransactionManagerStrategy;
        if (winterFlowHandlerNetwork != null) {
            winterFlowHandlerNetwork.setWriteAheadLoggingEnabled(z);
        }
    }

    public static boolean WinterFlowArrayNetwork(WinterFlowSchedulerStructure winterFlowSchedulerStructure, WinterFlowHandlerConsumer winterFlowHandlerConsumer) {
        boolean WinterFlowHookQuery;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowSchedulerStructure.WinterFlowServerProtocol;
        WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure.WinterFlowSoftwareEngine;
        if (winterFlowSchedulerStructure2 == null) {
            return false;
        }
        if (winterFlowHandlerConsumer != null) {
            if (winterFlowSchedulerStructure2 != null) {
                WinterFlowClassOrchestration winterFlowClassOrchestration = winterFlowUICompiler.WinterFlowConcurrencyThread;
                winterFlowClassOrchestration.getClass();
                WinterFlowHookQuery = winterFlowClassOrchestration.WinterFlowHookQuery(winterFlowHandlerConsumer.WinterFlowRouterStructure);
            }
            WinterFlowHookQuery = false;
        } else {
            WinterFlowClassOrchestration winterFlowClassOrchestration2 = winterFlowUICompiler.WinterFlowConcurrencyThread;
            WinterFlowHandlerConsumer winterFlowHandlerConsumer2 = winterFlowClassOrchestration2 != null ? winterFlowClassOrchestration2.WinterFlowConcurrencyThread : null;
            if (winterFlowHandlerConsumer2 != null && winterFlowSchedulerStructure2 != null) {
                winterFlowClassOrchestration2.getClass();
                WinterFlowHookQuery = winterFlowClassOrchestration2.WinterFlowHookQuery(winterFlowHandlerConsumer2.WinterFlowRouterStructure);
            }
            WinterFlowHookQuery = false;
        }
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
        if (WinterFlowHookQuery && WinterFlowVariableBandwidth != null) {
            if (WinterFlowVariableBandwidth.WinterFlowServerProtocol == null) {
                WinterFlowSchedulerStructure.WinterFlowConfiguration(WinterFlowVariableBandwidth, false, 3);
                return WinterFlowHookQuery;
            }
            if (winterFlowSchedulerStructure.WinterFlowSingletonPlatform() == WinterFlowMapperSubsystem.WinterFlowVariableVersionControl) {
                WinterFlowSchedulerStructure.WinterFlowCacheTool(WinterFlowVariableBandwidth, false, 3);
                return WinterFlowHookQuery;
            }
            if (winterFlowSchedulerStructure.WinterFlowSingletonPlatform() == WinterFlowMapperSubsystem.WinterFlowTransactionManagerStrategy) {
                WinterFlowVariableBandwidth.WinterFlowQueueService(false);
            }
        }
        return WinterFlowHookQuery;
    }

    public static boolean WinterFlowResponseEngine(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        WinterFlowClassOrchestration winterFlowClassOrchestration;
        WinterFlowBandwidthFramework winterFlowBandwidthFramework;
        if (winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl) {
            return (winterFlowSchedulerStructure.WinterFlowSingletonPlatform() == WinterFlowMapperSubsystem.WinterFlowUnitTestResponse && ((winterFlowClassOrchestration = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowConcurrencyThread) == null || (winterFlowBandwidthFramework = winterFlowClassOrchestration.WinterFlowRouterAdapter) == null || !winterFlowBandwidthFramework.WinterFlowVariableVersionControl())) ? false : true;
        }
        return false;
    }

    public static void WinterFlowRouterStructure(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA busy_timeout");
        try {
            WinterFlowArrayHelper.WinterFlowBackendCacheManager();
            long j = WinterFlowArrayHelper.getLong(0);
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            if (j < 3000) {
                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, th);
                throw th2;
            }
        }
    }

    public static boolean WinterFlowServerProtocol(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        WinterFlowClassOrchestration winterFlowClassOrchestration;
        WinterFlowBandwidthFramework winterFlowBandwidthFramework;
        WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure.WinterFlowSoftwareEngine;
        return winterFlowSchedulerStructure.WinterFlowPackageIDE() || winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowMapperProtocol || WinterFlowTransactionAgent(winterFlowSchedulerStructure) || WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructure.WinterFlowSoftwareProtocol(), Boolean.TRUE) || WinterFlowResponseEngine(winterFlowSchedulerStructure) || winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowEventEmitterController.WinterFlowVariableVersionControl() || !((winterFlowClassOrchestration = winterFlowUICompiler.WinterFlowConcurrencyThread) == null || (winterFlowBandwidthFramework = winterFlowClassOrchestration.WinterFlowRouterAdapter) == null || !winterFlowBandwidthFramework.WinterFlowVariableVersionControl());
    }

    public static boolean WinterFlowTransactionAgent(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (!winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem()) {
            return false;
        }
        do {
            if (winterFlowSchedulerStructure.WinterFlowConcurrencyThread() == WinterFlowMapperSubsystem.WinterFlowUnitTestResponse && !winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowEventEmitterController.WinterFlowVariableVersionControl()) {
                WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                if ((WinterFlowVariableBandwidth != null ? WinterFlowVariableBandwidth.WinterFlowSoftwareEngine.WinterFlowArrayNetwork : null) != WinterFlowTransactionManagerThreadPool.WinterFlowVariableVersionControl) {
                    return false;
                }
            }
            winterFlowSchedulerStructure = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
            if (winterFlowSchedulerStructure == null) {
                return false;
            }
        } while (!winterFlowSchedulerStructure.WinterFlowPackageIDE());
        return true;
    }

    public static boolean WinterFlowVariableVersionControl(WinterFlowSchedulerStructure winterFlowSchedulerStructure, WinterFlowHandlerConsumer winterFlowHandlerConsumer) {
        boolean z;
        WinterFlowMapperSubsystem winterFlowMapperSubsystem = WinterFlowMapperSubsystem.WinterFlowUnitTestResponse;
        if (winterFlowHandlerConsumer != null) {
            if (winterFlowSchedulerStructure.WinterFlowCacheManagerListener == winterFlowMapperSubsystem) {
                winterFlowSchedulerStructure.WinterFlowVariableVersionControl();
            }
            z = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowHandlerJSON(winterFlowHandlerConsumer.WinterFlowRouterStructure);
        } else {
            WinterFlowValidatorException winterFlowValidatorException = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem;
            WinterFlowHandlerConsumer winterFlowHandlerConsumer2 = winterFlowValidatorException.WinterFlowServiceUtility ? new WinterFlowHandlerConsumer(winterFlowValidatorException.WinterFlowRouterRouter) : null;
            if (winterFlowHandlerConsumer2 != null) {
                if (winterFlowSchedulerStructure.WinterFlowCacheManagerListener == winterFlowMapperSubsystem) {
                    winterFlowSchedulerStructure.WinterFlowVariableVersionControl();
                }
                z = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowHandlerJSON(winterFlowHandlerConsumer2.WinterFlowRouterStructure);
            } else {
                z = false;
            }
        }
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
        if (z && WinterFlowVariableBandwidth != null) {
            if (winterFlowSchedulerStructure.WinterFlowConcurrencyThread() == WinterFlowMapperSubsystem.WinterFlowVariableVersionControl) {
                WinterFlowSchedulerStructure.WinterFlowConfiguration(WinterFlowVariableBandwidth, false, 3);
                return z;
            }
            if (winterFlowSchedulerStructure.WinterFlowConcurrencyThread() == WinterFlowMapperSubsystem.WinterFlowTransactionManagerStrategy) {
                WinterFlowVariableBandwidth.WinterFlowProxyStructure(false);
            }
        }
        return z;
    }

    public void WinterFlowBandwidthObject() {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent;
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) this.WinterFlowArrayNetwork;
        if (winterFlowObjectPackage.WinterFlowOrchestrationSubsystem()) {
            if (!winterFlowSchedulerStructure.WinterFlowCacheManagerListener()) {
                WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called with unattached root");
            }
            if (!winterFlowSchedulerStructure.WinterFlowPackageIDE()) {
                WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called with unplaced root");
            }
            if (this.WinterFlowRouterStructure) {
                WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called during measure layout");
            }
            if (((WinterFlowHandlerConsumer) this.WinterFlowRouterRouter) != null) {
                this.WinterFlowRouterStructure = true;
                this.WinterFlowHookDataSource = false;
                try {
                    if ((((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).isEmpty() || ((WinterFlowNodeDebug) ((WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy).isEmpty()) ? false : true) {
                        if (winterFlowSchedulerStructure.WinterFlowServerProtocol != null) {
                            WinterFlowSerializerStructure(winterFlowSchedulerStructure, true);
                        } else {
                            WinterFlowRouterAdapter(winterFlowSchedulerStructure);
                        }
                    }
                    WinterFlowSerializerStructure(winterFlowSchedulerStructure, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.WinterFlowRouterStructure = false;
                        this.WinterFlowHookDataSource = false;
                    }
                }
            }
        }
    }

    public boolean WinterFlowBatchUI(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z) {
        WinterFlowHandlerConsumer winterFlowHandlerConsumer;
        boolean z2 = false;
        if (!winterFlowSchedulerStructure.WinterFlowConfiguration && WinterFlowServerProtocol(winterFlowSchedulerStructure)) {
            if (winterFlowSchedulerStructure == ((WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent)) {
                winterFlowHandlerConsumer = (WinterFlowHandlerConsumer) this.WinterFlowRouterRouter;
                winterFlowHandlerConsumer.getClass();
            } else {
                winterFlowHandlerConsumer = null;
            }
            if (z) {
                if (winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl) {
                    z2 = WinterFlowArrayNetwork(winterFlowSchedulerStructure, winterFlowHandlerConsumer);
                }
            } else if (winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem()) {
                z2 = WinterFlowVariableVersionControl(winterFlowSchedulerStructure, winterFlowHandlerConsumer);
            }
            WinterFlowTransactionManagerStrategy();
        }
        return z2;
    }

    public void WinterFlowCacheManagerAgent(boolean z) {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = (WinterFlowAlgorithmArray) this.WinterFlowVariableVersionControl;
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy;
        if (z) {
            WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent;
            if (winterFlowSchedulerStructure.WinterFlowProxyStructure > 0) {
                winterFlowJSON.WinterFlowUnitTestResponse();
                winterFlowJSON.WinterFlowHookDataSource(winterFlowSchedulerStructure);
                winterFlowSchedulerStructure.WinterFlowCacheTool = true;
            }
        }
        if (winterFlowJSON.WinterFlowUnitTestResponse != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                winterFlowAlgorithmArray.WinterFlowBandwidthObject();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void WinterFlowConcurrencyThread(WinterFlowDeserializationHandler winterFlowDeserializationHandler, int i, int i2) {
        boolean z;
        WinterFlowRepositoryProtocol winterFlowRepositoryProtocol = (WinterFlowRepositoryProtocol) this.WinterFlowArrayNetwork;
        winterFlowDeserializationHandler.getClass();
        WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware = (WinterFlowConfigurationMiddleware) this.WinterFlowCacheManagerAgent;
        List WinterFlowResponseEngine = WinterFlowQuerySyntax.WinterFlowResponseEngine(winterFlowConfigurationMiddleware.WinterFlowArrayNetwork, i, i2);
        if (WinterFlowResponseEngine != null) {
            winterFlowRepositoryProtocol.WinterFlowTransactionManagerStrategy(winterFlowDeserializationHandler);
            Iterator it = WinterFlowResponseEngine.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return;
            }
            WinterFlowSingletonQuery WinterFlowUnitTestResponse = winterFlowRepositoryProtocol.WinterFlowUnitTestResponse(winterFlowDeserializationHandler);
            if (!WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy) {
                WinterFlowEventEmitterOrchestration.WinterFlowBatchUI((String) WinterFlowUnitTestResponse.WinterFlowVariableVersionControl, "Migration didn't properly handle: ");
                return;
            } else {
                winterFlowRepositoryProtocol.WinterFlowVariableVersionControl(winterFlowDeserializationHandler);
                WinterFlowResolverController(winterFlowDeserializationHandler);
                return;
            }
        }
        winterFlowConfigurationMiddleware.getClass();
        if (i <= i2 || !winterFlowConfigurationMiddleware.WinterFlowResponseEngine) {
            Set set = winterFlowConfigurationMiddleware.WinterFlowTransactionAgent;
            if (winterFlowConfigurationMiddleware.WinterFlowSyntax && (set == null || !set.contains(Integer.valueOf(i)))) {
                z = true;
                if (!z) {
                    throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
                }
                if (winterFlowConfigurationMiddleware.WinterFlowServiceUtility) {
                    WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                    try {
                        WinterFlowUserManagerResolver WinterFlowBatchUI = WinterFlowUnitTestLibrary.WinterFlowBatchUI();
                        while (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                            String WinterFlowVariableVersionControl = WinterFlowArrayHelper.WinterFlowVariableVersionControl(0);
                            if (!WinterFlowHookModule.WinterFlowResolverController(WinterFlowVariableVersionControl, "sqlite_") && !WinterFlowVariableVersionControl.equals("android_metadata")) {
                                WinterFlowBatchUI.add(new WinterFlowServerPlatform(WinterFlowVariableVersionControl, Boolean.valueOf(WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowArrayHelper.WinterFlowVariableVersionControl(1), "view"))));
                            }
                        }
                        WinterFlowUserManagerResolver WinterFlowServerProtocol = WinterFlowUnitTestLibrary.WinterFlowServerProtocol(WinterFlowBatchUI);
                        WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                        ListIterator listIterator = WinterFlowServerProtocol.listIterator(0);
                        while (true) {
                            WinterFlowClassAlgorithm winterFlowClassAlgorithm = (WinterFlowClassAlgorithm) listIterator;
                            if (!winterFlowClassAlgorithm.hasNext()) {
                                break;
                            }
                            WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowClassAlgorithm.next();
                            String str = (String) winterFlowServerPlatform.WinterFlowVariableVersionControl;
                            if (((Boolean) winterFlowServerPlatform.WinterFlowTransactionManagerStrategy).booleanValue()) {
                                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "DROP VIEW IF EXISTS `" + str + '`');
                            } else {
                                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "DROP TABLE IF EXISTS `" + str + '`');
                            }
                        }
                    } finally {
                    }
                } else {
                    winterFlowRepositoryProtocol.WinterFlowHookDataSource(winterFlowDeserializationHandler);
                }
                Iterator it2 = ((List) this.WinterFlowVariableVersionControl).iterator();
                while (it2.hasNext()) {
                    ((WinterFlowUnitTestJSON) it2.next()).getClass();
                    if (winterFlowDeserializationHandler instanceof WinterFlowSerializerDatabase) {
                        ((WinterFlowSerializerDatabase) winterFlowDeserializationHandler).WinterFlowVariableVersionControl.getClass();
                    }
                }
                winterFlowRepositoryProtocol.WinterFlowRouterStructure(winterFlowDeserializationHandler);
                return;
            }
        }
        z = false;
        if (!z) {
        }
    }

    public void WinterFlowConsumerUserManager(long j) {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent;
        WinterFlowHandlerConsumer winterFlowHandlerConsumer = (WinterFlowHandlerConsumer) this.WinterFlowRouterRouter;
        if (winterFlowHandlerConsumer == null ? false : WinterFlowHandlerConsumer.WinterFlowHookDataSource(winterFlowHandlerConsumer.WinterFlowRouterStructure, j)) {
            return;
        }
        if (this.WinterFlowRouterStructure) {
            WinterFlowViewUtility.WinterFlowRouterStructure("updateRootConstraints called while measuring");
        }
        this.WinterFlowRouterRouter = new WinterFlowHandlerConsumer(j);
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowSchedulerStructure.WinterFlowServerProtocol;
        WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure.WinterFlowSoftwareEngine;
        if (winterFlowSchedulerStructure2 != null) {
            winterFlowUICompiler.WinterFlowVariableVersionControl = true;
        }
        winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowResolverController = true;
        ((WinterFlowObjectPackage) this.WinterFlowArrayNetwork).WinterFlowRouterStructure(winterFlowSchedulerStructure, winterFlowSchedulerStructure2 != null ? WinterFlowCompilerListener.WinterFlowVariableVersionControl : WinterFlowCompilerListener.WinterFlowUnitTestResponse);
    }

    public void WinterFlowHookDataSource(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        Object winterFlowDecoratorTool;
        WinterFlowRepositoryProtocol winterFlowRepositoryProtocol = (WinterFlowRepositoryProtocol) this.WinterFlowArrayNetwork;
        WinterFlowRouterStructure(winterFlowDeserializationHandler);
        WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware = (WinterFlowConfigurationMiddleware) this.WinterFlowCacheManagerAgent;
        WinterFlowClassView winterFlowClassView = winterFlowConfigurationMiddleware.WinterFlowTransactionManagerStrategy;
        WinterFlowClassView winterFlowClassView2 = WinterFlowClassView.WinterFlowTransactionManagerStrategy;
        if (winterFlowClassView == winterFlowClassView2) {
            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA journal_mode = WAL");
        } else {
            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA journal_mode = TRUNCATE");
        }
        if (winterFlowConfigurationMiddleware.WinterFlowTransactionManagerStrategy == winterFlowClassView2) {
            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA synchronous = NORMAL");
        } else {
            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA synchronous = FULL");
        }
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA user_version");
        try {
            WinterFlowArrayHelper.WinterFlowBackendCacheManager();
            int i = (int) WinterFlowArrayHelper.getLong(0);
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            int i2 = winterFlowRepositoryProtocol.WinterFlowRouterStructure;
            int i3 = winterFlowRepositoryProtocol.WinterFlowRouterStructure;
            if (i != i2) {
                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        WinterFlowOrchestrationSubsystem(winterFlowDeserializationHandler);
                    } else {
                        WinterFlowConcurrencyThread(winterFlowDeserializationHandler, i, i3);
                    }
                    WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA user_version = " + i3);
                    winterFlowDecoratorTool = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                } catch (Throwable th) {
                    winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
                }
                if (!(winterFlowDecoratorTool instanceof WinterFlowDecoratorTool)) {
                    WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "END TRANSACTION");
                }
                Throwable WinterFlowRouterStructure = WinterFlowRendererStructure.WinterFlowRouterStructure(winterFlowDecoratorTool);
                if (WinterFlowRouterStructure != null) {
                    WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "ROLLBACK TRANSACTION");
                    throw WinterFlowRouterStructure;
                }
            }
            WinterFlowSingletonPlatform(winterFlowDeserializationHandler);
        } finally {
        }
    }

    public boolean WinterFlowMapperProtocol(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z) {
        int ordinal = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowArrayNetwork.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                ((WinterFlowJSON) this.WinterFlowUnitTestResponse).WinterFlowHookDataSource(new WinterFlowServiceDecorator(winterFlowSchedulerStructure, false, z));
            } else {
                if (ordinal != 4) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return false;
                }
                if (!winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem() || z) {
                    winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowResolverController = true;
                    if (!winterFlowSchedulerStructure.WinterFlowConfiguration && (winterFlowSchedulerStructure.WinterFlowPackageIDE() || WinterFlowTransactionAgent(winterFlowSchedulerStructure))) {
                        WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                        if (WinterFlowVariableBandwidth == null || !WinterFlowVariableBandwidth.WinterFlowOrchestrationSubsystem()) {
                            ((WinterFlowObjectPackage) this.WinterFlowArrayNetwork).WinterFlowRouterStructure(winterFlowSchedulerStructure, WinterFlowCompilerListener.WinterFlowUnitTestResponse);
                        }
                        if (!this.WinterFlowHookDataSource) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void WinterFlowOrchestrationSubsystem(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        WinterFlowRepositoryProtocol winterFlowRepositoryProtocol = (WinterFlowRepositoryProtocol) this.WinterFlowArrayNetwork;
        winterFlowDeserializationHandler.getClass();
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                if (WinterFlowArrayHelper.getLong(0) == 0) {
                    z = true;
                }
            }
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            winterFlowRepositoryProtocol.WinterFlowRouterStructure(winterFlowDeserializationHandler);
            if (!z) {
                WinterFlowSingletonQuery WinterFlowUnitTestResponse = winterFlowRepositoryProtocol.WinterFlowUnitTestResponse(winterFlowDeserializationHandler);
                if (!WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBatchUI((String) WinterFlowUnitTestResponse.WinterFlowVariableVersionControl, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            WinterFlowResolverController(winterFlowDeserializationHandler);
            winterFlowRepositoryProtocol.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler);
            Iterator it = ((List) this.WinterFlowVariableVersionControl).iterator();
            while (it.hasNext()) {
                ((WinterFlowUnitTestJSON) it.next()).getClass();
                if (winterFlowDeserializationHandler instanceof WinterFlowSerializerDatabase) {
                    ((WinterFlowSerializerDatabase) winterFlowDeserializationHandler).WinterFlowVariableVersionControl.getClass();
                }
            }
        } finally {
        }
    }

    public void WinterFlowResolverController(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((WinterFlowRepositoryProtocol) this.WinterFlowArrayNetwork).WinterFlowHookDataSource) + "')");
    }

    public void WinterFlowRouterAdapter(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        WinterFlowJSON WinterFlowResolverController = winterFlowSchedulerStructure.WinterFlowResolverController();
        Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
        int i = WinterFlowResolverController.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) objArr[i2];
            if (winterFlowSchedulerStructure2.WinterFlowConcurrencyThread() == WinterFlowMapperSubsystem.WinterFlowVariableVersionControl || winterFlowSchedulerStructure2.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowEventEmitterController.WinterFlowVariableVersionControl()) {
                if (WinterFlowInvokerComponent.WinterFlowSyntaxSubsystem(winterFlowSchedulerStructure2)) {
                    WinterFlowSerializerStructure(winterFlowSchedulerStructure2, true);
                } else {
                    WinterFlowRouterAdapter(winterFlowSchedulerStructure2);
                }
            }
        }
    }

    public void WinterFlowRouterRouter(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z) {
        if (!this.WinterFlowRouterStructure) {
            WinterFlowViewUtility.WinterFlowHookDataSource("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl : winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("node not yet measured");
        }
        WinterFlowSyntax(winterFlowSchedulerStructure, z);
    }

    public void WinterFlowSerializerStructure(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z) {
        WinterFlowHandlerConsumer winterFlowHandlerConsumer;
        if (winterFlowSchedulerStructure.WinterFlowConfiguration) {
            return;
        }
        if (winterFlowSchedulerStructure == ((WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent)) {
            winterFlowHandlerConsumer = (WinterFlowHandlerConsumer) this.WinterFlowRouterRouter;
            winterFlowHandlerConsumer.getClass();
        } else {
            winterFlowHandlerConsumer = null;
        }
        if (z) {
            WinterFlowArrayNetwork(winterFlowSchedulerStructure, winterFlowHandlerConsumer);
        } else {
            WinterFlowVariableVersionControl(winterFlowSchedulerStructure, winterFlowHandlerConsumer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public void WinterFlowServiceUtility(WinterFlowSchedulerStructure winterFlowSchedulerStructure, long j) {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent;
        if (winterFlowSchedulerStructure.WinterFlowConfiguration) {
            return;
        }
        if (winterFlowSchedulerStructure == winterFlowSchedulerStructure2) {
            WinterFlowViewUtility.WinterFlowRouterStructure("measureAndLayout called on root");
        }
        if (!winterFlowSchedulerStructure2.WinterFlowCacheManagerListener()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called with unattached root");
        }
        if (!winterFlowSchedulerStructure2.WinterFlowPackageIDE()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called with unplaced root");
        }
        if (this.WinterFlowRouterStructure) {
            WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called during measure layout");
        }
        if (((WinterFlowHandlerConsumer) this.WinterFlowRouterRouter) != null) {
            this.WinterFlowRouterStructure = true;
            this.WinterFlowHookDataSource = false;
            try {
                WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) this.WinterFlowArrayNetwork;
                ((WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(winterFlowSchedulerStructure);
                ((WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowUnitTestResponse).WinterFlowConcurrencyThread(winterFlowSchedulerStructure);
                ((WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowRouterRouter).WinterFlowConcurrencyThread(winterFlowSchedulerStructure);
                if ((WinterFlowArrayNetwork(winterFlowSchedulerStructure, new WinterFlowHandlerConsumer(j)) || winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowTransactionManagerStrategy) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructure.WinterFlowSoftwareProtocol(), Boolean.TRUE)) {
                    winterFlowSchedulerStructure.WinterFlowUserManagerUserManager();
                }
                WinterFlowUnitTestResponse(winterFlowSchedulerStructure);
                WinterFlowVariableVersionControl(winterFlowSchedulerStructure, new WinterFlowHandlerConsumer(j));
                if (winterFlowSchedulerStructure.WinterFlowBandwidthObject() && winterFlowSchedulerStructure.WinterFlowPackageIDE()) {
                    winterFlowSchedulerStructure.WinterFlowUIMiddleware();
                    WinterFlowAlgorithmArray winterFlowAlgorithmArray = (WinterFlowAlgorithmArray) this.WinterFlowVariableVersionControl;
                    if (winterFlowSchedulerStructure.WinterFlowProxyStructure > 0) {
                        ((WinterFlowJSON) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource(winterFlowSchedulerStructure);
                        winterFlowSchedulerStructure.WinterFlowCacheTool = true;
                    }
                }
                WinterFlowTransactionManagerStrategy();
            } finally {
            }
        }
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) this.WinterFlowTransactionManagerStrategy;
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowExceptionStrategy winterFlowExceptionStrategy = ((WinterFlowSchedulerStructure) objArr[i2]).WinterFlowUserManagerUserManager;
            WinterFlowRouterInvoker winterFlowRouterInvoker = winterFlowExceptionStrategy.WinterFlowCacheManagerAgent;
            boolean WinterFlowUnitTestResponse = WinterFlowHookDeserialization.WinterFlowUnitTestResponse(4194304);
            WinterFlowUserManagerController winterFlowUserManagerController = winterFlowRouterInvoker.WinterFlowValidatorHandler;
            if (WinterFlowUnitTestResponse || (winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax) != null) {
                WinterFlowPipelineVariable winterFlowPipelineVariable = WinterFlowUIMicroservice.WinterFlowQueueService;
                for (WinterFlowUserManagerController WinterFlowUserManagerAdapter = winterFlowRouterInvoker.WinterFlowUserManagerAdapter(WinterFlowUnitTestResponse); WinterFlowUserManagerAdapter != null && (WinterFlowUserManagerAdapter.WinterFlowRouterRouter & 4194304) != 0; WinterFlowUserManagerAdapter = WinterFlowUserManagerAdapter.WinterFlowResponseEngine) {
                    if ((WinterFlowUserManagerAdapter.WinterFlowUnitTestResponse & 4194304) != 0) {
                        WinterFlowTestingEntity winterFlowTestingEntity = WinterFlowUserManagerAdapter;
                        ?? r8 = 0;
                        while (winterFlowTestingEntity != 0) {
                            if (winterFlowTestingEntity instanceof WinterFlowHookFrontend) {
                                ((WinterFlowHookFrontend) winterFlowTestingEntity).WinterFlowTestingNode(winterFlowExceptionStrategy.WinterFlowCacheManagerAgent);
                            } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 4194304) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowTestingEntity.WinterFlowBatchUI;
                                int i3 = 0;
                                winterFlowTestingEntity = winterFlowTestingEntity;
                                r8 = r8;
                                while (winterFlowUserManagerController2 != null) {
                                    if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 4194304) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            winterFlowTestingEntity = winterFlowUserManagerController2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowTestingEntity != 0) {
                                                r8.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                winterFlowTestingEntity = 0;
                                            }
                                            r8.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                        }
                                    }
                                    winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowResponseEngine;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r8);
                        }
                    }
                    if (WinterFlowUserManagerAdapter != winterFlowUserManagerController) {
                    }
                }
            }
        }
        winterFlowJSON.WinterFlowUnitTestResponse();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void WinterFlowSingletonPlatform(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        boolean z;
        Object winterFlowDecoratorTool;
        WinterFlowSingletonQuery WinterFlowUnitTestResponse;
        winterFlowDeserializationHandler.getClass();
        WinterFlowRepositoryProtocol winterFlowRepositoryProtocol = (WinterFlowRepositoryProtocol) this.WinterFlowArrayNetwork;
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                if (WinterFlowArrayHelper.getLong(0) != 0) {
                    z = true;
                    WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                    if (z) {
                        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            WinterFlowUnitTestResponse = winterFlowRepositoryProtocol.WinterFlowUnitTestResponse(winterFlowDeserializationHandler);
                        } catch (Throwable th) {
                            winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
                        }
                        if (!WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) WinterFlowUnitTestResponse.WinterFlowVariableVersionControl)).toString());
                        }
                        winterFlowRepositoryProtocol.WinterFlowVariableVersionControl(winterFlowDeserializationHandler);
                        WinterFlowResolverController(winterFlowDeserializationHandler);
                        winterFlowDecoratorTool = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        if (!(winterFlowDecoratorTool instanceof WinterFlowDecoratorTool)) {
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "END TRANSACTION");
                        }
                        Throwable WinterFlowRouterStructure = WinterFlowRendererStructure.WinterFlowRouterStructure(winterFlowDecoratorTool);
                        if (WinterFlowRouterStructure != null) {
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "ROLLBACK TRANSACTION");
                            throw WinterFlowRouterStructure;
                        }
                    } else {
                        WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String WinterFlowVariableVersionControl = WinterFlowArrayHelper.WinterFlowBackendCacheManager() ? WinterFlowArrayHelper.WinterFlowVariableVersionControl(0) : null;
                            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                            if (!((String) winterFlowRepositoryProtocol.WinterFlowHookDataSource).equals(WinterFlowVariableVersionControl) && !((String) winterFlowRepositoryProtocol.WinterFlowCacheManagerAgent).equals(WinterFlowVariableVersionControl)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) winterFlowRepositoryProtocol.WinterFlowHookDataSource) + ", found: " + WinterFlowVariableVersionControl).toString());
                            }
                        } finally {
                        }
                    }
                    winterFlowRepositoryProtocol.WinterFlowArrayNetwork(winterFlowDeserializationHandler);
                    for (WinterFlowUnitTestJSON winterFlowUnitTestJSON : (List) this.WinterFlowVariableVersionControl) {
                        winterFlowUnitTestJSON.getClass();
                        if (winterFlowDeserializationHandler instanceof WinterFlowSerializerDatabase) {
                            WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = ((WinterFlowSerializerDatabase) winterFlowDeserializationHandler).WinterFlowVariableVersionControl;
                            winterFlowSchedulerSyntax.getClass();
                            winterFlowUnitTestJSON.WinterFlowRouterStructure.WinterFlowUnitTestResponse(winterFlowSchedulerSyntax);
                        }
                    }
                    this.WinterFlowRouterStructure = true;
                }
            }
            z = false;
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            if (z) {
            }
            winterFlowRepositoryProtocol.WinterFlowArrayNetwork(winterFlowDeserializationHandler);
            while (r0.hasNext()) {
            }
            this.WinterFlowRouterStructure = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public void WinterFlowSyntax(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z) {
        WinterFlowClassOrchestration winterFlowClassOrchestration;
        WinterFlowBandwidthFramework winterFlowBandwidthFramework;
        WinterFlowJSON WinterFlowResolverController = winterFlowSchedulerStructure.WinterFlowResolverController();
        Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
        int i = WinterFlowResolverController.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) objArr[i2];
            WinterFlowMapperSubsystem winterFlowMapperSubsystem = WinterFlowMapperSubsystem.WinterFlowVariableVersionControl;
            if ((!z && (winterFlowSchedulerStructure2.WinterFlowConcurrencyThread() == winterFlowMapperSubsystem || winterFlowSchedulerStructure2.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowEventEmitterController.WinterFlowVariableVersionControl())) || (z && (winterFlowSchedulerStructure2.WinterFlowSingletonPlatform() == winterFlowMapperSubsystem || ((winterFlowClassOrchestration = winterFlowSchedulerStructure2.WinterFlowSoftwareEngine.WinterFlowConcurrencyThread) != null && (winterFlowBandwidthFramework = winterFlowClassOrchestration.WinterFlowRouterAdapter) != null && winterFlowBandwidthFramework.WinterFlowVariableVersionControl())))) {
                boolean WinterFlowSyntaxSubsystem = WinterFlowInvokerComponent.WinterFlowSyntaxSubsystem(winterFlowSchedulerStructure2);
                WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure2.WinterFlowSoftwareEngine;
                if (WinterFlowSyntaxSubsystem && !z) {
                    if (winterFlowUICompiler.WinterFlowVariableVersionControl && ((WinterFlowObjectPackage) this.WinterFlowArrayNetwork).WinterFlowTransactionManagerStrategy(winterFlowSchedulerStructure2)) {
                        WinterFlowBatchUI(winterFlowSchedulerStructure2, true);
                    } else {
                        WinterFlowRouterRouter(winterFlowSchedulerStructure2, true);
                    }
                }
                if (z ? winterFlowUICompiler.WinterFlowVariableVersionControl : winterFlowSchedulerStructure2.WinterFlowOrchestrationSubsystem()) {
                    WinterFlowBatchUI(winterFlowSchedulerStructure2, z);
                }
                if (!(z ? winterFlowUICompiler.WinterFlowVariableVersionControl : winterFlowSchedulerStructure2.WinterFlowOrchestrationSubsystem())) {
                    WinterFlowSyntax(winterFlowSchedulerStructure2, z);
                }
            }
        }
        if (z ? winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl : winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem()) {
            WinterFlowBatchUI(winterFlowSchedulerStructure, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public boolean WinterFlowThreadListener(WinterFlowRendererDataSource winterFlowRendererDataSource) {
        boolean z;
        WinterFlowUserManagerController winterFlowUserManagerController;
        boolean z2;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        boolean z3;
        boolean WinterFlowBatchUI;
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) this.WinterFlowArrayNetwork;
        WinterFlowJSONDecorator winterFlowJSONDecorator = (WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent;
        if (!winterFlowSchedulerStructure2.WinterFlowCacheManagerListener()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called with unattached root");
        }
        if (!winterFlowSchedulerStructure2.WinterFlowPackageIDE()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called with unplaced root");
        }
        if (this.WinterFlowRouterStructure) {
            WinterFlowViewUtility.WinterFlowRouterStructure("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((WinterFlowHandlerConsumer) this.WinterFlowRouterRouter) != null) {
            this.WinterFlowRouterStructure = true;
            this.WinterFlowHookDataSource = true;
            try {
                if (winterFlowObjectPackage.WinterFlowOrchestrationSubsystem()) {
                    z = false;
                    while (true) {
                        WinterFlowJSONDecorator winterFlowJSONDecorator2 = (WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowRouterRouter;
                        WinterFlowNodeDebug winterFlowNodeDebug = (WinterFlowNodeDebug) winterFlowJSONDecorator2.WinterFlowTransactionManagerStrategy;
                        WinterFlowJSONDecorator winterFlowJSONDecorator3 = (WinterFlowJSONDecorator) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                        WinterFlowNodeDebug winterFlowNodeDebug2 = (WinterFlowNodeDebug) winterFlowJSONDecorator3.WinterFlowTransactionManagerStrategy;
                        if (!((WinterFlowNodeDebug) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy).isEmpty()) {
                            winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) ((WinterFlowNodeDebug) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy).first();
                            winterFlowJSONDecorator.WinterFlowConcurrencyThread(winterFlowSchedulerStructure);
                            z3 = winterFlowSchedulerStructure.WinterFlowServerProtocol != null;
                            z2 = false;
                        } else if (!winterFlowNodeDebug2.isEmpty()) {
                            winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) winterFlowNodeDebug2.first();
                            winterFlowJSONDecorator3.WinterFlowConcurrencyThread(winterFlowSchedulerStructure);
                            z3 = winterFlowSchedulerStructure.WinterFlowServerProtocol != null;
                            z2 = true;
                        } else {
                            if (winterFlowNodeDebug.isEmpty()) {
                                break;
                            }
                            WinterFlowSchedulerStructure winterFlowSchedulerStructure3 = (WinterFlowSchedulerStructure) winterFlowNodeDebug.first();
                            winterFlowJSONDecorator2.WinterFlowConcurrencyThread(winterFlowSchedulerStructure3);
                            z2 = true;
                            winterFlowSchedulerStructure = winterFlowSchedulerStructure3;
                            z3 = false;
                        }
                        if (z2) {
                            WinterFlowBatchUI = WinterFlowVariableBandwidth(winterFlowSchedulerStructure, z3);
                        } else {
                            WinterFlowBatchUI = WinterFlowBatchUI(winterFlowSchedulerStructure, z3);
                            if (winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowTransactionManagerStrategy) {
                                winterFlowObjectPackage.WinterFlowRouterStructure(winterFlowSchedulerStructure, WinterFlowCompilerListener.WinterFlowTransactionManagerStrategy);
                            }
                            if (winterFlowSchedulerStructure.WinterFlowBandwidthObject()) {
                                winterFlowObjectPackage.WinterFlowRouterStructure(winterFlowSchedulerStructure, WinterFlowCompilerListener.WinterFlowRouterRouter);
                            }
                        }
                        if (winterFlowSchedulerStructure == winterFlowSchedulerStructure2 && WinterFlowBatchUI) {
                            z = true;
                        }
                    }
                    if (winterFlowRendererDataSource != null) {
                        winterFlowRendererDataSource.WinterFlowRouterStructure();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) this.WinterFlowTransactionManagerStrategy;
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        int i2 = 0;
        while (i2 < i) {
            WinterFlowExceptionStrategy winterFlowExceptionStrategy = ((WinterFlowSchedulerStructure) objArr[i2]).WinterFlowUserManagerUserManager;
            WinterFlowRouterInvoker winterFlowRouterInvoker = winterFlowExceptionStrategy.WinterFlowCacheManagerAgent;
            boolean WinterFlowUnitTestResponse = WinterFlowHookDeserialization.WinterFlowUnitTestResponse(4194304);
            WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowRouterInvoker.WinterFlowValidatorHandler;
            if (WinterFlowUnitTestResponse || (winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowSyntax) != null) {
                WinterFlowPipelineVariable winterFlowPipelineVariable = WinterFlowUIMicroservice.WinterFlowQueueService;
                WinterFlowUserManagerController WinterFlowUserManagerAdapter = winterFlowRouterInvoker.WinterFlowUserManagerAdapter(WinterFlowUnitTestResponse);
                while (WinterFlowUserManagerAdapter != null && (WinterFlowUserManagerAdapter.WinterFlowRouterRouter & 4194304) != 0) {
                    if ((WinterFlowUserManagerAdapter.WinterFlowUnitTestResponse & 4194304) != 0) {
                        WinterFlowTestingEntity winterFlowTestingEntity = WinterFlowUserManagerAdapter;
                        WinterFlowJSON winterFlowJSON2 = null;
                        while (winterFlowTestingEntity != 0) {
                            if (winterFlowTestingEntity instanceof WinterFlowHookFrontend) {
                                ((WinterFlowHookFrontend) winterFlowTestingEntity).WinterFlowTestingNode(winterFlowExceptionStrategy.WinterFlowCacheManagerAgent);
                            } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 4194304) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowTestingEntity.WinterFlowBatchUI;
                                ?? r15 = z4;
                                winterFlowUserManagerController = winterFlowTestingEntity;
                                winterFlowJSON2 = winterFlowJSON2;
                                while (winterFlowUserManagerController3 != null) {
                                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 4194304) != 0) {
                                        r15++;
                                        winterFlowJSON2 = winterFlowJSON2;
                                        if (r15 == 1) {
                                            winterFlowUserManagerController = winterFlowUserManagerController3;
                                        } else {
                                            if (winterFlowJSON2 == null) {
                                                winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController != null) {
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController);
                                                winterFlowUserManagerController = null;
                                            }
                                            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                        }
                                    }
                                    winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                                    winterFlowUserManagerController = winterFlowUserManagerController;
                                    winterFlowJSON2 = winterFlowJSON2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                    z4 = false;
                                    winterFlowTestingEntity = winterFlowUserManagerController;
                                    winterFlowJSON2 = winterFlowJSON2;
                                }
                            }
                            winterFlowUserManagerController = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                            z4 = false;
                            winterFlowTestingEntity = winterFlowUserManagerController;
                            winterFlowJSON2 = winterFlowJSON2;
                        }
                    }
                    if (WinterFlowUserManagerAdapter != winterFlowUserManagerController2) {
                        WinterFlowUserManagerAdapter = WinterFlowUserManagerAdapter.WinterFlowResponseEngine;
                        z4 = false;
                    }
                }
            }
            i2++;
            z4 = false;
        }
        winterFlowJSON.WinterFlowUnitTestResponse();
        return z;
    }

    public void WinterFlowTransactionManagerStrategy() {
        WinterFlowJSON winterFlowJSON = (WinterFlowJSON) this.WinterFlowUnitTestResponse;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        if (i != 0) {
            Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
            for (int i2 = 0; i2 < i; i2++) {
                WinterFlowServiceDecorator winterFlowServiceDecorator = (WinterFlowServiceDecorator) objArr[i2];
                if (winterFlowServiceDecorator.WinterFlowRouterStructure.WinterFlowCacheManagerListener()) {
                    boolean z = winterFlowServiceDecorator.WinterFlowHookDataSource;
                    WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowServiceDecorator.WinterFlowRouterStructure;
                    boolean z2 = winterFlowServiceDecorator.WinterFlowCacheManagerAgent;
                    if (z) {
                        WinterFlowSchedulerStructure.WinterFlowCacheTool(winterFlowSchedulerStructure, z2, 2);
                    } else {
                        WinterFlowSchedulerStructure.WinterFlowConfiguration(winterFlowSchedulerStructure, z2, 2);
                    }
                }
            }
            winterFlowJSON.WinterFlowUnitTestResponse();
        }
    }

    public void WinterFlowUnitTestResponse(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        WinterFlowJSON WinterFlowResolverController = winterFlowSchedulerStructure.WinterFlowResolverController();
        Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
        int i = WinterFlowResolverController.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) objArr[i2];
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructure2.WinterFlowSoftwareProtocol(), Boolean.TRUE) && !winterFlowSchedulerStructure2.WinterFlowConfiguration) {
                if (((WinterFlowObjectPackage) this.WinterFlowArrayNetwork).WinterFlowTransactionManagerStrategy(winterFlowSchedulerStructure2)) {
                    winterFlowSchedulerStructure2.WinterFlowUserManagerUserManager();
                }
                WinterFlowUnitTestResponse(winterFlowSchedulerStructure2);
            }
        }
    }

    public boolean WinterFlowVariableBandwidth(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z) {
        WinterFlowHandlerConsumer winterFlowHandlerConsumer;
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) this.WinterFlowCacheManagerAgent;
        boolean z2 = winterFlowSchedulerStructure.WinterFlowConfiguration;
        WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure.WinterFlowSoftwareEngine;
        if (!z2 && WinterFlowServerProtocol(winterFlowSchedulerStructure)) {
            if (winterFlowSchedulerStructure == winterFlowSchedulerStructure2) {
                winterFlowHandlerConsumer = (WinterFlowHandlerConsumer) this.WinterFlowRouterRouter;
                winterFlowHandlerConsumer.getClass();
            } else {
                winterFlowHandlerConsumer = null;
            }
            if (z) {
                r3 = winterFlowUICompiler.WinterFlowVariableVersionControl ? WinterFlowArrayNetwork(winterFlowSchedulerStructure, winterFlowHandlerConsumer) : false;
                if ((r3 || winterFlowUICompiler.WinterFlowTransactionManagerStrategy) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructure.WinterFlowSoftwareProtocol(), Boolean.TRUE)) {
                    winterFlowSchedulerStructure.WinterFlowUserManagerUserManager();
                }
            } else {
                boolean WinterFlowVariableVersionControl = winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem() ? WinterFlowVariableVersionControl(winterFlowSchedulerStructure, winterFlowHandlerConsumer) : false;
                if (winterFlowSchedulerStructure.WinterFlowBandwidthObject() && (winterFlowSchedulerStructure == winterFlowSchedulerStructure2 || ((WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth()) != null && WinterFlowVariableBandwidth.WinterFlowPackageIDE() && winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowMapperProtocol))) {
                    if (winterFlowSchedulerStructure == winterFlowSchedulerStructure2) {
                        if (winterFlowSchedulerStructure.WinterFlowCacheManagerListener == WinterFlowMapperSubsystem.WinterFlowUnitTestResponse) {
                            winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy();
                        }
                        WinterFlowSchedulerStructure WinterFlowVariableBandwidth2 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                        WinterFlowDecoratorSessionManager.WinterFlowConcurrencyThread(WinterFlowVariableBandwidth2 != null ? WinterFlowVariableBandwidth2.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent.WinterFlowOrchestrationSubsystem : ((WinterFlowSyntaxTransactionManager) WinterFlowLibraryDecorator.WinterFlowRouterStructure(winterFlowSchedulerStructure)).getPlacementScope(), winterFlowUICompiler.WinterFlowOrchestrationSubsystem, 0, 0);
                    } else {
                        winterFlowSchedulerStructure.WinterFlowUIMiddleware();
                    }
                    WinterFlowAlgorithmArray winterFlowAlgorithmArray = (WinterFlowAlgorithmArray) this.WinterFlowVariableVersionControl;
                    if (winterFlowSchedulerStructure.WinterFlowProxyStructure > 0) {
                        ((WinterFlowJSON) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource(winterFlowSchedulerStructure);
                        winterFlowSchedulerStructure.WinterFlowCacheTool = true;
                    }
                }
                r3 = WinterFlowVariableVersionControl;
            }
            WinterFlowTransactionManagerStrategy();
        }
        return r3;
    }

    public WinterFlowConsumerServiceProvider(WinterFlowConfigurationMiddleware winterFlowConfigurationMiddleware, WinterFlowSessionJava winterFlowSessionJava, WinterFlowServerSingleton winterFlowServerSingleton) {
        this.WinterFlowCacheManagerAgent = winterFlowConfigurationMiddleware;
        this.WinterFlowArrayNetwork = new WinterFlowProtocolCompiler("", -1, "");
        List list = winterFlowConfigurationMiddleware.WinterFlowVariableVersionControl;
        WinterFlowDataSourceEngine winterFlowDataSourceEngine = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = list == null ? winterFlowDataSourceEngine : list;
        WinterFlowSerializerUtility.WinterFlowFunctionPipeline(list == null ? winterFlowDataSourceEngine : list, new WinterFlowUnitTestJSON(new WinterFlowCompilerCloud(21, this)));
        winterFlowConfigurationMiddleware.WinterFlowRouterStructure.getClass();
        throw new WinterFlowDecoratorEventEmitter(0);
    }

    public WinterFlowConsumerServiceProvider(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        this.WinterFlowCacheManagerAgent = winterFlowSchedulerStructure;
        this.WinterFlowArrayNetwork = new WinterFlowObjectPackage(8);
        this.WinterFlowVariableVersionControl = new WinterFlowAlgorithmArray(20);
        this.WinterFlowTransactionManagerStrategy = new WinterFlowJSON(new WinterFlowSchedulerStructure[16]);
        this.WinterFlowUnitTestResponse = new WinterFlowJSON(new WinterFlowServiceDecorator[16]);
    }
}
