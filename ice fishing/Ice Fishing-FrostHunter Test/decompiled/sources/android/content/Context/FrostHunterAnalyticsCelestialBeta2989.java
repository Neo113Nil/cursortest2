package android.content.Context;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnalyticsCelestialBeta2989 implements Parcelable {
    public static final Parcelable.Creator<FrostHunterAnalyticsCelestialBeta2989> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(21);
    public final Messenger FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterAnalyticsCelestialBeta2989(IBinder iBinder) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = new Messenger(iBinder);
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
            Messenger messenger = this.FrostHunterCameraXPixelTurboCosmos9814;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((FrostHunterAnalyticsCelestialBeta2989) obj).FrostHunterCameraXPixelTurboCosmos9814;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.FrostHunterCameraXPixelTurboCosmos9814;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.FrostHunterCameraXPixelTurboCosmos9814;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
