package android.content.Context;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAlphaAnimationInfernoElite6382 implements IInterface {
    public final IBinder FrostHunterBundlePulseFusionHero2475;

    public FrostHunterAlphaAnimationInfernoElite6382(IBinder iBinder) {
        this.FrostHunterBundlePulseFusionHero2475 = iBinder;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterRoomEliteLegendAurora5699 frostHunterRoomEliteLegendAurora5699, FrostHunterSupervisorJobNeoShadow8390 frostHunterSupervisorJobNeoShadow8390) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(frostHunterRoomEliteLegendAurora5699);
            obtain.writeInt(1);
            FrostHunterOnPreDrawListenerFusionGammaOmega7733.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSupervisorJobNeoShadow8390, obtain, 0);
            this.FrostHunterBundlePulseFusionHero2475.transact(46, obtain, obtain2, 0);
            obtain2.readException();
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
