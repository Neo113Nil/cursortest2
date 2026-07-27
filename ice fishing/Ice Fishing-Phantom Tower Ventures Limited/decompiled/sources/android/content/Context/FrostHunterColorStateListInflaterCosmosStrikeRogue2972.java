package android.content.Context;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorStateListInflaterCosmosStrikeRogue2972 implements FrostHunterLayerMegaVortex2210, IInterface {
    public final IBinder FrostHunterBundlePulseFusionHero2475;

    public FrostHunterColorStateListInflaterCosmosStrikeRogue2972(IBinder iBinder) {
        this.FrostHunterBundlePulseFusionHero2475 = iBinder;
    }

    public final Bundle FrostHunterAlphaAnimationNeoCosmos5761(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = FrostHunterAudioManagerAuroraNebula6282.FrostHunterAlphaAnimationNeoCosmos5761;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.FrostHunterBundlePulseFusionHero2475.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }
}
