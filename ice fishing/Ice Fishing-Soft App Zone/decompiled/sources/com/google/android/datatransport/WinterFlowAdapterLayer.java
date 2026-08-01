package com.google.android.datatransport;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterLayer extends WinterFlowStackLibrary {
    public com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowArrayNetwork;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowAdapterLayer(com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.WinterFlowArrayNetwork = winterFlowSyntaxEvent;
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowStackLibrary
    public final boolean WinterFlowTransactionManagerStrategy(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) WinterFlowRouterScheduler.WinterFlowRouterStructure(parcel, Bundle.CREATOR);
            WinterFlowRouterScheduler.WinterFlowHookDataSource(parcel);
            WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(this.WinterFlowArrayNetwork, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowArrayNetwork;
            int i2 = this.WinterFlowVariableVersionControl;
            winterFlowSyntaxEvent.getClass();
            WinterFlowThreadPoolSubsystem winterFlowThreadPoolSubsystem = new WinterFlowThreadPoolSubsystem(winterFlowSyntaxEvent, readInt, readStrongBinder, bundle);
            WinterFlowVariableNetwork winterFlowVariableNetwork = winterFlowSyntaxEvent.WinterFlowVariableVersionControl;
            winterFlowVariableNetwork.sendMessage(winterFlowVariableNetwork.obtainMessage(1, i2, -1, winterFlowThreadPoolSubsystem));
            this.WinterFlowArrayNetwork = null;
        } else if (i == 2) {
            parcel.readInt();
            WinterFlowRouterScheduler.WinterFlowHookDataSource(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            WinterFlowListenerEvent winterFlowListenerEvent = (WinterFlowListenerEvent) WinterFlowRouterScheduler.WinterFlowRouterStructure(parcel, WinterFlowListenerEvent.CREATOR);
            WinterFlowRouterScheduler.WinterFlowHookDataSource(parcel);
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowArrayNetwork;
            WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(winterFlowSyntaxEvent2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(winterFlowListenerEvent);
            winterFlowSyntaxEvent2.WinterFlowSerializerStructure = winterFlowListenerEvent;
            if (winterFlowSyntaxEvent2 instanceof WinterFlowDeserializationDebug) {
                WinterFlowVariableEngine winterFlowVariableEngine = winterFlowListenerEvent.WinterFlowRouterRouter;
                WinterFlowJSONDecorator WinterFlowRouterRouter = WinterFlowJSONDecorator.WinterFlowRouterRouter();
                WinterFlowQueryScript winterFlowQueryScript = winterFlowVariableEngine == null ? null : winterFlowVariableEngine.WinterFlowVariableVersionControl;
                synchronized (WinterFlowRouterRouter) {
                    if (winterFlowQueryScript == null) {
                        winterFlowQueryScript = WinterFlowJSONDecorator.WinterFlowRouterRouter;
                    } else {
                        WinterFlowQueryScript winterFlowQueryScript2 = (WinterFlowQueryScript) WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy;
                        if (winterFlowQueryScript2 != null) {
                            if (winterFlowQueryScript2.WinterFlowVariableVersionControl < winterFlowQueryScript.WinterFlowVariableVersionControl) {
                            }
                        }
                    }
                    WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy = winterFlowQueryScript;
                }
            }
            Bundle bundle2 = winterFlowListenerEvent.WinterFlowVariableVersionControl;
            WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(this.WinterFlowArrayNetwork, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.WinterFlowSyntaxEvent winterFlowSyntaxEvent3 = this.WinterFlowArrayNetwork;
            int i3 = this.WinterFlowVariableVersionControl;
            winterFlowSyntaxEvent3.getClass();
            WinterFlowThreadPoolSubsystem winterFlowThreadPoolSubsystem2 = new WinterFlowThreadPoolSubsystem(winterFlowSyntaxEvent3, readInt2, readStrongBinder2, bundle2);
            WinterFlowVariableNetwork winterFlowVariableNetwork2 = winterFlowSyntaxEvent3.WinterFlowVariableVersionControl;
            winterFlowVariableNetwork2.sendMessage(winterFlowVariableNetwork2.obtainMessage(1, i3, -1, winterFlowThreadPoolSubsystem2));
            this.WinterFlowArrayNetwork = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
