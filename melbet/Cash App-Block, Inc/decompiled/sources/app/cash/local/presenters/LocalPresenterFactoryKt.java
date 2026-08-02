package app.cash.local.presenters;

import app.cash.local.presenters.brand.checkout.LocalOpenTabCheckoutPresenter$Args;
import app.cash.local.screens.app.LocalBrandLocationOpenTabCheckoutScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.tinygraph.models.Merchant;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class LocalPresenterFactoryKt {
    public static final LocalOpenTabCheckoutPresenter$Args access$toOpenTabCheckoutArgs(LocalBrandLocationOpenTabCheckoutScreen localBrandLocationOpenTabCheckoutScreen) {
        return new LocalOpenTabCheckoutPresenter$Args(localBrandLocationOpenTabCheckoutScreen.brandSpot, localBrandLocationOpenTabCheckoutScreen.attributionKey, localBrandLocationOpenTabCheckoutScreen.errors, localBrandLocationOpenTabCheckoutScreen.syncTokens);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCardBlockedBusinesses.deepLinkSpecs;
    }

    public static final MerchantIdentifier getIdentifier(Merchant merchant) {
        String str;
        merchant.getClass();
        com.squareup.protos.wire.roster.mds.Merchant merchant2 = (com.squareup.protos.wire.roster.mds.Merchant) merchant.protoModel$delegate.getValue();
        if (merchant2 == null || (str = merchant2.token) == null) {
            return null;
        }
        return new MerchantIdentifier(str);
    }
}
