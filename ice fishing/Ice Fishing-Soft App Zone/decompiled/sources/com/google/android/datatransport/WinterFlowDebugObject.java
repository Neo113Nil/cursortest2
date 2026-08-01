package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugObject extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public WinterFlowBandwidthCache WinterFlowResponseEngine;
    public int WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowConcurrencyThread WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax = 0;
    public /* synthetic */ Object WinterFlowThreadListener;
    public WinterFlowBandwidthCache WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDebugObject(WinterFlowBandwidthCache winterFlowBandwidthCache, WinterFlowConcurrencyThread winterFlowConcurrencyThread, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowBandwidthCache;
        this.WinterFlowServiceUtility = winterFlowConcurrencyThread;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowConcurrencyThread winterFlowConcurrencyThread = this.WinterFlowServiceUtility;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDebugObject winterFlowDebugObject = new WinterFlowDebugObject(this.WinterFlowTransactionAgent, winterFlowConcurrencyThread, winterFlowTransactionManagerLayer);
                winterFlowDebugObject.WinterFlowThreadListener = obj;
                return winterFlowDebugObject;
            default:
                WinterFlowDebugObject winterFlowDebugObject2 = new WinterFlowDebugObject(winterFlowConcurrencyThread, winterFlowTransactionManagerLayer);
                winterFlowDebugObject2.WinterFlowThreadListener = obj;
                return winterFlowDebugObject2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)|(0)|27|28|29|(2:35|(2:37|(0)))(2:31|(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:29:0x00c1, B:31:0x00c7, B:35:0x00d9, B:37:0x00dd), top: B:28:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:29:0x00c1, B:31:0x00c7, B:35:0x00d9, B:37:0x00dd), top: B:28:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:9:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0142 -> B:62:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0146 -> B:63:0x0148). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowObjectSession winterFlowObjectSession;
        Object obj2;
        WinterFlowAdapterResponse winterFlowAdapterResponse;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        WinterFlowBandwidthCache winterFlowBandwidthCache2;
        WinterFlowBandwidthCache winterFlowBandwidthCache3;
        WinterFlowAdapterResponse winterFlowAdapterResponse2;
        WinterFlowAdapterResponse winterFlowAdapterResponse3;
        Object obj3;
        Object WinterFlowTransactionManagerStrategy;
        WinterFlowFrontendPlatform winterFlowFrontendPlatform;
        Object obj4;
        int i = this.WinterFlowSyntax;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowConcurrencyThread winterFlowConcurrencyThread = this.WinterFlowServiceUtility;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowBandwidthCache winterFlowBandwidthCache4 = this.WinterFlowTransactionAgent;
                int i2 = this.WinterFlowServerProtocol;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowObjectSession = (WinterFlowObjectSession) this.WinterFlowThreadListener;
                    obj2 = winterFlowBandwidthCache4.WinterFlowVariableVersionControl;
                    if (obj2 instanceof WinterFlowResponsePackage) {
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowBandwidthCache winterFlowBandwidthCache5 = this.WinterFlowResponseEngine;
                    winterFlowObjectSession = (WinterFlowObjectSession) this.WinterFlowThreadListener;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowFrontendPlatform winterFlowFrontendPlatform2 = (WinterFlowFrontendPlatform) obj;
                    winterFlowBandwidthCache5.WinterFlowVariableVersionControl = winterFlowFrontendPlatform2;
                    obj2 = winterFlowBandwidthCache4.WinterFlowVariableVersionControl;
                    if (!(obj2 instanceof WinterFlowResponsePackage) || (obj2 instanceof WinterFlowParserSubsystem)) {
                        break;
                    } else {
                        WinterFlowListenerTransaction winterFlowListenerTransaction = obj2 instanceof WinterFlowListenerTransaction ? (WinterFlowListenerTransaction) obj2 : null;
                        if (winterFlowListenerTransaction != null) {
                            winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowListenerTransaction);
                        }
                        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = winterFlowConcurrencyThread.WinterFlowBackendCacheManager;
                        if (winterFlowWorkerThreadPool != null) {
                            this.WinterFlowThreadListener = winterFlowObjectSession;
                            this.WinterFlowResponseEngine = winterFlowBandwidthCache4;
                            this.WinterFlowServerProtocol = 1;
                            obj = winterFlowWorkerThreadPool.WinterFlowVariableVersionControl(this);
                            if (obj != winterFlowListenerJava) {
                                winterFlowBandwidthCache5 = winterFlowBandwidthCache4;
                                WinterFlowFrontendPlatform winterFlowFrontendPlatform22 = (WinterFlowFrontendPlatform) obj;
                                winterFlowBandwidthCache5.WinterFlowVariableVersionControl = winterFlowFrontendPlatform22;
                                obj2 = winterFlowBandwidthCache4.WinterFlowVariableVersionControl;
                                if (obj2 instanceof WinterFlowResponsePackage) {
                                }
                            }
                        } else {
                            winterFlowBandwidthCache5 = winterFlowBandwidthCache4;
                            winterFlowFrontendPlatform22 = null;
                            winterFlowBandwidthCache5.WinterFlowVariableVersionControl = winterFlowFrontendPlatform22;
                            obj2 = winterFlowBandwidthCache4.WinterFlowVariableVersionControl;
                            if (obj2 instanceof WinterFlowResponsePackage) {
                            }
                        }
                    }
                }
                break;
            default:
                switch (this.WinterFlowServerProtocol) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                            winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                            WinterFlowWorkerThreadPool winterFlowWorkerThreadPool2 = winterFlowConcurrencyThread.WinterFlowBackendCacheManager;
                            if (winterFlowWorkerThreadPool2 != null) {
                                this.WinterFlowThreadListener = winterFlowAdapterResponse;
                                this.WinterFlowResponseEngine = winterFlowBandwidthCache;
                                this.WinterFlowTransactionAgent = winterFlowBandwidthCache;
                                this.WinterFlowServerProtocol = 1;
                                obj = winterFlowWorkerThreadPool2.WinterFlowVariableVersionControl(this);
                                if (obj != winterFlowListenerJava) {
                                    winterFlowBandwidthCache2 = winterFlowBandwidthCache;
                                    winterFlowFrontendPlatform = (WinterFlowFrontendPlatform) obj;
                                    winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowFrontendPlatform;
                                    obj4 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                                    if (obj4 instanceof WinterFlowResolverListener) {
                                        this.WinterFlowThreadListener = winterFlowAdapterResponse;
                                        this.WinterFlowResponseEngine = winterFlowBandwidthCache2;
                                        this.WinterFlowTransactionAgent = null;
                                        this.WinterFlowServerProtocol = 2;
                                        if (winterFlowConcurrencyThread.WinterFlowQueryDeserialization((WinterFlowResolverListener) obj4, this) != winterFlowListenerJava) {
                                            winterFlowBandwidthCache3 = winterFlowBandwidthCache2;
                                            winterFlowAdapterResponse2 = winterFlowAdapterResponse;
                                            WinterFlowDebugObject winterFlowDebugObject = new WinterFlowDebugObject(winterFlowBandwidthCache3, winterFlowConcurrencyThread, null);
                                            this.WinterFlowThreadListener = winterFlowAdapterResponse2;
                                            this.WinterFlowResponseEngine = winterFlowBandwidthCache3;
                                            this.WinterFlowServerProtocol = 3;
                                            WinterFlowTransactionManagerService winterFlowTransactionManagerService = winterFlowConcurrencyThread.WinterFlowCacheTool;
                                            WinterFlowTransactionManagerStrategy = winterFlowTransactionManagerService.WinterFlowTransactionManagerStrategy(WinterFlowExceptionListener.WinterFlowTransactionManagerStrategy, new WinterFlowMapperJava(winterFlowDebugObject, winterFlowTransactionManagerService, winterFlowTransactionManagerLayer, 14), this);
                                            if (WinterFlowTransactionManagerStrategy != winterFlowListenerJava) {
                                                WinterFlowTransactionManagerStrategy = winterFlowAlgorithmSession;
                                            }
                                            if (WinterFlowTransactionManagerStrategy == winterFlowListenerJava) {
                                            }
                                            winterFlowAdapterResponse = winterFlowAdapterResponse2;
                                            obj3 = winterFlowBandwidthCache3.WinterFlowVariableVersionControl;
                                            if (obj3 instanceof WinterFlowResponsePackage) {
                                                this.WinterFlowThreadListener = winterFlowAdapterResponse;
                                                this.WinterFlowResponseEngine = null;
                                                this.WinterFlowServerProtocol = 4;
                                                if (winterFlowConcurrencyThread.WinterFlowUserManagerAdapter((WinterFlowResponsePackage) obj3, this) == winterFlowListenerJava) {
                                                    break;
                                                }
                                            } else if (obj3 instanceof WinterFlowParserSubsystem) {
                                                this.WinterFlowThreadListener = winterFlowAdapterResponse;
                                                this.WinterFlowResponseEngine = null;
                                                this.WinterFlowServerProtocol = 5;
                                                if (winterFlowConcurrencyThread.WinterFlowInheritanceJava(this) == winterFlowListenerJava) {
                                                }
                                            }
                                        }
                                    }
                                    if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                                        break;
                                    }
                                }
                            } else {
                                winterFlowBandwidthCache2 = winterFlowBandwidthCache;
                                winterFlowFrontendPlatform = null;
                                winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowFrontendPlatform;
                                obj4 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                                if (obj4 instanceof WinterFlowResolverListener) {
                                }
                                if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        winterFlowBandwidthCache = this.WinterFlowTransactionAgent;
                        winterFlowBandwidthCache2 = this.WinterFlowResponseEngine;
                        winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowFrontendPlatform = (WinterFlowFrontendPlatform) obj;
                        winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowFrontendPlatform;
                        obj4 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                        if (obj4 instanceof WinterFlowResolverListener) {
                        }
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                        }
                        break;
                    case 2:
                        winterFlowBandwidthCache3 = this.WinterFlowResponseEngine;
                        winterFlowAdapterResponse2 = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowDebugObject winterFlowDebugObject2 = new WinterFlowDebugObject(winterFlowBandwidthCache3, winterFlowConcurrencyThread, null);
                        this.WinterFlowThreadListener = winterFlowAdapterResponse2;
                        this.WinterFlowResponseEngine = winterFlowBandwidthCache3;
                        this.WinterFlowServerProtocol = 3;
                        WinterFlowTransactionManagerService winterFlowTransactionManagerService2 = winterFlowConcurrencyThread.WinterFlowCacheTool;
                        WinterFlowTransactionManagerStrategy = winterFlowTransactionManagerService2.WinterFlowTransactionManagerStrategy(WinterFlowExceptionListener.WinterFlowTransactionManagerStrategy, new WinterFlowMapperJava(winterFlowDebugObject2, winterFlowTransactionManagerService2, winterFlowTransactionManagerLayer, 14), this);
                        if (WinterFlowTransactionManagerStrategy != winterFlowListenerJava) {
                        }
                        if (WinterFlowTransactionManagerStrategy == winterFlowListenerJava) {
                        }
                        winterFlowAdapterResponse = winterFlowAdapterResponse2;
                        obj3 = winterFlowBandwidthCache3.WinterFlowVariableVersionControl;
                        if (obj3 instanceof WinterFlowResponsePackage) {
                        }
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                        }
                        break;
                    case 3:
                        winterFlowBandwidthCache3 = this.WinterFlowResponseEngine;
                        winterFlowAdapterResponse2 = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        } catch (CancellationException unused) {
                            winterFlowAdapterResponse3 = winterFlowAdapterResponse2;
                            this.WinterFlowThreadListener = winterFlowAdapterResponse3;
                            this.WinterFlowResponseEngine = null;
                            this.WinterFlowServerProtocol = 6;
                            if (winterFlowConcurrencyThread.WinterFlowInheritanceJava(this) == winterFlowListenerJava) {
                            }
                            winterFlowAdapterResponse = winterFlowAdapterResponse3;
                            if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                            }
                        }
                        winterFlowAdapterResponse = winterFlowAdapterResponse2;
                        obj3 = winterFlowBandwidthCache3.WinterFlowVariableVersionControl;
                        if (obj3 instanceof WinterFlowResponsePackage) {
                        }
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                        }
                        break;
                    case 4:
                        winterFlowAdapterResponse3 = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        } catch (CancellationException unused2) {
                            this.WinterFlowThreadListener = winterFlowAdapterResponse3;
                            this.WinterFlowResponseEngine = null;
                            this.WinterFlowServerProtocol = 6;
                            if (winterFlowConcurrencyThread.WinterFlowInheritanceJava(this) == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            winterFlowAdapterResponse = winterFlowAdapterResponse3;
                            if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                            }
                        }
                        winterFlowAdapterResponse = winterFlowAdapterResponse3;
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                        }
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        winterFlowAdapterResponse3 = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowAdapterResponse = winterFlowAdapterResponse3;
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                        }
                        break;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        winterFlowAdapterResponse3 = (WinterFlowAdapterResponse) this.WinterFlowThreadListener;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowAdapterResponse = winterFlowAdapterResponse3;
                        if (!WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(winterFlowAdapterResponse)) {
                        }
                        break;
                    default:
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowDebugObject) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowObjectSession) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowDebugObject) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowDebugObject(WinterFlowConcurrencyThread winterFlowConcurrencyThread, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServiceUtility = winterFlowConcurrencyThread;
    }
}
