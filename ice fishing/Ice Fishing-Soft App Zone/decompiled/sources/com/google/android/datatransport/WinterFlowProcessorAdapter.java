package com.google.android.datatransport;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProcessorAdapter {
    public final int WinterFlowArrayNetwork;
    public final /* synthetic */ com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowCacheManagerAgent;
    public boolean WinterFlowHookDataSource;
    public Boolean WinterFlowRouterStructure;
    public final /* synthetic */ com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowTransactionManagerStrategy;
    public final Bundle WinterFlowVariableVersionControl;

    public WinterFlowProcessorAdapter(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, int i, Bundle bundle) {
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxEvent;
        Boolean bool = Boolean.TRUE;
        this.WinterFlowCacheManagerAgent = winterFlowSyntaxEvent;
        this.WinterFlowRouterStructure = bool;
        this.WinterFlowHookDataSource = false;
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = bundle;
    }

    public abstract void WinterFlowHookDataSource(ConnectionResult connectionResult);

    public abstract boolean WinterFlowRouterStructure();
}
