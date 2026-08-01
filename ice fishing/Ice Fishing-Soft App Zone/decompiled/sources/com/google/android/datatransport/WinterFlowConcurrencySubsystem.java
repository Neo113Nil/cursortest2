package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencySubsystem extends WinterFlowCloudStack {
    public int WinterFlowOrchestrationSubsystem;
    public int WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public WinterFlowThreadDebug[] WinterFlowTransactionAgent = new WinterFlowThreadDebug[16];
    public int[] WinterFlowThreadListener = new int[16];
    public Object[] WinterFlowBandwidthObject = new Object[16];

    public final void WinterFlowCompilerDataSource() {
        this.WinterFlowServerProtocol = 0;
        this.WinterFlowServiceUtility = 0;
        Arrays.fill(this.WinterFlowBandwidthObject, 0, this.WinterFlowOrchestrationSubsystem, (Object) null);
        this.WinterFlowOrchestrationSubsystem = 0;
    }

    public final void WinterFlowFrameworkTransaction(WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        if (this.WinterFlowServerProtocol != 0) {
            WinterFlowProviderEntity winterFlowProviderEntity = new WinterFlowProviderEntity(this);
            WinterFlowConcurrencySubsystem winterFlowConcurrencySubsystem = (WinterFlowConcurrencySubsystem) winterFlowProviderEntity.WinterFlowArrayNetwork;
            while (true) {
                WinterFlowThreadDebug winterFlowThreadDebug = winterFlowConcurrencySubsystem.WinterFlowTransactionAgent[winterFlowProviderEntity.WinterFlowRouterStructure];
                WinterFlowDatabaseSchemaHandler WinterFlowHookDataSource = winterFlowThreadDebug.WinterFlowHookDataSource(winterFlowProviderEntity);
                WinterFlowProcessorConsumer winterFlowProcessorConsumer2 = winterFlowProcessorConsumer;
                WinterFlowServiceProviderListener winterFlowServiceProviderListener2 = winterFlowServiceProviderListener;
                WinterFlowValidator winterFlowValidator2 = winterFlowValidator;
                WinterFlowListenerUtility winterFlowListenerUtility2 = winterFlowListenerUtility;
                try {
                    winterFlowThreadDebug.WinterFlowRouterStructure(winterFlowProviderEntity, winterFlowProcessorConsumer2, winterFlowServiceProviderListener2, winterFlowValidator2, winterFlowListenerUtility2);
                    int i = winterFlowProviderEntity.WinterFlowRouterStructure;
                    int i2 = winterFlowConcurrencySubsystem.WinterFlowServerProtocol;
                    if (i < i2) {
                        WinterFlowThreadDebug winterFlowThreadDebug2 = winterFlowConcurrencySubsystem.WinterFlowTransactionAgent[i];
                        winterFlowProviderEntity.WinterFlowHookDataSource += winterFlowThreadDebug2.WinterFlowRouterStructure;
                        winterFlowProviderEntity.WinterFlowCacheManagerAgent += winterFlowThreadDebug2.WinterFlowHookDataSource;
                        int i3 = i + 1;
                        winterFlowProviderEntity.WinterFlowRouterStructure = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        winterFlowProcessorConsumer = winterFlowProcessorConsumer2;
                        winterFlowServiceProviderListener = winterFlowServiceProviderListener2;
                        winterFlowValidator = winterFlowValidator2;
                        winterFlowListenerUtility = winterFlowListenerUtility2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        WinterFlowCompilerDataSource();
    }

    public final void WinterFlowModuleAgent(WinterFlowThreadDebug winterFlowThreadDebug) {
        int i = this.WinterFlowServerProtocol;
        WinterFlowThreadDebug[] winterFlowThreadDebugArr = this.WinterFlowTransactionAgent;
        if (i == winterFlowThreadDebugArr.length) {
            WinterFlowThreadDebug[] winterFlowThreadDebugArr2 = new WinterFlowThreadDebug[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(winterFlowThreadDebugArr, 0, winterFlowThreadDebugArr2, 0, i);
            this.WinterFlowTransactionAgent = winterFlowThreadDebugArr2;
        }
        int i2 = this.WinterFlowServiceUtility;
        int i3 = winterFlowThreadDebug.WinterFlowRouterStructure;
        int i4 = winterFlowThreadDebug.WinterFlowHookDataSource;
        int i5 = i2 + i3;
        int[] iArr = this.WinterFlowThreadListener;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr2, 0, 0, length);
            this.WinterFlowThreadListener = iArr2;
        }
        int i7 = this.WinterFlowOrchestrationSubsystem + i4;
        Object[] objArr = this.WinterFlowBandwidthObject;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.WinterFlowBandwidthObject = objArr2;
        }
        WinterFlowThreadDebug[] winterFlowThreadDebugArr3 = this.WinterFlowTransactionAgent;
        int i9 = this.WinterFlowServerProtocol;
        this.WinterFlowServerProtocol = i9 + 1;
        winterFlowThreadDebugArr3[i9] = winterFlowThreadDebug;
        this.WinterFlowServiceUtility += winterFlowThreadDebug.WinterFlowRouterStructure;
        this.WinterFlowOrchestrationSubsystem += i4;
    }

    public final boolean WinterFlowOrchestrationConfiguration() {
        return this.WinterFlowServerProtocol == 0;
    }
}
