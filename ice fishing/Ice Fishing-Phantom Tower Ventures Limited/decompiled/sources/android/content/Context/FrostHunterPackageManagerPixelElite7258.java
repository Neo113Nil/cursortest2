package android.content.Context;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPackageManagerPixelElite7258 implements Parcelable {
    public static final Parcelable.Creator<FrostHunterPackageManagerPixelElite7258> CREATOR = new FrostHunterOnPreDrawListenerFusionGammaOmega7733(2);
    public final String FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public final UUID FrostHunterFlowMaxDragonHero5809;
    public final byte[] FrostHunterFragmentBetaMegaVortex6025;
    public final String FrostHunterKeyframeGammaGamma1197;

    public FrostHunterPackageManagerPixelElite7258(Parcel parcel) {
        this.FrostHunterFlowMaxDragonHero5809 = new UUID(parcel.readLong(), parcel.readLong());
        this.FrostHunterAlertDialogAuroraDelta3200 = parcel.readString();
        String readString = parcel.readString();
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterKeyframeGammaGamma1197 = readString;
        this.FrostHunterFragmentBetaMegaVortex6025 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterPackageManagerPixelElite7258)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        FrostHunterPackageManagerPixelElite7258 frostHunterPackageManagerPixelElite7258 = (FrostHunterPackageManagerPixelElite7258) obj;
        return Objects.equals(this.FrostHunterAlertDialogAuroraDelta3200, frostHunterPackageManagerPixelElite7258.FrostHunterAlertDialogAuroraDelta3200) && Objects.equals(this.FrostHunterKeyframeGammaGamma1197, frostHunterPackageManagerPixelElite7258.FrostHunterKeyframeGammaGamma1197) && Objects.equals(this.FrostHunterFlowMaxDragonHero5809, frostHunterPackageManagerPixelElite7258.FrostHunterFlowMaxDragonHero5809) && Arrays.equals(this.FrostHunterFragmentBetaMegaVortex6025, frostHunterPackageManagerPixelElite7258.FrostHunterFragmentBetaMegaVortex6025);
    }

    public final int hashCode() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == 0) {
            int hashCode = this.FrostHunterFlowMaxDragonHero5809.hashCode() * 31;
            String str = this.FrostHunterAlertDialogAuroraDelta3200;
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.hashCode(this.FrostHunterFragmentBetaMegaVortex6025) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterKeyframeGammaGamma1197, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.FrostHunterFlowMaxDragonHero5809;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.FrostHunterAlertDialogAuroraDelta3200);
        parcel.writeString(this.FrostHunterKeyframeGammaGamma1197);
        parcel.writeByteArray(this.FrostHunterFragmentBetaMegaVortex6025);
    }

    public FrostHunterPackageManagerPixelElite7258(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = uuid;
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
        str2.getClass();
        this.FrostHunterKeyframeGammaGamma1197 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197(str2);
        this.FrostHunterFragmentBetaMegaVortex6025 = bArr;
    }
}
