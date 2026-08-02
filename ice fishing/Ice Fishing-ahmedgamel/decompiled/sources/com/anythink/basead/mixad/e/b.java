package com.anythink.basead.mixad.e;

import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends x implements Serializable {
    public b(com.anythink.core.common.l.g.a aVar, n nVar, int i) {
        this.f14941a = nVar.x();
        this.f14942b = nVar.aI();
        this.f14943c = nVar.M();
        this.f14944d = nVar.aJ();
        this.f14946f = nVar.Y();
        this.f14947g = nVar.aF();
        this.f14948h = nVar.aG();
        this.i = nVar.Z();
        this.f14949j = i;
        this.f14950k = -1;
        this.f14951l = nVar.o();
        this.f14954o = new c(aVar);
    }

    public final String toString() {
        return "ThirdPartyAdRequestInfo{bidId='" + this.f14941a + "', placementId='" + this.f14942b + "', adsourceId='" + this.f14943c + "', requestId='" + this.f14944d + "', requestAdNum=" + this.f14945e + ", networkFirmId=" + this.f14946f + ", networkName='" + this.f14947g + "', trafficGroupId=" + this.f14948h + ", groupId=" + this.i + ", format=" + this.f14949j + ", tpBidId='" + this.f14951l + "', requestUrl='" + this.f14952m + "', bidResultOutDateTime=" + this.f14953n + ", baseAdSetting=" + this.f14954o + ", isTemplate=" + this.f14955p + ", isGetMainImageSizeSwitch=" + this.f14956q + '}';
    }
}
