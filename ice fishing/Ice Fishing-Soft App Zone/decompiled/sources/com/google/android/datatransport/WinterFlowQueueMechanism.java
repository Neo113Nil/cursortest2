package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueMechanism implements WinterFlowEncryptionMicroservice, Serializable {
    public final WinterFlowStrategyPackage WinterFlowTransactionManagerStrategy;
    public final WinterFlowEncryptionMicroservice WinterFlowVariableVersionControl;

    public WinterFlowQueueMechanism(WinterFlowStrategyPackage winterFlowStrategyPackage, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        winterFlowEncryptionMicroservice.getClass();
        this.WinterFlowVariableVersionControl = winterFlowEncryptionMicroservice;
        this.WinterFlowTransactionManagerStrategy = winterFlowStrategyPackage;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowStrategyPackage WinterFlowConsumerUserManager(WinterFlowRendererProvider winterFlowRendererProvider) {
        winterFlowRendererProvider.getClass();
        while (true) {
            WinterFlowStrategyPackage WinterFlowConsumerUserManager = this.WinterFlowTransactionManagerStrategy.WinterFlowConsumerUserManager(winterFlowRendererProvider);
            if (WinterFlowConsumerUserManager != null) {
                return WinterFlowConsumerUserManager;
            }
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowVariableVersionControl;
            if (!(winterFlowEncryptionMicroservice instanceof WinterFlowQueueMechanism)) {
                return winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(winterFlowRendererProvider);
            }
            this = (WinterFlowQueueMechanism) winterFlowEncryptionMicroservice;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        winterFlowEncryptionMicroservice.getClass();
        return winterFlowEncryptionMicroservice == WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl ? this : (WinterFlowEncryptionMicroservice) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(new WinterFlowHandlerTool(6), this);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final Object WinterFlowServiceUtility(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return winterFlowEventEvent.WinterFlowVariableVersionControl(this.WinterFlowVariableVersionControl.WinterFlowServiceUtility(winterFlowEventEvent, obj), this.WinterFlowTransactionManagerStrategy);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowRendererProvider winterFlowRendererProvider) {
        winterFlowRendererProvider.getClass();
        WinterFlowStrategyPackage winterFlowStrategyPackage = this.WinterFlowTransactionManagerStrategy;
        WinterFlowStrategyPackage WinterFlowConsumerUserManager = winterFlowStrategyPackage.WinterFlowConsumerUserManager(winterFlowRendererProvider);
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowVariableVersionControl;
        if (WinterFlowConsumerUserManager != null) {
            return winterFlowEncryptionMicroservice;
        }
        WinterFlowEncryptionMicroservice WinterFlowThreadListener = winterFlowEncryptionMicroservice.WinterFlowThreadListener(winterFlowRendererProvider);
        return WinterFlowThreadListener == winterFlowEncryptionMicroservice ? this : WinterFlowThreadListener == WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl ? winterFlowStrategyPackage : new WinterFlowQueueMechanism(winterFlowStrategyPackage, WinterFlowThreadListener);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowQueueMechanism) {
            WinterFlowQueueMechanism winterFlowQueueMechanism = (WinterFlowQueueMechanism) obj;
            int i = 2;
            WinterFlowQueueMechanism winterFlowQueueMechanism2 = winterFlowQueueMechanism;
            int i2 = 2;
            while (true) {
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowQueueMechanism2.WinterFlowVariableVersionControl;
                winterFlowQueueMechanism2 = winterFlowEncryptionMicroservice instanceof WinterFlowQueueMechanism ? (WinterFlowQueueMechanism) winterFlowEncryptionMicroservice : null;
                if (winterFlowQueueMechanism2 == null) {
                    break;
                }
                i2++;
            }
            WinterFlowQueueMechanism winterFlowQueueMechanism3 = this;
            while (true) {
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowQueueMechanism3.WinterFlowVariableVersionControl;
                winterFlowQueueMechanism3 = winterFlowEncryptionMicroservice2 instanceof WinterFlowQueueMechanism ? (WinterFlowQueueMechanism) winterFlowEncryptionMicroservice2 : null;
                if (winterFlowQueueMechanism3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    WinterFlowStrategyPackage winterFlowStrategyPackage = this.WinterFlowTransactionManagerStrategy;
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowQueueMechanism.WinterFlowConsumerUserManager(winterFlowStrategyPackage.getKey()), winterFlowStrategyPackage)) {
                        z = false;
                        break;
                    }
                    WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice3 = this.WinterFlowVariableVersionControl;
                    if (!(winterFlowEncryptionMicroservice3 instanceof WinterFlowQueueMechanism)) {
                        winterFlowEncryptionMicroservice3.getClass();
                        WinterFlowStrategyPackage winterFlowStrategyPackage2 = (WinterFlowStrategyPackage) winterFlowEncryptionMicroservice3;
                        z = WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowQueueMechanism.WinterFlowConsumerUserManager(winterFlowStrategyPackage2.getKey()), winterFlowStrategyPackage2);
                        break;
                    }
                    this = (WinterFlowQueueMechanism) winterFlowEncryptionMicroservice3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowTransactionManagerStrategy.hashCode() + this.WinterFlowVariableVersionControl.hashCode();
    }

    public final String toString() {
        return "[" + ((String) WinterFlowServiceUtility(new WinterFlowHandlerTool(1), "")) + ']';
    }
}
