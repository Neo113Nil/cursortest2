package com.google.android.datatransport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.RunningActivity;
import com.icewinter.flow.winter.icecatch.data.cpp.ID;
import com.icewinter.flow.winter.icecatch.data.cpp.StaticIdProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowCompilerCloud implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowCompilerCloud(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:341:0x0849, code lost:
    
        if (r17 != false) goto L342;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0871  */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.google.android.datatransport.WinterFlowProcessorProtocol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.android.datatransport.WinterFlowNodeMicroservice] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v71, types: [com.google.android.datatransport.WinterFlowSerializerMicroservice, com.google.android.datatransport.WinterFlowServerLayer] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.String] */
    @Override // com.google.android.datatransport.WinterFlowObjectSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowUnitTestResponse(Object obj) {
        long j;
        final boolean z;
        final WinterFlowProxyValidator winterFlowProxyValidator;
        int i;
        boolean z2;
        WinterFlowHandlerWebsocket winterFlowHandlerWebsocket;
        long j2;
        WinterFlowCacheThread winterFlowCacheThread;
        WinterFlowObjectPackage winterFlowObjectPackage;
        float f;
        float f2;
        long WinterFlowThreadListener;
        WinterFlowFrameworkLoader winterFlowFrameworkLoader;
        WinterFlowFrameworkLoader winterFlowFrameworkLoader2;
        Bundle bundle;
        ?? r16;
        WinterFlowOrchestrationBandwidth winterFlowOrchestrationBandwidth;
        int i2 = 4;
        int i3 = 3;
        float f3 = 0.0f;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        winterFlowTransactionManagerLayer = null;
        winterFlowTransactionManagerLayer = null;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return obj == ((WinterFlowResolverRefactoring) this.WinterFlowTransactionManagerStrategy) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                WinterFlowUIRouter winterFlowUIRouter = (WinterFlowUIRouter) this.WinterFlowTransactionManagerStrategy;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == winterFlowUIRouter ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != winterFlowUIRouter ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                WinterFlowUnitTestRefactoring winterFlowUnitTestRefactoring = (WinterFlowUnitTestRefactoring) this.WinterFlowTransactionManagerStrategy;
                ((WinterFlowQueueComponent) winterFlowUnitTestRefactoring.WinterFlowRouterStructure).WinterFlowArrayNetwork(true);
                ((WinterFlowVariableProcess) winterFlowUnitTestRefactoring.WinterFlowHookDataSource).WinterFlowTransactionManagerStrategy(true);
                return new WinterFlowMapperFramework((WinterFlowNetworkStrategy) obj, winterFlowUnitTestRefactoring, 0);
            case 3:
                WinterFlowHandlerInterface winterFlowHandlerInterface = (WinterFlowHandlerInterface) this.WinterFlowTransactionManagerStrategy;
                WinterFlowBackendQuery winterFlowBackendQuery = (WinterFlowBackendQuery) obj;
                if (winterFlowBackendQuery.WinterFlowHookDataSource() * winterFlowHandlerInterface.WinterFlowSerializerStructure < 0.0f || WinterFlowModuleBandwidth.WinterFlowHookDataSource(winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork()) <= 0.0f) {
                    return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowInterfaceSoftware(i2));
                }
                final float min = Math.min(WinterFlowRequestScheduler.WinterFlowHookDataSource(winterFlowHandlerInterface.WinterFlowSerializerStructure, 0.0f) ? 1.0f : (float) Math.ceil(winterFlowBackendQuery.WinterFlowHookDataSource() * winterFlowHandlerInterface.WinterFlowSerializerStructure), (float) Math.ceil(WinterFlowModuleBandwidth.WinterFlowHookDataSource(winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork()) / 2.0f));
                final float f4 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork() & 4294967295L)) - min) & 4294967295L);
                float f5 = min * 2.0f;
                if (f5 > WinterFlowModuleBandwidth.WinterFlowHookDataSource(winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork())) {
                    j = 4294967295L;
                    z = true;
                } else {
                    j = 4294967295L;
                    z = false;
                }
                WinterFlowTestingCloud WinterFlowRouterStructure = winterFlowHandlerInterface.WinterFlowResolverController.WinterFlowRouterStructure(winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(), winterFlowBackendQuery.WinterFlowVariableVersionControl.getLayoutDirection(), winterFlowBackendQuery);
                if (!(WinterFlowRouterStructure instanceof WinterFlowServiceProviderJava)) {
                    if (!(WinterFlowRouterStructure instanceof WinterFlowSessionCompiler)) {
                        if (!(WinterFlowRouterStructure instanceof WinterFlowSchedulerStack)) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            return null;
                        }
                        final WinterFlowHandlerWebsocket winterFlowHandlerWebsocket2 = winterFlowHandlerInterface.WinterFlowMapperProtocol;
                        final long j3 = z ? 0L : floatToRawIntBits;
                        if (z) {
                            floatToRawIntBits2 = winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork();
                        }
                        final long j4 = floatToRawIntBits2;
                        final WinterFlowQueryManager winterFlowQueryManager = z ? WinterFlowNodeMicroservice.WinterFlowResolverController : new WinterFlowQueryManager(min, 0.0f, 0, 0, 30);
                        return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowObjectSubsystem
                            @Override // com.google.android.datatransport.WinterFlowObjectSession
                            public final Object WinterFlowUnitTestResponse(Object obj2) {
                                WinterFlowProtocolStrategy winterFlowProtocolStrategy = (WinterFlowProtocolStrategy) obj2;
                                winterFlowProtocolStrategy.WinterFlowRouterStructure();
                                WinterFlowParserUserManager.WinterFlowFrontendBackend(winterFlowProtocolStrategy, WinterFlowHandlerWebsocket.this, j3, j4, 0.0f, winterFlowQueryManager, 104);
                                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            }
                        });
                    }
                    final WinterFlowHandlerWebsocket winterFlowHandlerWebsocket3 = winterFlowHandlerInterface.WinterFlowMapperProtocol;
                    WinterFlowQueryJSON winterFlowQueryJSON = ((WinterFlowSessionCompiler) WinterFlowRouterStructure).WinterFlowThreadListener;
                    if (WinterFlowFrameworkMechanism.WinterFlowSyntax(winterFlowQueryJSON)) {
                        final long j5 = winterFlowQueryJSON.WinterFlowVariableVersionControl;
                        final WinterFlowQueryManager winterFlowQueryManager2 = new WinterFlowQueryManager(min, 0.0f, 0, 0, 30);
                        return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowOrchestrationRefactoring
                            @Override // com.google.android.datatransport.WinterFlowObjectSession
                            public final Object WinterFlowUnitTestResponse(Object obj2) {
                                long j6;
                                WinterFlowProtocolStrategy winterFlowProtocolStrategy = (WinterFlowProtocolStrategy) obj2;
                                winterFlowProtocolStrategy.WinterFlowRouterStructure();
                                WinterFlowCacheThread winterFlowCacheThread2 = winterFlowProtocolStrategy.WinterFlowVariableVersionControl;
                                boolean z3 = z;
                                WinterFlowHandlerWebsocket winterFlowHandlerWebsocket4 = winterFlowHandlerWebsocket3;
                                long j7 = j5;
                                if (z3) {
                                    WinterFlowParserUserManager.WinterFlowTransactionAgent(winterFlowProtocolStrategy, winterFlowHandlerWebsocket4, 0L, 0L, j7, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                                    float f6 = f4;
                                    if (intBitsToFloat < f6) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() >> 32));
                                        float f7 = min;
                                        float f8 = intBitsToFloat2 - f7;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() & 4294967295L)) - f7;
                                        WinterFlowObjectPackage winterFlowObjectPackage2 = winterFlowCacheThread2.WinterFlowTransactionManagerStrategy;
                                        long WinterFlowThreadListener2 = winterFlowObjectPackage2.WinterFlowThreadListener();
                                        winterFlowObjectPackage2.WinterFlowTransactionAgent().WinterFlowTransactionAgent();
                                        try {
                                            ((WinterFlowObjectPackage) ((WinterFlowConfigurationModule) winterFlowObjectPackage2.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy).WinterFlowTransactionAgent().WinterFlowUnitTestResponse(f7, f7, f8, intBitsToFloat3, 0);
                                            j6 = WinterFlowThreadListener2;
                                            try {
                                                WinterFlowParserUserManager.WinterFlowTransactionAgent(winterFlowProtocolStrategy, winterFlowHandlerWebsocket4, 0L, 0L, j7, null, 246);
                                                winterFlowObjectPackage2.WinterFlowTransactionAgent().WinterFlowResponseEngine();
                                                winterFlowObjectPackage2.WinterFlowArrayHelper(j6);
                                            } catch (Throwable th) {
                                                th = th;
                                                winterFlowObjectPackage2.WinterFlowTransactionAgent().WinterFlowResponseEngine();
                                                winterFlowObjectPackage2.WinterFlowArrayHelper(j6);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j6 = WinterFlowThreadListener2;
                                        }
                                    } else {
                                        WinterFlowParserUserManager.WinterFlowTransactionAgent(winterFlowProtocolStrategy, winterFlowHandlerWebsocket4, floatToRawIntBits, floatToRawIntBits2, WinterFlowSoftwareException.WinterFlowCompilerDataSource(j7, f6), winterFlowQueryManager2, 208);
                                    }
                                }
                                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            }
                        });
                    }
                    WinterFlowBatchIDE winterFlowBatchIDE = winterFlowHandlerInterface.WinterFlowRouterAdapter;
                    if (winterFlowBatchIDE == null) {
                        winterFlowBatchIDE = new WinterFlowBatchIDE();
                        winterFlowHandlerInterface.WinterFlowRouterAdapter = winterFlowBatchIDE;
                    }
                    WinterFlowManagerCloud winterFlowManagerCloud = winterFlowBatchIDE.WinterFlowArrayNetwork;
                    if (winterFlowManagerCloud == null) {
                        winterFlowManagerCloud = WinterFlowProviderAgent.WinterFlowRouterStructure();
                        winterFlowBatchIDE.WinterFlowArrayNetwork = winterFlowManagerCloud;
                    }
                    winterFlowManagerCloud.WinterFlowVariableVersionControl();
                    WinterFlowManagerCloud.WinterFlowHookDataSource(winterFlowManagerCloud, winterFlowQueryJSON);
                    if (!z) {
                        WinterFlowManagerCloud WinterFlowRouterStructure2 = WinterFlowProviderAgent.WinterFlowRouterStructure();
                        WinterFlowManagerCloud.WinterFlowHookDataSource(WinterFlowRouterStructure2, new WinterFlowQueryJSON(min, min, (winterFlowQueryJSON.WinterFlowCacheManagerAgent - winterFlowQueryJSON.WinterFlowRouterStructure) - min, (winterFlowQueryJSON.WinterFlowArrayNetwork - winterFlowQueryJSON.WinterFlowHookDataSource) - min, WinterFlowSoftwareException.WinterFlowCompilerDataSource(winterFlowQueryJSON.WinterFlowVariableVersionControl, min), WinterFlowSoftwareException.WinterFlowCompilerDataSource(winterFlowQueryJSON.WinterFlowTransactionManagerStrategy, min), WinterFlowSoftwareException.WinterFlowCompilerDataSource(winterFlowQueryJSON.WinterFlowUnitTestResponse, min), WinterFlowSoftwareException.WinterFlowCompilerDataSource(winterFlowQueryJSON.WinterFlowRouterRouter, min)));
                        winterFlowManagerCloud.WinterFlowArrayNetwork(winterFlowManagerCloud, WinterFlowRouterStructure2, 0);
                    }
                    return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowRouterCompiler(i2, winterFlowManagerCloud, winterFlowHandlerWebsocket3));
                }
                WinterFlowHandlerWebsocket winterFlowHandlerWebsocket4 = winterFlowHandlerInterface.WinterFlowMapperProtocol;
                WinterFlowServiceProviderJava winterFlowServiceProviderJava = (WinterFlowServiceProviderJava) WinterFlowRouterStructure;
                WinterFlowManagerCloud winterFlowManagerCloud2 = winterFlowServiceProviderJava.WinterFlowThreadListener;
                int i4 = 5;
                if (z) {
                    return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowRouterCompiler(i4, winterFlowServiceProviderJava, winterFlowHandlerWebsocket4));
                }
                if (winterFlowHandlerWebsocket4 instanceof WinterFlowRouterFramework) {
                    winterFlowProxyValidator = new WinterFlowProxyValidator(5, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(((WinterFlowRouterFramework) winterFlowHandlerWebsocket4).WinterFlowBatchUI, 1.0f));
                    i = 1;
                } else {
                    winterFlowProxyValidator = null;
                    i = 0;
                }
                final WinterFlowVersionParser WinterFlowCacheManagerAgent = winterFlowManagerCloud2.WinterFlowCacheManagerAgent();
                float f6 = WinterFlowCacheManagerAgent.WinterFlowHookDataSource;
                float f7 = WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
                WinterFlowBatchIDE winterFlowBatchIDE2 = winterFlowHandlerInterface.WinterFlowRouterAdapter;
                if (winterFlowBatchIDE2 == null) {
                    winterFlowBatchIDE2 = new WinterFlowBatchIDE();
                    winterFlowHandlerInterface.WinterFlowRouterAdapter = winterFlowBatchIDE2;
                }
                WinterFlowManagerCloud winterFlowManagerCloud3 = winterFlowBatchIDE2.WinterFlowArrayNetwork;
                if (winterFlowManagerCloud3 == null) {
                    winterFlowManagerCloud3 = WinterFlowProviderAgent.WinterFlowRouterStructure();
                    winterFlowBatchIDE2.WinterFlowArrayNetwork = winterFlowManagerCloud3;
                }
                winterFlowManagerCloud3.WinterFlowVariableVersionControl();
                float f8 = WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
                float f9 = WinterFlowCacheManagerAgent.WinterFlowArrayNetwork;
                float f10 = WinterFlowCacheManagerAgent.WinterFlowCacheManagerAgent;
                float f11 = WinterFlowCacheManagerAgent.WinterFlowHookDataSource;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    WinterFlowProviderAgent.WinterFlowHookDataSource("Invalid rectangle, make sure no value is NaN");
                }
                long j6 = j;
                RectF rectF = winterFlowManagerCloud3.WinterFlowHookDataSource;
                if (rectF == null) {
                    rectF = new RectF();
                    winterFlowManagerCloud3.WinterFlowHookDataSource = rectF;
                }
                rectF.set(f8, f11, f10, f9);
                Path path = winterFlowManagerCloud3.WinterFlowRouterStructure;
                RectF rectF2 = winterFlowManagerCloud3.WinterFlowHookDataSource;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                winterFlowManagerCloud3.WinterFlowArrayNetwork(winterFlowManagerCloud3, winterFlowManagerCloud2, 0);
                final WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                long ceil = (((int) Math.ceil(WinterFlowCacheManagerAgent.WinterFlowArrayNetwork - f6)) & j6) | (((int) Math.ceil(WinterFlowCacheManagerAgent.WinterFlowCacheManagerAgent - f7)) << 32);
                WinterFlowBatchIDE winterFlowBatchIDE3 = winterFlowHandlerInterface.WinterFlowRouterAdapter;
                winterFlowBatchIDE3.getClass();
                WinterFlowSoftwareUserManager winterFlowSoftwareUserManager = winterFlowBatchIDE3.WinterFlowRouterStructure;
                WinterFlowHookInterface winterFlowHookInterface = winterFlowBatchIDE3.WinterFlowHookDataSource;
                WinterFlowInheritanceNode winterFlowInheritanceNode = winterFlowSoftwareUserManager != null ? new WinterFlowInheritanceNode(winterFlowSoftwareUserManager.WinterFlowRouterStructure()) : null;
                try {
                    try {
                        if (winterFlowInheritanceNode == null || winterFlowInheritanceNode.WinterFlowRouterStructure != 0) {
                            WinterFlowInheritanceNode winterFlowInheritanceNode2 = winterFlowSoftwareUserManager != null ? new WinterFlowInheritanceNode(winterFlowSoftwareUserManager.WinterFlowRouterStructure()) : null;
                            if (winterFlowInheritanceNode2 == null || i != winterFlowInheritanceNode2.WinterFlowRouterStructure) {
                                z2 = false;
                                if (winterFlowSoftwareUserManager != null || winterFlowHookInterface == null) {
                                    winterFlowHandlerWebsocket = winterFlowHandlerWebsocket4;
                                    j2 = ceil;
                                } else {
                                    winterFlowHandlerWebsocket = winterFlowHandlerWebsocket4;
                                    j2 = ceil;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork() >> 32));
                                    Bitmap bitmap = winterFlowSoftwareUserManager.WinterFlowRouterStructure;
                                    if (intBitsToFloat <= bitmap.getWidth()) {
                                        if (Float.intBitsToFloat((int) (winterFlowBackendQuery.WinterFlowVariableVersionControl.WinterFlowArrayNetwork() & j6)) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                winterFlowSoftwareUserManager = WinterFlowTestingCloud.WinterFlowRouterStructure((int) (j2 >> 32), (int) (j2 & j6), i);
                                winterFlowBatchIDE3.WinterFlowRouterStructure = winterFlowSoftwareUserManager;
                                Canvas canvas = WinterFlowBandwidthListener.WinterFlowRouterStructure;
                                winterFlowHookInterface = new WinterFlowHookInterface();
                                winterFlowHookInterface.WinterFlowRouterStructure = new Canvas(winterFlowSoftwareUserManager.WinterFlowRouterStructure);
                                winterFlowBatchIDE3.WinterFlowHookDataSource = winterFlowHookInterface;
                                winterFlowCacheThread = winterFlowBatchIDE3.WinterFlowCacheManagerAgent;
                                if (winterFlowCacheThread == null) {
                                    winterFlowCacheThread = new WinterFlowCacheThread();
                                    winterFlowBatchIDE3.WinterFlowCacheManagerAgent = winterFlowCacheThread;
                                }
                                winterFlowObjectPackage = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
                                WinterFlowSessionQueue winterFlowSessionQueue = winterFlowCacheThread.WinterFlowVariableVersionControl;
                                long WinterFlowUserManagerUserManager = WinterFlowServerManager.WinterFlowUserManagerUserManager(j2);
                                WinterFlowCacheManagerConfiguration layoutDirection = winterFlowBackendQuery.WinterFlowVariableVersionControl.getLayoutDirection();
                                WinterFlowCacheThread winterFlowCacheThread2 = winterFlowCacheThread;
                                WinterFlowConcurrencyParser winterFlowConcurrencyParser = winterFlowSessionQueue.WinterFlowRouterStructure;
                                WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = winterFlowSessionQueue.WinterFlowHookDataSource;
                                WinterFlowHandlerWebsocket winterFlowHandlerWebsocket5 = winterFlowHandlerWebsocket;
                                WinterFlowJavaLayer winterFlowJavaLayer = winterFlowSessionQueue.WinterFlowCacheManagerAgent;
                                WinterFlowManagerCloud winterFlowManagerCloud4 = winterFlowManagerCloud3;
                                long j7 = winterFlowSessionQueue.WinterFlowArrayNetwork;
                                winterFlowSessionQueue.WinterFlowRouterStructure = winterFlowBackendQuery;
                                winterFlowSessionQueue.WinterFlowHookDataSource = layoutDirection;
                                winterFlowSessionQueue.WinterFlowCacheManagerAgent = winterFlowHookInterface;
                                winterFlowSessionQueue.WinterFlowArrayNetwork = WinterFlowUserManagerUserManager;
                                winterFlowHookInterface.WinterFlowTransactionAgent();
                                WinterFlowParserUserManager.WinterFlowFrameworkTransaction(winterFlowCacheThread2, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0L, WinterFlowUserManagerUserManager, 58);
                                f = -f7;
                                f2 = -f6;
                                ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(f, f2);
                                WinterFlowParserUserManager.WinterFlowStrategyTool(winterFlowCacheThread2, winterFlowServiceProviderJava.WinterFlowThreadListener, winterFlowHandlerWebsocket5, 0.0f, new WinterFlowQueryManager(f5, 0.0f, 0, 0, 30), 52);
                                WinterFlowHookInterface winterFlowHookInterface2 = winterFlowHookInterface;
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() >> 32));
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() & j6)) + 1.0f) / Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() & j6));
                                long WinterFlowCompilerHandler = winterFlowCacheThread2.WinterFlowCompilerHandler();
                                WinterFlowThreadListener = winterFlowObjectPackage.WinterFlowThreadListener();
                                winterFlowObjectPackage.WinterFlowTransactionAgent().WinterFlowTransactionAgent();
                                ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(intBitsToFloat2, intBitsToFloat3, WinterFlowCompilerHandler);
                                WinterFlowParserUserManager.WinterFlowStrategyTool(winterFlowCacheThread2, winterFlowManagerCloud4, winterFlowHandlerWebsocket5, 0.0f, null, 28);
                                ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f, -f2);
                                winterFlowHookInterface2.WinterFlowResponseEngine();
                                winterFlowSessionQueue.WinterFlowRouterStructure = winterFlowConcurrencyParser;
                                winterFlowSessionQueue.WinterFlowHookDataSource = winterFlowCacheManagerConfiguration;
                                winterFlowSessionQueue.WinterFlowCacheManagerAgent = winterFlowJavaLayer;
                                winterFlowSessionQueue.WinterFlowArrayNetwork = j7;
                                winterFlowSoftwareUserManager.WinterFlowRouterStructure.prepareToDraw();
                                winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowSoftwareUserManager;
                                final long j8 = j2;
                                return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowServiceArray
                                    @Override // com.google.android.datatransport.WinterFlowObjectSession
                                    public final Object WinterFlowUnitTestResponse(Object obj2) {
                                        WinterFlowBandwidthCache winterFlowBandwidthCache2 = winterFlowBandwidthCache;
                                        long j9 = j8;
                                        WinterFlowProxyValidator winterFlowProxyValidator2 = winterFlowProxyValidator;
                                        WinterFlowProtocolStrategy winterFlowProtocolStrategy = (WinterFlowProtocolStrategy) obj2;
                                        winterFlowProtocolStrategy.WinterFlowRouterStructure();
                                        WinterFlowVersionParser winterFlowVersionParser = WinterFlowVersionParser.this;
                                        float f12 = winterFlowVersionParser.WinterFlowRouterStructure;
                                        float f13 = winterFlowVersionParser.WinterFlowHookDataSource;
                                        WinterFlowCacheThread winterFlowCacheThread3 = winterFlowProtocolStrategy.WinterFlowVariableVersionControl;
                                        ((WinterFlowConfigurationModule) winterFlowCacheThread3.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(f12, f13);
                                        try {
                                            WinterFlowParserUserManager.WinterFlowThreadPoolEventEmitter(winterFlowProtocolStrategy, (WinterFlowSoftwareUserManager) winterFlowBandwidthCache2.WinterFlowVariableVersionControl, j9, 0L, 0.0f, winterFlowProxyValidator2, 0, 890);
                                            ((WinterFlowConfigurationModule) winterFlowCacheThread3.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f12, -f13);
                                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                                        } catch (Throwable th) {
                                            ((WinterFlowConfigurationModule) winterFlowCacheThread3.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f12, -f13);
                                            throw th;
                                        }
                                    }
                                });
                            }
                        }
                        ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(intBitsToFloat2, intBitsToFloat3, WinterFlowCompilerHandler);
                        WinterFlowParserUserManager.WinterFlowStrategyTool(winterFlowCacheThread2, winterFlowManagerCloud4, winterFlowHandlerWebsocket5, 0.0f, null, 28);
                        ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f, -f2);
                        winterFlowHookInterface2.WinterFlowResponseEngine();
                        winterFlowSessionQueue.WinterFlowRouterStructure = winterFlowConcurrencyParser;
                        winterFlowSessionQueue.WinterFlowHookDataSource = winterFlowCacheManagerConfiguration;
                        winterFlowSessionQueue.WinterFlowCacheManagerAgent = winterFlowJavaLayer;
                        winterFlowSessionQueue.WinterFlowArrayNetwork = j7;
                        winterFlowSoftwareUserManager.WinterFlowRouterStructure.prepareToDraw();
                        winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowSoftwareUserManager;
                        final long j82 = j2;
                        return winterFlowBackendQuery.WinterFlowRouterStructure(new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowServiceArray
                            @Override // com.google.android.datatransport.WinterFlowObjectSession
                            public final Object WinterFlowUnitTestResponse(Object obj2) {
                                WinterFlowBandwidthCache winterFlowBandwidthCache2 = winterFlowBandwidthCache;
                                long j9 = j82;
                                WinterFlowProxyValidator winterFlowProxyValidator2 = winterFlowProxyValidator;
                                WinterFlowProtocolStrategy winterFlowProtocolStrategy = (WinterFlowProtocolStrategy) obj2;
                                winterFlowProtocolStrategy.WinterFlowRouterStructure();
                                WinterFlowVersionParser winterFlowVersionParser = WinterFlowVersionParser.this;
                                float f12 = winterFlowVersionParser.WinterFlowRouterStructure;
                                float f13 = winterFlowVersionParser.WinterFlowHookDataSource;
                                WinterFlowCacheThread winterFlowCacheThread3 = winterFlowProtocolStrategy.WinterFlowVariableVersionControl;
                                ((WinterFlowConfigurationModule) winterFlowCacheThread3.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(f12, f13);
                                try {
                                    WinterFlowParserUserManager.WinterFlowThreadPoolEventEmitter(winterFlowProtocolStrategy, (WinterFlowSoftwareUserManager) winterFlowBandwidthCache2.WinterFlowVariableVersionControl, j9, 0L, 0.0f, winterFlowProxyValidator2, 0, 890);
                                    ((WinterFlowConfigurationModule) winterFlowCacheThread3.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f12, -f13);
                                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                                } catch (Throwable th) {
                                    ((WinterFlowConfigurationModule) winterFlowCacheThread3.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f12, -f13);
                                    throw th;
                                }
                            }
                        });
                    } finally {
                        winterFlowObjectPackage.WinterFlowTransactionAgent().WinterFlowResponseEngine();
                        winterFlowObjectPackage.WinterFlowArrayHelper(WinterFlowThreadListener);
                    }
                    WinterFlowParserUserManager.WinterFlowStrategyTool(winterFlowCacheThread2, winterFlowServiceProviderJava.WinterFlowThreadListener, winterFlowHandlerWebsocket5, 0.0f, new WinterFlowQueryManager(f5, 0.0f, 0, 0, 30), 52);
                    WinterFlowHookInterface winterFlowHookInterface22 = winterFlowHookInterface;
                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() >> 32));
                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() & j6)) + 1.0f) / Float.intBitsToFloat((int) (winterFlowCacheThread2.WinterFlowArrayNetwork() & j6));
                    long WinterFlowCompilerHandler2 = winterFlowCacheThread2.WinterFlowCompilerHandler();
                    WinterFlowThreadListener = winterFlowObjectPackage.WinterFlowThreadListener();
                    winterFlowObjectPackage.WinterFlowTransactionAgent().WinterFlowTransactionAgent();
                } catch (Throwable th) {
                    ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(-f, -f2);
                    throw th;
                }
                z2 = true;
                if (winterFlowSoftwareUserManager != null) {
                }
                winterFlowHandlerWebsocket = winterFlowHandlerWebsocket4;
                j2 = ceil;
                winterFlowSoftwareUserManager = WinterFlowTestingCloud.WinterFlowRouterStructure((int) (j2 >> 32), (int) (j2 & j6), i);
                winterFlowBatchIDE3.WinterFlowRouterStructure = winterFlowSoftwareUserManager;
                Canvas canvas2 = WinterFlowBandwidthListener.WinterFlowRouterStructure;
                winterFlowHookInterface = new WinterFlowHookInterface();
                winterFlowHookInterface.WinterFlowRouterStructure = new Canvas(winterFlowSoftwareUserManager.WinterFlowRouterStructure);
                winterFlowBatchIDE3.WinterFlowHookDataSource = winterFlowHookInterface;
                winterFlowCacheThread = winterFlowBatchIDE3.WinterFlowCacheManagerAgent;
                if (winterFlowCacheThread == null) {
                }
                winterFlowObjectPackage = winterFlowCacheThread.WinterFlowTransactionManagerStrategy;
                WinterFlowSessionQueue winterFlowSessionQueue2 = winterFlowCacheThread.WinterFlowVariableVersionControl;
                long WinterFlowUserManagerUserManager2 = WinterFlowServerManager.WinterFlowUserManagerUserManager(j2);
                WinterFlowCacheManagerConfiguration layoutDirection2 = winterFlowBackendQuery.WinterFlowVariableVersionControl.getLayoutDirection();
                WinterFlowCacheThread winterFlowCacheThread22 = winterFlowCacheThread;
                WinterFlowConcurrencyParser winterFlowConcurrencyParser2 = winterFlowSessionQueue2.WinterFlowRouterStructure;
                WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = winterFlowSessionQueue2.WinterFlowHookDataSource;
                WinterFlowHandlerWebsocket winterFlowHandlerWebsocket52 = winterFlowHandlerWebsocket;
                WinterFlowJavaLayer winterFlowJavaLayer2 = winterFlowSessionQueue2.WinterFlowCacheManagerAgent;
                WinterFlowManagerCloud winterFlowManagerCloud42 = winterFlowManagerCloud3;
                long j72 = winterFlowSessionQueue2.WinterFlowArrayNetwork;
                winterFlowSessionQueue2.WinterFlowRouterStructure = winterFlowBackendQuery;
                winterFlowSessionQueue2.WinterFlowHookDataSource = layoutDirection2;
                winterFlowSessionQueue2.WinterFlowCacheManagerAgent = winterFlowHookInterface;
                winterFlowSessionQueue2.WinterFlowArrayNetwork = WinterFlowUserManagerUserManager2;
                winterFlowHookInterface.WinterFlowTransactionAgent();
                WinterFlowParserUserManager.WinterFlowFrameworkTransaction(winterFlowCacheThread22, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0L, WinterFlowUserManagerUserManager2, 58);
                f = -f7;
                f2 = -f6;
                ((WinterFlowConfigurationModule) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth(f, f2);
                break;
            case 4:
                ((WinterFlowDeserializationListener) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowMapperParser winterFlowMapperParser = (WinterFlowMapperParser) obj;
                return ((WinterFlowObjectUtility) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(new WinterFlowMapperParser(null, winterFlowMapperParser.WinterFlowHookDataSource, winterFlowMapperParser.WinterFlowCacheManagerAgent, winterFlowMapperParser.WinterFlowArrayNetwork, winterFlowMapperParser.WinterFlowVariableVersionControl)).getValue();
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                Activity activity = (Activity) this.WinterFlowTransactionManagerStrategy;
                ((WinterFlowSyntaxModule) obj).getClass();
                if (activity != null) {
                    activity.setRequestedOrientation(1);
                }
                return new WinterFlowBandwidthSoftware(i3, activity);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowFrontendMechanism winterFlowFrontendMechanism = (WinterFlowFrontendMechanism) this.WinterFlowTransactionManagerStrategy;
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) obj;
                WinterFlowNetworkFramework winterFlowNetworkFramework = WinterFlowFrontendMechanism.WinterFlowCacheManagerAgent;
                Map WinterFlowRouterStructure3 = winterFlowDataSourceSerializer.WinterFlowRouterStructure();
                LinkedHashMap linkedHashMap = winterFlowDataSourceSerializer.WinterFlowRouterStructure;
                long j9 = 0;
                for (Map.Entry entry2 : WinterFlowRouterStructure3.entrySet()) {
                    if (entry2.getValue() instanceof Set) {
                        WinterFlowNetworkFramework winterFlowNetworkFramework2 = (WinterFlowNetworkFramework) entry2.getKey();
                        Set set = (Set) entry2.getValue();
                        String WinterFlowHookDataSource = winterFlowFrontendMechanism.WinterFlowHookDataSource(System.currentTimeMillis());
                        if (set.contains(WinterFlowHookDataSource)) {
                            Object[] objArr = {WinterFlowHookDataSource};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                WinterFlowEventEmitterOrchestration.WinterFlowTransactionManagerStrategy(obj2, "duplicate element: ");
                                return null;
                            }
                            winterFlowDataSourceSerializer.WinterFlowCacheManagerAgent(winterFlowNetworkFramework2, Collections.unmodifiableSet(hashSet));
                            j9++;
                        } else {
                            winterFlowNetworkFramework2.getClass();
                            winterFlowDataSourceSerializer.WinterFlowHookDataSource();
                            linkedHashMap.remove(winterFlowNetworkFramework2);
                        }
                    }
                }
                if (j9 != 0) {
                    winterFlowDataSourceSerializer.WinterFlowCacheManagerAgent(winterFlowNetworkFramework, Long.valueOf(j9));
                    return null;
                }
                winterFlowNetworkFramework.getClass();
                winterFlowDataSourceSerializer.WinterFlowHookDataSource();
                linkedHashMap.remove(winterFlowNetworkFramework);
                return null;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowJavaOrchestration winterFlowJavaOrchestration = (WinterFlowJavaOrchestration) this.WinterFlowTransactionManagerStrategy;
                Context context = (Context) obj;
                context.getClass();
                String str = winterFlowJavaOrchestration.WinterFlowRouterStructure;
                LinkedHashSet linkedHashSet = WinterFlowExceptionMechanism.WinterFlowRouterStructure;
                linkedHashSet.getClass();
                return WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(new WinterFlowTransactionOrchestration(context, str, WinterFlowFunctionDeployment.WinterFlowRouterStructure, new WinterFlowEventDecorator(linkedHashSet, null, i3), new WinterFlowObjectEngine(3, null)));
            case 9:
                return new WinterFlowBandwidthSoftware(i2, (WinterFlowCompilerComponent) this.WinterFlowTransactionManagerStrategy);
            case 10:
                return new WinterFlowBandwidthSoftware(6, (WinterFlowDatabaseServer) this.WinterFlowTransactionManagerStrategy);
            case 11:
                WinterFlowNetworkSession winterFlowNetworkSession = (WinterFlowNetworkSession) this.WinterFlowTransactionManagerStrategy;
                float f12 = -((Float) obj).floatValue();
                if ((f12 >= 0.0f || winterFlowNetworkSession.WinterFlowArrayNetwork()) && (f12 <= 0.0f || winterFlowNetworkSession.WinterFlowRouterStructure())) {
                    if (Math.abs(winterFlowNetworkSession.WinterFlowRouterRouter) > 0.5f) {
                        WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("entered drag with non-zero pending scroll");
                    }
                    winterFlowNetworkSession.WinterFlowArrayNetwork = true;
                    float f13 = winterFlowNetworkSession.WinterFlowRouterRouter + f12;
                    winterFlowNetworkSession.WinterFlowRouterRouter = f13;
                    if (Math.abs(f13) > 0.5f) {
                        float f14 = winterFlowNetworkSession.WinterFlowRouterRouter;
                        int round = Math.round(f14);
                        WinterFlowFrameworkLoader WinterFlowTransactionManagerStrategy = ((WinterFlowFrameworkLoader) winterFlowNetworkSession.WinterFlowTransactionManagerStrategy.getValue()).WinterFlowTransactionManagerStrategy(round, !winterFlowNetworkSession.WinterFlowHookDataSource);
                        if (WinterFlowTransactionManagerStrategy != null && (winterFlowFrameworkLoader2 = winterFlowNetworkSession.WinterFlowCacheManagerAgent) != null) {
                            WinterFlowFrameworkLoader WinterFlowTransactionManagerStrategy2 = winterFlowFrameworkLoader2.WinterFlowTransactionManagerStrategy(round, true);
                            if (WinterFlowTransactionManagerStrategy2 != null) {
                                winterFlowNetworkSession.WinterFlowCacheManagerAgent = WinterFlowTransactionManagerStrategy2;
                            } else {
                                winterFlowFrameworkLoader = null;
                                if (winterFlowFrameworkLoader == null) {
                                    winterFlowNetworkSession.WinterFlowTransactionManagerStrategy(winterFlowFrameworkLoader, winterFlowNetworkSession.WinterFlowHookDataSource, true);
                                    winterFlowNetworkSession.WinterFlowSerializerStructure.setValue(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                                    winterFlowNetworkSession.WinterFlowRouterRouter(f14 - winterFlowNetworkSession.WinterFlowRouterRouter, winterFlowFrameworkLoader);
                                } else {
                                    WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowNetworkSession.WinterFlowTransactionAgent;
                                    if (winterFlowSchedulerStructure != null) {
                                        winterFlowSchedulerStructure.WinterFlowTransactionAgent();
                                    }
                                    winterFlowNetworkSession.WinterFlowRouterRouter(f14 - winterFlowNetworkSession.WinterFlowRouterRouter, winterFlowNetworkSession.WinterFlowUnitTestResponse());
                                }
                            }
                        }
                        winterFlowFrameworkLoader = WinterFlowTransactionManagerStrategy;
                        if (winterFlowFrameworkLoader == null) {
                        }
                    }
                    if (Math.abs(winterFlowNetworkSession.WinterFlowRouterRouter) > 0.5f) {
                        f12 -= winterFlowNetworkSession.WinterFlowRouterRouter;
                        winterFlowNetworkSession.WinterFlowRouterRouter = 0.0f;
                    }
                    f3 = f12;
                }
                return Float.valueOf(-f3);
            case 12:
                WinterFlowEncryptionComponent winterFlowEncryptionComponent = (WinterFlowEncryptionComponent) this.WinterFlowTransactionManagerStrategy;
                return Boolean.valueOf(winterFlowEncryptionComponent != null ? winterFlowEncryptionComponent.WinterFlowCacheManagerAgent(obj) : true);
            case 13:
                return ((WinterFlowLoaderRequest) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(((Integer) obj).intValue());
            case 14:
                ((WinterFlowIDEPlatform) this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource(null);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 15:
                Bundle bundle2 = (Bundle) obj;
                WinterFlowProtocolManager WinterFlowBandwidthObject = WinterFlowCacheRuntime.WinterFlowBandwidthObject((Context) this.WinterFlowTransactionManagerStrategy);
                if (bundle2 != null) {
                    bundle2.setClassLoader(WinterFlowBandwidthObject.WinterFlowRouterStructure.getClassLoader());
                }
                WinterFlowProcessorProtocol winterFlowProcessorProtocol = WinterFlowBandwidthObject.WinterFlowHookDataSource;
                LinkedHashMap linkedHashMap2 = winterFlowProcessorProtocol.WinterFlowThreadListener;
                if (bundle2 == null) {
                    r16 = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    winterFlowProcessorProtocol.WinterFlowArrayNetwork = bundle;
                    winterFlowProcessorProtocol.WinterFlowVariableVersionControl = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) WinterFlowProviderRouter.WinterFlowThreadListener(bundle2, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                    linkedHashMap2.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            int i7 = i6 + 1;
                            WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 = winterFlowTransactionManagerLayer;
                            winterFlowProcessorProtocol.WinterFlowServerProtocol.put(Integer.valueOf(intArray[i5]), !WinterFlowManagerRequest.WinterFlowThreadListener(stringArrayList.get(i6), "") ? stringArrayList.get(i6) : winterFlowTransactionManagerLayer2);
                            i5++;
                            i6 = i7;
                            winterFlowTransactionManagerLayer = winterFlowTransactionManagerLayer2;
                        }
                    }
                    r16 = winterFlowTransactionManagerLayer;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            WinterFlowFrameworkMechanism.WinterFlowResponseEngine("android-support-nav:controller:backStackStates");
                            throw r16;
                        }
                        int size = stringArrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            String str2 = stringArrayList2.get(i8);
                            i8++;
                            String str3 = str2;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                ArrayList WinterFlowThreadListener2 = WinterFlowProviderRouter.WinterFlowThreadListener(bundle2, "android-support-nav:controller:backStackStates:" + str3);
                                WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = new WinterFlowOrchestrationValidator(WinterFlowThreadListener2.size());
                                int size2 = WinterFlowThreadListener2.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    Object obj3 = WinterFlowThreadListener2.get(i9);
                                    i9++;
                                    winterFlowOrchestrationValidator.addLast(new WinterFlowMicroserviceEntity((Bundle) obj3));
                                }
                                linkedHashMap2.put(str3, winterFlowOrchestrationValidator);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z3 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z3 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z3) : r16;
                    WinterFlowBandwidthObject.WinterFlowVariableVersionControl = valueOf != null ? valueOf.booleanValue() : false;
                }
                return WinterFlowBandwidthObject;
            case 16:
                WinterFlowProtocolManager winterFlowProtocolManager = (WinterFlowProtocolManager) this.WinterFlowTransactionManagerStrategy;
                WinterFlowCompilerUtility winterFlowCompilerUtility = (WinterFlowCompilerUtility) obj;
                winterFlowCompilerUtility.getClass();
                String name = winterFlowCompilerUtility.name();
                winterFlowProtocolManager.getClass();
                name.getClass();
                ?? r0 = winterFlowProtocolManager.WinterFlowHookDataSource;
                r0.getClass();
                if (r0.WinterFlowCacheManagerAgent == null) {
                    throw new IllegalArgumentException(("Cannot navigate to " + name + ". Navigation graph has not been set for NavController " + r0 + '.').toString());
                }
                ?? WinterFlowRouterRouter = r0.WinterFlowRouterRouter();
                WinterFlowLoaderValidator WinterFlowTransactionManagerStrategy3 = WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy(name, true, WinterFlowRouterRouter);
                if (WinterFlowTransactionManagerStrategy3 == null) {
                    throw new IllegalArgumentException("Navigation destination that matches route " + name + " cannot be found in the navigation graph " + r0.WinterFlowCacheManagerAgent);
                }
                WinterFlowServerLayer winterFlowServerLayer = WinterFlowTransactionManagerStrategy3.WinterFlowVariableVersionControl;
                Bundle WinterFlowRouterStructure4 = winterFlowServerLayer.WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy3.WinterFlowTransactionManagerStrategy);
                if (WinterFlowRouterStructure4 == null) {
                    WinterFlowRouterStructure4 = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                }
                int i10 = WinterFlowServerLayer.WinterFlowSyntax;
                String str4 = (String) winterFlowServerLayer.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl;
                Uri parse = Uri.parse(str4 != null ? "android-app://androidx.navigation/".concat(str4) : "");
                parse.getClass();
                Intent intent = new Intent();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                WinterFlowRouterStructure4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                r0.WinterFlowResponseEngine(winterFlowServerLayer, WinterFlowRouterStructure4, null);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 17:
                WinterFlowRendererRenderer winterFlowRendererRenderer = (WinterFlowRendererRenderer) this.WinterFlowTransactionManagerStrategy;
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj;
                winterFlowLibrarySessionManager.getClass();
                WinterFlowListenerProcess winterFlowListenerProcess = winterFlowLibrarySessionManager.WinterFlowServerProtocol;
                WinterFlowServerLayer winterFlowServerLayer2 = winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy;
                if (winterFlowServerLayer2 == null) {
                    winterFlowServerLayer2 = null;
                }
                if (winterFlowServerLayer2 == null) {
                    return null;
                }
                winterFlowListenerProcess.WinterFlowRouterStructure();
                WinterFlowServerLayer WinterFlowCacheManagerAgent2 = winterFlowRendererRenderer.WinterFlowCacheManagerAgent(winterFlowServerLayer2);
                if (WinterFlowCacheManagerAgent2 == null) {
                    return null;
                }
                return WinterFlowCacheManagerAgent2.equals(winterFlowServerLayer2) ? winterFlowLibrarySessionManager : winterFlowRendererRenderer.WinterFlowHookDataSource().WinterFlowHookDataSource(WinterFlowCacheManagerAgent2, WinterFlowCacheManagerAgent2.WinterFlowRouterStructure(winterFlowListenerProcess.WinterFlowRouterStructure()));
            case 18:
                WinterFlowXMLInterface winterFlowXMLInterface = (WinterFlowXMLInterface) obj;
                Object WinterFlowRouterStructure5 = ((WinterFlowObjectUI) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
                Float f15 = (Float) (Float.isNaN(((Number) WinterFlowRouterStructure5).floatValue()) ? null : WinterFlowRouterStructure5);
                WinterFlowRendererGateway winterFlowRendererGateway = new WinterFlowRendererGateway(f15 != null ? f15.floatValue() : 0.0f, new WinterFlowArrayStructure(0.0f, 1.0f));
                WinterFlowNodeSyntax[] winterFlowNodeSyntaxArr = WinterFlowManagerRefactoring.WinterFlowRouterStructure;
                WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowCacheManagerAgent;
                WinterFlowNodeSyntax winterFlowNodeSyntax = WinterFlowManagerRefactoring.WinterFlowRouterStructure[1];
                winterFlowXMLInterface.WinterFlowRouterStructure(winterFlowRendererOrchestration, winterFlowRendererGateway);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 19:
                ((WinterFlowTransactionBackend) this.WinterFlowTransactionManagerStrategy).WinterFlowConsumerUserManager(obj);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 20:
                WinterFlowBackendService winterFlowBackendService = (WinterFlowBackendService) this.WinterFlowTransactionManagerStrategy;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                synchronized (winterFlowBackendService.WinterFlowCacheManagerAgent) {
                    try {
                        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = winterFlowBackendService.WinterFlowArrayNetwork;
                        if (winterFlowConsumerBandwidth != null) {
                            WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowBackendService.WinterFlowRouterAdapter;
                            WinterFlowUserManagerSystem winterFlowUserManagerSystem = WinterFlowUserManagerSystem.WinterFlowTransactionManagerStrategy;
                            winterFlowHandlerPlatform.getClass();
                            winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, winterFlowUserManagerSystem);
                            winterFlowConsumerBandwidth.WinterFlowArrayNetwork(cancellationException);
                            winterFlowBackendService.WinterFlowSingletonPlatform = null;
                            winterFlowConsumerBandwidth.WinterFlowTransactionAgent(new WinterFlowRouterCompiler(27, winterFlowBackendService, th2));
                        } else {
                            winterFlowBackendService.WinterFlowVariableVersionControl = cancellationException;
                            WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = winterFlowBackendService.WinterFlowRouterAdapter;
                            WinterFlowUserManagerSystem winterFlowUserManagerSystem2 = WinterFlowUserManagerSystem.WinterFlowVariableVersionControl;
                            winterFlowHandlerPlatform2.getClass();
                            winterFlowHandlerPlatform2.WinterFlowTransactionAgent(null, winterFlowUserManagerSystem2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 21:
                WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = (WinterFlowConsumerServiceProvider) this.WinterFlowTransactionManagerStrategy;
                WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = (WinterFlowSchedulerSyntax) obj;
                winterFlowSchedulerSyntax.getClass();
                winterFlowConsumerServiceProvider.WinterFlowRouterRouter = winterFlowSchedulerSyntax;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 22:
                RunningActivity runningActivity = (RunningActivity) this.WinterFlowTransactionManagerStrategy;
                ((Boolean) obj).getClass();
                WinterFlowEventFramework winterFlowEventFramework = runningActivity.WinterFlowArrayHelper;
                if (winterFlowEventFramework == null) {
                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("builder");
                    throw null;
                }
                StaticIdProvider staticIdProvider = StaticIdProvider.INSTANCE;
                String provide = staticIdProvider.provide(ID.APP_SECURE_KEY);
                provide.getClass();
                winterFlowEventFramework.WinterFlowVariableVersionControl = provide;
                String provide2 = staticIdProvider.provide(ID.APP_ADJUST_SDK_INFO);
                provide2.getClass();
                winterFlowEventFramework.WinterFlowCacheManagerAgent = provide2;
                String provide3 = staticIdProvider.provide(ID.APP_CONNECTION_DATA);
                provide3.getClass();
                winterFlowEventFramework.WinterFlowArrayNetwork = provide3;
                WinterFlowDatabaseUtility winterFlowDatabaseUtility = winterFlowEventFramework.WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                winterFlowDatabaseUtility.getClass();
                WinterFlowConfigurationModule winterFlowConfigurationModule = winterFlowDatabaseUtility.WinterFlowRouterStructure;
                while (true) {
                    winterFlowOrchestrationBandwidth = (WinterFlowOrchestrationBandwidth) ((AtomicReference) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy).get();
                    int i11 = 2;
                    if (winterFlowOrchestrationBandwidth == null) {
                        WinterFlowScriptSubsystem WinterFlowHookDataSource2 = WinterFlowFrameworkMechanism.WinterFlowHookDataSource();
                        WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
                        winterFlowOrchestrationBandwidth = new WinterFlowOrchestrationBandwidth(winterFlowDatabaseUtility, WinterFlowTestingCloud.WinterFlowArrayHelper(WinterFlowHookDataSource2, WinterFlowEventEmitterRepository.WinterFlowRouterStructure.WinterFlowResponseEngine));
                        AtomicReference atomicReference = (AtomicReference) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy;
                        while (!atomicReference.compareAndSet(null, winterFlowOrchestrationBandwidth)) {
                            if (atomicReference.get() != null) {
                                break;
                            }
                        }
                        WinterFlowCacheDecorator winterFlowCacheDecorator2 = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
                        WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowOrchestrationBandwidth, WinterFlowEventEmitterRepository.WinterFlowRouterStructure.WinterFlowResponseEngine, new WinterFlowEventDecorator(winterFlowOrchestrationBandwidth, winterFlowTransactionManagerLayer, i11), 2);
                    }
                }
                WinterFlowCacheDecorator winterFlowCacheDecorator3 = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
                WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowOrchestrationBandwidth, WinterFlowInheritanceFramework.WinterFlowUnitTestResponse, new WinterFlowGatewayWorker(winterFlowEventFramework, winterFlowTransactionManagerLayer, 10), 2);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 23:
                WinterFlowEventFramework winterFlowEventFramework2 = (WinterFlowEventFramework) this.WinterFlowTransactionManagerStrategy;
                String str5 = (String) obj;
                int i12 = 16;
                if (str5 == null || WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str5)) {
                    WinterFlowRequestHandler winterFlowRequestHandler = winterFlowEventFramework2.WinterFlowHookDataSource;
                    winterFlowRequestHandler.getClass();
                    WinterFlowCacheRuntime.WinterFlowStrategyTool(WinterFlowHandlerWebsocket.WinterFlowConsumerUserManager(winterFlowRequestHandler), null, new WinterFlowModuleStack("", winterFlowRequestHandler, winterFlowTransactionManagerLayer, i12), 3);
                } else {
                    WinterFlowRequestHandler winterFlowRequestHandler2 = winterFlowEventFramework2.WinterFlowHookDataSource;
                    winterFlowRequestHandler2.getClass();
                    WinterFlowCacheRuntime.WinterFlowStrategyTool(WinterFlowHandlerWebsocket.WinterFlowConsumerUserManager(winterFlowRequestHandler2), null, new WinterFlowModuleStack(str5, winterFlowRequestHandler2, winterFlowTransactionManagerLayer, i12), 3);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 24:
                WinterFlowEncryptionComponent winterFlowEncryptionComponent2 = ((WinterFlowDecoratorPlatform) this.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse;
                return Boolean.valueOf(winterFlowEncryptionComponent2 != null ? winterFlowEncryptionComponent2.WinterFlowCacheManagerAgent(obj) : true);
            case 25:
                WinterFlowStackQuery winterFlowStackQuery = (WinterFlowStackQuery) this.WinterFlowTransactionManagerStrategy;
                float floatValue = ((Float) obj).floatValue();
                WinterFlowVersionControlModule winterFlowVersionControlModule = winterFlowStackQuery.WinterFlowRouterStructure;
                float WinterFlowRouterRouter2 = winterFlowVersionControlModule.WinterFlowRouterRouter() + floatValue + winterFlowStackQuery.WinterFlowTransactionManagerStrategy;
                float WinterFlowRouterRouter3 = WinterFlowDecoratorUI.WinterFlowRouterRouter(WinterFlowRouterRouter2, 0.0f, winterFlowStackQuery.WinterFlowVariableVersionControl.WinterFlowRouterRouter());
                boolean z4 = WinterFlowRouterRouter2 == WinterFlowRouterRouter3;
                float WinterFlowRouterRouter4 = WinterFlowRouterRouter3 - winterFlowVersionControlModule.WinterFlowRouterRouter();
                int round2 = Math.round(WinterFlowRouterRouter4);
                winterFlowVersionControlModule.WinterFlowSyntax(winterFlowVersionControlModule.WinterFlowRouterRouter() + round2);
                winterFlowStackQuery.WinterFlowTransactionManagerStrategy = WinterFlowRouterRouter4 - round2;
                if (!z4) {
                    floatValue = WinterFlowRouterRouter4;
                }
                return Float.valueOf(floatValue);
            case 26:
                WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) this.WinterFlowTransactionManagerStrategy;
                return new WinterFlowHandlerResolver(winterFlowTransactionManagerService.WinterFlowCacheManagerAgent(winterFlowTransactionManagerService.WinterFlowTransactionAgent, ((WinterFlowHandlerResolver) obj).WinterFlowRouterStructure, winterFlowTransactionManagerService.WinterFlowResponseEngine));
            case 27:
                WinterFlowDeploymentEngine winterFlowDeploymentEngine = (WinterFlowDeploymentEngine) this.WinterFlowTransactionManagerStrategy;
                obj.getClass();
                return winterFlowDeploymentEngine.WinterFlowRouterStructure();
            case 28:
                WinterFlowMapperBackend winterFlowMapperBackend = (WinterFlowMapperBackend) this.WinterFlowTransactionManagerStrategy;
                WinterFlowInvokerPlatform winterFlowInvokerPlatform = winterFlowMapperBackend.WinterFlowTransactionManagerStrategy;
                winterFlowInvokerPlatform.getClass();
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowMapperBackend.WinterFlowTransactionManagerStrategy, winterFlowInvokerPlatform)) {
                    WinterFlowResponseCloud.WinterFlowHookDataSource("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = winterFlowMapperBackend.WinterFlowVariableVersionControl;
                Object obj4 = winterFlowMapperBackend.WinterFlowCacheManagerAgent;
                if (winterFlowCacheManagerTransactionManager != null) {
                    if (obj4 != null) {
                        WinterFlowResponseCloud.WinterFlowHookDataSource("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure(obj);
                } else if (obj4 == null) {
                    winterFlowMapperBackend.WinterFlowCacheManagerAgent = obj;
                } else {
                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = new WinterFlowCacheManagerTransactionManager();
                    winterFlowCacheManagerTransactionManager3.WinterFlowRouterStructure(obj4);
                    winterFlowCacheManagerTransactionManager3.WinterFlowRouterStructure(obj);
                    winterFlowMapperBackend.WinterFlowVariableVersionControl = winterFlowCacheManagerTransactionManager3;
                    winterFlowMapperBackend.WinterFlowCacheManagerAgent = null;
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                WinterFlowClassStrategy winterFlowClassStrategy = (WinterFlowClassStrategy) this.WinterFlowTransactionManagerStrategy;
                synchronized (winterFlowClassStrategy.WinterFlowUnitTestResponse) {
                    WinterFlowServiceInvoker winterFlowServiceInvoker = winterFlowClassStrategy.WinterFlowSyntax;
                    winterFlowServiceInvoker.getClass();
                    Object obj5 = winterFlowServiceInvoker.WinterFlowHookDataSource;
                    obj5.getClass();
                    int i13 = winterFlowServiceInvoker.WinterFlowArrayNetwork;
                    WinterFlowLibraryCache winterFlowLibraryCache = winterFlowServiceInvoker.WinterFlowCacheManagerAgent;
                    if (winterFlowLibraryCache == null) {
                        winterFlowLibraryCache = new WinterFlowLibraryCache();
                        winterFlowServiceInvoker.WinterFlowCacheManagerAgent = winterFlowLibraryCache;
                        winterFlowServiceInvoker.WinterFlowTransactionManagerStrategy.WinterFlowThreadListener(obj5, winterFlowLibraryCache);
                    }
                    winterFlowServiceInvoker.WinterFlowHookDataSource(obj, i13, obj5, winterFlowLibraryCache);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }

    public /* synthetic */ WinterFlowCompilerCloud(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }
}
