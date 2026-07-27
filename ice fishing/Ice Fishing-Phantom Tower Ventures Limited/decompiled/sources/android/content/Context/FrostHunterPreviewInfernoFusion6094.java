package android.content.Context;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPreviewInfernoFusion6094 implements FrostHunterFlowBlazeVision5301, IInterface {
    public final IBinder FrostHunterBundlePulseFusionHero2475;

    public FrostHunterPreviewInfernoFusion6094(IBinder iBinder) {
        this.FrostHunterBundlePulseFusionHero2475 = iBinder;
    }

    public final Account FrostHunterAlphaAnimationNeoCosmos5761() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.FrostHunterBundlePulseFusionHero2475.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) FrostHunterJobSchedulerOlympianBlazePrime3747.FrostHunterAlphaAnimationNeoCosmos5761(obtain, Account.CREATOR);
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
