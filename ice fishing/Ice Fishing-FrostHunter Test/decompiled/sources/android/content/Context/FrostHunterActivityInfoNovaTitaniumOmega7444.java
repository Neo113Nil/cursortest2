package android.content.Context;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActivityInfoNovaTitaniumOmega7444 implements FrostHunterPagingInfernoNova1945 {
    public IBinder FrostHunterBundlePulseFusionHero2475;

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterRoomDatabasePhantomSpark4438 frostHunterRoomDatabasePhantomSpark4438, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(FrostHunterPagingInfernoNova1945.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            obtain.writeStrongInterface(frostHunterRoomDatabasePhantomSpark4438);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            obtain.writeInt(-1);
            if (!this.FrostHunterBundlePulseFusionHero2475.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method mayLaunchUrl is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean FrostHunterBundlePulseFusionHero2475() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(FrostHunterPagingInfernoNova1945.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            obtain.writeLong(0L);
            if (!this.FrostHunterBundlePulseFusionHero2475.transact(2, obtain, obtain2, 0)) {
                throw new RemoteException("Method warmup is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterRoomDatabasePhantomSpark4438 frostHunterRoomDatabasePhantomSpark4438) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(FrostHunterPagingInfernoNova1945.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            obtain.writeStrongInterface(frostHunterRoomDatabasePhantomSpark4438);
            if (!this.FrostHunterBundlePulseFusionHero2475.transact(3, obtain, obtain2, 0)) {
                throw new RemoteException("Method newSession is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }
}
