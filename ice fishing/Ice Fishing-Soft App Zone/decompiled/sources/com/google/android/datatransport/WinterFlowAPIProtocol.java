package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIProtocol extends WinterFlowThreadDebug {
    public static final WinterFlowAPIProtocol WinterFlowCacheManagerAgent = new WinterFlowAPIProtocol(1, 0, 2);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        int[] iArr;
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler;
        int WinterFlowCacheManagerAgent2;
        int WinterFlowHookDataSource = winterFlowProviderEntity.WinterFlowHookDataSource(0);
        if (winterFlowServiceProviderListener.WinterFlowServiceUtility != 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot move a group while inserting");
        }
        if (WinterFlowHookDataSource < 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Parameter offset is out of bounds");
        }
        if (WinterFlowHookDataSource == 0) {
            return;
        }
        int i = winterFlowServiceProviderListener.WinterFlowBatchUI;
        int i2 = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
        int i3 = winterFlowServiceProviderListener.WinterFlowRouterAdapter;
        int i4 = i;
        while (true) {
            iArr = winterFlowServiceProviderListener.WinterFlowHookDataSource;
            if (WinterFlowHookDataSource <= 0) {
                break;
            }
            i4 += iArr[(winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i4) * 5) + 3];
            if (i4 > i3) {
                WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Parameter offset is out of bounds");
            }
            WinterFlowHookDataSource--;
        }
        int i5 = iArr[(winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i4) * 5) + 3];
        int WinterFlowTransactionManagerStrategy = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(winterFlowServiceProviderListener.WinterFlowBatchUI));
        int WinterFlowTransactionManagerStrategy2 = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i4));
        int i6 = i4 + i5;
        int WinterFlowTransactionManagerStrategy3 = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i6));
        int i7 = WinterFlowTransactionManagerStrategy3 - WinterFlowTransactionManagerStrategy2;
        winterFlowServiceProviderListener.WinterFlowMapperProtocol(i7, Math.max(winterFlowServiceProviderListener.WinterFlowBatchUI - 1, 0));
        winterFlowServiceProviderListener.WinterFlowSerializerStructure(i5);
        int[] iArr2 = winterFlowServiceProviderListener.WinterFlowHookDataSource;
        int WinterFlowConcurrencyThread = winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i6) * 5;
        WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr2, iArr2, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i) * 5, WinterFlowConcurrencyThread, (i5 * 5) + WinterFlowConcurrencyThread);
        if (i7 > 0) {
            Object[] objArr = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent;
            int WinterFlowUnitTestResponse = winterFlowServiceProviderListener.WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy2 + i7);
            System.arraycopy(objArr, WinterFlowUnitTestResponse, objArr, WinterFlowTransactionManagerStrategy, winterFlowServiceProviderListener.WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy3 + i7) - WinterFlowUnitTestResponse);
        }
        int i8 = WinterFlowTransactionManagerStrategy2 + i7;
        int i9 = i8 - WinterFlowTransactionManagerStrategy;
        int i10 = winterFlowServiceProviderListener.WinterFlowTransactionAgent;
        int i11 = winterFlowServiceProviderListener.WinterFlowServerProtocol;
        int length = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent.length;
        int i12 = winterFlowServiceProviderListener.WinterFlowThreadListener;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int WinterFlowConcurrencyThread2 = winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(WinterFlowConcurrencyThread2 * 5) + 4] = WinterFlowServiceProviderListener.WinterFlowRouterRouter(WinterFlowServiceProviderListener.WinterFlowRouterRouter(winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(iArr2, WinterFlowConcurrencyThread2) - i15, i12 < WinterFlowConcurrencyThread2 ? 0 : i10, i11, length), winterFlowServiceProviderListener.WinterFlowTransactionAgent, winterFlowServiceProviderListener.WinterFlowServerProtocol, winterFlowServiceProviderListener.WinterFlowCacheManagerAgent.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int WinterFlowBandwidthObject = winterFlowServiceProviderListener.WinterFlowBandwidthObject();
        int WinterFlowHookDataSource2 = WinterFlowQueryTool.WinterFlowHookDataSource(winterFlowServiceProviderListener.WinterFlowArrayNetwork, i6, WinterFlowBandwidthObject);
        ArrayList arrayList = new ArrayList();
        if (WinterFlowHookDataSource2 >= 0) {
            while (WinterFlowHookDataSource2 < winterFlowServiceProviderListener.WinterFlowArrayNetwork.size() && (WinterFlowCacheManagerAgent2 = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent((winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) winterFlowServiceProviderListener.WinterFlowArrayNetwork.get(WinterFlowHookDataSource2)))) >= i6 && WinterFlowCacheManagerAgent2 < i16) {
                arrayList.add(winterFlowDatabaseSchemaHandler);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler2 = (WinterFlowDatabaseSchemaHandler) arrayList.get(i18);
            int WinterFlowCacheManagerAgent3 = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaHandler2) + i17;
            if (WinterFlowCacheManagerAgent3 >= winterFlowServiceProviderListener.WinterFlowUnitTestResponse) {
                winterFlowDatabaseSchemaHandler2.WinterFlowRouterStructure = -(WinterFlowBandwidthObject - WinterFlowCacheManagerAgent3);
            } else {
                winterFlowDatabaseSchemaHandler2.WinterFlowRouterStructure = WinterFlowCacheManagerAgent3;
            }
            winterFlowServiceProviderListener.WinterFlowArrayNetwork.add(WinterFlowQueryTool.WinterFlowHookDataSource(winterFlowServiceProviderListener.WinterFlowArrayNetwork, WinterFlowCacheManagerAgent3, WinterFlowBandwidthObject), winterFlowDatabaseSchemaHandler2);
        }
        if (winterFlowServiceProviderListener.WinterFlowSoftwareProtocol(i6, i5)) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Unexpectedly removed anchors");
        }
        winterFlowServiceProviderListener.WinterFlowServerProtocol(i2, winterFlowServiceProviderListener.WinterFlowRouterAdapter, i);
        if (i7 > 0) {
            winterFlowServiceProviderListener.WinterFlowUserManagerUserManager(i8, i7, i6 - 1);
        }
    }
}
