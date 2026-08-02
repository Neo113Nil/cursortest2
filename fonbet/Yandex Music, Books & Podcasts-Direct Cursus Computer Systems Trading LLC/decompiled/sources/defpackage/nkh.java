package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class nkh extends Binder implements y8e {
    public final WeakReference a;

    public nkh(xph xphVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(xphVar);
    }

    @Override // defpackage.y8e
    public final void H0(PlaybackStateCompat playbackStateCompat) {
        xph xphVar = (xph) this.a.get();
        if (xphVar != null) {
            xphVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) yd5.m(parcel, Bundle.CREATOR);
                xph xphVar = (xph) this.a.get();
                if (xphVar != null) {
                    xphVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                wvs.b();
                return false;
            case 3:
                H0((PlaybackStateCompat) yd5.m(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                wvs.b();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                wvs.b();
                return false;
            case 6:
                wvs.b();
                return false;
            case 7:
                wvs.b();
                return false;
            case 8:
                wvs.b();
                return false;
            case 9:
                int readInt = parcel.readInt();
                xph xphVar2 = (xph) this.a.get();
                if (xphVar2 != null) {
                    xphVar2.e(9, Integer.valueOf(readInt), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                xph xphVar3 = (xph) this.a.get();
                if (xphVar3 != null) {
                    xphVar3.e(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int readInt2 = parcel.readInt();
                xph xphVar4 = (xph) this.a.get();
                if (xphVar4 != null) {
                    xphVar4.e(12, Integer.valueOf(readInt2), null);
                }
                return true;
            case 13:
                xph xphVar5 = (xph) this.a.get();
                if (xphVar5 != null) {
                    xphVar5.e(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
