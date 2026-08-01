package com.google.android.datatransport;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerSubsystem extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowProtocolManager WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowSessionComponent WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowCacheException WinterFlowServiceUtility;
    public final /* synthetic */ WinterFlowHandlerInvoker WinterFlowSyntax;
    public final /* synthetic */ WinterFlowBatchCacheManager WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowLibrarySessionManager WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowControllerSubsystem(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowProtocolManager winterFlowProtocolManager, WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, WinterFlowSessionComponent winterFlowSessionComponent, WinterFlowBatchCacheManager winterFlowBatchCacheManager, WinterFlowCacheException winterFlowCacheException, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = winterFlowHandlerInvoker;
        this.WinterFlowResponseEngine = winterFlowProtocolManager;
        this.WinterFlowTransactionAgent = winterFlowLibrarySessionManager;
        this.WinterFlowServerProtocol = winterFlowSessionComponent;
        this.WinterFlowThreadListener = winterFlowBatchCacheManager;
        this.WinterFlowServiceUtility = winterFlowCacheException;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowControllerSubsystem(this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, winterFlowTransactionManagerLayer);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowSyntax;
        Object WinterFlowSyntax = winterFlowHandlerInvoker.WinterFlowRouterStructure.WinterFlowSyntax();
        WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowHandlerInvoker.WinterFlowArrayNetwork;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowSyntax, winterFlowResolverSubsystem.getValue()) && (((WinterFlowLibrarySessionManager) this.WinterFlowResponseEngine.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter()) == null || WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowResolverSubsystem.getValue(), this.WinterFlowTransactionAgent))) {
            Iterator it = ((List) this.WinterFlowThreadListener.getValue()).iterator();
            while (it.hasNext()) {
                this.WinterFlowServiceUtility.WinterFlowHookDataSource().WinterFlowCacheManagerAgent((WinterFlowLibrarySessionManager) it.next());
            }
            WinterFlowSessionComponent winterFlowSessionComponent = this.WinterFlowServerProtocol;
            long[] jArr = winterFlowSessionComponent.WinterFlowRouterStructure;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = winterFlowSessionComponent.WinterFlowHookDataSource[i4];
                                float f = winterFlowSessionComponent.WinterFlowCacheManagerAgent[i4];
                                if (!WinterFlowManagerRequest.WinterFlowThreadListener((String) obj2, ((WinterFlowLibrarySessionManager) winterFlowResolverSubsystem.getValue()).WinterFlowResponseEngine)) {
                                    winterFlowSessionComponent.WinterFlowVariableVersionControl--;
                                    long[] jArr2 = winterFlowSessionComponent.WinterFlowRouterStructure;
                                    int i5 = winterFlowSessionComponent.WinterFlowArrayNetwork;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    winterFlowSessionComponent.WinterFlowHookDataSource[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        WinterFlowControllerSubsystem winterFlowControllerSubsystem = (WinterFlowControllerSubsystem) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj);
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        winterFlowControllerSubsystem.WinterFlowServiceUtility(winterFlowAlgorithmSession);
        return winterFlowAlgorithmSession;
    }
}
