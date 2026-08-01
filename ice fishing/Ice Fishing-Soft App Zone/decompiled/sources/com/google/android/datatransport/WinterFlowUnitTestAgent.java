package com.google.android.datatransport;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestAgent implements WinterFlowEventEvent {
    public final /* synthetic */ float WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEventTool WinterFlowSyntax;
    public final /* synthetic */ WinterFlowVersionControlUtility WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ long WinterFlowUnitTestResponse;
    public final /* synthetic */ WinterFlowMapperManager WinterFlowVariableVersionControl;

    public WinterFlowUnitTestAgent(WinterFlowMapperManager winterFlowMapperManager, WinterFlowVersionControlUtility winterFlowVersionControlUtility, long j, float f, WinterFlowEventTool winterFlowEventTool) {
        this.WinterFlowVariableVersionControl = winterFlowMapperManager;
        this.WinterFlowTransactionManagerStrategy = winterFlowVersionControlUtility;
        this.WinterFlowUnitTestResponse = j;
        this.WinterFlowRouterRouter = f;
        this.WinterFlowSyntax = winterFlowEventTool;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    @Override // com.google.android.datatransport.WinterFlowEventEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        boolean z;
        int i;
        WinterFlowVersionControlUtility winterFlowVersionControlUtility;
        WinterFlowValidatorComponent winterFlowValidatorComponent;
        WinterFlowMapperManager winterFlowMapperManager;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
        int intValue = ((Number) obj2).intValue();
        boolean WinterFlowFrontendBackend = winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2);
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        if (!WinterFlowFrontendBackend) {
            winterFlowResolverLibrary.WinterFlowQueueService();
            return winterFlowAlgorithmSession;
        }
        WinterFlowServiceView winterFlowServiceView = (WinterFlowServiceView) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowSessionManagerFrontend.WinterFlowRouterStructure);
        boolean booleanValue = ((Boolean) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowSessionManagerFrontend.WinterFlowHookDataSource)).booleanValue();
        long j = winterFlowServiceView.WinterFlowOrchestrationSubsystem;
        int i12 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        long j2 = this.WinterFlowUnitTestResponse;
        if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j2, j) && booleanValue) {
            if (!WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowRouterRouter, 0.0f)) {
                long WinterFlowRouterStructure = WinterFlowInheritanceSubsystem.WinterFlowRouterStructure(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(winterFlowServiceView.WinterFlowBatchUI, ((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f), WinterFlowInheritanceSubsystem.WinterFlowVariableVersionControl(j));
                float WinterFlowCacheManagerAgent = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent(j);
                float WinterFlowCacheManagerAgent2 = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent(WinterFlowRouterStructure);
                float f = 1.0f - WinterFlowCacheManagerAgent2;
                float f2 = (WinterFlowCacheManagerAgent * f) + WinterFlowCacheManagerAgent2;
                float WinterFlowUnitTestResponse = f2 == 0.0f ? 0.0f : (((WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse(j) * WinterFlowCacheManagerAgent) * f) + (WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse(WinterFlowRouterStructure) * WinterFlowCacheManagerAgent2)) / f2;
                float WinterFlowTransactionManagerStrategy = f2 == 0.0f ? 0.0f : (((WinterFlowInheritanceSubsystem.WinterFlowTransactionManagerStrategy(j) * WinterFlowCacheManagerAgent) * f) + (WinterFlowInheritanceSubsystem.WinterFlowTransactionManagerStrategy(WinterFlowRouterStructure) * WinterFlowCacheManagerAgent2)) / f2;
                float WinterFlowArrayNetwork = f2 == 0.0f ? 0.0f : (((WinterFlowInheritanceSubsystem.WinterFlowArrayNetwork(j) * WinterFlowCacheManagerAgent) * f) + (WinterFlowInheritanceSubsystem.WinterFlowArrayNetwork(WinterFlowRouterStructure) * WinterFlowCacheManagerAgent2)) / f2;
                if (WinterFlowInheritanceSubsystem.WinterFlowVariableVersionControl(j).WinterFlowCacheManagerAgent()) {
                    j = (((int) ((WinterFlowArrayNetwork * 255.0f) + 0.5f)) | (((((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((WinterFlowUnitTestResponse * 255.0f) + 0.5f)) << 16)) | (((int) ((WinterFlowTransactionManagerStrategy * 255.0f) + 0.5f)) << 8))) << 32;
                } else {
                    int floatToRawIntBits = Float.floatToRawIntBits(WinterFlowUnitTestResponse);
                    int i13 = floatToRawIntBits >>> 31;
                    int i14 = (floatToRawIntBits >>> 23) & 255;
                    int i15 = floatToRawIntBits & 8388607;
                    int i16 = 49;
                    z = true;
                    if (i14 == 255) {
                        i3 = i15 != 0 ? 512 : 0;
                        i2 = 31;
                    } else {
                        i2 = i14 - 112;
                        if (i2 >= 31) {
                            i3 = 0;
                            i2 = 49;
                        } else if (i2 > 0) {
                            int i17 = i15 >> 13;
                            if ((floatToRawIntBits & 4096) != 0) {
                                i4 = (((i2 << 10) | i17) + 1) | (i13 << 15);
                                short s = (short) i4;
                                int floatToRawIntBits2 = Float.floatToRawIntBits(WinterFlowTransactionManagerStrategy);
                                int i18 = floatToRawIntBits2 >>> 31;
                                i = 6;
                                i5 = (floatToRawIntBits2 >>> 23) & 255;
                                int i19 = floatToRawIntBits2 & 8388607;
                                if (i5 != 255) {
                                    i7 = i19 != 0 ? 512 : 0;
                                    i6 = 31;
                                } else {
                                    i6 = i5 - 112;
                                    if (i6 >= 31) {
                                        i7 = 0;
                                        i6 = 49;
                                    } else if (i6 > 0) {
                                        int i20 = i19 >> 13;
                                        if ((floatToRawIntBits2 & 4096) != 0) {
                                            i8 = (((i6 << 10) | i20) + 1) | (i18 << 15);
                                            short s2 = (short) i8;
                                            int floatToRawIntBits3 = Float.floatToRawIntBits(WinterFlowArrayNetwork);
                                            int i21 = floatToRawIntBits3 >>> 31;
                                            i9 = (floatToRawIntBits3 >>> 23) & 255;
                                            int i22 = floatToRawIntBits3 & 8388607;
                                            if (i9 == 255) {
                                                i10 = i22 == 0 ? 0 : 512;
                                                i16 = 31;
                                            } else {
                                                int i23 = i9 - 112;
                                                if (i23 >= 31) {
                                                    i10 = 0;
                                                } else if (i23 > 0) {
                                                    i10 = i22 >> 13;
                                                    if ((floatToRawIntBits3 & 4096) != 0) {
                                                        i11 = (((i23 << 10) | i10) + 1) | (i21 << 15);
                                                        j = ((((short) i11) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r2.WinterFlowCacheManagerAgent & 63);
                                                        j2 = j;
                                                    } else {
                                                        i16 = i23;
                                                    }
                                                } else if (i23 >= -10) {
                                                    int i24 = (i22 | 8388608) >> (1 - i23);
                                                    if ((i24 & 4096) != 0) {
                                                        i24 += 8192;
                                                    }
                                                    i10 = i24 >> 13;
                                                    i16 = 0;
                                                } else {
                                                    i16 = 0;
                                                    i10 = 0;
                                                }
                                            }
                                            i11 = (i21 << 15) | (i16 << 10) | i10;
                                            j = ((((short) i11) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r2.WinterFlowCacheManagerAgent & 63);
                                            j2 = j;
                                        } else {
                                            i7 = i20;
                                        }
                                    } else if (i6 >= -10) {
                                        int i25 = (i19 | 8388608) >> (1 - i6);
                                        if ((i25 & 4096) != 0) {
                                            i25 += 8192;
                                        }
                                        i7 = i25 >> 13;
                                        i6 = 0;
                                    } else {
                                        i7 = 0;
                                        i6 = 0;
                                    }
                                }
                                i8 = i7 | (i6 << 10) | (i18 << 15);
                                short s22 = (short) i8;
                                int floatToRawIntBits32 = Float.floatToRawIntBits(WinterFlowArrayNetwork);
                                int i212 = floatToRawIntBits32 >>> 31;
                                i9 = (floatToRawIntBits32 >>> 23) & 255;
                                int i222 = floatToRawIntBits32 & 8388607;
                                if (i9 == 255) {
                                }
                                i11 = (i212 << 15) | (i16 << 10) | i10;
                                j = ((((short) i11) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r2.WinterFlowCacheManagerAgent & 63);
                                j2 = j;
                            } else {
                                i3 = i17;
                            }
                        } else if (i2 >= -10) {
                            int i26 = (i15 | 8388608) >> (1 - i2);
                            if ((i26 & 4096) != 0) {
                                i26 += 8192;
                            }
                            i3 = i26 >> 13;
                            i2 = 0;
                        } else {
                            i3 = 0;
                            i2 = 0;
                        }
                    }
                    i4 = i3 | (i2 << 10) | (i13 << 15);
                    short s3 = (short) i4;
                    int floatToRawIntBits22 = Float.floatToRawIntBits(WinterFlowTransactionManagerStrategy);
                    int i182 = floatToRawIntBits22 >>> 31;
                    i = 6;
                    i5 = (floatToRawIntBits22 >>> 23) & 255;
                    int i192 = floatToRawIntBits22 & 8388607;
                    if (i5 != 255) {
                    }
                    i8 = i7 | (i6 << 10) | (i182 << 15);
                    short s222 = (short) i8;
                    int floatToRawIntBits322 = Float.floatToRawIntBits(WinterFlowArrayNetwork);
                    int i2122 = floatToRawIntBits322 >>> 31;
                    i9 = (floatToRawIntBits322 >>> 23) & 255;
                    int i2222 = floatToRawIntBits322 & 8388607;
                    if (i9 == 255) {
                    }
                    i11 = (i2122 << 15) | (i16 << 10) | i10;
                    j = ((((short) i11) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r2.WinterFlowCacheManagerAgent & 63);
                    j2 = j;
                }
            }
            z = true;
            i = 6;
            j2 = j;
        } else {
            z = true;
            i = 6;
        }
        float WinterFlowSingletonPlatform = ((WinterFlowConcurrencyParser) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter)).WinterFlowSingletonPlatform(0.0f);
        WinterFlowValidatorComponent winterFlowValidatorComponent2 = WinterFlowValidatorComponent.WinterFlowRouterStructure;
        WinterFlowVersionControlUtility winterFlowVersionControlUtility2 = this.WinterFlowTransactionManagerStrategy;
        if (WinterFlowSingletonPlatform > 0.0f) {
            long j3 = WinterFlowServiceProviderSubsystem.WinterFlowHookDataSource;
            long j4 = WinterFlowIDEListener.WinterFlowRouterStructure;
            winterFlowMapperManager = WinterFlowUnitTestLibrary.WinterFlowBackendCacheManager(winterFlowValidatorComponent2, 1.0f, 1.0f, 1.0f, WinterFlowSingletonPlatform, j3, winterFlowVersionControlUtility2, false, j4, j4);
            winterFlowValidatorComponent = winterFlowValidatorComponent2;
            winterFlowVersionControlUtility = winterFlowVersionControlUtility2;
        } else {
            winterFlowVersionControlUtility = winterFlowVersionControlUtility2;
            winterFlowValidatorComponent = winterFlowValidatorComponent2;
            winterFlowMapperManager = winterFlowValidatorComponent;
        }
        WinterFlowMapperManager WinterFlowSingletonPlatform2 = WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(winterFlowMapperManager).WinterFlowCacheManagerAgent(winterFlowValidatorComponent), j2, winterFlowVersionControlUtility), winterFlowVersionControlUtility);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
        if (WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
            WinterFlowSyntaxSubsystem = new WinterFlowSessionManagerAgent(22);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
        WinterFlowMapperManager WinterFlowRouterStructure2 = WinterFlowWebsocketDeployment.WinterFlowRouterStructure(WinterFlowSingletonPlatform2, false, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem);
        Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
            WinterFlowSyntaxSubsystem2 = WinterFlowProxyResponse.WinterFlowRouterStructure;
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
        }
        WinterFlowCacheManagerUtility winterFlowCacheManagerUtility = WinterFlowIDESoftware.WinterFlowRouterStructure;
        WinterFlowMapperManager WinterFlowCacheManagerAgent3 = WinterFlowRouterStructure2.WinterFlowCacheManagerAgent(new WinterFlowResolverWorker(winterFlowAlgorithmSession, null, (PointerInputEventHandler) WinterFlowSyntaxSubsystem2, i));
        WinterFlowWorkerModule WinterFlowCacheManagerAgent4 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowUnitTestResponse, z);
        int WinterFlowResolverController = WinterFlowCloudStack.WinterFlowResolverController(winterFlowResolverLibrary);
        WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
        WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowCacheManagerAgent3);
        WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
        WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
        winterFlowResolverLibrary.WinterFlowModuleAgent();
        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
            winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
        } else {
            winterFlowResolverLibrary.WinterFlowParserPipeline();
        }
        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, WinterFlowCacheManagerAgent4);
        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent);
        WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
        if (winterFlowResolverLibrary.WinterFlowProxyStructure || !WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowResolverLibrary.WinterFlowSyntaxSubsystem(), Integer.valueOf(WinterFlowResolverController))) {
            winterFlowResolverLibrary.WinterFlowArrayFramework(Integer.valueOf(WinterFlowResolverController));
            winterFlowResolverLibrary.WinterFlowHookDataSource(winterFlowExceptionBackend, Integer.valueOf(WinterFlowResolverController));
        }
        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
        this.WinterFlowSyntax.WinterFlowVariableVersionControl(winterFlowResolverLibrary, 0);
        winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
        return winterFlowAlgorithmSession;
    }
}
