package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FrostBridgeCryptographyDependencyVVn97wRPScg88HCG8H82290394467291 implements Parcelable {
    public static final Parcelable.Creator<FrostBridgeCryptographyDependencyVVn97wRPScg88HCG8H82290394467291> CREATOR = new EmeraldStackCoordinatorFrameworkMcmhq9zBRhabvCqI6L54429333500827(20);
    public final Messenger RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public FrostBridgeCryptographyDependencyVVn97wRPScg88HCG8H82290394467291(IBinder iBinder) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new Messenger(iBinder);
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
            Messenger messenger = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((FrostBridgeCryptographyDependencyVVn97wRPScg88HCG8H82290394467291) obj).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
