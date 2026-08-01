package com.google.android.datatransport;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkUtility extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowFrameworkUtility> CREATOR = new WinterFlowStackFramework(16);
    public final boolean WinterFlowRouterRouter;
    public final boolean WinterFlowSyntax;
    public final IBinder WinterFlowTransactionManagerStrategy;
    public final ConnectionResult WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowFrameworkUtility(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = iBinder;
        this.WinterFlowUnitTestResponse = connectionResult;
        this.WinterFlowRouterRouter = z;
        this.WinterFlowSyntax = z2;
    }

    public final boolean equals(Object obj) {
        Object winterFlowBandwidthComponent;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowFrameworkUtility)) {
            return false;
        }
        WinterFlowFrameworkUtility winterFlowFrameworkUtility = (WinterFlowFrameworkUtility) obj;
        if (!this.WinterFlowUnitTestResponse.equals(winterFlowFrameworkUtility.WinterFlowUnitTestResponse)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.WinterFlowTransactionManagerStrategy;
        if (iBinder == null) {
            winterFlowBandwidthComponent = null;
        } else {
            int i = WinterFlowJavaFrontend.WinterFlowArrayNetwork;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            winterFlowBandwidthComponent = queryLocalInterface instanceof WinterFlowBandwidthRefactoring ? (WinterFlowBandwidthRefactoring) queryLocalInterface : new WinterFlowBandwidthComponent(iBinder);
        }
        IBinder iBinder2 = winterFlowFrameworkUtility.WinterFlowTransactionManagerStrategy;
        if (iBinder2 != null) {
            int i2 = WinterFlowJavaFrontend.WinterFlowArrayNetwork;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof WinterFlowBandwidthRefactoring ? (WinterFlowBandwidthRefactoring) queryLocalInterface2 : new WinterFlowBandwidthComponent(iBinder2);
        }
        return WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(winterFlowBandwidthComponent, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        IBinder iBinder = this.WinterFlowTransactionManagerStrategy;
        if (iBinder != null) {
            int WinterFlowConsumerUserManager2 = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager2);
        }
        WinterFlowWorkerVersionControl.WinterFlowBatchUI(parcel, 3, this.WinterFlowUnitTestResponse, i);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 4, 4);
        parcel.writeInt(this.WinterFlowRouterRouter ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 5, 4);
        parcel.writeInt(this.WinterFlowSyntax ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
