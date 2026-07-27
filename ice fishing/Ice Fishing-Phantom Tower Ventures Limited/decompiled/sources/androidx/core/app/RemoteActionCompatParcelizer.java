package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context.FrostHunterContentProviderOmegaGammaStorm3382;
import android.content.Context.FrostHunterGradlePluginNovaThunderFusion2972;
import android.content.Context.FrostHunterScaleDrawableHyperOmegaAlpha6108;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(FrostHunterGradlePluginNovaThunderFusion2972 frostHunterGradlePluginNovaThunderFusion2972) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        FrostHunterScaleDrawableHyperOmegaAlpha6108 frostHunterScaleDrawableHyperOmegaAlpha6108 = remoteActionCompat.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z = true;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(1)) {
            frostHunterScaleDrawableHyperOmegaAlpha6108 = frostHunterGradlePluginNovaThunderFusion2972.FrostHunterRemoteConfigSpeedSpeed8566();
        }
        remoteActionCompat.FrostHunterAlphaAnimationNeoCosmos5761 = (IconCompat) frostHunterScaleDrawableHyperOmegaAlpha6108;
        CharSequence charSequence = remoteActionCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889);
        }
        remoteActionCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889);
        }
        remoteActionCompat.FrostHunterBundlePulseFusionHero2475 = charSequence2;
        remoteActionCompat.FrostHunterServiceEliteCelestialThunder1757 = (PendingIntent) frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLevelListDrawableFusionDragonHero2232(remoteActionCompat.FrostHunterServiceEliteCelestialThunder1757, 4);
        boolean z2 = remoteActionCompat.FrostHunterLifecycleBlazeGammaElite2889;
        if (frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(5)) {
            z2 = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readInt() != 0;
        }
        remoteActionCompat.FrostHunterLifecycleBlazeGammaElite2889 = z2;
        boolean z3 = remoteActionCompat.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (!frostHunterGradlePluginNovaThunderFusion2972.FrostHunterLifecycleBlazeGammaElite2889(6)) {
            z = z3;
        } else if (((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.FrostHunterLevelListDrawableFusionDragonHero2232 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, FrostHunterGradlePluginNovaThunderFusion2972 frostHunterGradlePluginNovaThunderFusion2972) {
        frostHunterGradlePluginNovaThunderFusion2972.getClass();
        IconCompat iconCompat = remoteActionCompat.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(1);
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterFlowMaxDragonHero5809(iconCompat);
        CharSequence charSequence = remoteActionCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(2);
        Parcel parcel = ((FrostHunterContentProviderOmegaGammaStorm3382) frostHunterGradlePluginNovaThunderFusion2972).FrostHunterLifecycleBlazeGammaElite2889;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.FrostHunterBundlePulseFusionHero2475;
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.FrostHunterServiceEliteCelestialThunder1757;
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.FrostHunterLevelListDrawableFusionDragonHero2232;
        frostHunterGradlePluginNovaThunderFusion2972.FrostHunterCameraXPixelTurboCosmos9814(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
