package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerView extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowServerProtocol;
    public Object WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowThreadListener;
    public /* synthetic */ boolean WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowUserManagerView(WinterFlowStrategyResolver winterFlowStrategyResolver, int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i2) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i2;
        this.WinterFlowServerProtocol = winterFlowStrategyResolver;
        this.WinterFlowThreadListener = i;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        int i2 = this.WinterFlowThreadListener;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowUserManagerView winterFlowUserManagerView = new WinterFlowUserManagerView(winterFlowStrategyResolver, i2, winterFlowTransactionManagerLayer, 0);
                winterFlowUserManagerView.WinterFlowTransactionAgent = ((Boolean) obj).booleanValue();
                return winterFlowUserManagerView;
            default:
                WinterFlowUserManagerView winterFlowUserManagerView2 = new WinterFlowUserManagerView(winterFlowStrategyResolver, i2, winterFlowTransactionManagerLayer, 1);
                winterFlowUserManagerView2.WinterFlowTransactionAgent = ((Boolean) obj).booleanValue();
                return winterFlowUserManagerView2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        Throwable th;
        WinterFlowValidatorBandwidth winterFlowValidatorBandwidth;
        boolean z;
        boolean z2;
        Object obj2;
        int i = this.WinterFlowSyntax;
        int i2 = this.WinterFlowThreadListener;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean z3 = this.WinterFlowResponseEngine;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        WinterFlowDebugStrategy WinterFlowHookDataSource = winterFlowStrategyResolver.WinterFlowHookDataSource();
                        this.WinterFlowServiceUtility = th;
                        this.WinterFlowTransactionAgent = z3;
                        this.WinterFlowResponseEngine = 2;
                        Integer WinterFlowRouterStructure = WinterFlowHookDataSource.WinterFlowRouterStructure();
                        if (WinterFlowRouterStructure == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        obj = WinterFlowRouterStructure;
                        th = th;
                        z3 = z3;
                    }
                }
                if (z3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    boolean z4 = this.WinterFlowTransactionAgent;
                    this.WinterFlowTransactionAgent = z4;
                    this.WinterFlowResponseEngine = 1;
                    obj = winterFlowStrategyResolver.WinterFlowSyntax(z4, this);
                    z3 = z4;
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.WinterFlowTransactionAgent;
                        th = (Throwable) this.WinterFlowServiceUtility;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        z3 = z5;
                        i2 = ((Number) obj).intValue();
                        th = th;
                        winterFlowValidatorBandwidth = new WinterFlowDecoratorServiceProvider(th, i2);
                        z = z3;
                        return new WinterFlowServerPlatform(winterFlowValidatorBandwidth, Boolean.valueOf(z));
                    }
                    boolean z6 = this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    z3 = z6;
                }
                winterFlowValidatorBandwidth = (WinterFlowValidatorBandwidth) obj;
                z = z3;
                return new WinterFlowServerPlatform(winterFlowValidatorBandwidth, Boolean.valueOf(z));
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    z2 = this.WinterFlowTransactionAgent;
                    this.WinterFlowTransactionAgent = z2;
                    this.WinterFlowResponseEngine = 1;
                    obj = ((WinterFlowCachePlatform) winterFlowStrategyResolver.WinterFlowServiceUtility.getValue()).WinterFlowRouterStructure(new WinterFlowVariableWidget(3, (WinterFlowTransactionManagerLayer) null), this);
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.WinterFlowServiceUtility;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                        return new WinterFlowDebugMechanism(obj == null ? obj.hashCode() : 0, i2, obj);
                    }
                    z2 = this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                if (z2) {
                    WinterFlowDebugStrategy WinterFlowHookDataSource2 = winterFlowStrategyResolver.WinterFlowHookDataSource();
                    this.WinterFlowServiceUtility = obj;
                    this.WinterFlowResponseEngine = 2;
                    Integer WinterFlowRouterStructure2 = WinterFlowHookDataSource2.WinterFlowRouterStructure();
                    if (WinterFlowRouterStructure2 == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                    Object obj3 = obj;
                    obj = WinterFlowRouterStructure2;
                    obj2 = obj3;
                    i2 = ((Number) obj).intValue();
                    obj = obj2;
                }
                return new WinterFlowDebugMechanism(obj == null ? obj.hashCode() : 0, i2, obj);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowUserManagerView) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, bool)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
