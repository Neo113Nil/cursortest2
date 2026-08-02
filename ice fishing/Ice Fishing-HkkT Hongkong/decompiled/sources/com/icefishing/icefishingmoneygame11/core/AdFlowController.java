package com.icefishing.icefishingmoneygame11.core;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.AdChoicesView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.icefishing.icefishingmoneygame11.R;

/* loaded from: classes2.dex */
public class AdFlowController {
    private static final String TAG = "AdFlowController";
    public static String ads = "";
    public static String adx_appopen = "";
    public static String adx_banner = "";
    public static String adx_interstitial = "";
    public static String adx_native = "";
    private static AdManagerInterstitialAd interstitialAd = null;
    private static boolean isLoading = false;
    public static String q_back_url = "";
    public static String q_url = "";

    public static class AdCallback {
        public void onNextAction() {
        }
    }

    public static void QuraInterstitial_back(final Activity activity) {
        final LoadingDialog loadingDialog = new LoadingDialog(activity);
        loadingDialog.show();
        new Handler().postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.core.AdFlowController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AdFlowController.lambda$QuraInterstitial_back$0(LoadingDialog.this, activity);
            }
        }, 100L);
    }

    static /* synthetic */ void lambda$QuraInterstitial_back$0(LoadingDialog loadingDialog, Activity activity) {
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setShowTitle(true);
        builder.enableUrlBarHiding();
        builder.setShareState(1);
        builder.setInstantAppsEnabled(true);
        builder.setToolbarColor(ContextCompat.getColor(activity, R.color.white));
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.launchUrl(activity, Uri.parse(q_back_url));
    }

    public static void adxNativeAds(final Activity activity, final RelativeLayout relativeLayout, final ShimmerFrameLayout shimmerFrameLayout) {
        relativeLayout.setVisibility(8);
        shimmerFrameLayout.setVisibility(0);
        new AdLoader.Builder(activity, adx_native).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.icefishing.icefishingmoneygame11.core.AdFlowController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                AdFlowController.lambda$adxNativeAds$1(ShimmerFrameLayout.this, relativeLayout, activity, nativeAd);
            }
        }).withAdListener(new AdListener() { // from class: com.icefishing.icefishingmoneygame11.core.AdFlowController.1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e("ADX_NATIVE", loadAdError.toString());
            }
        }).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    static /* synthetic */ void lambda$adxNativeAds$1(ShimmerFrameLayout shimmerFrameLayout, RelativeLayout relativeLayout, Activity activity, NativeAd nativeAd) {
        shimmerFrameLayout.setVisibility(8);
        relativeLayout.setVisibility(0);
        showNativeAd(activity, nativeAd, relativeLayout);
    }

    private static void showNativeAd(Activity activity, NativeAd nativeAd, RelativeLayout relativeLayout) {
        relativeLayout.removeAllViews();
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(activity).inflate(R.layout.view_ad_native_full, (ViewGroup) null);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_icon));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_cta));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        nativeAdView.setAdChoicesView((AdChoicesView) nativeAdView.findViewById(R.id.ad_choices));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
        ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
        if (nativeAd.getIcon() != null) {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
        }
        nativeAdView.setNativeAd(nativeAd);
        relativeLayout.addView(nativeAdView);
        relativeLayout.setVisibility(0);
    }

    public static void loadInterstitial(final Activity activity, final AdCallback adCallback) {
        AdManagerInterstitialAd adManagerInterstitialAd = interstitialAd;
        if (adManagerInterstitialAd == null) {
            adCallback.onNextAction();
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.icefishing.icefishingmoneygame11.core.AdFlowController.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AdFlowController.interstitialAd = null;
                    AdFlowController.load(activity);
                    adCallback.onNextAction();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    AdFlowController.interstitialAd = null;
                    AdFlowController.load(activity);
                    adCallback.onNextAction();
                }
            });
            interstitialAd.show(activity);
        }
    }

    public static void load(Activity activity) {
        if (isLoading || interstitialAd != null) {
            return;
        }
        isLoading = true;
        AdManagerInterstitialAd.load(activity, adx_interstitial, new AdManagerAdRequest.Builder().build(), new AdManagerInterstitialAdLoadCallback() { // from class: com.icefishing.icefishingmoneygame11.core.AdFlowController.3
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
                AdFlowController.interstitialAd = adManagerInterstitialAd;
                AdFlowController.isLoading = false;
                Log.d("ADS", "Interstitial loaded");
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                AdFlowController.interstitialAd = null;
                AdFlowController.isLoading = false;
                Log.e("ADS", loadAdError.toString());
            }
        });
    }

    public static void QuraInterstitial(Activity activity) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setShowTitle(true);
        builder.enableUrlBarHiding();
        builder.setShareState(1);
        builder.setInstantAppsEnabled(true);
        builder.setToolbarColor(ContextCompat.getColor(activity, R.color.white));
        builder.build().launchUrl(activity, Uri.parse(q_url));
    }

    public static void QuraInterstitial_2(final Activity activity) {
        final LoadingDialog loadingDialog = new LoadingDialog(activity);
        loadingDialog.show();
        new Handler().postDelayed(new Runnable() { // from class: com.icefishing.icefishingmoneygame11.core.AdFlowController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdFlowController.lambda$QuraInterstitial_2$2(LoadingDialog.this, activity);
            }
        }, 0L);
    }

    static /* synthetic */ void lambda$QuraInterstitial_2$2(LoadingDialog loadingDialog, Activity activity) {
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setShowTitle(true);
        builder.enableUrlBarHiding();
        builder.setShareState(1);
        builder.setInstantAppsEnabled(true);
        builder.setToolbarColor(ContextCompat.getColor(activity, R.color.white));
        builder.build().launchUrl(activity, Uri.parse(q_url));
    }
}
