package app.cash.local.presenters.internal;

import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class LocalBrandBannersKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewClaimPayment.deepLinkSpecs;
    }

    public static final LocalBrandBannerModel toBannerModel(LocalBrandBanner localBrandBanner) {
        LocalBrandBannerModel.Mode mode;
        LocalBrandBanner.Action action = localBrandBanner.action;
        if (action instanceof LocalBrandBanner.Action.ApplySingleOffer) {
            mode = new LocalBrandBannerModel.Mode.Clickable(action);
        } else if (action instanceof LocalBrandBanner.Action.ShowLoyaltyRewards) {
            mode = new LocalBrandBannerModel.Mode.Clickable(action);
        } else {
            if (action != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            mode = LocalBrandBannerModel.Mode.Fixed.INSTANCE;
        }
        return new LocalBrandBannerModel(localBrandBanner.image, false, localBrandBanner.label, localBrandBanner.body, mode, action instanceof LocalBrandBanner.Action.ShowLoyaltyRewards ? LocalBrandBannerModel.Type.LOYALTY : LocalBrandBannerModel.Type.OFFER, 2);
    }
}
