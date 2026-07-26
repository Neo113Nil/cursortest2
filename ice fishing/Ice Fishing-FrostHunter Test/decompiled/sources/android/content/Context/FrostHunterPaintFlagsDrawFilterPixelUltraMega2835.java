package android.content.Context;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintFlagsDrawFilterPixelUltraMega2835 implements Comparator, Parcelable {
    public static final Parcelable.Creator<FrostHunterPaintFlagsDrawFilterPixelUltraMega2835> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(1);
    public final String FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterPackageManagerPixelElite7258[] FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public final int FrostHunterKeyframeGammaGamma1197;

    public FrostHunterPaintFlagsDrawFilterPixelUltraMega2835(Parcel parcel) {
        this.FrostHunterAlertDialogAuroraDelta3200 = parcel.readString();
        FrostHunterPackageManagerPixelElite7258[] frostHunterPackageManagerPixelElite7258Arr = (FrostHunterPackageManagerPixelElite7258[]) parcel.createTypedArray(FrostHunterPackageManagerPixelElite7258.CREATOR);
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterPackageManagerPixelElite7258Arr;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterPackageManagerPixelElite7258Arr.length;
    }

    public final FrostHunterPaintFlagsDrawFilterPixelUltraMega2835 FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        return Objects.equals(this.FrostHunterAlertDialogAuroraDelta3200, str) ? this : new FrostHunterPaintFlagsDrawFilterPixelUltraMega2835(str, false, this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        FrostHunterPackageManagerPixelElite7258 frostHunterPackageManagerPixelElite7258 = (FrostHunterPackageManagerPixelElite7258) obj;
        FrostHunterPackageManagerPixelElite7258 frostHunterPackageManagerPixelElite72582 = (FrostHunterPackageManagerPixelElite7258) obj2;
        UUID uuid = FrostHunterContentObserverAuroraStormCosmos7148.FrostHunterAlphaAnimationNeoCosmos5761;
        return uuid.equals(frostHunterPackageManagerPixelElite7258.FrostHunterFlowMaxDragonHero5809) ? uuid.equals(frostHunterPackageManagerPixelElite72582.FrostHunterFlowMaxDragonHero5809) ? 0 : 1 : frostHunterPackageManagerPixelElite7258.FrostHunterFlowMaxDragonHero5809.compareTo(frostHunterPackageManagerPixelElite72582.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterPaintFlagsDrawFilterPixelUltraMega2835.class == obj.getClass()) {
            FrostHunterPaintFlagsDrawFilterPixelUltraMega2835 frostHunterPaintFlagsDrawFilterPixelUltraMega2835 = (FrostHunterPaintFlagsDrawFilterPixelUltraMega2835) obj;
            if (Objects.equals(this.FrostHunterAlertDialogAuroraDelta3200, frostHunterPaintFlagsDrawFilterPixelUltraMega2835.FrostHunterAlertDialogAuroraDelta3200) && Arrays.equals(this.FrostHunterCameraXPixelTurboCosmos9814, frostHunterPaintFlagsDrawFilterPixelUltraMega2835.FrostHunterCameraXPixelTurboCosmos9814)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.FrostHunterFlowMaxDragonHero5809 == 0) {
            String str = this.FrostHunterAlertDialogAuroraDelta3200;
            this.FrostHunterFlowMaxDragonHero5809 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.FrostHunterCameraXPixelTurboCosmos9814);
        }
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.FrostHunterAlertDialogAuroraDelta3200);
        parcel.writeTypedArray(this.FrostHunterCameraXPixelTurboCosmos9814, 0);
    }

    public FrostHunterPaintFlagsDrawFilterPixelUltraMega2835(String str, boolean z, FrostHunterPackageManagerPixelElite7258... frostHunterPackageManagerPixelElite7258Arr) {
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
        frostHunterPackageManagerPixelElite7258Arr = z ? (FrostHunterPackageManagerPixelElite7258[]) frostHunterPackageManagerPixelElite7258Arr.clone() : frostHunterPackageManagerPixelElite7258Arr;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterPackageManagerPixelElite7258Arr;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterPackageManagerPixelElite7258Arr.length;
        Arrays.sort(frostHunterPackageManagerPixelElite7258Arr, this);
    }
}
