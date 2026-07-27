package android.content.Context;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterImageCaptureNebulaSpeed2968 implements IInterface {
    public final IBinder FrostHunterBundlePulseFusionHero2475;

    public FrostHunterImageCaptureNebulaSpeed2968(IBinder iBinder) {
        this.FrostHunterBundlePulseFusionHero2475 = iBinder;
    }

    public final String FrostHunterAlphaAnimationNeoCosmos5761() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.FrostHunterBundlePulseFusionHero2475.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.FrostHunterBundlePulseFusionHero2475.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            boolean z = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return Boolean.valueOf(!z);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }
}
