package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.g.a;
import com.anythink.basead.g.j;
import com.anythink.basead.h.e;
import com.anythink.core.common.h.n;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;

/* loaded from: classes.dex */
public class MyOfferATNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    e f23329a;

    /* renamed from: b, reason: collision with root package name */
    Context f23330b;

    /* renamed from: c, reason: collision with root package name */
    View f23331c;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if (r3 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MyOfferATNativeAd(Context context, e eVar) {
        this.f23330b = context.getApplicationContext();
        this.f23329a = eVar;
        eVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATNativeAd.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n detail = MyOfferATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.I(jVar.f9139a);
                    detail.J(jVar.f9140b);
                }
                MyOfferATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                MyOfferATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z8) {
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
        setNetworkInfoMap(d.a(this.f23329a.e()));
        setAdChoiceIconUrl(this.f23329a.k());
        setTitle(this.f23329a.b());
        setDescriptionText(this.f23329a.g());
        setIconImageUrl(this.f23329a.i());
        setMainImageUrl(this.f23329a.j());
        setCallToActionText(this.f23329a.h());
        int q6 = this.f23329a.q();
        if (q6 != 1) {
            if (q6 == 2 || q6 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23329a.m());
            setMainImageHeight(this.f23329a.n());
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23329a.m());
        setMainImageHeight(this.f23329a.n());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        e eVar = this.f23329a;
        if (eVar != null) {
            eVar.o();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        e eVar = this.f23329a;
        if (eVar != null) {
            eVar.a((a) null);
            this.f23329a.p();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23331c == null) {
            this.f23331c = e.l();
        }
        return this.f23331c;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int r9;
        e eVar = this.f23329a;
        if (eVar == null || (r9 = eVar.r()) < 0) {
            return 0;
        }
        return r9;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23329a != null) {
            this.f23329a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null);
        }
    }
}
