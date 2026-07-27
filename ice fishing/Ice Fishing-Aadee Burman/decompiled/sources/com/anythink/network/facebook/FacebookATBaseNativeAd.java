package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class FacebookATBaseNativeAd<T extends NativeAdBase> extends CustomNativeAd implements NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    T f23062a;

    /* renamed from: b, reason: collision with root package name */
    Context f23063b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23064c;

    /* renamed from: d, reason: collision with root package name */
    a f23065d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, Object> f23066e;

    /* renamed from: f, reason: collision with root package name */
    NativeAdLayout f23067f;

    /* renamed from: g, reason: collision with root package name */
    MediaView f23068g;

    /* renamed from: h, reason: collision with root package name */
    MediaView f23069h;
    private final String i = "FacebookATBaseNativeAd";

    public interface a {
        void onLoadFail(String str, String str2);

        void onLoadSuccess();
    }

    public FacebookATBaseNativeAd(Context context, T t6, boolean z3) {
        this.f23063b = context.getApplicationContext();
        this.f23062a = t6;
        this.f23064c = z3;
    }

    private void a(View view, FrameLayout.LayoutParams layoutParams) {
        AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.f23062a, this.f23067f);
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
        }
        if (layoutParams.height > 0) {
            adOptionsView.setIconSizeDp((int) ((layoutParams.height / this.f23063b.getResources().getDisplayMetrics().density) + 0.5f));
        }
        this.f23067f.addView(adOptionsView, layoutParams);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        T t6 = this.f23062a;
        if (t6 != null) {
            t6.unregisterView();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        T t6 = this.f23062a;
        if (t6 != null) {
            t6.unregisterView();
            this.f23062a.destroy();
            this.f23062a = null;
        }
        MediaView mediaView = this.f23068g;
        if (mediaView != null) {
            mediaView.setListener(null);
            this.f23068g.destroy();
            this.f23068g = null;
        }
        this.f23063b = null;
        MediaView mediaView2 = this.f23069h;
        if (mediaView2 != null) {
            mediaView2.destroy();
            this.f23069h = null;
        }
        this.f23067f = null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getAdFrom() {
        T t6;
        return (this.f23064c || (t6 = this.f23062a) == null) ? "" : t6.getSponsoredTranslation();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdIconView() {
        if (this.f23064c) {
            return null;
        }
        try {
            MediaView mediaView = this.f23069h;
            if (mediaView != null) {
                mediaView.destroy();
                this.f23069h = null;
            }
            MediaView mediaView2 = new MediaView(this.f23063b);
            this.f23069h = mediaView2;
            return mediaView2;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.f23068g == null) {
                MediaView mediaView = new MediaView(this.f23063b);
                this.f23068g = mediaView;
                mediaView.setListener(new MediaViewListener() { // from class: com.anythink.network.facebook.FacebookATBaseNativeAd.1
                    @Override // com.facebook.ads.MediaViewListener
                    public final void onComplete(MediaView mediaView2) {
                        FacebookATBaseNativeAd.this.notifyAdVideoEnd();
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onEnterFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onExitFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenBackground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenForeground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPause(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPlay(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onVolumeChange(MediaView mediaView2, float f3) {
                    }
                });
            }
            return this.f23068g;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getAdvertiserName() {
        T t6;
        return (this.f23064c || (t6 = this.f23062a) == null) ? "" : t6.getAdvertiserName();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getCallToActionText() {
        T t6;
        return (this.f23064c || (t6 = this.f23062a) == null) ? "" : t6.getAdCallToAction();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f23064c) {
            return null;
        }
        NativeAdLayout nativeAdLayout = new NativeAdLayout(this.f23063b);
        this.f23067f = nativeAdLayout;
        return nativeAdLayout;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getDescriptionText() {
        T t6;
        return (this.f23064c || (t6 = this.f23062a) == null) ? "" : t6.getAdBodyText();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageHeight() {
        T t6;
        NativeAdBase.Image adCoverImage;
        if (this.f23064c || (t6 = this.f23062a) == null || (adCoverImage = t6.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getHeight();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageWidth() {
        T t6;
        NativeAdBase.Image adCoverImage;
        if (this.f23064c || (t6 = this.f23062a) == null || (adCoverImage = t6.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getWidth();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getTitle() {
        T t6;
        return (this.f23064c || (t6 = this.f23062a) == null) ? "" : t6.getAdHeadline();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public boolean isNativeExpress() {
        return this.f23064c;
    }

    public void loadAd(String str, a aVar) {
        this.f23065d = aVar;
        if (TextUtils.isEmpty(str)) {
            this.f23062a.loadAd(this.f23062a.buildLoadAdConfig().withAdListener(this).build());
            return;
        }
        HashMap hashMap = new HashMap();
        this.f23066e = hashMap;
        FacebookATInitManager.getInstance();
        hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(str));
        setNetworkInfoMap(this.f23066e);
        this.f23062a.loadAd(this.f23062a.buildLoadAdConfig().withAdListener(this).withBid(str).build());
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        notifyAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        a aVar = this.f23065d;
        if (aVar != null) {
            aVar.onLoadSuccess();
        }
        this.f23065d = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        a aVar = this.f23065d;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(adError.getErrorCode());
            aVar.onLoadFail(sb.toString(), adError.getErrorMessage());
        }
        this.f23065d = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        notifyAdImpression();
    }

    @Override // com.facebook.ads.NativeAdListener
    public void onMediaDownloaded(Ad ad) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23064c || view == null) {
            return;
        }
        try {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            FrameLayout.LayoutParams choiceViewLayoutParams = aTNativePrepareInfo.getChoiceViewLayoutParams();
            T t6 = this.f23062a;
            if (t6 instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) t6;
                if (clickViewList == null || clickViewList.size() <= 0) {
                    NativeAdLayout nativeAdLayout = this.f23067f;
                    if (nativeAdLayout != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout, this.f23068g, this.f23069h);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.f23068g, this.f23069h);
                    }
                } else {
                    NativeAdLayout nativeAdLayout2 = this.f23067f;
                    if (nativeAdLayout2 != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout2, this.f23068g, this.f23069h, clickViewList);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.f23068g, this.f23069h, clickViewList);
                    }
                }
            } else if (t6 instanceof NativeBannerAd) {
                NativeBannerAd nativeBannerAd = (NativeBannerAd) t6;
                if (clickViewList == null || clickViewList.size() <= 0) {
                    NativeAdLayout nativeAdLayout3 = this.f23067f;
                    if (nativeAdLayout3 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout3, this.f23069h);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.f23069h);
                    }
                } else {
                    NativeAdLayout nativeAdLayout4 = this.f23067f;
                    if (nativeAdLayout4 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout4, this.f23069h, clickViewList);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.f23069h, clickViewList);
                    }
                }
            }
            AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.f23062a, this.f23067f);
            if (choiceViewLayoutParams == null) {
                choiceViewLayoutParams = new FrameLayout.LayoutParams(-2, -2);
                choiceViewLayoutParams.gravity = 53;
            }
            if (choiceViewLayoutParams.height > 0) {
                adOptionsView.setIconSizeDp((int) ((choiceViewLayoutParams.height / this.f23063b.getResources().getDisplayMetrics().density) + 0.5f));
            }
            this.f23067f.addView(adOptionsView, choiceViewLayoutParams);
        } catch (Throwable unused) {
        }
    }
}
