package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeMechanism extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowBandwidthObject;
    public int WinterFlowResponseEngine;
    public Object WinterFlowServerProtocol;
    public /* synthetic */ Object WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax;
    public Object WinterFlowThreadListener;
    public Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowRuntimeMechanism(WinterFlowCacheException winterFlowCacheException, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, WinterFlowObjectHandler winterFlowObjectHandler, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 0;
        this.WinterFlowServerProtocol = winterFlowCacheException;
        this.WinterFlowThreadListener = winterFlowThreadPoolGateway;
        this.WinterFlowBandwidthObject = winterFlowObjectHandler;
        this.WinterFlowServiceUtility = winterFlowThreadPoolGateway2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowBandwidthObject;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowRuntimeMechanism winterFlowRuntimeMechanism = new WinterFlowRuntimeMechanism((WinterFlowCacheException) this.WinterFlowServerProtocol, (WinterFlowThreadPoolGateway) this.WinterFlowThreadListener, (WinterFlowObjectHandler) obj2, (WinterFlowThreadPoolGateway) this.WinterFlowServiceUtility, winterFlowTransactionManagerLayer);
                winterFlowRuntimeMechanism.WinterFlowTransactionAgent = obj;
                return winterFlowRuntimeMechanism;
            case 1:
                WinterFlowRuntimeMechanism winterFlowRuntimeMechanism2 = new WinterFlowRuntimeMechanism((WinterFlowBackendService) this.WinterFlowThreadListener, (WinterFlowAdapterSyntax) this.WinterFlowServiceUtility, (WinterFlowPipelineBackend) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowRuntimeMechanism2.WinterFlowTransactionAgent = obj;
                return winterFlowRuntimeMechanism2;
            case 2:
                return new WinterFlowRuntimeMechanism((WinterFlowCacheManagerMicroservice) this.WinterFlowServiceUtility, this.WinterFlowTransactionAgent, (WinterFlowHandlerInvoker) obj2, winterFlowTransactionManagerLayer);
            case 3:
                WinterFlowRuntimeMechanism winterFlowRuntimeMechanism3 = new WinterFlowRuntimeMechanism((WinterFlowRouterEngine) obj2, winterFlowTransactionManagerLayer);
                winterFlowRuntimeMechanism3.WinterFlowServiceUtility = obj;
                return winterFlowRuntimeMechanism3;
            default:
                WinterFlowRuntimeMechanism winterFlowRuntimeMechanism4 = new WinterFlowRuntimeMechanism((WinterFlowDebugLibrary) this.WinterFlowThreadListener, (WinterFlowTransactionManagerService) this.WinterFlowServiceUtility, (WinterFlowBandwidthCache) obj2, winterFlowTransactionManagerLayer, 4);
                winterFlowRuntimeMechanism4.WinterFlowTransactionAgent = obj;
                return winterFlowRuntimeMechanism4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0469 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a8 A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #8 {all -> 0x0139, blocks: (B:34:0x0152, B:35:0x019e, B:37:0x018d, B:42:0x01a8, B:47:0x0135), top: B:25:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02af  */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.google.android.datatransport.WinterFlowJSONDecorator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0084 -> B:7:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01a6 -> B:35:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01ba -> B:35:0x018d). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object WinterFlowServiceUtility(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.WinterFlowRuntimeMechanism.WinterFlowServiceUtility(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRuntimeMechanism) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowEventProvider) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowRuntimeMechanism) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                return ((WinterFlowRuntimeMechanism) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 3:
                ((WinterFlowRuntimeMechanism) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return WinterFlowListenerJava.WinterFlowVariableVersionControl;
            default:
                return ((WinterFlowRuntimeMechanism) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRendererClass) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowRuntimeMechanism(WinterFlowRouterEngine winterFlowRouterEngine, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 3;
        this.WinterFlowBandwidthObject = winterFlowRouterEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowRuntimeMechanism(WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice, Object obj, WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 2;
        this.WinterFlowServiceUtility = winterFlowCacheManagerMicroservice;
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowBandwidthObject = winterFlowHandlerInvoker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRuntimeMechanism(Object obj, Object obj2, Object obj3, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowThreadListener = obj;
        this.WinterFlowServiceUtility = obj2;
        this.WinterFlowBandwidthObject = obj3;
    }
}
