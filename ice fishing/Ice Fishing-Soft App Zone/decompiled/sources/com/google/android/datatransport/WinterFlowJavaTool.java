package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaTool extends WinterFlowSoftwareException {
    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final boolean WinterFlowBatchUI(WinterFlowThreadHelper winterFlowThreadHelper, Object obj, Object obj2) {
        synchronized (winterFlowThreadHelper) {
            try {
                if (winterFlowThreadHelper.WinterFlowVariableVersionControl != obj) {
                    return false;
                }
                winterFlowThreadHelper.WinterFlowVariableVersionControl = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final void WinterFlowCompilerHandler(WinterFlowTransaction winterFlowTransaction, WinterFlowTransaction winterFlowTransaction2) {
        winterFlowTransaction.WinterFlowHookDataSource = winterFlowTransaction2;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final void WinterFlowFrontendBackend(WinterFlowTransaction winterFlowTransaction, Thread thread) {
        winterFlowTransaction.WinterFlowRouterStructure = thread;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final boolean WinterFlowRouterAdapter(WinterFlowThreadHelper winterFlowThreadHelper, WinterFlowTransaction winterFlowTransaction, WinterFlowTransaction winterFlowTransaction2) {
        synchronized (winterFlowThreadHelper) {
            try {
                if (winterFlowThreadHelper.WinterFlowUnitTestResponse != winterFlowTransaction) {
                    return false;
                }
                winterFlowThreadHelper.WinterFlowUnitTestResponse = winterFlowTransaction2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final boolean WinterFlowVariableBandwidth(WinterFlowThreadHelper winterFlowThreadHelper, WinterFlowProcessorFunction winterFlowProcessorFunction) {
        WinterFlowProcessorFunction winterFlowProcessorFunction2 = WinterFlowProcessorFunction.WinterFlowHookDataSource;
        synchronized (winterFlowThreadHelper) {
            try {
                if (winterFlowThreadHelper.WinterFlowTransactionManagerStrategy != winterFlowProcessorFunction) {
                    return false;
                }
                winterFlowThreadHelper.WinterFlowTransactionManagerStrategy = winterFlowProcessorFunction2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
