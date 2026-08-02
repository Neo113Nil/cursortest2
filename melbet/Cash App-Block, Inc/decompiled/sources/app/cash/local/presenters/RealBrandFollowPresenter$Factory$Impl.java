package app.cash.local.presenters;

import app.cash.broadway.screen.Screen;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.service.LocalService;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.local.client.v1.LocalBrand;

/* loaded from: classes.dex */
public final class RealBrandFollowPresenter$Factory$Impl {
    public final RealBrandFollowPresenter.MetroFactory delegateFactory;

    public RealBrandFollowPresenter$Factory$Impl(RealBrandFollowPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealBrandFollowPresenter create(BrandSpot brandSpot, Screen screen, LocalBrand.Banner banner, BetterNavigator.ScreenNavigator screenNavigator) {
        brandSpot.getClass();
        screen.getClass();
        RealBrandFollowPresenter.MetroFactory metroFactory = this.delegateFactory;
        RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) metroFactory.syncer.invoke();
        LocalInstalledStore localInstalledStore = (LocalInstalledStore) metroFactory.store.invoke();
        LocalService localService = (LocalService) metroFactory.service.invoke();
        RealLocalBrandRepository realLocalBrandRepository = (RealLocalBrandRepository) metroFactory.repository.invoke();
        Analytics analytics = (Analytics) metroFactory.analytics.invoke();
        LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl = (LocalResponseContextHandler$Factory$Impl) metroFactory.responseContextHandlerFactory.invoke();
        realLocalBrandSyncer.getClass();
        localInstalledStore.getClass();
        localService.getClass();
        realLocalBrandRepository.getClass();
        analytics.getClass();
        localResponseContextHandler$Factory$Impl.getClass();
        return new RealBrandFollowPresenter(realLocalBrandSyncer, localInstalledStore, localService, realLocalBrandRepository, analytics, localResponseContextHandler$Factory$Impl, brandSpot, screen, banner, screenNavigator);
    }
}
