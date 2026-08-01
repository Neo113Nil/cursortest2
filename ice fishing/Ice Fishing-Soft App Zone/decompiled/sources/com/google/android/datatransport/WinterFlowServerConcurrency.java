package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowServerConcurrency implements Runnable {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowServerConcurrency(WinterFlowSoftwareException winterFlowSoftwareException, Typeface typeface) {
        this.WinterFlowVariableVersionControl = 8;
        this.WinterFlowTransactionManagerStrategy = typeface;
    }

    private final void WinterFlowRouterStructure() {
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) this.WinterFlowTransactionManagerStrategy;
        synchronized (((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse)) {
            SharedPreferences.Editor edit = ((SharedPreferences) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).edit();
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(",");
            }
            edit.putString("topic_operation_queue", sb.toString()).apply();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowLoaderFramework) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent();
                return;
            case 1:
                WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = (WinterFlowBackendEventEmitter) this.WinterFlowTransactionManagerStrategy;
                Trace.beginSection("measureAndLayout");
                try {
                    winterFlowBackendEventEmitter.WinterFlowRouterRouter.WinterFlowBatchUI(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        winterFlowBackendEventEmitter.WinterFlowUnitTestResponse();
                        Trace.endSection();
                        winterFlowBackendEventEmitter.WinterFlowCompilerHandler = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                WinterFlowVariableAgent winterFlowVariableAgent = (WinterFlowVariableAgent) this.WinterFlowTransactionManagerStrategy;
                boolean WinterFlowUnitTestResponse = winterFlowVariableAgent.WinterFlowUnitTestResponse();
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowVariableAgent.WinterFlowVariableVersionControl;
                if (WinterFlowUnitTestResponse) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        winterFlowSyntaxTransactionManager.WinterFlowBatchUI(true);
                        WinterFlowViewSoftware winterFlowViewSoftware = winterFlowVariableAgent.WinterFlowServiceUtility;
                        int[] iArr = winterFlowViewSoftware.WinterFlowHookDataSource;
                        long[] jArr = winterFlowViewSoftware.WinterFlowRouterStructure;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!winterFlowVariableAgent.WinterFlowVariableVersionControl().WinterFlowRouterStructure(i6)) {
                                                i2 = i3;
                                                winterFlowVariableAgent.WinterFlowRouterRouter.add(new WinterFlowConsumerInterface(i6, winterFlowVariableAgent.WinterFlowThreadListener, WinterFlowConfigurationValidator.WinterFlowTransactionManagerStrategy, null));
                                                winterFlowVariableAgent.WinterFlowTransactionAgent.WinterFlowUnitTestResponse(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                                                j >>= 8;
                                                i5++;
                                                i3 = i2;
                                            }
                                        }
                                        i2 = i3;
                                        j >>= 8;
                                        i5++;
                                        i3 = i2;
                                    }
                                    int i7 = i3;
                                    if (i4 == 8) {
                                        i = i7;
                                    }
                                } else {
                                    i = i3;
                                }
                                if (i != length) {
                                    i3 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        winterFlowVariableAgent.WinterFlowSyntax(winterFlowSyntaxTransactionManager.getSemanticsOwner().WinterFlowRouterStructure(), winterFlowVariableAgent.WinterFlowBandwidthObject);
                        Trace.endSection();
                        winterFlowVariableAgent.WinterFlowCacheManagerAgent(winterFlowVariableAgent.WinterFlowVariableVersionControl());
                        winterFlowVariableAgent.WinterFlowServiceUtility();
                        winterFlowVariableAgent.WinterFlowOrchestrationSubsystem = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 3:
                WinterFlowQueueSingleton winterFlowQueueSingleton = (WinterFlowQueueSingleton) this.WinterFlowTransactionManagerStrategy;
                Runnable runnable = winterFlowQueueSingleton.WinterFlowTransactionManagerStrategy;
                if (runnable != null) {
                    runnable.run();
                    winterFlowQueueSingleton.WinterFlowTransactionManagerStrategy = null;
                    return;
                }
                return;
            case 4:
                WinterFlowCompilerOrchestration.WinterFlowRouterRouter((WinterFlowCompilerOrchestration) this.WinterFlowTransactionManagerStrategy);
                return;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowOrchestrationHandler winterFlowOrchestrationHandler = (WinterFlowOrchestrationHandler) this.WinterFlowTransactionManagerStrategy;
                synchronized (winterFlowOrchestrationHandler.WinterFlowCacheManagerAgent) {
                    try {
                        if (winterFlowOrchestrationHandler.WinterFlowUnitTestResponse == null) {
                            return;
                        }
                        try {
                            WinterFlowLibraryEntity WinterFlowCacheManagerAgent = winterFlowOrchestrationHandler.WinterFlowCacheManagerAgent();
                            int i8 = WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
                            if (i8 == 2) {
                                synchronized (winterFlowOrchestrationHandler.WinterFlowCacheManagerAgent) {
                                }
                            }
                            if (i8 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            }
                            try {
                                int i9 = WinterFlowStackRuntime.WinterFlowRouterStructure;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = winterFlowOrchestrationHandler.WinterFlowRouterStructure;
                                WinterFlowLibraryEntity[] winterFlowLibraryEntityArr = {WinterFlowCacheManagerAgent};
                                WinterFlowDecoratorUI winterFlowDecoratorUI = WinterFlowAlgorithmProxy.WinterFlowRouterStructure;
                                WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface WinterFlowServerProtocol = WinterFlowAlgorithmProxy.WinterFlowRouterStructure.WinterFlowServerProtocol(context, winterFlowLibraryEntityArr);
                                    Trace.endSection();
                                    MappedByteBuffer WinterFlowSyntax = WinterFlowDecoratorRouter.WinterFlowSyntax(WinterFlowCacheManagerAgent.WinterFlowRouterStructure, winterFlowOrchestrationHandler.WinterFlowRouterStructure);
                                    if (WinterFlowSyntax == null || WinterFlowServerProtocol == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider(WinterFlowServerProtocol, WinterFlowHandlerWebsocket.WinterFlowUserManagerUserManager(WinterFlowSyntax));
                                        Trace.endSection();
                                        synchronized (winterFlowOrchestrationHandler.WinterFlowCacheManagerAgent) {
                                            try {
                                                WinterFlowQuerySyntax winterFlowQuerySyntax = winterFlowOrchestrationHandler.WinterFlowUnitTestResponse;
                                                if (winterFlowQuerySyntax != null) {
                                                    winterFlowQuerySyntax.WinterFlowBackendCacheManager(winterFlowStackProvider);
                                                }
                                            } finally {
                                            }
                                        }
                                        winterFlowOrchestrationHandler.WinterFlowHookDataSource();
                                        return;
                                    } finally {
                                        int i10 = WinterFlowStackRuntime.WinterFlowRouterStructure;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th2) {
                            synchronized (winterFlowOrchestrationHandler.WinterFlowCacheManagerAgent) {
                                try {
                                    WinterFlowQuerySyntax winterFlowQuerySyntax2 = winterFlowOrchestrationHandler.WinterFlowUnitTestResponse;
                                    if (winterFlowQuerySyntax2 != null) {
                                        winterFlowQuerySyntax2.WinterFlowResolverController(th2);
                                    }
                                    winterFlowOrchestrationHandler.WinterFlowHookDataSource();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                Iterator it = ((WinterFlowViewObject) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                    return;
                }
                return;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter = (WinterFlowConcurrencyEventEmitter) this.WinterFlowTransactionManagerStrategy;
                WinterFlowDatabaseUtility winterFlowDatabaseUtility = winterFlowConcurrencyEventEmitter.WinterFlowResponseEngine;
                if (winterFlowConcurrencyEventEmitter.WinterFlowTransactionManagerStrategy == 0) {
                    winterFlowConcurrencyEventEmitter.WinterFlowUnitTestResponse = true;
                    winterFlowDatabaseUtility.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_PAUSE);
                }
                if (winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl == 0 && winterFlowConcurrencyEventEmitter.WinterFlowUnitTestResponse) {
                    winterFlowDatabaseUtility.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_STOP);
                    winterFlowConcurrencyEventEmitter.WinterFlowRouterRouter = true;
                    return;
                }
                return;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                throw null;
            case 9:
                WinterFlowQueryService.setRippleState$lambda$1((WinterFlowQueryService) this.WinterFlowTransactionManagerStrategy);
                return;
            case 10:
                WinterFlowRouterStructure();
                return;
            case 11:
                WinterFlowTransactionTransaction winterFlowTransactionTransaction = (WinterFlowTransactionTransaction) this.WinterFlowTransactionManagerStrategy;
                winterFlowTransactionTransaction.WinterFlowRouterStructure.getAction();
                winterFlowTransactionTransaction.WinterFlowHookDataSource.WinterFlowCacheManagerAgent(null);
                return;
            default:
                WinterFlowStackProvider winterFlowStackProvider2 = (WinterFlowStackProvider) this.WinterFlowTransactionManagerStrategy;
                ((WinterFlowFrameworkManager) winterFlowStackProvider2.WinterFlowRouterRouter).WinterFlowThreadListener(new WinterFlowExceptionBandwidth(11, winterFlowStackProvider2));
                return;
        }
    }

    public /* synthetic */ WinterFlowServerConcurrency(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }
}
