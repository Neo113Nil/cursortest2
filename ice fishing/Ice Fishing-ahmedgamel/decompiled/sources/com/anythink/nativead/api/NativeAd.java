package com.anythink.nativead.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRevenueListener;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.o;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.f;
import com.anythink.core.common.h.c;
import com.anythink.core.common.h.n;
import com.anythink.core.common.l.d.a;
import com.anythink.core.common.l.g.d;
import com.anythink.core.common.u;
import com.anythink.core.common.u.e;
import com.anythink.core.common.u.h;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.anythink.nativead.a.b;
import com.anythink.nativead.unitgroup.a;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.Map;

/* loaded from: classes.dex */
public class NativeAd {
    private boolean hasSetShowTkDetail;
    private View innerChildView;
    private c mAdCacheInfo;
    protected a mBaseNativeAd;
    DownloadConfirmListener mConfirmListener;
    private Context mContext;
    private ATNativeDislikeListener mDislikeListener;
    ATEventInterface mEventInterface;
    private boolean mIsDestroyed;
    private int mNativeAdHeight;
    private int mNativeAdWidth;
    private ATNativeEventListener mNativeEventListener;
    ATNativeAdView mNativeView;
    private String mPlacementId;
    private boolean mRecordedImpression;
    private boolean mRecordedShow;
    private ATAdRevenueListener mRevenueListener;
    ATNativeMaterial nativeMaterial;
    private ATNativeAdInfo.AdPrepareInfo thirdPartyAdPrepareInfo;
    private final String TAG = getClass().getSimpleName();
    private boolean hasCallPrepareApi = false;
    private boolean hasCallPrepareRenderApi = false;
    private boolean hasReportRenderTypeAgent = false;
    View.OnClickListener mDefaultCloseViewListener = new View.OnClickListener() { // from class: com.anythink.nativead.api.NativeAd.11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = NativeAd.this.mBaseNativeAd;
            if (aVar != null) {
                aVar.notifyAdDislikeClick();
            }
        }
    };
    boolean isManualImpressionTrack = false;

    public interface DownloadConfirmListener {
        void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo);
    }

    public interface ImpressionEventListener {
        void onImpression();
    }

    public NativeAd(Context context, String str, c cVar) {
        this.mNativeAdWidth = 0;
        this.mNativeAdHeight = 0;
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mAdCacheInfo = cVar;
        a aVar = (a) cVar.f();
        this.mBaseNativeAd = aVar;
        aVar.setNativeEventListener(new o() { // from class: com.anythink.nativead.api.NativeAd.1
            @Override // com.anythink.core.common.d.o
            public final void onAdClicked(View view) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleClick(nativeAd.mNativeView, view);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdDislikeButtonClick() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdImpressed() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleImpression(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoEnd() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoEnd(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoProgress(int i) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoProgress(nativeAd.mNativeView, i);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoStart() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoStart(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.d.o
            public final void onDeeplinkCallback(boolean z6) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleDeeplinkCallback(nativeAd.mNativeView, z6);
            }

            @Override // com.anythink.core.common.d.o
            public final void onDownloadConfirmCallback(Context context2, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                NativeAd.this.handleDownloadConfirm(context2, view, aTNetworkConfirmInfo);
            }
        });
        a aVar2 = this.mBaseNativeAd;
        if (aVar2 instanceof CustomNativeAd) {
            this.nativeMaterial = new b((CustomNativeAd) aVar2, isSupportRenderToInnerTemplate());
        }
        c cVar2 = this.mAdCacheInfo;
        if (cVar2 == null || cVar2.i() == null || this.mAdCacheInfo.i().j() == null) {
            return;
        }
        Map<String, Object> j6 = this.mAdCacheInfo.i().j();
        this.mNativeAdWidth = ((Integer) q.a(j6, ATAdConst.KEY.AD_WIDTH, 0)).intValue();
        this.mNativeAdHeight = ((Integer) q.a(j6, ATAdConst.KEY.AD_HEIGHT, 0)).intValue();
    }

    private void bindListener() {
        ATNativePrepareInfo nativePrepareInfo;
        View closeView;
        a aVar = this.mBaseNativeAd;
        if (aVar instanceof CustomNativeAd) {
            CustomNativeAd customNativeAd = (CustomNativeAd) aVar;
            if (customNativeAd.checkHasCloseViewListener() || (nativePrepareInfo = customNativeAd.getNativePrepareInfo()) == null || (closeView = nativePrepareInfo.getCloseView()) == null) {
                return;
            }
            closeView.setOnClickListener(this.mDefaultCloseViewListener);
        }
    }

    private void checkBindView(ATNativePrepareInfo aTNativePrepareInfo) {
        if (aTNativePrepareInfo == null) {
            return;
        }
        if (aTNativePrepareInfo.getTitleView() == null) {
            printNotSetViewLog("titleView");
        }
        if (aTNativePrepareInfo.getCtaView() == null) {
            printNotSetViewLog("ctaView");
        }
        if (aTNativePrepareInfo.getDescView() == null) {
            printNotSetViewLog("descView");
        }
        if (aTNativePrepareInfo.getIconView() == null) {
            printNotSetViewLog("iconView");
        }
        if (aTNativePrepareInfo.getMainImageView() == null) {
            printNotSetViewLog("mainImageView");
        }
    }

    private void checkToReportRenderErrorAgent(boolean z6) {
        n detail;
        String str;
        try {
            if (this.mRecordedShow && this.mRecordedImpression) {
                return;
            }
            if (this.hasReportRenderTypeAgent) {
                return;
            }
            this.hasReportRenderTypeAgent = true;
            a aVar = this.mBaseNativeAd;
            if (aVar == null || (detail = aVar.getDetail()) == null || detail.Y() != 66) {
                return;
            }
            String str2 = "2";
            String str3 = this.hasCallPrepareRenderApi ? "1" : "2";
            String str4 = this.hasCallPrepareApi ? "1" : "2";
            if (!this.mRecordedShow && !this.mRecordedImpression) {
                str2 = "1";
            } else if (this.mRecordedImpression) {
                str2 = "";
            }
            if (z6) {
                str2 = "3";
                str = "0";
                str4 = str;
            } else {
                str = str3;
            }
            Map<String, Object> networkInfoMap = this.mBaseNativeAd.getNetworkInfoMap();
            Object obj = networkInfoMap.get("dsp_id");
            Object obj2 = networkInfoMap.get("offer_id");
            e.a(detail, str2, str, str4, obj != null ? obj.toString() : "", obj2 != null ? obj2.toString() : "");
        } catch (Throwable th) {
            th.getMessage();
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillRenderAreaToTrackingInfo(n nVar, ATNativeAdView aTNativeAdView) {
        if (nVar == null || aTNativeAdView == null || nVar.Y() != 66) {
            return;
        }
        nVar.a(aTNativeAdView.getWidth(), aTNativeAdView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fillShowTrackingInfo(n nVar) {
        if (!this.hasSetShowTkDetail) {
            this.hasSetShowTkDetail = true;
            if (nVar != null) {
                aj.a(this.mContext, nVar);
            }
        }
    }

    private boolean isNativeExpressByNativeAd() {
        a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return false;
        }
        return ((CustomNativeAd) aVar).isNativeExpress();
    }

    private boolean isSupportRenderToInnerTemplate() {
        return isSupportRenderToInnerTemplate(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void prepareOnUiThread(ATNativeAdView aTNativeAdView, ATNativePrepareInfo aTNativePrepareInfo) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            this.hasCallPrepareApi = true;
            if (aTNativeAdView != null) {
                ATNativeAdInfo.AdPrepareInfo adPrepareInfo = this.thirdPartyAdPrepareInfo;
                if (adPrepareInfo != null) {
                    a aVar = this.mBaseNativeAd;
                    if (aVar instanceof CustomNativeAd) {
                        aTNativePrepareInfo = ((CustomNativeAd) aVar).castToATNativePrepareInfo(adPrepareInfo);
                    }
                }
                if (aTNativePrepareInfo == null) {
                    aTNativePrepareInfo = new ATNativePrepareInfo();
                }
                this.mBaseNativeAd.setNativePrepareInfo(aTNativePrepareInfo);
                this.mBaseNativeAd.prepare(aTNativeAdView, aTNativePrepareInfo);
                bindListener();
                if (!this.mBaseNativeAd.isNativeExpress()) {
                    checkBindView(aTNativePrepareInfo);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void printNotSetViewLog(String str) {
        Log.w(this.TAG, "The " + str + " is not set, it may cause the ad to not be clicked normally.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        android.util.Log.e("anythink", "renderAdContainer: selfRenderView cannot be null for self-rendering ads!");
        checkToReportRenderErrorAgent(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void renderAdOnUiThread(ATNativeAdView aTNativeAdView, View view) {
        com.anythink.core.common.l.d.b serverExtraInfo;
        com.anythink.basead.mixad.b.e eVar;
        try {
            if (this.mIsDestroyed) {
                return;
            }
            if (aTNativeAdView != null) {
                aTNativeAdView.clear();
            }
            if (aTNativeAdView == null) {
                Log.e("anythink", "renderAdContainer: ATNativeAdView cannot be null for template-rendering ads!");
                return;
            }
            View view2 = null;
            if (isNativeExpressByNativeAd()) {
                a aVar = this.mBaseNativeAd;
                if (aVar != null && (view2 = aVar.getAdMediaView(aTNativeAdView, Integer.valueOf(aTNativeAdView.getWidth()))) == null) {
                    Log.e("anythink", "renderAdContainer: getAdMediaView() cannot be null for template-rendering ads!");
                    return;
                }
            } else {
                if (isSupportRenderToInnerTemplate(view != null) && (view = this.innerChildView) == null) {
                    com.anythink.core.common.l.d.a a9 = new a.C0082a().a(aTNativeAdView.getContext()).a(this.mBaseNativeAd.getDetail()).a(new com.anythink.core.common.l.e.a() { // from class: com.anythink.nativead.api.NativeAd.8
                        @Override // com.anythink.core.common.l.e.a, com.anythink.core.common.l.e.a.b
                        public final void onAdDislikeButtonClick() {
                            super.onAdDislikeButtonClick();
                            NativeAd nativeAd = NativeAd.this;
                            nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
                        }
                    }).a(new d(this.mBaseNativeAd, this.mAdCacheInfo.e().getServerExtraInfo().a())).a(this.mNativeAdWidth).b(this.mNativeAdHeight).a();
                    ATBaseAdAdapter e9 = this.mAdCacheInfo.e();
                    if (e9 == null || (serverExtraInfo = e9.getServerExtraInfo()) == null) {
                        eVar = null;
                    } else {
                        a9.a(serverExtraInfo);
                        eVar = serverExtraInfo.j() ? new com.anythink.basead.mixad.b.e() : null;
                        if (eVar != null) {
                            eVar.a(new com.anythink.basead.mixad.c.b(a9));
                        }
                    }
                    if (eVar != null) {
                        view = eVar.a();
                        this.thirdPartyAdPrepareInfo = eVar.b();
                        this.innerChildView = view;
                    } else {
                        view = null;
                    }
                }
                view2 = view;
            }
            this.hasCallPrepareRenderApi = true;
            this.mNativeView = aTNativeAdView;
            aTNativeAdView.attachNativeAd(this);
            if (view2 != null) {
                view2.setVisibility(0);
                renderViewToWindow(view2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void renderViewToWindow(View view) {
        ab.b(this.mPlacementId, j.r.f13332s, j.r.f13309A, j.r.f13328o, "");
        ViewGroup customAdContainer = this.mBaseNativeAd.getCustomAdContainer();
        int hashCode = hashCode();
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (customAdContainer != null) {
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            customAdContainer.addView(view);
        }
        if (customAdContainer != null) {
            view = customAdContainer;
        }
        this.mNativeView.renderView(hashCode, view, new ImpressionEventListener() { // from class: com.anythink.nativead.api.NativeAd.9
            @Override // com.anythink.nativead.api.NativeAd.ImpressionEventListener
            public final void onImpression() {
                long currentTimeMillis = System.currentTimeMillis();
                com.anythink.nativead.unitgroup.a aVar = NativeAd.this.mBaseNativeAd;
                n detail = aVar != null ? aVar.getDetail() : null;
                if (detail != null && TextUtils.isEmpty(detail.z())) {
                    detail.n(p.a(detail.aJ(), detail.M(), currentTimeMillis));
                }
                com.anythink.nativead.unitgroup.a aVar2 = NativeAd.this.mBaseNativeAd;
                if (aVar2 instanceof CustomNativeAd) {
                    ((CustomNativeAd) aVar2).setShowId(detail.z());
                }
                NativeAd nativeAd = NativeAd.this;
                nativeAd.recordShow(nativeAd.mNativeView);
            }
        });
    }

    public synchronized void clear(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        try {
            com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                aVar.clear(this.mNativeView);
            }
        } catch (Throwable unused) {
        }
        ATNativeAdView aTNativeAdView2 = this.mNativeView;
        if (aTNativeAdView2 != null) {
            aTNativeAdView2.clearImpressionListener(hashCode());
            this.mNativeView = null;
        }
    }

    public synchronized void destory() {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            checkToReportRenderErrorAgent(false);
            clear(this.mNativeView);
            this.mIsDestroyed = true;
            this.mNativeEventListener = null;
            this.mDislikeListener = null;
            this.mDefaultCloseViewListener = null;
            this.mNativeView = null;
            KeyEvent.Callback callback = this.innerChildView;
            if (callback != null) {
                if (callback instanceof com.anythink.core.common.l.e.a.d) {
                    ((com.anythink.core.common.l.e.a.d) callback).destroyNativeAd();
                }
                this.innerChildView = null;
            }
            this.thirdPartyAdPrepareInfo = null;
            com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                aVar.setNativePrepareInfo(null);
                this.mBaseNativeAd.destroy();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        checkToReportRenderErrorAgent(false);
        super.finalize();
    }

    public ATAdInfo getAdInfo() {
        return l.a(this.mBaseNativeAd, this.mAdCacheInfo.e(), this.mRecordedImpression ? 5 : 4);
    }

    public int getAdInteractionType() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) aVar).getNativeAdInteractionType();
    }

    public ATNativeMaterial getAdMaterial() {
        return this.nativeMaterial;
    }

    @Deprecated
    public ATCustomVideo getCustomVideo() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return null;
        }
        return ((CustomNativeAd) aVar).getNativeCustomVideo();
    }

    public int getDownloadProgress() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0;
        }
        return aVar.getDownloadProgress();
    }

    public int getDownloadStatus() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0;
        }
        return aVar.getDownloadStatus();
    }

    public int getNativeType() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) aVar).getNativeType();
    }

    public Object getObject() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return null;
        }
        return aVar.getObject();
    }

    public double getVideoDuration() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0.0d;
        }
        return ((CustomNativeAd) aVar).getVideoDuration();
    }

    public double getVideoProgress() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0.0d;
        }
        return ((CustomNativeAd) aVar).getVideoProgress();
    }

    public synchronized void handleAdDislikeButtonClick(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.4
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mDislikeListener != null) {
                    ATNativeDislikeListener aTNativeDislikeListener = NativeAd.this.mDislikeListener;
                    ATNativeAdView aTNativeAdView2 = aTNativeAdView;
                    NativeAd nativeAd = NativeAd.this;
                    aTNativeDislikeListener.onAdCloseButtonClick(aTNativeAdView2, l.a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.e()));
                }
            }
        });
    }

    public synchronized void handleClick(final ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            n detail = aVar.getDetail();
            com.anythink.core.common.u.c.a(this.mContext.getApplicationContext()).a(6, detail);
            if (detail != null ? detail.aw() : false) {
                return;
            } else {
                ab.a(detail, j.r.f13318d, j.r.f13326m, "");
            }
        }
        if (this.mAdCacheInfo != null && this.mBaseNativeAd != null && isNativeExpressByNativeAd()) {
            com.anythink.core.common.v.c.a().b(this.mAdCacheInfo.e(), this.mBaseNativeAd.getDetail());
        }
        t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.2
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    ATNativeEventListener aTNativeEventListener = NativeAd.this.mNativeEventListener;
                    ATNativeAdView aTNativeAdView2 = aTNativeAdView;
                    NativeAd nativeAd = NativeAd.this;
                    aTNativeEventListener.onAdClicked(aTNativeAdView2, l.a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.e()));
                }
            }
        });
    }

    public synchronized void handleDeeplinkCallback(final ATNativeAdView aTNativeAdView, final boolean z6) {
        if (this.mIsDestroyed) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.14
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener == null || !(NativeAd.this.mNativeEventListener instanceof ATNativeEventExListener)) {
                    return;
                }
                ATNativeEventExListener aTNativeEventExListener = (ATNativeEventExListener) NativeAd.this.mNativeEventListener;
                ATNativeAdView aTNativeAdView2 = aTNativeAdView;
                NativeAd nativeAd = NativeAd.this;
                aTNativeEventExListener.onDeeplinkCallback(aTNativeAdView2, l.a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.e()), z6);
            }
        });
    }

    public synchronized void handleDownloadConfirm(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        com.anythink.nativead.unitgroup.a aVar;
        if (this.mIsDestroyed) {
            return;
        }
        DownloadConfirmListener downloadConfirmListener = this.mConfirmListener;
        if (downloadConfirmListener != null && (aVar = this.mBaseNativeAd) != null) {
            if (context == null) {
                context = this.mContext;
            }
            downloadConfirmListener.onDownloadConfirm(context, l.a(aVar, this.mAdCacheInfo.e()), view, aTNetworkConfirmInfo);
        }
    }

    public synchronized void handleImpression(final ATNativeAdView aTNativeAdView) {
        try {
            if (!this.mRecordedImpression && !this.mIsDestroyed) {
                this.mRecordedImpression = true;
                if (this.mAdCacheInfo != null && this.mBaseNativeAd != null && isNativeExpressByNativeAd()) {
                    com.anythink.core.common.v.c.a().a(this.mAdCacheInfo.e(), this.mBaseNativeAd.getDetail());
                }
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (NativeAd.this.mIsDestroyed) {
                            return;
                        }
                        try {
                            com.anythink.nativead.unitgroup.a aVar = NativeAd.this.mBaseNativeAd;
                            if (aVar != null) {
                                n detail = aVar.getDetail();
                                detail.a(NativeAd.this.mBaseNativeAd.getNetworkInfoMap());
                                ab.a(detail, j.r.f13317c, j.r.f13326m, "");
                                NativeAd.this.fillShowTrackingInfo(detail);
                                NativeAd.this.fillRenderAreaToTrackingInfo(detail, aTNativeAdView);
                                com.anythink.core.common.u.c.a(NativeAd.this.mContext.getApplicationContext()).a(4, detail, NativeAd.this.mAdCacheInfo.e().getUnitGroupInfo());
                                NativeAd nativeAd = NativeAd.this;
                                final l a9 = l.a(nativeAd.mBaseNativeAd, nativeAd.mAdCacheInfo.e());
                                if (a9.getNetworkFirmId() == -1) {
                                    h.a(j.n.f13291a, NativeAd.this.mAdCacheInfo.e(), NativeAd.this.mBaseNativeAd);
                                }
                                t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.13.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (NativeAd.this.mRevenueListener != null) {
                                            NativeAd.this.mRevenueListener.onAdRevenuePaid(a9);
                                        }
                                        if (NativeAd.this.mNativeEventListener != null) {
                                            NativeAd.this.mNativeEventListener.onAdImpressed(aTNativeAdView, a9);
                                        }
                                    }
                                });
                            }
                        } catch (Exception unused) {
                            Log.e("NativeAd", "BaseNativeAd has been destotyed.");
                        }
                    }
                });
            }
        } finally {
        }
    }

    public synchronized void handleVideoEnd(final ATNativeAdView aTNativeAdView) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                n detail = aVar.getDetail();
                detail.f14814w = 100;
                com.anythink.core.common.u.c.a(this.mContext.getApplicationContext()).a(9, detail);
            }
            t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mNativeEventListener != null) {
                        NativeAd.this.mNativeEventListener.onAdVideoEnd(aTNativeAdView);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void handleVideoProgress(final ATNativeAdView aTNativeAdView, final int i) {
        if (this.mIsDestroyed) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.6
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoProgress(aTNativeAdView, i);
                }
            }
        });
    }

    public synchronized void handleVideoStart(final ATNativeAdView aTNativeAdView) {
        try {
            if (this.mIsDestroyed) {
                return;
            }
            com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                n detail = aVar.getDetail();
                detail.f14814w = 0;
                com.anythink.core.common.u.c.a(this.mContext.getApplicationContext()).a(8, detail);
            }
            t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mNativeEventListener != null) {
                        NativeAd.this.mNativeEventListener.onAdVideoStart(aTNativeAdView);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isNativeExpress() {
        if (isSupportRenderToInnerTemplate()) {
            return true;
        }
        return isNativeExpressByNativeAd();
    }

    public boolean isValid() {
        com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return true;
        }
        return aVar.isValid();
    }

    public void manualImpressionTrack() {
        if (this.mIsDestroyed) {
            Log.e(this.TAG, "NativeAd had been destroyed.");
            return;
        }
        if (!this.isManualImpressionTrack) {
            if (t.b().F()) {
                Log.e(this.TAG, "Must call \"setManualImpressionTrack(true);\" first.");
                return;
            }
            return;
        }
        ATNativeAdView aTNativeAdView = this.mNativeView;
        c cVar = this.mAdCacheInfo;
        ATBaseAdAdapter e9 = cVar != null ? cVar.e() : null;
        if (e9 != null && e9.supportImpressionCallback()) {
            if (t.b().F()) {
                Log.e(this.TAG, "This NativeAd don't support tracking impressions manually.");
                return;
            }
            return;
        }
        if (aTNativeAdView == null) {
            if (t.b().F()) {
                Log.e(this.TAG, "NativeAd don't call render.");
                return;
            }
            return;
        }
        if (!aTNativeAdView.isShown()) {
            if (t.b().F()) {
                Log.e(this.TAG, "ATNativeAdView isn't visible.");
            }
        } else if (!aTNativeAdView.isAttachedToWindow()) {
            if (t.b().F()) {
                Log.e(this.TAG, "ATNativeAdView don't attach window.");
            }
        } else {
            if (t.b().F()) {
                Log.i(this.TAG, "try to track impression manually.");
            }
            com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
            if (aVar instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar).impressionTrack(aTNativeAdView);
            }
        }
    }

    public void onPause() {
        com.anythink.nativead.unitgroup.a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.onPause();
    }

    public void onResume() {
        com.anythink.nativead.unitgroup.a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.onResume();
    }

    public void pauseVideo() {
        com.anythink.nativead.unitgroup.a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.pauseVideo();
    }

    public synchronized void prepare(final ATNativeAdView aTNativeAdView, final ATNativePrepareInfo aTNativePrepareInfo) {
        t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.10
            @Override // java.lang.Runnable
            public final void run() {
                NativeAd.this.prepareOnUiThread(aTNativeAdView, aTNativePrepareInfo);
            }
        });
    }

    public synchronized void recordShow(ATNativeAdView aTNativeAdView) {
        f a9;
        try {
            if (!this.mRecordedShow) {
                final n detail = this.mBaseNativeAd.getDetail();
                this.mRecordedShow = true;
                if (this.mAdCacheInfo != null && (a9 = u.a().a(this.mPlacementId, "0")) != null) {
                    a9.a(this.mAdCacheInfo);
                }
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (NativeAd.this.mIsDestroyed || NativeAd.this.mAdCacheInfo == null) {
                            return;
                        }
                        NativeAd.this.fillShowTrackingInfo(detail);
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            currentTimeMillis = Long.parseLong(detail.z().split("_")[r0.length - 1]);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        long j6 = currentTimeMillis;
                        com.anythink.nativead.unitgroup.a aVar = NativeAd.this.mBaseNativeAd;
                        if (aVar != null && (aVar instanceof CustomNativeAd)) {
                            ((CustomNativeAd) aVar).setShowId(detail.z());
                        }
                        com.anythink.core.common.a.a().a(NativeAd.this.mContext.getApplicationContext(), NativeAd.this.mAdCacheInfo);
                        com.anythink.core.common.u.c.a(NativeAd.this.mContext).a(13, detail, NativeAd.this.mAdCacheInfo.e().getUnitGroupInfo(), j6);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void renderAdContainer(final ATNativeAdView aTNativeAdView, final View view) {
        t.b().b(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.7
            @Override // java.lang.Runnable
            public final void run() {
                NativeAd.this.renderAdOnUiThread(aTNativeAdView, view);
            }
        });
    }

    public void resumeVideo() {
        com.anythink.nativead.unitgroup.a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.resumeVideo();
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mEventInterface = aTEventInterface;
        s c9 = t.b().c();
        if (c9 == null) {
            this.mBaseNativeAd.setDownloadListener(null);
            Log.e(this.TAG, "This method is not supported in this version");
        } else if (aTEventInterface != null) {
            this.mBaseNativeAd.setDownloadListener(c9.createDataFetchListener(this.mAdCacheInfo.e(), this.mBaseNativeAd, aTEventInterface));
        } else {
            this.mBaseNativeAd.setDownloadListener(null);
        }
    }

    public void setAdRevenueListener(ATAdRevenueListener aTAdRevenueListener) {
        this.mRevenueListener = aTAdRevenueListener;
    }

    public void setDevParams(Map<String, Object> map) {
        com.anythink.nativead.unitgroup.a aVar;
        if (map == null || (aVar = this.mBaseNativeAd) == null || !(aVar instanceof CustomNativeAd)) {
            return;
        }
        aVar.setDevParams(map);
    }

    public void setDislikeCallbackListener(ATNativeDislikeListener aTNativeDislikeListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mDislikeListener = aTNativeDislikeListener;
    }

    public void setDownloadConfirmListener(DownloadConfirmListener downloadConfirmListener) {
        if (downloadConfirmListener != null) {
            com.anythink.nativead.unitgroup.a aVar = this.mBaseNativeAd;
            if (aVar instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar).registerDownloadConfirmListener();
            }
        } else {
            com.anythink.nativead.unitgroup.a aVar2 = this.mBaseNativeAd;
            if (aVar2 instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar2).unregeisterDownloadConfirmListener();
            }
        }
        this.mConfirmListener = downloadConfirmListener;
    }

    public void setManualImpressionTrack(boolean z6) {
        this.isManualImpressionTrack = z6;
    }

    public void setNativeEventListener(ATNativeEventListener aTNativeEventListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mNativeEventListener = aTNativeEventListener;
    }

    public void setVideoMute(boolean z6) {
        com.anythink.nativead.unitgroup.a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.setVideoMute(z6);
    }

    private boolean isSupportRenderToInnerTemplate(boolean z6) {
        com.anythink.core.common.l.d.b serverExtraInfo = this.mAdCacheInfo.e() != null ? this.mAdCacheInfo.e().getServerExtraInfo() : null;
        if (serverExtraInfo == null || serverExtraInfo.p() <= 0) {
            return false;
        }
        return !z6 || serverExtraInfo.p() > 1;
    }
}
