package kotlin.text;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishDaggerGraphQL implements Parcelable {
    public static final Parcelable.Creator<CatchingFishDaggerGraphQL> CREATOR = new CatchingFishRoomKtorToast(2);
    public final Messenger CatchingFishReduxKtor;

    public CatchingFishDaggerGraphQL(IBinder iBinder) {
        this.CatchingFishReduxKtor = new Messenger(iBinder);
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
            Messenger messenger = this.CatchingFishReduxKtor;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((CatchingFishDaggerGraphQL) obj).CatchingFishReduxKtor;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.CatchingFishReduxKtor;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.CatchingFishReduxKtor;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
