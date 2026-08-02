package app.cash.local.presenters.internal;

import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import com.squareup.cash.cdf.localclient.BannerType;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class AnalyticsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCashOutAmount.deepLinkSpecs;
    }

    public static final BannerType toBannerType(LocalBrandBannerModel.Type type2) {
        type2.getClass();
        int ordinal = type2.ordinal();
        if (ordinal == 0) {
            return BannerType.LOCAL_CASH;
        }
        if (ordinal == 1) {
            return BannerType.OFFER;
        }
        if (ordinal == 2) {
            return BannerType.LOYALTY;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String toOfferToken(LocalBrandBannerModel.Mode mode) {
        mode.getClass();
        LocalBrandBannerModel.Mode.Clickable clickable = mode instanceof LocalBrandBannerModel.Mode.Clickable ? (LocalBrandBannerModel.Mode.Clickable) mode : null;
        LocalBrandBanner.Action action = clickable != null ? clickable.action : null;
        LocalBrandBanner.Action.ApplySingleOffer applySingleOffer = action instanceof LocalBrandBanner.Action.ApplySingleOffer ? (LocalBrandBanner.Action.ApplySingleOffer) action : null;
        if (applySingleOffer != null) {
            return applySingleOffer.offerToken;
        }
        return null;
    }
}
