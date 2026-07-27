package com.anythink.basead.mixad.c;

import android.graphics.Bitmap;
import android.view.View;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCompViewListener;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATAdvertiserInfoOperate;
import com.anythink.core.api.IATThirdPartyMaterial;
import com.anythink.core.common.l.e.a.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements IATThirdPartyMaterial {

    /* renamed from: a, reason: collision with root package name */
    private final BaseAd f9713a;

    /* renamed from: b, reason: collision with root package name */
    private final g f9714b;

    public d(BaseAd baseAd, g gVar) {
        this.f9713a = baseAd;
        this.f9714b = gVar;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAdAppInfo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getAdChoiceIconUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getAdFrom() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAdIconView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAdLogo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAdLogoView();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAdMediaView(objArr);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getAdType() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final IATAdvertiserInfoOperate getAdvertiserInfoOperate() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getAdvertiserName() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAppCommentNum();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getAppPrice();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getCallToActionButton() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getCallToActionButton();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getCallToActionText() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getDescriptionText() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getDomain() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadProgress() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getDownloadProgress();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadStatus() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getDownloadStatus();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getIconImageUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getImageUrlList();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getMainImageHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getMainImageUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getMainImageWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getNativeAdInteractionType();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getNativeExpressHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getNativeExpressWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getNativeType();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, ATCompViewListener aTCompViewListener) {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getRoateView(map, aTCompViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getShakeView(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        g gVar = this.f9714b;
        if (gVar != null) {
            return gVar.a(i, i4, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getSlideView(int i, int i4, int i9, ATShakeViewListener aTShakeViewListener) {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getSlideView(i, i4, i9, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        BaseAd baseAd = this.f9713a;
        return (baseAd == null || baseAd.getStarRating() == null) ? Double.valueOf(0.0d) : this.f9713a.getStarRating();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getTitle() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getVideoDuration();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getVideoHeight();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoProgress() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getVideoProgress();
        }
        return 0.0d;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getVideoUrl() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        BaseAd baseAd = this.f9713a;
        if (baseAd != null) {
            return baseAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null ? baseAd.getWarning() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null && baseAd.supportSetPermissionClickViewList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        BaseAd baseAd = this.f9713a;
        return baseAd != null && baseAd.supportSetPrivacyClickViewList();
    }
}
