package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectRenderer implements ServiceConnection {
    public final /* synthetic */ com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowObjectRenderer(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, int i) {
        this.WinterFlowHookDataSource = winterFlowSyntaxEvent;
        this.WinterFlowRouterStructure = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowHookDataSource;
        if (iBinder == null) {
            synchronized (winterFlowSyntaxEvent.WinterFlowTransactionManagerStrategy) {
                i = winterFlowSyntaxEvent.WinterFlowThreadListener;
            }
            if (i == 3) {
                winterFlowSyntaxEvent.WinterFlowRouterAdapter = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            WinterFlowVariableNetwork winterFlowVariableNetwork = winterFlowSyntaxEvent.WinterFlowVariableVersionControl;
            winterFlowVariableNetwork.sendMessage(winterFlowVariableNetwork.obtainMessage(i2, winterFlowSyntaxEvent.WinterFlowMapperProtocol.get(), 16));
            return;
        }
        synchronized (winterFlowSyntaxEvent.WinterFlowUnitTestResponse) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                winterFlowSyntaxEvent.WinterFlowRouterRouter = (queryLocalInterface == null || !(queryLocalInterface instanceof WinterFlowProxyProtocol)) ? new WinterFlowProxyProtocol(iBinder) : (WinterFlowProxyProtocol) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowHookDataSource;
        int i3 = this.WinterFlowRouterStructure;
        WinterFlowWidgetComponent winterFlowWidgetComponent = new WinterFlowWidgetComponent(winterFlowSyntaxEvent2, 0, null);
        WinterFlowVariableNetwork winterFlowVariableNetwork2 = winterFlowSyntaxEvent2.WinterFlowVariableVersionControl;
        winterFlowVariableNetwork2.sendMessage(winterFlowVariableNetwork2.obtainMessage(7, i3, -1, winterFlowWidgetComponent));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowHookDataSource;
        synchronized (winterFlowSyntaxEvent.WinterFlowUnitTestResponse) {
            winterFlowSyntaxEvent.WinterFlowRouterRouter = null;
        }
        com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowHookDataSource;
        int i = this.WinterFlowRouterStructure;
        WinterFlowVariableNetwork winterFlowVariableNetwork = winterFlowSyntaxEvent2.WinterFlowVariableVersionControl;
        winterFlowVariableNetwork.sendMessage(winterFlowVariableNetwork.obtainMessage(6, i, 1));
    }
}
