package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.a;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.OwnNativeATView;
import com.anythink.core.common.h.n;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.network.adx.AdxAppInfo;

/* loaded from: classes.dex */
public class OnlineApiATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    a f23208a;

    /* renamed from: b, reason: collision with root package name */
    Context f23209b;

    /* renamed from: c, reason: collision with root package name */
    View f23210c;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (r3 != 4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OnlineApiATNativeAd(Context context, a aVar) {
        this.f23209b = context.getApplicationContext();
        this.f23208a = aVar;
        aVar.a(new com.anythink.basead.g.a() { // from class: com.anythink.network.onlineapi.OnlineApiATNativeAd.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n detail = OnlineApiATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.I(jVar.f8982a);
                    detail.J(jVar.f8983b);
                }
                OnlineApiATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                OnlineApiATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z3) {
                OnlineApiATNativeAd.this.notifyDeeplinkCallback(z3);
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
        setNetworkInfoMap(d.a(this.f23208a.a()));
        setAdChoiceIconUrl(this.f23208a.h());
        setTitle(this.f23208a.c());
        setDescriptionText(this.f23208a.d());
        setIconImageUrl(this.f23208a.f());
        setMainImageUrl(this.f23208a.g());
        setCallToActionText(this.f23208a.e());
        if (this.f23208a.o()) {
            setAdAppInfo(new AdxAppInfo(this.f23208a));
        }
        int z3 = this.f23208a.z();
        if (z3 != 1) {
            if (z3 == 2 || z3 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23208a.x());
            setMainImageHeight(this.f23208a.y());
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23208a.x());
        setMainImageHeight(this.f23208a.y());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        a aVar = this.f23208a;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        a aVar = this.f23208a;
        if (aVar != null) {
            aVar.a((com.anythink.basead.g.a) null);
            this.f23208a.r();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23210c == null) {
            this.f23210c = this.f23208a.a(this.f23209b, false, null);
        }
        return this.f23210c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f23208a != null) {
            return new OwnNativeATView(this.f23209b);
        }
        return null;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int A9;
        a aVar = this.f23208a;
        if (aVar == null || (A9 = aVar.A()) < 0) {
            return 0;
        }
        return A9;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23208a != null) {
            this.f23208a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null, aTNativePrepareInfo.getChoiceViewLayoutParams(), aTNativePrepareInfo.getCloseView());
        }
    }
}
