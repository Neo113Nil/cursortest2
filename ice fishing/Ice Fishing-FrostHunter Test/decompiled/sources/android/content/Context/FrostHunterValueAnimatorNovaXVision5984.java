package android.content.Context;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterValueAnimatorNovaXVision5984 extends Binder implements IInterface {
    public final /* synthetic */ int FrostHunterBundlePulseFusionHero2475 = 0;

    public FrostHunterValueAnimatorNovaXVision5984(String str) {
        attachInterface(this, str);
    }

    public boolean FrostHunterServiceEliteCelestialThunder1757(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.FrostHunterBundlePulseFusionHero2475;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.FrostHunterBundlePulseFusionHero2475) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                FrostHunterDatabaseNebulaSpectraNebula7977 frostHunterDatabaseNebulaSpectraNebula7977 = (FrostHunterDatabaseNebulaSpectraNebula7977) this;
                switch (i) {
                    case 3:
                        FrostHunterChipGroupLegendShadowEpic4100.FrostHunterConstraintSetCloneMasterUltraRogue2633(parcel);
                        break;
                    case 4:
                        FrostHunterChipGroupLegendShadowEpic4100.FrostHunterConstraintSetCloneMasterUltraRogue2633(parcel);
                        break;
                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                        FrostHunterChipGroupLegendShadowEpic4100.FrostHunterConstraintSetCloneMasterUltraRogue2633(parcel);
                        break;
                    case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                        FrostHunterChipGroupLegendShadowEpic4100.FrostHunterConstraintSetCloneMasterUltraRogue2633(parcel);
                        break;
                    case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                        FrostHunterFlingGestureShadowMegaHyperion8241 frostHunterFlingGestureShadowMegaHyperion8241 = (FrostHunterFlingGestureShadowMegaHyperion8241) FrostHunterChipGroupLegendShadowEpic4100.FrostHunterAlphaAnimationNeoCosmos5761(parcel, FrostHunterFlingGestureShadowMegaHyperion8241.CREATOR);
                        FrostHunterChipGroupLegendShadowEpic4100.FrostHunterConstraintSetCloneMasterUltraRogue2633(parcel);
                        frostHunterDatabaseNebulaSpectraNebula7977.FrostHunterLifecycleBlazeGammaElite2889.post(new FrostHunterActivityRogueFusionRogue5543(26, frostHunterDatabaseNebulaSpectraNebula7977, frostHunterFlingGestureShadowMegaHyperion8241));
                        break;
                    case 9:
                        FrostHunterChipGroupLegendShadowEpic4100.FrostHunterConstraintSetCloneMasterUltraRogue2633(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return FrostHunterServiceEliteCelestialThunder1757(i, parcel, parcel2);
        }
    }

    public /* synthetic */ FrostHunterValueAnimatorNovaXVision5984() {
    }
}
