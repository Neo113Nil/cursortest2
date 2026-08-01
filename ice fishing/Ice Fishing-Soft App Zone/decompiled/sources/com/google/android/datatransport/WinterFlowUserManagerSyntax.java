package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerSyntax implements WinterFlowWorkerModule {
    public final WinterFlowSessionManagerRequest WinterFlowRouterStructure;

    public WinterFlowUserManagerSyntax(WinterFlowSessionManagerRequest winterFlowSessionManagerRequest) {
        this.WinterFlowRouterStructure = winterFlowSessionManagerRequest;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        WinterFlowViewTesting winterFlowViewTesting;
        int i;
        WinterFlowViewTesting winterFlowViewTesting2;
        int i2;
        int i3;
        int size = list.size();
        WinterFlowViewTesting[] winterFlowViewTestingArr = new WinterFlowViewTesting[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            winterFlowViewTesting = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            WinterFlowRuntimeVersion winterFlowRuntimeVersion = (WinterFlowRuntimeVersion) list.get(i4);
            Object WinterFlowSyntax = winterFlowRuntimeVersion.WinterFlowSyntax();
            WinterFlowResponseSystem winterFlowResponseSystem = WinterFlowSyntax instanceof WinterFlowResponseSystem ? (WinterFlowResponseSystem) WinterFlowSyntax : null;
            if (winterFlowResponseSystem != null && ((Boolean) winterFlowResponseSystem.WinterFlowRouterStructure.getValue()).booleanValue()) {
                winterFlowViewTestingArr[i4] = winterFlowRuntimeVersion.WinterFlowVariableVersionControl(j);
                j2 = (r7.WinterFlowTransactionManagerStrategy & 4294967295L) | (r7.WinterFlowVariableVersionControl << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            WinterFlowRuntimeVersion winterFlowRuntimeVersion2 = (WinterFlowRuntimeVersion) list.get(i5);
            if (winterFlowViewTestingArr[i5] == null) {
                winterFlowViewTestingArr[i5] = winterFlowRuntimeVersion2.WinterFlowVariableVersionControl(j);
            }
        }
        if (winterFlowNodeException.WinterFlowServiceUtility()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                winterFlowViewTesting2 = null;
            } else {
                winterFlowViewTesting2 = winterFlowViewTestingArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = winterFlowViewTesting2 != null ? winterFlowViewTesting2.WinterFlowVariableVersionControl : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            WinterFlowViewTesting winterFlowViewTesting3 = winterFlowViewTestingArr[i8];
                            int i9 = winterFlowViewTesting3 != null ? winterFlowViewTesting3.WinterFlowVariableVersionControl : 0;
                            if (i7 < i9) {
                                winterFlowViewTesting2 = winterFlowViewTesting3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = winterFlowViewTesting2 != null ? winterFlowViewTesting2.WinterFlowVariableVersionControl : 0;
        }
        if (winterFlowNodeException.WinterFlowServiceUtility()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                winterFlowViewTesting = winterFlowViewTestingArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = winterFlowViewTesting != null ? winterFlowViewTesting.WinterFlowTransactionManagerStrategy : 0;
                    if (1 <= i10) {
                        while (true) {
                            WinterFlowViewTesting winterFlowViewTesting4 = winterFlowViewTestingArr[i];
                            int i12 = winterFlowViewTesting4 != null ? winterFlowViewTesting4.WinterFlowTransactionManagerStrategy : 0;
                            if (i11 < i12) {
                                winterFlowViewTesting = winterFlowViewTesting4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = winterFlowViewTesting != null ? winterFlowViewTesting.WinterFlowTransactionManagerStrategy : 0;
        }
        if (!winterFlowNodeException.WinterFlowServiceUtility()) {
            this.WinterFlowRouterStructure.WinterFlowCacheManagerAgent.setValue(new WinterFlowJavaEntity((i2 << 32) | (i3 & 4294967295L)));
        }
        return winterFlowNodeException.WinterFlowThreadListener(i2, i3, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowInheritanceMechanism(winterFlowViewTestingArr, this, i2, i3));
    }
}
