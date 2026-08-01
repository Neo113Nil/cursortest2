package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowAPINode implements Comparator {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowAPINode(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.WinterFlowRouterStructure;
        Object obj3 = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                for (WinterFlowObjectSession winterFlowObjectSession : (WinterFlowObjectSession[]) obj3) {
                    int WinterFlowUnitTestResponse = WinterFlowQuerySyntax.WinterFlowUnitTestResponse((Comparable) winterFlowObjectSession.WinterFlowUnitTestResponse(obj), (Comparable) winterFlowObjectSession.WinterFlowUnitTestResponse(obj2));
                    if (WinterFlowUnitTestResponse != 0) {
                        return WinterFlowUnitTestResponse;
                    }
                }
                return 0;
            default:
                return ((Number) ((WinterFlowEventEvent) obj3).WinterFlowVariableVersionControl(obj, obj2)).intValue();
        }
    }
}
