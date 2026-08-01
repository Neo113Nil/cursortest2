package com.google.android.datatransport;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRefactoringMechanism implements WinterFlowDeserializationProcess {
    public final long WinterFlowRouterRouter;
    public final long WinterFlowSyntax;
    public final int WinterFlowTransactionManagerStrategy;
    public final WinterFlowRepositoryBandwidth WinterFlowUnitTestResponse;
    public final WinterFlowTransactionManagerStack WinterFlowVariableVersionControl;

    public WinterFlowRefactoringMechanism(WinterFlowTransactionManagerStack winterFlowTransactionManagerStack, int i, WinterFlowRepositoryBandwidth winterFlowRepositoryBandwidth, long j, long j2) {
        this.WinterFlowVariableVersionControl = winterFlowTransactionManagerStack;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowRepositoryBandwidth;
        this.WinterFlowRouterRouter = j;
        this.WinterFlowSyntax = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WinterFlowVariableEngine WinterFlowHookDataSource(WinterFlowCacheTransactionManager winterFlowCacheTransactionManager, com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, int i) {
        WinterFlowListenerEvent winterFlowListenerEvent = winterFlowSyntaxEvent.WinterFlowSerializerStructure;
        WinterFlowVariableEngine winterFlowVariableEngine = winterFlowListenerEvent == null ? null : winterFlowListenerEvent.WinterFlowRouterRouter;
        if (winterFlowVariableEngine != null && winterFlowVariableEngine.WinterFlowTransactionManagerStrategy) {
            int[] iArr = winterFlowVariableEngine.WinterFlowRouterRouter;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = winterFlowVariableEngine.WinterFlowResponseEngine;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (winterFlowCacheTransactionManager.WinterFlowServiceUtility >= winterFlowVariableEngine.WinterFlowSyntax) {
                    return winterFlowVariableEngine;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (winterFlowCacheTransactionManager.WinterFlowServiceUtility >= winterFlowVariableEngine.WinterFlowSyntax) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationProcess
    public final void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        WinterFlowTransactionManagerStack winterFlowTransactionManagerStack = this.WinterFlowVariableVersionControl;
        if (winterFlowTransactionManagerStack.WinterFlowArrayNetwork()) {
            WinterFlowQueryScript winterFlowQueryScript = (WinterFlowQueryScript) WinterFlowJSONDecorator.WinterFlowRouterRouter().WinterFlowTransactionManagerStrategy;
            if (winterFlowQueryScript == null || winterFlowQueryScript.WinterFlowTransactionManagerStrategy) {
                WinterFlowCacheTransactionManager winterFlowCacheTransactionManager = (WinterFlowCacheTransactionManager) winterFlowTransactionManagerStack.WinterFlowResponseEngine.get(this.WinterFlowUnitTestResponse);
                if (winterFlowCacheTransactionManager != null) {
                    com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = winterFlowCacheTransactionManager.WinterFlowArrayNetwork;
                    if (winterFlowSyntaxEvent instanceof com.google.android.gms.common.internal.WinterFlowSyntaxEvent) {
                        long j3 = this.WinterFlowRouterRouter;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = winterFlowSyntaxEvent.WinterFlowOrchestrationSubsystem;
                        if (winterFlowQueryScript != null) {
                            z &= winterFlowQueryScript.WinterFlowUnitTestResponse;
                            i = winterFlowQueryScript.WinterFlowRouterRouter;
                            i3 = winterFlowQueryScript.WinterFlowSyntax;
                            i2 = winterFlowQueryScript.WinterFlowVariableVersionControl;
                            if (winterFlowSyntaxEvent.WinterFlowSerializerStructure != null && !winterFlowSyntaxEvent.WinterFlowThreadListener()) {
                                WinterFlowVariableEngine WinterFlowHookDataSource = WinterFlowHookDataSource(winterFlowCacheTransactionManager, winterFlowSyntaxEvent, this.WinterFlowTransactionManagerStrategy);
                                if (WinterFlowHookDataSource == null) {
                                    return;
                                }
                                boolean z2 = WinterFlowHookDataSource.WinterFlowUnitTestResponse && j3 > 0;
                                i3 = WinterFlowHookDataSource.WinterFlowSyntax;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int i9 = -1;
                        if (winterFlowExceptionParser.WinterFlowRouterRouter()) {
                            i5 = 0;
                        } else if (winterFlowExceptionParser.WinterFlowArrayNetwork) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception WinterFlowVariableVersionControl = winterFlowExceptionParser.WinterFlowVariableVersionControl();
                            if (WinterFlowVariableVersionControl instanceof WinterFlowInheritanceOrchestration) {
                                Status status = ((WinterFlowInheritanceOrchestration) WinterFlowVariableVersionControl).WinterFlowVariableVersionControl;
                                i4 = status.WinterFlowVariableVersionControl;
                                ConnectionResult connectionResult = status.WinterFlowRouterRouter;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.WinterFlowTransactionManagerStrategy;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.WinterFlowSyntax;
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        WinterFlowEventEmitterUtility winterFlowEventEmitterUtility = new WinterFlowEventEmitterUtility(new WinterFlowTestingFramework(this.WinterFlowTransactionManagerStrategy, i5, i6, j, j2, null, null, i7, i9), i2, i8, i3);
                        WinterFlowWidgetInterface winterFlowWidgetInterface = winterFlowTransactionManagerStack.WinterFlowThreadListener;
                        winterFlowWidgetInterface.sendMessage(winterFlowWidgetInterface.obtainMessage(18, winterFlowEventEmitterUtility));
                    }
                }
            }
        }
    }
}
