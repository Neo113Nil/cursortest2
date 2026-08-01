package com.google.android.datatransport;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderBatch extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public static final WinterFlowServiceProviderBatch WinterFlowArrayHelper;
    public static final WinterFlowServiceProviderBatch WinterFlowBackendCacheManager;
    public static final WinterFlowServiceProviderBatch WinterFlowBandwidthObject;
    public static final WinterFlowServiceProviderBatch WinterFlowBatchUI;
    public static final WinterFlowServiceProviderBatch WinterFlowCacheManagerListener;
    public static final WinterFlowServiceProviderBatch WinterFlowCompilerVariable;
    public static final WinterFlowServiceProviderBatch WinterFlowConcurrencyThread;
    public static final WinterFlowServiceProviderBatch WinterFlowConfigurationSubsystem;
    public static final WinterFlowServiceProviderBatch WinterFlowConsumerUserManager;
    public static final WinterFlowServiceProviderBatch WinterFlowEventEmitterController;
    public static final WinterFlowServiceProviderBatch WinterFlowMapperProtocol;
    public static final WinterFlowServiceProviderBatch WinterFlowOrchestrationSubsystem;
    public static final WinterFlowServiceProviderBatch WinterFlowPackageIDE;
    public static final WinterFlowServiceProviderBatch WinterFlowResolverController;
    public static final WinterFlowServiceProviderBatch WinterFlowResponseEngine;
    public static final WinterFlowServiceProviderBatch WinterFlowRouterAdapter;
    public static final WinterFlowServiceProviderBatch WinterFlowRouterRouter;
    public static final WinterFlowServiceProviderBatch WinterFlowSerializerStructure;
    public static final WinterFlowServiceProviderBatch WinterFlowServerProtocol;
    public static final WinterFlowServiceProviderBatch WinterFlowServiceUtility;
    public static final WinterFlowServiceProviderBatch WinterFlowSingletonPlatform;
    public static final WinterFlowServiceProviderBatch WinterFlowSoftwareEngine;
    public static final WinterFlowServiceProviderBatch WinterFlowSoftwareProtocol;
    public static final WinterFlowServiceProviderBatch WinterFlowStrategyTool;
    public static final WinterFlowServiceProviderBatch WinterFlowSyntax;
    public static final WinterFlowServiceProviderBatch WinterFlowThreadListener;
    public static final WinterFlowServiceProviderBatch WinterFlowTransactionAgent;
    public static final WinterFlowServiceProviderBatch WinterFlowUnitTestResponse;
    public static final WinterFlowServiceProviderBatch WinterFlowUserManagerUserManager;
    public static final WinterFlowServiceProviderBatch WinterFlowVariableBandwidth;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;

    static {
        int i = 1;
        WinterFlowUnitTestResponse = new WinterFlowServiceProviderBatch(i, 0);
        WinterFlowRouterRouter = new WinterFlowServiceProviderBatch(i, 1);
        WinterFlowSyntax = new WinterFlowServiceProviderBatch(i, 2);
        WinterFlowResponseEngine = new WinterFlowServiceProviderBatch(i, 3);
        WinterFlowTransactionAgent = new WinterFlowServiceProviderBatch(i, 4);
        WinterFlowServerProtocol = new WinterFlowServiceProviderBatch(i, 5);
        WinterFlowThreadListener = new WinterFlowServiceProviderBatch(i, 6);
        WinterFlowServiceUtility = new WinterFlowServiceProviderBatch(i, 7);
        WinterFlowBandwidthObject = new WinterFlowServiceProviderBatch(i, 8);
        WinterFlowOrchestrationSubsystem = new WinterFlowServiceProviderBatch(i, 9);
        WinterFlowConcurrencyThread = new WinterFlowServiceProviderBatch(i, 10);
        WinterFlowSingletonPlatform = new WinterFlowServiceProviderBatch(i, 11);
        WinterFlowVariableBandwidth = new WinterFlowServiceProviderBatch(i, 12);
        WinterFlowBatchUI = new WinterFlowServiceProviderBatch(i, 13);
        WinterFlowRouterAdapter = new WinterFlowServiceProviderBatch(i, 14);
        WinterFlowSerializerStructure = new WinterFlowServiceProviderBatch(i, 15);
        WinterFlowMapperProtocol = new WinterFlowServiceProviderBatch(i, 16);
        WinterFlowResolverController = new WinterFlowServiceProviderBatch(i, 17);
        WinterFlowConsumerUserManager = new WinterFlowServiceProviderBatch(i, 18);
        WinterFlowBackendCacheManager = new WinterFlowServiceProviderBatch(i, 19);
        WinterFlowEventEmitterController = new WinterFlowServiceProviderBatch(i, 20);
        WinterFlowArrayHelper = new WinterFlowServiceProviderBatch(i, 21);
        WinterFlowCompilerVariable = new WinterFlowServiceProviderBatch(i, 22);
        WinterFlowConfigurationSubsystem = new WinterFlowServiceProviderBatch(i, 23);
        WinterFlowStrategyTool = new WinterFlowServiceProviderBatch(i, 24);
        WinterFlowCacheManagerListener = new WinterFlowServiceProviderBatch(i, 25);
        WinterFlowPackageIDE = new WinterFlowServiceProviderBatch(i, 26);
        WinterFlowSoftwareProtocol = new WinterFlowServiceProviderBatch(i, 27);
        WinterFlowUserManagerUserManager = new WinterFlowServiceProviderBatch(i, 28);
        WinterFlowSoftwareEngine = new WinterFlowServiceProviderBatch(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowServiceProviderBatch(int i, int i2) {
        super(i);
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        String valueOf;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((WinterFlowProcessorSystem) obj).WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowEventEmitterController));
            case 2:
                WinterFlowConfigurationProcess winterFlowConfigurationProcess = (WinterFlowConfigurationProcess) obj;
                WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowUnitTestProvider.WinterFlowRouterStructure;
                winterFlowConfigurationProcess.getClass();
                WinterFlowQuerySyntax.WinterFlowConfigurationSubsystem(winterFlowConfigurationProcess, winterFlowPipelineHelper);
                return ((Context) WinterFlowQuerySyntax.WinterFlowConfigurationSubsystem(winterFlowConfigurationProcess, WinterFlowUnitTestProvider.WinterFlowHookDataSource)).getResources();
            case 3:
                return Boolean.valueOf(((WinterFlowProcessorSystem) obj).WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowEventEmitterController));
            case 4:
                WinterFlowNodeSyntax[] winterFlowNodeSyntaxArr = WinterFlowManagerRefactoring.WinterFlowRouterStructure;
                ((WinterFlowXMLInterface) obj).WinterFlowRouterStructure(WinterFlowRendererJava.WinterFlowResolverController, winterFlowAlgorithmSession);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowRouterLayer winterFlowRouterLayer = (WinterFlowRouterLayer) obj;
                winterFlowRouterLayer.getHandler().post(new WinterFlowUserManagerFramework(3, winterFlowRouterLayer.WinterFlowSerializerStructure));
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return winterFlowAlgorithmSession;
            case 9:
                ((Number) obj).longValue();
                return winterFlowAlgorithmSession;
            case 10:
                WinterFlowBandwidthAgent winterFlowBandwidthAgent = (WinterFlowBandwidthAgent) obj;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowBandwidthAgent instanceof WinterFlowSchedulerStructure ? (WinterFlowSchedulerStructure) winterFlowBandwidthAgent : null;
                if (winterFlowSchedulerStructure != null && winterFlowSchedulerStructure.WinterFlowConfiguration) {
                    WinterFlowViewUtility.WinterFlowHookDataSource("Apply is called on deactivated node " + winterFlowBandwidthAgent);
                }
                return winterFlowAlgorithmSession;
            case 11:
                return Boolean.TRUE;
            case 12:
                return Boolean.valueOf(WinterFlowTestingCloud.WinterFlowUnitTestResponse(obj));
            case 13:
                long j = ((WinterFlowServiceProviderSubsystem) obj).WinterFlowRouterStructure;
                return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
            case 14:
                float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                return new WinterFlowServiceProviderSubsystem((Float.floatToRawIntBits(r0.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 15:
                return WinterFlowUnitTestLibrary.WinterFlowQueueService(7, null);
            case 16:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new WinterFlowDebugStrategy(absolutePath);
            case 17:
                return winterFlowAlgorithmSession;
            case 18:
                return winterFlowAlgorithmSession;
            case 19:
                return winterFlowAlgorithmSession;
            case 20:
                WinterFlowParserUserManager.WinterFlowFrameworkTransaction((WinterFlowParserUserManager) obj, WinterFlowInheritanceSubsystem.WinterFlowSyntax, 0L, 0L, 126);
                return winterFlowAlgorithmSession;
            case 21:
                WinterFlowCacheManagerInvoker winterFlowCacheManagerInvoker = (WinterFlowCacheManagerInvoker) obj;
                if (winterFlowCacheManagerInvoker.WinterFlowBatchUI()) {
                    WinterFlowRequestUtility winterFlowRequestUtility = winterFlowCacheManagerInvoker.WinterFlowTransactionManagerStrategy;
                    if (!winterFlowRequestUtility.WinterFlowBandwidthObject) {
                        WinterFlowObjectSession WinterFlowArrayNetwork = winterFlowCacheManagerInvoker.WinterFlowVariableVersionControl.WinterFlowArrayNetwork();
                        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowRequestUtility.WinterFlowSingletonPlatform;
                        if (WinterFlowArrayNetwork != null) {
                            winterFlowRequestUtility.WinterFlowCacheManagerException(winterFlowCacheManagerInvoker, 9223372034707292159L, 0L);
                            winterFlowRequestUtility.WinterFlowTransactionAgent = WinterFlowArrayNetwork;
                        } else if (winterFlowDatabaseSchemaStructure != null) {
                            Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
                            long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j2) < 128) {
                                                winterFlowRequestUtility.WinterFlowClassConsumer((WinterFlowCacheManagerTransactionManager) objArr[(i2 << 3) + i4]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 != 8) {
                                        }
                                    }
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                            winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure();
                        }
                    }
                }
                return winterFlowAlgorithmSession;
            case 22:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i5 = 0;
                    for (byte b : (byte[]) value) {
                        i5++;
                        if (i5 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return "  " + ((WinterFlowNetworkFramework) entry.getKey()).WinterFlowRouterStructure + " = " + valueOf;
            case 23:
                WinterFlowMicroserviceProxy winterFlowMicroserviceProxy = ((WinterFlowUIMicroservice) obj).WinterFlowUIMiddleware;
                if (winterFlowMicroserviceProxy != null) {
                    ((WinterFlowCompilerSyntax) winterFlowMicroserviceProxy).WinterFlowCacheManagerAgent();
                }
                return winterFlowAlgorithmSession;
            case 24:
                WinterFlowUIMicroservice winterFlowUIMicroservice = (WinterFlowUIMicroservice) obj;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowUIMicroservice.WinterFlowVariableBandwidth;
                try {
                    if (winterFlowUIMicroservice.WinterFlowBatchUI()) {
                        winterFlowUIMicroservice.WinterFlowSchedulerListener(true);
                    }
                    return winterFlowAlgorithmSession;
                } catch (Throwable th) {
                    winterFlowSchedulerStructure2.WinterFlowFrameworkTransaction(th);
                    throw null;
                }
            case 25:
                WinterFlowHandlerTransactionManager winterFlowHandlerTransactionManager = (WinterFlowHandlerTransactionManager) obj;
                if (winterFlowHandlerTransactionManager.WinterFlowBatchUI()) {
                    winterFlowHandlerTransactionManager.WinterFlowVariableVersionControl.WinterFlowEventEmitterController();
                }
                return winterFlowAlgorithmSession;
            case 26:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure3 = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure3.WinterFlowCacheManagerListener()) {
                    winterFlowSchedulerStructure3.WinterFlowProxyStructure(false);
                }
                return winterFlowAlgorithmSession;
            case 27:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure4 = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure4.WinterFlowCacheManagerListener()) {
                    winterFlowSchedulerStructure4.WinterFlowProxyStructure(false);
                }
                return winterFlowAlgorithmSession;
            case 28:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure5 = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure5.WinterFlowCacheManagerListener()) {
                    winterFlowSchedulerStructure5.WinterFlowQueueService(false);
                }
                return winterFlowAlgorithmSession;
            default:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure6 = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure6.WinterFlowCacheManagerListener()) {
                    winterFlowSchedulerStructure6.WinterFlowQueueService(false);
                }
                return winterFlowAlgorithmSession;
        }
    }
}
