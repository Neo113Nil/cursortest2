package com.anythink.nativead.a;

import android.graphics.Bitmap;
import android.view.View;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCompViewListener;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.IATAdvertiserInfoOperate;
import com.anythink.nativead.api.ATNativeMaterial;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements ATNativeMaterial {

    /* renamed from: a, reason: collision with root package name */
    CustomNativeAd f23530a;

    /* renamed from: b, reason: collision with root package name */
    boolean f23531b;

    public b(CustomNativeAd customNativeAd, boolean z6) {
        this.f23530a = customNativeAd;
        this.f23531b = z6;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAdAppInfo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getAdChoiceIconUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getAdFrom() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAdIconView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAdLogo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAdLogoView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        CustomNativeAd customNativeAd;
        if (this.f23531b || this.f23530a.isNativeExpress() || (customNativeAd = this.f23530a) == null) {
            return null;
        }
        return customNativeAd.getAdMediaView(objArr);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getAdType() : "0";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final IATAdvertiserInfoOperate getAdvertiserInfoOperate() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getAdvertiserName() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAppCommentNum();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getAppPrice();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getCallToActionButton() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getCallToActionButton();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getCallToActionText() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getDescriptionText() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDomain() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getDomain() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadProgress() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getDownloadProgress();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadStatus() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getDownloadStatus();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getIconImageUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getImageUrlList();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getMainImageUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeAdInteractionType();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeExpressHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeExpressWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getNativeType();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, ATCompViewListener aTCompViewListener) {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getRoateView(map, aTCompViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getShakeView(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getShakeView(i, i4, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getSlideView(int i, int i4, int i6, ATShakeViewListener aTShakeViewListener) {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getSlideView(i, i4, i6, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        CustomNativeAd customNativeAd = this.f23530a;
        double d9 = 0.0d;
        if (customNativeAd != null && customNativeAd.getStarRating() != null) {
            d9 = this.f23530a.getStarRating().doubleValue();
        }
        return Double.valueOf(d9);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getTitle() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoDuration();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoProgress() {
        return this.f23530a.getVideoProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getVideoUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        CustomNativeAd customNativeAd = this.f23530a;
        if (customNativeAd != null) {
            return customNativeAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getWarning() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null ? customNativeAd.getWarning() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null && customNativeAd.supportSetPermissionClickViewList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        CustomNativeAd customNativeAd = this.f23530a;
        return customNativeAd != null && customNativeAd.supportSetPrivacyClickViewList();
    }
}
