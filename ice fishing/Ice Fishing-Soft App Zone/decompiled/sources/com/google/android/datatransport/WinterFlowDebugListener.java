package com.google.android.datatransport;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugListener implements OnAttributionReadListener {
    public final /* synthetic */ WinterFlowEventCloud WinterFlowRouterStructure;

    public WinterFlowDebugListener(WinterFlowEventCloud winterFlowEventCloud) {
        this.WinterFlowRouterStructure = winterFlowEventCloud;
    }

    @Override // com.adjust.sdk.OnAttributionReadListener
    public final void onAttributionRead(AdjustAttribution adjustAttribution) {
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowRouterStructure;
        if (!(winterFlowEventCloud.WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork)) {
            winterFlowEventCloud = null;
        }
        if (winterFlowEventCloud != null) {
            String str = adjustAttribution != null ? adjustAttribution.jsonResponse : null;
            if (str == null) {
                str = "";
            }
            winterFlowEventCloud.WinterFlowSyntax(str);
        }
    }
}
