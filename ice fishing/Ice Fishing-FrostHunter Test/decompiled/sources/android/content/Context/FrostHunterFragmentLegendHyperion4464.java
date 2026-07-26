package android.content.Context;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFragmentLegendHyperion4464 extends FrostHunterFlipAnimationDragonTurbo1196 {
    public static final Object FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Object();
    public static final FrostHunterFragmentLegendHyperion4464 FrostHunterBundlePulseFusionHero2475 = new FrostHunterFragmentLegendHyperion4464();

    public static void FrostHunterLifecycleBlazeGammaElite2889(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                throw null;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        FrostHunterViewBindingCosmosTurbo6117 frostHunterViewBindingCosmosTurbo6117 = new FrostHunterViewBindingCosmosTurbo6117();
        FrostHunterCardViewHyperionAurora3829.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        frostHunterViewBindingCosmosTurbo6117.FrostHunterCameraXPixelTurboCosmos9814 = alertDialog;
        if (onCancelListener != null) {
            frostHunterViewBindingCosmosTurbo6117.FrostHunterFlowMaxDragonHero5809 = onCancelListener;
        }
        frostHunterViewBindingCosmosTurbo6117.show(fragmentManager, str);
    }

    public static AlertDialog FrostHunterServiceEliteCelestialThunder1757(Activity activity, int i, FrostHunterRemoteConfigHyperionThunderDragon4003 frostHunterRemoteConfigHyperionThunderDragon4003, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterConstraintSetCloneMasterUltraRogue2633(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_google_play_services_enable_button) : resources.getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_google_play_services_update_button) : resources.getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, frostHunterRemoteConfigHyperionThunderDragon4003);
        }
        String FrostHunterBundlePulseFusionHero24752 = FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterBundlePulseFusionHero2475(activity, i);
        if (FrostHunterBundlePulseFusionHero24752 != null) {
            builder.setTitle(FrostHunterBundlePulseFusionHero24752);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public final void FrostHunterBundlePulseFusionHero2475(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(googleApiActivity, i, new FrostHunterObserverTitanInferno8633(super.FrostHunterAlphaAnimationNeoCosmos5761(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (FrostHunterServiceEliteCelestialThunder1757 == null) {
            return;
        }
        FrostHunterLifecycleBlazeGammaElite2889(googleApiActivity, FrostHunterServiceEliteCelestialThunder1757, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        new IllegalArgumentException();
        if (i == 18) {
            new FrostHunterMotionLayoutNovaXSpeedAlpha4895(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String FrostHunterLifecycleBlazeGammaElite2889 = i == 6 ? FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterLifecycleBlazeGammaElite2889(context, "common_google_play_services_resolution_required_title") : FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterBundlePulseFusionHero2475(context, i);
        if (FrostHunterLifecycleBlazeGammaElite2889 == null) {
            FrostHunterLifecycleBlazeGammaElite2889 = context.getResources().getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_google_play_services_notification_ticker);
        }
        String FrostHunterServiceEliteCelestialThunder1757 = (i == 6 || i == 19) ? FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterServiceEliteCelestialThunder1757(context, "common_google_play_services_resolution_required_text", FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterAlphaAnimationNeoCosmos5761(context)) : FrostHunterInterstitialAdAuroraQuantum2896.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        FrostHunterValueAnimatorShadowForceCosmos2424 frostHunterValueAnimatorShadowForceCosmos2424 = new FrostHunterValueAnimatorShadowForceCosmos2424(context, null);
        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.flags |= 16;
        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLifecycleBlazeGammaElite2889);
        FrostHunterRemoteModelManagerSparkNovaXSpark4008 frostHunterRemoteModelManagerSparkNovaXSpark4008 = new FrostHunterRemoteModelManagerSparkNovaXSpark4008();
        frostHunterRemoteModelManagerSparkNovaXSpark4008.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder1757);
        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceEliteCelestialThunder1757(frostHunterRemoteModelManagerSparkNovaXSpark4008);
        PackageManager packageManager = context.getPackageManager();
        if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRemoteConfigSpeedSpeed8566 == null) {
            FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRemoteConfigSpeedSpeed8566 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRemoteConfigSpeedSpeed8566.booleanValue()) {
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.icon = context.getApplicationInfo().icon;
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlertDialogAuroraDelta3200 = 2;
            if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterTranslateAnimationCyberSolarUltra7101(context)) {
                frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(new FrostHunterLevelListDrawableRoguePixelSolar7539(resources.getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_open_on_phone), pendingIntent));
            } else {
                frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterRemoteConfigSpeedSpeed8566 = pendingIntent;
            }
        } else {
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.icon = R.drawable.stat_sys_warning;
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.tickerText = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(resources.getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_google_play_services_notification_ticker));
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.when = System.currentTimeMillis();
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterRemoteConfigSpeedSpeed8566 = pendingIntent;
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder1757);
        }
        if (FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
            if (!FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                return;
            }
            synchronized (FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.frosthunter.arcticwildlands.frozenexpedition.adventure.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(FrostHunterHandlerSparkNebula5537.FrostHunterDatabaseEliteShadowUltra2452(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLintTitanVortexQuantum9911 = "com.google.android.gms.availability";
        }
        Notification FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761();
        if (i == 1 || i == 2 || i == 3) {
            FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterAlphaAnimationNeoCosmos5761.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(Activity activity, FrostHunterGeocoderShadowRogueVision1682 frostHunterGeocoderShadowRogueVision1682, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(activity, i, new FrostHunterCoroutineScopeSparkDeltaSpectra2426(super.FrostHunterAlphaAnimationNeoCosmos5761(i, activity, "d"), frostHunterGeocoderShadowRogueVision1682), onCancelListener);
        if (FrostHunterServiceEliteCelestialThunder1757 == null) {
            return;
        }
        FrostHunterLifecycleBlazeGammaElite2889(activity, FrostHunterServiceEliteCelestialThunder1757, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
