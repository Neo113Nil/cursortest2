package android.content.Context;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomDatabasePhantomSpark4438 extends Binder implements FrostHunterViewPhantomRogue9898 {
    public final Handler FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ FrostHunterSQLiteMasterUltra9956 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterRoomDatabasePhantomSpark4438(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterSQLiteMasterUltra9956;
        attachInterface(this, FrostHunterViewPhantomRogue9898.FrostHunterAlphaAnimationNeoCosmos5761);
        this.FrostHunterBundlePulseFusionHero2475 = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = FrostHunterViewPhantomRogue9898.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        int i4 = 0;
        Handler handler = this.FrostHunterBundlePulseFusionHero2475;
        switch (i) {
            case 2:
                handler.post(new FrostHunterAsyncTaskSpeedEpicEclipse3542(parcel.readInt(), this, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 3:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(this, parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), i3));
                break;
            case 4:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(2, this, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(this, parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), 3));
                parcel2.writeNoException();
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(this, parcel.readInt(), (Uri) parcel.readTypedObject(Uri.CREATOR), parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeTypedObject(null, 1);
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(this, parcel.readInt(), parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 9:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(6, this, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 10:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(this, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 11:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(8, this, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
            case 12:
                handler.post(new FrostHunterOnTouchListenerSpeedDragon7681(i4, this, (Bundle) parcel.readTypedObject(Bundle.CREATOR)));
                break;
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
