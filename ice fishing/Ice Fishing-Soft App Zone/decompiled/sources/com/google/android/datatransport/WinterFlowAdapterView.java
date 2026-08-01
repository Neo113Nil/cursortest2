package com.google.android.datatransport;

import com.adjust.sdk.OnAdidReadListener;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterView implements OnAdidReadListener {
    public final /* synthetic */ WinterFlowEventCloud WinterFlowRouterStructure;

    public WinterFlowAdapterView(WinterFlowEventCloud winterFlowEventCloud) {
        this.WinterFlowRouterStructure = winterFlowEventCloud;
    }

    @Override // com.adjust.sdk.OnAdidReadListener
    public final void onAdidRead(String str) {
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowRouterStructure;
        if (!(winterFlowEventCloud.WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork)) {
            winterFlowEventCloud = null;
        }
        if (winterFlowEventCloud != null) {
            winterFlowEventCloud.WinterFlowSyntax(str);
        }
    }
}
