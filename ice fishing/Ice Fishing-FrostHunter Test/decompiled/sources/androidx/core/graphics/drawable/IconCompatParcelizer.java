package androidx.core.graphics.drawable;

import android.content.Context.FrostHunterContentProviderOmegaGammaStorm3382;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterGradlePluginNovaThunderFusion2972;
import android.content.Context.FrostHunterRemoteModelManagerCyberLegend2797;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(FrostHunterGradlePluginNovaThunderFusion2972 frostHunterGradlePluginNovaThunderFusion2972) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.FrostHunterAlphaAnimationNeoCosmos5761 = -1;
        iconCompat.FrostHunterBundlePulseFusionHero2475 = null;
        iconCompat.FrostHunterServiceEliteCelestialThunder1757 = null;
        iconCompat.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
        iconCompat.FrostHunterRemoteConfigSpeedSpeed8566 = null;
        iconCompat.FrostHunterCameraXPixelTurboCosmos9814 = IconCompat.FrostHunterKeyframeGammaGamma1197;
        iconCompat.FrostHunterFlowMaxDragonHero5809 = null;
        iconCompat.FrostHunterAlphaAnimationNeoCosmos5761 = !frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(1) ? -1 : ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readInt();
        byte[] bArr = iconCompat.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(2)) {
            Parcel parcel = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.FrostHunterBundlePulseFusionHero2475 = bArr;
        iconCompat.FrostHunterServiceEliteCelestialThunder1757 = frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLevelListDrawableFusionDragonHero2232(iconCompat.FrostHunterServiceEliteCelestialThunder1757, 3);
        int i = iconCompat.FrostHunterLifecycleBlazeGammaElite2889;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(4)) {
            i = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readInt();
        }
        iconCompat.FrostHunterLifecycleBlazeGammaElite2889 = i;
        int i2 = iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(5)) {
            i2 = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readInt();
        }
        iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232 = i2;
        iconCompat.FrostHunterRemoteConfigSpeedSpeed8566 = (ColorStateList) frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLevelListDrawableFusionDragonHero2232(iconCompat.FrostHunterRemoteConfigSpeedSpeed8566, 6);
        String str = iconCompat.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(7)) {
            str = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readString();
        }
        iconCompat.FrostHunterFlowMaxDragonHero5809 = str;
        String str2 = iconCompat.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(8)) {
            str2 = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readString();
        }
        iconCompat.FrostHunterAlertDialogAuroraDelta3200 = str2;
        iconCompat.FrostHunterCameraXPixelTurboCosmos9814 = PorterDuff.Mode.valueOf(iconCompat.FrostHunterFlowMaxDragonHero5809);
        switch (iconCompat.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.FrostHunterServiceEliteCelestialThunder1757;
                if (parcelable != null) {
                    iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = parcelable;
                    return iconCompat;
                }
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Invalid icon");
                return null;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.FrostHunterServiceEliteCelestialThunder1757;
                if (parcelable2 != null) {
                    iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.FrostHunterBundlePulseFusionHero2475;
                iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr3;
                iconCompat.FrostHunterAlphaAnimationNeoCosmos5761 = 3;
                iconCompat.FrostHunterLifecycleBlazeGammaElite2889 = 0;
                iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.FrostHunterBundlePulseFusionHero2475, Charset.forName("UTF-16"));
                iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str3;
                if (iconCompat.FrostHunterAlphaAnimationNeoCosmos5761 == 2 && iconCompat.FrostHunterAlertDialogAuroraDelta3200 == null) {
                    iconCompat.FrostHunterAlertDialogAuroraDelta3200 = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iconCompat.FrostHunterBundlePulseFusionHero2475;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, FrostHunterGradlePluginNovaThunderFusion2972 frostHunterGradlePluginNovaThunderFusion2972) {
        frostHunterGradlePluginNovaThunderFusion2972.getClass();
        iconCompat.FrostHunterFlowMaxDragonHero5809 = iconCompat.FrostHunterCameraXPixelTurboCosmos9814.name();
        switch (iconCompat.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.FrostHunterServiceEliteCelestialThunder1757 = (Parcelable) iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                break;
            case 1:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.FrostHunterServiceEliteCelestialThunder1757 = (Parcelable) iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                break;
            case 2:
                iconCompat.FrostHunterBundlePulseFusionHero2475 = ((String) iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.FrostHunterBundlePulseFusionHero2475 = (byte[]) iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                break;
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.FrostHunterBundlePulseFusionHero2475 = iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.FrostHunterAlphaAnimationNeoCosmos5761;
        if (-1 != i) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(1);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeInt(i);
        }
        byte[] bArr = iconCompat.FrostHunterBundlePulseFusionHero2475;
        if (bArr != null) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(2);
            Parcel parcel = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.FrostHunterServiceEliteCelestialThunder1757;
        if (parcelable != null) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(3);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.FrostHunterLifecycleBlazeGammaElite2889;
        if (i2 != 0) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(4);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeInt(i2);
        }
        int i3 = iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (i3 != 0) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(5);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.FrostHunterRemoteConfigSpeedSpeed8566;
        if (colorStateList != null) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(6);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.FrostHunterFlowMaxDragonHero5809;
        if (str != null) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(7);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeString(str);
        }
        String str2 = iconCompat.FrostHunterAlertDialogAuroraDelta3200;
        if (str2 != null) {
            frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(8);
            ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.writeString(str2);
        }
    }
}
