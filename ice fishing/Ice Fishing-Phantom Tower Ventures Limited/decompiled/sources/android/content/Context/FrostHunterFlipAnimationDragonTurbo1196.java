package android.content.Context;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterFlipAnimationDragonTurbo1196 {
    public static final int FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        AtomicBoolean atomicBoolean = FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAlphaAnimationNeoCosmos5761 = 12451000;
    }

    public Intent FrostHunterAlphaAnimationNeoCosmos5761(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && FrostHunterBannerAdTitanVisionDragon3523.FrostHunterTranslateAnimationCyberSolarUltra7101(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                FrostHunterConfigurationCosmosEclipseQuantum1114 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context);
                sb.append(FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterAlphaAnimationNeoCosmos5761;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterConstraintSetCloneMasterUltraRogue2633.get()) {
            synchronized (FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                try {
                    if (!FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterLightSensorForceFusion4241) {
                        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterLightSensorForceFusion4241 = true;
                        try {
                            bundle = FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterScaleAnimationStrikeSpark5059 = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterScaleAnimationStrikeSpark5059;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + FrostHunterAlphaAnimationNeoCosmos5761 + " but found " + i2 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (!FrostHunterBannerAdTitanVisionDragon3523.FrostHunterTranslateAnimationCyberSolarUltra7101(context)) {
            if (FrostHunterBannerAdTitanVisionDragon3523.FrostHunterFlowMaxDragonHero5809 == null) {
                FrostHunterBannerAdTitanVisionDragon3523.FrostHunterFlowMaxDragonHero5809 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!FrostHunterBannerAdTitanVisionDragon3523.FrostHunterFlowMaxDragonHero5809.booleanValue()) {
                z = true;
                if (i >= 0) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                    return 0;
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i3 = 9;
                if (z) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (FrostHunterRewardedAdHyperStrike1151.class) {
                        if (FrostHunterRewardedAdHyperStrike1151.FrostHunterFlowMaxDragonHero5809 == null) {
                            FrostHunterInterstitialAdCosmosEliteCyber4885 frostHunterInterstitialAdCosmosEliteCyber4885 = FrostHunterLicensingCelestialNeo5966.FrostHunterAlphaAnimationNeoCosmos5761;
                            synchronized (FrostHunterLicensingCelestialNeo5966.class) {
                                try {
                                    if (FrostHunterLicensingCelestialNeo5966.FrostHunterBundlePulseFusionHero2475 == null) {
                                        FrostHunterLicensingCelestialNeo5966.FrostHunterBundlePulseFusionHero2475 = context.getApplicationContext();
                                    }
                                } finally {
                                }
                            }
                            FrostHunterRewardedAdHyperStrike1151 frostHunterRewardedAdHyperStrike1151 = new FrostHunterRewardedAdHyperStrike1151(0);
                            context.getApplicationContext();
                            FrostHunterRewardedAdHyperStrike1151.FrostHunterFlowMaxDragonHero5809 = frostHunterRewardedAdHyperStrike1151;
                        }
                    }
                    if (FrostHunterRewardedAdHyperStrike1151.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(packageInfo2)) {
                        if (z) {
                            FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(packageInfo);
                            if (!FrostHunterRewardedAdHyperStrike1151.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(packageInfo)) {
                                String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i4 = packageInfo2.versionCode;
                            if ((i4 == -1 ? -1 : i4 / 1000) < (i != -1 ? i / 1000 : -1)) {
                                i3 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException unused4) {
                                        String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                        i3 = 1;
                                        if (i3 != 18) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                i3 = !applicationInfo.enabled ? 3 : 0;
                            }
                        } else {
                            String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                        }
                    } else {
                        String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
                }
                if (i3 != 18) {
                    if (i3 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused6) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return i3;
                }
                return 18;
            }
        }
        z = false;
        if (i >= 0) {
        }
    }
}
