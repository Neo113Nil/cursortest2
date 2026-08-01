package com.google.android.datatransport;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolSubsystem extends WinterFlowProcessorAdapter {
    public final /* synthetic */ com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowRouterRouter;
    public final IBinder WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowThreadPoolSubsystem(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, int i, IBinder iBinder, Bundle bundle) {
        super(winterFlowSyntaxEvent, i, bundle);
        this.WinterFlowRouterRouter = winterFlowSyntaxEvent;
        this.WinterFlowUnitTestResponse = iBinder;
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorAdapter
    public final void WinterFlowHookDataSource(ConnectionResult connectionResult) {
        WinterFlowConcurrencyProcess winterFlowConcurrencyProcess = this.WinterFlowRouterRouter.WinterFlowBandwidthObject;
        if (winterFlowConcurrencyProcess != null) {
            ((WinterFlowJSONHelper) winterFlowConcurrencyProcess.WinterFlowVariableVersionControl).WinterFlowArrayNetwork(connectionResult);
        }
        System.currentTimeMillis();
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorAdapter
    public final boolean WinterFlowRouterStructure() {
        String interfaceDescriptor;
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent;
        IBinder iBinder = this.WinterFlowUnitTestResponse;
        try {
            WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            winterFlowSyntaxEvent = this.WinterFlowRouterRouter;
        } catch (RemoteException unused) {
        }
        if (!winterFlowSyntaxEvent.WinterFlowSyntax().equals(interfaceDescriptor)) {
            new StringBuilder(winterFlowSyntaxEvent.WinterFlowSyntax().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface WinterFlowRouterStructure = winterFlowSyntaxEvent.WinterFlowRouterStructure(iBinder);
        if (WinterFlowRouterStructure != null && (winterFlowSyntaxEvent.WinterFlowBandwidthObject(2, 4, WinterFlowRouterStructure) || winterFlowSyntaxEvent.WinterFlowBandwidthObject(3, 4, WinterFlowRouterStructure))) {
            winterFlowSyntaxEvent.WinterFlowBatchUI = null;
            WinterFlowNodeSerializer winterFlowNodeSerializer = winterFlowSyntaxEvent.WinterFlowServiceUtility;
            if (winterFlowNodeSerializer == null) {
                return true;
            }
            ((WinterFlowAlgorithmPlatform) winterFlowNodeSerializer.WinterFlowVariableVersionControl).WinterFlowCacheManagerAgent();
            return true;
        }
        return false;
    }
}
