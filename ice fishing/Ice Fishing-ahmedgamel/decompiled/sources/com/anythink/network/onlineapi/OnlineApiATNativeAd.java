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
    a f23995a;

    /* renamed from: b, reason: collision with root package name */
    Context f23996b;

    /* renamed from: c, reason: collision with root package name */
    View f23997c;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (r3 != 4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OnlineApiATNativeAd(Context context, a aVar) {
        this.f23996b = context.getApplicationContext();
        this.f23995a = aVar;
        aVar.a(new com.anythink.basead.g.a() { // from class: com.anythink.network.onlineapi.OnlineApiATNativeAd.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n detail = OnlineApiATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.I(jVar.f9768a);
                    detail.J(jVar.f9769b);
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
            public final void onDeeplinkCallback(boolean z6) {
                OnlineApiATNativeAd.this.notifyDeeplinkCallback(z6);
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
        setNetworkInfoMap(d.a(this.f23995a.a()));
        setAdChoiceIconUrl(this.f23995a.h());
        setTitle(this.f23995a.c());
        setDescriptionText(this.f23995a.d());
        setIconImageUrl(this.f23995a.f());
        setMainImageUrl(this.f23995a.g());
        setCallToActionText(this.f23995a.e());
        if (this.f23995a.o()) {
            setAdAppInfo(new AdxAppInfo(this.f23995a));
        }
        int z6 = this.f23995a.z();
        if (z6 != 1) {
            if (z6 == 2 || z6 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23995a.x());
            setMainImageHeight(this.f23995a.y());
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23995a.x());
        setMainImageHeight(this.f23995a.y());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        a aVar = this.f23995a;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        a aVar = this.f23995a;
        if (aVar != null) {
            aVar.a((com.anythink.basead.g.a) null);
            this.f23995a.r();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23997c == null) {
            this.f23997c = this.f23995a.a(this.f23996b, false, null);
        }
        return this.f23997c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f23995a != null) {
            return new OwnNativeATView(this.f23996b);
        }
        return null;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int A9;
        a aVar = this.f23995a;
        if (aVar == null || (A9 = aVar.A()) < 0) {
            return 0;
        }
        return A9;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23995a != null) {
            this.f23995a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null, aTNativePrepareInfo.getChoiceViewLayoutParams(), aTNativePrepareInfo.getCloseView());
        }
    }
}
