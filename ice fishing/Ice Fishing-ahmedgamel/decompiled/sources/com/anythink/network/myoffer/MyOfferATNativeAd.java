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
    e f23171a;

    /* renamed from: b, reason: collision with root package name */
    Context f23172b;

    /* renamed from: c, reason: collision with root package name */
    View f23173c;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if (r3 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MyOfferATNativeAd(Context context, e eVar) {
        this.f23172b = context.getApplicationContext();
        this.f23171a = eVar;
        eVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATNativeAd.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n detail = MyOfferATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.I(jVar.f8982a);
                    detail.J(jVar.f8983b);
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
            public final void onDeeplinkCallback(boolean z3) {
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
        setNetworkInfoMap(d.a(this.f23171a.e()));
        setAdChoiceIconUrl(this.f23171a.k());
        setTitle(this.f23171a.b());
        setDescriptionText(this.f23171a.g());
        setIconImageUrl(this.f23171a.i());
        setMainImageUrl(this.f23171a.j());
        setCallToActionText(this.f23171a.h());
        int q8 = this.f23171a.q();
        if (q8 != 1) {
            if (q8 == 2 || q8 == 3) {
                setNativeInteractionType(2);
            }
            setMainImageWidth(this.f23171a.m());
            setMainImageHeight(this.f23171a.n());
        }
        setNativeInteractionType(1);
        setMainImageWidth(this.f23171a.m());
        setMainImageHeight(this.f23171a.n());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        e eVar = this.f23171a;
        if (eVar != null) {
            eVar.o();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        e eVar = this.f23171a;
        if (eVar != null) {
            eVar.a((a) null);
            this.f23171a.p();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f23173c == null) {
            this.f23173c = e.l();
        }
        return this.f23173c;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public int getDownloadStatus() {
        int r9;
        e eVar = this.f23171a;
        if (eVar == null || (r9 = eVar.r()) < 0) {
            return 0;
        }
        return r9;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23171a != null) {
            this.f23171a.a(view, aTNativePrepareInfo.getClickViewList(), aTNativePrepareInfo instanceof ATNativePrepareExInfo ? ((ATNativePrepareExInfo) aTNativePrepareInfo).getCreativeClickViewList() : null);
        }
    }
}
