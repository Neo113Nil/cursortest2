package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionThreadPool implements Runnable {
    public final int WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowSessionThreadPool(List list, int i, Throwable th) {
        this.WinterFlowVariableVersionControl = 1;
        WinterFlowSoftwareException.WinterFlowSerializerStructure(list, "initCallbacks cannot be null");
        this.WinterFlowUnitTestResponse = new ArrayList(list);
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        WinterFlowFunctionGateway winterFlowFunctionGateway = (WinterFlowFunctionGateway) arrayList.get(i3);
                        winterFlowFunctionGateway.WinterFlowRouterStructure.setValue(Boolean.TRUE);
                        winterFlowFunctionGateway.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy = new WinterFlowEncryptionArray(true);
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((WinterFlowFunctionGateway) arrayList.get(i3)).WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy = WinterFlowEncryptionSubsystem.WinterFlowTransactionManagerStrategy;
                        i3++;
                    }
                    break;
                }
            default:
                ((WinterFlowCacheTransactionManager) obj).WinterFlowVariableVersionControl(i2);
                break;
        }
    }

    public /* synthetic */ WinterFlowSessionThreadPool(int i, int i2, Object obj) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = i;
    }
}
