package com.anythink.basead.mixad.e;

import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends x implements Serializable {
    public b(com.anythink.core.common.l.g.a aVar, n nVar, int i) {
        this.f14155a = nVar.x();
        this.f14156b = nVar.aI();
        this.f14157c = nVar.M();
        this.f14158d = nVar.aJ();
        this.f14160f = nVar.Y();
        this.f14161g = nVar.aF();
        this.f14162h = nVar.aG();
        this.i = nVar.Z();
        this.f14163j = i;
        this.f14164k = -1;
        this.f14165l = nVar.o();
        this.f14168o = new c(aVar);
    }

    public final String toString() {
        return "ThirdPartyAdRequestInfo{bidId='" + this.f14155a + "', placementId='" + this.f14156b + "', adsourceId='" + this.f14157c + "', requestId='" + this.f14158d + "', requestAdNum=" + this.f14159e + ", networkFirmId=" + this.f14160f + ", networkName='" + this.f14161g + "', trafficGroupId=" + this.f14162h + ", groupId=" + this.i + ", format=" + this.f14163j + ", tpBidId='" + this.f14165l + "', requestUrl='" + this.f14166m + "', bidResultOutDateTime=" + this.f14167n + ", baseAdSetting=" + this.f14168o + ", isTemplate=" + this.f14169p + ", isGetMainImageSizeSwitch=" + this.f14170q + '}';
    }
}
