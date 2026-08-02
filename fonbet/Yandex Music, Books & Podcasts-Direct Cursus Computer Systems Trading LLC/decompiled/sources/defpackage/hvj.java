package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class hvj implements zyc {
    public static final hvj a = new hvj();

    public final boolean equals(Object obj) {
        if (obj instanceof hvj) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(3, evj.class, "<init>", "<init>(Lcom/yandex/music/shared/plus/acquisition/api/offers/data/Offer;Lcom/yandex/music/payment/paywalls/common/api/analytics/models/paywall/PaywallNavigationSourceInfo;Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
