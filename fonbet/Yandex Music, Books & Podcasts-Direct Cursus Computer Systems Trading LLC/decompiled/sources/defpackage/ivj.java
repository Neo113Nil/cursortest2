package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ivj implements zyc {
    public static final ivj a = new ivj();

    public final boolean equals(Object obj) {
        if (obj instanceof ivj) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(3, gvj.class, "<init>", "<init>(Lcom/yandex/music/payment/paywalls/common/api/analytics/models/paywall/PaywallType;Ljava/lang/String;Lcom/yandex/music/payment/paywalls/common/api/analytics/models/paywall/PaywallNavigationSourceInfo;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
