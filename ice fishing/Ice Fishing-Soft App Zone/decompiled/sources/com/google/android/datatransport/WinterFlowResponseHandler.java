package com.google.android.datatransport;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseHandler implements Parcelable {
    public static final Parcelable.Creator<WinterFlowResponseHandler> CREATOR = new WinterFlowStackFramework(21);
    public final Messenger WinterFlowVariableVersionControl;

    public WinterFlowResponseHandler(IBinder iBinder) {
        this.WinterFlowVariableVersionControl = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.WinterFlowVariableVersionControl.getBinder().equals(((WinterFlowResponseHandler) obj).WinterFlowVariableVersionControl.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.WinterFlowVariableVersionControl.getBinder());
    }
}
