package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerGateway implements Parcelable {
    public static final Parcelable.Creator<WinterFlowControllerGateway> CREATOR = new WinterFlowStackFramework(2);
    public final int WinterFlowVariableVersionControl;

    public WinterFlowControllerGateway(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowControllerGateway) && this.WinterFlowVariableVersionControl == ((WinterFlowControllerGateway) obj).WinterFlowVariableVersionControl;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowVariableVersionControl);
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowServerProtocol(new StringBuilder("DefaultLazyKey(index="), this.WinterFlowVariableVersionControl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.WinterFlowVariableVersionControl);
    }
}
