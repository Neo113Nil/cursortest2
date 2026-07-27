package android.content.Context;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentProviderOmegaGammaStorm3382 extends FrostHunterGradlePluginNovaThunderFusion2972 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterKeyframeGammaGamma1197;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Parcel FrostHunterLifecycleBlazeGammaElite2889;
    public final int FrostHunterRemoteConfigSpeedSpeed8566;
    public final SparseIntArray FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterContentProviderOmegaGammaStorm3382(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new FrostHunterViewPager2SpectraForceVortex4544(0), new FrostHunterViewPager2SpectraForceVortex4544(0), new FrostHunterViewPager2SpectraForceVortex4544(0));
    }

    @Override // android.content.Context.FrostHunterGradlePluginNovaThunderFusion2972
    public final FrostHunterContentProviderOmegaGammaStorm3382 FrostHunterAlphaAnimationNeoCosmos5761() {
        Parcel parcel = this.FrostHunterLifecycleBlazeGammaElite2889;
        int dataPosition = parcel.dataPosition();
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i == this.FrostHunterLevelListDrawableFusionDragonHero2232) {
            i = this.FrostHunterRemoteConfigSpeedSpeed8566;
        }
        return new FrostHunterContentProviderOmegaGammaStorm3382(parcel, dataPosition, i, FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), this.FrostHunterCameraXPixelTurboCosmos9814, "  "), this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
    }

    @Override // android.content.Context.FrostHunterGradlePluginNovaThunderFusion2972
    public final void FrostHunterCameraXPixelTurboCosmos9814(int i) {
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        SparseIntArray sparseIntArray = this.FrostHunterServiceEliteCelestialThunder1757;
        Parcel parcel = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.FrostHunterFlowMaxDragonHero5809 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // android.content.Context.FrostHunterGradlePluginNovaThunderFusion2972
    public final boolean FrostHunterLifecycleBlazeGammaElite2889(int i) {
        while (true) {
            int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
            int i3 = this.FrostHunterKeyframeGammaGamma1197;
            if (i2 >= this.FrostHunterRemoteConfigSpeedSpeed8566) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.FrostHunterAlertDialogAuroraDelta3200;
            Parcel parcel = this.FrostHunterLifecycleBlazeGammaElite2889;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.FrostHunterKeyframeGammaGamma1197 = parcel.readInt();
            this.FrostHunterAlertDialogAuroraDelta3200 += readInt;
        }
    }

    public FrostHunterContentProviderOmegaGammaStorm3382(Parcel parcel, int i, int i2, String str, FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544, FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex45442, FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex45443) {
        super(frostHunterViewPager2SpectraForceVortex4544, frostHunterViewPager2SpectraForceVortex45442, frostHunterViewPager2SpectraForceVortex45443);
        this.FrostHunterServiceEliteCelestialThunder1757 = new SparseIntArray();
        this.FrostHunterFlowMaxDragonHero5809 = -1;
        this.FrostHunterKeyframeGammaGamma1197 = -1;
        this.FrostHunterLifecycleBlazeGammaElite2889 = parcel;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = i2;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterCameraXPixelTurboCosmos9814 = str;
    }
}
