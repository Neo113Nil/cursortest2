package com.google.android.datatransport;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetComponent extends WinterFlowProcessorAdapter {
    public final /* synthetic */ com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowWidgetComponent(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, int i, Bundle bundle) {
        super(winterFlowSyntaxEvent, i, bundle);
        this.WinterFlowUnitTestResponse = winterFlowSyntaxEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorAdapter
    public final void WinterFlowHookDataSource(ConnectionResult connectionResult) {
        this.WinterFlowUnitTestResponse.WinterFlowSyntax.WinterFlowHookDataSource(connectionResult);
        System.currentTimeMillis();
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorAdapter
    public final boolean WinterFlowRouterStructure() {
        this.WinterFlowUnitTestResponse.WinterFlowSyntax.WinterFlowHookDataSource(ConnectionResult.WinterFlowResponseEngine);
        return true;
    }
}
