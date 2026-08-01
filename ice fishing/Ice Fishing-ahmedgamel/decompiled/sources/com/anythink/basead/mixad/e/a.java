package com.anythink.basead.mixad.e;

import android.util.Log;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import u1.h;

/* loaded from: classes.dex */
public class a extends w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final String f9558a = "a";

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
        sb.append(this.f14138m);
        sb.append("', creativeId='");
        sb.append(this.f14139n);
        sb.append("', title='");
        sb.append(this.f14140o);
        sb.append("', desc='");
        sb.append(this.f14141p);
        sb.append("', iconUrl='");
        sb.append(this.f14142q);
        sb.append("', mainImageUrl='");
        sb.append(this.f14143r);
        sb.append("', endCardImageUrl='");
        sb.append(this.f14144s);
        sb.append("', adChoiceUrl='");
        sb.append(this.f14145t);
        sb.append("', ctaText='");
        sb.append(this.f14146u);
        sb.append("', videoUrl='");
        sb.append(this.f14147v);
        sb.append("', previewUrl='");
        sb.append(this.f14148w);
        sb.append("', deeplinkUrl='");
        sb.append(this.f14149x);
        sb.append("', clickUrl='");
        sb.append(this.f14150y);
        sb.append("', pkgName='");
        sb.append(this.f14151z);
        sb.append("', unitType=");
        sb.append(this.f14111A);
        sb.append(", clickType=");
        sb.append(this.f14112D);
        sb.append(", rating=");
        sb.append(this.f14113E);
        sb.append(", adLogoTitle='");
        sb.append(this.f14114F);
        sb.append("', offerNetworkFirmId=");
        sb.append(this.f14115G);
        sb.append(", jumpUrl='");
        sb.append(this.f14116H);
        sb.append("', publisher='");
        sb.append(this.f14117I);
        sb.append("', appVersion='");
        sb.append(this.J);
        sb.append("', privacyUrl='");
        sb.append(this.f14118K);
        sb.append("', permissionUrl='");
        sb.append(this.f14119L);
        sb.append("', functionUrl='");
        sb.append(this.f14120M);
        sb.append("', templateVersion='");
        sb.append(this.f14121N);
        sb.append("', adLogo=");
        sb.append(this.f14122O);
        sb.append(", baseAdSetting=");
        sb.append(this.f14123P);
        sb.append(", requestId='");
        sb.append(this.f14124Q);
        sb.append("', webControlObject='");
        sb.append(this.f14125R);
        sb.append("', protocolType=");
        sb.append(this.f14126S);
        sb.append(", offerHtml='");
        sb.append(this.f14127T);
        sb.append("', offerUrl='");
        sb.append(this.f14128U);
        sb.append("', wxUserName='");
        sb.append(this.f14129V);
        sb.append("', wxPath='");
        sb.append(this.f14130W);
        sb.append("', offerWidth=");
        sb.append(this.f14131X);
        sb.append(", offerHeight=");
        sb.append(this.Y);
        sb.append(", mApkDownloadStatus=");
        sb.append(this.f14132Z);
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
        return h.g(sb, this.ah, "'}");
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
