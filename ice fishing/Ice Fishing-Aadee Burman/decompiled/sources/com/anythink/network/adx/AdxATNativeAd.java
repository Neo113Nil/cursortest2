package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.f.a;
import com.anythink.basead.g.e;
import com.anythink.basead.g.f;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.a;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.common.f.b;
import com.anythink.core.common.f.c;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AdxATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    a f23025a;

    /* renamed from: b, reason: collision with root package name */
    x f23026b;

    /* renamed from: c, reason: collision with root package name */
    Context f23027c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23028d;

    /* renamed from: e, reason: collision with root package name */
    boolean f23029e;

    /* renamed from: f, reason: collision with root package name */
    View f23030f;

    /* renamed from: g, reason: collision with root package name */
    e f23031g;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r2 != 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdxATNativeAd(final Context context, a aVar, x xVar, boolean z3, boolean z6) {
        this.f23027c = context.getApplicationContext();
        this.f23025a = aVar;
        this.f23026b = xVar;
        setNetworkInfoMap(d.a(aVar.a()));
        f fVar = new f(this.f23025a.a(), null) { // from class: com.anythink.network.adx.AdxATNativeAd.1
            @Override // com.anythink.basead.g.f
            public final void onATImproveClickViewRenderFail(int i) {
                if (AdxATNativeAd.this.f23025a.a() != null && AdxATNativeAd.this.f23025a.a().b() == 2 && (AdxATNativeAd.this.f23025a.a() instanceof bj)) {
                    com.anythink.core.common.u.e.a(AdxATNativeAd.this.getDetail(), ((bj) AdxATNativeAd.this.f23025a.a()).aD(), AdxATNativeAd.this.f23025a.a().v(), i);
                }
            }

            @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                super.onAdClick(jVar);
                AdxATNativeAd.this.notifyAdClicked();
                if (AdxATNativeAd.this.f23025a.a().t() == 67) {
                    if (AdxATNativeAd.this.f23025a.a(true, false)) {
                        c.a(context).a(AdxATNativeAd.this.f23025a.a().v(), 1, 0);
                    }
                    if (AdxATNativeAd.this.f23025a.a(false, false)) {
                        b.a(context).a(AdxATNativeAd.this.f23025a.a().v(), 1, 0);
                    }
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                AdxATNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                super.onAdShow(jVar);
                AdxATNativeAd.this.notifyAdImpression();
                if (AdxATNativeAd.this.f23025a.a().t() == 67) {
                    if (AdxATNativeAd.this.f23025a.a(true, true)) {
                        c.a(context).a(AdxATNativeAd.this.f23025a.a().v(), 0, 1);
                    }
                    if (AdxATNativeAd.this.f23025a.a(false, true)) {
                        b.a(context).a(AdxATNativeAd.this.f23025a.a().v(), 0, 1);
                    }
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z9) {
                y yVar;
                x xVar2 = AdxATNativeAd.this.f23026b;
                if (xVar2 == null || (yVar = xVar2.f14168o) == null || yVar.bI() <= 0) {
                    AdxATNativeAd.this.notifyDeeplinkCallback(z9);
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(com.anythink.basead.d.f fVar2) {
            }
        };
        this.f23031g = fVar;
        this.f23025a.a(fVar);
        this.f23025a.a(new a.InterfaceC0050a() { // from class: com.anythink.network.adx.AdxATNativeAd.2
            @Override // com.anythink.basead.ui.a.InterfaceC0050a
            public final void onProgressUpdate(long j6, long j9) {
                if (AdxATNativeAd.this.getVideoDuration() == 0.0d) {
                    AdxATNativeAd.this.setVideoDuration(j9 / 1000.0d);
                }
                AdxATNativeAd.this.notifyAdVideoPlayProgress((int) (j6 / 1000.0d));
            }

            @Override // com.anythink.basead.ui.a.InterfaceC0050a
            public final void onVideoAdComplete() {
                AdxATNativeAd.this.notifyAdVideoEnd();
            }

            @Override // com.anythink.basead.ui.a.InterfaceC0050a
            public final void onVideoAdStartPlay(long j6) {
                AdxATNativeAd.this.setVideoDuration(j6 / 1000.0d);
                AdxATNativeAd.this.notifyAdVideoStart();
            }

            @Override // com.anythink.basead.ui.a.InterfaceC0050a
            public final void onVideoError(String str, String str2) {
                AdxATNativeAd.this.notifyAdVideoVideoPlayFail(str, str2);
            }
        });
        this.f23028d = z3;
        this.f23029e = z6;
        int w6 = this.f23025a.w();
        if (w6 == 1) {
            this.mAdSourceType = "1";
        } else if (w6 == 2) {
            this.mAdSourceType = "2";
        }
        if (this.f23025a.p()) {
            return;
        }
        setAdChoiceIconUrl(this.f23025a.h());
        setTitle(this.f23025a.c());
        setDescriptionText(this.f23025a.d());
        setIconImageUrl(this.f23025a.f());
        String g4 = this.f23025a.g();
        setMainImageUrl(g4);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(g4)) {
            arrayList.add(g4);
        }
        setImageUrlList(arrayList);
        setCallToActionText(this.f23025a.e());
        if (this.f23025a.o()) {
            setAdAppInfo(new AdxAppInfo(this.f23025a));
        }
        int z9 = this.f23025a.z();
        if (z9 != 1) {
            if (z9 == 2 || z9 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23025a.x());
            setMainImageHeight(this.f23025a.y());
            setVideoWidth(this.f23025a.D());
            setVideoHeight(this.f23025a.E());
            setVideoDuration(this.f23025a.F() / 1000.0d);
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23025a.x());
        setMainImageHeight(this.f23025a.y());
        setVideoWidth(this.f23025a.D());
        setVideoHeight(this.f23025a.E());
        setVideoDuration(this.f23025a.F() / 1000.0d);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        com.anythink.basead.f.a aVar = this.f23025a;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        com.anythink.basead.f.a aVar = this.f23025a;
        if (aVar != null) {
            aVar.a((com.anythink.basead.g.a) null);
            this.f23025a.r();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23030f == null) {
            this.f23030f = this.f23025a.a(this.f23027c, this.f23029e, new BaseMediaATView.a() { // from class: com.anythink.network.adx.AdxATNativeAd.3
                @Override // com.anythink.basead.ui.BaseMediaATView.a
                public final void onClickCloseView() {
                    AdxATNativeAd.this.notifyAdDislikeClick();
                }
            });
        }
        return this.f23030f;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        return this.f23025a.b();
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int A9;
        com.anythink.basead.f.a aVar = this.f23025a;
        if (aVar == null || (A9 = aVar.A()) < 0) {
            return 0;
        }
        return A9;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getShakeView(int i, int i6, ATShakeViewListener aTShakeViewListener) {
        return this.f23025a.B();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public double getVideoProgress() {
        return this.f23025a != null ? r0.C() / 1000.0d : super.getVideoProgress();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public boolean isNativeExpress() {
        return this.f23025a.p();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onPause() {
        com.anythink.basead.f.a aVar = this.f23025a;
        if (aVar != null) {
            aVar.t();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onResume() {
        com.anythink.basead.f.a aVar = this.f23025a;
        if (aVar != null) {
            aVar.s();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void pauseVideo() {
        this.f23025a.v();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        e eVar = this.f23031g;
        if (eVar != null) {
            eVar.updateTrackingInfo(getDetail());
            AdxATInitManager.getInstance();
            AdxATInitManager.a(getDetail(), this.f23026b);
        }
        com.anythink.basead.f.a aVar = this.f23025a;
        if (aVar != null) {
            aVar.s();
        }
        if (this.f23025a != null) {
            this.f23025a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null, aTNativePrepareInfo.getChoiceViewLayoutParams(), aTNativePrepareInfo.getCloseView());
            if (this.f23028d || this.f23025a.a() == null || this.f23025a.a().b() != 2 || !(this.f23025a.a() instanceof bj)) {
                return;
            }
            View view2 = this.f23030f;
            com.anythink.core.common.u.e.a(getDetail(), ((bj) this.f23025a.a()).aD(), this.f23025a.a().v(), (view2 == null || view2.getParent() == null) ? false : true);
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void resumeVideo() {
        this.f23025a.u();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void setVideoMute(boolean z3) {
        this.f23025a.b(z3);
    }
}
