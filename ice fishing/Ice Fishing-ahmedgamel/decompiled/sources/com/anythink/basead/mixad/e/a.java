package com.anythink.basead.mixad.e;

import android.util.Log;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import com.google.android.gms.internal.ads.Wv;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a extends w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final String f10344a = "a";

    public a(d dVar) {
        o(dVar.getIconImageUrl());
        Double starRating = dVar.getStarRating();
        if (starRating != null) {
            i(starRating.intValue());
        }
        q(dVar.getMainImageUrl());
        m(dVar.getTitle());
        s(dVar.getCallToActionText());
        n(dVar.getDescriptionText());
        r(dVar.getAdChoiceIconUrl());
        a(dVar.getAdLogo());
        G(dVar.getAdFrom());
        F(dVar.getWarning());
        E(dVar.getDomain());
        ATAdAppInfo adAppInfo = dVar.getAdAppInfo();
        if (adAppInfo != null) {
            if (t.b().F()) {
                Log.i("a", "AdAppInfo:" + dVar.getAdAppInfo().toString());
            }
            z(adAppInfo.getPublisher());
            A(adAppInfo.getAppVersion());
            B(adAppInfo.getAppPrivacyUrl());
            C(adAppInfo.getAppPermissonUrl());
            c(adAppInfo.getFunctionUrl());
        }
        c(new c(dVar));
    }

    @Override // com.anythink.core.common.h.w
    public final List<String> a(y yVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(B());
        return arrayList;
    }

    @Override // com.anythink.core.common.h.w
    public final int b() {
        return 10;
    }

    @Override // com.anythink.core.common.h.w
    public final boolean c() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdContent{, offerId='");
        sb.append(this.f14924m);
        sb.append("', creativeId='");
        sb.append(this.f14925n);
        sb.append("', title='");
        sb.append(this.f14926o);
        sb.append("', desc='");
        sb.append(this.f14927p);
        sb.append("', iconUrl='");
        sb.append(this.f14928q);
        sb.append("', mainImageUrl='");
        sb.append(this.f14929r);
        sb.append("', endCardImageUrl='");
        sb.append(this.f14930s);
        sb.append("', adChoiceUrl='");
        sb.append(this.f14931t);
        sb.append("', ctaText='");
        sb.append(this.f14932u);
        sb.append("', videoUrl='");
        sb.append(this.f14933v);
        sb.append("', previewUrl='");
        sb.append(this.f14934w);
        sb.append("', deeplinkUrl='");
        sb.append(this.f14935x);
        sb.append("', clickUrl='");
        sb.append(this.f14936y);
        sb.append("', pkgName='");
        sb.append(this.f14937z);
        sb.append("', unitType=");
        sb.append(this.f14897A);
        sb.append(", clickType=");
        sb.append(this.f14898D);
        sb.append(", rating=");
        sb.append(this.f14899E);
        sb.append(", adLogoTitle='");
        sb.append(this.f14900F);
        sb.append("', offerNetworkFirmId=");
        sb.append(this.f14901G);
        sb.append(", jumpUrl='");
        sb.append(this.f14902H);
        sb.append("', publisher='");
        sb.append(this.f14903I);
        sb.append("', appVersion='");
        sb.append(this.J);
        sb.append("', privacyUrl='");
        sb.append(this.f14904K);
        sb.append("', permissionUrl='");
        sb.append(this.f14905L);
        sb.append("', functionUrl='");
        sb.append(this.f14906M);
        sb.append("', templateVersion='");
        sb.append(this.f14907N);
        sb.append("', adLogo=");
        sb.append(this.f14908O);
        sb.append(", baseAdSetting=");
        sb.append(this.f14909P);
        sb.append(", requestId='");
        sb.append(this.f14910Q);
        sb.append("', webControlObject='");
        sb.append(this.f14911R);
        sb.append("', protocolType=");
        sb.append(this.f14912S);
        sb.append(", offerHtml='");
        sb.append(this.f14913T);
        sb.append("', offerUrl='");
        sb.append(this.f14914U);
        sb.append("', wxUserName='");
        sb.append(this.f14915V);
        sb.append("', wxPath='");
        sb.append(this.f14916W);
        sb.append("', offerWidth=");
        sb.append(this.f14917X);
        sb.append(", offerHeight=");
        sb.append(this.Y);
        sb.append(", mApkDownloadStatus=");
        sb.append(this.f14918Z);
        sb.append(", mNativeMainImageWidth=");
        sb.append(this.aa);
        sb.append(", mNativeMainImageHeight=");
        sb.append(this.ab);
        sb.append(", mVideoWidth=");
        sb.append(this.ac);
        sb.append(", mVideoHeight=");
        sb.append(this.ad);
        sb.append(", mVideoDuration=");
        sb.append(this.ae);
        sb.append(", deeplinkPackageInstallState=");
        sb.append(this.af);
        sb.append(", mraidJSUrl='");
        return Wv.i(sb, this.ah, "'}");
    }

    @Override // com.anythink.core.common.h.w
    public final List<String> b(y yVar) {
        return new ArrayList();
    }

    @Override // com.anythink.core.common.h.w
    public final String a() {
        return "";
    }
}
