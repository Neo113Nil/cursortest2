package com.google.android.datatransport;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderObject extends Binder implements IInterface {
    public final /* synthetic */ WinterFlowArrayEngine WinterFlowCacheManagerAgent;

    public WinterFlowServiceProviderObject(WinterFlowConsumerStrategy winterFlowConsumerStrategy, WinterFlowArrayEngine winterFlowArrayEngine) {
        this.WinterFlowCacheManagerAgent = winterFlowArrayEngine;
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = WinterFlowParserDatabaseSchema.WinterFlowRouterStructure;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        String readString = parcel.readString();
        WinterFlowEventProtocol createFromParcel2 = parcel.readInt() != 0 ? WinterFlowEventProtocol.CREATOR.createFromParcel(parcel) : null;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
            sb.append("Parcel data not fully consumed, unread size: ");
            sb.append(dataAvail);
            throw new BadParcelableException(sb.toString());
        }
        int i4 = createFromParcel.WinterFlowVariableVersionControl;
        WinterFlowArrayEngine winterFlowArrayEngine = this.WinterFlowCacheManagerAgent;
        if (i4 <= 0) {
            winterFlowArrayEngine.WinterFlowRouterStructure(readString);
            return true;
        }
        winterFlowArrayEngine.WinterFlowRouterStructure.WinterFlowResponseEngine(createFromParcel.WinterFlowUnitTestResponse != null ? new WinterFlowNetworkInterface(createFromParcel) : new WinterFlowInheritanceOrchestration(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
