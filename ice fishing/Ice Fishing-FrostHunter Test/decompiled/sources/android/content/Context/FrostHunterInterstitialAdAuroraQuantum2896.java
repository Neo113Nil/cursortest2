package android.content.Context;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterInterstitialAdAuroraQuantum2896 {
    public static final FrostHunterTimerCosmosCyberLegend3595 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterTimerCosmosCyberLegend3595(0);
    public static Locale FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public static String FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterAlphaAnimationNeoCosmos5761;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String FrostHunterBundlePulseFusionHero2475(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return FrostHunterLifecycleBlazeGammaElite2889(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return FrostHunterLifecycleBlazeGammaElite2889(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return FrostHunterLifecycleBlazeGammaElite2889(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return FrostHunterLifecycleBlazeGammaElite2889(context, "common_google_play_services_restricted_profile_title");
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, int i) {
        Resources resources = context.getResources();
        String FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAlphaAnimationNeoCosmos5761(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, FrostHunterAlphaAnimationNeoCosmos57612);
        }
        if (i == 2) {
            return FrostHunterBannerAdTitanVisionDragon3523.FrostHunterTranslateAnimationCyberSolarUltra7101(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, FrostHunterAlphaAnimationNeoCosmos57612);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, FrostHunterAlphaAnimationNeoCosmos57612);
        }
        if (i == 5) {
            return FrostHunterServiceEliteCelestialThunder1757(context, "common_google_play_services_invalid_account_text", FrostHunterAlphaAnimationNeoCosmos57612);
        }
        if (i == 7) {
            return FrostHunterServiceEliteCelestialThunder1757(context, "common_google_play_services_network_error_text", FrostHunterAlphaAnimationNeoCosmos57612);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, FrostHunterAlphaAnimationNeoCosmos57612);
        }
        if (i == 20) {
            return FrostHunterServiceEliteCelestialThunder1757(context, "common_google_play_services_restricted_profile_text", FrostHunterAlphaAnimationNeoCosmos57612);
        }
        switch (i) {
            case 16:
                return FrostHunterServiceEliteCelestialThunder1757(context, "common_google_play_services_api_unavailable_text", FrostHunterAlphaAnimationNeoCosmos57612);
            case 17:
                return FrostHunterServiceEliteCelestialThunder1757(context, "common_google_play_services_sign_in_failed_text", FrostHunterAlphaAnimationNeoCosmos57612);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, FrostHunterAlphaAnimationNeoCosmos57612);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, FrostHunterAlphaAnimationNeoCosmos57612);
        }
    }

    public static String FrostHunterLifecycleBlazeGammaElite2889(Context context, String str) {
        Resources resources;
        FrostHunterTimerCosmosCyberLegend3595 frostHunterTimerCosmosCyberLegend3595 = FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (frostHunterTimerCosmosCyberLegend3595) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                    frostHunterTimerCosmosCyberLegend3595.clear();
                    FrostHunterConstraintSetCloneMasterUltraRogue2633 = locale;
                }
                String str2 = (String) frostHunterTimerCosmosCyberLegend3595.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterAlphaAnimationNeoCosmos5761;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            FrostHunterAlphaAnimationNeoCosmos5761.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public static String FrostHunterServiceEliteCelestialThunder1757(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(context, str);
        if (FrostHunterLifecycleBlazeGammaElite2889 == null) {
            FrostHunterLifecycleBlazeGammaElite2889 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, FrostHunterLifecycleBlazeGammaElite2889, str2);
    }
}
