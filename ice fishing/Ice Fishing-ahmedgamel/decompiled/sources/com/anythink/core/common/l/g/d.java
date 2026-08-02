package com.anythink.core.common.l.g;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCompViewListener;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATAdvertiserInfoOperate;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.o;
import com.anythink.core.common.h.n;
import com.anythink.core.common.k;
import com.anythink.core.common.v.q;
import com.anythink.core.d.l;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends BaseAd implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f15168a;

    /* renamed from: b, reason: collision with root package name */
    private int f15169b;

    /* renamed from: c, reason: collision with root package name */
    private int f15170c;

    /* renamed from: d, reason: collision with root package name */
    private int f15171d;

    /* renamed from: e, reason: collision with root package name */
    private int f15172e;

    /* renamed from: f, reason: collision with root package name */
    private BaseAd f15173f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f15174g;

    /* renamed from: h, reason: collision with root package name */
    private View f15175h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15176j;

    public d(BaseAd baseAd, Map<String, Object> map) {
        this.f15168a = 1;
        this.f15169b = 5;
        this.f15170c = 1;
        this.f15172e = 5;
        this.f15173f = baseAd;
        this.f15174g = map;
        Object obj = map.get("orientation");
        if (obj != null) {
            this.f15168a = Integer.parseInt(obj.toString());
        }
        Object obj2 = map.get(com.anythink.expressad.f.a.b.dl);
        if (obj2 != null) {
            this.f15169b = Integer.parseInt(obj2.toString());
        }
        Object obj3 = map.get("allows_skip");
        if (obj3 != null) {
            this.f15170c = Integer.parseInt(obj3.toString());
        }
        this.f15171d = ((Integer) q.a(this.f15174g, k.aJ, 3)).intValue();
        Object obj4 = map.get("s_c_t");
        if (obj4 != null) {
            this.f15172e = Integer.parseInt(obj4.toString());
        }
        this.i = 1;
        try {
            Object obj5 = map.get(j.w.f13394E);
            if (obj5 != null) {
                this.i = Integer.parseInt(obj5.toString());
            }
            Object obj6 = map.get(j.w.f13395F);
            if (obj5 != null) {
                this.f15176j = Integer.parseInt(obj6.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private void a(Map<String, Object> map) {
        Object obj = map.get("orientation");
        if (obj != null) {
            this.f15168a = Integer.parseInt(obj.toString());
        }
        Object obj2 = map.get(com.anythink.expressad.f.a.b.dl);
        if (obj2 != null) {
            this.f15169b = Integer.parseInt(obj2.toString());
        }
        Object obj3 = map.get("allows_skip");
        if (obj3 != null) {
            this.f15170c = Integer.parseInt(obj3.toString());
        }
        this.f15171d = ((Integer) q.a(this.f15174g, k.aJ, 3)).intValue();
        Object obj4 = map.get("s_c_t");
        if (obj4 != null) {
            this.f15172e = Integer.parseInt(obj4.toString());
        }
        this.i = 1;
        try {
            Object obj5 = map.get(j.w.f13394E);
            if (obj5 != null) {
                this.i = Integer.parseInt(obj5.toString());
            }
            Object obj6 = map.get(j.w.f13395F);
            if (obj5 != null) {
                this.f15176j = Integer.parseInt(obj6.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private static void q() {
    }

    @Override // com.anythink.core.common.l.g.a
    public final long b() {
        return this.f15169b;
    }

    @Override // com.anythink.core.common.l.g.a
    public final int c() {
        int i = this.f15170c;
        return (i != 1 && i == 0) ? 1 : 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void clear(View view) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.clear(view);
        }
    }

    @Override // com.anythink.core.common.l.g.a
    public final int d() {
        int i = this.f15171d;
        if (i != 1) {
            return i != 2 ? 2 : 1;
        }
        return 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void destroy() {
        this.f15173f.destroy();
    }

    @Override // com.anythink.core.common.l.g.a
    public final int e() {
        return this.f15172e;
    }

    @Override // com.anythink.core.common.l.g.a
    public final int f() {
        if (this.f15173f.getDetail() == null) {
            return 0;
        }
        int Y = this.f15173f.getDetail().Y();
        if (Y != 8) {
            return Y != 22 ? 0 : 1;
        }
        Object obj = this.f15174g.get("video_muted");
        if (obj != null) {
            return TextUtils.equals(obj.toString(), "0") ? 1 : 0;
        }
        return 0;
    }

    @Override // com.anythink.core.common.l.g.a
    public final int g() {
        Map<String, Object> map = this.f15174g;
        if (map == null || !map.containsKey(l.a.aq)) {
            return 1;
        }
        Object obj = this.f15174g.get(l.a.aq);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        return this.f15173f.getAdAppInfo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.f15173f.getAdChoiceIconUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        return this.f15173f.getAdFrom();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        BaseAd baseAd;
        if (this.f15175h == null && (baseAd = this.f15173f) != null) {
            this.f15175h = baseAd.getAdIconView();
        }
        return this.f15175h;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        return this.f15173f.getAdLogo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        return this.f15173f.getAdLogoView();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        return this.f15173f.getAdMediaView(objArr);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        return this.f15173f.getAdType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final IATAdvertiserInfoOperate getAdvertiserInfoOperate() {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            return baseAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        return this.f15173f.getAdvertiserName();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        return this.f15173f.getAppCommentNum();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        return this.f15173f.getAppPrice();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getCallToActionButton() {
        return this.f15173f.getCallToActionButton();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        return this.f15173f.getCallToActionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final ViewGroup getCustomAdContainer() {
        return this.f15173f.getCustomAdContainer();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        return this.f15173f.getDescriptionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final n getDetail() {
        return this.f15173f.getDetail();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.f15173f;
        return baseAd != null ? baseAd.getDomain() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadProgress() {
        return this.f15173f.getDownloadProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadStatus() {
        return this.f15173f.getDownloadStatus();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        return this.f15173f.getIconImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.f15173f.getImageUrlList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        return this.f15173f.getMainImageHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        return this.f15173f.getMainImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        return this.f15173f.getMainImageWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        return this.f15173f.getNativeAdInteractionType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            return baseAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        return this.f15173f.getNativeExpressHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        return this.f15173f.getNativeExpressWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        return this.f15173f.getNativeType();
    }

    @Override // com.anythink.core.api.BaseAd, com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.f15173f.getNetworkInfoMap();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, ATCompViewListener aTCompViewListener) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            return baseAd.getRoateView(map, aTCompViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getShakeView(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            return baseAd.getShakeView(i, i4, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getSlideView(int i, int i4, int i6, ATShakeViewListener aTShakeViewListener) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            return baseAd.getSlideView(i, i4, i6, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        return this.f15173f.getStarRating();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        return this.f15173f.getTitle();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        return this.f15173f.getVideoDuration();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        return this.f15173f.getVideoHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoProgress() {
        return this.f15173f.getVideoProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        return this.f15173f.getVideoUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        return this.f15173f.getVideoWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.f15173f;
        return baseAd != null ? baseAd.getWarning() : "";
    }

    @Override // com.anythink.core.common.l.g.a
    public final int[] h() {
        int[] iArr = {1, 2, 3, 4, 5};
        Map<String, Object> map = this.f15174g;
        if (map != null && map.containsKey(l.a.ar)) {
            Object obj = this.f15174g.get(l.a.ar);
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return iArr;
    }

    @Override // com.anythink.core.common.l.g.a
    public final int i() {
        return ((Integer) q.a(this.f15174g, k.aM, 0)).intValue();
    }

    @Override // com.anythink.core.api.BaseAd
    public final boolean isNativeExpress() {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            return baseAd.isNativeExpress();
        }
        return false;
    }

    @Override // com.anythink.core.common.l.g.a
    public final int j() {
        return ((Integer) q.a(this.f15174g, k.aK, 1)).intValue();
    }

    @Override // com.anythink.core.common.l.g.a
    public final int k() {
        return ((Integer) q.a(this.f15174g, k.aF, 1)).intValue();
    }

    @Override // com.anythink.core.common.l.g.a
    public final int l() {
        return ((Integer) q.a(this.f15174g, k.aJ, 3)).intValue();
    }

    @Override // com.anythink.core.common.l.g.a
    public final int m() {
        return ((Integer) q.a(this.f15174g, k.aG, 2)).intValue();
    }

    @Override // com.anythink.core.common.l.g.a
    public final String n() {
        return (String) q.a(this.f15174g, "size", "");
    }

    @Override // com.anythink.core.common.l.g.a
    public final int o() {
        if (this.i == 1) {
            return 3;
        }
        return this.f15176j;
    }

    public final boolean p() {
        return i() == 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void pauseVideo() {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.pauseVideo();
        }
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.registerListener(view, list, layoutParams);
        }
    }

    @Override // com.anythink.core.api.BaseAd
    public final void resumeVideo() {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.resumeVideo();
        }
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setDevParams(Map<String, Object> map) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.setDevParams(map);
        }
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNativeEventListener(o oVar) {
        this.f15173f.setNativeEventListener(oVar);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.f15173f.setNetworkInfoMap(map);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setTrackingInfo(n nVar) {
        this.f15173f.setTrackingInfo(nVar);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setVideoMute(boolean z6) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.setVideoMute(z6);
        }
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        BaseAd baseAd = this.f15173f;
        return baseAd != null && baseAd.supportSetPermissionClickViewList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        BaseAd baseAd = this.f15173f;
        return baseAd != null && baseAd.supportSetPrivacyClickViewList();
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, com.anythink.core.basead.b.b bVar) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.registerListener(view, list, layoutParams, bVar);
        }
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, ATNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        BaseAd baseAd = this.f15173f;
        if (baseAd != null) {
            baseAd.registerListener(view, adPrepareInfo);
        }
    }

    @Override // com.anythink.core.common.l.g.a
    public final int a() {
        return this.f15168a;
    }

    private boolean a(Object... objArr) {
        return getAdMediaView(objArr) == null && TextUtils.isEmpty(getMainImageUrl());
    }
}
