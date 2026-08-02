package app.cash.local.presenters.internal;

import app.cash.local.primitives.LocalMoney;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class CashBannerKt {
    public static final LocalBrandBannerModel cashBannerModel(LocalCashMarketingContent.Template template, LocalMoney localMoney, LocalBrandBannerModel.Mode mode) {
        template.getClass();
        long j = localMoney.amount;
        long abs = Math.abs(j);
        String prettyPrint$default = LocalsKt.prettyPrint$default(LocalMoney.copy$default(localMoney, Math.abs(j)), false, null, 7);
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = template.threshold;
        Long l = localMoney2 != null ? localMoney2.amount : null;
        String str = template.over_threshold_title;
        String str2 = template.over_threshold_subtitle;
        String str3 = template.under_threshold_title;
        String str4 = template.under_threshold_subtitle;
        LocalBrandBannerModel.Mode.Toggleable toggleable = mode instanceof LocalBrandBannerModel.Mode.Toggleable ? (LocalBrandBannerModel.Mode.Toggleable) mode : null;
        boolean z = toggleable != null ? toggleable.applied : true;
        if (l == null || l.longValue() >= abs) {
            boolean z2 = z;
            if (str3 != null) {
                String injectThreshold = LocalsKt.injectThreshold(str3, prettyPrint$default);
                if (str4 != null) {
                    return new LocalBrandBannerModel(null, z2, injectThreshold, LocalsKt.injectThreshold(str4, prettyPrint$default), mode, LocalBrandBannerModel.Type.LOCAL_CASH, 1);
                }
            }
        } else if (str != null) {
            String injectThreshold2 = LocalsKt.injectThreshold(str, prettyPrint$default);
            if (str2 != null) {
                return new LocalBrandBannerModel(null, z, injectThreshold2, LocalsKt.injectThreshold(str2, prettyPrint$default), mode, LocalBrandBannerModel.Type.LOCAL_CASH, 1);
            }
        }
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewChangeCardDesign.deepLinkSpecs;
    }
}
